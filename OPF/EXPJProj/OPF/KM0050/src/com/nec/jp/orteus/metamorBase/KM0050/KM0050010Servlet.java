/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0050/src/com/nec/jp/orteus/metamorBase/KM0050/KM0050010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0050;

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
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_dev:import

//{{user_implement_dev:header
/**
 * CLASS     : KM0050010Servlet �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class KM0050010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
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
	 * @param control KM0050010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, KM0050010Control control)
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
		String[] PROJECT_CD = (String[]) params.get("PROJECT_CD");
		control.setProjectCd((PROJECT_CD == null) ? null : PROJECT_CD[0]);
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * ��ʋ��ʃp�����[�^�擾
	 * @param params  Hashtable�N���X�C���X�^���X
	 * @param control KM0050010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, KM0050010Control control)
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
	 * @param control KM0050010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0050010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0050010Entity entity = control.entity;
		KM0050010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
			logger.entering("KM0050010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			LogWriter.write( Level.ALL, "KM0050010"+" $Revision: 1.1 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("KM0050010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control KM0050010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0050010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0050010Entity entity = control.entity;
		KM0050010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		try {
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			control.control_eventHandller("reload");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("KM0050010-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("KM0050010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * ���v�\���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0050010Control�N���X�C���X�^���X
	 */
	public String onClickTotalShow(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0050010Entity entity = control.entity;
		KM0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickTotalShow");
		//{{user_implement_dev:<onClickTotalShow>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("TotalShow");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickTotalShow>
		logger.exiting("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickTotalShow");

		return nextUrl;
	}

	/**
	 * �Čv�Z�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0050010Control�N���X�C���X�^���X
	 */
	public String onClickRecalculation(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0050010Entity entity = control.entity;
		KM0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickRecalculation");
		//{{user_implement_dev:<onClickRecalculation>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Recalculation");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickRecalculation>
		logger.exiting("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickRecalculation");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0050010Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0050010Entity entity = control.entity;
		KM0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Select");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelect>
		logger.exiting("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * ���̑��o��o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0050010Control�N���X�C���X�^���X
	 */
	public String onClickOtherRegister(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0050010Entity entity = control.entity;
		KM0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickOtherRegister");
		//{{user_implement_dev:<onClickOtherRegister>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("OtherRegister");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickOtherRegister>
		logger.exiting("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickOtherRegister");

		return nextUrl;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0050010Control�N���X�C���X�^���X
	 */
	public String onClickCSVOut(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0050010Entity entity = control.entity;
		KM0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickCSVOut");
		//{{user_implement_dev:<onClickCSVOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("CSVOut");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCSVOut>
		logger.exiting("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickCSVOut");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0050010Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0050010Entity entity = control.entity;
		KM0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
		//{{user_implement_dev:<onClickClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Clear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClear>
		logger.exiting("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0050010Control�N���X�C���X�^���X
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0050010Entity entity = control.entity;
		KM0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
		//{{user_implement_dev:<onClickClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Close");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClose>
		logger.exiting("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * ���ԕʐi���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0050010Control�N���X�C���X�^���X
	 */
	public String onClickJobOdrProgress(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0050010Entity entity = control.entity;
		KM0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickJobOdrProgress");
		//{{user_implement_dev:<onClickJobOdrProgress>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("JobOdrProgress");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickJobOdrProgress>
		logger.exiting("KM0050010Servlet"+":USER="+request.getRemoteUser(),"onClickJobOdrProgress");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, KM0050010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PROJECT_CD = ((params.containsKey("PROJECT_CD")) ? (String[])params.get("PROJECT_CD") : (String[])null);
		String[] CALCULATION_DATE = ((params.containsKey("CALCULATION_DATE")) ? (String[])params.get("CALCULATION_DATE") : (String[])null);
		String[] TYP = ((params.containsKey("TYP")) ? (String[])params.get("TYP") : (String[])null);
		String[] DETAL_NO = ((params.containsKey("DETAL_NO")) ? (String[])params.get("DETAL_NO") : (String[])null);
		String[] ESTIMATE_TYPE = ((params.containsKey("ESTIMATE_TYPE")) ? (String[])params.get("ESTIMATE_TYPE") : (String[])null);
		String[] CUST_ITEM_CD = ((params.containsKey("CUST_ITEM_CD")) ? (String[])params.get("CUST_ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] ODR_AMOUNT = ((params.containsKey("ODR_AMOUNT")) ? (String[])params.get("ODR_AMOUNT") : (String[])null);
		String[] PROGRESS = ((params.containsKey("PROGRESS")) ? (String[])params.get("PROGRESS") : (String[])null);
		String[] PROFIT_RATIO = ((params.containsKey("PROFIT_RATIO")) ? (String[])params.get("PROFIT_RATIO") : (String[])null);
		String[] ITEM_TOTAL_COST = ((params.containsKey("ITEM_TOTAL_COST")) ? (String[])params.get("ITEM_TOTAL_COST") : (String[])null);
		String[] ES_COST_MATERIAL = ((params.containsKey("ES_COST_MATERIAL")) ? (String[])params.get("ES_COST_MATERIAL") : (String[])null);
		String[] ES_COST_PROCESS = ((params.containsKey("ES_COST_PROCESS")) ? (String[])params.get("ES_COST_PROCESS") : (String[])null);
		String[] ES_COST_OUTSOUCE = ((params.containsKey("ES_COST_OUTSOUCE")) ? (String[])params.get("ES_COST_OUTSOUCE") : (String[])null);
		String[] ES_COST_ETC = ((params.containsKey("ES_COST_ETC")) ? (String[])params.get("ES_COST_ETC") : (String[])null);
		String[] ES_COST_SERVICE = ((params.containsKey("ES_COST_SERVICE")) ? (String[])params.get("ES_COST_SERVICE") : (String[])null);
		String[] ODR_QTY = ((params.containsKey("ODR_QTY")) ? (String[])params.get("ODR_QTY") : (String[])null);
		String[] UNIT_CD = ((params.containsKey("UNIT_CD")) ? (String[])params.get("UNIT_CD") : (String[])null);
		String[] ODR_UNIT_PRICE = ((params.containsKey("ODR_UNIT_PRICE")) ? (String[])params.get("ODR_UNIT_PRICE") : (String[])null);
		String[] DESINATED_DLV_DATE = ((params.containsKey("DESINATED_DLV_DATE")) ? (String[])params.get("DESINATED_DLV_DATE") : (String[])null);
		String[] ODR_AMOUNT_W = ((params.containsKey("ODR_AMOUNT_W")) ? (String[])params.get("ODR_AMOUNT_W") : (String[])null);
		String[] ITEM_TOTAL_COST_W = ((params.containsKey("ITEM_TOTAL_COST_W")) ? (String[])params.get("ITEM_TOTAL_COST_W") : (String[])null);
		String[] ITEM_TOTAL_COST_T = ((params.containsKey("ITEM_TOTAL_COST_T")) ? (String[])params.get("ITEM_TOTAL_COST_T") : (String[])null);
		String[] ITEM_TOTAL_COST_P = ((params.containsKey("ITEM_TOTAL_COST_P")) ? (String[])params.get("ITEM_TOTAL_COST_P") : (String[])null);
		String[] ITEM_TOTAL_COST_D = ((params.containsKey("ITEM_TOTAL_COST_D")) ? (String[])params.get("ITEM_TOTAL_COST_D") : (String[])null);
		String[] MATERIAL_COST_W = ((params.containsKey("MATERIAL_COST_W")) ? (String[])params.get("MATERIAL_COST_W") : (String[])null);
		String[] MATERIAL_COST_T = ((params.containsKey("MATERIAL_COST_T")) ? (String[])params.get("MATERIAL_COST_T") : (String[])null);
		String[] MATERIAL_COST_P = ((params.containsKey("MATERIAL_COST_P")) ? (String[])params.get("MATERIAL_COST_P") : (String[])null);
		String[] MATERIAL_COST_D = ((params.containsKey("MATERIAL_COST_D")) ? (String[])params.get("MATERIAL_COST_D") : (String[])null);
		String[] PROCESSING_COST_W = ((params.containsKey("PROCESSING_COST_W")) ? (String[])params.get("PROCESSING_COST_W") : (String[])null);
		String[] PROCESSING_COST_T = ((params.containsKey("PROCESSING_COST_T")) ? (String[])params.get("PROCESSING_COST_T") : (String[])null);
		String[] PROCESSING_COST_P = ((params.containsKey("PROCESSING_COST_P")) ? (String[])params.get("PROCESSING_COST_P") : (String[])null);
		String[] PROCESSING_COST_D = ((params.containsKey("PROCESSING_COST_D")) ? (String[])params.get("PROCESSING_COST_D") : (String[])null);
		String[] SBCNT_COST_W = ((params.containsKey("SBCNT_COST_W")) ? (String[])params.get("SBCNT_COST_W") : (String[])null);
		String[] SBCNT_COST_T = ((params.containsKey("SBCNT_COST_T")) ? (String[])params.get("SBCNT_COST_T") : (String[])null);
		String[] SBCNT_COST_P = ((params.containsKey("SBCNT_COST_P")) ? (String[])params.get("SBCNT_COST_P") : (String[])null);
		String[] SBCNT_COST_D = ((params.containsKey("SBCNT_COST_D")) ? (String[])params.get("SBCNT_COST_D") : (String[])null);
		String[] OTHER_OVERHEADS_W = ((params.containsKey("OTHER_OVERHEADS_W")) ? (String[])params.get("OTHER_OVERHEADS_W") : (String[])null);
		String[] OTHER_OVERHEADS_T = ((params.containsKey("OTHER_OVERHEADS_T")) ? (String[])params.get("OTHER_OVERHEADS_T") : (String[])null);
		String[] OTHER_OVERHEADS_P = ((params.containsKey("OTHER_OVERHEADS_P")) ? (String[])params.get("OTHER_OVERHEADS_P") : (String[])null);
		String[] OTHER_OVERHEADS_D = ((params.containsKey("OTHER_OVERHEADS_D")) ? (String[])params.get("OTHER_OVERHEADS_D") : (String[])null);
		String[] SERVICE_COST_W = ((params.containsKey("SERVICE_COST_W")) ? (String[])params.get("SERVICE_COST_W") : (String[])null);
		String[] SERVICE_COST_T = ((params.containsKey("SERVICE_COST_T")) ? (String[])params.get("SERVICE_COST_T") : (String[])null);
		String[] SERVICE_COST_P = ((params.containsKey("SERVICE_COST_P")) ? (String[])params.get("SERVICE_COST_P") : (String[])null);
		String[] SERVICE_COST_D = ((params.containsKey("SERVICE_COST_D")) ? (String[])params.get("SERVICE_COST_D") : (String[])null);
		String[] PROFIT_RATIO_W = ((params.containsKey("PROFIT_RATIO_W")) ? (String[])params.get("PROFIT_RATIO_W") : (String[])null);
		String[] PROFIT_RATIO_P = ((params.containsKey("PROFIT_RATIO_P")) ? (String[])params.get("PROFIT_RATIO_P") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] PROJECT_NAME = ((params.containsKey("PROJECT_NAME")) ? (String[])params.get("PROJECT_NAME") : (String[])null);
		String[] TYP_NUM = ((params.containsKey("TYP_NUM")) ? (String[])params.get("TYP_NUM") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] ESTIMATE_NO = ((params.containsKey("ESTIMATE_NO")) ? (String[])params.get("ESTIMATE_NO") : (String[])null);
		String[] h_DETAL_NO = ((params.containsKey("h_DETAL_NO")) ? (String[])params.get("h_DETAL_NO") : (String[])null);
		String[] h_ES_COST_ETC = ((params.containsKey("h_ES_COST_ETC")) ? (String[])params.get("h_ES_COST_ETC") : (String[])null);
		String[] PJ_MODIFY_COUNT = ((params.containsKey("PJ_MODIFY_COUNT")) ? (String[])params.get("PJ_MODIFY_COUNT") : (String[])null);
		String[] l_JOB_ODR_CD = ((params.containsKey("l_JOB_ODR_CD")) ? (String[])params.get("l_JOB_ODR_CD") : (String[])null);
		String[] l_JOB_ODR_CANCEL_NO = ((params.containsKey("l_JOB_ODR_CANCEL_NO")) ? (String[])params.get("l_JOB_ODR_CANCEL_NO") : (String[])null);
		String[] l_PLANT_CD = ((params.containsKey("l_PLANT_CD")) ? (String[])params.get("l_PLANT_CD") : (String[])null);
		String[] h_COST_PROGRESS = ((params.containsKey("h_COST_PROGRESS")) ? (String[])params.get("h_COST_PROGRESS") : (String[])null);
		String[] l_ODR_AMOUNT = ((params.containsKey("l_ODR_AMOUNT")) ? (String[])params.get("l_ODR_AMOUNT") : (String[])null);
		String[] l_ODR_QTY = ((params.containsKey("l_ODR_QTY")) ? (String[])params.get("l_ODR_QTY") : (String[])null);
		String[] l_ODR_UNIT_PRICE = ((params.containsKey("l_ODR_UNIT_PRICE")) ? (String[])params.get("l_ODR_UNIT_PRICE") : (String[])null);
		String[] ITEM_TOTAL_COST_D2 = ((params.containsKey("ITEM_TOTAL_COST_D2")) ? (String[])params.get("ITEM_TOTAL_COST_D2") : (String[])null);
		String[] MATERIAL_COST_D2 = ((params.containsKey("MATERIAL_COST_D2")) ? (String[])params.get("MATERIAL_COST_D2") : (String[])null);
		String[] PROCESSING_COST_D2 = ((params.containsKey("PROCESSING_COST_D2")) ? (String[])params.get("PROCESSING_COST_D2") : (String[])null);
		String[] SBCNT_COST_D2 = ((params.containsKey("SBCNT_COST_D2")) ? (String[])params.get("SBCNT_COST_D2") : (String[])null);
		String[] OTHER_OVERHEADS_D2 = ((params.containsKey("OTHER_OVERHEADS_D2")) ? (String[])params.get("OTHER_OVERHEADS_D2") : (String[])null);
		String[] SERVICE_COST_D2 = ((params.containsKey("SERVICE_COST_D2")) ? (String[])params.get("SERVICE_COST_D2") : (String[])null);

		struct.setPROJECT_CD( ((PROJECT_CD == null) ? (String)null : PROJECT_CD[0]) );
		struct.setList_PROJECT_CD(TypeConverter.convert(PROJECT_CD));
		struct.setCALCULATION_DATE( ((CALCULATION_DATE == null) ? (String)null : CALCULATION_DATE[0]) );
		struct.setList_CALCULATION_DATE(TypeConverter.convert(CALCULATION_DATE));
		struct.setTYP( ((TYP == null) ? (String)null : TYP[0]) );
		struct.setList_TYP(TypeConverter.convert(TYP));
		struct.setDETAL_NO( ((DETAL_NO == null) ? (String)null : DETAL_NO[0]) );
		struct.setList_DETAL_NO(TypeConverter.convert(DETAL_NO));
		struct.setESTIMATE_TYPE( ((ESTIMATE_TYPE == null) ? (String)null : ESTIMATE_TYPE[0]) );
		struct.setList_ESTIMATE_TYPE(TypeConverter.convert(ESTIMATE_TYPE));
		struct.setCUST_ITEM_CD( ((CUST_ITEM_CD == null) ? (String)null : CUST_ITEM_CD[0]) );
		struct.setList_CUST_ITEM_CD(TypeConverter.convert(CUST_ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setODR_AMOUNT( ((ODR_AMOUNT == null) ? (String)null : ODR_AMOUNT[0]) );
		struct.setList_ODR_AMOUNT(TypeConverter.convert(ODR_AMOUNT));
		struct.setPROGRESS( ((PROGRESS == null) ? (String)null : PROGRESS[0]) );
		struct.setList_PROGRESS(TypeConverter.convert(PROGRESS));
		struct.setPROFIT_RATIO( ((PROFIT_RATIO == null) ? (String)null : PROFIT_RATIO[0]) );
		struct.setList_PROFIT_RATIO(TypeConverter.convert(PROFIT_RATIO));
		struct.setITEM_TOTAL_COST( ((ITEM_TOTAL_COST == null) ? (String)null : ITEM_TOTAL_COST[0]) );
		struct.setList_ITEM_TOTAL_COST(TypeConverter.convert(ITEM_TOTAL_COST));
		struct.setES_COST_MATERIAL( ((ES_COST_MATERIAL == null) ? (String)null : ES_COST_MATERIAL[0]) );
		struct.setList_ES_COST_MATERIAL(TypeConverter.convert(ES_COST_MATERIAL));
		struct.setES_COST_PROCESS( ((ES_COST_PROCESS == null) ? (String)null : ES_COST_PROCESS[0]) );
		struct.setList_ES_COST_PROCESS(TypeConverter.convert(ES_COST_PROCESS));
		struct.setES_COST_OUTSOUCE( ((ES_COST_OUTSOUCE == null) ? (String)null : ES_COST_OUTSOUCE[0]) );
		struct.setList_ES_COST_OUTSOUCE(TypeConverter.convert(ES_COST_OUTSOUCE));
		struct.setES_COST_ETC( ((ES_COST_ETC == null) ? (String)null : ES_COST_ETC[0]) );
		struct.setList_ES_COST_ETC(TypeConverter.convert(ES_COST_ETC));
		struct.setES_COST_SERVICE( ((ES_COST_SERVICE == null) ? (String)null : ES_COST_SERVICE[0]) );
		struct.setList_ES_COST_SERVICE(TypeConverter.convert(ES_COST_SERVICE));
		struct.setODR_QTY( ((ODR_QTY == null) ? (String)null : ODR_QTY[0]) );
		struct.setList_ODR_QTY(TypeConverter.convert(ODR_QTY));
		struct.setUNIT_CD( ((UNIT_CD == null) ? (String)null : UNIT_CD[0]) );
		struct.setList_UNIT_CD(TypeConverter.convert(UNIT_CD));
		struct.setODR_UNIT_PRICE( ((ODR_UNIT_PRICE == null) ? (String)null : ODR_UNIT_PRICE[0]) );
		struct.setList_ODR_UNIT_PRICE(TypeConverter.convert(ODR_UNIT_PRICE));
		struct.setDESINATED_DLV_DATE( ((DESINATED_DLV_DATE == null) ? (String)null : DESINATED_DLV_DATE[0]) );
		struct.setList_DESINATED_DLV_DATE(TypeConverter.convert(DESINATED_DLV_DATE));
		struct.setODR_AMOUNT_W( ((ODR_AMOUNT_W == null) ? (String)null : ODR_AMOUNT_W[0]) );
		struct.setList_ODR_AMOUNT_W(TypeConverter.convert(ODR_AMOUNT_W));
		struct.setITEM_TOTAL_COST_W( ((ITEM_TOTAL_COST_W == null) ? (String)null : ITEM_TOTAL_COST_W[0]) );
		struct.setList_ITEM_TOTAL_COST_W(TypeConverter.convert(ITEM_TOTAL_COST_W));
		struct.setITEM_TOTAL_COST_T( ((ITEM_TOTAL_COST_T == null) ? (String)null : ITEM_TOTAL_COST_T[0]) );
		struct.setList_ITEM_TOTAL_COST_T(TypeConverter.convert(ITEM_TOTAL_COST_T));
		struct.setITEM_TOTAL_COST_P( ((ITEM_TOTAL_COST_P == null) ? (String)null : ITEM_TOTAL_COST_P[0]) );
		struct.setList_ITEM_TOTAL_COST_P(TypeConverter.convert(ITEM_TOTAL_COST_P));
		struct.setITEM_TOTAL_COST_D( ((ITEM_TOTAL_COST_D == null) ? (String)null : ITEM_TOTAL_COST_D[0]) );
		struct.setList_ITEM_TOTAL_COST_D(TypeConverter.convert(ITEM_TOTAL_COST_D));
		struct.setMATERIAL_COST_W( ((MATERIAL_COST_W == null) ? (String)null : MATERIAL_COST_W[0]) );
		struct.setList_MATERIAL_COST_W(TypeConverter.convert(MATERIAL_COST_W));
		struct.setMATERIAL_COST_T( ((MATERIAL_COST_T == null) ? (String)null : MATERIAL_COST_T[0]) );
		struct.setList_MATERIAL_COST_T(TypeConverter.convert(MATERIAL_COST_T));
		struct.setMATERIAL_COST_P( ((MATERIAL_COST_P == null) ? (String)null : MATERIAL_COST_P[0]) );
		struct.setList_MATERIAL_COST_P(TypeConverter.convert(MATERIAL_COST_P));
		struct.setMATERIAL_COST_D( ((MATERIAL_COST_D == null) ? (String)null : MATERIAL_COST_D[0]) );
		struct.setList_MATERIAL_COST_D(TypeConverter.convert(MATERIAL_COST_D));
		struct.setPROCESSING_COST_W( ((PROCESSING_COST_W == null) ? (String)null : PROCESSING_COST_W[0]) );
		struct.setList_PROCESSING_COST_W(TypeConverter.convert(PROCESSING_COST_W));
		struct.setPROCESSING_COST_T( ((PROCESSING_COST_T == null) ? (String)null : PROCESSING_COST_T[0]) );
		struct.setList_PROCESSING_COST_T(TypeConverter.convert(PROCESSING_COST_T));
		struct.setPROCESSING_COST_P( ((PROCESSING_COST_P == null) ? (String)null : PROCESSING_COST_P[0]) );
		struct.setList_PROCESSING_COST_P(TypeConverter.convert(PROCESSING_COST_P));
		struct.setPROCESSING_COST_D( ((PROCESSING_COST_D == null) ? (String)null : PROCESSING_COST_D[0]) );
		struct.setList_PROCESSING_COST_D(TypeConverter.convert(PROCESSING_COST_D));
		struct.setSBCNT_COST_W( ((SBCNT_COST_W == null) ? (String)null : SBCNT_COST_W[0]) );
		struct.setList_SBCNT_COST_W(TypeConverter.convert(SBCNT_COST_W));
		struct.setSBCNT_COST_T( ((SBCNT_COST_T == null) ? (String)null : SBCNT_COST_T[0]) );
		struct.setList_SBCNT_COST_T(TypeConverter.convert(SBCNT_COST_T));
		struct.setSBCNT_COST_P( ((SBCNT_COST_P == null) ? (String)null : SBCNT_COST_P[0]) );
		struct.setList_SBCNT_COST_P(TypeConverter.convert(SBCNT_COST_P));
		struct.setSBCNT_COST_D( ((SBCNT_COST_D == null) ? (String)null : SBCNT_COST_D[0]) );
		struct.setList_SBCNT_COST_D(TypeConverter.convert(SBCNT_COST_D));
		struct.setOTHER_OVERHEADS_W( ((OTHER_OVERHEADS_W == null) ? (String)null : OTHER_OVERHEADS_W[0]) );
		struct.setList_OTHER_OVERHEADS_W(TypeConverter.convert(OTHER_OVERHEADS_W));
		struct.setOTHER_OVERHEADS_T( ((OTHER_OVERHEADS_T == null) ? (String)null : OTHER_OVERHEADS_T[0]) );
		struct.setList_OTHER_OVERHEADS_T(TypeConverter.convert(OTHER_OVERHEADS_T));
		struct.setOTHER_OVERHEADS_P( ((OTHER_OVERHEADS_P == null) ? (String)null : OTHER_OVERHEADS_P[0]) );
		struct.setList_OTHER_OVERHEADS_P(TypeConverter.convert(OTHER_OVERHEADS_P));
		struct.setOTHER_OVERHEADS_D( ((OTHER_OVERHEADS_D == null) ? (String)null : OTHER_OVERHEADS_D[0]) );
		struct.setList_OTHER_OVERHEADS_D(TypeConverter.convert(OTHER_OVERHEADS_D));
		struct.setSERVICE_COST_W( ((SERVICE_COST_W == null) ? (String)null : SERVICE_COST_W[0]) );
		struct.setList_SERVICE_COST_W(TypeConverter.convert(SERVICE_COST_W));
		struct.setSERVICE_COST_T( ((SERVICE_COST_T == null) ? (String)null : SERVICE_COST_T[0]) );
		struct.setList_SERVICE_COST_T(TypeConverter.convert(SERVICE_COST_T));
		struct.setSERVICE_COST_P( ((SERVICE_COST_P == null) ? (String)null : SERVICE_COST_P[0]) );
		struct.setList_SERVICE_COST_P(TypeConverter.convert(SERVICE_COST_P));
		struct.setSERVICE_COST_D( ((SERVICE_COST_D == null) ? (String)null : SERVICE_COST_D[0]) );
		struct.setList_SERVICE_COST_D(TypeConverter.convert(SERVICE_COST_D));
		struct.setPROFIT_RATIO_W( ((PROFIT_RATIO_W == null) ? (String)null : PROFIT_RATIO_W[0]) );
		struct.setList_PROFIT_RATIO_W(TypeConverter.convert(PROFIT_RATIO_W));
		struct.setPROFIT_RATIO_P( ((PROFIT_RATIO_P == null) ? (String)null : PROFIT_RATIO_P[0]) );
		struct.setList_PROFIT_RATIO_P(TypeConverter.convert(PROFIT_RATIO_P));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.setPROJECT_NAME( ((PROJECT_NAME == null) ? (String)null : PROJECT_NAME[0]) );
		struct.setList_PROJECT_NAME(TypeConverter.convert(PROJECT_NAME));
		struct.setTYP_NUM( ((TYP_NUM == null) ? (String)null : TYP_NUM[0]) );
		struct.setList_TYP_NUM(TypeConverter.convert(TYP_NUM));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		struct.setESTIMATE_NO( ((ESTIMATE_NO == null) ? (String)null : ESTIMATE_NO[0]) );
		struct.setList_ESTIMATE_NO(TypeConverter.convert(ESTIMATE_NO));
		struct.seth_DETAL_NO( ((h_DETAL_NO == null) ? (String)null : h_DETAL_NO[0]) );
		struct.setList_h_DETAL_NO(TypeConverter.convert(h_DETAL_NO));
		struct.seth_ES_COST_ETC( ((h_ES_COST_ETC == null) ? (String)null : h_ES_COST_ETC[0]) );
		struct.setList_h_ES_COST_ETC(TypeConverter.convert(h_ES_COST_ETC));
		struct.setPJ_MODIFY_COUNT( ((PJ_MODIFY_COUNT == null) ? (String)null : PJ_MODIFY_COUNT[0]) );
		struct.setList_PJ_MODIFY_COUNT(TypeConverter.convert(PJ_MODIFY_COUNT));
		struct.setl_JOB_ODR_CD( ((l_JOB_ODR_CD == null) ? (String)null : l_JOB_ODR_CD[0]) );
		struct.setList_l_JOB_ODR_CD(TypeConverter.convert(l_JOB_ODR_CD));
		struct.setl_JOB_ODR_CANCEL_NO( ((l_JOB_ODR_CANCEL_NO == null) ? (String)null : l_JOB_ODR_CANCEL_NO[0]) );
		struct.setList_l_JOB_ODR_CANCEL_NO(TypeConverter.convert(l_JOB_ODR_CANCEL_NO));
		struct.setl_PLANT_CD( ((l_PLANT_CD == null) ? (String)null : l_PLANT_CD[0]) );
		struct.setList_l_PLANT_CD(TypeConverter.convert(l_PLANT_CD));
		struct.seth_COST_PROGRESS( ((h_COST_PROGRESS == null) ? (String)null : h_COST_PROGRESS[0]) );
		struct.setList_h_COST_PROGRESS(TypeConverter.convert(h_COST_PROGRESS));
		struct.setl_ODR_AMOUNT( ((l_ODR_AMOUNT == null) ? (String)null : l_ODR_AMOUNT[0]) );
		struct.setList_l_ODR_AMOUNT(TypeConverter.convert(l_ODR_AMOUNT));
		struct.setl_ODR_QTY( ((l_ODR_QTY == null) ? (String)null : l_ODR_QTY[0]) );
		struct.setList_l_ODR_QTY(TypeConverter.convert(l_ODR_QTY));
		struct.setl_ODR_UNIT_PRICE( ((l_ODR_UNIT_PRICE == null) ? (String)null : l_ODR_UNIT_PRICE[0]) );
		struct.setList_l_ODR_UNIT_PRICE(TypeConverter.convert(l_ODR_UNIT_PRICE));
		struct.setITEM_TOTAL_COST_D2( ((ITEM_TOTAL_COST_D2 == null) ? (String)null : ITEM_TOTAL_COST_D2[0]) );
		struct.setList_ITEM_TOTAL_COST_D2(TypeConverter.convert(ITEM_TOTAL_COST_D2));
		struct.setMATERIAL_COST_D2( ((MATERIAL_COST_D2 == null) ? (String)null : MATERIAL_COST_D2[0]) );
		struct.setList_MATERIAL_COST_D2(TypeConverter.convert(MATERIAL_COST_D2));
		struct.setPROCESSING_COST_D2( ((PROCESSING_COST_D2 == null) ? (String)null : PROCESSING_COST_D2[0]) );
		struct.setList_PROCESSING_COST_D2(TypeConverter.convert(PROCESSING_COST_D2));
		struct.setSBCNT_COST_D2( ((SBCNT_COST_D2 == null) ? (String)null : SBCNT_COST_D2[0]) );
		struct.setList_SBCNT_COST_D2(TypeConverter.convert(SBCNT_COST_D2));
		struct.setOTHER_OVERHEADS_D2( ((OTHER_OVERHEADS_D2 == null) ? (String)null : OTHER_OVERHEADS_D2[0]) );
		struct.setList_OTHER_OVERHEADS_D2(TypeConverter.convert(OTHER_OVERHEADS_D2));
		struct.setSERVICE_COST_D2( ((SERVICE_COST_D2 == null) ? (String)null : SERVICE_COST_D2[0]) );
		struct.setList_SERVICE_COST_D2(TypeConverter.convert(SERVICE_COST_D2));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/KM0050010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aKM0050010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aKM0050010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					KM0050010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0050010Entity entity = control.entity;
		KM0050010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("KM0050010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		KM0050010Control control;
		KM0050010Entity  entity = null;
		KM0050010Struct  struct = null;

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

			if( (control = (KM0050010Control)so.getAttribute("KM0050010Control_"+request.getSession(false).getId())) == null ) {
				control = new KM0050010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new KM0050010Control();
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
				if( isClick(request, "TotalShow") ) {
					if ( !isCryptical(request, so, params, "TotalShow") ) return ERROR_TARGET;
					target = onClickTotalShow(request, response, so, params, control);
					control.setButton("TotalShow");
				} else if( isClick(request, "Recalculation") ) {
					if ( !isCryptical(request, so, params, "Recalculation") ) return ERROR_TARGET;
					target = onClickRecalculation(request, response, so, params, control);
					control.setButton("Recalculation");
				} else if( isClick(request, "Select") ) {
					if ( !isCryptical(request, so, params, "Select") ) return ERROR_TARGET;
					target = onClickSelect(request, response, so, params, control);
					control.setButton("Select");
				} else if( isClick(request, "OtherRegister") ) {
					if ( !isCryptical(request, so, params, "OtherRegister") ) return ERROR_TARGET;
					target = onClickOtherRegister(request, response, so, params, control);
					control.setButton("OtherRegister");
				} else if( isClick(request, "CSVOut") ) {
					if ( !isCryptical(request, so, params, "CSVOut") ) return ERROR_TARGET;
					target = onClickCSVOut(request, response, so, params, control);
					control.setButton("CSVOut");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else if( isClick(request, "JobOdrProgress") ) {
					if ( !isCryptical(request, so, params, "JobOdrProgress") ) return ERROR_TARGET;
					target = onClickJobOdrProgress(request, response, so, params, control);
					control.setButton("JobOdrProgress");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("KM0050010Control_"+request.getSession(false).getId(),control);

				//{{user_implement_dev:<eventHandling>
					// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
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
				if((isClick(request, "TotalShow") && bFLG_DISCONNECT_TotalShow)
				|| (isClick(request, "Recalculation") && bFLG_DISCONNECT_Recalculation)
				|| (isClick(request, "Select") && bFLG_DISCONNECT_Select)
				|| (isClick(request, "OtherRegister") && bFLG_DISCONNECT_OtherRegister)
				|| (isClick(request, "CSVOut") && bFLG_DISCONNECT_CSVOut)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "JobOdrProgress") && bFLG_DISCONNECT_JobOdrProgress)
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
	private  static boolean bFLG_DISCONNECT_TotalShow = true;
	private  static boolean bFLG_DISCONNECT_Recalculation = true;
	private  static boolean bFLG_DISCONNECT_Select = true;
	private  static boolean bFLG_DISCONNECT_OtherRegister = true;
	private  static boolean bFLG_DISCONNECT_CSVOut = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_JobOdrProgress = true;

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
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
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
		return "com.nec.jp.orteus.metamorBase.KM0050.KM0050010Servlet";
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
	public KM0050010Servlet()
	{
		//{{user_implement_dev:<KM0050010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_TotalShow = true;
		bFLG_DISCONNECT_Recalculation = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_OtherRegister = true;
		bFLG_DISCONNECT_CSVOut = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;

                //}}user_implement_dev:<KM0050010_DisConnect_FLG>

		//{{user_implement_dev:<KM0050010Servlet>
//			bFLG_CSRF = false; // CSRF�̂��߂̔�����s��Ȃ��ꍇ�́A�R�����g�A�E�g���͂����Ă�������

			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<KM0050010Servlet>
	}

	//////////////////////////////

}