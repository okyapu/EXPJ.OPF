/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0030/src/com/nec/jp/orteus/metamorBase/KM0030/KM0030010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0030;

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
 * CLASS     : KM0030010Servlet �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class KM0030010Servlet extends HttpServlet
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
	 * @param control KM0030010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, KM0030010Control control)
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
	 * @param control KM0030010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, KM0030010Control control)
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
	 * @param control KM0030010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
			logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			LogWriter.write( Level.ALL, "KM0030010"+" $Revision: 1.2 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control KM0030010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("KM0030010-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0030010Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * �C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0030010Control�N���X�C���X�^���X
	 */
	public String onClickModify(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickModify");
		//{{user_implement_dev:<onClickModify>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Modify");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickModify>
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickModify");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0030010Control�N���X�C���X�^���X
	 */
	public String onClickInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");
		//{{user_implement_dev:<onClickInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Insert");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickInsert>
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0030010Control�N���X�C���X�^���X
	 */
	public String onClickUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");
		//{{user_implement_dev:<onClickUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Update");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdate>
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");

		return nextUrl;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0030010Control�N���X�C���X�^���X
	 */
	public String onClickDelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickDelete");
		//{{user_implement_dev:<onClickDelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Delete");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickDelete>
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickDelete");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0030010Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0030010Control�N���X�C���X�^���X
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
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
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, KM0030010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PROJECT_CD = ((params.containsKey("PROJECT_CD")) ? (String[])params.get("PROJECT_CD") : (String[])null);
		String[] PROJECT_NAME = ((params.containsKey("PROJECT_NAME")) ? (String[])params.get("PROJECT_NAME") : (String[])null);
		String[] ESTIMATE_NO = ((params.containsKey("ESTIMATE_NO")) ? (String[])params.get("ESTIMATE_NO") : (String[])null);
		String[] CUST_NAME = ((params.containsKey("CUST_NAME")) ? (String[])params.get("CUST_NAME") : (String[])null);
		String[] rdoSHIP_INST = ((params.containsKey("rdoSHIP_INST")) ? (String[])params.get("rdoSHIP_INST") : (String[])null);
		String[] rdoSHIP_UPDATE = ((params.containsKey("rdoSHIP_UPDATE")) ? (String[])params.get("rdoSHIP_UPDATE") : (String[])null);
		String[] l_DETAL_NO = ((params.containsKey("l_DETAL_NO")) ? (String[])params.get("l_DETAL_NO") : (String[])null);
		String[] l_ODR_NO = ((params.containsKey("l_ODR_NO")) ? (String[])params.get("l_ODR_NO") : (String[])null);
		String[] l_ODR_TYP = ((params.containsKey("l_ODR_TYP")) ? (String[])params.get("l_ODR_TYP") : (String[])null);
		String[] l_CUST_ODR_NO = ((params.containsKey("l_CUST_ODR_NO")) ? (String[])params.get("l_CUST_ODR_NO") : (String[])null);
		String[] l_CUST_ITEM_CD = ((params.containsKey("l_CUST_ITEM_CD")) ? (String[])params.get("l_CUST_ITEM_CD") : (String[])null);
		String[] l_ITEM_CD = ((params.containsKey("l_ITEM_CD")) ? (String[])params.get("l_ITEM_CD") : (String[])null);
		String[] l_DESINATED_DLV_DATE = ((params.containsKey("l_DESINATED_DLV_DATE")) ? (String[])params.get("l_DESINATED_DLV_DATE") : (String[])null);
		String[] l_ESTIMATE_QTY = ((params.containsKey("l_ESTIMATE_QTY")) ? (String[])params.get("l_ESTIMATE_QTY") : (String[])null);
		String[] l_CUR_UNIT = ((params.containsKey("l_CUR_UNIT")) ? (String[])params.get("l_CUR_UNIT") : (String[])null);
		String[] DETAIL_NO = ((params.containsKey("DETAIL_NO")) ? (String[])params.get("DETAIL_NO") : (String[])null);
		String[] ODR_ACPT_DATE = ((params.containsKey("ODR_ACPT_DATE")) ? (String[])params.get("ODR_ACPT_DATE") : (String[])null);
		String[] ACPT_ODR_CD = ((params.containsKey("ACPT_ODR_CD")) ? (String[])params.get("ACPT_ODR_CD") : (String[])null);
		String[] c_DOODR = ((params.containsKey("c_DOODR")) ? (String[])params.get("c_DOODR") : (String[])null);
		String[] ODR_TYP = ((params.containsKey("ODR_TYP")) ? (String[])params.get("ODR_TYP") : (String[])null);
		String[] PREPARE_QTY = ((params.containsKey("PREPARE_QTY")) ? (String[])params.get("PREPARE_QTY") : (String[])null);
		String[] CUST_ODR_NO = ((params.containsKey("CUST_ODR_NO")) ? (String[])params.get("CUST_ODR_NO") : (String[])null);
		String[] JOB_ODR_DLV_DATE = ((params.containsKey("JOB_ODR_DLV_DATE")) ? (String[])params.get("JOB_ODR_DLV_DATE") : (String[])null);
		String[] DESINATED_DLV_DATE = ((params.containsKey("DESINATED_DLV_DATE")) ? (String[])params.get("DESINATED_DLV_DATE") : (String[])null);
		String[] ALC_GRP_CD = ((params.containsKey("ALC_GRP_CD")) ? (String[])params.get("ALC_GRP_CD") : (String[])null);
		String[] DLV_LOC_CD = ((params.containsKey("DLV_LOC_CD")) ? (String[])params.get("DLV_LOC_CD") : (String[])null);
		String[] c_INPUTODRCD = ((params.containsKey("c_INPUTODRCD")) ? (String[])params.get("c_INPUTODRCD") : (String[])null);
		String[] ESTIMATE_TYPE = ((params.containsKey("ESTIMATE_TYPE")) ? (String[])params.get("ESTIMATE_TYPE") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] CUST_ITEM_CD = ((params.containsKey("CUST_ITEM_CD")) ? (String[])params.get("CUST_ITEM_CD") : (String[])null);
		String[] CUST_ITEM_NAME = ((params.containsKey("CUST_ITEM_NAME")) ? (String[])params.get("CUST_ITEM_NAME") : (String[])null);
		String[] QTY = ((params.containsKey("QTY")) ? (String[])params.get("QTY") : (String[])null);
		String[] QTY_UNIT = ((params.containsKey("QTY_UNIT")) ? (String[])params.get("QTY_UNIT") : (String[])null);
		String[] ODR_UNIT_PRICE = ((params.containsKey("ODR_UNIT_PRICE")) ? (String[])params.get("ODR_UNIT_PRICE") : (String[])null);
		String[] ODR_PRICE_UNIT = ((params.containsKey("ODR_PRICE_UNIT")) ? (String[])params.get("ODR_PRICE_UNIT") : (String[])null);
		String[] ODR_AMOUNT = ((params.containsKey("ODR_AMOUNT")) ? (String[])params.get("ODR_AMOUNT") : (String[])null);
		String[] ODR_AMOUNT_EXCH_RATES = ((params.containsKey("ODR_AMOUNT_EXCH_RATES")) ? (String[])params.get("ODR_AMOUNT_EXCH_RATES") : (String[])null);
		String[] ISSUE_INST_COMMENT = ((params.containsKey("ISSUE_INST_COMMENT")) ? (String[])params.get("ISSUE_INST_COMMENT") : (String[])null);
		String[] APPROVED_COMMENT = ((params.containsKey("APPROVED_COMMENT")) ? (String[])params.get("APPROVED_COMMENT") : (String[])null);
		String[] CUST_CHRG_PSN_CD = ((params.containsKey("CUST_CHRG_PSN_CD")) ? (String[])params.get("CUST_CHRG_PSN_CD") : (String[])null);
		String[] CUST_CHRG_PSN_NAME = ((params.containsKey("CUST_CHRG_PSN_NAME")) ? (String[])params.get("CUST_CHRG_PSN_NAME") : (String[])null);
		String[] ES_ORG_CD = ((params.containsKey("ES_ORG_CD")) ? (String[])params.get("ES_ORG_CD") : (String[])null);
		String[] ES_ORG_NAME = ((params.containsKey("ES_ORG_NAME")) ? (String[])params.get("ES_ORG_NAME") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] l_UNIT_CD = ((params.containsKey("l_UNIT_CD")) ? (String[])params.get("l_UNIT_CD") : (String[])null);
		String[] l_ESTIMATE_UNIT_PRICE = ((params.containsKey("l_ESTIMATE_UNIT_PRICE")) ? (String[])params.get("l_ESTIMATE_UNIT_PRICE") : (String[])null);
		String[] l_ODR_AMOUNT = ((params.containsKey("l_ODR_AMOUNT")) ? (String[])params.get("l_ODR_AMOUNT") : (String[])null);
		String[] l_ODR_AMOUNT_EXCH_RATES = ((params.containsKey("l_ODR_AMOUNT_EXCH_RATES")) ? (String[])params.get("l_ODR_AMOUNT_EXCH_RATES") : (String[])null);
		String[] l_DLV_LOC_CD = ((params.containsKey("l_DLV_LOC_CD")) ? (String[])params.get("l_DLV_LOC_CD") : (String[])null);
		String[] l_DLV_LOC_NAME = ((params.containsKey("l_DLV_LOC_NAME")) ? (String[])params.get("l_DLV_LOC_NAME") : (String[])null);
		String[] l_DEPO_TYP = ((params.containsKey("l_DEPO_TYP")) ? (String[])params.get("l_DEPO_TYP") : (String[])null);
		String[] l_CUST_ITEM_NAME = ((params.containsKey("l_CUST_ITEM_NAME")) ? (String[])params.get("l_CUST_ITEM_NAME") : (String[])null);
		String[] l_ITEM_NAME = ((params.containsKey("l_ITEM_NAME")) ? (String[])params.get("l_ITEM_NAME") : (String[])null);
		String[] l_ODR_ACPT_DATE = ((params.containsKey("l_ODR_ACPT_DATE")) ? (String[])params.get("l_ODR_ACPT_DATE") : (String[])null);
		String[] l_JOB_ODR_DLV_DATE = ((params.containsKey("l_JOB_ODR_DLV_DATE")) ? (String[])params.get("l_JOB_ODR_DLV_DATE") : (String[])null);
		String[] l_ALC_GRP_CD = ((params.containsKey("l_ALC_GRP_CD")) ? (String[])params.get("l_ALC_GRP_CD") : (String[])null);
		String[] l_JOB_ODR_CD = ((params.containsKey("l_JOB_ODR_CD")) ? (String[])params.get("l_JOB_ODR_CD") : (String[])null);
		String[] l_REMARKS = ((params.containsKey("l_REMARKS")) ? (String[])params.get("l_REMARKS") : (String[])null);
		String[] l_APPR_REMARKS = ((params.containsKey("l_APPR_REMARKS")) ? (String[])params.get("l_APPR_REMARKS") : (String[])null);
		String[] l_CUST_CHRG_PSN_NAME = ((params.containsKey("l_CUST_CHRG_PSN_NAME")) ? (String[])params.get("l_CUST_CHRG_PSN_NAME") : (String[])null);
		String[] l_CUST_CHRG_ORG_NAME = ((params.containsKey("l_CUST_CHRG_ORG_NAME")) ? (String[])params.get("l_CUST_CHRG_ORG_NAME") : (String[])null);
		String[] l_ESTIMATE_TYPE = ((params.containsKey("l_ESTIMATE_TYPE")) ? (String[])params.get("l_ESTIMATE_TYPE") : (String[])null);
		String[] l_ESTIMATE_ITEM_NAME = ((params.containsKey("l_ESTIMATE_ITEM_NAME")) ? (String[])params.get("l_ESTIMATE_ITEM_NAME") : (String[])null);
		String[] l_ODR_QTY = ((params.containsKey("l_ODR_QTY")) ? (String[])params.get("l_ODR_QTY") : (String[])null);
		String[] CUST_CD = ((params.containsKey("CUST_CD")) ? (String[])params.get("CUST_CD") : (String[])null);
		String[] h_UPDATE_FLG = ((params.containsKey("h_UPDATE_FLG")) ? (String[])params.get("h_UPDATE_FLG") : (String[])null);
		String[] l_TODR_MODIFY_COUNT = ((params.containsKey("l_TODR_MODIFY_COUNT")) ? (String[])params.get("l_TODR_MODIFY_COUNT") : (String[])null);
		String[] l_TEST_MODIFY_COUNT = ((params.containsKey("l_TEST_MODIFY_COUNT")) ? (String[])params.get("l_TEST_MODIFY_COUNT") : (String[])null);
		String[] l_TPJ_MODIFY_COUNT = ((params.containsKey("l_TPJ_MODIFY_COUNT")) ? (String[])params.get("l_TPJ_MODIFY_COUNT") : (String[])null);
		String[] l_h_ESTIMATE_TYPE = ((params.containsKey("l_h_ESTIMATE_TYPE")) ? (String[])params.get("l_h_ESTIMATE_TYPE") : (String[])null);
		String[] h_ESTIMATE_TYPE = ((params.containsKey("h_ESTIMATE_TYPE")) ? (String[])params.get("h_ESTIMATE_TYPE") : (String[])null);
		String[] l_h_PREC_ARRANGE_FLG = ((params.containsKey("l_h_PREC_ARRANGE_FLG")) ? (String[])params.get("l_h_PREC_ARRANGE_FLG") : (String[])null);
		String[] l_c_DOODR = ((params.containsKey("l_c_DOODR")) ? (String[])params.get("l_c_DOODR") : (String[])null);
		String[] l_c_INPUTODRCD = ((params.containsKey("l_c_INPUTODRCD")) ? (String[])params.get("l_c_INPUTODRCD") : (String[])null);
		String[] h_PREC_ARRANGE_FLG = ((params.containsKey("h_PREC_ARRANGE_FLG")) ? (String[])params.get("h_PREC_ARRANGE_FLG") : (String[])null);
		String[] l_h_ODR_TYP = ((params.containsKey("l_h_ODR_TYP")) ? (String[])params.get("l_h_ODR_TYP") : (String[])null);
		String[] h_ODR_TYP = ((params.containsKey("h_ODR_TYP")) ? (String[])params.get("h_ODR_TYP") : (String[])null);
		String[] h_ODR_TYP3 = ((params.containsKey("h_ODR_TYP3")) ? (String[])params.get("h_ODR_TYP3") : (String[])null);
		String[] h_APR_ODR = ((params.containsKey("h_APR_ODR")) ? (String[])params.get("h_APR_ODR") : (String[])null);
		String[] h_PRD_REQ_JOB_ODR_TYP_1 = ((params.containsKey("h_PRD_REQ_JOB_ODR_TYP_1")) ? (String[])params.get("h_PRD_REQ_JOB_ODR_TYP_1") : (String[])null);
		String[] h_PRD_REQ_JOB_ODR_TYP_2 = ((params.containsKey("h_PRD_REQ_JOB_ODR_TYP_2")) ? (String[])params.get("h_PRD_REQ_JOB_ODR_TYP_2") : (String[])null);
		String[] h_DLV_LOC_CD = ((params.containsKey("h_DLV_LOC_CD")) ? (String[])params.get("h_DLV_LOC_CD") : (String[])null);
		String[] h_ANS_DLV_DATE_EXIST_FLG = ((params.containsKey("h_ANS_DLV_DATE_EXIST_FLG")) ? (String[])params.get("h_ANS_DLV_DATE_EXIST_FLG") : (String[])null);
		String[] ITEM_NAME_R = ((params.containsKey("ITEM_NAME_R")) ? (String[])params.get("ITEM_NAME_R") : (String[])null);
		String[] l_h_ANS_DLV_DATE_EXIST_FLG = ((params.containsKey("l_h_ANS_DLV_DATE_EXIST_FLG")) ? (String[])params.get("l_h_ANS_DLV_DATE_EXIST_FLG") : (String[])null);
		String[] l_h_DEPO_TYP = ((params.containsKey("l_h_DEPO_TYP")) ? (String[])params.get("l_h_DEPO_TYP") : (String[])null);
		String[] l_OWN_PERSON_CD = ((params.containsKey("l_OWN_PERSON_CD")) ? (String[])params.get("l_OWN_PERSON_CD") : (String[])null);
		String[] l_OWN_ORG_CD = ((params.containsKey("l_OWN_ORG_CD")) ? (String[])params.get("l_OWN_ORG_CD") : (String[])null);

		struct.setPROJECT_CD( ((PROJECT_CD == null) ? (String)null : PROJECT_CD[0]) );
		struct.setList_PROJECT_CD(TypeConverter.convert(PROJECT_CD));
		struct.setPROJECT_NAME( ((PROJECT_NAME == null) ? (String)null : PROJECT_NAME[0]) );
		struct.setList_PROJECT_NAME(TypeConverter.convert(PROJECT_NAME));
		struct.setESTIMATE_NO( ((ESTIMATE_NO == null) ? (String)null : ESTIMATE_NO[0]) );
		struct.setList_ESTIMATE_NO(TypeConverter.convert(ESTIMATE_NO));
		struct.setCUST_NAME( ((CUST_NAME == null) ? (String)null : CUST_NAME[0]) );
		struct.setList_CUST_NAME(TypeConverter.convert(CUST_NAME));
		struct.setrdoSHIP_INST( ((rdoSHIP_INST == null) ? (String)null : rdoSHIP_INST[0]) );
		struct.setList_rdoSHIP_INST(TypeConverter.convert(rdoSHIP_INST));
		struct.setrdoSHIP_UPDATE( ((rdoSHIP_UPDATE == null) ? (String)null : rdoSHIP_UPDATE[0]) );
		struct.setList_rdoSHIP_UPDATE(TypeConverter.convert(rdoSHIP_UPDATE));
		struct.setl_DETAL_NO( ((l_DETAL_NO == null) ? (String)null : l_DETAL_NO[0]) );
		struct.setList_l_DETAL_NO(TypeConverter.convert(l_DETAL_NO));
		struct.setl_ODR_NO( ((l_ODR_NO == null) ? (String)null : l_ODR_NO[0]) );
		struct.setList_l_ODR_NO(TypeConverter.convert(l_ODR_NO));
		struct.setl_ODR_TYP( ((l_ODR_TYP == null) ? (String)null : l_ODR_TYP[0]) );
		struct.setList_l_ODR_TYP(TypeConverter.convert(l_ODR_TYP));
		struct.setl_CUST_ODR_NO( ((l_CUST_ODR_NO == null) ? (String)null : l_CUST_ODR_NO[0]) );
		struct.setList_l_CUST_ODR_NO(TypeConverter.convert(l_CUST_ODR_NO));
		struct.setl_CUST_ITEM_CD( ((l_CUST_ITEM_CD == null) ? (String)null : l_CUST_ITEM_CD[0]) );
		struct.setList_l_CUST_ITEM_CD(TypeConverter.convert(l_CUST_ITEM_CD));
		struct.setl_ITEM_CD( ((l_ITEM_CD == null) ? (String)null : l_ITEM_CD[0]) );
		struct.setList_l_ITEM_CD(TypeConverter.convert(l_ITEM_CD));
		struct.setl_DESINATED_DLV_DATE( ((l_DESINATED_DLV_DATE == null) ? (String)null : l_DESINATED_DLV_DATE[0]) );
		struct.setList_l_DESINATED_DLV_DATE(TypeConverter.convert(l_DESINATED_DLV_DATE));
		struct.setl_ESTIMATE_QTY( ((l_ESTIMATE_QTY == null) ? (String)null : l_ESTIMATE_QTY[0]) );
		struct.setList_l_ESTIMATE_QTY(TypeConverter.convert(l_ESTIMATE_QTY));
		struct.setl_CUR_UNIT( ((l_CUR_UNIT == null) ? (String)null : l_CUR_UNIT[0]) );
		struct.setList_l_CUR_UNIT(TypeConverter.convert(l_CUR_UNIT));
		struct.setDETAIL_NO( ((DETAIL_NO == null) ? (String)null : DETAIL_NO[0]) );
		struct.setList_DETAIL_NO(TypeConverter.convert(DETAIL_NO));
		struct.setODR_ACPT_DATE( ((ODR_ACPT_DATE == null) ? (String)null : ODR_ACPT_DATE[0]) );
		struct.setList_ODR_ACPT_DATE(TypeConverter.convert(ODR_ACPT_DATE));
		struct.setACPT_ODR_CD( ((ACPT_ODR_CD == null) ? (String)null : ACPT_ODR_CD[0]) );
		struct.setList_ACPT_ODR_CD(TypeConverter.convert(ACPT_ODR_CD));
		struct.setc_DOODR( ((c_DOODR == null) ? (String)null : c_DOODR[0]) );
		struct.setList_c_DOODR(TypeConverter.convert(c_DOODR));
		struct.setODR_TYP( ((ODR_TYP == null) ? (String)null : ODR_TYP[0]) );
		struct.setList_ODR_TYP(TypeConverter.convert(ODR_TYP));
		struct.setPREPARE_QTY( ((PREPARE_QTY == null) ? (String)null : PREPARE_QTY[0]) );
		struct.setList_PREPARE_QTY(TypeConverter.convert(PREPARE_QTY));
		struct.setCUST_ODR_NO( ((CUST_ODR_NO == null) ? (String)null : CUST_ODR_NO[0]) );
		struct.setList_CUST_ODR_NO(TypeConverter.convert(CUST_ODR_NO));
		struct.setJOB_ODR_DLV_DATE( ((JOB_ODR_DLV_DATE == null) ? (String)null : JOB_ODR_DLV_DATE[0]) );
		struct.setList_JOB_ODR_DLV_DATE(TypeConverter.convert(JOB_ODR_DLV_DATE));
		struct.setDESINATED_DLV_DATE( ((DESINATED_DLV_DATE == null) ? (String)null : DESINATED_DLV_DATE[0]) );
		struct.setList_DESINATED_DLV_DATE(TypeConverter.convert(DESINATED_DLV_DATE));
		struct.setALC_GRP_CD( ((ALC_GRP_CD == null) ? (String)null : ALC_GRP_CD[0]) );
		struct.setList_ALC_GRP_CD(TypeConverter.convert(ALC_GRP_CD));
		struct.setDLV_LOC_CD( ((DLV_LOC_CD == null) ? (String)null : DLV_LOC_CD[0]) );
		struct.setList_DLV_LOC_CD(TypeConverter.convert(DLV_LOC_CD));
		struct.setc_INPUTODRCD( ((c_INPUTODRCD == null) ? (String)null : c_INPUTODRCD[0]) );
		struct.setList_c_INPUTODRCD(TypeConverter.convert(c_INPUTODRCD));
		struct.setESTIMATE_TYPE( ((ESTIMATE_TYPE == null) ? (String)null : ESTIMATE_TYPE[0]) );
		struct.setList_ESTIMATE_TYPE(TypeConverter.convert(ESTIMATE_TYPE));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setCUST_ITEM_CD( ((CUST_ITEM_CD == null) ? (String)null : CUST_ITEM_CD[0]) );
		struct.setList_CUST_ITEM_CD(TypeConverter.convert(CUST_ITEM_CD));
		struct.setCUST_ITEM_NAME( ((CUST_ITEM_NAME == null) ? (String)null : CUST_ITEM_NAME[0]) );
		struct.setList_CUST_ITEM_NAME(TypeConverter.convert(CUST_ITEM_NAME));
		struct.setQTY( ((QTY == null) ? (String)null : QTY[0]) );
		struct.setList_QTY(TypeConverter.convert(QTY));
		struct.setQTY_UNIT( ((QTY_UNIT == null) ? (String)null : QTY_UNIT[0]) );
		struct.setList_QTY_UNIT(TypeConverter.convert(QTY_UNIT));
		struct.setODR_UNIT_PRICE( ((ODR_UNIT_PRICE == null) ? (String)null : ODR_UNIT_PRICE[0]) );
		struct.setList_ODR_UNIT_PRICE(TypeConverter.convert(ODR_UNIT_PRICE));
		struct.setODR_PRICE_UNIT( ((ODR_PRICE_UNIT == null) ? (String)null : ODR_PRICE_UNIT[0]) );
		struct.setList_ODR_PRICE_UNIT(TypeConverter.convert(ODR_PRICE_UNIT));
		struct.setODR_AMOUNT( ((ODR_AMOUNT == null) ? (String)null : ODR_AMOUNT[0]) );
		struct.setList_ODR_AMOUNT(TypeConverter.convert(ODR_AMOUNT));
		struct.setODR_AMOUNT_EXCH_RATES( ((ODR_AMOUNT_EXCH_RATES == null) ? (String)null : ODR_AMOUNT_EXCH_RATES[0]) );
		struct.setList_ODR_AMOUNT_EXCH_RATES(TypeConverter.convert(ODR_AMOUNT_EXCH_RATES));
		struct.setISSUE_INST_COMMENT( ((ISSUE_INST_COMMENT == null) ? (String)null : ISSUE_INST_COMMENT[0]) );
		struct.setList_ISSUE_INST_COMMENT(TypeConverter.convert(ISSUE_INST_COMMENT));
		struct.setAPPROVED_COMMENT( ((APPROVED_COMMENT == null) ? (String)null : APPROVED_COMMENT[0]) );
		struct.setList_APPROVED_COMMENT(TypeConverter.convert(APPROVED_COMMENT));
		struct.setCUST_CHRG_PSN_CD( ((CUST_CHRG_PSN_CD == null) ? (String)null : CUST_CHRG_PSN_CD[0]) );
		struct.setList_CUST_CHRG_PSN_CD(TypeConverter.convert(CUST_CHRG_PSN_CD));
		struct.setCUST_CHRG_PSN_NAME( ((CUST_CHRG_PSN_NAME == null) ? (String)null : CUST_CHRG_PSN_NAME[0]) );
		struct.setList_CUST_CHRG_PSN_NAME(TypeConverter.convert(CUST_CHRG_PSN_NAME));
		struct.setES_ORG_CD( ((ES_ORG_CD == null) ? (String)null : ES_ORG_CD[0]) );
		struct.setList_ES_ORG_CD(TypeConverter.convert(ES_ORG_CD));
		struct.setES_ORG_NAME( ((ES_ORG_NAME == null) ? (String)null : ES_ORG_NAME[0]) );
		struct.setList_ES_ORG_NAME(TypeConverter.convert(ES_ORG_NAME));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setl_UNIT_CD( ((l_UNIT_CD == null) ? (String)null : l_UNIT_CD[0]) );
		struct.setList_l_UNIT_CD(TypeConverter.convert(l_UNIT_CD));
		struct.setl_ESTIMATE_UNIT_PRICE( ((l_ESTIMATE_UNIT_PRICE == null) ? (String)null : l_ESTIMATE_UNIT_PRICE[0]) );
		struct.setList_l_ESTIMATE_UNIT_PRICE(TypeConverter.convert(l_ESTIMATE_UNIT_PRICE));
		struct.setl_ODR_AMOUNT( ((l_ODR_AMOUNT == null) ? (String)null : l_ODR_AMOUNT[0]) );
		struct.setList_l_ODR_AMOUNT(TypeConverter.convert(l_ODR_AMOUNT));
		struct.setl_ODR_AMOUNT_EXCH_RATES( ((l_ODR_AMOUNT_EXCH_RATES == null) ? (String)null : l_ODR_AMOUNT_EXCH_RATES[0]) );
		struct.setList_l_ODR_AMOUNT_EXCH_RATES(TypeConverter.convert(l_ODR_AMOUNT_EXCH_RATES));
		struct.setl_DLV_LOC_CD( ((l_DLV_LOC_CD == null) ? (String)null : l_DLV_LOC_CD[0]) );
		struct.setList_l_DLV_LOC_CD(TypeConverter.convert(l_DLV_LOC_CD));
		struct.setl_DLV_LOC_NAME( ((l_DLV_LOC_NAME == null) ? (String)null : l_DLV_LOC_NAME[0]) );
		struct.setList_l_DLV_LOC_NAME(TypeConverter.convert(l_DLV_LOC_NAME));
		struct.setl_DEPO_TYP( ((l_DEPO_TYP == null) ? (String)null : l_DEPO_TYP[0]) );
		struct.setList_l_DEPO_TYP(TypeConverter.convert(l_DEPO_TYP));
		struct.setl_CUST_ITEM_NAME( ((l_CUST_ITEM_NAME == null) ? (String)null : l_CUST_ITEM_NAME[0]) );
		struct.setList_l_CUST_ITEM_NAME(TypeConverter.convert(l_CUST_ITEM_NAME));
		struct.setl_ITEM_NAME( ((l_ITEM_NAME == null) ? (String)null : l_ITEM_NAME[0]) );
		struct.setList_l_ITEM_NAME(TypeConverter.convert(l_ITEM_NAME));
		struct.setl_ODR_ACPT_DATE( ((l_ODR_ACPT_DATE == null) ? (String)null : l_ODR_ACPT_DATE[0]) );
		struct.setList_l_ODR_ACPT_DATE(TypeConverter.convert(l_ODR_ACPT_DATE));
		struct.setl_JOB_ODR_DLV_DATE( ((l_JOB_ODR_DLV_DATE == null) ? (String)null : l_JOB_ODR_DLV_DATE[0]) );
		struct.setList_l_JOB_ODR_DLV_DATE(TypeConverter.convert(l_JOB_ODR_DLV_DATE));
		struct.setl_ALC_GRP_CD( ((l_ALC_GRP_CD == null) ? (String)null : l_ALC_GRP_CD[0]) );
		struct.setList_l_ALC_GRP_CD(TypeConverter.convert(l_ALC_GRP_CD));
		struct.setl_JOB_ODR_CD( ((l_JOB_ODR_CD == null) ? (String)null : l_JOB_ODR_CD[0]) );
		struct.setList_l_JOB_ODR_CD(TypeConverter.convert(l_JOB_ODR_CD));
		struct.setl_REMARKS( ((l_REMARKS == null) ? (String)null : l_REMARKS[0]) );
		struct.setList_l_REMARKS(TypeConverter.convert(l_REMARKS));
		struct.setl_APPR_REMARKS( ((l_APPR_REMARKS == null) ? (String)null : l_APPR_REMARKS[0]) );
		struct.setList_l_APPR_REMARKS(TypeConverter.convert(l_APPR_REMARKS));
		struct.setl_CUST_CHRG_PSN_NAME( ((l_CUST_CHRG_PSN_NAME == null) ? (String)null : l_CUST_CHRG_PSN_NAME[0]) );
		struct.setList_l_CUST_CHRG_PSN_NAME(TypeConverter.convert(l_CUST_CHRG_PSN_NAME));
		struct.setl_CUST_CHRG_ORG_NAME( ((l_CUST_CHRG_ORG_NAME == null) ? (String)null : l_CUST_CHRG_ORG_NAME[0]) );
		struct.setList_l_CUST_CHRG_ORG_NAME(TypeConverter.convert(l_CUST_CHRG_ORG_NAME));
		struct.setl_ESTIMATE_TYPE( ((l_ESTIMATE_TYPE == null) ? (String)null : l_ESTIMATE_TYPE[0]) );
		struct.setList_l_ESTIMATE_TYPE(TypeConverter.convert(l_ESTIMATE_TYPE));
		struct.setl_ESTIMATE_ITEM_NAME( ((l_ESTIMATE_ITEM_NAME == null) ? (String)null : l_ESTIMATE_ITEM_NAME[0]) );
		struct.setList_l_ESTIMATE_ITEM_NAME(TypeConverter.convert(l_ESTIMATE_ITEM_NAME));
		struct.setl_ODR_QTY( ((l_ODR_QTY == null) ? (String)null : l_ODR_QTY[0]) );
		struct.setList_l_ODR_QTY(TypeConverter.convert(l_ODR_QTY));
		struct.setCUST_CD( ((CUST_CD == null) ? (String)null : CUST_CD[0]) );
		struct.setList_CUST_CD(TypeConverter.convert(CUST_CD));
		struct.seth_UPDATE_FLG( ((h_UPDATE_FLG == null) ? (String)null : h_UPDATE_FLG[0]) );
		struct.setList_h_UPDATE_FLG(TypeConverter.convert(h_UPDATE_FLG));
		struct.setl_TODR_MODIFY_COUNT( ((l_TODR_MODIFY_COUNT == null) ? (String)null : l_TODR_MODIFY_COUNT[0]) );
		struct.setList_l_TODR_MODIFY_COUNT(TypeConverter.convert(l_TODR_MODIFY_COUNT));
		struct.setl_TEST_MODIFY_COUNT( ((l_TEST_MODIFY_COUNT == null) ? (String)null : l_TEST_MODIFY_COUNT[0]) );
		struct.setList_l_TEST_MODIFY_COUNT(TypeConverter.convert(l_TEST_MODIFY_COUNT));
		struct.setl_TPJ_MODIFY_COUNT( ((l_TPJ_MODIFY_COUNT == null) ? (String)null : l_TPJ_MODIFY_COUNT[0]) );
		struct.setList_l_TPJ_MODIFY_COUNT(TypeConverter.convert(l_TPJ_MODIFY_COUNT));
		struct.setl_h_ESTIMATE_TYPE( ((l_h_ESTIMATE_TYPE == null) ? (String)null : l_h_ESTIMATE_TYPE[0]) );
		struct.setList_l_h_ESTIMATE_TYPE(TypeConverter.convert(l_h_ESTIMATE_TYPE));
		struct.seth_ESTIMATE_TYPE( ((h_ESTIMATE_TYPE == null) ? (String)null : h_ESTIMATE_TYPE[0]) );
		struct.setList_h_ESTIMATE_TYPE(TypeConverter.convert(h_ESTIMATE_TYPE));
		struct.setl_h_PREC_ARRANGE_FLG( ((l_h_PREC_ARRANGE_FLG == null) ? (String)null : l_h_PREC_ARRANGE_FLG[0]) );
		struct.setList_l_h_PREC_ARRANGE_FLG(TypeConverter.convert(l_h_PREC_ARRANGE_FLG));
		struct.setl_c_DOODR( ((l_c_DOODR == null) ? (String)null : l_c_DOODR[0]) );
		struct.setList_l_c_DOODR(TypeConverter.convert(l_c_DOODR));
		struct.setl_c_INPUTODRCD( ((l_c_INPUTODRCD == null) ? (String)null : l_c_INPUTODRCD[0]) );
		struct.setList_l_c_INPUTODRCD(TypeConverter.convert(l_c_INPUTODRCD));
		struct.seth_PREC_ARRANGE_FLG( ((h_PREC_ARRANGE_FLG == null) ? (String)null : h_PREC_ARRANGE_FLG[0]) );
		struct.setList_h_PREC_ARRANGE_FLG(TypeConverter.convert(h_PREC_ARRANGE_FLG));
		struct.setl_h_ODR_TYP( ((l_h_ODR_TYP == null) ? (String)null : l_h_ODR_TYP[0]) );
		struct.setList_l_h_ODR_TYP(TypeConverter.convert(l_h_ODR_TYP));
		struct.seth_ODR_TYP( ((h_ODR_TYP == null) ? (String)null : h_ODR_TYP[0]) );
		struct.setList_h_ODR_TYP(TypeConverter.convert(h_ODR_TYP));
		struct.seth_ODR_TYP3( ((h_ODR_TYP3 == null) ? (String)null : h_ODR_TYP3[0]) );
		struct.setList_h_ODR_TYP3(TypeConverter.convert(h_ODR_TYP3));
		struct.seth_APR_ODR( ((h_APR_ODR == null) ? (String)null : h_APR_ODR[0]) );
		struct.setList_h_APR_ODR(TypeConverter.convert(h_APR_ODR));
		struct.seth_PRD_REQ_JOB_ODR_TYP_1( ((h_PRD_REQ_JOB_ODR_TYP_1 == null) ? (String)null : h_PRD_REQ_JOB_ODR_TYP_1[0]) );
		struct.setList_h_PRD_REQ_JOB_ODR_TYP_1(TypeConverter.convert(h_PRD_REQ_JOB_ODR_TYP_1));
		struct.seth_PRD_REQ_JOB_ODR_TYP_2( ((h_PRD_REQ_JOB_ODR_TYP_2 == null) ? (String)null : h_PRD_REQ_JOB_ODR_TYP_2[0]) );
		struct.setList_h_PRD_REQ_JOB_ODR_TYP_2(TypeConverter.convert(h_PRD_REQ_JOB_ODR_TYP_2));
		struct.seth_DLV_LOC_CD( ((h_DLV_LOC_CD == null) ? (String)null : h_DLV_LOC_CD[0]) );
		struct.setList_h_DLV_LOC_CD(TypeConverter.convert(h_DLV_LOC_CD));
		struct.seth_ANS_DLV_DATE_EXIST_FLG( ((h_ANS_DLV_DATE_EXIST_FLG == null) ? (String)null : h_ANS_DLV_DATE_EXIST_FLG[0]) );
		struct.setList_h_ANS_DLV_DATE_EXIST_FLG(TypeConverter.convert(h_ANS_DLV_DATE_EXIST_FLG));
		struct.setITEM_NAME_R( ((ITEM_NAME_R == null) ? (String)null : ITEM_NAME_R[0]) );
		struct.setList_ITEM_NAME_R(TypeConverter.convert(ITEM_NAME_R));
		struct.setl_h_ANS_DLV_DATE_EXIST_FLG( ((l_h_ANS_DLV_DATE_EXIST_FLG == null) ? (String)null : l_h_ANS_DLV_DATE_EXIST_FLG[0]) );
		struct.setList_l_h_ANS_DLV_DATE_EXIST_FLG(TypeConverter.convert(l_h_ANS_DLV_DATE_EXIST_FLG));
		struct.setl_h_DEPO_TYP( ((l_h_DEPO_TYP == null) ? (String)null : l_h_DEPO_TYP[0]) );
		struct.setList_l_h_DEPO_TYP(TypeConverter.convert(l_h_DEPO_TYP));
		struct.setl_OWN_PERSON_CD( ((l_OWN_PERSON_CD == null) ? (String)null : l_OWN_PERSON_CD[0]) );
		struct.setList_l_OWN_PERSON_CD(TypeConverter.convert(l_OWN_PERSON_CD));
		struct.setl_OWN_ORG_CD( ((l_OWN_ORG_CD == null) ? (String)null : l_OWN_ORG_CD[0]) );
		struct.setList_l_OWN_ORG_CD(TypeConverter.convert(l_OWN_ORG_CD));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/KM0030010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aKM0030010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aKM0030010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					KM0030010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		KM0030010Control control;
		KM0030010Entity  entity = null;
		KM0030010Struct  struct = null;

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

			if( (control = (KM0030010Control)so.getAttribute("KM0030010Control_"+request.getSession(false).getId())) == null ) {
				control = new KM0030010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new KM0030010Control();
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
				} else if( isClick(request, "Modify") ) {
					if ( !isCryptical(request, so, params, "Modify") ) return ERROR_TARGET;
					target = onClickModify(request, response, so, params, control);
					control.setButton("Modify");
				} else if( isClick(request, "Insert") ) {
					if ( !isCryptical(request, so, params, "Insert") ) return ERROR_TARGET;
					target = onClickInsert(request, response, so, params, control);
					control.setButton("Insert");
				} else if( isClick(request, "Update") ) {
					if ( !isCryptical(request, so, params, "Update") ) return ERROR_TARGET;
					target = onClickUpdate(request, response, so, params, control);
					control.setButton("Update");
				} else if( isClick(request, "Delete") ) {
					if ( !isCryptical(request, so, params, "Delete") ) return ERROR_TARGET;
					target = onClickDelete(request, response, so, params, control);
					control.setButton("Delete");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("KM0030010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "Modify") && bFLG_DISCONNECT_Modify)
				|| (isClick(request, "Insert") && bFLG_DISCONNECT_Insert)
				|| (isClick(request, "Update") && bFLG_DISCONNECT_Update)
				|| (isClick(request, "Delete") && bFLG_DISCONNECT_Delete)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
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
	private  static boolean bFLG_DISCONNECT_Modify = true;
	private  static boolean bFLG_DISCONNECT_Insert = true;
	private  static boolean bFLG_DISCONNECT_Update = true;
	private  static boolean bFLG_DISCONNECT_Delete = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;

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
		return "com.nec.jp.orteus.metamorBase.KM0030.KM0030010Servlet";
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
	public KM0030010Servlet()
	{
		//{{user_implement_dev:<KM0030010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_Modify = true;
		bFLG_DISCONNECT_Insert = true;
		bFLG_DISCONNECT_Update = true;
		bFLG_DISCONNECT_Delete = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;

                //}}user_implement_dev:<KM0030010_DisConnect_FLG>

		//{{user_implement_dev:<KM0030010Servlet>
//			bFLG_CSRF = false; // CSRF�̂��߂̔�����s��Ȃ��ꍇ�́A�R�����g�A�E�g���͂����Ă�������

			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<KM0030010Servlet>
	}

	//////////////////////////////

}
