/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0050/src/com/nec/jp/orteus/metamorBase/AZ0050/AZ0050010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0050;

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
//------------------------------------------------------------------------------
//import com.nec.jp.orteus.metamorBase.common.CsvWriter.CsvWriter;
//------------------------------------------------------------------------------

//}}user_implement_dev:import

//{{user_implement_dev:header
//}}user_implement_dev:header

public class AZ0050010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
              
               //-------------------------------------------------------------------------
               /** 
                * �����ݒ��ʂ̓��͂̎擾���Acontrol�̃����o�֐ݒ肷��
                * @param HttpServletRequest request
                * @param Hashtable params
                * @param AZ0050010Struct control
               */
               private void setInput2Struct(
                   HttpServletRequest request,
                   Hashtable params,
                   AZ0050010Control control)
               {
                List w_list = control.getColumnList();
              
                String[] types = ((params.containsKey("sub3COND_TYPE")) ? (String[])params.get("sub3COND_TYPE") : (String[])null);
                String[] value1 = ((params.containsKey("sub3COND_VALUE1")) ? (String[])params.get("sub3COND_VALUE1") : (String[])null);
                String[] value2 = ((params.containsKey("sub3COND_VALUE2")) ? (String[])params.get("sub3COND_VALUE2") : (String[])null);
                String[] displays = ((params.containsKey("sub3DISPLAY_FLG")) ? (String[])params.get("sub3DISPLAY_FLG") : (String[])null);
                String[] sorttypes = ((params.containsKey("sub3SORT_TYPE")) ? (String[])params.get("sub3SORT_TYPE") : (String[])null);
                String[] sortkeys = ((params.containsKey("sub3SORTKEY_PRI")) ? (String[])params.get("sub3SORTKEY_PRI") : (String[])null);
                for(int i = 0; i < w_list.size(); i++)
                {
                 AZ0050010Struct temp_struct = (AZ0050010Struct)w_list.get(i);
                 if( types == null || types[i] == null ){
                  temp_struct.setsub3COND_TYPE(null);
                 } else {
                  temp_struct.setsub3COND_TYPE(new String(types[i]));
                 }
              
                 if( value1 == null || value1[i] == null ){
                  temp_struct.setsub3COND_VALUE1(null);
                 } else {
                  temp_struct.setsub3COND_VALUE1(new String(value1[i]));
                 }
              
                 if( value2 == null || value2[i] == null ){
                  temp_struct.setsub3COND_VALUE2(null);
                 } else {
                  temp_struct.setsub3COND_VALUE2(new String(value2[i]));
                 }
              
                 if( displays == null || displays[i] == null ){
                  temp_struct.setsub3DISPLAY_FLG(null);
                 } else {
                  temp_struct.setsub3DISPLAY_FLG(new String(displays[i]));
                 }
              
                 if( sorttypes == null || sorttypes[i] == null ){
                  temp_struct.setsub3SORT_TYPE(null);
                 } else {
                  temp_struct.setsub3SORT_TYPE(new String(sorttypes[i]));
                 }
              
                 if( sortkeys == null || sortkeys[i] == null ){
                  temp_struct.setsub3SORTKEY_PRI(null);
                 } else {
                  temp_struct.setsub3SORTKEY_PRI(new String(sortkeys[i]));
                 }
                }
               }
              
              
               /** 
                * �e�[�u���I����ʂ̓��͂��擾���Astruct�֐ݒ肷��
               */
               private int setSelectTabl2Struct(
                   HttpServletRequest request,
                   Hashtable params,
                   AZ0050010Struct struct){
              
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
              

// 2006/03/31�ǉ�
               /**
				 * �Ɩ��O���[�v�ݒ��ʂ̓��͂��擾���Astruct�֐ݒ肷��
				 */
				private int setSelectGroup2Struct(HttpServletRequest request,
						Hashtable params, AZ0050010Struct struct) {
			
					List l_groupCd = new ArrayList();
					int ret = 0;

					// ��ʂ��f�[�^���擾
					String[] groupCd = ((params.containsKey("h_GROUP_CODE_TO")) ? (String[]) params
							.get("h_GROUP_CODE_TO") : (String[]) null);
			
					if (groupCd != null) {
						for (int i = 0; i < groupCd.length; i++) {
							l_groupCd.add(groupCd[i]);
						}
						ret = groupCd.length;
					}
			
					// �I���e�[�u�����X�g��Struct�ɃZ�b�g
					struct.setList_h_GROUP_CODE_TO(l_groupCd);
			
					return ret;
				}
// 2006/03/31�ǉ������܂�


               /**
				 * �Ώۍ��ڑI����ʂ̓��͂��擾���Astruct�֐ݒ肷��
				 */
               private void setSelectItem2Struct(
                   HttpServletRequest request,
                   Hashtable params,
                   AZ0050010Struct struct){
              
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
                   AZ0050010Struct struct){
              
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
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AZ0050010Control control)
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
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AZ0050010Control control)
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
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
			logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                               objMessage.m_writer.write( Level.ALL, "AZ0050010"+" $Revision: 1.14 $" );
                               control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
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
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
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
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClickclose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickclose");
		//{{user_implement_dev:<onClickclose>
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
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickclose");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub3clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3clear");
		//{{user_implement_dev:<onClicksub3clear>
                              //------------------------------------------------------------------
                              try {
                            
                               //�N���A�{�^��
                               control.control_eventHandller("sub3clear");
                            
                               // �q��ʂɑJ��
                               nextUrl = "/AZ0050013.jsp";
                            
                              }catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                            
                              }
                              //------------------------------------------------------------------
                //}}user_implement_dev:<onClicksub3clear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3clear");

		return nextUrl;
	}

	/**
	 * �b�r�u�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub4csv(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4csv");
		//{{user_implement_dev:<onClicksub4csv>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub4csv");
                               
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
                //}}user_implement_dev:<onClicksub4csv>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4csv");

		return nextUrl;
	}

	/**
	 * �������s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClickexecute(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickexecute");
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
                                nextUrl = "/AZ0050010.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �q��ʂɑJ��
                                nextUrl = "/AZ0050014.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickexecute>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickexecute");

		return nextUrl;
	}

	/**
	 * ���������ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClickcondition(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickcondition");
		//{{user_implement_dev:<onClickcondition>
                              //------------------------------------------------------------------
                              try {
                            
                               // �X�V�Ώۂ̍\�����No�擾
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               // ���������ݒ�
                               control.control_eventHandller("condition");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050010.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �q��ʂɑJ��
                                nextUrl = "/AZ0050013.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickcondition>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickcondition");

		return nextUrl;
	}

	/**
	 * �������s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub3execute(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3execute");
		//{{user_implement_dev:<onClicksub3execute>
                              //------------------------------------------------------------------
                              try {
                               setInput2Struct(request,params,control);
                               //�������s��
                               control.control_eventHandller("sub3execute");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050013.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                nextUrl = "/AZ0050014.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub3execute>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3execute");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub3return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3return");
		//{{user_implement_dev:<onClicksub3return>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub3return");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050013.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub3return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3return");

		return nextUrl;
	}

	/**
	 * ���������ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub4condition(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4condition");
		//{{user_implement_dev:<onClicksub4condition>
                              try {
                            
                               control.control_eventHandller("sub4condition");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050014.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �q��ʂɑJ��
                                nextUrl = "/AZ0050013.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub4condition>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4condition");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub4return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4return");
		//{{user_implement_dev:<onClicksub4return>
                              //------------------------------------------------------------------
                              try {
                            
                               // �Ǎ�����
                               control.control_eventHandller("sub4return");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050014.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub4return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4return");

		return nextUrl;
	}

	/**
	 * �s�ǉ�(�f�t�h)�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClickinsertgui(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertgui");
		//{{user_implement_dev:<onClickinsertgui>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("insertgui");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050010.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �e�[�u���I����ʂ֑J��
                                nextUrl = "/AZ0050011.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickinsertgui>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertgui");

		return nextUrl;
	}

	/**
	 * �s�C��(�f�t�h)�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClickupdategui(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickupdategui");
		//{{user_implement_dev:<onClickupdategui>
                              //------------------------------------------------------------------
                              try {
                            
                               // �X�V�Ώۂ̍\�����No�擾
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               control.control_eventHandller("updategui");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050010.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �e�[�u���I����ʂ֑J��
                                nextUrl = "/AZ0050011.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickupdategui>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickupdategui");

		return nextUrl;
	}

	/**
	 * �s����(�f�t�h)�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClickcopygui(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickcopygui");
		//{{user_implement_dev:<onClickcopygui>
                              //------------------------------------------------------------------
                              try {
                            
                               // �X�V�Ώۂ̍\�����No�擾
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               control.control_eventHandller("copygui");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050010.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �e�[�u���I����ʂ֑J��
                                nextUrl = "/AZ0050011.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickcopygui>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickcopygui");

		return nextUrl;
	}

	/**
	 * �s�ǉ�(�t���[)�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClickinsertfree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertfree");
		//{{user_implement_dev:<onClickinsertfree>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("insertfree");
                            
                               // �t���[���͉�ʂ֑J��
                               nextUrl = "/AZ0050016.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickinsertfree>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertfree");

		return nextUrl;
	}

	/**
	 * �s�C��(�t���[)�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClickupdatefree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickupdatefree");
		//{{user_implement_dev:<onClickupdatefree>
                              //------------------------------------------------------------------
                              try {
                            
                               // �X�V�Ώۂ̍\�����No�擾
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               control.control_eventHandller("updatefree");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050010.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �t���[���͉�ʂ֑J��
                                nextUrl = "/AZ0050016.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickupdatefree>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickupdatefree");

		return nextUrl;
	}

	/**
	 * �s����(�t���[)�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClickcopyfree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickcopyfree");
		//{{user_implement_dev:<onClickcopyfree>
                              //------------------------------------------------------------------
                              try {
                            
                               // �X�V�Ώۂ̍\�����No�擾
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               control.control_eventHandller("copyfree");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050010.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �t���[���͉�ʂ֑J��
                                nextUrl = "/AZ0050016.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickcopyfree>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickcopyfree");

		return nextUrl;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClickdelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");
		//{{user_implement_dev:<onClickdelete>
                              //------------------------------------------------------------------
                              try {
                            
                               // �X�V�Ώۂ̍\�����No�擾
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               // �Ǎ�����
                               control.control_eventHandller("delete");
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickdelete>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");

		return nextUrl;
	}

	/**
	 * �t���[���̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub1freeSql(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1freeSql");
		//{{user_implement_dev:<onClicksub1freeSql>
                              //------------------------------------------------------------------
                              try {
                            
                               // �I���e�[�u����struct�փR�s�[
                               setSelectTabl2Struct(request,params,struct);
                            
                               control.control_eventHandller("sub1freeSql");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050011.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �t���[���͉�ʂ֑J��
                                nextUrl = "/AZ0050016.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub1freeSql>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1freeSql");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub1clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1clear");
		//{{user_implement_dev:<onClicksub1clear>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub1clear");
                            
                               // �����ʂɑJ��
                               nextUrl = "/AZ0050011.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub1clear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1clear");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub1return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1return");
		//{{user_implement_dev:<onClicksub1return>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub1return");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050011.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �N�G���ꗗ��ʂ֑J��
                                nextUrl = "/AZ0050010.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub1return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1return");

		return nextUrl;
	}

	/**
	 * �O�����ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub2selectTable(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2selectTable");
		//{{user_implement_dev:<onClicksub2selectTable>
                              //------------------------------------------------------------------
                              try {
                            
                               // ����������struct�փR�s�[
                               setJoin2Struct(request, params, struct);
                            
                               control.control_eventHandller("sub2selectTable");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050012.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �e�[�u���I����ʂ֑J��
                                nextUrl = "/AZ0050011.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub2selectTable>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2selectTable");

		return nextUrl;
	}

	/**
	 * �������ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub2selectItem(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2selectItem");
		//{{user_implement_dev:<onClicksub2selectItem>
                              //------------------------------------------------------------------
                              try {
                            
                               // ����������struct�փR�s�[
                               setJoin2Struct(request, params, struct);
                            
                               control.control_eventHandller("sub2selectItem");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050012.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �Ώۍ��ڑI����ʂ֑J��
                                nextUrl = "/AZ0050015.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub2selectItem>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2selectItem");

		return nextUrl;
	}

	/**
	 * �t���[���̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub2freeSql(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2freeSql");
		//{{user_implement_dev:<onClicksub2freeSql>
                              //------------------------------------------------------------------
                              try {
                            
                               // ����������struct�փR�s�[
                               setJoin2Struct(request, params, struct);
                            
                               control.control_eventHandller("sub2freeSql");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050012.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �t���[���͉�ʂ֑J��
                                nextUrl = "/AZ0050016.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub2freeSql>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2freeSql");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub2clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2clear");
		//{{user_implement_dev:<onClicksub2clear>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub2clear");
                            
                               // �����ʂɑJ��
                               nextUrl = "/AZ0050012.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub2clear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2clear");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub2return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2return");
		//{{user_implement_dev:<onClicksub2return>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub2return");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050012.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �N�G���ꗗ��ʂ֑J��
                                nextUrl = "/AZ0050010.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub2return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2return");

		return nextUrl;
	}

	/**
	 * �������ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub5condition(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5condition");
		//{{user_implement_dev:<onClicksub5condition>
                              //------------------------------------------------------------------
                              try {
                            
                               setSelectItem2Struct(request,params,struct);
                            
                               control.control_eventHandller("sub5condition");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050015.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // ���������ݒ��ʂ֑J��
                                nextUrl = "/AZ0050013.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub5condition>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5condition");

		return nextUrl;
	}

	/**
	 * �t���[���̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub5freeSql(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5freeSql");
		//{{user_implement_dev:<onClicksub5freeSql>
                              //------------------------------------------------------------------
                              try {
                            
                               setSelectItem2Struct(request,params,struct);
                            
                               control.control_eventHandller("sub5freeSql");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050015.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �t���[���͉�ʂ֑J��
                                nextUrl = "/AZ0050016.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub5freeSql>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5freeSql");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub5clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5clear");
		//{{user_implement_dev:<onClicksub5clear>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub5clear");
                            
                               // �����ʂɑJ��
                               nextUrl = "/AZ0050015.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub5clear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5clear");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub5return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5return");
		//{{user_implement_dev:<onClicksub5return>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub5return");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050015.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �N�G���ꗗ��ʂ֑J��
                                nextUrl = "/AZ0050010.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub5return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5return");

		return nextUrl;
	}

	/**
	 * �������s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub6execute(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub6execute");
		//{{user_implement_dev:<onClicksub6execute>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub6execute");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050016.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �������ʉ�ʂ֑J��
                                nextUrl = "/AZ0050014.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub6execute>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub6execute");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub6clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub6clear");
		//{{user_implement_dev:<onClicksub6clear>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub6clear");
                            
                               // �����ʂɑJ��
                               nextUrl = "/AZ0050016.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub6clear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub6clear");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub6return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub6return");
		//{{user_implement_dev:<onClicksub6return>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub6return");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050016.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �N�G���ꗗ��ʂ֑J��
                                nextUrl = "/AZ0050010.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub6return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub6return");

		return nextUrl;
	}

	/**
	 * �O�����ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub3selectItem(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3selectItem");
		//{{user_implement_dev:<onClicksub3selectItem>
                              //------------------------------------------------------------------
                              try {
                            
                               setInput2Struct(request,params,control);
                            
                               control.control_eventHandller("sub3selectItem");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050013.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �Ώۍ��ڑI����ʂ֑J��
                                nextUrl = "/AZ0050015.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub3selectItem>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3selectItem");

		return nextUrl;
	}

	/**
	 * �N�G�����ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub4inputTitle(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4inputTitle");
		//{{user_implement_dev:<onClicksub4inputTitle>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub4inputTitle");
                            
                               // �N�G�����ݒ��ʂ֑J��
                               nextUrl = "/AZ0050017.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub4inputTitle>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4inputTitle");

		return nextUrl;
	}

	/**
	 * �t���[���̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub4freeSql(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4freeSql");
		//{{user_implement_dev:<onClicksub4freeSql>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub4freeSql");
                            
                               // �t���[���͉�ʂ֑J��
                               nextUrl = "/AZ0050016.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub4freeSql>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4freeSql");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub7insert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7insert");
		//{{user_implement_dev:<onClicksub7insert>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub7insert");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050017.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �N�G���ꗗ�֑J��
                                nextUrl = "/AZ0050010.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub7insert>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7insert");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub7update(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7update");
		//{{user_implement_dev:<onClicksub7update>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub7update");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050017.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �N�G���ꗗ�֑J��
                                nextUrl = "/AZ0050010.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub7update>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7update");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub7clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7clear");
		//{{user_implement_dev:<onClicksub7clear>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub7clear");
                            
                               // �����ʂɑJ��
                               nextUrl = "/AZ0050017.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub7clear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7clear");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub7return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7return");
		//{{user_implement_dev:<onClicksub7return>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub7return");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050017.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �N�G���ꗗ��ʂ֑J��
                                nextUrl = "/AZ0050010.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub7return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7return");

		return nextUrl;
	}

	/**
	 * �t���[���̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub3freeSql(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3freeSql");
		//{{user_implement_dev:<onClicksub3freeSql>
                              //------------------------------------------------------------------
                              try {
                            
                               setInput2Struct(request,params,control);
                            
                               control.control_eventHandller("sub3freeSql");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050013.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �t���[���͉�ʂ֑J��
                                nextUrl = "/AZ0050016.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub3freeSql>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3freeSql");

		return nextUrl;
	}

	/**
	 * �t���[���̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClickfreeSql(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickfreeSql");
		//{{user_implement_dev:<onClickfreeSql>
                              //------------------------------------------------------------------
                              try {
                            
                               // �X�V�Ώۂ̍\�����No�擾
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               control.control_eventHandller("freeSql");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050010.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                // �t���[���͉�ʂ֑J��
                                nextUrl = "/AZ0050016.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickfreeSql>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickfreeSql");

		return nextUrl;
	}

	/**
	 * �������ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub1next(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1next");
		//{{user_implement_dev:<onClicksub1next>
                              //------------------------------------------------------------------
                              try {
                            
                               // �I���e�[�u����struct�փR�s�[
                               control._table_cnt = setSelectTabl2Struct(request,params,struct);
                            
                               control.control_eventHandller("sub1next");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050011.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                if(control._table_cnt == 1){
                                 // �Ώۍ��ڑI����ʂ֑J��
                                 nextUrl = "/AZ0050015.jsp";
                                } else {
                                 // ���������ݒ��ʂ֑J��
                                 nextUrl = "/AZ0050012.jsp";
                                }
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub1next>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1next");

		return nextUrl;
	}

	/**
	 * �O�����ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub5prior(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5prior");
		//{{user_implement_dev:<onClicksub5prior>
                              //------------------------------------------------------------------
                              try {
                            
                               setSelectItem2Struct(request,params,struct);
                            
                               control.control_eventHandller("sub5prior");
                            
                               // SQL��O����t���O���`�F�b�N���J�ڐ�̕�����s��
                               if(control._sqlexception_flg){
                                // SQL��O�����ɂ��J�ڂȂ�
                                nextUrl = "/AZ0050015.jsp";
                                // �t���O�N���A
                                control._sqlexception_flg = false;
                               } else {
                                if(control._table_cnt == 1){
                                 // �e�[�u���I����ʂ֑J��
                                 nextUrl = "/AZ0050011.jsp";
                                } else {
                                 // ���������ݒ��ʂ֑J��
                                 nextUrl = "/AZ0050012.jsp";
                                }
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub5prior>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5prior");

		return nextUrl;
	}

	/**
	 * �Ɩ��O���[�v�ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClickgroupset(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickgroupset");
		//{{user_implement_dev:<onClickgroupset>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// �X�V�Ώۂ̍\�����No�擾
			control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
			control.control_eventHandller("groupset");
			nextUrl = "/AZ0050018.jsp";
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickgroupset>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickgroupset");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub8Insert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub8Insert");
		//{{user_implement_dev:<onClicksub8Insert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
            // �I���e�[�u����struct�փR�s�[
            setSelectGroup2Struct(request,params,struct);
			nextUrl = "/AZ0050010.jsp";
			control.control_eventHandller("sub8Insert");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClicksub8Insert>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub8Insert");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub8clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub8clear");
		//{{user_implement_dev:<onClicksub8clear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			nextUrl = "/AZ0050018.jsp";
			control.control_eventHandller("sub8clear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClicksub8clear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub8clear");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0050010Control�N���X�C���X�^���X
	 */
	public String onClicksub8return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub8return");
		//{{user_implement_dev:<onClicksub8return>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			nextUrl = "/AZ0050010.jsp";
			control.control_eventHandller("sub8return");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClicksub8return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub8return");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AZ0050010Struct struct)
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
		String[] sub3COLUMN_TYPE = ((params.containsKey("sub3COLUMN_TYPE")) ? (String[])params.get("sub3COLUMN_TYPE") : (String[])null);
		String[] sub3COND_TYPE = ((params.containsKey("sub3COND_TYPE")) ? (String[])params.get("sub3COND_TYPE") : (String[])null);
		String[] sub3COND_TYPE_name = ((params.containsKey("sub3COND_TYPE_name")) ? (String[])params.get("sub3COND_TYPE_name") : (String[])null);
		String[] sub3COND_TYPE_val = ((params.containsKey("sub3COND_TYPE_val")) ? (String[])params.get("sub3COND_TYPE_val") : (String[])null);
		String[] sub3COND_VALUE1 = ((params.containsKey("sub3COND_VALUE1")) ? (String[])params.get("sub3COND_VALUE1") : (String[])null);
		String[] sub3COND_VALUE2 = ((params.containsKey("sub3COND_VALUE2")) ? (String[])params.get("sub3COND_VALUE2") : (String[])null);
		String[] sub3DISPLAY_FLG = ((params.containsKey("sub3DISPLAY_FLG")) ? (String[])params.get("sub3DISPLAY_FLG") : (String[])null);
		String[] sub3SORT_TYPE = ((params.containsKey("sub3SORT_TYPE")) ? (String[])params.get("sub3SORT_TYPE") : (String[])null);
		String[] sub3SORT_TYPE_name = ((params.containsKey("sub3SORT_TYPE_name")) ? (String[])params.get("sub3SORT_TYPE_name") : (String[])null);
		String[] sub3SORT_TYPE_val = ((params.containsKey("sub3SORT_TYPE_val")) ? (String[])params.get("sub3SORT_TYPE_val") : (String[])null);
		String[] sub3SORTKEY_PRI = ((params.containsKey("sub3SORTKEY_PRI")) ? (String[])params.get("sub3SORTKEY_PRI") : (String[])null);
		String[] sub3TABLE_NAME_COMMENT = ((params.containsKey("sub3TABLE_NAME_COMMENT")) ? (String[])params.get("sub3TABLE_NAME_COMMENT") : (String[])null);
		String[] sub3TABLE_NAME = ((params.containsKey("sub3TABLE_NAME")) ? (String[])params.get("sub3TABLE_NAME") : (String[])null);
		String[] sub3COLUMN_NAME = ((params.containsKey("sub3COLUMN_NAME")) ? (String[])params.get("sub3COLUMN_NAME") : (String[])null);
		String[] sub3COLUMN_NAME_COMMENT = ((params.containsKey("sub3COLUMN_NAME_COMMENT")) ? (String[])params.get("sub3COLUMN_NAME_COMMENT") : (String[])null);
		String[] sub6FREE_SQL = ((params.containsKey("sub6FREE_SQL")) ? (String[])params.get("sub6FREE_SQL") : (String[])null);
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
		struct.setsub3COLUMN_TYPE( ((sub3COLUMN_TYPE == null) ? (String)null : sub3COLUMN_TYPE[0]) );
		struct.setList_sub3COLUMN_TYPE(TypeConverter.convert(sub3COLUMN_TYPE));
		struct.setsub3COND_TYPE( ((sub3COND_TYPE == null) ? (String)null : sub3COND_TYPE[0]) );
		struct.setList_sub3COND_TYPE(TypeConverter.convert(sub3COND_TYPE));
		struct.setsub3COND_TYPE_name( ((sub3COND_TYPE_name == null) ? (String)null : sub3COND_TYPE_name[0]) );
		struct.setList_sub3COND_TYPE_name(TypeConverter.convert(sub3COND_TYPE_name));
		struct.setsub3COND_TYPE_val( ((sub3COND_TYPE_val == null) ? (String)null : sub3COND_TYPE_val[0]) );
		struct.setList_sub3COND_TYPE_val(TypeConverter.convert(sub3COND_TYPE_val));
		struct.setsub3COND_VALUE1( ((sub3COND_VALUE1 == null) ? (String)null : sub3COND_VALUE1[0]) );
		struct.setList_sub3COND_VALUE1(TypeConverter.convert(sub3COND_VALUE1));
		struct.setsub3COND_VALUE2( ((sub3COND_VALUE2 == null) ? (String)null : sub3COND_VALUE2[0]) );
		struct.setList_sub3COND_VALUE2(TypeConverter.convert(sub3COND_VALUE2));
		struct.setsub3DISPLAY_FLG( ((sub3DISPLAY_FLG == null) ? (String)null : sub3DISPLAY_FLG[0]) );
		struct.setList_sub3DISPLAY_FLG(TypeConverter.convert(sub3DISPLAY_FLG));
		struct.setsub3SORT_TYPE( ((sub3SORT_TYPE == null) ? (String)null : sub3SORT_TYPE[0]) );
		struct.setList_sub3SORT_TYPE(TypeConverter.convert(sub3SORT_TYPE));
		struct.setsub3SORT_TYPE_name( ((sub3SORT_TYPE_name == null) ? (String)null : sub3SORT_TYPE_name[0]) );
		struct.setList_sub3SORT_TYPE_name(TypeConverter.convert(sub3SORT_TYPE_name));
		struct.setsub3SORT_TYPE_val( ((sub3SORT_TYPE_val == null) ? (String)null : sub3SORT_TYPE_val[0]) );
		struct.setList_sub3SORT_TYPE_val(TypeConverter.convert(sub3SORT_TYPE_val));
		struct.setsub3SORTKEY_PRI( ((sub3SORTKEY_PRI == null) ? (String)null : sub3SORTKEY_PRI[0]) );
		struct.setList_sub3SORTKEY_PRI(TypeConverter.convert(sub3SORTKEY_PRI));
		struct.setsub3TABLE_NAME_COMMENT( ((sub3TABLE_NAME_COMMENT == null) ? (String)null : sub3TABLE_NAME_COMMENT[0]) );
		struct.setList_sub3TABLE_NAME_COMMENT(TypeConverter.convert(sub3TABLE_NAME_COMMENT));
		struct.setsub3TABLE_NAME( ((sub3TABLE_NAME == null) ? (String)null : sub3TABLE_NAME[0]) );
		struct.setList_sub3TABLE_NAME(TypeConverter.convert(sub3TABLE_NAME));
		struct.setsub3COLUMN_NAME( ((sub3COLUMN_NAME == null) ? (String)null : sub3COLUMN_NAME[0]) );
		struct.setList_sub3COLUMN_NAME(TypeConverter.convert(sub3COLUMN_NAME));
		struct.setsub3COLUMN_NAME_COMMENT( ((sub3COLUMN_NAME_COMMENT == null) ? (String)null : sub3COLUMN_NAME_COMMENT[0]) );
		struct.setList_sub3COLUMN_NAME_COMMENT(TypeConverter.convert(sub3COLUMN_NAME_COMMENT));
		struct.setsub6FREE_SQL( ((sub6FREE_SQL == null) ? (String)null : sub6FREE_SQL[0]) );
		struct.setList_sub6FREE_SQL(TypeConverter.convert(sub6FREE_SQL));
		struct.setEDIT_TYP( ((EDIT_TYP == null) ? (String)null : EDIT_TYP[0]) );
		struct.setList_EDIT_TYP(TypeConverter.convert(EDIT_TYP));
		struct.setEDIT_NAME( ((EDIT_NAME == null) ? (String)null : EDIT_NAME[0]) );
		struct.setList_EDIT_NAME(TypeConverter.convert(EDIT_NAME));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AZ0050010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAZ0050010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAZ0050010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AZ0050010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AZ0050010Control control;
		AZ0050010Entity  entity = null;
		AZ0050010Struct  struct = null;

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

			if( (control = (AZ0050010Control)so.getAttribute("AZ0050010Control_"+request.getSession(false).getId())) == null ) {
				control = new AZ0050010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AZ0050010Control();
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
				if( isClick(request, "sub3clear") ) {
					if ( !isCryptical(request, so, params, "sub3clear") ) return ERROR_TARGET;
					target = onClicksub3clear(request, response, so, params, control);
					control.setButton("sub3clear");
					all_false = "false";
				}
				if( isClick(request, "sub4csv") ) {
					if ( !isCryptical(request, so, params, "sub4csv") ) return ERROR_TARGET;
					target = onClicksub4csv(request, response, so, params, control);
					control.setButton("sub4csv");
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
				if( isClick(request, "sub3execute") ) {
					if ( !isCryptical(request, so, params, "sub3execute") ) return ERROR_TARGET;
					target = onClicksub3execute(request, response, so, params, control);
					control.setButton("sub3execute");
					all_false = "false";
				}
				if( isClick(request, "sub3return") ) {
					if ( !isCryptical(request, so, params, "sub3return") ) return ERROR_TARGET;
					target = onClicksub3return(request, response, so, params, control);
					control.setButton("sub3return");
					all_false = "false";
				}
				if( isClick(request, "sub4condition") ) {
					if ( !isCryptical(request, so, params, "sub4condition") ) return ERROR_TARGET;
					target = onClicksub4condition(request, response, so, params, control);
					control.setButton("sub4condition");
					all_false = "false";
				}
				if( isClick(request, "sub4return") ) {
					if ( !isCryptical(request, so, params, "sub4return") ) return ERROR_TARGET;
					target = onClicksub4return(request, response, so, params, control);
					control.setButton("sub4return");
					all_false = "false";
				}
				if( isClick(request, "insertgui") ) {
					if ( !isCryptical(request, so, params, "insertgui") ) return ERROR_TARGET;
					target = onClickinsertgui(request, response, so, params, control);
					control.setButton("insertgui");
					all_false = "false";
				}
				if( isClick(request, "updategui") ) {
					if ( !isCryptical(request, so, params, "updategui") ) return ERROR_TARGET;
					target = onClickupdategui(request, response, so, params, control);
					control.setButton("updategui");
					all_false = "false";
				}
				if( isClick(request, "copygui") ) {
					if ( !isCryptical(request, so, params, "copygui") ) return ERROR_TARGET;
					target = onClickcopygui(request, response, so, params, control);
					control.setButton("copygui");
					all_false = "false";
				}
				if( isClick(request, "insertfree") ) {
					if ( !isCryptical(request, so, params, "insertfree") ) return ERROR_TARGET;
					target = onClickinsertfree(request, response, so, params, control);
					control.setButton("insertfree");
					all_false = "false";
				}
				if( isClick(request, "updatefree") ) {
					if ( !isCryptical(request, so, params, "updatefree") ) return ERROR_TARGET;
					target = onClickupdatefree(request, response, so, params, control);
					control.setButton("updatefree");
					all_false = "false";
				}
				if( isClick(request, "copyfree") ) {
					if ( !isCryptical(request, so, params, "copyfree") ) return ERROR_TARGET;
					target = onClickcopyfree(request, response, so, params, control);
					control.setButton("copyfree");
					all_false = "false";
				}
				if( isClick(request, "delete") ) {
					if ( !isCryptical(request, so, params, "delete") ) return ERROR_TARGET;
					target = onClickdelete(request, response, so, params, control);
					control.setButton("delete");
					all_false = "false";
				}
				if( isClick(request, "sub1freeSql") ) {
					if ( !isCryptical(request, so, params, "sub1freeSql") ) return ERROR_TARGET;
					target = onClicksub1freeSql(request, response, so, params, control);
					control.setButton("sub1freeSql");
					all_false = "false";
				}
				if( isClick(request, "sub1clear") ) {
					if ( !isCryptical(request, so, params, "sub1clear") ) return ERROR_TARGET;
					target = onClicksub1clear(request, response, so, params, control);
					control.setButton("sub1clear");
					all_false = "false";
				}
				if( isClick(request, "sub1return") ) {
					if ( !isCryptical(request, so, params, "sub1return") ) return ERROR_TARGET;
					target = onClicksub1return(request, response, so, params, control);
					control.setButton("sub1return");
					all_false = "false";
				}
				if( isClick(request, "sub2selectTable") ) {
					if ( !isCryptical(request, so, params, "sub2selectTable") ) return ERROR_TARGET;
					target = onClicksub2selectTable(request, response, so, params, control);
					control.setButton("sub2selectTable");
					all_false = "false";
				}
				if( isClick(request, "sub2selectItem") ) {
					if ( !isCryptical(request, so, params, "sub2selectItem") ) return ERROR_TARGET;
					target = onClicksub2selectItem(request, response, so, params, control);
					control.setButton("sub2selectItem");
					all_false = "false";
				}
				if( isClick(request, "sub2freeSql") ) {
					if ( !isCryptical(request, so, params, "sub2freeSql") ) return ERROR_TARGET;
					target = onClicksub2freeSql(request, response, so, params, control);
					control.setButton("sub2freeSql");
					all_false = "false";
				}
				if( isClick(request, "sub2clear") ) {
					if ( !isCryptical(request, so, params, "sub2clear") ) return ERROR_TARGET;
					target = onClicksub2clear(request, response, so, params, control);
					control.setButton("sub2clear");
					all_false = "false";
				}
				if( isClick(request, "sub2return") ) {
					if ( !isCryptical(request, so, params, "sub2return") ) return ERROR_TARGET;
					target = onClicksub2return(request, response, so, params, control);
					control.setButton("sub2return");
					all_false = "false";
				}
				if( isClick(request, "sub5condition") ) {
					if ( !isCryptical(request, so, params, "sub5condition") ) return ERROR_TARGET;
					target = onClicksub5condition(request, response, so, params, control);
					control.setButton("sub5condition");
					all_false = "false";
				}
				if( isClick(request, "sub5freeSql") ) {
					if ( !isCryptical(request, so, params, "sub5freeSql") ) return ERROR_TARGET;
					target = onClicksub5freeSql(request, response, so, params, control);
					control.setButton("sub5freeSql");
					all_false = "false";
				}
				if( isClick(request, "sub5clear") ) {
					if ( !isCryptical(request, so, params, "sub5clear") ) return ERROR_TARGET;
					target = onClicksub5clear(request, response, so, params, control);
					control.setButton("sub5clear");
					all_false = "false";
				}
				if( isClick(request, "sub5return") ) {
					if ( !isCryptical(request, so, params, "sub5return") ) return ERROR_TARGET;
					target = onClicksub5return(request, response, so, params, control);
					control.setButton("sub5return");
					all_false = "false";
				}
				if( isClick(request, "sub6execute") ) {
					if ( !isCryptical(request, so, params, "sub6execute") ) return ERROR_TARGET;
					target = onClicksub6execute(request, response, so, params, control);
					control.setButton("sub6execute");
					all_false = "false";
				}
				if( isClick(request, "sub6clear") ) {
					if ( !isCryptical(request, so, params, "sub6clear") ) return ERROR_TARGET;
					target = onClicksub6clear(request, response, so, params, control);
					control.setButton("sub6clear");
					all_false = "false";
				}
				if( isClick(request, "sub6return") ) {
					if ( !isCryptical(request, so, params, "sub6return") ) return ERROR_TARGET;
					target = onClicksub6return(request, response, so, params, control);
					control.setButton("sub6return");
					all_false = "false";
				}
				if( isClick(request, "sub3selectItem") ) {
					if ( !isCryptical(request, so, params, "sub3selectItem") ) return ERROR_TARGET;
					target = onClicksub3selectItem(request, response, so, params, control);
					control.setButton("sub3selectItem");
					all_false = "false";
				}
				if( isClick(request, "sub4inputTitle") ) {
					if ( !isCryptical(request, so, params, "sub4inputTitle") ) return ERROR_TARGET;
					target = onClicksub4inputTitle(request, response, so, params, control);
					control.setButton("sub4inputTitle");
					all_false = "false";
				}
				if( isClick(request, "sub4freeSql") ) {
					if ( !isCryptical(request, so, params, "sub4freeSql") ) return ERROR_TARGET;
					target = onClicksub4freeSql(request, response, so, params, control);
					control.setButton("sub4freeSql");
					all_false = "false";
				}
				if( isClick(request, "sub7insert") ) {
					if ( !isCryptical(request, so, params, "sub7insert") ) return ERROR_TARGET;
					target = onClicksub7insert(request, response, so, params, control);
					control.setButton("sub7insert");
					all_false = "false";
				}
				if( isClick(request, "sub7update") ) {
					if ( !isCryptical(request, so, params, "sub7update") ) return ERROR_TARGET;
					target = onClicksub7update(request, response, so, params, control);
					control.setButton("sub7update");
					all_false = "false";
				}
				if( isClick(request, "sub7clear") ) {
					if ( !isCryptical(request, so, params, "sub7clear") ) return ERROR_TARGET;
					target = onClicksub7clear(request, response, so, params, control);
					control.setButton("sub7clear");
					all_false = "false";
				}
				if( isClick(request, "sub7return") ) {
					if ( !isCryptical(request, so, params, "sub7return") ) return ERROR_TARGET;
					target = onClicksub7return(request, response, so, params, control);
					control.setButton("sub7return");
					all_false = "false";
				}
				if( isClick(request, "sub3freeSql") ) {
					if ( !isCryptical(request, so, params, "sub3freeSql") ) return ERROR_TARGET;
					target = onClicksub3freeSql(request, response, so, params, control);
					control.setButton("sub3freeSql");
					all_false = "false";
				}
				if( isClick(request, "freeSql") ) {
					if ( !isCryptical(request, so, params, "freeSql") ) return ERROR_TARGET;
					target = onClickfreeSql(request, response, so, params, control);
					control.setButton("freeSql");
					all_false = "false";
				}
				if( isClick(request, "sub1next") ) {
					if ( !isCryptical(request, so, params, "sub1next") ) return ERROR_TARGET;
					target = onClicksub1next(request, response, so, params, control);
					control.setButton("sub1next");
					all_false = "false";
				}
				if( isClick(request, "sub5prior") ) {
					if ( !isCryptical(request, so, params, "sub5prior") ) return ERROR_TARGET;
					target = onClicksub5prior(request, response, so, params, control);
					control.setButton("sub5prior");
					all_false = "false";
				}
				if( isClick(request, "groupset") ) {
					if ( !isCryptical(request, so, params, "groupset") ) return ERROR_TARGET;
					target = onClickgroupset(request, response, so, params, control);
					control.setButton("groupset");
					all_false = "false";
				}
				if( isClick(request, "sub8Insert") ) {
					if ( !isCryptical(request, so, params, "sub8Insert") ) return ERROR_TARGET;
					target = onClicksub8Insert(request, response, so, params, control);
					control.setButton("sub8Insert");
					all_false = "false";
				}
				if( isClick(request, "sub8clear") ) {
					if ( !isCryptical(request, so, params, "sub8clear") ) return ERROR_TARGET;
					target = onClicksub8clear(request, response, so, params, control);
					control.setButton("sub8clear");
					all_false = "false";
				}
				if( isClick(request, "sub8return") ) {
					if ( !isCryptical(request, so, params, "sub8return") ) return ERROR_TARGET;
					target = onClicksub8return(request, response, so, params, control);
					control.setButton("sub8return");
					all_false = "false";
				}
				if( all_false == "true" ) {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AZ0050010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "close") && bFLG_DISCONNECT_close)
				|| (isClick(request, "sub3clear") && bFLG_DISCONNECT_sub3clear)
				|| (isClick(request, "sub4csv") && bFLG_DISCONNECT_sub4csv)
				|| (isClick(request, "execute") && bFLG_DISCONNECT_execute)
				|| (isClick(request, "condition") && bFLG_DISCONNECT_condition)
				|| (isClick(request, "sub3execute") && bFLG_DISCONNECT_sub3execute)
				|| (isClick(request, "sub3return") && bFLG_DISCONNECT_sub3return)
				|| (isClick(request, "sub4condition") && bFLG_DISCONNECT_sub4condition)
				|| (isClick(request, "sub4return") && bFLG_DISCONNECT_sub4return)
				|| (isClick(request, "insertgui") && bFLG_DISCONNECT_insertgui)
				|| (isClick(request, "updategui") && bFLG_DISCONNECT_updategui)
				|| (isClick(request, "copygui") && bFLG_DISCONNECT_copygui)
				|| (isClick(request, "insertfree") && bFLG_DISCONNECT_insertfree)
				|| (isClick(request, "updatefree") && bFLG_DISCONNECT_updatefree)
				|| (isClick(request, "copyfree") && bFLG_DISCONNECT_copyfree)
				|| (isClick(request, "delete") && bFLG_DISCONNECT_delete)
				|| (isClick(request, "sub1freeSql") && bFLG_DISCONNECT_sub1freeSql)
				|| (isClick(request, "sub1clear") && bFLG_DISCONNECT_sub1clear)
				|| (isClick(request, "sub1return") && bFLG_DISCONNECT_sub1return)
				|| (isClick(request, "sub2selectTable") && bFLG_DISCONNECT_sub2selectTable)
				|| (isClick(request, "sub2selectItem") && bFLG_DISCONNECT_sub2selectItem)
				|| (isClick(request, "sub2freeSql") && bFLG_DISCONNECT_sub2freeSql)
				|| (isClick(request, "sub2clear") && bFLG_DISCONNECT_sub2clear)
				|| (isClick(request, "sub2return") && bFLG_DISCONNECT_sub2return)
				|| (isClick(request, "sub5condition") && bFLG_DISCONNECT_sub5condition)
				|| (isClick(request, "sub5freeSql") && bFLG_DISCONNECT_sub5freeSql)
				|| (isClick(request, "sub5clear") && bFLG_DISCONNECT_sub5clear)
				|| (isClick(request, "sub5return") && bFLG_DISCONNECT_sub5return)
				|| (isClick(request, "sub6execute") && bFLG_DISCONNECT_sub6execute)
				|| (isClick(request, "sub6clear") && bFLG_DISCONNECT_sub6clear)
				|| (isClick(request, "sub6return") && bFLG_DISCONNECT_sub6return)
				|| (isClick(request, "sub3selectItem") && bFLG_DISCONNECT_sub3selectItem)
				|| (isClick(request, "sub4inputTitle") && bFLG_DISCONNECT_sub4inputTitle)
				|| (isClick(request, "sub4freeSql") && bFLG_DISCONNECT_sub4freeSql)
				|| (isClick(request, "sub7insert") && bFLG_DISCONNECT_sub7insert)
				|| (isClick(request, "sub7update") && bFLG_DISCONNECT_sub7update)
				|| (isClick(request, "sub7clear") && bFLG_DISCONNECT_sub7clear)
				|| (isClick(request, "sub7return") && bFLG_DISCONNECT_sub7return)
				|| (isClick(request, "sub3freeSql") && bFLG_DISCONNECT_sub3freeSql)
				|| (isClick(request, "freeSql") && bFLG_DISCONNECT_freeSql)
				|| (isClick(request, "sub1next") && bFLG_DISCONNECT_sub1next)
				|| (isClick(request, "sub5prior") && bFLG_DISCONNECT_sub5prior)
				|| (isClick(request, "groupset") && bFLG_DISCONNECT_groupset)
				|| (isClick(request, "sub8Insert") && bFLG_DISCONNECT_sub8Insert)
				|| (isClick(request, "sub8clear") && bFLG_DISCONNECT_sub8clear)
				|| (isClick(request, "sub8return") && bFLG_DISCONNECT_sub8return)
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
	private  static boolean bFLG_DISCONNECT_sub3clear = true;
	private  static boolean bFLG_DISCONNECT_sub4csv = true;
	private  static boolean bFLG_DISCONNECT_execute = true;
	private  static boolean bFLG_DISCONNECT_condition = true;
	private  static boolean bFLG_DISCONNECT_sub3execute = true;
	private  static boolean bFLG_DISCONNECT_sub3return = true;
	private  static boolean bFLG_DISCONNECT_sub4condition = true;
	private  static boolean bFLG_DISCONNECT_sub4return = true;
	private  static boolean bFLG_DISCONNECT_insertgui = true;
	private  static boolean bFLG_DISCONNECT_updategui = true;
	private  static boolean bFLG_DISCONNECT_copygui = true;
	private  static boolean bFLG_DISCONNECT_insertfree = true;
	private  static boolean bFLG_DISCONNECT_updatefree = true;
	private  static boolean bFLG_DISCONNECT_copyfree = true;
	private  static boolean bFLG_DISCONNECT_delete = true;
	private  static boolean bFLG_DISCONNECT_sub1freeSql = true;
	private  static boolean bFLG_DISCONNECT_sub1clear = true;
	private  static boolean bFLG_DISCONNECT_sub1return = true;
	private  static boolean bFLG_DISCONNECT_sub2selectTable = true;
	private  static boolean bFLG_DISCONNECT_sub2selectItem = true;
	private  static boolean bFLG_DISCONNECT_sub2freeSql = true;
	private  static boolean bFLG_DISCONNECT_sub2clear = true;
	private  static boolean bFLG_DISCONNECT_sub2return = true;
	private  static boolean bFLG_DISCONNECT_sub5condition = true;
	private  static boolean bFLG_DISCONNECT_sub5freeSql = true;
	private  static boolean bFLG_DISCONNECT_sub5clear = true;
	private  static boolean bFLG_DISCONNECT_sub5return = true;
	private  static boolean bFLG_DISCONNECT_sub6execute = true;
	private  static boolean bFLG_DISCONNECT_sub6clear = true;
	private  static boolean bFLG_DISCONNECT_sub6return = true;
	private  static boolean bFLG_DISCONNECT_sub3selectItem = true;
	private  static boolean bFLG_DISCONNECT_sub4inputTitle = true;
	private  static boolean bFLG_DISCONNECT_sub4freeSql = true;
	private  static boolean bFLG_DISCONNECT_sub7insert = true;
	private  static boolean bFLG_DISCONNECT_sub7update = true;
	private  static boolean bFLG_DISCONNECT_sub7clear = true;
	private  static boolean bFLG_DISCONNECT_sub7return = true;
	private  static boolean bFLG_DISCONNECT_sub3freeSql = true;
	private  static boolean bFLG_DISCONNECT_freeSql = true;
	private  static boolean bFLG_DISCONNECT_sub1next = true;
	private  static boolean bFLG_DISCONNECT_sub5prior = true;
	private  static boolean bFLG_DISCONNECT_groupset = true;
	private  static boolean bFLG_DISCONNECT_sub8Insert = true;
	private  static boolean bFLG_DISCONNECT_sub8clear = true;
	private  static boolean bFLG_DISCONNECT_sub8return = true;

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
		return "com.nec.jp.orteus.metamorBase.AZ0050.AZ0050010Servlet";
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
	public AZ0050010Servlet()
	{
		//{{user_implement_dev:<AZ0050010_DisConnect_FLG>
                              // submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
                              bFLG_DISCONNECT_defaultEvent = true;
                              bFLG_DISCONNECT_select = true;
                              bFLG_DISCONNECT_clear = true;
                              bFLG_DISCONNECT_close = true;
                              bFLG_DISCONNECT_sub3clear = true;
                              bFLG_DISCONNECT_sub4csv = true;
                              bFLG_DISCONNECT_execute = true;
                              bFLG_DISCONNECT_condition = true;
                              bFLG_DISCONNECT_sub3execute = true;
                              bFLG_DISCONNECT_sub3return = true;
                              bFLG_DISCONNECT_sub4condition = true;
                              bFLG_DISCONNECT_sub4return = true;
                              bFLG_DISCONNECT_insertgui = true;
                              bFLG_DISCONNECT_updategui = true;
                              bFLG_DISCONNECT_copygui = true;
                              bFLG_DISCONNECT_insertfree = true;
                              bFLG_DISCONNECT_updatefree = true;
                              bFLG_DISCONNECT_copyfree = true;
                              bFLG_DISCONNECT_delete = true;
                              bFLG_DISCONNECT_sub1next = true;
                              bFLG_DISCONNECT_sub1freeSql = true;
                              bFLG_DISCONNECT_sub1clear = true;
                              bFLG_DISCONNECT_sub1return = true;
                              bFLG_DISCONNECT_sub2selectTable = true;
                              bFLG_DISCONNECT_sub2selectItem = true;
                              bFLG_DISCONNECT_sub2freeSql = true;
                              bFLG_DISCONNECT_sub2clear = true;
                              bFLG_DISCONNECT_sub2return = true;
                              bFLG_DISCONNECT_sub5prior = true;
                              bFLG_DISCONNECT_sub5condition = true;
                              bFLG_DISCONNECT_sub5freeSql = true;
                              bFLG_DISCONNECT_sub5clear = true;
                              bFLG_DISCONNECT_sub5return = true;
                              bFLG_DISCONNECT_sub6execute = true;
                              bFLG_DISCONNECT_sub6clear = true;
                              bFLG_DISCONNECT_sub6return = true;
                              bFLG_DISCONNECT_sub3selectItem = true;
                              bFLG_DISCONNECT_sub4inputTitle = true;
                              bFLG_DISCONNECT_sub4freeSql = true;
                              bFLG_DISCONNECT_sub7insert = true;
                              bFLG_DISCONNECT_sub7update = true;
                              bFLG_DISCONNECT_sub7clear = true;
                              bFLG_DISCONNECT_sub7return = true;
                              bFLG_DISCONNECT_sub3freeSql = true;
                              bFLG_DISCONNECT_freeSql = true;
                              bFLG_DISCONNECT_groupset = true;
                              bFLG_DISCONNECT_sub8Insert = true;
                              bFLG_DISCONNECT_sub8clear = true;
                              bFLG_DISCONNECT_sub8return = true;
                            
                //}}user_implement_dev:<AZ0050010_DisConnect_FLG>

		//{{user_implement_dev:<AZ0050010Servlet>
                               
                //}}user_implement_dev:<AZ0050010Servlet>
	}

	//////////////////////////////

}
