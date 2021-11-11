/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0090/src/com/nec/jp/orteus/metamorBase/AE0090/AE0090040Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0090;

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
 * CLASS     : AE0090040Servlet �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class AE0090040Servlet extends HttpServlet
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
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AE0090040Control control)
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
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * ��ʋ��ʃp�����[�^�擾
	 * @param params  Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AE0090040Control control)
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
	 * @param control AE0090040Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
			logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			LogWriter.write( Level.ALL, "AE0090040"+" $Revision: 1.8 $" );
			control.control_eventHandller("initial");
			logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		
		
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AE0090040Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		try {
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
         
            if (control.isScreenMove()) {
             getSessionParameters(so, params, struct);
            }
         
            control.control_eventHandller("reload");
         
           } catch ( FoundationException e ) {
         //			e.printStackTrace();
         //			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0130010-E999","�����[�h����"));
            ExpjException ee = new ExpjException(e, "ZZ01106");
            ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
            throw ee;
   		} catch (BusinessProcessException e) {
//   			 �G���[�������L�q���Ă��������B
   			ExpjException ee = new ExpjException(e, "ZZ01106");
   			throw ee;
   		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Select");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelect>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * FlashTree�������{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	public String onClickFlashTree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickFlashTree");
		//{{user_implement_dev:<onClickFlashTree>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("FlashTree");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickFlashTree>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickFlashTree");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
		//{{user_implement_dev:<onClickClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Clear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClear>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
		//{{user_implement_dev:<onClickClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Close");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClose>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * ���̕i�ڂŐ��W�J�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	public String onClickShowS_Tree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickShowS_Tree");
		//{{user_implement_dev:<onClickShowS_Tree>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("ShowS_Tree");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickShowS_Tree>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickShowS_Tree");

		return nextUrl;
	}

	/**
	 * ���̕i�ڂŋt�W�J�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	public String onClickShowR_Tree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickShowR_Tree");
		//{{user_implement_dev:<onClickShowR_Tree>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("ShowR_Tree");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickShowR_Tree>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickShowR_Tree");

		return nextUrl;
	}

	/**
	 * �ڍ׏��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	public String onClickShowDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0090040Detail.jsp";		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickShowDetail");
		//{{user_implement_dev:<onClickShowDetail>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("ShowDetail");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                //}}user_implement_dev:<onClickShowDetail>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickShowDetail");

		return nextUrl;
	}

	/**
	 * �݌ɎQ�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	public String onClickStockInquiry(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickStockInquiry");
		//{{user_implement_dev:<onClickStockInquiry>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("StockInquiry");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickStockInquiry>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickStockInquiry");

		return nextUrl;
	}

	/**
	 * �����v�惁���e�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	public String onClickMaintenanceRequestOrderPlan(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickMaintenanceRequestOrderPlan");
		//{{user_implement_dev:<onClickMaintenanceRequestOrderPlan>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("MaintenanceRequestOrderPlan");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickMaintenanceRequestOrderPlan>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickMaintenanceRequestOrderPlan");

		return nextUrl;
	}

	/**
	 * �c���[�Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	public String onClickTreeSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickTreeSelect");
		//{{user_implement_dev:<onClickTreeSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("TreeSelect");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickTreeSelect>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickTreeSelect");

		return nextUrl;
	}

	/**
	 * �ꗗ�Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	public String onClickViewSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0090041.jsp";		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickViewSelect");
		//{{user_implement_dev:<onClickViewSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("ViewSelect");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickViewSelect>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickViewSelect");

		return nextUrl;
	}

	/**
	 * �L���݌ɎQ�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	public String onClickValidStockInquiry(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickValidStockInquiry");
		//{{user_implement_dev:<onClickValidStockInquiry>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("ValidStockInquiry");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickValidStockInquiry>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickValidStockInquiry");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	public String onClickSubClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0090041.jsp";		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickSubClear");
		//{{user_implement_dev:<onClickSubClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("SubClear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSubClear>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickSubClear");

		return nextUrl;
	}

	/**
	 * �c���[�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0090040Control�N���X�C���X�^���X
	 */
	public String onClickAddTree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0090040Control.jsp";		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickAddTree");
		//{{user_implement_dev:<onClickAddTree>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("AddTree");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickAddTree>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickAddTree");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AE0090040Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] Target_ITEM_CD = ((params.containsKey("Target_ITEM_CD")) ? (String[])params.get("Target_ITEM_CD") : (String[])null);
		String[] DEVELOP_TYP = ((params.containsKey("DEVELOP_TYP")) ? (String[])params.get("DEVELOP_TYP") : (String[])null);
		String[] DEVELOP_TYP_name = ((params.containsKey("DEVELOP_TYP_name")) ? (String[])params.get("DEVELOP_TYP_name") : (String[])null);
		String[] DEVELOP_TYP_val = ((params.containsKey("DEVELOP_TYP_val")) ? (String[])params.get("DEVELOP_TYP_val") : (String[])null);
		String[] TargetDate = ((params.containsKey("TargetDate")) ? (String[])params.get("TargetDate") : (String[])null);
		String[] InitLevel = ((params.containsKey("InitLevel")) ? (String[])params.get("InitLevel") : (String[])null);
		String[] h_MaxLevel = ((params.containsKey("h_MaxLevel")) ? (String[])params.get("h_MaxLevel") : (String[])null);
		String[] AE0090040tree1 = ((params.containsKey("AE0090040tree1")) ? (String[])params.get("AE0090040tree1") : (String[])null);
		String[] id = ((params.containsKey("id")) ? (String[])params.get("id") : (String[])null);
		String[] lvl = ((params.containsKey("lvl")) ? (String[])params.get("lvl") : (String[])null);
		String[] parent = ((params.containsKey("parent")) ? (String[])params.get("parent") : (String[])null);
		String[] label = ((params.containsKey("label")) ? (String[])params.get("label") : (String[])null);
		String[] ctx = ((params.containsKey("ctx")) ? (String[])params.get("ctx") : (String[])null);
		String[] maxid = ((params.containsKey("maxid")) ? (String[])params.get("maxid") : (String[])null);
		String[] Upper_ITEM_CD = ((params.containsKey("Upper_ITEM_CD")) ? (String[])params.get("Upper_ITEM_CD") : (String[])null);
		String[] Lower_ITEM_CD = ((params.containsKey("Lower_ITEM_CD")) ? (String[])params.get("Lower_ITEM_CD") : (String[])null);
		String[] Lower_ITEM_NAME = ((params.containsKey("Lower_ITEM_NAME")) ? (String[])params.get("Lower_ITEM_NAME") : (String[])null);
		String[] PS_EDITION = ((params.containsKey("PS_EDITION")) ? (String[])params.get("PS_EDITION") : (String[])null);
		String[] EFF_PHASE_IN_DATE = ((params.containsKey("EFF_PHASE_IN_DATE")) ? (String[])params.get("EFF_PHASE_IN_DATE") : (String[])null);
		String[] EFF_PHASE_OUT_DATE = ((params.containsKey("EFF_PHASE_OUT_DATE")) ? (String[])params.get("EFF_PHASE_OUT_DATE") : (String[])null);
		String[] PLANT_CD = ((params.containsKey("PLANT_CD")) ? (String[])params.get("PLANT_CD") : (String[])null);
		String[] RECEIPT_SCHEDULES_NUMBER1 = ((params.containsKey("RECEIPT_SCHEDULES_NUMBER1")) ? (String[])params.get("RECEIPT_SCHEDULES_NUMBER1") : (String[])null);
		String[] RECEIPT_SCHEDULES_NUMBER2 = ((params.containsKey("RECEIPT_SCHEDULES_NUMBER2")) ? (String[])params.get("RECEIPT_SCHEDULES_NUMBER2") : (String[])null);
		String[] TERM2STARTDATE = ((params.containsKey("TERM2STARTDATE")) ? (String[])params.get("TERM2STARTDATE") : (String[])null);
		String[] NEED_QTY_1 = ((params.containsKey("NEED_QTY_1")) ? (String[])params.get("NEED_QTY_1") : (String[])null);
		String[] Det_Parent_ITEM_CD = ((params.containsKey("Det_Parent_ITEM_CD")) ? (String[])params.get("Det_Parent_ITEM_CD") : (String[])null);
		String[] Det_Parent_ITEM_NAME = ((params.containsKey("Det_Parent_ITEM_NAME")) ? (String[])params.get("Det_Parent_ITEM_NAME") : (String[])null);
		String[] Det_Comp_ITEM_CD = ((params.containsKey("Det_Comp_ITEM_CD")) ? (String[])params.get("Det_Comp_ITEM_CD") : (String[])null);
		String[] Det_Comp_ITEM_NAME = ((params.containsKey("Det_Comp_ITEM_NAME")) ? (String[])params.get("Det_Comp_ITEM_NAME") : (String[])null);
		String[] Det_Comp_Need_QTY = ((params.containsKey("Det_Comp_Need_QTY")) ? (String[])params.get("Det_Comp_Need_QTY") : (String[])null);
		String[] Det_Comp_OUTSIDE_TYP = ((params.containsKey("Det_Comp_OUTSIDE_TYP")) ? (String[])params.get("Det_Comp_OUTSIDE_TYP") : (String[])null);
		String[] Det_Comp_MRP_ODR_TYP = ((params.containsKey("Det_Comp_MRP_ODR_TYP")) ? (String[])params.get("Det_Comp_MRP_ODR_TYP") : (String[])null);
		String[] Upper_ITEM_NAME = ((params.containsKey("Upper_ITEM_NAME")) ? (String[])params.get("Upper_ITEM_NAME") : (String[])null);
		String[] Det_Comp_ONHAND_QTY = ((params.containsKey("Det_Comp_ONHAND_QTY")) ? (String[])params.get("Det_Comp_ONHAND_QTY") : (String[])null);
		String[] Det_Comp_STOCK_UNIT = ((params.containsKey("Det_Comp_STOCK_UNIT")) ? (String[])params.get("Det_Comp_STOCK_UNIT") : (String[])null);
		String[] Det_Comp_PRODUCT_TYP = ((params.containsKey("Det_Comp_PRODUCT_TYP")) ? (String[])params.get("Det_Comp_PRODUCT_TYP") : (String[])null);
		String[] Det_Comp_PS_UNIT_QTY = ((params.containsKey("Det_Comp_PS_UNIT_QTY")) ? (String[])params.get("Det_Comp_PS_UNIT_QTY") : (String[])null);
		String[] Det_Comp_PS_SPOIL = ((params.containsKey("Det_Comp_PS_SPOIL")) ? (String[])params.get("Det_Comp_PS_SPOIL") : (String[])null);
		String[] Det_Comp_EFF_PHASE_IN_DATE = ((params.containsKey("Det_Comp_EFF_PHASE_IN_DATE")) ? (String[])params.get("Det_Comp_EFF_PHASE_IN_DATE") : (String[])null);
		String[] Det_Comp_EFF_PHASE_OUT_DATE = ((params.containsKey("Det_Comp_EFF_PHASE_OUT_DATE")) ? (String[])params.get("Det_Comp_EFF_PHASE_OUT_DATE") : (String[])null);
		String[] Det_Comp_CONS_TYP = ((params.containsKey("Det_Comp_CONS_TYP")) ? (String[])params.get("Det_Comp_CONS_TYP") : (String[])null);
		String[] Det_Comp_ITEM_SPOIL = ((params.containsKey("Det_Comp_ITEM_SPOIL")) ? (String[])params.get("Det_Comp_ITEM_SPOIL") : (String[])null);
		String[] Upper_NEED_QTY = ((params.containsKey("Upper_NEED_QTY")) ? (String[])params.get("Upper_NEED_QTY") : (String[])null);
		String[] Lower_NEED_QTY = ((params.containsKey("Lower_NEED_QTY")) ? (String[])params.get("Lower_NEED_QTY") : (String[])null);
		String[] ONHAND_STOCK = ((params.containsKey("ONHAND_STOCK")) ? (String[])params.get("ONHAND_STOCK") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] NO = ((params.containsKey("NO")) ? (String[])params.get("NO") : (String[])null);
		String[] PARENT_ITEM_CD = ((params.containsKey("PARENT_ITEM_CD")) ? (String[])params.get("PARENT_ITEM_CD") : (String[])null);
		String[] COMP_ITEM_CD = ((params.containsKey("COMP_ITEM_CD")) ? (String[])params.get("COMP_ITEM_CD") : (String[])null);
		String[] COMP_ITEM_NAME = ((params.containsKey("COMP_ITEM_NAME")) ? (String[])params.get("COMP_ITEM_NAME") : (String[])null);
		String[] PRODUCT_TYP = ((params.containsKey("PRODUCT_TYP")) ? (String[])params.get("PRODUCT_TYP") : (String[])null);
		String[] NEED_QTY = ((params.containsKey("NEED_QTY")) ? (String[])params.get("NEED_QTY") : (String[])null);
		String[] UNIT_QTY = ((params.containsKey("UNIT_QTY")) ? (String[])params.get("UNIT_QTY") : (String[])null);
		String[] IN_UNIT_1 = ((params.containsKey("IN_UNIT_1")) ? (String[])params.get("IN_UNIT_1") : (String[])null);
		String[] IN_UNIT_2 = ((params.containsKey("IN_UNIT_2")) ? (String[])params.get("IN_UNIT_2") : (String[])null);
		String[] NUMERATOR = ((params.containsKey("NUMERATOR")) ? (String[])params.get("NUMERATOR") : (String[])null);
		String[] DENOMINATOR = ((params.containsKey("DENOMINATOR")) ? (String[])params.get("DENOMINATOR") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] PARENT_ITEM_NAME = ((params.containsKey("PARENT_ITEM_NAME")) ? (String[])params.get("PARENT_ITEM_NAME") : (String[])null);
		String[] h_DEVELOP_TYP = ((params.containsKey("h_DEVELOP_TYP")) ? (String[])params.get("h_DEVELOP_TYP") : (String[])null);

		struct.setTarget_ITEM_CD( ((Target_ITEM_CD == null) ? (String)null : Target_ITEM_CD[0]) );
		struct.setList_Target_ITEM_CD(TypeConverter.convert(Target_ITEM_CD));
		struct.setDEVELOP_TYP( ((DEVELOP_TYP == null) ? (String)null : DEVELOP_TYP[0]) );
		struct.setList_DEVELOP_TYP(TypeConverter.convert(DEVELOP_TYP));
		struct.setDEVELOP_TYP_name( ((DEVELOP_TYP_name == null) ? (String)null : DEVELOP_TYP_name[0]) );
		struct.setList_DEVELOP_TYP_name(TypeConverter.convert(DEVELOP_TYP_name));
		struct.setDEVELOP_TYP_val( ((DEVELOP_TYP_val == null) ? (String)null : DEVELOP_TYP_val[0]) );
		struct.setList_DEVELOP_TYP_val(TypeConverter.convert(DEVELOP_TYP_val));
		struct.setTargetDate( ((TargetDate == null) ? (String)null : TargetDate[0]) );
		struct.setList_TargetDate(TypeConverter.convert(TargetDate));
		struct.setInitLevel( ((InitLevel == null) ? (String)null : InitLevel[0]) );
		struct.setList_InitLevel(TypeConverter.convert(InitLevel));
		struct.seth_MaxLevel( ((h_MaxLevel == null) ? (String)null : h_MaxLevel[0]) );
		struct.setList_h_MaxLevel(TypeConverter.convert(h_MaxLevel));
		struct.setAE0090040tree1( ((AE0090040tree1 == null) ? (String)null : AE0090040tree1[0]) );
		struct.setList_AE0090040tree1(TypeConverter.convert(AE0090040tree1));
		struct.setid( ((id == null) ? (String)null : id[0]) );
		struct.setList_id(TypeConverter.convert(id));
		struct.setlvl( ((lvl == null) ? (String)null : lvl[0]) );
		struct.setList_lvl(TypeConverter.convert(lvl));
		struct.setparent( ((parent == null) ? (String)null : parent[0]) );
		struct.setList_parent(TypeConverter.convert(parent));
		struct.setlabel( ((label == null) ? (String)null : label[0]) );
		struct.setList_label(TypeConverter.convert(label));
		struct.setctx( ((ctx == null) ? (String)null : ctx[0]) );
		struct.setList_ctx(TypeConverter.convert(ctx));
		struct.setmaxid( ((maxid == null) ? (String)null : maxid[0]) );
		struct.setList_maxid(TypeConverter.convert(maxid));
		struct.setUpper_ITEM_CD( ((Upper_ITEM_CD == null) ? (String)null : Upper_ITEM_CD[0]) );
		struct.setList_Upper_ITEM_CD(TypeConverter.convert(Upper_ITEM_CD));
		struct.setLower_ITEM_CD( ((Lower_ITEM_CD == null) ? (String)null : Lower_ITEM_CD[0]) );
		struct.setList_Lower_ITEM_CD(TypeConverter.convert(Lower_ITEM_CD));
		struct.setLower_ITEM_NAME( ((Lower_ITEM_NAME == null) ? (String)null : Lower_ITEM_NAME[0]) );
		struct.setList_Lower_ITEM_NAME(TypeConverter.convert(Lower_ITEM_NAME));
		struct.setPS_EDITION( ((PS_EDITION == null) ? (String)null : PS_EDITION[0]) );
		struct.setList_PS_EDITION(TypeConverter.convert(PS_EDITION));
		struct.setEFF_PHASE_IN_DATE( ((EFF_PHASE_IN_DATE == null) ? (String)null : EFF_PHASE_IN_DATE[0]) );
		struct.setList_EFF_PHASE_IN_DATE(TypeConverter.convert(EFF_PHASE_IN_DATE));
		struct.setEFF_PHASE_OUT_DATE( ((EFF_PHASE_OUT_DATE == null) ? (String)null : EFF_PHASE_OUT_DATE[0]) );
		struct.setList_EFF_PHASE_OUT_DATE(TypeConverter.convert(EFF_PHASE_OUT_DATE));
		struct.setPLANT_CD( ((PLANT_CD == null) ? (String)null : PLANT_CD[0]) );
		struct.setList_PLANT_CD(TypeConverter.convert(PLANT_CD));
		struct.setRECEIPT_SCHEDULES_NUMBER1( ((RECEIPT_SCHEDULES_NUMBER1 == null) ? (String)null : RECEIPT_SCHEDULES_NUMBER1[0]) );
		struct.setList_RECEIPT_SCHEDULES_NUMBER1(TypeConverter.convert(RECEIPT_SCHEDULES_NUMBER1));
		struct.setRECEIPT_SCHEDULES_NUMBER2( ((RECEIPT_SCHEDULES_NUMBER2 == null) ? (String)null : RECEIPT_SCHEDULES_NUMBER2[0]) );
		struct.setList_RECEIPT_SCHEDULES_NUMBER2(TypeConverter.convert(RECEIPT_SCHEDULES_NUMBER2));
		struct.setTERM2STARTDATE( ((TERM2STARTDATE == null) ? (String)null : TERM2STARTDATE[0]) );
		struct.setList_TERM2STARTDATE(TypeConverter.convert(TERM2STARTDATE));
		struct.setNEED_QTY_1( ((NEED_QTY_1 == null) ? (String)null : NEED_QTY_1[0]) );
		struct.setList_NEED_QTY_1(TypeConverter.convert(NEED_QTY_1));
		struct.setDet_Parent_ITEM_CD( ((Det_Parent_ITEM_CD == null) ? (String)null : Det_Parent_ITEM_CD[0]) );
		struct.setList_Det_Parent_ITEM_CD(TypeConverter.convert(Det_Parent_ITEM_CD));
		struct.setDet_Parent_ITEM_NAME( ((Det_Parent_ITEM_NAME == null) ? (String)null : Det_Parent_ITEM_NAME[0]) );
		struct.setList_Det_Parent_ITEM_NAME(TypeConverter.convert(Det_Parent_ITEM_NAME));
		struct.setDet_Comp_ITEM_CD( ((Det_Comp_ITEM_CD == null) ? (String)null : Det_Comp_ITEM_CD[0]) );
		struct.setList_Det_Comp_ITEM_CD(TypeConverter.convert(Det_Comp_ITEM_CD));
		struct.setDet_Comp_ITEM_NAME( ((Det_Comp_ITEM_NAME == null) ? (String)null : Det_Comp_ITEM_NAME[0]) );
		struct.setList_Det_Comp_ITEM_NAME(TypeConverter.convert(Det_Comp_ITEM_NAME));
		struct.setDet_Comp_Need_QTY( ((Det_Comp_Need_QTY == null) ? (String)null : Det_Comp_Need_QTY[0]) );
		struct.setList_Det_Comp_Need_QTY(TypeConverter.convert(Det_Comp_Need_QTY));
		struct.setDet_Comp_OUTSIDE_TYP( ((Det_Comp_OUTSIDE_TYP == null) ? (String)null : Det_Comp_OUTSIDE_TYP[0]) );
		struct.setList_Det_Comp_OUTSIDE_TYP(TypeConverter.convert(Det_Comp_OUTSIDE_TYP));
		struct.setDet_Comp_MRP_ODR_TYP( ((Det_Comp_MRP_ODR_TYP == null) ? (String)null : Det_Comp_MRP_ODR_TYP[0]) );
		struct.setList_Det_Comp_MRP_ODR_TYP(TypeConverter.convert(Det_Comp_MRP_ODR_TYP));
		struct.setUpper_ITEM_NAME( ((Upper_ITEM_NAME == null) ? (String)null : Upper_ITEM_NAME[0]) );
		struct.setList_Upper_ITEM_NAME(TypeConverter.convert(Upper_ITEM_NAME));
		struct.setDet_Comp_ONHAND_QTY( ((Det_Comp_ONHAND_QTY == null) ? (String)null : Det_Comp_ONHAND_QTY[0]) );
		struct.setList_Det_Comp_ONHAND_QTY(TypeConverter.convert(Det_Comp_ONHAND_QTY));
		struct.setDet_Comp_STOCK_UNIT( ((Det_Comp_STOCK_UNIT == null) ? (String)null : Det_Comp_STOCK_UNIT[0]) );
		struct.setList_Det_Comp_STOCK_UNIT(TypeConverter.convert(Det_Comp_STOCK_UNIT));
		struct.setDet_Comp_PRODUCT_TYP( ((Det_Comp_PRODUCT_TYP == null) ? (String)null : Det_Comp_PRODUCT_TYP[0]) );
		struct.setList_Det_Comp_PRODUCT_TYP(TypeConverter.convert(Det_Comp_PRODUCT_TYP));
		struct.setDet_Comp_PS_UNIT_QTY( ((Det_Comp_PS_UNIT_QTY == null) ? (String)null : Det_Comp_PS_UNIT_QTY[0]) );
		struct.setList_Det_Comp_PS_UNIT_QTY(TypeConverter.convert(Det_Comp_PS_UNIT_QTY));
		struct.setDet_Comp_PS_SPOIL( ((Det_Comp_PS_SPOIL == null) ? (String)null : Det_Comp_PS_SPOIL[0]) );
		struct.setList_Det_Comp_PS_SPOIL(TypeConverter.convert(Det_Comp_PS_SPOIL));
		struct.setDet_Comp_EFF_PHASE_IN_DATE( ((Det_Comp_EFF_PHASE_IN_DATE == null) ? (String)null : Det_Comp_EFF_PHASE_IN_DATE[0]) );
		struct.setList_Det_Comp_EFF_PHASE_IN_DATE(TypeConverter.convert(Det_Comp_EFF_PHASE_IN_DATE));
		struct.setDet_Comp_EFF_PHASE_OUT_DATE( ((Det_Comp_EFF_PHASE_OUT_DATE == null) ? (String)null : Det_Comp_EFF_PHASE_OUT_DATE[0]) );
		struct.setList_Det_Comp_EFF_PHASE_OUT_DATE(TypeConverter.convert(Det_Comp_EFF_PHASE_OUT_DATE));
		struct.setDet_Comp_CONS_TYP( ((Det_Comp_CONS_TYP == null) ? (String)null : Det_Comp_CONS_TYP[0]) );
		struct.setList_Det_Comp_CONS_TYP(TypeConverter.convert(Det_Comp_CONS_TYP));
		struct.setDet_Comp_ITEM_SPOIL( ((Det_Comp_ITEM_SPOIL == null) ? (String)null : Det_Comp_ITEM_SPOIL[0]) );
		struct.setList_Det_Comp_ITEM_SPOIL(TypeConverter.convert(Det_Comp_ITEM_SPOIL));
		struct.setUpper_NEED_QTY( ((Upper_NEED_QTY == null) ? (String)null : Upper_NEED_QTY[0]) );
		struct.setList_Upper_NEED_QTY(TypeConverter.convert(Upper_NEED_QTY));
		struct.setLower_NEED_QTY( ((Lower_NEED_QTY == null) ? (String)null : Lower_NEED_QTY[0]) );
		struct.setList_Lower_NEED_QTY(TypeConverter.convert(Lower_NEED_QTY));
		struct.setONHAND_STOCK( ((ONHAND_STOCK == null) ? (String)null : ONHAND_STOCK[0]) );
		struct.setList_ONHAND_STOCK(TypeConverter.convert(ONHAND_STOCK));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		struct.setNO( ((NO == null) ? (String)null : NO[0]) );
		struct.setList_NO(TypeConverter.convert(NO));
		struct.setPARENT_ITEM_CD( ((PARENT_ITEM_CD == null) ? (String)null : PARENT_ITEM_CD[0]) );
		struct.setList_PARENT_ITEM_CD(TypeConverter.convert(PARENT_ITEM_CD));
		struct.setCOMP_ITEM_CD( ((COMP_ITEM_CD == null) ? (String)null : COMP_ITEM_CD[0]) );
		struct.setList_COMP_ITEM_CD(TypeConverter.convert(COMP_ITEM_CD));
		struct.setCOMP_ITEM_NAME( ((COMP_ITEM_NAME == null) ? (String)null : COMP_ITEM_NAME[0]) );
		struct.setList_COMP_ITEM_NAME(TypeConverter.convert(COMP_ITEM_NAME));
		struct.setPRODUCT_TYP( ((PRODUCT_TYP == null) ? (String)null : PRODUCT_TYP[0]) );
		struct.setList_PRODUCT_TYP(TypeConverter.convert(PRODUCT_TYP));
		struct.setNEED_QTY( ((NEED_QTY == null) ? (String)null : NEED_QTY[0]) );
		struct.setList_NEED_QTY(TypeConverter.convert(NEED_QTY));
		struct.setUNIT_QTY( ((UNIT_QTY == null) ? (String)null : UNIT_QTY[0]) );
		struct.setList_UNIT_QTY(TypeConverter.convert(UNIT_QTY));
		struct.setIN_UNIT_1( ((IN_UNIT_1 == null) ? (String)null : IN_UNIT_1[0]) );
		struct.setList_IN_UNIT_1(TypeConverter.convert(IN_UNIT_1));
		struct.setIN_UNIT_2( ((IN_UNIT_2 == null) ? (String)null : IN_UNIT_2[0]) );
		struct.setList_IN_UNIT_2(TypeConverter.convert(IN_UNIT_2));
		struct.setNUMERATOR( ((NUMERATOR == null) ? (String)null : NUMERATOR[0]) );
		struct.setList_NUMERATOR(TypeConverter.convert(NUMERATOR));
		struct.setDENOMINATOR( ((DENOMINATOR == null) ? (String)null : DENOMINATOR[0]) );
		struct.setList_DENOMINATOR(TypeConverter.convert(DENOMINATOR));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setPARENT_ITEM_NAME( ((PARENT_ITEM_NAME == null) ? (String)null : PARENT_ITEM_NAME[0]) );
		struct.setList_PARENT_ITEM_NAME(TypeConverter.convert(PARENT_ITEM_NAME));
		struct.seth_DEVELOP_TYP( ((h_DEVELOP_TYP == null) ? (String)null : h_DEVELOP_TYP[0]) );
		struct.setList_h_DEVELOP_TYP(TypeConverter.convert(h_DEVELOP_TYP));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AE0090040.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAE0090040Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAE0090040Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AE0090040Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AE0090040Control control;
		AE0090040Entity  entity = null;
		AE0090040Struct  struct = null;

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

			if( (control = (AE0090040Control)so.getAttribute("AE0090040Control_"+request.getSession(false).getId())) == null ) {
				control = new AE0090040Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AE0090040Control();
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
				} else if( isClick(request, "FlashTree") ) {
					if ( !isCryptical(request, so, params, "FlashTree") ) return ERROR_TARGET;
					target = onClickFlashTree(request, response, so, params, control);
					control.setButton("FlashTree");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else if( isClick(request, "ShowS_Tree") ) {
					if ( !isCryptical(request, so, params, "ShowS_Tree") ) return ERROR_TARGET;
					target = onClickShowS_Tree(request, response, so, params, control);
					control.setButton("ShowS_Tree");
				} else if( isClick(request, "ShowR_Tree") ) {
					if ( !isCryptical(request, so, params, "ShowR_Tree") ) return ERROR_TARGET;
					target = onClickShowR_Tree(request, response, so, params, control);
					control.setButton("ShowR_Tree");
				} else if( isClick(request, "ShowDetail") ) {
					if ( !isCryptical(request, so, params, "ShowDetail") ) return ERROR_TARGET;
					target = onClickShowDetail(request, response, so, params, control);
					control.setButton("ShowDetail");
				} else if( isClick(request, "StockInquiry") ) {
					if ( !isCryptical(request, so, params, "StockInquiry") ) return ERROR_TARGET;
					target = onClickStockInquiry(request, response, so, params, control);
					control.setButton("StockInquiry");
				} else if( isClick(request, "MaintenanceRequestOrderPlan") ) {
					if ( !isCryptical(request, so, params, "MaintenanceRequestOrderPlan") ) return ERROR_TARGET;
					target = onClickMaintenanceRequestOrderPlan(request, response, so, params, control);
					control.setButton("MaintenanceRequestOrderPlan");
				} else if( isClick(request, "TreeSelect") ) {
					if ( !isCryptical(request, so, params, "TreeSelect") ) return ERROR_TARGET;
					target = onClickTreeSelect(request, response, so, params, control);
					control.setButton("TreeSelect");
				} else if( isClick(request, "ViewSelect") ) {
					if ( !isCryptical(request, so, params, "ViewSelect") ) return ERROR_TARGET;
					target = onClickViewSelect(request, response, so, params, control);
					control.setButton("ViewSelect");
				} else if( isClick(request, "ValidStockInquiry") ) {
					if ( !isCryptical(request, so, params, "ValidStockInquiry") ) return ERROR_TARGET;
					target = onClickValidStockInquiry(request, response, so, params, control);
					control.setButton("ValidStockInquiry");
				} else if( isClick(request, "SubClear") ) {
					if ( !isCryptical(request, so, params, "SubClear") ) return ERROR_TARGET;
					target = onClickSubClear(request, response, so, params, control);
					control.setButton("SubClear");
				} else if( isClick(request, "AddTree") ) {
					if ( !isCryptical(request, so, params, "AddTree") ) return ERROR_TARGET;
					target = onClickAddTree(request, response, so, params, control);
					control.setButton("AddTree");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AE0090040Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "FlashTree") && bFLG_DISCONNECT_FlashTree)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "ShowS_Tree") && bFLG_DISCONNECT_ShowS_Tree)
				|| (isClick(request, "ShowR_Tree") && bFLG_DISCONNECT_ShowR_Tree)
				|| (isClick(request, "ShowDetail") && bFLG_DISCONNECT_ShowDetail)
				|| (isClick(request, "StockInquiry") && bFLG_DISCONNECT_StockInquiry)
				|| (isClick(request, "MaintenanceRequestOrderPlan") && bFLG_DISCONNECT_MaintenanceRequestOrderPlan)
				|| (isClick(request, "TreeSelect") && bFLG_DISCONNECT_TreeSelect)
				|| (isClick(request, "ViewSelect") && bFLG_DISCONNECT_ViewSelect)
				|| (isClick(request, "ValidStockInquiry") && bFLG_DISCONNECT_ValidStockInquiry)
				|| (isClick(request, "SubClear") && bFLG_DISCONNECT_SubClear)
				|| (isClick(request, "AddTree") && bFLG_DISCONNECT_AddTree)
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
	private  static boolean bFLG_DISCONNECT_FlashTree = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_ShowS_Tree = true;
	private  static boolean bFLG_DISCONNECT_ShowR_Tree = true;
	private  static boolean bFLG_DISCONNECT_ShowDetail = true;
	private  static boolean bFLG_DISCONNECT_StockInquiry = true;
	private  static boolean bFLG_DISCONNECT_MaintenanceRequestOrderPlan = true;
	private  static boolean bFLG_DISCONNECT_TreeSelect = true;
	private  static boolean bFLG_DISCONNECT_ViewSelect = true;
	private  static boolean bFLG_DISCONNECT_ValidStockInquiry = true;
	private  static boolean bFLG_DISCONNECT_SubClear = true;
	private  static boolean bFLG_DISCONNECT_AddTree = true;

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
		return "com.nec.jp.orteus.metamorBase.AE0090.AE0090040Servlet";
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
	public AE0090040Servlet()
	{
		//{{user_implement_dev:<AE0090040_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_FlashTree = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;

                //}}user_implement_dev:<AE0090040_DisConnect_FLG>

		//{{user_implement_dev:<AE0090040Servlet>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<AE0090040Servlet>
	}

	//////////////////////////////

}
