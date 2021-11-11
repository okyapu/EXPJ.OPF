/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0020/src/com/nec/jp/orteus/metamorBase/KM0020/KM0020010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0020;

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
 * CLASS     : KM0020010Servlet �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class KM0020010Servlet extends HttpServlet
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
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, KM0020010Control control)
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
		String[] PROJECT_CD = (String[]) params.get("PROJECT_CD");
		control.settProjectCd((PROJECT_CD == null) ? null : PROJECT_CD[0]);
		
		String[] ESTIMATE_NO = (String[]) params.get("ESTIMATE_NO");
		control.setEstimateNo((ESTIMATE_NO == null) ? null : ESTIMATE_NO[0]);
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * ��ʋ��ʃp�����[�^�擾
	 * @param params  Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, KM0020010Control control)
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
	 * @param control KM0020010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
			logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			LogWriter.write( Level.ALL, "KM0020010"+" $Revision: 1.4 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control KM0020010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		try {
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			control.control_eventHandller("reload");
			if(control.isScreenMove()) {
                control.control_eventHandller("select");
                nextUrl = "/KM0020010.jsp";
            }
		} catch ( FoundationException e ) {
//			e.printStackTrace();
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("KM0020010-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * ���׍��v�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickTotal(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickTotal");
		//{{user_implement_dev:<onClickTotal>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Total");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickTotal>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickTotal");

		return nextUrl;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickappend(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickappend");
		//{{user_implement_dev:<onClickappend>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("append");
			// �q��ʂɑJ��
			if(control.getMessage().sizeError() <= 0){
	             nextUrl = "/KM0020011.jsp";
	        }
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickappend>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickappend");

		return nextUrl;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickmodify(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");
		//{{user_implement_dev:<onClickmodify>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("modify");
			// �q��ʂɑJ��
            nextUrl = "/KM0020011.jsp";
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickmodify>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");

		return nextUrl;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickerase(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickerase");
		//{{user_implement_dev:<onClickerase>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("erase");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickerase>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickerase");

		return nextUrl;
	}

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickprint(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickprint");
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
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickprint");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickinsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");
		//{{user_implement_dev:<onClickinsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("insert");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickinsert>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("update");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickdelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");
		//{{user_implement_dev:<onClickdelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("delete");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickdelete>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
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
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * �P���Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickSelectUnitCost(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/KM0020011.jsp";		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectUnitCost");
		//{{user_implement_dev:<onClickSelectUnitCost>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("SelectUnitCost");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelectUnitCost>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectUnitCost");

		return nextUrl;
	}

	/**
	 * �M�݊��Z�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickLcConversion(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/KM0020011.jsp";		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickLcConversion");
		//{{user_implement_dev:<onClickLcConversion>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("LcConversion");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLcConversion>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickLcConversion");

		return nextUrl;
	}

	/**
	 * �ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickinsertSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");
		//{{user_implement_dev:<onClickinsertSub1>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("insertSub1");
			// �G���[�����̏ꍇ�A�q��ʂɑJ��
            if(control.getMessage().sizeError() > 0){
             nextUrl = "/KM0020011.jsp";
            }
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickinsertSub1>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");

		return nextUrl;
	}

	/**
	 * �C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickupdateSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdateSub1");
		//{{user_implement_dev:<onClickupdateSub1>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("updateSub1");
			// �G���[�����̏ꍇ�A�q��ʂɑJ��
            if(control.getMessage().sizeError() > 0){
             nextUrl = "/KM0020011.jsp";
            }
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickupdateSub1>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdateSub1");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickcancelSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelSub1");
		//{{user_implement_dev:<onClickcancelSub1>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("cancelSub1");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickcancelSub1>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelSub1");

		return nextUrl;
	}

	/**
	 * ���p�Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickQ_Select(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickQ_Select");
		//{{user_implement_dev:<onClickQ_Select>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Q_Select");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickQ_Select>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickQ_Select");

		return nextUrl;
	}

	/**
	 * �s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0020010Control�N���X�C���X�^���X
	 */
	public String onClickcopy(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickcopy");
		//{{user_implement_dev:<onClickcopy>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("copy");
			// �q��ʂɑJ��
			if(control.getMessage().sizeError() <= 0){
				nextUrl = "/KM0020011.jsp";
			}
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickcopy>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickcopy");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, KM0020010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PROJECT_CD = ((params.containsKey("PROJECT_CD")) ? (String[])params.get("PROJECT_CD") : (String[])null);
		String[] PROJECT_NAME = ((params.containsKey("PROJECT_NAME")) ? (String[])params.get("PROJECT_NAME") : (String[])null);
		String[] ESTIMATE_NO = ((params.containsKey("ESTIMATE_NO")) ? (String[])params.get("ESTIMATE_NO") : (String[])null);
		String[] ESTIMATE_STAT = ((params.containsKey("ESTIMATE_STAT")) ? (String[])params.get("ESTIMATE_STAT") : (String[])null);
		String[] ES_COMMET1 = ((params.containsKey("ES_COMMET1")) ? (String[])params.get("ES_COMMET1") : (String[])null);
		String[] CUST_NAME = ((params.containsKey("CUST_NAME")) ? (String[])params.get("CUST_NAME") : (String[])null);
		String[] ES_COMMET2 = ((params.containsKey("ES_COMMET2")) ? (String[])params.get("ES_COMMET2") : (String[])null);
		String[] ESTIMATE_DATE = ((params.containsKey("ESTIMATE_DATE")) ? (String[])params.get("ESTIMATE_DATE") : (String[])null);
		String[] ES_COMMET4 = ((params.containsKey("ES_COMMET4")) ? (String[])params.get("ES_COMMET4") : (String[])null);
		String[] ESTIMATE_AMOUNT = ((params.containsKey("ESTIMATE_AMOUNT")) ? (String[])params.get("ESTIMATE_AMOUNT") : (String[])null);
		String[] CUR_UNIT = ((params.containsKey("CUR_UNIT")) ? (String[])params.get("CUR_UNIT") : (String[])null);
		String[] ES_COMMET3 = ((params.containsKey("ES_COMMET3")) ? (String[])params.get("ES_COMMET3") : (String[])null);
		String[] ESTIMATE_AMOUNT_JPN = ((params.containsKey("ESTIMATE_AMOUNT_JPN")) ? (String[])params.get("ESTIMATE_AMOUNT_JPN") : (String[])null);
		String[] ES_COMMET5 = ((params.containsKey("ES_COMMET5")) ? (String[])params.get("ES_COMMET5") : (String[])null);
		String[] ES_USER_CD = ((params.containsKey("ES_USER_CD")) ? (String[])params.get("ES_USER_CD") : (String[])null);
		String[] USER_NAME = ((params.containsKey("USER_NAME")) ? (String[])params.get("USER_NAME") : (String[])null);
		String[] ES_ORG_CD = ((params.containsKey("ES_ORG_CD")) ? (String[])params.get("ES_ORG_CD") : (String[])null);
		String[] ORG_NAME = ((params.containsKey("ORG_NAME")) ? (String[])params.get("ORG_NAME") : (String[])null);
		String[] ZIP_CD = ((params.containsKey("ZIP_CD")) ? (String[])params.get("ZIP_CD") : (String[])null);
		String[] TEL = ((params.containsKey("TEL")) ? (String[])params.get("TEL") : (String[])null);
		String[] ADDRESS_1 = ((params.containsKey("ADDRESS_1")) ? (String[])params.get("ADDRESS_1") : (String[])null);
		String[] ESREMARK1 = ((params.containsKey("ESREMARK1")) ? (String[])params.get("ESREMARK1") : (String[])null);
		String[] ESREMARK2 = ((params.containsKey("ESREMARK2")) ? (String[])params.get("ESREMARK2") : (String[])null);
		String[] ESREMARK3 = ((params.containsKey("ESREMARK3")) ? (String[])params.get("ESREMARK3") : (String[])null);
		String[] l_DETAL_NO = ((params.containsKey("l_DETAL_NO")) ? (String[])params.get("l_DETAL_NO") : (String[])null);
		String[] l_ITEM_NAME = ((params.containsKey("l_ITEM_NAME")) ? (String[])params.get("l_ITEM_NAME") : (String[])null);
		String[] l_DESINATED_DLV_DATE = ((params.containsKey("l_DESINATED_DLV_DATE")) ? (String[])params.get("l_DESINATED_DLV_DATE") : (String[])null);
		String[] l_ESTIMATE_QTY = ((params.containsKey("l_ESTIMATE_QTY")) ? (String[])params.get("l_ESTIMATE_QTY") : (String[])null);
		String[] l_UNIT_CD = ((params.containsKey("l_UNIT_CD")) ? (String[])params.get("l_UNIT_CD") : (String[])null);
		String[] l_UNIT_PRICE = ((params.containsKey("l_UNIT_PRICE")) ? (String[])params.get("l_UNIT_PRICE") : (String[])null);
		String[] l_DISCOUNT_PRICE = ((params.containsKey("l_DISCOUNT_PRICE")) ? (String[])params.get("l_DISCOUNT_PRICE") : (String[])null);
		String[] l_ESTIMATE_UNIT_PRICE = ((params.containsKey("l_ESTIMATE_UNIT_PRICE")) ? (String[])params.get("l_ESTIMATE_UNIT_PRICE") : (String[])null);
		String[] l_CUR_UNIT = ((params.containsKey("l_CUR_UNIT")) ? (String[])params.get("l_CUR_UNIT") : (String[])null);
		String[] l_AMOUNT = ((params.containsKey("l_AMOUNT")) ? (String[])params.get("l_AMOUNT") : (String[])null);
		String[] l_DISCOUNT_AMOUNT = ((params.containsKey("l_DISCOUNT_AMOUNT")) ? (String[])params.get("l_DISCOUNT_AMOUNT") : (String[])null);
		String[] l_ESTIMATE_AMOUNT = ((params.containsKey("l_ESTIMATE_AMOUNT")) ? (String[])params.get("l_ESTIMATE_AMOUNT") : (String[])null);
		String[] l_ESTIMATE_AMOUNT_JPN = ((params.containsKey("l_ESTIMATE_AMOUNT_JPN")) ? (String[])params.get("l_ESTIMATE_AMOUNT_JPN") : (String[])null);
		String[] l_ES_COST_ALL = ((params.containsKey("l_ES_COST_ALL")) ? (String[])params.get("l_ES_COST_ALL") : (String[])null);
		String[] l_ESTIMATE_GAIN = ((params.containsKey("l_ESTIMATE_GAIN")) ? (String[])params.get("l_ESTIMATE_GAIN") : (String[])null);
		String[] l_ES_COST_MATERIAL = ((params.containsKey("l_ES_COST_MATERIAL")) ? (String[])params.get("l_ES_COST_MATERIAL") : (String[])null);
		String[] l_ES_COST_PROCESS = ((params.containsKey("l_ES_COST_PROCESS")) ? (String[])params.get("l_ES_COST_PROCESS") : (String[])null);
		String[] l_ES_COST_OUTSOUCE = ((params.containsKey("l_ES_COST_OUTSOUCE")) ? (String[])params.get("l_ES_COST_OUTSOUCE") : (String[])null);
		String[] l_ES_COST_ETC = ((params.containsKey("l_ES_COST_ETC")) ? (String[])params.get("l_ES_COST_ETC") : (String[])null);
		String[] l_ES_COST_SERVICE = ((params.containsKey("l_ES_COST_SERVICE")) ? (String[])params.get("l_ES_COST_SERVICE") : (String[])null);
		String[] l_REMARKS = ((params.containsKey("l_REMARKS")) ? (String[])params.get("l_REMARKS") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] h_MAX_DETAL_NO = ((params.containsKey("h_MAX_DETAL_NO")) ? (String[])params.get("h_MAX_DETAL_NO") : (String[])null);
		String[] l_FLAG = ((params.containsKey("l_FLAG")) ? (String[])params.get("l_FLAG") : (String[])null);
		String[] QUOTE_PROJECT_CD = ((params.containsKey("QUOTE_PROJECT_CD")) ? (String[])params.get("QUOTE_PROJECT_CD") : (String[])null);
		String[] QUOTE_ESTIMATE_NO = ((params.containsKey("QUOTE_ESTIMATE_NO")) ? (String[])params.get("QUOTE_ESTIMATE_NO") : (String[])null);
		String[] h_CUST_CD = ((params.containsKey("h_CUST_CD")) ? (String[])params.get("h_CUST_CD") : (String[])null);
		String[] h_CUR_CD = ((params.containsKey("h_CUR_CD")) ? (String[])params.get("h_CUR_CD") : (String[])null);
		String[] ADDRESS_2 = ((params.containsKey("ADDRESS_2")) ? (String[])params.get("ADDRESS_2") : (String[])null);
		String[] l_CUST_ITEM_CD = ((params.containsKey("l_CUST_ITEM_CD")) ? (String[])params.get("l_CUST_ITEM_CD") : (String[])null);
		String[] l_UNIT_COST = ((params.containsKey("l_UNIT_COST")) ? (String[])params.get("l_UNIT_COST") : (String[])null);
		String[] l_CUST_ITEM_NAME = ((params.containsKey("l_CUST_ITEM_NAME")) ? (String[])params.get("l_CUST_ITEM_NAME") : (String[])null);
		String[] l_SPEC_CLASS1_TYP = ((params.containsKey("l_SPEC_CLASS1_TYP")) ? (String[])params.get("l_SPEC_CLASS1_TYP") : (String[])null);
		String[] l_SPEC_CLASS2_TYP = ((params.containsKey("l_SPEC_CLASS2_TYP")) ? (String[])params.get("l_SPEC_CLASS2_TYP") : (String[])null);
		String[] l_SPEC_SELECT1_TYP = ((params.containsKey("l_SPEC_SELECT1_TYP")) ? (String[])params.get("l_SPEC_SELECT1_TYP") : (String[])null);
		String[] l_SPEC_SELECT2_TYP = ((params.containsKey("l_SPEC_SELECT2_TYP")) ? (String[])params.get("l_SPEC_SELECT2_TYP") : (String[])null);
		String[] l_SPEC_SELECT3_TYP = ((params.containsKey("l_SPEC_SELECT3_TYP")) ? (String[])params.get("l_SPEC_SELECT3_TYP") : (String[])null);
		String[] l_SPEC_SELECT4_TYP = ((params.containsKey("l_SPEC_SELECT4_TYP")) ? (String[])params.get("l_SPEC_SELECT4_TYP") : (String[])null);
		String[] l_ESTIMATE_TYP = ((params.containsKey("l_ESTIMATE_TYP")) ? (String[])params.get("l_ESTIMATE_TYP") : (String[])null);
		String[] l_ESTIMATE_NAME = ((params.containsKey("l_ESTIMATE_NAME")) ? (String[])params.get("l_ESTIMATE_NAME") : (String[])null);
		String[] l_SPEC_CLASS1_NAME = ((params.containsKey("l_SPEC_CLASS1_NAME")) ? (String[])params.get("l_SPEC_CLASS1_NAME") : (String[])null);
		String[] l_SPEC_CLASS2_NAME = ((params.containsKey("l_SPEC_CLASS2_NAME")) ? (String[])params.get("l_SPEC_CLASS2_NAME") : (String[])null);
		String[] l_SPEC_SELECT1_NAME = ((params.containsKey("l_SPEC_SELECT1_NAME")) ? (String[])params.get("l_SPEC_SELECT1_NAME") : (String[])null);
		String[] l_SPEC_SELECT2_NAME = ((params.containsKey("l_SPEC_SELECT2_NAME")) ? (String[])params.get("l_SPEC_SELECT2_NAME") : (String[])null);
		String[] l_SPEC_SELECT3_NAME = ((params.containsKey("l_SPEC_SELECT3_NAME")) ? (String[])params.get("l_SPEC_SELECT3_NAME") : (String[])null);
		String[] l_SPEC_SELECT4_NAME = ((params.containsKey("l_SPEC_SELECT4_NAME")) ? (String[])params.get("l_SPEC_SELECT4_NAME") : (String[])null);
		String[] l_ESTIMATE_TYP_name = ((params.containsKey("l_ESTIMATE_TYP_name")) ? (String[])params.get("l_ESTIMATE_TYP_name") : (String[])null);
		String[] l_ESTIMATE_TYP_val = ((params.containsKey("l_ESTIMATE_TYP_val")) ? (String[])params.get("l_ESTIMATE_TYP_val") : (String[])null);
		String[] l_SPEC_CLASS1_TYP_name = ((params.containsKey("l_SPEC_CLASS1_TYP_name")) ? (String[])params.get("l_SPEC_CLASS1_TYP_name") : (String[])null);
		String[] l_SPEC_CLASS1_TYP_val = ((params.containsKey("l_SPEC_CLASS1_TYP_val")) ? (String[])params.get("l_SPEC_CLASS1_TYP_val") : (String[])null);
		String[] l_SPEC_CLASS2_TYP_name = ((params.containsKey("l_SPEC_CLASS2_TYP_name")) ? (String[])params.get("l_SPEC_CLASS2_TYP_name") : (String[])null);
		String[] l_SPEC_CLASS2_TYP_val = ((params.containsKey("l_SPEC_CLASS2_TYP_val")) ? (String[])params.get("l_SPEC_CLASS2_TYP_val") : (String[])null);
		String[] l_SPEC_SELECT1_TYP_name = ((params.containsKey("l_SPEC_SELECT1_TYP_name")) ? (String[])params.get("l_SPEC_SELECT1_TYP_name") : (String[])null);
		String[] l_SPEC_SELECT1_TYP_val = ((params.containsKey("l_SPEC_SELECT1_TYP_val")) ? (String[])params.get("l_SPEC_SELECT1_TYP_val") : (String[])null);
		String[] l_SPEC_SELECT2_TYP_name = ((params.containsKey("l_SPEC_SELECT2_TYP_name")) ? (String[])params.get("l_SPEC_SELECT2_TYP_name") : (String[])null);
		String[] l_SPEC_SELECT2_TYP_val = ((params.containsKey("l_SPEC_SELECT2_TYP_val")) ? (String[])params.get("l_SPEC_SELECT2_TYP_val") : (String[])null);
		String[] l_SPEC_SELECT3_TYP_name = ((params.containsKey("l_SPEC_SELECT3_TYP_name")) ? (String[])params.get("l_SPEC_SELECT3_TYP_name") : (String[])null);
		String[] l_SPEC_SELECT3_TYP_val = ((params.containsKey("l_SPEC_SELECT3_TYP_val")) ? (String[])params.get("l_SPEC_SELECT3_TYP_val") : (String[])null);
		String[] l_SPEC_SELECT4_TYP_name = ((params.containsKey("l_SPEC_SELECT4_TYP_name")) ? (String[])params.get("l_SPEC_SELECT4_TYP_name") : (String[])null);
		String[] l_SPEC_SELECT4_TYP_val = ((params.containsKey("l_SPEC_SELECT4_TYP_val")) ? (String[])params.get("l_SPEC_SELECT4_TYP_val") : (String[])null);
		String[] LIST_CNT = ((params.containsKey("LIST_CNT")) ? (String[])params.get("LIST_CNT") : (String[])null);
		String[] PROJECT_STAT = ((params.containsKey("PROJECT_STAT")) ? (String[])params.get("PROJECT_STAT") : (String[])null);
		String[] UNOFFICIAL_RECEIPT_FLG = ((params.containsKey("UNOFFICIAL_RECEIPT_FLG")) ? (String[])params.get("UNOFFICIAL_RECEIPT_FLG") : (String[])null);

		struct.setPROJECT_CD( ((PROJECT_CD == null) ? (String)null : PROJECT_CD[0]) );
		struct.setList_PROJECT_CD(TypeConverter.convert(PROJECT_CD));
		struct.setPROJECT_NAME( ((PROJECT_NAME == null) ? (String)null : PROJECT_NAME[0]) );
		struct.setList_PROJECT_NAME(TypeConverter.convert(PROJECT_NAME));
		struct.setESTIMATE_NO( ((ESTIMATE_NO == null) ? (String)null : ESTIMATE_NO[0]) );
		struct.setList_ESTIMATE_NO(TypeConverter.convert(ESTIMATE_NO));
		struct.setESTIMATE_STAT( ((ESTIMATE_STAT == null) ? (String)null : ESTIMATE_STAT[0]) );
		struct.setList_ESTIMATE_STAT(TypeConverter.convert(ESTIMATE_STAT));
		struct.setES_COMMET1( ((ES_COMMET1 == null) ? (String)null : ES_COMMET1[0]) );
		struct.setList_ES_COMMET1(TypeConverter.convert(ES_COMMET1));
		struct.setCUST_NAME( ((CUST_NAME == null) ? (String)null : CUST_NAME[0]) );
		struct.setList_CUST_NAME(TypeConverter.convert(CUST_NAME));
		struct.setES_COMMET2( ((ES_COMMET2 == null) ? (String)null : ES_COMMET2[0]) );
		struct.setList_ES_COMMET2(TypeConverter.convert(ES_COMMET2));
		struct.setESTIMATE_DATE( ((ESTIMATE_DATE == null) ? (String)null : ESTIMATE_DATE[0]) );
		struct.setList_ESTIMATE_DATE(TypeConverter.convert(ESTIMATE_DATE));
		struct.setES_COMMET4( ((ES_COMMET4 == null) ? (String)null : ES_COMMET4[0]) );
		struct.setList_ES_COMMET4(TypeConverter.convert(ES_COMMET4));
		struct.setESTIMATE_AMOUNT( ((ESTIMATE_AMOUNT == null) ? (String)null : ESTIMATE_AMOUNT[0]) );
		struct.setList_ESTIMATE_AMOUNT(TypeConverter.convert(ESTIMATE_AMOUNT));
		struct.setCUR_UNIT( ((CUR_UNIT == null) ? (String)null : CUR_UNIT[0]) );
		struct.setList_CUR_UNIT(TypeConverter.convert(CUR_UNIT));
		struct.setES_COMMET3( ((ES_COMMET3 == null) ? (String)null : ES_COMMET3[0]) );
		struct.setList_ES_COMMET3(TypeConverter.convert(ES_COMMET3));
		struct.setESTIMATE_AMOUNT_JPN( ((ESTIMATE_AMOUNT_JPN == null) ? (String)null : ESTIMATE_AMOUNT_JPN[0]) );
		struct.setList_ESTIMATE_AMOUNT_JPN(TypeConverter.convert(ESTIMATE_AMOUNT_JPN));
		struct.setES_COMMET5( ((ES_COMMET5 == null) ? (String)null : ES_COMMET5[0]) );
		struct.setList_ES_COMMET5(TypeConverter.convert(ES_COMMET5));
		struct.setES_USER_CD( ((ES_USER_CD == null) ? (String)null : ES_USER_CD[0]) );
		struct.setList_ES_USER_CD(TypeConverter.convert(ES_USER_CD));
		struct.setUSER_NAME( ((USER_NAME == null) ? (String)null : USER_NAME[0]) );
		struct.setList_USER_NAME(TypeConverter.convert(USER_NAME));
		struct.setES_ORG_CD( ((ES_ORG_CD == null) ? (String)null : ES_ORG_CD[0]) );
		struct.setList_ES_ORG_CD(TypeConverter.convert(ES_ORG_CD));
		struct.setORG_NAME( ((ORG_NAME == null) ? (String)null : ORG_NAME[0]) );
		struct.setList_ORG_NAME(TypeConverter.convert(ORG_NAME));
		struct.setZIP_CD( ((ZIP_CD == null) ? (String)null : ZIP_CD[0]) );
		struct.setList_ZIP_CD(TypeConverter.convert(ZIP_CD));
		struct.setTEL( ((TEL == null) ? (String)null : TEL[0]) );
		struct.setList_TEL(TypeConverter.convert(TEL));
		struct.setADDRESS_1( ((ADDRESS_1 == null) ? (String)null : ADDRESS_1[0]) );
		struct.setList_ADDRESS_1(TypeConverter.convert(ADDRESS_1));
		struct.setESREMARK1( ((ESREMARK1 == null) ? (String)null : ESREMARK1[0]) );
		struct.setList_ESREMARK1(TypeConverter.convert(ESREMARK1));
		struct.setESREMARK2( ((ESREMARK2 == null) ? (String)null : ESREMARK2[0]) );
		struct.setList_ESREMARK2(TypeConverter.convert(ESREMARK2));
		struct.setESREMARK3( ((ESREMARK3 == null) ? (String)null : ESREMARK3[0]) );
		struct.setList_ESREMARK3(TypeConverter.convert(ESREMARK3));
		struct.setl_DETAL_NO( ((l_DETAL_NO == null) ? (String)null : l_DETAL_NO[0]) );
		struct.setList_l_DETAL_NO(TypeConverter.convert(l_DETAL_NO));
		struct.setl_ITEM_NAME( ((l_ITEM_NAME == null) ? (String)null : l_ITEM_NAME[0]) );
		struct.setList_l_ITEM_NAME(TypeConverter.convert(l_ITEM_NAME));
		struct.setl_DESINATED_DLV_DATE( ((l_DESINATED_DLV_DATE == null) ? (String)null : l_DESINATED_DLV_DATE[0]) );
		struct.setList_l_DESINATED_DLV_DATE(TypeConverter.convert(l_DESINATED_DLV_DATE));
		struct.setl_ESTIMATE_QTY( ((l_ESTIMATE_QTY == null) ? (String)null : l_ESTIMATE_QTY[0]) );
		struct.setList_l_ESTIMATE_QTY(TypeConverter.convert(l_ESTIMATE_QTY));
		struct.setl_UNIT_CD( ((l_UNIT_CD == null) ? (String)null : l_UNIT_CD[0]) );
		struct.setList_l_UNIT_CD(TypeConverter.convert(l_UNIT_CD));
		struct.setl_UNIT_PRICE( ((l_UNIT_PRICE == null) ? (String)null : l_UNIT_PRICE[0]) );
		struct.setList_l_UNIT_PRICE(TypeConverter.convert(l_UNIT_PRICE));
		struct.setl_DISCOUNT_PRICE( ((l_DISCOUNT_PRICE == null) ? (String)null : l_DISCOUNT_PRICE[0]) );
		struct.setList_l_DISCOUNT_PRICE(TypeConverter.convert(l_DISCOUNT_PRICE));
		struct.setl_ESTIMATE_UNIT_PRICE( ((l_ESTIMATE_UNIT_PRICE == null) ? (String)null : l_ESTIMATE_UNIT_PRICE[0]) );
		struct.setList_l_ESTIMATE_UNIT_PRICE(TypeConverter.convert(l_ESTIMATE_UNIT_PRICE));
		struct.setl_CUR_UNIT( ((l_CUR_UNIT == null) ? (String)null : l_CUR_UNIT[0]) );
		struct.setList_l_CUR_UNIT(TypeConverter.convert(l_CUR_UNIT));
		struct.setl_AMOUNT( ((l_AMOUNT == null) ? (String)null : l_AMOUNT[0]) );
		struct.setList_l_AMOUNT(TypeConverter.convert(l_AMOUNT));
		struct.setl_DISCOUNT_AMOUNT( ((l_DISCOUNT_AMOUNT == null) ? (String)null : l_DISCOUNT_AMOUNT[0]) );
		struct.setList_l_DISCOUNT_AMOUNT(TypeConverter.convert(l_DISCOUNT_AMOUNT));
		struct.setl_ESTIMATE_AMOUNT( ((l_ESTIMATE_AMOUNT == null) ? (String)null : l_ESTIMATE_AMOUNT[0]) );
		struct.setList_l_ESTIMATE_AMOUNT(TypeConverter.convert(l_ESTIMATE_AMOUNT));
		struct.setl_ESTIMATE_AMOUNT_JPN( ((l_ESTIMATE_AMOUNT_JPN == null) ? (String)null : l_ESTIMATE_AMOUNT_JPN[0]) );
		struct.setList_l_ESTIMATE_AMOUNT_JPN(TypeConverter.convert(l_ESTIMATE_AMOUNT_JPN));
		struct.setl_ES_COST_ALL( ((l_ES_COST_ALL == null) ? (String)null : l_ES_COST_ALL[0]) );
		struct.setList_l_ES_COST_ALL(TypeConverter.convert(l_ES_COST_ALL));
		struct.setl_ESTIMATE_GAIN( ((l_ESTIMATE_GAIN == null) ? (String)null : l_ESTIMATE_GAIN[0]) );
		struct.setList_l_ESTIMATE_GAIN(TypeConverter.convert(l_ESTIMATE_GAIN));
		struct.setl_ES_COST_MATERIAL( ((l_ES_COST_MATERIAL == null) ? (String)null : l_ES_COST_MATERIAL[0]) );
		struct.setList_l_ES_COST_MATERIAL(TypeConverter.convert(l_ES_COST_MATERIAL));
		struct.setl_ES_COST_PROCESS( ((l_ES_COST_PROCESS == null) ? (String)null : l_ES_COST_PROCESS[0]) );
		struct.setList_l_ES_COST_PROCESS(TypeConverter.convert(l_ES_COST_PROCESS));
		struct.setl_ES_COST_OUTSOUCE( ((l_ES_COST_OUTSOUCE == null) ? (String)null : l_ES_COST_OUTSOUCE[0]) );
		struct.setList_l_ES_COST_OUTSOUCE(TypeConverter.convert(l_ES_COST_OUTSOUCE));
		struct.setl_ES_COST_ETC( ((l_ES_COST_ETC == null) ? (String)null : l_ES_COST_ETC[0]) );
		struct.setList_l_ES_COST_ETC(TypeConverter.convert(l_ES_COST_ETC));
		struct.setl_ES_COST_SERVICE( ((l_ES_COST_SERVICE == null) ? (String)null : l_ES_COST_SERVICE[0]) );
		struct.setList_l_ES_COST_SERVICE(TypeConverter.convert(l_ES_COST_SERVICE));
		struct.setl_REMARKS( ((l_REMARKS == null) ? (String)null : l_REMARKS[0]) );
		struct.setList_l_REMARKS(TypeConverter.convert(l_REMARKS));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.seth_MAX_DETAL_NO( ((h_MAX_DETAL_NO == null) ? (String)null : h_MAX_DETAL_NO[0]) );
		struct.setList_h_MAX_DETAL_NO(TypeConverter.convert(h_MAX_DETAL_NO));
		struct.setl_FLAG( ((l_FLAG == null) ? (String)null : l_FLAG[0]) );
		struct.setList_l_FLAG(TypeConverter.convert(l_FLAG));
		struct.setQUOTE_PROJECT_CD( ((QUOTE_PROJECT_CD == null) ? (String)null : QUOTE_PROJECT_CD[0]) );
		struct.setList_QUOTE_PROJECT_CD(TypeConverter.convert(QUOTE_PROJECT_CD));
		struct.setQUOTE_ESTIMATE_NO( ((QUOTE_ESTIMATE_NO == null) ? (String)null : QUOTE_ESTIMATE_NO[0]) );
		struct.setList_QUOTE_ESTIMATE_NO(TypeConverter.convert(QUOTE_ESTIMATE_NO));
		struct.seth_CUST_CD( ((h_CUST_CD == null) ? (String)null : h_CUST_CD[0]) );
		struct.setList_h_CUST_CD(TypeConverter.convert(h_CUST_CD));
		struct.seth_CUR_CD( ((h_CUR_CD == null) ? (String)null : h_CUR_CD[0]) );
		struct.setList_h_CUR_CD(TypeConverter.convert(h_CUR_CD));
		struct.setADDRESS_2( ((ADDRESS_2 == null) ? (String)null : ADDRESS_2[0]) );
		struct.setList_ADDRESS_2(TypeConverter.convert(ADDRESS_2));
		struct.setl_CUST_ITEM_CD( ((l_CUST_ITEM_CD == null) ? (String)null : l_CUST_ITEM_CD[0]) );
		struct.setList_l_CUST_ITEM_CD(TypeConverter.convert(l_CUST_ITEM_CD));
		struct.setl_UNIT_COST( ((l_UNIT_COST == null) ? (String)null : l_UNIT_COST[0]) );
		struct.setList_l_UNIT_COST(TypeConverter.convert(l_UNIT_COST));
		struct.setl_CUST_ITEM_NAME( ((l_CUST_ITEM_NAME == null) ? (String)null : l_CUST_ITEM_NAME[0]) );
		struct.setList_l_CUST_ITEM_NAME(TypeConverter.convert(l_CUST_ITEM_NAME));
		struct.setl_SPEC_CLASS1_TYP( ((l_SPEC_CLASS1_TYP == null) ? (String)null : l_SPEC_CLASS1_TYP[0]) );
		struct.setList_l_SPEC_CLASS1_TYP(TypeConverter.convert(l_SPEC_CLASS1_TYP));
		struct.setl_SPEC_CLASS2_TYP( ((l_SPEC_CLASS2_TYP == null) ? (String)null : l_SPEC_CLASS2_TYP[0]) );
		struct.setList_l_SPEC_CLASS2_TYP(TypeConverter.convert(l_SPEC_CLASS2_TYP));
		struct.setl_SPEC_SELECT1_TYP( ((l_SPEC_SELECT1_TYP == null) ? (String)null : l_SPEC_SELECT1_TYP[0]) );
		struct.setList_l_SPEC_SELECT1_TYP(TypeConverter.convert(l_SPEC_SELECT1_TYP));
		struct.setl_SPEC_SELECT2_TYP( ((l_SPEC_SELECT2_TYP == null) ? (String)null : l_SPEC_SELECT2_TYP[0]) );
		struct.setList_l_SPEC_SELECT2_TYP(TypeConverter.convert(l_SPEC_SELECT2_TYP));
		struct.setl_SPEC_SELECT3_TYP( ((l_SPEC_SELECT3_TYP == null) ? (String)null : l_SPEC_SELECT3_TYP[0]) );
		struct.setList_l_SPEC_SELECT3_TYP(TypeConverter.convert(l_SPEC_SELECT3_TYP));
		struct.setl_SPEC_SELECT4_TYP( ((l_SPEC_SELECT4_TYP == null) ? (String)null : l_SPEC_SELECT4_TYP[0]) );
		struct.setList_l_SPEC_SELECT4_TYP(TypeConverter.convert(l_SPEC_SELECT4_TYP));
		struct.setl_ESTIMATE_TYP( ((l_ESTIMATE_TYP == null) ? (String)null : l_ESTIMATE_TYP[0]) );
		struct.setList_l_ESTIMATE_TYP(TypeConverter.convert(l_ESTIMATE_TYP));
		struct.setl_ESTIMATE_NAME( ((l_ESTIMATE_NAME == null) ? (String)null : l_ESTIMATE_NAME[0]) );
		struct.setList_l_ESTIMATE_NAME(TypeConverter.convert(l_ESTIMATE_NAME));
		struct.setl_SPEC_CLASS1_NAME( ((l_SPEC_CLASS1_NAME == null) ? (String)null : l_SPEC_CLASS1_NAME[0]) );
		struct.setList_l_SPEC_CLASS1_NAME(TypeConverter.convert(l_SPEC_CLASS1_NAME));
		struct.setl_SPEC_CLASS2_NAME( ((l_SPEC_CLASS2_NAME == null) ? (String)null : l_SPEC_CLASS2_NAME[0]) );
		struct.setList_l_SPEC_CLASS2_NAME(TypeConverter.convert(l_SPEC_CLASS2_NAME));
		struct.setl_SPEC_SELECT1_NAME( ((l_SPEC_SELECT1_NAME == null) ? (String)null : l_SPEC_SELECT1_NAME[0]) );
		struct.setList_l_SPEC_SELECT1_NAME(TypeConverter.convert(l_SPEC_SELECT1_NAME));
		struct.setl_SPEC_SELECT2_NAME( ((l_SPEC_SELECT2_NAME == null) ? (String)null : l_SPEC_SELECT2_NAME[0]) );
		struct.setList_l_SPEC_SELECT2_NAME(TypeConverter.convert(l_SPEC_SELECT2_NAME));
		struct.setl_SPEC_SELECT3_NAME( ((l_SPEC_SELECT3_NAME == null) ? (String)null : l_SPEC_SELECT3_NAME[0]) );
		struct.setList_l_SPEC_SELECT3_NAME(TypeConverter.convert(l_SPEC_SELECT3_NAME));
		struct.setl_SPEC_SELECT4_NAME( ((l_SPEC_SELECT4_NAME == null) ? (String)null : l_SPEC_SELECT4_NAME[0]) );
		struct.setList_l_SPEC_SELECT4_NAME(TypeConverter.convert(l_SPEC_SELECT4_NAME));
		struct.setl_ESTIMATE_TYP_name( ((l_ESTIMATE_TYP_name == null) ? (String)null : l_ESTIMATE_TYP_name[0]) );
		struct.setList_l_ESTIMATE_TYP_name(TypeConverter.convert(l_ESTIMATE_TYP_name));
		struct.setl_ESTIMATE_TYP_val( ((l_ESTIMATE_TYP_val == null) ? (String)null : l_ESTIMATE_TYP_val[0]) );
		struct.setList_l_ESTIMATE_TYP_val(TypeConverter.convert(l_ESTIMATE_TYP_val));
		struct.setl_SPEC_CLASS1_TYP_name( ((l_SPEC_CLASS1_TYP_name == null) ? (String)null : l_SPEC_CLASS1_TYP_name[0]) );
		struct.setList_l_SPEC_CLASS1_TYP_name(TypeConverter.convert(l_SPEC_CLASS1_TYP_name));
		struct.setl_SPEC_CLASS1_TYP_val( ((l_SPEC_CLASS1_TYP_val == null) ? (String)null : l_SPEC_CLASS1_TYP_val[0]) );
		struct.setList_l_SPEC_CLASS1_TYP_val(TypeConverter.convert(l_SPEC_CLASS1_TYP_val));
		struct.setl_SPEC_CLASS2_TYP_name( ((l_SPEC_CLASS2_TYP_name == null) ? (String)null : l_SPEC_CLASS2_TYP_name[0]) );
		struct.setList_l_SPEC_CLASS2_TYP_name(TypeConverter.convert(l_SPEC_CLASS2_TYP_name));
		struct.setl_SPEC_CLASS2_TYP_val( ((l_SPEC_CLASS2_TYP_val == null) ? (String)null : l_SPEC_CLASS2_TYP_val[0]) );
		struct.setList_l_SPEC_CLASS2_TYP_val(TypeConverter.convert(l_SPEC_CLASS2_TYP_val));
		struct.setl_SPEC_SELECT1_TYP_name( ((l_SPEC_SELECT1_TYP_name == null) ? (String)null : l_SPEC_SELECT1_TYP_name[0]) );
		struct.setList_l_SPEC_SELECT1_TYP_name(TypeConverter.convert(l_SPEC_SELECT1_TYP_name));
		struct.setl_SPEC_SELECT1_TYP_val( ((l_SPEC_SELECT1_TYP_val == null) ? (String)null : l_SPEC_SELECT1_TYP_val[0]) );
		struct.setList_l_SPEC_SELECT1_TYP_val(TypeConverter.convert(l_SPEC_SELECT1_TYP_val));
		struct.setl_SPEC_SELECT2_TYP_name( ((l_SPEC_SELECT2_TYP_name == null) ? (String)null : l_SPEC_SELECT2_TYP_name[0]) );
		struct.setList_l_SPEC_SELECT2_TYP_name(TypeConverter.convert(l_SPEC_SELECT2_TYP_name));
		struct.setl_SPEC_SELECT2_TYP_val( ((l_SPEC_SELECT2_TYP_val == null) ? (String)null : l_SPEC_SELECT2_TYP_val[0]) );
		struct.setList_l_SPEC_SELECT2_TYP_val(TypeConverter.convert(l_SPEC_SELECT2_TYP_val));
		struct.setl_SPEC_SELECT3_TYP_name( ((l_SPEC_SELECT3_TYP_name == null) ? (String)null : l_SPEC_SELECT3_TYP_name[0]) );
		struct.setList_l_SPEC_SELECT3_TYP_name(TypeConverter.convert(l_SPEC_SELECT3_TYP_name));
		struct.setl_SPEC_SELECT3_TYP_val( ((l_SPEC_SELECT3_TYP_val == null) ? (String)null : l_SPEC_SELECT3_TYP_val[0]) );
		struct.setList_l_SPEC_SELECT3_TYP_val(TypeConverter.convert(l_SPEC_SELECT3_TYP_val));
		struct.setl_SPEC_SELECT4_TYP_name( ((l_SPEC_SELECT4_TYP_name == null) ? (String)null : l_SPEC_SELECT4_TYP_name[0]) );
		struct.setList_l_SPEC_SELECT4_TYP_name(TypeConverter.convert(l_SPEC_SELECT4_TYP_name));
		struct.setl_SPEC_SELECT4_TYP_val( ((l_SPEC_SELECT4_TYP_val == null) ? (String)null : l_SPEC_SELECT4_TYP_val[0]) );
		struct.setList_l_SPEC_SELECT4_TYP_val(TypeConverter.convert(l_SPEC_SELECT4_TYP_val));
		struct.setLIST_CNT( ((LIST_CNT == null) ? (String)null : LIST_CNT[0]) );
		struct.setList_LIST_CNT(TypeConverter.convert(LIST_CNT));
		struct.setPROJECT_STAT( ((PROJECT_STAT == null) ? (String)null : PROJECT_STAT[0]) );
		struct.setList_PROJECT_STAT(TypeConverter.convert(PROJECT_STAT));
		struct.setUNOFFICIAL_RECEIPT_FLG( ((UNOFFICIAL_RECEIPT_FLG == null) ? (String)null : UNOFFICIAL_RECEIPT_FLG[0]) );
		struct.setList_UNOFFICIAL_RECEIPT_FLG(TypeConverter.convert(UNOFFICIAL_RECEIPT_FLG));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/KM0020010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aKM0020010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aKM0020010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					KM0020010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		KM0020010Control control;
		KM0020010Entity  entity = null;
		KM0020010Struct  struct = null;

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

			if( (control = (KM0020010Control)so.getAttribute("KM0020010Control_"+request.getSession(false).getId())) == null ) {
				control = new KM0020010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new KM0020010Control();
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
				if( isClick(request, "Select") ) {
					if ( !isCryptical(request, so, params, "Select") ) return ERROR_TARGET;
					target = onClickSelect(request, response, so, params, control);
					control.setButton("Select");
				} else if( isClick(request, "Total") ) {
					if ( !isCryptical(request, so, params, "Total") ) return ERROR_TARGET;
					target = onClickTotal(request, response, so, params, control);
					control.setButton("Total");
				} else if( isClick(request, "append") ) {
					if ( !isCryptical(request, so, params, "append") ) return ERROR_TARGET;
					target = onClickappend(request, response, so, params, control);
					control.setButton("append");
				} else if( isClick(request, "modify") ) {
					if ( !isCryptical(request, so, params, "modify") ) return ERROR_TARGET;
					target = onClickmodify(request, response, so, params, control);
					control.setButton("modify");
				} else if( isClick(request, "erase") ) {
					if ( !isCryptical(request, so, params, "erase") ) return ERROR_TARGET;
					target = onClickerase(request, response, so, params, control);
					control.setButton("erase");
				} else if( isClick(request, "print") ) {
					if ( !isCryptical(request, so, params, "print") ) return ERROR_TARGET;
					target = onClickprint(request, response, so, params, control);
					control.setButton("print");
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
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else if( isClick(request, "SelectUnitCost") ) {
					if ( !isCryptical(request, so, params, "SelectUnitCost") ) return ERROR_TARGET;
					target = onClickSelectUnitCost(request, response, so, params, control);
					control.setButton("SelectUnitCost");
				} else if( isClick(request, "LcConversion") ) {
					if ( !isCryptical(request, so, params, "LcConversion") ) return ERROR_TARGET;
					target = onClickLcConversion(request, response, so, params, control);
					control.setButton("LcConversion");
				} else if( isClick(request, "insertSub1") ) {
					if ( !isCryptical(request, so, params, "insertSub1") ) return ERROR_TARGET;
					target = onClickinsertSub1(request, response, so, params, control);
					control.setButton("insertSub1");
				} else if( isClick(request, "updateSub1") ) {
					if ( !isCryptical(request, so, params, "updateSub1") ) return ERROR_TARGET;
					target = onClickupdateSub1(request, response, so, params, control);
					control.setButton("updateSub1");
				} else if( isClick(request, "cancelSub1") ) {
					if ( !isCryptical(request, so, params, "cancelSub1") ) return ERROR_TARGET;
					target = onClickcancelSub1(request, response, so, params, control);
					control.setButton("cancelSub1");
				} else if( isClick(request, "Q_Select") ) {
					if ( !isCryptical(request, so, params, "Q_Select") ) return ERROR_TARGET;
					target = onClickQ_Select(request, response, so, params, control);
					control.setButton("Q_Select");
				} else if( isClick(request, "copy") ) {
					if ( !isCryptical(request, so, params, "copy") ) return ERROR_TARGET;
					target = onClickcopy(request, response, so, params, control);
					control.setButton("copy");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("KM0020010Control_"+request.getSession(false).getId(),control);

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
				if((isClick(request, "Select") && bFLG_DISCONNECT_Select)
				|| (isClick(request, "Total") && bFLG_DISCONNECT_Total)
				|| (isClick(request, "append") && bFLG_DISCONNECT_append)
				|| (isClick(request, "modify") && bFLG_DISCONNECT_modify)
				|| (isClick(request, "erase") && bFLG_DISCONNECT_erase)
				|| (isClick(request, "print") && bFLG_DISCONNECT_print)
				|| (isClick(request, "insert") && bFLG_DISCONNECT_insert)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "delete") && bFLG_DISCONNECT_delete)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "SelectUnitCost") && bFLG_DISCONNECT_SelectUnitCost)
				|| (isClick(request, "LcConversion") && bFLG_DISCONNECT_LcConversion)
				|| (isClick(request, "insertSub1") && bFLG_DISCONNECT_insertSub1)
				|| (isClick(request, "updateSub1") && bFLG_DISCONNECT_updateSub1)
				|| (isClick(request, "cancelSub1") && bFLG_DISCONNECT_cancelSub1)
				|| (isClick(request, "Q_Select") && bFLG_DISCONNECT_Q_Select)
				|| (isClick(request, "copy") && bFLG_DISCONNECT_copy)
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
	private  static boolean bFLG_DISCONNECT_Select = true;
	private  static boolean bFLG_DISCONNECT_Total = true;
	private  static boolean bFLG_DISCONNECT_append = true;
	private  static boolean bFLG_DISCONNECT_modify = true;
	private  static boolean bFLG_DISCONNECT_erase = true;
	private  static boolean bFLG_DISCONNECT_print = true;
	private  static boolean bFLG_DISCONNECT_insert = true;
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_delete = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_SelectUnitCost = true;
	private  static boolean bFLG_DISCONNECT_LcConversion = true;
	private  static boolean bFLG_DISCONNECT_insertSub1 = true;
	private  static boolean bFLG_DISCONNECT_updateSub1 = true;
	private  static boolean bFLG_DISCONNECT_cancelSub1 = true;
	private  static boolean bFLG_DISCONNECT_Q_Select = true;
	private  static boolean bFLG_DISCONNECT_copy = true;

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
		return "com.nec.jp.orteus.metamorBase.KM0020.KM0020010Servlet";
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
	public KM0020010Servlet()
	{
		//{{user_implement_dev:<KM0020010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_Total = true;
		bFLG_DISCONNECT_append = true;
		bFLG_DISCONNECT_modify = true;
		bFLG_DISCONNECT_erase = true;
		bFLG_DISCONNECT_print = true;
		bFLG_DISCONNECT_insert = true;
		bFLG_DISCONNECT_update = true;
		bFLG_DISCONNECT_delete = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;
		bFLG_DISCONNECT_SelectUnitCost = true;
		bFLG_DISCONNECT_LcConversion = true;
		bFLG_DISCONNECT_insertSub1 = true;
		bFLG_DISCONNECT_updateSub1 = true;
		bFLG_DISCONNECT_cancelSub1 = true;

                //}}user_implement_dev:<KM0020010_DisConnect_FLG>

		//{{user_implement_dev:<KM0020010Servlet>
//			bFLG_CSRF = false; // CSRF�̂��߂̔�����s��Ȃ��ꍇ�́A�R�����g�A�E�g���͂����Ă�������

			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<KM0020010Servlet>
	}

	//////////////////////////////

}
