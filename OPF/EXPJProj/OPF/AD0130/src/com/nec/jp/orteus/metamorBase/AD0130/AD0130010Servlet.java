/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0130/src/com/nec/jp/orteus/metamorBase/AD0130/AD0130010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0130;

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
 * CLASS     : AD0130010Servlet �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class AD0130010Servlet extends HttpServlet
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
	 * @param control AD0130010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AD0130010Control control)
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
        if (screenMoveFlg != null) {
            String[] _value = null;

            // control�̕ϐ��փZ�b�g

            // �������׈ꗗ(�T�u�P)�̏ꍇ
            if ("VD0030011".equals(control.getScreenId())) {
                // ����敪
                if (params.containsKey("P_WORK_REPORT_TYP")) {
                    _value = (String[]) params.get("P_WORK_REPORT_TYP");
                    control.setP_DAILY_WORK_REPORT_TYP(_value[0]);
                }
                // �H��R�[�h
                if (params.containsKey("M_V1_COMP_PLANT_CD")) {
                    _value = (String[]) params.get("M_V1_COMP_PLANT_CD");
                    control.setP_PLANT_CD(_value[0]);
                }
                // ��Ɠ�FROM
                if (params.containsKey("H_PERIOD_FIRST_DAY")) {
                    _value = (String[]) params.get("H_PERIOD_FIRST_DAY");
                    control.setP_OPR_DATE_FROM(_value[0]);
                }
                // ��Ɠ�TO
                if (params.containsKey("H_PERIOD_LAST_DAY")) {
                    _value = (String[]) params.get("H_PERIOD_LAST_DAY");
                    control.setP_OPR_DATE_TO(_value[0]);
                }
                // ���[�U�R�[�h
                if (params.containsKey("P_USER_CD")) {
                    _value = (String[]) params.get("P_USER_CD");
                    control.setP_USER_CD(_value[0]);
                }
                // ��Ƌ�R�[�h
                if (params.containsKey("S_V1_WS_CD")) {
                    _value = (String[]) params.get("S_V1_WS_CD");
                    control.setP_WS_CD(_value[0]);
                }
            }
        }
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * ��ʋ��ʃp�����[�^�擾
	 * @param params  Hashtable�N���X�C���X�^���X
	 * @param control AD0130010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AD0130010Control control)
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
	 * @param control AD0130010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0130010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0130010Entity entity = control.entity;
		AD0130010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
			logger.entering("AD0130010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			LogWriter.write( Level.ALL, "AD0130010"+" $Revision: 1.8 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AD0130010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AD0130010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0130010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0130010Entity entity = control.entity;
		AD0130010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("AD0130010-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ee.setLocale(CoreTools.getLocale(control.getsysUSER_CD()));
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AD0130010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0130010Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0130010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0130010Entity entity = control.entity;
		AD0130010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Select");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ee.setLocale(CoreTools.getLocale(control.getsysUSER_CD()));
			throw ee;
		}
                //}}user_implement_dev:<onClickSelect>
		logger.exiting("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0130010Control�N���X�C���X�^���X
	 */
	public String onClickLineInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0130010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0130010Entity entity = control.entity;
		AD0130010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsert");
		//{{user_implement_dev:<onClickLineInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("LineInsert");
			if (control.getMsgStruct().hasError()) {
				nextUrl = "AD0130010.jsp";
			} else {
				if ("1".equals(struct.getDAILY_WORK_REPORT_TYP())) {
					// �l����
					nextUrl = "AD0130011.jsp";
				}
			}
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ee.setLocale(CoreTools.getLocale(control.getsysUSER_CD()));
			throw ee;
		}
                //}}user_implement_dev:<onClickLineInsert>
		logger.exiting("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsert");

		return nextUrl;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0130010Control�N���X�C���X�^���X
	 */
	public String onClickLineUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0130010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0130010Entity entity = control.entity;
		AD0130010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdate");
		//{{user_implement_dev:<onClickLineUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("LineUpdate");
			
			if (control.getMsgStruct().hasError()) {
				nextUrl = "AD0130010.jsp";
			} else {
				if ("1".equals(struct.getDAILY_WORK_REPORT_TYP())) {
					// �l����
					nextUrl = "AD0130011.jsp";
				}
			}
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ee.setLocale(CoreTools.getLocale(control.getsysUSER_CD()));
			throw ee;
		}
                //}}user_implement_dev:<onClickLineUpdate>
		logger.exiting("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdate");

		return nextUrl;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0130010Control�N���X�C���X�^���X
	 */
	public String onClickLineDelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0130010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0130010Entity entity = control.entity;
		AD0130010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClickLineDelete");
		//{{user_implement_dev:<onClickLineDelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("LineDelete");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ee.setLocale(CoreTools.getLocale(control.getsysUSER_CD()));
			throw ee;
		}
                //}}user_implement_dev:<onClickLineDelete>
		logger.exiting("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClickLineDelete");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0130010Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0130010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0130010Entity entity = control.entity;
		AD0130010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
		//{{user_implement_dev:<onClickClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Clear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ee.setLocale(CoreTools.getLocale(control.getsysUSER_CD()));
			throw ee;
		}
                //}}user_implement_dev:<onClickClear>
		logger.exiting("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0130010Control�N���X�C���X�^���X
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0130010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0130010Entity entity = control.entity;
		AD0130010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
		//{{user_implement_dev:<onClickClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Close");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ee.setLocale(CoreTools.getLocale(control.getsysUSER_CD()));
			throw ee;
		}
                //}}user_implement_dev:<onClickClose>
		logger.exiting("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0130010Control�N���X�C���X�^���X
	 */
	public String onClicksub1_Return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0130010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0130010.jsp";		// �ړ���t�q�k
		AD0130010Entity entity = control.entity;
		AD0130010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1_Return");
		//{{user_implement_dev:<onClicksub1_Return>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("sub1_Return");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ee.setLocale(CoreTools.getLocale(control.getsysUSER_CD()));
			throw ee;
		}
                //}}user_implement_dev:<onClicksub1_Return>
		logger.exiting("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1_Return");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0130010Control�N���X�C���X�^���X
	 */
	public String onClicksub1_Insert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0130010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0130010.jsp";		// �ړ���t�q�k
		AD0130010Entity entity = control.entity;
		AD0130010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1_Insert");
		//{{user_implement_dev:<onClicksub1_Insert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("sub1_Insert");
			if (control.getMsgStruct().hasError()) {
				nextUrl = "/AD0130011.jsp";
			} else {
				// �����t�H�[���ɖ߂�
				control.controlsub1_Return();
			}
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ee.setLocale(CoreTools.getLocale(control.getsysUSER_CD()));
			throw ee;
		}
                //}}user_implement_dev:<onClicksub1_Insert>
		logger.exiting("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1_Insert");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0130010Control�N���X�C���X�^���X
	 */
	public String onClicksub1_Update(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0130010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0130010.jsp";		// �ړ���t�q�k
		AD0130010Entity entity = control.entity;
		AD0130010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1_Update");
		//{{user_implement_dev:<onClicksub1_Update>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("sub1_Update");
			if (control.getMsgStruct().hasError()) {
				nextUrl = "/AD0130011.jsp";
			} else {
				// �����t�H�[���ɖ߂�
				control.controlsub1_Return();
			}
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ee.setLocale(CoreTools.getLocale(control.getsysUSER_CD()));
			throw ee;
		}
                //}}user_implement_dev:<onClicksub1_Update>
		logger.exiting("AD0130010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1_Update");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AD0130010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] DAILY_WORK_REPORT_TYP = ((params.containsKey("DAILY_WORK_REPORT_TYP")) ? (String[])params.get("DAILY_WORK_REPORT_TYP") : (String[])null);
		String[] DAILY_WORK_REPORT_TYP_name = ((params.containsKey("DAILY_WORK_REPORT_TYP_name")) ? (String[])params.get("DAILY_WORK_REPORT_TYP_name") : (String[])null);
		String[] DAILY_WORK_REPORT_TYP_val = ((params.containsKey("DAILY_WORK_REPORT_TYP_val")) ? (String[])params.get("DAILY_WORK_REPORT_TYP_val") : (String[])null);
		String[] PLANT_CD = ((params.containsKey("PLANT_CD")) ? (String[])params.get("PLANT_CD") : (String[])null);
		String[] PLANT_NAME = ((params.containsKey("PLANT_NAME")) ? (String[])params.get("PLANT_NAME") : (String[])null);
		String[] OPR_DATE_FROM = ((params.containsKey("OPR_DATE_FROM")) ? (String[])params.get("OPR_DATE_FROM") : (String[])null);
		String[] OPR_DATE_TO = ((params.containsKey("OPR_DATE_TO")) ? (String[])params.get("OPR_DATE_TO") : (String[])null);
		String[] USER_CD = ((params.containsKey("USER_CD")) ? (String[])params.get("USER_CD") : (String[])null);
		String[] USER_NAME = ((params.containsKey("USER_NAME")) ? (String[])params.get("USER_NAME") : (String[])null);
		String[] WS_CD = ((params.containsKey("WS_CD")) ? (String[])params.get("WS_CD") : (String[])null);
		String[] WS_NAME = ((params.containsKey("WS_NAME")) ? (String[])params.get("WS_NAME") : (String[])null);
		String[] l_PLANT_CD = ((params.containsKey("l_PLANT_CD")) ? (String[])params.get("l_PLANT_CD") : (String[])null);
		String[] l_DAILY_WORK_REPORT_TYP_SHOW = ((params.containsKey("l_DAILY_WORK_REPORT_TYP_SHOW")) ? (String[])params.get("l_DAILY_WORK_REPORT_TYP_SHOW") : (String[])null);
		String[] l_USER_CD = ((params.containsKey("l_USER_CD")) ? (String[])params.get("l_USER_CD") : (String[])null);
		String[] l_OPR_DATE = ((params.containsKey("l_OPR_DATE")) ? (String[])params.get("l_OPR_DATE") : (String[])null);
		String[] l_WORK_SHIFT_CODE = ((params.containsKey("l_WORK_SHIFT_CODE")) ? (String[])params.get("l_WORK_SHIFT_CODE") : (String[])null);
		String[] l_START_TIME = ((params.containsKey("l_START_TIME")) ? (String[])params.get("l_START_TIME") : (String[])null);
		String[] l_END_TIME = ((params.containsKey("l_END_TIME")) ? (String[])params.get("l_END_TIME") : (String[])null);
		String[] l_OPR_TIME = ((params.containsKey("l_OPR_TIME")) ? (String[])params.get("l_OPR_TIME") : (String[])null);
		String[] l_WS_CD = ((params.containsKey("l_WS_CD")) ? (String[])params.get("l_WS_CD") : (String[])null);
		String[] l_OPR_TYP_SHOW = ((params.containsKey("l_OPR_TYP_SHOW")) ? (String[])params.get("l_OPR_TYP_SHOW") : (String[])null);
		String[] l_UN_OPR_CAUSE_TYP_SHOW = ((params.containsKey("l_UN_OPR_CAUSE_TYP_SHOW")) ? (String[])params.get("l_UN_OPR_CAUSE_TYP_SHOW") : (String[])null);
		String[] l_UN_OPR_TIME = ((params.containsKey("l_UN_OPR_TIME")) ? (String[])params.get("l_UN_OPR_TIME") : (String[])null);
		String[] l_DAILY_WORK_REPORT_CTL_NO = ((params.containsKey("l_DAILY_WORK_REPORT_CTL_NO")) ? (String[])params.get("l_DAILY_WORK_REPORT_CTL_NO") : (String[])null);
		String[] h_l_SEQ_NO = ((params.containsKey("h_l_SEQ_NO")) ? (String[])params.get("h_l_SEQ_NO") : (String[])null);
		String[] h_DAILY_WORK_REPORT_CTL_NO = ((params.containsKey("h_DAILY_WORK_REPORT_CTL_NO")) ? (String[])params.get("h_DAILY_WORK_REPORT_CTL_NO") : (String[])null);
		String[] OPR_DATE = ((params.containsKey("OPR_DATE")) ? (String[])params.get("OPR_DATE") : (String[])null);
		String[] WORK_SHIFT_CODE = ((params.containsKey("WORK_SHIFT_CODE")) ? (String[])params.get("WORK_SHIFT_CODE") : (String[])null);
		String[] WORK_SHIFT_NAME = ((params.containsKey("WORK_SHIFT_NAME")) ? (String[])params.get("WORK_SHIFT_NAME") : (String[])null);
		String[] l_SEQ_NO = ((params.containsKey("l_SEQ_NO")) ? (String[])params.get("l_SEQ_NO") : (String[])null);
		String[] l_WS_NAME = ((params.containsKey("l_WS_NAME")) ? (String[])params.get("l_WS_NAME") : (String[])null);
		String[] l_OPR_TYP = ((params.containsKey("l_OPR_TYP")) ? (String[])params.get("l_OPR_TYP") : (String[])null);
		String[] l_OPR_TYP_name = ((params.containsKey("l_OPR_TYP_name")) ? (String[])params.get("l_OPR_TYP_name") : (String[])null);
		String[] l_OPR_TYP_val = ((params.containsKey("l_OPR_TYP_val")) ? (String[])params.get("l_OPR_TYP_val") : (String[])null);
		String[] l_UN_OPR_CAUSE_TYP = ((params.containsKey("l_UN_OPR_CAUSE_TYP")) ? (String[])params.get("l_UN_OPR_CAUSE_TYP") : (String[])null);
		String[] l_UN_OPR_CAUSE_TYP_name = ((params.containsKey("l_UN_OPR_CAUSE_TYP_name")) ? (String[])params.get("l_UN_OPR_CAUSE_TYP_name") : (String[])null);
		String[] l_UN_OPR_CAUSE_TYP_val = ((params.containsKey("l_UN_OPR_CAUSE_TYP_val")) ? (String[])params.get("l_UN_OPR_CAUSE_TYP_val") : (String[])null);
		String[] l_REMARKS = ((params.containsKey("l_REMARKS")) ? (String[])params.get("l_REMARKS") : (String[])null);
		String[] h_l_MODIFY_COUNT = ((params.containsKey("h_l_MODIFY_COUNT")) ? (String[])params.get("h_l_MODIFY_COUNT") : (String[])null);
		String[] h_UpdateFlag = ((params.containsKey("h_UpdateFlag")) ? (String[])params.get("h_UpdateFlag") : (String[])null);

		struct.setDAILY_WORK_REPORT_TYP( ((DAILY_WORK_REPORT_TYP == null) ? (String)null : DAILY_WORK_REPORT_TYP[0]) );
		struct.setList_DAILY_WORK_REPORT_TYP(TypeConverter.convert(DAILY_WORK_REPORT_TYP));
		struct.setDAILY_WORK_REPORT_TYP_name( ((DAILY_WORK_REPORT_TYP_name == null) ? (String)null : DAILY_WORK_REPORT_TYP_name[0]) );
		struct.setList_DAILY_WORK_REPORT_TYP_name(TypeConverter.convert(DAILY_WORK_REPORT_TYP_name));
		struct.setDAILY_WORK_REPORT_TYP_val( ((DAILY_WORK_REPORT_TYP_val == null) ? (String)null : DAILY_WORK_REPORT_TYP_val[0]) );
		struct.setList_DAILY_WORK_REPORT_TYP_val(TypeConverter.convert(DAILY_WORK_REPORT_TYP_val));
		struct.setPLANT_CD( ((PLANT_CD == null) ? (String)null : PLANT_CD[0]) );
		struct.setList_PLANT_CD(TypeConverter.convert(PLANT_CD));
		struct.setPLANT_NAME( ((PLANT_NAME == null) ? (String)null : PLANT_NAME[0]) );
		struct.setList_PLANT_NAME(TypeConverter.convert(PLANT_NAME));
		struct.setOPR_DATE_FROM( ((OPR_DATE_FROM == null) ? (String)null : OPR_DATE_FROM[0]) );
		struct.setList_OPR_DATE_FROM(TypeConverter.convert(OPR_DATE_FROM));
		struct.setOPR_DATE_TO( ((OPR_DATE_TO == null) ? (String)null : OPR_DATE_TO[0]) );
		struct.setList_OPR_DATE_TO(TypeConverter.convert(OPR_DATE_TO));
		struct.setUSER_CD( ((USER_CD == null) ? (String)null : USER_CD[0]) );
		struct.setList_USER_CD(TypeConverter.convert(USER_CD));
		struct.setUSER_NAME( ((USER_NAME == null) ? (String)null : USER_NAME[0]) );
		struct.setList_USER_NAME(TypeConverter.convert(USER_NAME));
		struct.setWS_CD( ((WS_CD == null) ? (String)null : WS_CD[0]) );
		struct.setList_WS_CD(TypeConverter.convert(WS_CD));
		struct.setWS_NAME( ((WS_NAME == null) ? (String)null : WS_NAME[0]) );
		struct.setList_WS_NAME(TypeConverter.convert(WS_NAME));
		struct.setl_PLANT_CD( ((l_PLANT_CD == null) ? (String)null : l_PLANT_CD[0]) );
		struct.setList_l_PLANT_CD(TypeConverter.convert(l_PLANT_CD));
		struct.setl_DAILY_WORK_REPORT_TYP_SHOW( ((l_DAILY_WORK_REPORT_TYP_SHOW == null) ? (String)null : l_DAILY_WORK_REPORT_TYP_SHOW[0]) );
		struct.setList_l_DAILY_WORK_REPORT_TYP_SHOW(TypeConverter.convert(l_DAILY_WORK_REPORT_TYP_SHOW));
		struct.setl_USER_CD( ((l_USER_CD == null) ? (String)null : l_USER_CD[0]) );
		struct.setList_l_USER_CD(TypeConverter.convert(l_USER_CD));
		struct.setl_OPR_DATE( ((l_OPR_DATE == null) ? (String)null : l_OPR_DATE[0]) );
		struct.setList_l_OPR_DATE(TypeConverter.convert(l_OPR_DATE));
		struct.setl_WORK_SHIFT_CODE( ((l_WORK_SHIFT_CODE == null) ? (String)null : l_WORK_SHIFT_CODE[0]) );
		struct.setList_l_WORK_SHIFT_CODE(TypeConverter.convert(l_WORK_SHIFT_CODE));
		struct.setl_START_TIME( ((l_START_TIME == null) ? (String)null : l_START_TIME[0]) );
		struct.setList_l_START_TIME(TypeConverter.convert(l_START_TIME));
		struct.setl_END_TIME( ((l_END_TIME == null) ? (String)null : l_END_TIME[0]) );
		struct.setList_l_END_TIME(TypeConverter.convert(l_END_TIME));
		struct.setl_OPR_TIME( ((l_OPR_TIME == null) ? (String)null : l_OPR_TIME[0]) );
		struct.setList_l_OPR_TIME(TypeConverter.convert(l_OPR_TIME));
		struct.setl_WS_CD( ((l_WS_CD == null) ? (String)null : l_WS_CD[0]) );
		struct.setList_l_WS_CD(TypeConverter.convert(l_WS_CD));
		struct.setl_OPR_TYP_SHOW( ((l_OPR_TYP_SHOW == null) ? (String)null : l_OPR_TYP_SHOW[0]) );
		struct.setList_l_OPR_TYP_SHOW(TypeConverter.convert(l_OPR_TYP_SHOW));
		struct.setl_UN_OPR_CAUSE_TYP_SHOW( ((l_UN_OPR_CAUSE_TYP_SHOW == null) ? (String)null : l_UN_OPR_CAUSE_TYP_SHOW[0]) );
		struct.setList_l_UN_OPR_CAUSE_TYP_SHOW(TypeConverter.convert(l_UN_OPR_CAUSE_TYP_SHOW));
		struct.setl_UN_OPR_TIME( ((l_UN_OPR_TIME == null) ? (String)null : l_UN_OPR_TIME[0]) );
		struct.setList_l_UN_OPR_TIME(TypeConverter.convert(l_UN_OPR_TIME));
		struct.setl_DAILY_WORK_REPORT_CTL_NO( ((l_DAILY_WORK_REPORT_CTL_NO == null) ? (String)null : l_DAILY_WORK_REPORT_CTL_NO[0]) );
		struct.setList_l_DAILY_WORK_REPORT_CTL_NO(TypeConverter.convert(l_DAILY_WORK_REPORT_CTL_NO));
		struct.seth_l_SEQ_NO( ((h_l_SEQ_NO == null) ? (String)null : h_l_SEQ_NO[0]) );
		struct.setList_h_l_SEQ_NO(TypeConverter.convert(h_l_SEQ_NO));
		struct.seth_DAILY_WORK_REPORT_CTL_NO( ((h_DAILY_WORK_REPORT_CTL_NO == null) ? (String)null : h_DAILY_WORK_REPORT_CTL_NO[0]) );
		struct.setList_h_DAILY_WORK_REPORT_CTL_NO(TypeConverter.convert(h_DAILY_WORK_REPORT_CTL_NO));
		struct.setOPR_DATE( ((OPR_DATE == null) ? (String)null : OPR_DATE[0]) );
		struct.setList_OPR_DATE(TypeConverter.convert(OPR_DATE));
		struct.setWORK_SHIFT_CODE( ((WORK_SHIFT_CODE == null) ? (String)null : WORK_SHIFT_CODE[0]) );
		struct.setList_WORK_SHIFT_CODE(TypeConverter.convert(WORK_SHIFT_CODE));
		struct.setWORK_SHIFT_NAME( ((WORK_SHIFT_NAME == null) ? (String)null : WORK_SHIFT_NAME[0]) );
		struct.setList_WORK_SHIFT_NAME(TypeConverter.convert(WORK_SHIFT_NAME));
		struct.setl_SEQ_NO( ((l_SEQ_NO == null) ? (String)null : l_SEQ_NO[0]) );
		struct.setList_l_SEQ_NO(TypeConverter.convert(l_SEQ_NO));
		struct.setl_WS_NAME( ((l_WS_NAME == null) ? (String)null : l_WS_NAME[0]) );
		struct.setList_l_WS_NAME(TypeConverter.convert(l_WS_NAME));
		struct.setl_OPR_TYP( ((l_OPR_TYP == null) ? (String)null : l_OPR_TYP[0]) );
		struct.setList_l_OPR_TYP(TypeConverter.convert(l_OPR_TYP));
		struct.setl_OPR_TYP_name( ((l_OPR_TYP_name == null) ? (String)null : l_OPR_TYP_name[0]) );
		struct.setList_l_OPR_TYP_name(TypeConverter.convert(l_OPR_TYP_name));
		struct.setl_OPR_TYP_val( ((l_OPR_TYP_val == null) ? (String)null : l_OPR_TYP_val[0]) );
		struct.setList_l_OPR_TYP_val(TypeConverter.convert(l_OPR_TYP_val));
		struct.setl_UN_OPR_CAUSE_TYP( ((l_UN_OPR_CAUSE_TYP == null) ? (String)null : l_UN_OPR_CAUSE_TYP[0]) );
		struct.setList_l_UN_OPR_CAUSE_TYP(TypeConverter.convert(l_UN_OPR_CAUSE_TYP));
		struct.setl_UN_OPR_CAUSE_TYP_name( ((l_UN_OPR_CAUSE_TYP_name == null) ? (String)null : l_UN_OPR_CAUSE_TYP_name[0]) );
		struct.setList_l_UN_OPR_CAUSE_TYP_name(TypeConverter.convert(l_UN_OPR_CAUSE_TYP_name));
		struct.setl_UN_OPR_CAUSE_TYP_val( ((l_UN_OPR_CAUSE_TYP_val == null) ? (String)null : l_UN_OPR_CAUSE_TYP_val[0]) );
		struct.setList_l_UN_OPR_CAUSE_TYP_val(TypeConverter.convert(l_UN_OPR_CAUSE_TYP_val));
		struct.setl_REMARKS( ((l_REMARKS == null) ? (String)null : l_REMARKS[0]) );
		struct.setList_l_REMARKS(TypeConverter.convert(l_REMARKS));
		struct.seth_l_MODIFY_COUNT( ((h_l_MODIFY_COUNT == null) ? (String)null : h_l_MODIFY_COUNT[0]) );
		struct.setList_h_l_MODIFY_COUNT(TypeConverter.convert(h_l_MODIFY_COUNT));
		struct.seth_UpdateFlag( ((h_UpdateFlag == null) ? (String)null : h_UpdateFlag[0]) );
		struct.setList_h_UpdateFlag(TypeConverter.convert(h_UpdateFlag));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AD0130010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAD0130010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAD0130010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AD0130010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0130010Entity entity = control.entity;
		AD0130010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AD0130010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AD0130010Control control;
		AD0130010Entity  entity = null;
		AD0130010Struct  struct = null;

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

			if( (control = (AD0130010Control)so.getAttribute("AD0130010Control_"+request.getSession(false).getId())) == null ) {
				control = new AD0130010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AD0130010Control();
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
				} else if( isClick(request, "LineInsert") ) {
					if ( !isCryptical(request, so, params, "LineInsert") ) return ERROR_TARGET;
					target = onClickLineInsert(request, response, so, params, control);
					control.setButton("LineInsert");
				} else if( isClick(request, "LineUpdate") ) {
					if ( !isCryptical(request, so, params, "LineUpdate") ) return ERROR_TARGET;
					target = onClickLineUpdate(request, response, so, params, control);
					control.setButton("LineUpdate");
				} else if( isClick(request, "LineDelete") ) {
					if ( !isCryptical(request, so, params, "LineDelete") ) return ERROR_TARGET;
					target = onClickLineDelete(request, response, so, params, control);
					control.setButton("LineDelete");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else if( isClick(request, "sub1_Return") ) {
					if ( !isCryptical(request, so, params, "sub1_Return") ) return ERROR_TARGET;
					target = onClicksub1_Return(request, response, so, params, control);
					control.setButton("sub1_Return");
				} else if( isClick(request, "sub1_Insert") ) {
					if ( !isCryptical(request, so, params, "sub1_Insert") ) return ERROR_TARGET;
					target = onClicksub1_Insert(request, response, so, params, control);
					control.setButton("sub1_Insert");
				} else if( isClick(request, "sub1_Update") ) {
					if ( !isCryptical(request, so, params, "sub1_Update") ) return ERROR_TARGET;
					target = onClicksub1_Update(request, response, so, params, control);
					control.setButton("sub1_Update");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AD0130010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "LineInsert") && bFLG_DISCONNECT_LineInsert)
				|| (isClick(request, "LineUpdate") && bFLG_DISCONNECT_LineUpdate)
				|| (isClick(request, "LineDelete") && bFLG_DISCONNECT_LineDelete)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "sub1_Return") && bFLG_DISCONNECT_sub1_Return)
				|| (isClick(request, "sub1_Insert") && bFLG_DISCONNECT_sub1_Insert)
				|| (isClick(request, "sub1_Update") && bFLG_DISCONNECT_sub1_Update)
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
	private  static boolean bFLG_DISCONNECT_LineInsert = true;
	private  static boolean bFLG_DISCONNECT_LineUpdate = true;
	private  static boolean bFLG_DISCONNECT_LineDelete = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_sub1_Return = true;
	private  static boolean bFLG_DISCONNECT_sub1_Insert = true;
	private  static boolean bFLG_DISCONNECT_sub1_Update = true;

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
		return "com.nec.jp.orteus.metamorBase.AD0130.AD0130010Servlet";
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
	public AD0130010Servlet()
	{
		//{{user_implement_dev:<AD0130010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_LineInsert = true;
		bFLG_DISCONNECT_LineUpdate = true;
		bFLG_DISCONNECT_LineDelete = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;
		bFLG_DISCONNECT_sub1_Return = true;
		bFLG_DISCONNECT_sub1_Insert = true;
		bFLG_DISCONNECT_sub1_Update = true;

                //}}user_implement_dev:<AD0130010_DisConnect_FLG>

		//{{user_implement_dev:<AD0130010Servlet>
//			bFLG_CSRF = false; // CSRF�̂��߂̔�����s��Ȃ��ꍇ�́A�R�����g�A�E�g���͂����Ă�������

			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<AD0130010Servlet>
	}

	//////////////////////////////

}
