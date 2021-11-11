/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0070/src/com/nec/jp/orteus/metamorBase/AA0070/AA0070010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0070;

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

public class AA0070010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head

	/** 
	 * ��ʂ̃`�F�b�N�{�b�N�X�̃`�F�b�N��Ԃ��擾���Đݒ肷��
	 * @param HttpServletRequest request
	 * @param Hashtable params
	 * @param AA0070010Control control
	*/
	private void setCheckBoxStatus(
					HttpServletRequest request,
					Hashtable params,
					AA0070010Struct struct ) throws FoundationException
	{
		String[] checkValue;
		checkValue = ((params.containsKey("ODR_FORM_FLG")) ? (String[])params.get("ODR_FORM_FLG") : (String[])null);
		if(checkValue != null && "true".equals(checkValue[0]))
		{
			struct.setODR_FORM_FLG("1");
		}
		else
		{
			struct.setODR_FORM_FLG("0");
		}
		checkValue = ((params.containsKey("ODR_EDI_FLG")) ? (String[])params.get("ODR_EDI_FLG") : (String[])null);
		if(checkValue != null && "true".equals(checkValue[0]))
		{
			struct.setODR_EDI_FLG("1");
		}
		else
		{
			struct.setODR_EDI_FLG("0");
		}
		checkValue = ((params.containsKey("ODR_FAX_FLG")) ? (String[])params.get("ODR_FAX_FLG") : (String[])null);
		if(checkValue != null && "true".equals(checkValue[0]))
		{
			struct.setODR_FAX_FLG("1");
		}
		else
		{
			struct.setODR_FAX_FLG("0");
		}
		checkValue = ((params.containsKey("ODR_MAIL_FLG")) ? (String[])params.get("ODR_MAIL_FLG") : (String[])null);
		if(checkValue != null && "true".equals(checkValue[0]))
		{
			struct.setODR_MAIL_FLG("1");
		}
		else
		{
			struct.setODR_MAIL_FLG("0");
		}
	}
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
	 * @param control AA0070010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AA0070010Control control)
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
		HashMap keyvalueMap = new HashMap();
		if (params.containsKey("h_KEY1") && params.containsKey("h_VALUE1")) {
			String[] key = null;
			String[] value = null;
			key = (String[]) params.get("h_KEY1");
			value = (String[]) params.get("h_VALUE1");
			keyvalueMap.put(key[0], value[0]);
		}
		if (params.containsKey("h_KEY2") && params.containsKey("h_VALUE2")) {
			String[] key = null;
			String[] value = null;
			key = (String[]) params.get("h_KEY2");
			value = (String[]) params.get("h_VALUE2");
			keyvalueMap.put(key[0], value[0]);
		}
		if (params.containsKey("h_KEY3") && params.containsKey("h_VALUE3")) {
			String[] key = null;
			String[] value = null;
			key = (String[]) params.get("h_KEY3");
			value = (String[]) params.get("h_VALUE3");
			keyvalueMap.put(key[0], value[0]);
		}
		if (params.containsKey("h_KEY4") && params.containsKey("h_VALUE4")) {
			String[] key = null;
			String[] value = null;
			key = (String[]) params.get("h_KEY4");
			value = (String[]) params.get("h_VALUE4");
			keyvalueMap.put(key[0], value[0]);
		}
		if (params.containsKey("h_KEY5") && params.containsKey("h_VALUE5")) {
			String[] key = null;
			String[] value = null;
			key = (String[]) params.get("h_KEY5");
			value = (String[]) params.get("h_VALUE5");
			keyvalueMap.put(key[0], value[0]);
		}
		if (params.containsKey("h_KEY6") && params.containsKey("h_VALUE6")) {
			String[] key = null;
			String[] value = null;
			key = (String[]) params.get("h_KEY6");
			value = (String[]) params.get("h_VALUE6");
			keyvalueMap.put(key[0], value[0]);
		}
		if (params.containsKey("h_KEY7") && params.containsKey("h_VALUE7")) {
			String[] key = null;
			String[] value = null;
			key = (String[]) params.get("h_KEY7");
			value = (String[]) params.get("h_VALUE7");
			keyvalueMap.put(key[0], value[0]);
		}
		control.setKeyvalueMap(keyvalueMap);
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * ��ʋ��ʃp�����[�^�擾
	 * @param params  Hashtable�N���X�C���X�^���X
	 * @param control AA0070010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AA0070010Control control)
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
	 * @param control AA0070010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0070010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
			logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>

			objMessage.m_writer.write( Level.ALL, "AA0070010"+" $Revision: 1.14 $" );
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AA0070010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0070010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		try {
			
			setScreenMoveParams(params, control);
			control.control_eventHandller("reload");
			if(control.isScreenMove()) {
				control.control_eventHandller("select");
			}

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0070010Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0070010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
		try {
			control.control_eventHandller("select");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0070010Control�N���X�C���X�^���X
	 */
	public String onClickinsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0070010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");
		//{{user_implement_dev:<onClickinsert>
		try {
			// �`�F�b�N�{�b�N�X�����擾�ݒ�
			setCheckBoxStatus(request, params, struct);

			control.control_eventHandller("insert");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<onClickinsert>
		logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0070010Control�N���X�C���X�^���X
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0070010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
		try {
			// �`�F�b�N�{�b�N�X�����擾�ݒ�
			setCheckBoxStatus(request, params, struct);

			control.control_eventHandller("update");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0070010Control�N���X�C���X�^���X
	 */
	public String onClickdelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0070010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");
		//{{user_implement_dev:<onClickdelete>
		try {
			control.control_eventHandller("delete");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<onClickdelete>
		logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0070010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0070010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
		try {
			control.control_eventHandller("clear");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AA0070010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] VEND_NAME = ((params.containsKey("VEND_NAME")) ? (String[])params.get("VEND_NAME") : (String[])null);
		String[] VEND_ANAME = ((params.containsKey("VEND_ANAME")) ? (String[])params.get("VEND_ANAME") : (String[])null);
		String[] VEND_KNAME = ((params.containsKey("VEND_KNAME")) ? (String[])params.get("VEND_KNAME") : (String[])null);
		String[] ZIP_CD = ((params.containsKey("ZIP_CD")) ? (String[])params.get("ZIP_CD") : (String[])null);
		String[] ADDRESS_1 = ((params.containsKey("ADDRESS_1")) ? (String[])params.get("ADDRESS_1") : (String[])null);
		String[] ADDRESS_2 = ((params.containsKey("ADDRESS_2")) ? (String[])params.get("ADDRESS_2") : (String[])null);
		String[] ADDRESS_K_1 = ((params.containsKey("ADDRESS_K_1")) ? (String[])params.get("ADDRESS_K_1") : (String[])null);
		String[] ADDRESS_K_2 = ((params.containsKey("ADDRESS_K_2")) ? (String[])params.get("ADDRESS_K_2") : (String[])null);
		String[] TEL = ((params.containsKey("TEL")) ? (String[])params.get("TEL") : (String[])null);
		String[] FAX = ((params.containsKey("FAX")) ? (String[])params.get("FAX") : (String[])null);
		String[] EMAIL = ((params.containsKey("EMAIL")) ? (String[])params.get("EMAIL") : (String[])null);
		String[] VEND_ORG = ((params.containsKey("VEND_ORG")) ? (String[])params.get("VEND_ORG") : (String[])null);
		String[] VEND_PERSON = ((params.containsKey("VEND_PERSON")) ? (String[])params.get("VEND_PERSON") : (String[])null);
		String[] OWN_ORG_CD = ((params.containsKey("OWN_ORG_CD")) ? (String[])params.get("OWN_ORG_CD") : (String[])null);
		String[] OWN_ORG_NAME = ((params.containsKey("OWN_ORG_NAME")) ? (String[])params.get("OWN_ORG_NAME") : (String[])null);
		String[] OWN_PERSON_CD = ((params.containsKey("OWN_PERSON_CD")) ? (String[])params.get("OWN_PERSON_CD") : (String[])null);
		String[] OWN_PERSON_NAME = ((params.containsKey("OWN_PERSON_NAME")) ? (String[])params.get("OWN_PERSON_NAME") : (String[])null);
		String[] ROUND_TYP = ((params.containsKey("ROUND_TYP")) ? (String[])params.get("ROUND_TYP") : (String[])null);
		String[] ROUND_TYP_name = ((params.containsKey("ROUND_TYP_name")) ? (String[])params.get("ROUND_TYP_name") : (String[])null);
		String[] ROUND_TYP_val = ((params.containsKey("ROUND_TYP_val")) ? (String[])params.get("ROUND_TYP_val") : (String[])null);
		String[] TAX_CD = ((params.containsKey("TAX_CD")) ? (String[])params.get("TAX_CD") : (String[])null);
		String[] TAX_APPLY_TYP = ((params.containsKey("TAX_APPLY_TYP")) ? (String[])params.get("TAX_APPLY_TYP") : (String[])null);
		String[] TAX_APPLY_TYP_name = ((params.containsKey("TAX_APPLY_TYP_name")) ? (String[])params.get("TAX_APPLY_TYP_name") : (String[])null);
		String[] TAX_APPLY_TYP_val = ((params.containsKey("TAX_APPLY_TYP_val")) ? (String[])params.get("TAX_APPLY_TYP_val") : (String[])null);
		String[] TAX_CALC_TYP = ((params.containsKey("TAX_CALC_TYP")) ? (String[])params.get("TAX_CALC_TYP") : (String[])null);
		String[] TAX_CALC_TYP_name = ((params.containsKey("TAX_CALC_TYP_name")) ? (String[])params.get("TAX_CALC_TYP_name") : (String[])null);
		String[] TAX_CALC_TYP_val = ((params.containsKey("TAX_CALC_TYP_val")) ? (String[])params.get("TAX_CALC_TYP_val") : (String[])null);
		String[] ODR_FORM_FLG = ((params.containsKey("ODR_FORM_FLG")) ? (String[])params.get("ODR_FORM_FLG") : (String[])null);
		String[] ODR_EDI_FLG = ((params.containsKey("ODR_EDI_FLG")) ? (String[])params.get("ODR_EDI_FLG") : (String[])null);
		String[] ODR_FAX_FLG = ((params.containsKey("ODR_FAX_FLG")) ? (String[])params.get("ODR_FAX_FLG") : (String[])null);
		String[] ODR_MAIL_FLG = ((params.containsKey("ODR_MAIL_FLG")) ? (String[])params.get("ODR_MAIL_FLG") : (String[])null);
		String[] VEND_REM = ((params.containsKey("VEND_REM")) ? (String[])params.get("VEND_REM") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] h_VEND_CD = ((params.containsKey("h_VEND_CD")) ? (String[])params.get("h_VEND_CD") : (String[])null);
		String[] EXCH_TYP = ((params.containsKey("EXCH_TYP")) ? (String[])params.get("EXCH_TYP") : (String[])null);
		String[] EXCH_TYP_name = ((params.containsKey("EXCH_TYP_name")) ? (String[])params.get("EXCH_TYP_name") : (String[])null);
		String[] EXCH_TYP_val = ((params.containsKey("EXCH_TYP_val")) ? (String[])params.get("EXCH_TYP_val") : (String[])null);
		String[] IMPORT_TRN_TYP = ((params.containsKey("IMPORT_TRN_TYP")) ? (String[])params.get("IMPORT_TRN_TYP") : (String[])null);
		String[] IMPORT_TRN_TYP_name = ((params.containsKey("IMPORT_TRN_TYP_name")) ? (String[])params.get("IMPORT_TRN_TYP_name") : (String[])null);
		String[] IMPORT_TRN_TYP_val = ((params.containsKey("IMPORT_TRN_TYP_val")) ? (String[])params.get("IMPORT_TRN_TYP_val") : (String[])null);
		String[] CUR_CD = ((params.containsKey("CUR_CD")) ? (String[])params.get("CUR_CD") : (String[])null);
		String[] CUR_NAME = ((params.containsKey("CUR_NAME")) ? (String[])params.get("CUR_NAME") : (String[])null);
		String[] INSPC_ACPT_APP_TYP = ((params.containsKey("INSPC_ACPT_APP_TYP")) ? (String[])params.get("INSPC_ACPT_APP_TYP") : (String[])null);
		String[] INSPC_ACPT_APP_TYP_name = ((params.containsKey("INSPC_ACPT_APP_TYP_name")) ? (String[])params.get("INSPC_ACPT_APP_TYP_name") : (String[])null);
		String[] INSPC_ACPT_APP_TYP_val = ((params.containsKey("INSPC_ACPT_APP_TYP_val")) ? (String[])params.get("INSPC_ACPT_APP_TYP_val") : (String[])null);
		String[] h_SCREENMOVE_TYP = ((params.containsKey("h_SCREENMOVE_TYP")) ? (String[])params.get("h_SCREENMOVE_TYP") : (String[])null);
		String[] h_APPR_ID = ((params.containsKey("h_APPR_ID")) ? (String[])params.get("h_APPR_ID") : (String[])null);
		String[] APPR_REMARKS = ((params.containsKey("APPR_REMARKS")) ? (String[])params.get("APPR_REMARKS") : (String[])null);
		String[] h_APR_VEND_CTRL = ((params.containsKey("h_APR_VEND_CTRL")) ? (String[])params.get("h_APR_VEND_CTRL") : (String[])null);

		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setVEND_NAME( ((VEND_NAME == null) ? (String)null : VEND_NAME[0]) );
		struct.setList_VEND_NAME(TypeConverter.convert(VEND_NAME));
		struct.setVEND_ANAME( ((VEND_ANAME == null) ? (String)null : VEND_ANAME[0]) );
		struct.setList_VEND_ANAME(TypeConverter.convert(VEND_ANAME));
		struct.setVEND_KNAME( ((VEND_KNAME == null) ? (String)null : VEND_KNAME[0]) );
		struct.setList_VEND_KNAME(TypeConverter.convert(VEND_KNAME));
		struct.setZIP_CD( ((ZIP_CD == null) ? (String)null : ZIP_CD[0]) );
		struct.setList_ZIP_CD(TypeConverter.convert(ZIP_CD));
		struct.setADDRESS_1( ((ADDRESS_1 == null) ? (String)null : ADDRESS_1[0]) );
		struct.setList_ADDRESS_1(TypeConverter.convert(ADDRESS_1));
		struct.setADDRESS_2( ((ADDRESS_2 == null) ? (String)null : ADDRESS_2[0]) );
		struct.setList_ADDRESS_2(TypeConverter.convert(ADDRESS_2));
		struct.setADDRESS_K_1( ((ADDRESS_K_1 == null) ? (String)null : ADDRESS_K_1[0]) );
		struct.setList_ADDRESS_K_1(TypeConverter.convert(ADDRESS_K_1));
		struct.setADDRESS_K_2( ((ADDRESS_K_2 == null) ? (String)null : ADDRESS_K_2[0]) );
		struct.setList_ADDRESS_K_2(TypeConverter.convert(ADDRESS_K_2));
		struct.setTEL( ((TEL == null) ? (String)null : TEL[0]) );
		struct.setList_TEL(TypeConverter.convert(TEL));
		struct.setFAX( ((FAX == null) ? (String)null : FAX[0]) );
		struct.setList_FAX(TypeConverter.convert(FAX));
		struct.setEMAIL( ((EMAIL == null) ? (String)null : EMAIL[0]) );
		struct.setList_EMAIL(TypeConverter.convert(EMAIL));
		struct.setVEND_ORG( ((VEND_ORG == null) ? (String)null : VEND_ORG[0]) );
		struct.setList_VEND_ORG(TypeConverter.convert(VEND_ORG));
		struct.setVEND_PERSON( ((VEND_PERSON == null) ? (String)null : VEND_PERSON[0]) );
		struct.setList_VEND_PERSON(TypeConverter.convert(VEND_PERSON));
		struct.setOWN_ORG_CD( ((OWN_ORG_CD == null) ? (String)null : OWN_ORG_CD[0]) );
		struct.setList_OWN_ORG_CD(TypeConverter.convert(OWN_ORG_CD));
		struct.setOWN_ORG_NAME( ((OWN_ORG_NAME == null) ? (String)null : OWN_ORG_NAME[0]) );
		struct.setList_OWN_ORG_NAME(TypeConverter.convert(OWN_ORG_NAME));
		struct.setOWN_PERSON_CD( ((OWN_PERSON_CD == null) ? (String)null : OWN_PERSON_CD[0]) );
		struct.setList_OWN_PERSON_CD(TypeConverter.convert(OWN_PERSON_CD));
		struct.setOWN_PERSON_NAME( ((OWN_PERSON_NAME == null) ? (String)null : OWN_PERSON_NAME[0]) );
		struct.setList_OWN_PERSON_NAME(TypeConverter.convert(OWN_PERSON_NAME));
		if( (ROUND_TYP == null)||("".equals(ROUND_TYP[0])) ) {
		   struct.setROUND_TYP( (Integer)null );
		} else {
		   struct.setROUND_TYP( new Integer(ROUND_TYP[0]) );
		   struct.setList_ROUND_TYP(TypeConverter.convert(ROUND_TYP));
		}
		struct.setROUND_TYP_name( ((ROUND_TYP_name == null) ? (String)null : ROUND_TYP_name[0]) );
		struct.setList_ROUND_TYP_name(TypeConverter.convert(ROUND_TYP_name));
		struct.setROUND_TYP_val( ((ROUND_TYP_val == null) ? (String)null : ROUND_TYP_val[0]) );
		struct.setList_ROUND_TYP_val(TypeConverter.convert(ROUND_TYP_val));
		struct.setTAX_CD( ((TAX_CD == null) ? (String)null : TAX_CD[0]) );
		struct.setList_TAX_CD(TypeConverter.convert(TAX_CD));
		if( (TAX_APPLY_TYP == null)||("".equals(TAX_APPLY_TYP[0])) ) {
		   struct.setTAX_APPLY_TYP( (Integer)null );
		} else {
		   struct.setTAX_APPLY_TYP( new Integer(TAX_APPLY_TYP[0]) );
		   struct.setList_TAX_APPLY_TYP(TypeConverter.convert(TAX_APPLY_TYP));
		}
		struct.setTAX_APPLY_TYP_name( ((TAX_APPLY_TYP_name == null) ? (String)null : TAX_APPLY_TYP_name[0]) );
		struct.setList_TAX_APPLY_TYP_name(TypeConverter.convert(TAX_APPLY_TYP_name));
		struct.setTAX_APPLY_TYP_val( ((TAX_APPLY_TYP_val == null) ? (String)null : TAX_APPLY_TYP_val[0]) );
		struct.setList_TAX_APPLY_TYP_val(TypeConverter.convert(TAX_APPLY_TYP_val));
		if( (TAX_CALC_TYP == null)||("".equals(TAX_CALC_TYP[0])) ) {
		   struct.setTAX_CALC_TYP( (Integer)null );
		} else {
		   struct.setTAX_CALC_TYP( new Integer(TAX_CALC_TYP[0]) );
		   struct.setList_TAX_CALC_TYP(TypeConverter.convert(TAX_CALC_TYP));
		}
		struct.setTAX_CALC_TYP_name( ((TAX_CALC_TYP_name == null) ? (String)null : TAX_CALC_TYP_name[0]) );
		struct.setList_TAX_CALC_TYP_name(TypeConverter.convert(TAX_CALC_TYP_name));
		struct.setTAX_CALC_TYP_val( ((TAX_CALC_TYP_val == null) ? (String)null : TAX_CALC_TYP_val[0]) );
		struct.setList_TAX_CALC_TYP_val(TypeConverter.convert(TAX_CALC_TYP_val));
		struct.setODR_FORM_FLG( ((ODR_FORM_FLG == null) ? (String)null : ODR_FORM_FLG[0]) );
		struct.setList_ODR_FORM_FLG(TypeConverter.convert(ODR_FORM_FLG));
		struct.setODR_EDI_FLG( ((ODR_EDI_FLG == null) ? (String)null : ODR_EDI_FLG[0]) );
		struct.setList_ODR_EDI_FLG(TypeConverter.convert(ODR_EDI_FLG));
		struct.setODR_FAX_FLG( ((ODR_FAX_FLG == null) ? (String)null : ODR_FAX_FLG[0]) );
		struct.setList_ODR_FAX_FLG(TypeConverter.convert(ODR_FAX_FLG));
		struct.setODR_MAIL_FLG( ((ODR_MAIL_FLG == null) ? (String)null : ODR_MAIL_FLG[0]) );
		struct.setList_ODR_MAIL_FLG(TypeConverter.convert(ODR_MAIL_FLG));
		struct.setVEND_REM( ((VEND_REM == null) ? (String)null : VEND_REM[0]) );
		struct.setList_VEND_REM(TypeConverter.convert(VEND_REM));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		struct.seth_VEND_CD( ((h_VEND_CD == null) ? (String)null : h_VEND_CD[0]) );
		struct.setList_h_VEND_CD(TypeConverter.convert(h_VEND_CD));
		struct.setEXCH_TYP( ((EXCH_TYP == null) ? (String)null : EXCH_TYP[0]) );
		struct.setList_EXCH_TYP(TypeConverter.convert(EXCH_TYP));
		struct.setEXCH_TYP_name( ((EXCH_TYP_name == null) ? (String)null : EXCH_TYP_name[0]) );
		struct.setList_EXCH_TYP_name(TypeConverter.convert(EXCH_TYP_name));
		struct.setEXCH_TYP_val( ((EXCH_TYP_val == null) ? (String)null : EXCH_TYP_val[0]) );
		struct.setList_EXCH_TYP_val(TypeConverter.convert(EXCH_TYP_val));
		struct.setIMPORT_TRN_TYP( ((IMPORT_TRN_TYP == null) ? (String)null : IMPORT_TRN_TYP[0]) );
		struct.setList_IMPORT_TRN_TYP(TypeConverter.convert(IMPORT_TRN_TYP));
		struct.setIMPORT_TRN_TYP_name( ((IMPORT_TRN_TYP_name == null) ? (String)null : IMPORT_TRN_TYP_name[0]) );
		struct.setList_IMPORT_TRN_TYP_name(TypeConverter.convert(IMPORT_TRN_TYP_name));
		struct.setIMPORT_TRN_TYP_val( ((IMPORT_TRN_TYP_val == null) ? (String)null : IMPORT_TRN_TYP_val[0]) );
		struct.setList_IMPORT_TRN_TYP_val(TypeConverter.convert(IMPORT_TRN_TYP_val));
		struct.setCUR_CD( ((CUR_CD == null) ? (String)null : CUR_CD[0]) );
		struct.setList_CUR_CD(TypeConverter.convert(CUR_CD));
		struct.setCUR_NAME( ((CUR_NAME == null) ? (String)null : CUR_NAME[0]) );
		struct.setList_CUR_NAME(TypeConverter.convert(CUR_NAME));
		struct.setINSPC_ACPT_APP_TYP( ((INSPC_ACPT_APP_TYP == null) ? (String)null : INSPC_ACPT_APP_TYP[0]) );
		struct.setList_INSPC_ACPT_APP_TYP(TypeConverter.convert(INSPC_ACPT_APP_TYP));
		struct.setINSPC_ACPT_APP_TYP_name( ((INSPC_ACPT_APP_TYP_name == null) ? (String)null : INSPC_ACPT_APP_TYP_name[0]) );
		struct.setList_INSPC_ACPT_APP_TYP_name(TypeConverter.convert(INSPC_ACPT_APP_TYP_name));
		struct.setINSPC_ACPT_APP_TYP_val( ((INSPC_ACPT_APP_TYP_val == null) ? (String)null : INSPC_ACPT_APP_TYP_val[0]) );
		struct.setList_INSPC_ACPT_APP_TYP_val(TypeConverter.convert(INSPC_ACPT_APP_TYP_val));
		struct.seth_SCREENMOVE_TYP( ((h_SCREENMOVE_TYP == null) ? (String)null : h_SCREENMOVE_TYP[0]) );
		struct.setList_h_SCREENMOVE_TYP(TypeConverter.convert(h_SCREENMOVE_TYP));
		struct.seth_APPR_ID( ((h_APPR_ID == null) ? (String)null : h_APPR_ID[0]) );
		struct.setList_h_APPR_ID(TypeConverter.convert(h_APPR_ID));
		struct.setAPPR_REMARKS( ((APPR_REMARKS == null) ? (String)null : APPR_REMARKS[0]) );
		struct.setList_APPR_REMARKS(TypeConverter.convert(APPR_REMARKS));
		struct.seth_APR_VEND_CTRL( ((h_APR_VEND_CTRL == null) ? (String)null : h_APR_VEND_CTRL[0]) );
		struct.setList_h_APR_VEND_CTRL(TypeConverter.convert(h_APR_VEND_CTRL));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AA0070010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAA0070010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAA0070010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AA0070010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AA0070010Control control;
		AA0070010Entity  entity = null;
		AA0070010Struct  struct = null;

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

			if( (control = (AA0070010Control)so.getAttribute("AA0070010Control_"+request.getSession(false).getId())) == null ) {
				control = new AA0070010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AA0070010Control();
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
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AA0070010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "insert") && bFLG_DISCONNECT_insert)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "delete") && bFLG_DISCONNECT_delete)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
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
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_delete = true;
	private  static boolean bFLG_DISCONNECT_clear = true;

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
		return "com.nec.jp.orteus.metamorBase.AA0070.AA0070010Servlet";
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
	public AA0070010Servlet()
	{
		//{{user_implement_dev:<AA0070010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_select = true;
		bFLG_DISCONNECT_insert = true;
		bFLG_DISCONNECT_update = true;
		bFLG_DISCONNECT_delete = true;
		bFLG_DISCONNECT_clear = true;

                //}}user_implement_dev:<AA0070010_DisConnect_FLG>

		//{{user_implement_dev:<AA0070010Servlet>
			
                //}}user_implement_dev:<AA0070010Servlet>
	}

	//////////////////////////////

}
