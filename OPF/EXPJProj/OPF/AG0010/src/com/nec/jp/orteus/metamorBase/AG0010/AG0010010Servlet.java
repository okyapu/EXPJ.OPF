/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0010/src/com/nec/jp/orteus/metamorBase/AG0010/AG0010010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0010;

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

public class AG0010010Servlet extends HttpServlet
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
	 * @param control AG0010010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AG0010010Control control)
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
		
		// �݌Ɉꗗ����̑J�ڃp�����[�^�̎擾
		// �H��R�[�h
		String[] plantCd = (String[])params.get("PLANT_CD");

		if (plantCd == null) {
			control.setPlantCd(null);
		} else {
			control.setPlantCd(plantCd[0]);
		}
		
		// �i�ڔԍ�
		String[] itemCd = (String[])params.get("ITEM_CD");
		if (itemCd == null) {
			control.setItemCd(null);
		} else {
			control.setItemCd(itemCd[0]);
		}
		// �i�ڔԍ�
		if(params.containsKey("Lower_ITEM_CD")){
			String[] loweritemCd = (String[])params.get("Lower_ITEM_CD");
			if (loweritemCd  == null) {
				control.setItemCd(null);
			} else {
				control.setItemCd(loweritemCd [0]);
			}
		}
		
		String[] devtyp = (String[])params.get("h_DEVELOP_TYP");
		String[] compitemCd = (String[])params.get("COMP_ITEM_CD");
		String[] parentitemCd = (String[])params.get("PARENT_ITEM_CD");
		if (devtyp != null) {		
			if ("2".equals(devtyp[0])) {
				control.setItemCd(parentitemCd[0]);
			}else if(!"".equals(compitemCd[0])){
				control.setItemCd(compitemCd[0]);				
			}else if(!"".equals(parentitemCd[0])){
				control.setItemCd(parentitemCd[0]);				
			}
		}
		
		String[] w_WH_CD = (String[])params.get("WH_CD");
		if(w_WH_CD == null){
		    control.setWh_Cd(null);
		} else {
		    control.setWh_Cd(w_WH_CD[0]);
		}
		
		String[] WH_NAME = (String[])params.get("WH_NAME");
		if(WH_NAME == null){
	        control.setWH_NAME(null);
		} else {
		    control.setWH_NAME(WH_NAME[0]);
		}
		
		String[] templot = (String[])params.get("tempLot");
		if(templot == null){
		    control.settemplot("0");
		} else {
			control.settemplot(templot[0]);
		} 
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * ��ʋ��ʃp�����[�^�擾
	 * @param params  Hashtable�N���X�C���X�^���X
	 * @param control AG0010010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AG0010010Control control)
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
	 * @param control AG0010010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
			logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
