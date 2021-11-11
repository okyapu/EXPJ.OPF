/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0040/src/com/nec/jp/orteus/metamorBase/AZ0040/AZ0040010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0040;

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
 * CLASS     : AZ0040010Servlet �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class AZ0040010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
               //-------------------------------------------------------------------------
               /** 
                * �����ݒ��ʂ̓��͂̎擾���Acontrol�̃����o�֐ݒ肷��
                * @param HttpServletRequest request
                * @param Hashtable params
                * @param AZ0040010Struct control
               */
               private void setInput2Struct(
                   HttpServletRequest request,
                   Hashtable params,
                   AZ0040010Control control)
               {
                List w_list = control.getColumnList();
              
                String[] types = ((params.containsKey("sub1COND_TYPE")) ? (String[])params.get("sub1COND_TYPE") : (String[])null);
                String[] value1 = ((params.containsKey("sub1COND_VALUE1")) ? (String[])params.get("sub1COND_VALUE1") : (String[])null);
                String[] value2 = ((params.containsKey("sub1COND_VALUE2")) ? (String[])params.get("sub1COND_VALUE2") : (String[])null);
                String[] displays = ((params.containsKey("sub1DISPLAY_FLG")) ? (String[])params.get("sub1DISPLAY_FLG") : (String[])null);
                String[] sorttypes = ((params.containsKey("sub1SORT_TYPE")) ? (String[])params.get("sub1SORT_TYPE") : (String[])null);
                String[] sortkeys = ((params.containsKey("sub1SORTKEY_PRI")) ? (String[])params.get("sub1SORTKEY_PRI") : (String[])null);
                for(int i = 0; i < w_list.size(); i++)
                {
                 AZ0040010Struct temp_struct = (AZ0040010Struct)w_list.get(i);
                 if( types == null || types[i] == null ){
                  temp_struct.setsub1COND_TYPE(null);
                 } else {
                  temp_struct.setsub1COND_TYPE(new String(types[i]));
                 }
              
                 if( value1 == null || value1[i] == null ){
                  temp_struct.setsub1COND_VALUE1(null);
                 } else {
                  temp_struct.setsub1COND_VALUE1(new String(value1[i]));
                 }
              
                 if( value2 == null || value2[i] == null ){
                  temp_struct.setsub1COND_VALUE2(null);
                 } else {
                  temp_struct.setsub1COND_VALUE2(new String(value2[i]));
                 }
              
                 if( displays == null || displays[i] == null ){
                  temp_struct.setsub1DISPLAY_FLG(null);
                 } else {
                  temp_struct.setsub1DISPLAY_FLG(new String(displays[i]));
                 }
              
                 if( sorttypes == null || sorttypes[i] == null ){
                  temp_struct.setsub1SORT_TYPE(null);
                 } else {
                  temp_struct.setsub1SORT_TYPE(new String(sorttypes[i]));
                 }
              
                 if( sortkeys == null || sortkeys[i] == null ){
                  temp_struct.setsub1SORTKEY_PRI(null);
                 } else {
                  temp_struct.setsub1SORTKEY_PRI(new String(sortkeys[i]));
                 }
                }
               }
              
              
               /** 
                * �e�[�u���I����ʂ̓��͂��擾���Astruct�֐ݒ肷��
               */
               private int setSelectTabl2Struct(
                   HttpServletRequest request,
                   Hashtable params,
                   AZ0040010Struct struct){
              
                List l_table = new ArrayList();
                List l_comment = new ArrayList();
                int ret = 0;
              
                // ��ʂ��f�[�^���擾
                String[] tbl = ((params.containsKey("h_TABLE_TO")) ? (String[])params.get("h_TABLE_TO") : (String[])null);
                String[] comment = ((params.containsKey("h_TABLE_COMMENT_TO")) ? (String[])params.get("h_TABLE_COMMENT_TO") : (String[])null);
              
                if(tbl != null){
                 for(int i=0; i<tbl.length; i++)
                 {
                  l_table.add(tbl[i]);
                  l_comment.add(comment[i]);
                 }
                 ret = tbl.length;
                }
              
                // �I���e�[�u�����X�g��Struct�ɃZ�b�g
                struct.setList_h_TABLE_TO(l_table);
                struct.setList_h_TABLE_COMMENT_TO(l_comment);
              
                return ret;
               }
              
              
               /** 
                * �Ώۍ��ڑI����ʂ̓��͂��擾���Astruct�֐ݒ肷��
               */
               private void setSelectItem2Struct(
                   HttpServletRequest request,
                   Hashtable params,
                   AZ0040010Struct struct){
              
                List l_col = new ArrayList();
                List l_alias = new ArrayList();
                List l_table_name = new ArrayList();
              
                // ��ʂ��f�[�^���擾
                String[] col = ((params.containsKey("h_COLUMN")) ? (String[])params.get("h_COLUMN") : (String[])null);
                String[] alias = ((params.containsKey("h_TABLE_ALIAS")) ? (String[])params.get("h_TABLE_ALIAS") : (String[])null);
                String[] table_name = ((params.containsKey("h_TABLE_NAME")) ? (String[])params.get("h_TABLE_NAME") : (String[])null);
                if(col != null){
                 for(int i=0; i<col.length; i++)
                 {
                  l_col.add(col[i]);
                  l_alias.add(alias[i]);
                  l_table_name.add(table_name[i]);
                 }
                }
              
                // �I���e�[�u�����X�g��Struct�ɃZ�b�g
                struct.l_h_COLUMN.clear();
                struct.l_h_TABLE_ALIAS.clear();
                struct.l_h_TABLE_NAME.clear();
                struct.setList_h_COLUMN(l_col);
                struct.setList_h_TABLE_ALIAS(l_alias);
                struct.setList_h_TABLE_NAME(l_table_name);
               }
              
              
               /** 
                * ���������ݒ��ʂ̓��͂��擾���Astruct�֐ݒ肷��
               */
               private void setJoin2Struct(
                   HttpServletRequest request,
                   Hashtable params,
                   AZ0040010Struct struct){
              
                List l_left_name = new ArrayList();
                List l_left_alias = new ArrayList();
                List l_left_col = new ArrayList();
                List l_right_name = new ArrayList();
                List l_right_alias = new ArrayList();
                List l_right_col = new ArrayList();
                List l_cond = new ArrayList();
              
                // ��ʂ��f�[�^���擾
                String[] left_name = ((params.containsKey("h_LEFT_TABLE_NAME")) ? (String[])params.get("h_LEFT_TABLE_NAME") : (String[])null);
                String[] left_alias = ((params.containsKey("h_LEFT_TABLE_ALIAS")) ? (String[])params.get("h_LEFT_TABLE_ALIAS") : (String[])null);
                String[] left_col = ((params.containsKey("h_LEFT_COLUMN")) ? (String[])params.get("h_LEFT_COLUMN") : (String[])null);
                String[] right_name = ((params.containsKey("h_RIGHT_TABLE_NAME")) ? (String[])params.get("h_RIGHT_TABLE_NAME") : (String[])null);
                String[] right_alias = ((params.containsKey("h_RIGHT_TABLE_ALIAS")) ? (String[])params.get("h_RIGHT_TABLE_ALIAS") : (String[])null);
                String[] right_col = ((params.containsKey("h_RIGHT_COLUMN")) ? (String[])params.get("h_RIGHT_COLUMN") : (String[])null);
                String[] cond = ((params.containsKey("h_CONDITION")) ? (String[])params.get("h_CONDITION") : (String[])null);
              
                if(left_name != null){
                 for(int i=0; i<left_name.length; i++)
                 {
                  l_left_name.add(left_name[i]);
                  l_left_alias.add(left_alias[i]);
                  l_left_col.add(left_col[i]);
                  l_right_name.add(right_name[i]);
                  l_right_alias.add(right_alias[i]);
                  l_right_col.add(right_col[i]);
                  l_cond.add(cond[i]);
                 }
                }
              
                // �I���e�[�u�����X�g��Struct�ɃZ�b�g
                struct.l_h_LEFT_TABLE_NAME.clear();
                struct.l_h_LEFT_TABLE_ALIAS.clear();
                struct.l_h_LEFT_COLUMN.clear();
                struct.l_h_RIGHT_TABLE_NAME.clear();
                struct.l_h_RIGHT_TABLE_ALIAS.clear();
                struct.l_h_RIGHT_COLUMN.clear();
                struct.l_h_CONDITION.clear();
                struct.setList_h_LEFT_TABLE_NAME(l_left_name);
                struct.setList_h_LEFT_TABLE_ALIAS(l_left_alias);
                struct.setList_h_LEFT_COLUMN(l_left_col);
                struct.setList_h_RIGHT_TABLE_NAME(l_right_name);
                struct.setList_h_RIGHT_TABLE_ALIAS(l_right_alias);
                struct.setList_h_RIGHT_COLUMN(l_right_col);
                struct.setList_h_CONDITION(l_cond);
               }
              
               //-------------------------------------------------------------------------

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
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AZ0040010Control control)
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
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AZ0040010Control control)
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
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0040010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0040010Entity entity = control.entity;
		AZ0040010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
			logger.entering("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
            objMessage.m_writer.write( Level.ALL, "AZ0040010"+" $Revision: 1.12 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0040010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0040010Entity entity = control.entity;
		AZ0040010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                              //---------------------------------------------------------------------
                              try {
                            
                               //�����[�h����
                               setScreenMoveParams(params, control);
                               control.control_eventHandller("reload");
                               if(control.isScreenMove()) {
                                getSessionParameters(so, params, struct);
                                control.control_eventHandller("select");
                               }
                            
                              } catch ( FoundationException e ) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                              //---------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0040010Entity entity = control.entity;
		AZ0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                              //------------------------------------------------------------------
                              try {
                            
                               control.setKeyStruct(struct);
                            
                               //�Ǎ�����
                               control.control_eventHandller("select");
                            
                              }catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                            
                              }
                              //------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0040010Entity entity = control.entity;
		AZ0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                              //------------------------------------------------------------------
                              try {
                            
                               //�N���A�{�^��
                               control.control_eventHandller("clear");
                            
                              }catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                            
                              }
                              //------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 */
	public String onClickclose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0040010Entity entity = control.entity;
		AZ0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClickclose");
		//{{user_implement_dev:<onClickclose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                              //------------------------------------------------------------------
                              boolean lockStatus = false;    // ���b�N�������
                              try {
                            
                               // ����
                               control.control_eventHandller("close");
                            
                              }catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                            
                              }
                              //------------------------------------------------------------------
                //}}user_implement_dev:<onClickclose>
		logger.exiting("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClickclose");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 */
	public String onClicksub1clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0040010Entity entity = control.entity;
		AZ0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1clear");
		//{{user_implement_dev:<onClicksub1clear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                              //------------------------------------------------------------------
                              try {
                            
                               //�N���A�{�^��
                               control.control_eventHandller("sub1clear");
                            
                               // �q��ʂɑJ��
                               nextUrl = "/AZ0040011.jsp";
                            
                              }catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                            
                              }
                              //------------------------------------------------------------------
                //}}user_implement_dev:<onClicksub1clear>
		logger.exiting("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1clear");

		return nextUrl;
	}

	/**
	 * �b�r�u�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 */
	public String onClicksub2csv(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0040010Entity entity = control.entity;
		AZ0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2csv");
		//{{user_implement_dev:<onClicksub2csv>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub2csv");
                               
                               List csvList = control.getCsvList();
                               if(csvList != null && csvList.size() > 0){
                                try{
                                 String filename = CsvWriter.getFileName(request.getRemoteUser());
                                 CsvWriter csvWriter = new CsvWriter(filename);
                                 csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),false);
                                 nextUrl = csvWriter.getUrl(response);//�_�E�����[�h���L�q
                            
                                 // �b�r�u�o�͏�񃍃O�\��
                                 String siz = TypeConverter.convert(csvList.size());
                                 
                                 ExpjMessage emsg = new ExpjMessage("ZZ01006", "FILENAME:" + filename); //�G���[�ڍ�
                                 control.sysLog.info(emsg, control.getsysUSER_CD());
                                 emsg = new ExpjMessage("ZZ01006", "COUNT:" + siz); //�G���[�ڍ�
                                 control.sysLog.info(emsg, control.getsysUSER_CD());
                                          emsg = new ExpjMessage("ZZ01006", "The CSV file was outputted."); //�G���[�ڍ�
                                 control.sysLog.info(emsg, control.getsysUSER_CD());
                            
                                }catch(Exception e){
                                 //CSV�o�͎��s
                                 ExpjException ee = new ExpjException("ZZ01107");
                                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                                 ee.add(emsg);
                                 throw ee;
                                }
                               }
                            
                              }catch(FoundationException e){
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub2csv>
		logger.exiting("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2csv");

		return nextUrl;
	}

	/**
	 * �������s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 */
	public String onClickexecute(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0040010Entity entity = control.entity;
		AZ0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClickexecute");
		//{{user_implement_dev:<onClickexecute>
                              //------------------------------------------------------------------
                              try {
                            
                               // �X�V�Ώۂ̍\�����No�擾
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               // �������s
                               control.control_eventHandller("execute");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0040010.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �q��ʂɑJ��
                                nextUrl = "/AZ0040012.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickexecute>
		logger.exiting("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClickexecute");

		return nextUrl;
	}

	/**
	 * ���������ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 */
	public String onClickcondition(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0040010Entity entity = control.entity;
		AZ0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClickcondition");
		//{{user_implement_dev:<onClickcondition>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                              //------------------------------------------------------------------
                              try {
                            
                               // �X�V�Ώۂ̍\�����No�擾
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               // ���������ݒ�
                               control.control_eventHandller("condition");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0040010.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �q��ʂɑJ��
                                nextUrl = "/AZ0040011.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickcondition>
		logger.exiting("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClickcondition");

		return nextUrl;
	}

	/**
	 * �������s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 */
	public String onClicksub1execute(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0040010Entity entity = control.entity;
		AZ0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1execute");
		//{{user_implement_dev:<onClicksub1execute>
                              //------------------------------------------------------------------
                              try {
                               setInput2Struct(request,params,control);
                               //�������s��
                               control.control_eventHandller("sub1execute");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0040011.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                nextUrl = "/AZ0040012.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub1execute>
		logger.exiting("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1execute");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 */
	public String onClicksub1return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0040010Entity entity = control.entity;
		AZ0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1return");
		//{{user_implement_dev:<onClicksub1return>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub1return");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0040011.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub1return>
		logger.exiting("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1return");

		return nextUrl;
	}

	/**
	 * ���������ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 */
	public String onClicksub2condition(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0040010Entity entity = control.entity;
		AZ0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2condition");
		//{{user_implement_dev:<onClicksub2condition>
                              try {
                            
                               control.control_eventHandller("sub2condition");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0040012.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �q��ʂɑJ��
                                nextUrl = "/AZ0040011.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub2condition>
		logger.exiting("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2condition");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0040010Control�N���X�C���X�^���X
	 */
	public String onClicksub2return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0040010Entity entity = control.entity;
		AZ0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2return");
		//{{user_implement_dev:<onClicksub2return>
                              //------------------------------------------------------------------
                              try {
                            
                               // �Ǎ�����
                               control.control_eventHandller("sub2return");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0040012.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub2return>
		logger.exiting("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2return");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AZ0040010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] w_QUERY_NAME = ((params.containsKey("w_QUERY_NAME")) ? (String[])params.get("w_QUERY_NAME") : (String[])null);
		String[] w_QUERY_GROUP = ((params.containsKey("w_QUERY_GROUP")) ? (String[])params.get("w_QUERY_GROUP") : (String[])null);
		String[] w_MEMO = ((params.containsKey("w_MEMO")) ? (String[])params.get("w_MEMO") : (String[])null);
		String[] w_CREATED_BY = ((params.containsKey("w_CREATED_BY")) ? (String[])params.get("w_CREATED_BY") : (String[])null);
		String[] w_CREATED_DATE_FROM = ((params.containsKey("w_CREATED_DATE_FROM")) ? (String[])params.get("w_CREATED_DATE_FROM") : (String[])null);
		String[] w_CREATED_DATE_TO = ((params.containsKey("w_CREATED_DATE_TO")) ? (String[])params.get("w_CREATED_DATE_TO") : (String[])null);
		String[] QUERY_NAME = ((params.containsKey("QUERY_NAME")) ? (String[])params.get("QUERY_NAME") : (String[])null);
		String[] QUERY_GROUP = ((params.containsKey("QUERY_GROUP")) ? (String[])params.get("QUERY_GROUP") : (String[])null);
		String[] QUERY_MEMO = ((params.containsKey("QUERY_MEMO")) ? (String[])params.get("QUERY_MEMO") : (String[])null);
		String[] CREATED_BY = ((params.containsKey("CREATED_BY")) ? (String[])params.get("CREATED_BY") : (String[])null);
		String[] CREATED_DATE = ((params.containsKey("CREATED_DATE")) ? (String[])params.get("CREATED_DATE") : (String[])null);
		String[] UPDATED_BY = ((params.containsKey("UPDATED_BY")) ? (String[])params.get("UPDATED_BY") : (String[])null);
		String[] UPDATED_DATE = ((params.containsKey("UPDATED_DATE")) ? (String[])params.get("UPDATED_DATE") : (String[])null);
		String[] sub1COLUMN_TYPE = ((params.containsKey("sub1COLUMN_TYPE")) ? (String[])params.get("sub1COLUMN_TYPE") : (String[])null);
		String[] sub1COND_TYPE = ((params.containsKey("sub1COND_TYPE")) ? (String[])params.get("sub1COND_TYPE") : (String[])null);
		String[] sub1COND_TYPE_name = ((params.containsKey("sub1COND_TYPE_name")) ? (String[])params.get("sub1COND_TYPE_name") : (String[])null);
		String[] sub1COND_TYPE_val = ((params.containsKey("sub1COND_TYPE_val")) ? (String[])params.get("sub1COND_TYPE_val") : (String[])null);
		String[] sub1COND_VALUE1 = ((params.containsKey("sub1COND_VALUE1")) ? (String[])params.get("sub1COND_VALUE1") : (String[])null);
		String[] sub1COND_VALUE2 = ((params.containsKey("sub1COND_VALUE2")) ? (String[])params.get("sub1COND_VALUE2") : (String[])null);
		String[] sub1DISPLAY_FLG = ((params.containsKey("sub1DISPLAY_FLG")) ? (String[])params.get("sub1DISPLAY_FLG") : (String[])null);
		String[] sub1SORT_TYPE = ((params.containsKey("sub1SORT_TYPE")) ? (String[])params.get("sub1SORT_TYPE") : (String[])null);
		String[] sub1SORT_TYPE_name = ((params.containsKey("sub1SORT_TYPE_name")) ? (String[])params.get("sub1SORT_TYPE_name") : (String[])null);
		String[] sub1SORT_TYPE_val = ((params.containsKey("sub1SORT_TYPE_val")) ? (String[])params.get("sub1SORT_TYPE_val") : (String[])null);
		String[] sub1SORTKEY_PRI = ((params.containsKey("sub1SORTKEY_PRI")) ? (String[])params.get("sub1SORTKEY_PRI") : (String[])null);
		String[] sub1TABLE_NAME_COMMENT = ((params.containsKey("sub1TABLE_NAME_COMMENT")) ? (String[])params.get("sub1TABLE_NAME_COMMENT") : (String[])null);
		String[] sub1TABLE_NAME = ((params.containsKey("sub1TABLE_NAME")) ? (String[])params.get("sub1TABLE_NAME") : (String[])null);
		String[] sub1COLUMN_NAME = ((params.containsKey("sub1COLUMN_NAME")) ? (String[])params.get("sub1COLUMN_NAME") : (String[])null);
		String[] sub1COLUMN_NAME_COMMENT = ((params.containsKey("sub1COLUMN_NAME_COMMENT")) ? (String[])params.get("sub1COLUMN_NAME_COMMENT") : (String[])null);
		String[] EDIT_TYP = ((params.containsKey("EDIT_TYP")) ? (String[])params.get("EDIT_TYP") : (String[])null);
		String[] EDIT_NAME = ((params.containsKey("EDIT_NAME")) ? (String[])params.get("EDIT_NAME") : (String[])null);

		struct.setw_QUERY_NAME( ((w_QUERY_NAME == null) ? (String)null : w_QUERY_NAME[0]) );
		struct.setList_w_QUERY_NAME(TypeConverter.convert(w_QUERY_NAME));
		struct.setw_QUERY_GROUP( ((w_QUERY_GROUP == null) ? (String)null : w_QUERY_GROUP[0]) );
		struct.setList_w_QUERY_GROUP(TypeConverter.convert(w_QUERY_GROUP));
		struct.setw_MEMO( ((w_MEMO == null) ? (String)null : w_MEMO[0]) );
		struct.setList_w_MEMO(TypeConverter.convert(w_MEMO));
		struct.setw_CREATED_BY( ((w_CREATED_BY == null) ? (String)null : w_CREATED_BY[0]) );
		struct.setList_w_CREATED_BY(TypeConverter.convert(w_CREATED_BY));
		struct.setw_CREATED_DATE_FROM( ((w_CREATED_DATE_FROM == null) ? (String)null : w_CREATED_DATE_FROM[0]) );
		struct.setList_w_CREATED_DATE_FROM(TypeConverter.convert(w_CREATED_DATE_FROM));
		struct.setw_CREATED_DATE_TO( ((w_CREATED_DATE_TO == null) ? (String)null : w_CREATED_DATE_TO[0]) );
		struct.setList_w_CREATED_DATE_TO(TypeConverter.convert(w_CREATED_DATE_TO));
		struct.setQUERY_NAME( ((QUERY_NAME == null) ? (String)null : QUERY_NAME[0]) );
		struct.setList_QUERY_NAME(TypeConverter.convert(QUERY_NAME));
		struct.setQUERY_GROUP( ((QUERY_GROUP == null) ? (String)null : QUERY_GROUP[0]) );
		struct.setList_QUERY_GROUP(TypeConverter.convert(QUERY_GROUP));
		struct.setQUERY_MEMO( ((QUERY_MEMO == null) ? (String)null : QUERY_MEMO[0]) );
		struct.setList_QUERY_MEMO(TypeConverter.convert(QUERY_MEMO));
		struct.setCREATED_BY( ((CREATED_BY == null) ? (String)null : CREATED_BY[0]) );
		struct.setList_CREATED_BY(TypeConverter.convert(CREATED_BY));
		struct.setCREATED_DATE( ((CREATED_DATE == null) ? (String)null : CREATED_DATE[0]) );
		struct.setList_CREATED_DATE(TypeConverter.convert(CREATED_DATE));
		struct.setUPDATED_BY( ((UPDATED_BY == null) ? (String)null : UPDATED_BY[0]) );
		struct.setList_UPDATED_BY(TypeConverter.convert(UPDATED_BY));
		struct.setUPDATED_DATE( ((UPDATED_DATE == null) ? (String)null : UPDATED_DATE[0]) );
		struct.setList_UPDATED_DATE(TypeConverter.convert(UPDATED_DATE));
		struct.setsub1COLUMN_TYPE( ((sub1COLUMN_TYPE == null) ? (String)null : sub1COLUMN_TYPE[0]) );
		struct.setList_sub1COLUMN_TYPE(TypeConverter.convert(sub1COLUMN_TYPE));
		struct.setsub1COND_TYPE( ((sub1COND_TYPE == null) ? (String)null : sub1COND_TYPE[0]) );
		struct.setList_sub1COND_TYPE(TypeConverter.convert(sub1COND_TYPE));
		struct.setsub1COND_TYPE_name( ((sub1COND_TYPE_name == null) ? (String)null : sub1COND_TYPE_name[0]) );
		struct.setList_sub1COND_TYPE_name(TypeConverter.convert(sub1COND_TYPE_name));
		struct.setsub1COND_TYPE_val( ((sub1COND_TYPE_val == null) ? (String)null : sub1COND_TYPE_val[0]) );
		struct.setList_sub1COND_TYPE_val(TypeConverter.convert(sub1COND_TYPE_val));
		struct.setsub1COND_VALUE1( ((sub1COND_VALUE1 == null) ? (String)null : sub1COND_VALUE1[0]) );
		struct.setList_sub1COND_VALUE1(TypeConverter.convert(sub1COND_VALUE1));
		struct.setsub1COND_VALUE2( ((sub1COND_VALUE2 == null) ? (String)null : sub1COND_VALUE2[0]) );
		struct.setList_sub1COND_VALUE2(TypeConverter.convert(sub1COND_VALUE2));
		struct.setsub1DISPLAY_FLG( ((sub1DISPLAY_FLG == null) ? (String)null : sub1DISPLAY_FLG[0]) );
		struct.setList_sub1DISPLAY_FLG(TypeConverter.convert(sub1DISPLAY_FLG));
		struct.setsub1SORT_TYPE( ((sub1SORT_TYPE == null) ? (String)null : sub1SORT_TYPE[0]) );
		struct.setList_sub1SORT_TYPE(TypeConverter.convert(sub1SORT_TYPE));
		struct.setsub1SORT_TYPE_name( ((sub1SORT_TYPE_name == null) ? (String)null : sub1SORT_TYPE_name[0]) );
		struct.setList_sub1SORT_TYPE_name(TypeConverter.convert(sub1SORT_TYPE_name));
		struct.setsub1SORT_TYPE_val( ((sub1SORT_TYPE_val == null) ? (String)null : sub1SORT_TYPE_val[0]) );
		struct.setList_sub1SORT_TYPE_val(TypeConverter.convert(sub1SORT_TYPE_val));
		struct.setsub1SORTKEY_PRI( ((sub1SORTKEY_PRI == null) ? (String)null : sub1SORTKEY_PRI[0]) );
		struct.setList_sub1SORTKEY_PRI(TypeConverter.convert(sub1SORTKEY_PRI));
		struct.setsub1TABLE_NAME_COMMENT( ((sub1TABLE_NAME_COMMENT == null) ? (String)null : sub1TABLE_NAME_COMMENT[0]) );
		struct.setList_sub1TABLE_NAME_COMMENT(TypeConverter.convert(sub1TABLE_NAME_COMMENT));
		struct.setsub1TABLE_NAME( ((sub1TABLE_NAME == null) ? (String)null : sub1TABLE_NAME[0]) );
		struct.setList_sub1TABLE_NAME(TypeConverter.convert(sub1TABLE_NAME));
		struct.setsub1COLUMN_NAME( ((sub1COLUMN_NAME == null) ? (String)null : sub1COLUMN_NAME[0]) );
		struct.setList_sub1COLUMN_NAME(TypeConverter.convert(sub1COLUMN_NAME));
		struct.setsub1COLUMN_NAME_COMMENT( ((sub1COLUMN_NAME_COMMENT == null) ? (String)null : sub1COLUMN_NAME_COMMENT[0]) );
		struct.setList_sub1COLUMN_NAME_COMMENT(TypeConverter.convert(sub1COLUMN_NAME_COMMENT));
		struct.setEDIT_TYP( ((EDIT_TYP == null) ? (String)null : EDIT_TYP[0]) );
		struct.setList_EDIT_TYP(TypeConverter.convert(EDIT_TYP));
		struct.setEDIT_NAME( ((EDIT_NAME == null) ? (String)null : EDIT_NAME[0]) );
		struct.setList_EDIT_NAME(TypeConverter.convert(EDIT_NAME));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AZ0040010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAZ0040010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAZ0040010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AZ0040010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0040010Entity entity = control.entity;
		AZ0040010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AZ0040010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AZ0040010Control control;
		AZ0040010Entity  entity = null;
		AZ0040010Struct  struct = null;

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

			if( (control = (AZ0040010Control)so.getAttribute("AZ0040010Control_"+request.getSession(false).getId())) == null ) {
				control = new AZ0040010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AZ0040010Control();
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
				String all_false = "true";
				if( isClick(request, "select") ) {
					if ( !isCryptical(request, so, params, "select") ) return ERROR_TARGET;
					target = onClickselect(request, response, so, params, control);
					control.setButton("select");
					all_false = "false";
				}
				if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
					all_false = "false";
				}
				if( isClick(request, "close") ) {
					if ( !isCryptical(request, so, params, "close") ) return ERROR_TARGET;
					target = onClickclose(request, response, so, params, control);
					control.setButton("close");
					all_false = "false";
				}
				if( isClick(request, "sub1clear") ) {
					if ( !isCryptical(request, so, params, "sub1clear") ) return ERROR_TARGET;
					target = onClicksub1clear(request, response, so, params, control);
					control.setButton("sub1clear");
					all_false = "false";
				}
				if( isClick(request, "sub2csv") ) {
					if ( !isCryptical(request, so, params, "sub2csv") ) return ERROR_TARGET;
					target = onClicksub2csv(request, response, so, params, control);
					control.setButton("sub2csv");
					all_false = "false";
				}
				if( isClick(request, "execute") ) {
					if ( !isCryptical(request, so, params, "execute") ) return ERROR_TARGET;
					target = onClickexecute(request, response, so, params, control);
					control.setButton("execute");
					all_false = "false";
				}
				if( isClick(request, "condition") ) {
					if ( !isCryptical(request, so, params, "condition") ) return ERROR_TARGET;
					target = onClickcondition(request, response, so, params, control);
					control.setButton("condition");
					all_false = "false";
				}
				if( isClick(request, "sub1execute") ) {
					if ( !isCryptical(request, so, params, "sub1execute") ) return ERROR_TARGET;
					target = onClicksub1execute(request, response, so, params, control);
					control.setButton("sub1execute");
					all_false = "false";
				}
				if( isClick(request, "sub1return") ) {
					if ( !isCryptical(request, so, params, "sub1return") ) return ERROR_TARGET;
					target = onClicksub1return(request, response, so, params, control);
					control.setButton("sub1return");
					all_false = "false";
				}
				if( isClick(request, "sub2condition") ) {
					if ( !isCryptical(request, so, params, "sub2condition") ) return ERROR_TARGET;
					target = onClicksub2condition(request, response, so, params, control);
					control.setButton("sub2condition");
					all_false = "false";
				}
				if( isClick(request, "sub2return") ) {
					if ( !isCryptical(request, so, params, "sub2return") ) return ERROR_TARGET;
					target = onClicksub2return(request, response, so, params, control);
					control.setButton("sub2return");
					all_false = "false";
				}
				if( all_false == "true" ) {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AZ0040010Control_"+request.getSession(false).getId(),control);

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
				if((isClick(request, "select") && bFLG_DISCONNECT_select)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "close") && bFLG_DISCONNECT_close)
				|| (isClick(request, "sub1clear") && bFLG_DISCONNECT_sub1clear)
				|| (isClick(request, "sub2csv") && bFLG_DISCONNECT_sub2csv)
				|| (isClick(request, "execute") && bFLG_DISCONNECT_execute)
				|| (isClick(request, "condition") && bFLG_DISCONNECT_condition)
				|| (isClick(request, "sub1execute") && bFLG_DISCONNECT_sub1execute)
				|| (isClick(request, "sub1return") && bFLG_DISCONNECT_sub1return)
				|| (isClick(request, "sub2condition") && bFLG_DISCONNECT_sub2condition)
				|| (isClick(request, "sub2return") && bFLG_DISCONNECT_sub2return)
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
	private  static boolean bFLG_DISCONNECT_close = true;
	private  static boolean bFLG_DISCONNECT_sub1clear = true;
	private  static boolean bFLG_DISCONNECT_sub2csv = true;
	private  static boolean bFLG_DISCONNECT_execute = true;
	private  static boolean bFLG_DISCONNECT_condition = true;
	private  static boolean bFLG_DISCONNECT_sub1execute = true;
	private  static boolean bFLG_DISCONNECT_sub1return = true;
	private  static boolean bFLG_DISCONNECT_sub2condition = true;
	private  static boolean bFLG_DISCONNECT_sub2return = true;

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
		return "com.nec.jp.orteus.metamorBase.AZ0040.AZ0040010Servlet";
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
	public AZ0040010Servlet()
	{
		//{{user_implement_dev:<AZ0040010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_select = true;
		bFLG_DISCONNECT_clear = true;
		bFLG_DISCONNECT_close = true;
		bFLG_DISCONNECT_sub1clear = true;
		bFLG_DISCONNECT_sub2csv = true;
		bFLG_DISCONNECT_execute = true;
		bFLG_DISCONNECT_condition = true;
		bFLG_DISCONNECT_sub1execute = true;
		bFLG_DISCONNECT_sub1return = true;
		bFLG_DISCONNECT_sub2condition = true;
		bFLG_DISCONNECT_sub2return = true;

                //}}user_implement_dev:<AZ0040010_DisConnect_FLG>

		//{{user_implement_dev:<AZ0040010Servlet>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<AZ0040010Servlet>
	}

	//////////////////////////////

}