//			objMessage.m_writer.write( Level.ALL, "AG0010010"+" $Revision: 1.12 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AG0010010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		//------------------------------------------------------------------------------
		try {
			control.control_eventHandller("reload");
			if(control.gettemplot().equals("1")){
			    nextUrl = "/AG0010012.jsp";
			}else {
				nextUrl = "/AG0010010.jsp";
			}

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AG0010010Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
		//------------------------------------------------------------------
		try {
			// �L�[���ڑޔ�
			control.setKeyStruct(struct);
			// �X�g���N�g�N���A���ăL�[���ڂ��ăZ�b�g
			struct.clear();
			struct.initialize();
			struct.setw_PLANT_CD(control.getKeyStruct().getw_PLANT_CD());
			struct.setw_ITEM_CD(control.getKeyStruct().getw_ITEM_CD());

			control.control_eventHandller("select");

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �݌ɏڍ׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AG0010010Control�N���X�C���X�^���X
	 */
	public String onClickinventoryDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickinventoryDetail");
		//{{user_implement_dev:<onClickinventoryDetail>
		//------------------------------------------------------------------
		try{
			int maxline1 = 10;
			// �L�[���ڑޔ�
			control.setKeyStruct(struct);
			// �X�g���N�g�N���A���ăL�[���ڂ��ăZ�b�g
			struct.clear();
			struct.initialize();
			struct.setw_PLANT_CD(control.getKeyStruct().getw_PLANT_CD());
			struct.setw_ITEM_CD(control.getKeyStruct().getw_ITEM_CD());

			control.control_eventHandller("inventoryDetail");

			if("1".equals(control.getnextUrlFlg())){
				// �q��ʂɑJ��
				nextUrl = "/AG0010011.jsp";
			} else {
				nextUrl = "/AG0010010.jsp";
			}

			control.maxLineCheck(maxline1);

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickinventoryDetail>
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickinventoryDetail");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AG0010010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
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
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AG0010010Control�N���X�C���X�^���X
	 */
	public String onClickCloseSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickCloseSub1");
		//{{user_implement_dev:<onClickCloseSub1>
		//------------------------------------------------------------------
		try{
			// �X�g���N�g�N���A���ăL�[���ڂ��ăZ�b�g
			struct.clear();
			struct.initialize();
			struct.setw_PLANT_CD(control.getKeyStruct().getw_PLANT_CD());
			struct.setw_ITEM_CD(control.getKeyStruct().getw_ITEM_CD());

			control.control_eventHandller("CloseSub1");

			// �e��ʂɑJ��
			nextUrl = "/AG0010010.jsp";

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickCloseSub1>
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickCloseSub1");

		return nextUrl;
	}

	/**
	 * ���b�g�ʏڍ׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AG0010010Control�N���X�C���X�^���X
	 */
	public String onClickinventoryDetailsub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AG0010012.jsp";		// �ړ���t�q�k
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickinventoryDetailsub1");
		//{{user_implement_dev:<onClickinventoryDetailsub1>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			int maxline2 = 20;
			struct.setw_PLANT_CD(control.getKeyStruct().getw_PLANT_CD());
			struct.setw_ITEM_CD(control.getKeyStruct().getw_ITEM_CD());
			control.control_eventHandller("inventoryDetailsub1");
			if(control.getMessage().sizeError() > 0){
				// �q��ʂɑJ��
				nextUrl = "/AG0010011.jsp";
			}
			
			control.maxLineCheck(maxline2);
			
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickinventoryDetailsub1>
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickinventoryDetailsub1");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AG0010010Control�N���X�C���X�^���X
	 */
	public String onClickCloseSub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AG0010011.jsp";		// �ړ���t�q�k
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickCloseSub2");
		//{{user_implement_dev:<onClickCloseSub2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// �X�g���N�g�N���A���ăL�[���ڂ��ăZ�b�g
			struct.clear();
			struct.setw_PLANT_CD(control.getKeyStruct().getw_PLANT_CD());
			struct.setw_ITEM_CD(control.getKeyStruct().getw_ITEM_CD());

			control.control_eventHandller("CloseSub2");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCloseSub2>
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickCloseSub2");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AG0010010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] w_PLANT_CD = ((params.containsKey("w_PLANT_CD")) ? (String[])params.get("w_PLANT_CD") : (String[])null);
		String[] w_ITEM_CD = ((params.containsKey("w_ITEM_CD")) ? (String[])params.get("w_ITEM_CD") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] w_ITEM_STOCK_QTY = ((params.containsKey("w_ITEM_STOCK_QTY")) ? (String[])params.get("w_ITEM_STOCK_QTY") : (String[])null);
		String[] w_ITEM_STOCK_QTY_FOR_MRP = ((params.containsKey("w_ITEM_STOCK_QTY_FOR_MRP")) ? (String[])params.get("w_ITEM_STOCK_QTY_FOR_MRP") : (String[])null);
		String[] w_ITEM_STOCK_QTY_OUTSIDE_MRP = ((params.containsKey("w_ITEM_STOCK_QTY_OUTSIDE_MRP")) ? (String[])params.get("w_ITEM_STOCK_QTY_OUTSIDE_MRP") : (String[])null);
		String[] w_JOB_ODR_STOCK_QTY = ((params.containsKey("w_JOB_ODR_STOCK_QTY")) ? (String[])params.get("w_JOB_ODR_STOCK_QTY") : (String[])null);
		String[] w_JOB_ODR_STOCK_QTY_FOR_MRP = ((params.containsKey("w_JOB_ODR_STOCK_QTY_FOR_MRP")) ? (String[])params.get("w_JOB_ODR_STOCK_QTY_FOR_MRP") : (String[])null);
		String[] w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = ((params.containsKey("w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP")) ? (String[])params.get("w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP") : (String[])null);
		String[] w_TOTAL_STOCK_QTY = ((params.containsKey("w_TOTAL_STOCK_QTY")) ? (String[])params.get("w_TOTAL_STOCK_QTY") : (String[])null);
		String[] w_ITEM_DEFECT_QTY = ((params.containsKey("w_ITEM_DEFECT_QTY")) ? (String[])params.get("w_ITEM_DEFECT_QTY") : (String[])null);
		String[] w_ITEM_STOCK_QTY_LAST_DAY = ((params.containsKey("w_ITEM_STOCK_QTY_LAST_DAY")) ? (String[])params.get("w_ITEM_STOCK_QTY_LAST_DAY") : (String[])null);
		String[] w_ITEM_STOCK_QTY_LAST_MONTH = ((params.containsKey("w_ITEM_STOCK_QTY_LAST_MONTH")) ? (String[])params.get("w_ITEM_STOCK_QTY_LAST_MONTH") : (String[])null);
		String[] w_JOB_ODR_STOCK_QTY_LAST_DAY = ((params.containsKey("w_JOB_ODR_STOCK_QTY_LAST_DAY")) ? (String[])params.get("w_JOB_ODR_STOCK_QTY_LAST_DAY") : (String[])null);
		String[] w_JOB_ODR_STOCK_QTY_LAST_MONTH = ((params.containsKey("w_JOB_ODR_STOCK_QTY_LAST_MONTH")) ? (String[])params.get("w_JOB_ODR_STOCK_QTY_LAST_MONTH") : (String[])null);
		String[] w_TOTAL_STOCK_QTY_LAST_DAY = ((params.containsKey("w_TOTAL_STOCK_QTY_LAST_DAY")) ? (String[])params.get("w_TOTAL_STOCK_QTY_LAST_DAY") : (String[])null);
		String[] w_TOTAL_STOCK_QTY_LAST_MONTH = ((params.containsKey("w_TOTAL_STOCK_QTY_LAST_MONTH")) ? (String[])params.get("w_TOTAL_STOCK_QTY_LAST_MONTH") : (String[])null);
		String[] PLANT_NAME = ((params.containsKey("PLANT_NAME")) ? (String[])params.get("PLANT_NAME") : (String[])null);
		String[] w_WH_CD = ((params.containsKey("w_WH_CD")) ? (String[])params.get("w_WH_CD") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] w_STOCK_ON_HAND_QTY = ((params.containsKey("w_STOCK_ON_HAND_QTY")) ? (String[])params.get("w_STOCK_ON_HAND_QTY") : (String[])null);
		String[] w_DEFECT_QTY = ((params.containsKey("w_DEFECT_QTY")) ? (String[])params.get("w_DEFECT_QTY") : (String[])null);
		String[] w_PRVS_DAYEND_STOCK_QTY = ((params.containsKey("w_PRVS_DAYEND_STOCK_QTY")) ? (String[])params.get("w_PRVS_DAYEND_STOCK_QTY") : (String[])null);
		String[] w_PRVS_MONTHEND_STOCK_QTY = ((params.containsKey("w_PRVS_MONTHEND_STOCK_QTY")) ? (String[])params.get("w_PRVS_MONTHEND_STOCK_QTY") : (String[])null);
		String[] w_PLANT_NAME = ((params.containsKey("w_PLANT_NAME")) ? (String[])params.get("w_PLANT_NAME") : (String[])null);
		String[] w_ITEM_NAME = ((params.containsKey("w_ITEM_NAME")) ? (String[])params.get("w_ITEM_NAME") : (String[])null);
		String[] MRP_ODR_NAME = ((params.containsKey("MRP_ODR_NAME")) ? (String[])params.get("MRP_ODR_NAME") : (String[])null);
		String[] MRP_NAME = ((params.containsKey("MRP_NAME")) ? (String[])params.get("MRP_NAME") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] h_lotCtrl = ((params.containsKey("h_lotCtrl")) ? (String[])params.get("h_lotCtrl") : (String[])null);
		String[] h_lotFlg = ((params.containsKey("h_lotFlg")) ? (String[])params.get("h_lotFlg") : (String[])null);
		String[] h_screenflg = ((params.containsKey("h_screenflg")) ? (String[])params.get("h_screenflg") : (String[])null);
		String[] l_PLANT_NAME = ((params.containsKey("l_PLANT_NAME")) ? (String[])params.get("l_PLANT_NAME") : (String[])null);
		String[] l_LOT_NO = ((params.containsKey("l_LOT_NO")) ? (String[])params.get("l_LOT_NO") : (String[])null);
		String[] l_STOCK_ON_HAND_QTY = ((params.containsKey("l_STOCK_ON_HAND_QTY")) ? (String[])params.get("l_STOCK_ON_HAND_QTY") : (String[])null);
		String[] l_ALCD_QTY = ((params.containsKey("l_ALCD_QTY")) ? (String[])params.get("l_ALCD_QTY") : (String[])null);
		String[] l_EXPIRATION_DATE = ((params.containsKey("l_EXPIRATION_DATE")) ? (String[])params.get("l_EXPIRATION_DATE") : (String[])null);
		String[] l_PRD_CMPLT_DATE = ((params.containsKey("l_PRD_CMPLT_DATE")) ? (String[])params.get("l_PRD_CMPLT_DATE") : (String[])null);

		struct.setw_PLANT_CD( ((w_PLANT_CD == null) ? (String)null : w_PLANT_CD[0]) );
		struct.setList_w_PLANT_CD(TypeConverter.convert(w_PLANT_CD));
		struct.setw_ITEM_CD( ((w_ITEM_CD == null) ? (String)null : w_ITEM_CD[0]) );
		struct.setList_w_ITEM_CD(TypeConverter.convert(w_ITEM_CD));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setw_ITEM_STOCK_QTY( ((w_ITEM_STOCK_QTY == null) ? (String)null : w_ITEM_STOCK_QTY[0]) );
		struct.setList_w_ITEM_STOCK_QTY(TypeConverter.convert(w_ITEM_STOCK_QTY));
		struct.setw_ITEM_STOCK_QTY_FOR_MRP( ((w_ITEM_STOCK_QTY_FOR_MRP == null) ? (String)null : w_ITEM_STOCK_QTY_FOR_MRP[0]) );
		struct.setList_w_ITEM_STOCK_QTY_FOR_MRP(TypeConverter.convert(w_ITEM_STOCK_QTY_FOR_MRP));
		struct.setw_ITEM_STOCK_QTY_OUTSIDE_MRP( ((w_ITEM_STOCK_QTY_OUTSIDE_MRP == null) ? (String)null : w_ITEM_STOCK_QTY_OUTSIDE_MRP[0]) );
		struct.setList_w_ITEM_STOCK_QTY_OUTSIDE_MRP(TypeConverter.convert(w_ITEM_STOCK_QTY_OUTSIDE_MRP));
		struct.setw_JOB_ODR_STOCK_QTY( ((w_JOB_ODR_STOCK_QTY == null) ? (String)null : w_JOB_ODR_STOCK_QTY[0]) );
		struct.setList_w_JOB_ODR_STOCK_QTY(TypeConverter.convert(w_JOB_ODR_STOCK_QTY));
		struct.setw_JOB_ODR_STOCK_QTY_FOR_MRP( ((w_JOB_ODR_STOCK_QTY_FOR_MRP == null) ? (String)null : w_JOB_ODR_STOCK_QTY_FOR_MRP[0]) );
		struct.setList_w_JOB_ODR_STOCK_QTY_FOR_MRP(TypeConverter.convert(w_JOB_ODR_STOCK_QTY_FOR_MRP));
		struct.setw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP( ((w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP == null) ? (String)null : w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP[0]) );
		struct.setList_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(TypeConverter.convert(w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP));
		struct.setw_TOTAL_STOCK_QTY( ((w_TOTAL_STOCK_QTY == null) ? (String)null : w_TOTAL_STOCK_QTY[0]) );
		struct.setList_w_TOTAL_STOCK_QTY(TypeConverter.convert(w_TOTAL_STOCK_QTY));
		struct.setw_ITEM_DEFECT_QTY( ((w_ITEM_DEFECT_QTY == null) ? (String)null : w_ITEM_DEFECT_QTY[0]) );
		struct.setList_w_ITEM_DEFECT_QTY(TypeConverter.convert(w_ITEM_DEFECT_QTY));
		struct.setw_ITEM_STOCK_QTY_LAST_DAY( ((w_ITEM_STOCK_QTY_LAST_DAY == null) ? (String)null : w_ITEM_STOCK_QTY_LAST_DAY[0]) );
		struct.setList_w_ITEM_STOCK_QTY_LAST_DAY(TypeConverter.convert(w_ITEM_STOCK_QTY_LAST_DAY));
		struct.setw_ITEM_STOCK_QTY_LAST_MONTH( ((w_ITEM_STOCK_QTY_LAST_MONTH == null) ? (String)null : w_ITEM_STOCK_QTY_LAST_MONTH[0]) );
		struct.setList_w_ITEM_STOCK_QTY_LAST_MONTH(TypeConverter.convert(w_ITEM_STOCK_QTY_LAST_MONTH));
		struct.setw_JOB_ODR_STOCK_QTY_LAST_DAY( ((w_JOB_ODR_STOCK_QTY_LAST_DAY == null) ? (String)null : w_JOB_ODR_STOCK_QTY_LAST_DAY[0]) );
		struct.setList_w_JOB_ODR_STOCK_QTY_LAST_DAY(TypeConverter.convert(w_JOB_ODR_STOCK_QTY_LAST_DAY));
		struct.setw_JOB_ODR_STOCK_QTY_LAST_MONTH( ((w_JOB_ODR_STOCK_QTY_LAST_MONTH == null) ? (String)null : w_JOB_ODR_STOCK_QTY_LAST_MONTH[0]) );
		struct.setList_w_JOB_ODR_STOCK_QTY_LAST_MONTH(TypeConverter.convert(w_JOB_ODR_STOCK_QTY_LAST_MONTH));
		struct.setw_TOTAL_STOCK_QTY_LAST_DAY( ((w_TOTAL_STOCK_QTY_LAST_DAY == null) ? (String)null : w_TOTAL_STOCK_QTY_LAST_DAY[0]) );
		struct.setList_w_TOTAL_STOCK_QTY_LAST_DAY(TypeConverter.convert(w_TOTAL_STOCK_QTY_LAST_DAY));
		struct.setw_TOTAL_STOCK_QTY_LAST_MONTH( ((w_TOTAL_STOCK_QTY_LAST_MONTH == null) ? (String)null : w_TOTAL_STOCK_QTY_LAST_MONTH[0]) );
		struct.setList_w_TOTAL_STOCK_QTY_LAST_MONTH(TypeConverter.convert(w_TOTAL_STOCK_QTY_LAST_MONTH));
		struct.setPLANT_NAME( ((PLANT_NAME == null) ? (String)null : PLANT_NAME[0]) );
		struct.setList_PLANT_NAME(TypeConverter.convert(PLANT_NAME));
		struct.setw_WH_CD( ((w_WH_CD == null) ? (String)null : w_WH_CD[0]) );
		struct.setList_w_WH_CD(TypeConverter.convert(w_WH_CD));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setw_STOCK_ON_HAND_QTY( ((w_STOCK_ON_HAND_QTY == null) ? (String)null : w_STOCK_ON_HAND_QTY[0]) );
		struct.setList_w_STOCK_ON_HAND_QTY(TypeConverter.convert(w_STOCK_ON_HAND_QTY));
		struct.setw_DEFECT_QTY( ((w_DEFECT_QTY == null) ? (String)null : w_DEFECT_QTY[0]) );
		struct.setList_w_DEFECT_QTY(TypeConverter.convert(w_DEFECT_QTY));
		struct.setw_PRVS_DAYEND_STOCK_QTY( ((w_PRVS_DAYEND_STOCK_QTY == null) ? (String)null : w_PRVS_DAYEND_STOCK_QTY[0]) );
		struct.setList_w_PRVS_DAYEND_STOCK_QTY(TypeConverter.convert(w_PRVS_DAYEND_STOCK_QTY));
		struct.setw_PRVS_MONTHEND_STOCK_QTY( ((w_PRVS_MONTHEND_STOCK_QTY == null) ? (String)null : w_PRVS_MONTHEND_STOCK_QTY[0]) );
		struct.setList_w_PRVS_MONTHEND_STOCK_QTY(TypeConverter.convert(w_PRVS_MONTHEND_STOCK_QTY));
		struct.setw_PLANT_NAME( ((w_PLANT_NAME == null) ? (String)null : w_PLANT_NAME[0]) );
		struct.setList_w_PLANT_NAME(TypeConverter.convert(w_PLANT_NAME));
		struct.setw_ITEM_NAME( ((w_ITEM_NAME == null) ? (String)null : w_ITEM_NAME[0]) );
		struct.setList_w_ITEM_NAME(TypeConverter.convert(w_ITEM_NAME));
		struct.setMRP_ODR_NAME( ((MRP_ODR_NAME == null) ? (String)null : MRP_ODR_NAME[0]) );
		struct.setList_MRP_ODR_NAME(TypeConverter.convert(MRP_ODR_NAME));
		struct.setMRP_NAME( ((MRP_NAME == null) ? (String)null : MRP_NAME[0]) );
		struct.setList_MRP_NAME(TypeConverter.convert(MRP_NAME));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.seth_lotCtrl( ((h_lotCtrl == null) ? (String)null : h_lotCtrl[0]) );
		struct.setList_h_lotCtrl(TypeConverter.convert(h_lotCtrl));
		struct.seth_lotFlg( ((h_lotFlg == null) ? (String)null : h_lotFlg[0]) );
		struct.setList_h_lotFlg(TypeConverter.convert(h_lotFlg));
		struct.seth_screenflg( ((h_screenflg == null) ? (String)null : h_screenflg[0]) );
		struct.setList_h_screenflg(TypeConverter.convert(h_screenflg));
		struct.setl_PLANT_NAME( ((l_PLANT_NAME == null) ? (String)null : l_PLANT_NAME[0]) );
		struct.setList_l_PLANT_NAME(TypeConverter.convert(l_PLANT_NAME));
		struct.setl_LOT_NO( ((l_LOT_NO == null) ? (String)null : l_LOT_NO[0]) );
		struct.setList_l_LOT_NO(TypeConverter.convert(l_LOT_NO));
		struct.setl_STOCK_ON_HAND_QTY( ((l_STOCK_ON_HAND_QTY == null) ? (String)null : l_STOCK_ON_HAND_QTY[0]) );
		struct.setList_l_STOCK_ON_HAND_QTY(TypeConverter.convert(l_STOCK_ON_HAND_QTY));
		struct.setl_ALCD_QTY( ((l_ALCD_QTY == null) ? (String)null : l_ALCD_QTY[0]) );
		struct.setList_l_ALCD_QTY(TypeConverter.convert(l_ALCD_QTY));
		struct.setl_EXPIRATION_DATE( ((l_EXPIRATION_DATE == null) ? (String)null : l_EXPIRATION_DATE[0]) );
		struct.setList_l_EXPIRATION_DATE(TypeConverter.convert(l_EXPIRATION_DATE));
		struct.setl_PRD_CMPLT_DATE( ((l_PRD_CMPLT_DATE == null) ? (String)null : l_PRD_CMPLT_DATE[0]) );
		struct.setList_l_PRD_CMPLT_DATE(TypeConverter.convert(l_PRD_CMPLT_DATE));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AG0010010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAG0010010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAG0010010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AG0010010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AG0010010Control control;
		AG0010010Entity  entity = null;
		AG0010010Struct  struct = null;

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

			if( (control = (AG0010010Control)so.getAttribute("AG0010010Control_"+request.getSession(false).getId())) == null ) {
				control = new AG0010010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AG0010010Control();
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
				} else if( isClick(request, "inventoryDetail") ) {
					if ( !isCryptical(request, so, params, "inventoryDetail") ) return ERROR_TARGET;
					target = onClickinventoryDetail(request, response, so, params, control);
					control.setButton("inventoryDetail");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "CloseSub1") ) {
					if ( !isCryptical(request, so, params, "CloseSub1") ) return ERROR_TARGET;
					target = onClickCloseSub1(request, response, so, params, control);
					control.setButton("CloseSub1");
				} else if( isClick(request, "inventoryDetailsub1") ) {
					if ( !isCryptical(request, so, params, "inventoryDetailsub1") ) return ERROR_TARGET;
					target = onClickinventoryDetailsub1(request, response, so, params, control);
					control.setButton("inventoryDetailsub1");
				} else if( isClick(request, "CloseSub2") ) {
					if ( !isCryptical(request, so, params, "CloseSub2") ) return ERROR_TARGET;
					target = onClickCloseSub2(request, response, so, params, control);
					control.setButton("CloseSub2");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AG0010010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "inventoryDetail") && bFLG_DISCONNECT_inventoryDetail)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "CloseSub1") && bFLG_DISCONNECT_CloseSub1)
				|| (isClick(request, "inventoryDetailsub1") && bFLG_DISCONNECT_inventoryDetailsub1)
				|| (isClick(request, "CloseSub2") && bFLG_DISCONNECT_CloseSub2)
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
	private  static boolean bFLG_DISCONNECT_inventoryDetail = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_CloseSub1 = true;
	private  static boolean bFLG_DISCONNECT_inventoryDetailsub1 = true;
	private  static boolean bFLG_DISCONNECT_CloseSub2 = true;

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
		return "com.nec.jp.orteus.metamorBase.AG0010.AG0010010Servlet";
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
	public AG0010010Servlet()
	{
		//{{user_implement_dev:<AG0010010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_select = true;
		bFLG_DISCONNECT_inventoryDetail = true;
		bFLG_DISCONNECT_clear = true;
		bFLG_DISCONNECT_CloseSub1 = true;

                //}}user_implement_dev:<AG0010010_DisConnect_FLG>

		//{{user_implement_dev:<AG0010010Servlet>
                //}}user_implement_dev:<AG0010010Servlet>
	}

	//////////////////////////////

}
