<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:58:13 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KM0030\KM0030010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KM0030.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%
 HttpSession so = request.getSession(false);
 String locale = (String)so.getAttribute("LOCALE");
 ResourceBundle rb = CoreTools.getResourceBundle("OrteusUserDic", locale);
 ResourceBundle rbs = CoreTools.getResourceBundle("OrteusSysDic", locale);
 response.setHeader("Content-Type", "text/html; charset=" + CoreTools.getCharset(locale));
 response.setContentType("text/html; charset=" + CoreTools.getCharset(locale));
%>
<jsp:useBean id="aKM0030010Control" class="com.nec.jp.orteus.metamorBase.KM0030.KM0030010Control" scope="request"/>
<jsp:useBean id="aKM0030010Struct" class="com.nec.jp.orteus.metamorBase.KM0030.KM0030010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

案件受注登録
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0030/jsp/KM0030010.jsp,v $
$Author: geng-jia $	
$Revision: 1.3 $　$Date: 2017/02/22 02:07:03 $
********************************************************* --%>
<html>
<head>
<title>案件受注登録</title>
<%@include file="common/expj_v5.jsp" %>

<%-- ********** Generated section begin ********** --%>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<%
 //For DETAIL
 String detailId = null;
 String detailFloat = null;
 int detailWidth = -1;
 int detailHeight = -1;
 String detailViewId = null;
 StringBuffer detailViewHeaderData = null;
 StringBuffer detailViewBodyData = null;
 String detailViewSelect = null;
 String detailViewResize = null;
 String detailViewScroll = null;
 //For TREE
 String treeId = null;
 String treeXmlData = null;
 //For VIEW
 List viewIdList = new ArrayList();
 List viewHeaderDataList = new ArrayList();
 List viewBodyDataList = new ArrayList();
 List viewSelectList = new ArrayList();
 List viewResizeList = new ArrayList();
 List viewScrollList = new ArrayList();
 Map viewSelectEvent = new HashMap();
 Map treeClickEvent = new HashMap();
%>
<script class="expj-script-KM0030010_init">
  // KM0030010名前空間
  expj.KM0030010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-KM0030010" data-screen="KM0030010" data-newdata="<%=aKM0030010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

    <div class="expj-tr" style=""> 
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);"> 
        <div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2-->
          <div class="expj-tr" style="width:100%;height:0px;display:none;">
 
            <div class="expj-td frame01"></div><!--/td-->

            <div class="expj-td frame02"></div><!--/td-->

            <div class="expj-td frame03"></div><!--/td-->

          </div><!--/tr-->

          <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
 
            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style=""> 
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-KM0030010-KM0030010form1">
expj.KM0030010.KM0030010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6,7,8,9,10"
expj.KM0030010.KM0030010form1.onLoad0 = function () {
  console.log('KM0030010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision7)){this.onDecision7();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision8)){this.onDecision8();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision9)){this.onDecision9();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision10)){this.onDecision10();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.KM0030010.KM0030010form1.onDecision0 = function () {
  console.log('KM0030010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KM0030010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_KM0030010button1/Select"
expj.KM0030010.KM0030010form1.child0 = function () {
  console.log('KM0030010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010button1/Select');
};
// script4="child;1;MASK;_KM0030010button1/Select"
expj.KM0030010.KM0030010form1.child1 = function () {
  console.log('KM0030010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010button1/Select');
};
// script5="onDecision;1;CHK;_KM0030010form1/h_APR_ODR[eq]1@*2,*3"
expj.KM0030010.KM0030010form1.onDecision1 = function () {
  console.log('KM0030010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/h_APR_ODR'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_KM0030010form2/APPROVED_COMMENT"
expj.KM0030010.KM0030010form1.child2 = function () {
  console.log('KM0030010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/APPROVED_COMMENT');
};
// script7="child;3;MASK;_KM0030010form2/APPROVED_COMMENT"
expj.KM0030010.KM0030010form1.child3 = function () {
  console.log('KM0030010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/APPROVED_COMMENT');
};
// script8="onDecision;2;CHK;_KM0030010form2/h_ESTIMATE_TYPE[eq]1[and]_KM0030010form2/h_ODR_TYP[eq]3@*4,*6"
expj.KM0030010.KM0030010form1.onDecision2 = function () {
  console.log('KM0030010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form2/h_ESTIMATE_TYPE'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form2/h_ODR_TYP'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;4;CHK;_KM0030010form1/h_PRD_REQ_JOB_ODR_TYP_1[eq]1[or]_KM0030010form1/h_PRD_REQ_JOB_ODR_TYP_1[eq]2@*24,*6"
expj.KM0030010.KM0030010form1.child4 = function () {
  console.log('KM0030010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/h_PRD_REQ_JOB_ODR_TYP_1'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/h_PRD_REQ_JOB_ODR_TYP_1'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;5;UNMASK;_KM0030010form2/c_DOODR,_KM0030010form2/PREPARE_QTY,_KM0030010form2/JOB_ODR_DLV_DATE,_KM0030010form2/CalendarTargetJobOdrDlvDate,_KM0030010form2/ALC_GRP_CD,_KM0030010form2/c_INPUTODRCD,_KM0030010form2/JOB_ODR_CD"
expj.KM0030010.KM0030010form1.child5 = function () {
  console.log('KM0030010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/c_DOODR');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/PREPARE_QTY');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/JOB_ODR_DLV_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/CalendarTargetJobOdrDlvDate');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/ALC_GRP_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/c_INPUTODRCD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/JOB_ODR_CD');
};
// script11="child;6;MASK;_KM0030010form2/c_DOODR,_KM0030010form2/PREPARE_QTY,_KM0030010form2/JOB_ODR_DLV_DATE,_KM0030010form2/CalendarTargetJobOdrDlvDate,_KM0030010form2/ALC_GRP_CD,_KM0030010form2/c_INPUTODRCD,_KM0030010form2/JOB_ODR_CD"
expj.KM0030010.KM0030010form1.child6 = function () {
  console.log('KM0030010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/c_DOODR');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/PREPARE_QTY');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/JOB_ODR_DLV_DATE');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/CalendarTargetJobOdrDlvDate');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/ALC_GRP_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/c_INPUTODRCD');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/JOB_ODR_CD');
};
// script12="onDecision;3;CHK;_KM0030010form2/c_DOODR[eq]true@*7,*9"
expj.KM0030010.KM0030010form1.onDecision3 = function () {
  console.log('KM0030010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form2/c_DOODR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script13="child;7;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*8,9"
expj.KM0030010.KM0030010form1.child7 = function () {
  console.log('KM0030010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script14="child;8;UNMASK;_KM0030010form2/PREPARE_QTY"
expj.KM0030010.KM0030010form1.child8 = function () {
  console.log('KM0030010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/PREPARE_QTY');
};
// script15="child;9;MASK;_KM0030010form2/PREPARE_QTY"
expj.KM0030010.KM0030010form1.child9 = function () {
  console.log('KM0030010form1 script15');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/PREPARE_QTY');
};
// script16="onDecision;4;CHK;_KM0030010form2/c_DOODR[eq]true@*10,*12"
expj.KM0030010.KM0030010form1.onDecision4 = function () {
  console.log('KM0030010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form2/c_DOODR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script17="child;10;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*11,12"
expj.KM0030010.KM0030010form1.child10 = function () {
  console.log('KM0030010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script18="child;11;UNMASK;_KM0030010form2/JOB_ODR_DLV_DATE,_KM0030010form2/CalendarTargetJobOdrDlvDate"
expj.KM0030010.KM0030010form1.child11 = function () {
  console.log('KM0030010form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/JOB_ODR_DLV_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/CalendarTargetJobOdrDlvDate');
};
// script19="child;12;MASK;_KM0030010form2/JOB_ODR_DLV_DATE,_KM0030010form2/CalendarTargetJobOdrDlvDate"
expj.KM0030010.KM0030010form1.child12 = function () {
  console.log('KM0030010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/JOB_ODR_DLV_DATE');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/CalendarTargetJobOdrDlvDate');
};
// script20="onDecision;5;CHK;_KM0030010form2/c_DOODR[eq]true@*13,*15"
expj.KM0030010.KM0030010form1.onDecision5 = function () {
  console.log('KM0030010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form2/c_DOODR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script21="child;13;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*14,15"
expj.KM0030010.KM0030010form1.child13 = function () {
  console.log('KM0030010form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script22="child;14;UNMASK;_KM0030010form2/ALC_GRP_CD"
expj.KM0030010.KM0030010form1.child14 = function () {
  console.log('KM0030010form1 script22');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/ALC_GRP_CD');
};
// script23="child;15;MASK;_KM0030010form2/ALC_GRP_CD"
expj.KM0030010.KM0030010form1.child15 = function () {
  console.log('KM0030010form1 script23');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/ALC_GRP_CD');
};
// script24="onDecision;6;CHK;_KM0030010form2/c_DOODR[eq]true@*16,*19"
expj.KM0030010.KM0030010form1.onDecision6 = function () {
  console.log('KM0030010form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form2/c_DOODR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script25="child;16;CHK;_KM0030010form1/h_PRD_REQ_JOB_ODR_TYP_2[eq]0[or]_KM0030010form1/h_PRD_REQ_JOB_ODR_TYP_2[eq]1@*17,*19"
expj.KM0030010.KM0030010form1.child16 = function () {
  console.log('KM0030010form1 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/h_PRD_REQ_JOB_ODR_TYP_2'), '[eq]', '0') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/h_PRD_REQ_JOB_ODR_TYP_2'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script26="child;17;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*18,19"
expj.KM0030010.KM0030010form1.child17 = function () {
  console.log('KM0030010form1 script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script27="child;18;UNMASK;_KM0030010form2/c_INPUTODRCD"
expj.KM0030010.KM0030010form1.child18 = function () {
  console.log('KM0030010form1 script27');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/c_INPUTODRCD');
};
// script28="child;19;MASK;_KM0030010form2/c_INPUTODRCD"
expj.KM0030010.KM0030010form1.child19 = function () {
  console.log('KM0030010form1 script28');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/c_INPUTODRCD');
};
// script29="onDecision;7;CHK;_KM0030010form2/c_INPUTODRCD[eq]true@*20,*21"
expj.KM0030010.KM0030010form1.onDecision7 = function () {
  console.log('KM0030010form1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form2/c_INPUTODRCD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script30="child;20;UNMASK;_KM0030010form2/JOB_ODR_CD"
expj.KM0030010.KM0030010form1.child20 = function () {
  console.log('KM0030010form1 script30');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/JOB_ODR_CD');
};
// script31="child;21;MASK;_KM0030010form2/JOB_ODR_CD"
expj.KM0030010.KM0030010form1.child21 = function () {
  console.log('KM0030010form1 script31');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/JOB_ODR_CD');
};
// script32="onDecision;8;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*22,*23"
expj.KM0030010.KM0030010form1.onDecision8 = function () {
  console.log('KM0030010form1 script32');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
} else {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script33="child;22;UNMASK;_KM0030010form2/CUST_ITEM_CD,_KM0030010form2/PeekerTargetCustItemCd,_KM0030010form2/ODR_ACPT_DATE,_KM0030010form2/CalendarTargetOdrAcptDate"
expj.KM0030010.KM0030010form1.child22 = function () {
  console.log('KM0030010form1 script33');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/CUST_ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/PeekerTargetCustItemCd');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/ODR_ACPT_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/CalendarTargetOdrAcptDate');
};
// script34="child;23;MASK;_KM0030010form2/CUST_ITEM_CD,_KM0030010form2/PeekerTargetCustItemCd,_KM0030010form2/ODR_ACPT_DATE,_KM0030010form2/CalendarTargetOdrAcptDate"
expj.KM0030010.KM0030010form1.child23 = function () {
  console.log('KM0030010form1 script34');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/CUST_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/PeekerTargetCustItemCd');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/ODR_ACPT_DATE');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/CalendarTargetOdrAcptDate');
};
// script35="child;24;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*5,*6"
expj.KM0030010.KM0030010form1.child24 = function () {
  console.log('KM0030010form1 script35');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script36="onDecision;9;CHK;?KM0030010form1/*[eq]NORMAL[and]?KM0030010form1/PROJECT_CD[eq]SAME[and]?KM0030010form1/ESTIMATE_NO[eq]SAME[and]?KM0030010form1/rdoSHIP_INST[eq]SAME@*25,*29"
expj.KM0030010.KM0030010form1.onDecision9 = function () {
  console.log('KM0030010form1 script36');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '?KM0030010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '?KM0030010form1/PROJECT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '?KM0030010form1/ESTIMATE_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '?KM0030010form1/rdoSHIP_INST'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
} else {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
}
};
// script37="child;25;CHK;_KM0030010form2/DETAIL_NO[neq]0@*41,*28"
expj.KM0030010.KM0030010form1.child25 = function () {
  console.log('KM0030010form1 script37');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form2/DETAIL_NO'), '[neq]', '0')) {
if(expj.common.checkNameSpace(this.child41)){this.child41();}
} else {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
}
};
// script38="child;26;CHKRQ;B@*27,*28"
expj.KM0030010.KM0030010form1.child26 = function () {
  console.log('KM0030010form1 script38');
if (expj.common.pscript.satisfiedRequiredComponent('KM0030010', 'B')) {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
} else {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
}
};
// script39="child;27;UNMASK;_KM0030010button2/Modify@*30"
expj.KM0030010.KM0030010form1.child27 = function () {
  console.log('KM0030010form1 script39');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010button2/Modify');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child30)){this.child30();}}
};
// script40="child;28;MASK;_KM0030010button2/Modify@*30"
expj.KM0030010.KM0030010form1.child28 = function () {
  console.log('KM0030010form1 script40');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010button2/Modify');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child30)){this.child30();}}
};
// script41="child;29;MASK;_KM0030010button2/Modify,_KM0030010button0/Insert,_KM0030010button0/Update,_KM0030010button0/Delete"
expj.KM0030010.KM0030010form1.child29 = function () {
  console.log('KM0030010form1 script41');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010button2/Modify');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010button0/Insert');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010button0/Update');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010button0/Delete');
};
// script42="child;30;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*31,*33"
expj.KM0030010.KM0030010form1.child30 = function () {
  console.log('KM0030010form1 script42');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
} else {
if(expj.common.checkNameSpace(this.child33)){this.child33();}
}
};
// script43="child;31;COLCHKT;KM0030010view1:_l_CUST_ODR_NO[neq]@*32,*33"
expj.KM0030010.KM0030010form1.child31 = function () {
  console.log('KM0030010form1 script43');
var selectCells = expj.common.pscript.getPreviewVIEWCells('KM0030010', 'KM0030010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_CUST_ODR_NO, '[neq]', '')) {
checkFlg = true;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
} else {
if(expj.common.checkNameSpace(this.child33)){this.child33();}
}
};
// script44="child;32;UNMASK;_KM0030010button0/Insert@*34"
expj.KM0030010.KM0030010form1.child32 = function () {
  console.log('KM0030010form1 script44');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010button0/Insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child34)){this.child34();}}
};
// script45="child;33;MASK;_KM0030010button0/Insert@*34"
expj.KM0030010.KM0030010form1.child33 = function () {
  console.log('KM0030010form1 script45');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010button0/Insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child34)){this.child34();}}
};
// script46="child;34;CHK;_KM0030010form1/rdoSHIP_UPDATE[eq]true@*35,*37"
expj.KM0030010.KM0030010form1.child34 = function () {
  console.log('KM0030010form1 script46');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/rdoSHIP_UPDATE'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child35)){this.child35();}
} else {
if(expj.common.checkNameSpace(this.child37)){this.child37();}
}
};
// script47="child;35;COLCHKT;KM0030010view1:_h_UPDATE_FLG[eq]1@*36,*37"
expj.KM0030010.KM0030010form1.child35 = function () {
  console.log('KM0030010form1 script47');
var selectCells = expj.common.pscript.getPreviewVIEWCells('KM0030010', 'KM0030010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.h_UPDATE_FLG, '[eq]', '1')) {
checkFlg = true;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child36)){this.child36();}
} else {
if(expj.common.checkNameSpace(this.child37)){this.child37();}
}
};
// script48="child;36;UNMASK;_KM0030010button0/Update@*38"
expj.KM0030010.KM0030010form1.child36 = function () {
  console.log('KM0030010form1 script48');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010button0/Update');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child38)){this.child38();}}
};
// script49="child;37;MASK;_KM0030010button0/Update@*38"
expj.KM0030010.KM0030010form1.child37 = function () {
  console.log('KM0030010form1 script49');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010button0/Update');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child38)){this.child38();}}
};
// script50="child;38;CHK;_KM0030010form1/rdoSHIP_UPDATE[eq]true[and]_KM0030010form2/DETAIL_NO[neq]0@*39,*40"
expj.KM0030010.KM0030010form1.child38 = function () {
  console.log('KM0030010form1 script50');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/rdoSHIP_UPDATE'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form2/DETAIL_NO'), '[neq]', '0')) {
if(expj.common.checkNameSpace(this.child39)){this.child39();}
} else {
if(expj.common.checkNameSpace(this.child40)){this.child40();}
}
};
// script51="child;39;UNMASK;_KM0030010button0/Delete"
expj.KM0030010.KM0030010form1.child39 = function () {
  console.log('KM0030010form1 script51');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010button0/Delete');
};
// script52="child;40;MASK;_KM0030010button0/Delete"
expj.KM0030010.KM0030010form1.child40 = function () {
  console.log('KM0030010form1 script52');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010button0/Delete');
};
// script53="child;41;CHK;_KM0030010form2/c_INPUTODRCD[eq]true@*42,*26"
expj.KM0030010.KM0030010form1.child41 = function () {
  console.log('KM0030010form1 script53');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form2/c_INPUTODRCD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child42)){this.child42();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script54="child;42;CHKRQ;B,C@*27,*28"
expj.KM0030010.KM0030010form1.child42 = function () {
  console.log('KM0030010form1 script54');
if (expj.common.pscript.satisfiedRequiredComponent('KM0030010', 'B') && expj.common.pscript.satisfiedRequiredComponent('KM0030010', 'C')) {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
} else {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
}
};
// script55="onDecision;10;CHK;_KM0030010form2/h_ESTIMATE_TYPE[eq]2@*44,*43"
expj.KM0030010.KM0030010form1.onDecision10 = function () {
  console.log('KM0030010form1 script55');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form2/h_ESTIMATE_TYPE'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child44)){this.child44();}
} else {
if(expj.common.checkNameSpace(this.child43)){this.child43();}
}
};
// script56="child;43;UNMASK;_KM0030010form2/DLV_LOC_CD,_KM0030010form2/PeekerTargetDlvLocCd"
expj.KM0030010.KM0030010form1.child43 = function () {
  console.log('KM0030010form1 script56');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/DLV_LOC_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/PeekerTargetDlvLocCd');
};
// script57="child;44;MASK;_KM0030010form2/DLV_LOC_CD,_KM0030010form2/PeekerTargetDlvLocCd"
expj.KM0030010.KM0030010form1.child44 = function () {
  console.log('KM0030010form1 script57');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/DLV_LOC_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form1', '_KM0030010form2/PeekerTargetDlvLocCd');
};
expj.KM0030010.KM0030010form1.executeAllOnDecision = function () {
  console.log('execute KM0030010form1.onDecision');
  for (var i = 0; i <= 10; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010form1['onDecision' + i])) {
        expj.KM0030010.KM0030010form1['onDecision' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010form1.executeOnLoad = function () {
  expj.KM0030010.KM0030010form1.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form1.executePScriptOnLoad = function () {
  console.log('execute KM0030010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KM0030010.KM0030010form1['onLoad' + i])) {
      expj.KM0030010.KM0030010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KM0030010-KM0030010form1" action="KM0030010Servlet" name="KM0030010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKM0030010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROJECT_CD",rb)%></span><!-- 案件番号 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form1-PROJECT_CD">
expj.KM0030010.KM0030010form1.PROJECT_CD = {};
expj.KM0030010.KM0030010form1.PROJECT_CD.executeAllOnDecision = function () {
  console.log('execute KM0030010form1/PROJECT_CD.onDecision');
  expj.KM0030010.KM0030010form1.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form1.PROJECT_CD.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form1-PROJECT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form1', 'PROJECT_CD', this);
  });
  expj.KM0030010.KM0030010form1.PROJECT_CD.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form1.PROJECT_CD.executePScriptOnLoad = function () {
  console.log('execute KM0030010form1/PROJECT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form1-PROJECT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form1-PROJECT_CD" name="PROJECT_CD" class="KM0030010-focus-move  required-value expj-KM0030010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getPROJECT_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form1-PeekerIPROJECT_CD">
expj.KM0030010.KM0030010form1.PeekerIPROJECT_CD = {};
// script1="onClick;0;PEEKER;_KM0030010form1/PROJECT_CD:_KM0030010form1/ESTIMATE_NO@<%=contextNo%>"
expj.KM0030010.KM0030010form1.PeekerIPROJECT_CD.onClick0 = function () {
  console.log('PeekerIPROJECT_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0030010';
var parameterValues = 'PeekerIPROJECT_CD%=%汎用%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form1', '_KM0030010form1/PROJECT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PROJECT_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_KM0030010form1/PROJECT_CD:_KM0030010form1/ESTIMATE_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0030010.KM0030010form1.PeekerIPROJECT_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010form1.PeekerIPROJECT_CD['onClick' + i])) {
        expj.KM0030010.KM0030010form1.PeekerIPROJECT_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010form1.PeekerIPROJECT_CD.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010form1.PeekerIPROJECT_CD.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form1-PeekerIPROJECT_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010form1', 'PeekerIPROJECT_CD', this, 'Button');
    }
  });
  expj.KM0030010.KM0030010form1.PeekerIPROJECT_CD.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form1.PeekerIPROJECT_CD.executePScriptOnLoad = function () {
  console.log('execute KM0030010form1/PeekerIPROJECT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form1-PeekerIPROJECT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0030010-KM0030010form1-PeekerIPROJECT_CD" class="KM0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form1-PROJECT_NAME">
expj.KM0030010.KM0030010form1.PROJECT_NAME = {};
expj.KM0030010.KM0030010form1.PROJECT_NAME.executeAllOnDecision = function () {
  console.log('execute KM0030010form1/PROJECT_NAME.onDecision');
  expj.KM0030010.KM0030010form1.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form1.PROJECT_NAME.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form1-PROJECT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form1', 'PROJECT_NAME', this);
  });
  expj.KM0030010.KM0030010form1.PROJECT_NAME.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form1.PROJECT_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0030010form1/PROJECT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form1-PROJECT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:430px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form1-PROJECT_NAME" name="PROJECT_NAME" class="KM0030010-focus-move  " style="width:430px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getPROJECT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KM0030010-KM0030010form1-h_PRD_REQ_JOB_ODR_TYP_2" name="h_PRD_REQ_JOB_ODR_TYP_2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0030010Struct.geth_PRD_REQ_JOB_ODR_TYP_2()) %>">
<script class="expj-script-KM0030010-KM0030010form1-h_PRD_REQ_JOB_ODR_TYP_2">
expj.KM0030010.KM0030010form1.h_PRD_REQ_JOB_ODR_TYP_2 = {};
expj.KM0030010.KM0030010form1.h_PRD_REQ_JOB_ODR_TYP_2.executeAllOnDecision = function () {
  console.log('execute KM0030010form1/h_PRD_REQ_JOB_ODR_TYP_2.onDecision');
  expj.KM0030010.KM0030010form1.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form1.h_PRD_REQ_JOB_ODR_TYP_2.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form1-h_PRD_REQ_JOB_ODR_TYP_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form1', 'h_PRD_REQ_JOB_ODR_TYP_2', this);
  });
  expj.KM0030010.KM0030010form1.h_PRD_REQ_JOB_ODR_TYP_2.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form1.h_PRD_REQ_JOB_ODR_TYP_2.executePScriptOnLoad = function () {
  console.log('execute KM0030010form1/h_PRD_REQ_JOB_ODR_TYP_2.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form1-h_PRD_REQ_JOB_ODR_TYP_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-KM0030010-KM0030010form1-h_PRD_REQ_JOB_ODR_TYP_1" name="h_PRD_REQ_JOB_ODR_TYP_1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0030010Struct.geth_PRD_REQ_JOB_ODR_TYP_1()) %>">
<script class="expj-script-KM0030010-KM0030010form1-h_PRD_REQ_JOB_ODR_TYP_1">
expj.KM0030010.KM0030010form1.h_PRD_REQ_JOB_ODR_TYP_1 = {};
expj.KM0030010.KM0030010form1.h_PRD_REQ_JOB_ODR_TYP_1.executeAllOnDecision = function () {
  console.log('execute KM0030010form1/h_PRD_REQ_JOB_ODR_TYP_1.onDecision');
  expj.KM0030010.KM0030010form1.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form1.h_PRD_REQ_JOB_ODR_TYP_1.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form1-h_PRD_REQ_JOB_ODR_TYP_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form1', 'h_PRD_REQ_JOB_ODR_TYP_1', this);
  });
  expj.KM0030010.KM0030010form1.h_PRD_REQ_JOB_ODR_TYP_1.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form1.h_PRD_REQ_JOB_ODR_TYP_1.executePScriptOnLoad = function () {
  console.log('execute KM0030010form1/h_PRD_REQ_JOB_ODR_TYP_1.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form1-h_PRD_REQ_JOB_ODR_TYP_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ESTIMATES_CD",rb)%></span><!-- 見積番号 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form1-ESTIMATE_NO">
expj.KM0030010.KM0030010form1.ESTIMATE_NO = {};
expj.KM0030010.KM0030010form1.ESTIMATE_NO.executeAllOnDecision = function () {
  console.log('execute KM0030010form1/ESTIMATE_NO.onDecision');
  expj.KM0030010.KM0030010form1.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form1.ESTIMATE_NO.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form1-ESTIMATE_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form1', 'ESTIMATE_NO', this);
  });
  expj.KM0030010.KM0030010form1.ESTIMATE_NO.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form1.ESTIMATE_NO.executePScriptOnLoad = function () {
  console.log('execute KM0030010form1/ESTIMATE_NO.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form1-ESTIMATE_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form1-ESTIMATE_NO" name="ESTIMATE_NO" class="KM0030010-focus-move  " style="width:100%;text-align: right;" data-kind="OBT_NUMBER_Z;3.0;CEIL;0" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getESTIMATE_NO()) %>" maxlength="3" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_NAME",rb)%></span><!-- 得意先名 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form1-CUST_NAME">
expj.KM0030010.KM0030010form1.CUST_NAME = {};
expj.KM0030010.KM0030010form1.CUST_NAME.executeAllOnDecision = function () {
  console.log('execute KM0030010form1/CUST_NAME.onDecision');
  expj.KM0030010.KM0030010form1.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form1.CUST_NAME.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form1-CUST_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form1', 'CUST_NAME', this);
  });
  expj.KM0030010.KM0030010form1.CUST_NAME.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form1.CUST_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0030010form1/CUST_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form1-CUST_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form1-CUST_NAME" name="CUST_NAME" class="KM0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getCUST_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KM0030010-KM0030010form1-CUST_CD" name="CUST_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getCUST_CD()) %>">
<script class="expj-script-KM0030010-KM0030010form1-CUST_CD">
expj.KM0030010.KM0030010form1.CUST_CD = {};
expj.KM0030010.KM0030010form1.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KM0030010form1/CUST_CD.onDecision');
  expj.KM0030010.KM0030010form1.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form1.CUST_CD.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form1-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form1', 'CUST_CD', this);
  });
  expj.KM0030010.KM0030010form1.CUST_CD.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form1.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KM0030010form1/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form1-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form1-rdoSHIP_INST">
expj.KM0030010.KM0030010form1.rdoSHIP_INST = {};
expj.KM0030010.KM0030010form1.rdoSHIP_INST.executeAllOnDecision = function () {
  console.log('execute KM0030010form1/rdoSHIP_INST.onDecision');
  expj.KM0030010.KM0030010form1.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form1.rdoSHIP_INST.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form1-rdoSHIP_INST').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010form1', 'rdoSHIP_INST', this, 'RadioButton');
    }
  });
  expj.KM0030010.KM0030010form1.rdoSHIP_INST.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form1.rdoSHIP_INST.executePScriptOnLoad = function () {
  console.log('execute KM0030010form1/rdoSHIP_INST.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form1-rdoSHIP_INST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoSHIP" data-name="rdoSHIP_INST" value="true" <%= ("true".equals(TypeConverter.convert(aKM0030010Struct.getrdoSHIP_INST())) || "".equals(TypeConverter.convert(aKM0030010Struct.getrdoSHIP_INST())))?"checked=\"checked\"": "" %> class="" id="expj-KM0030010-KM0030010form1-rdoSHIP_INST" ><label for="expj-KM0030010-KM0030010form1-rdoSHIP_INST"><%=CoreTools.getRBString("Expj.Cmt6703",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form1-rdoSHIP_UPDATE">
expj.KM0030010.KM0030010form1.rdoSHIP_UPDATE = {};
expj.KM0030010.KM0030010form1.rdoSHIP_UPDATE.executeAllOnDecision = function () {
  console.log('execute KM0030010form1/rdoSHIP_UPDATE.onDecision');
  expj.KM0030010.KM0030010form1.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form1.rdoSHIP_UPDATE.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form1-rdoSHIP_UPDATE').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010form1', 'rdoSHIP_UPDATE', this, 'RadioButton');
    }
  });
  expj.KM0030010.KM0030010form1.rdoSHIP_UPDATE.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form1.rdoSHIP_UPDATE.executePScriptOnLoad = function () {
  console.log('execute KM0030010form1/rdoSHIP_UPDATE.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form1-rdoSHIP_UPDATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoSHIP" data-name="rdoSHIP_UPDATE" value="true" <%= ("true".equals(TypeConverter.convert(aKM0030010Struct.getrdoSHIP_UPDATE())))?"checked=\"checked\"":"" %> class="" id="expj-KM0030010-KM0030010form1-rdoSHIP_UPDATE" ><label for="expj-KM0030010-KM0030010form1-rdoSHIP_UPDATE"><%=CoreTools.getRBString("Expj.Cmt6704",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KM0030010-KM0030010form1-h_APR_ODR" name="h_APR_ODR" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0030010Struct.geth_APR_ODR()) %>">
<script class="expj-script-KM0030010-KM0030010form1-h_APR_ODR">
expj.KM0030010.KM0030010form1.h_APR_ODR = {};
expj.KM0030010.KM0030010form1.h_APR_ODR.executeAllOnDecision = function () {
  console.log('execute KM0030010form1/h_APR_ODR.onDecision');
  expj.KM0030010.KM0030010form1.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form1.h_APR_ODR.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form1-h_APR_ODR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form1', 'h_APR_ODR', this);
  });
  expj.KM0030010.KM0030010form1.h_APR_ODR.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form1.h_APR_ODR.executePScriptOnLoad = function () {
  console.log('execute KM0030010form1/h_APR_ODR.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form1-h_APR_ODR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KM0030010-KM0030010button1">
expj.KM0030010.KM0030010button1 = {};
expj.KM0030010.KM0030010button1.executeAllOnDecision = function () {
  console.log('execute KM0030010button1.onDecision');
};
expj.KM0030010.KM0030010button1.executeOnLoad = function () {
  expj.KM0030010.KM0030010button1.executePScriptOnLoad();
};

expj.KM0030010.KM0030010button1.executePScriptOnLoad = function () {
  console.log('execute KM0030010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0030010-KM0030010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0030010-KM0030010button1-Select">
expj.KM0030010.KM0030010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0030010form1/*@KM0030010Servlet,,"
expj.KM0030010.KM0030010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0030010', 'KM0030010button1', '_KM0030010form1/*', 'KM0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0030010', response);
expj.common.updateBusinessScreenTab('KM0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0030010.KM0030010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010button1.Select['onClick' + i])) {
        expj.KM0030010.KM0030010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010button1.Select.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010button1.Select.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010button1', 'Select', this, 'Button');
    }
  });
  expj.KM0030010.KM0030010button1.Select.executePScriptOnLoad();
};

expj.KM0030010.KM0030010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KM0030010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0030010-KM0030010button1-Select" name="Select" class="KM0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに中段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KM0030010-KM0030010view1">
expj.KM0030010.KM0030010view1 = {};
// script1="onClick;0;SET;_KM0030010form2/DETAIL_NO=_KM0030010view1/l_DETAL_NO,_KM0030010form2/ACPT_ODR_CD=_KM0030010view1/l_ODR_NO,_KM0030010form2/ODR_TYP=_KM0030010view1/l_ODR_TYP,_KM0030010form2/CUST_ODR_NO=_KM0030010view1/l_CUST_ODR_NO,_KM0030010form2/DESINATED_DLV_DATE=_KM0030010view1/l_DESINATED_DLV_DATE,_KM0030010form2/DLV_LOC_CD=_KM0030010view1/l_DLV_LOC_CD,_KM0030010form2/ESTIMATE_TYPE=_KM0030010view1/l_ESTIMATE_TYPE,_KM0030010form2/ITEM_NAME=_KM0030010view1/l_ESTIMATE_ITEM_NAME,_KM0030010form2/CUST_ITEM_CD=_KM0030010view1/l_CUST_ITEM_CD,_KM0030010form2/QTY=_KM0030010view1/l_ODR_QTY,_KM0030010form2/QTY_UNIT=_KM0030010view1/l_UNIT_CD,_KM0030010form2/ODR_UNIT_PRICE=_KM0030010view1/l_ESTIMATE_UNIT_PRICE,_KM0030010form2/ODR_AMOUNT=_KM0030010view1/l_ODR_AMOUNT,_KM0030010form2/ISSUE_INST_COMMENT=_KM0030010view1/l_REMARKS,_KM0030010form2/APPROVED_COMMENT=_KM0030010view1/l_APPR_REMARKS,_KM0030010form2/CUST_CHRG_PSN_CD=_KM0030010view1/l_OWN_PERSON_CD,_KM0030010form2/ES_ORG_CD=_KM0030010view1                                    /l_OWN_ORG_CD,_KM0030010form2/ITEM_CD=_KM0030010view1/l_ITEM_CD,_KM0030010form2/ODR_ACPT_DATE=_KM0030010view1/l_ODR_ACPT_DATE,_KM0030010form2/PREPARE_QTY=_KM0030010view1/l_ESTIMATE_QTY,_KM0030010form2/JOB_ODR_DLV_DATE=_KM0030010view1/l_JOB_ODR_DLV_DATE,_KM0030010form2/ALC_GRP_CD=_KM0030010view1/l_ALC_GRP_CD,_KM0030010form2/JOB_ODR_CD=_KM0030010view1/l_JOB_ODR_CD,_KM0030010form2/ODR_AMOUNT_EXCH_RATES=_KM0030010view1/l_ODR_AMOUNT_EXCH_RATES,_KM0030010form2/CUST_ITEM_NAME=_KM0030010view1/l_CUST_ITEM_NAME,_KM0030010form2/CUST_CHRG_PSN_NAME=_KM0030010view1/l_CUST_CHRG_PSN_NAME,_KM0030010form2/ES_ORG_NAME=_KM0030010view1/l_CUST_CHRG_ORG_NAME,_KM0030010form2/ITEM_NAME_R=_KM0030010view1/l_ITEM_NAME,_KM0030010form2/h_ODR_TYP=_KM0030010view1/l_h_ODR_TYP,_KM0030010form2/h_ESTIMATE_TYPE=_KM0030010view1/l_h_ESTIMATE_TYPE,_KM0030010form2/ODR_PRICE_UNIT=_KM0030010view1/l_CUR_UNIT,_KM0030010form2/h_DLV_LOC_CD=_KM0030010view1/l_DLV_LOC_CD,_KM0030010form2/h_ANS_DLV_DATE_EXIST_FLG=_KM0030010view1                        /l_h_ANS_DLV_DATE_EXIST_FLG@*0"
expj.KM0030010.KM0030010view1.onClick0 = function () {
  console.log('KM0030010view1 script1');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/DETAIL_NO', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_DETAL_NO'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ACPT_ODR_CD', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_ODR_NO'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ODR_TYP', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_ODR_TYP'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/CUST_ODR_NO', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_CUST_ODR_NO'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/DESINATED_DLV_DATE', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_DESINATED_DLV_DATE'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/DLV_LOC_CD', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_DLV_LOC_CD'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ESTIMATE_TYPE', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_ESTIMATE_TYPE'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ITEM_NAME', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_ESTIMATE_ITEM_NAME'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/CUST_ITEM_CD', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_CUST_ITEM_CD'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/QTY', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_ODR_QTY'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/QTY_UNIT', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_UNIT_CD'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ODR_UNIT_PRICE', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_ESTIMATE_UNIT_PRICE'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ODR_AMOUNT', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_ODR_AMOUNT'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ISSUE_INST_COMMENT', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_REMARKS'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/APPROVED_COMMENT', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_APPR_REMARKS'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/CUST_CHRG_PSN_CD', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_OWN_PERSON_CD'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ES_ORG_CD', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1                                    /l_OWN_ORG_CD'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ITEM_CD', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_ITEM_CD'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ODR_ACPT_DATE', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_ODR_ACPT_DATE'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/PREPARE_QTY', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_ESTIMATE_QTY'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/JOB_ODR_DLV_DATE', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_JOB_ODR_DLV_DATE'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ALC_GRP_CD', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_ALC_GRP_CD'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/JOB_ODR_CD', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_JOB_ODR_CD'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ODR_AMOUNT_EXCH_RATES', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_ODR_AMOUNT_EXCH_RATES'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/CUST_ITEM_NAME', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_CUST_ITEM_NAME'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/CUST_CHRG_PSN_NAME', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_CUST_CHRG_PSN_NAME'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ES_ORG_NAME', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_CUST_CHRG_ORG_NAME'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ITEM_NAME_R', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_ITEM_NAME'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/h_ODR_TYP', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_h_ODR_TYP'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/h_ESTIMATE_TYPE', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_h_ESTIMATE_TYPE'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ODR_PRICE_UNIT', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_CUR_UNIT'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/h_DLV_LOC_CD', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_DLV_LOC_CD'));
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/h_ANS_DLV_DATE_EXIST_FLG', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1                        /l_h_ANS_DLV_DATE_EXIST_FLG'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child0)){this.child0();}}
};
// script2="child;0;CHK;_KM0030010view1/l_ODR_TYP[eq]@*1"
expj.KM0030010.KM0030010view1.child0 = function () {
  console.log('KM0030010view1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_ODR_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;SET;_KM0030010form2/h_ODR_TYP=3,_KM0030010form2/ODR_TYP=_KM0030010form2/h_ODR_TYP3"
expj.KM0030010.KM0030010view1.child1 = function () {
  console.log('KM0030010view1 script3');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/h_ODR_TYP', '3');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/ODR_TYP', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/h_ODR_TYP3'));
};
// script4="onClick;1;CHK;_KM0030010view1/l_c_DOODR[eq]true@*3,*6"
expj.KM0030010.KM0030010view1.onClick1 = function () {
  console.log('KM0030010view1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_c_DOODR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script5="child;3;SET;_KM0030010form2/c_DOODR=true"
expj.KM0030010.KM0030010view1.child3 = function () {
  console.log('KM0030010view1 script5');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/c_DOODR', 'true');
};
// script6="onClick;2;CHK;_KM0030010view1/l_c_INPUTODRCD[eq]true@*5,*7"
expj.KM0030010.KM0030010view1.onClick2 = function () {
  console.log('KM0030010view1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010view1/l_c_INPUTODRCD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script7="child;5;SET;_KM0030010form2/c_INPUTODRCD=true"
expj.KM0030010.KM0030010view1.child5 = function () {
  console.log('KM0030010view1 script7');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/c_INPUTODRCD', 'true');
};
// script8="child;6;SET;_KM0030010form2/c_DOODR=false"
expj.KM0030010.KM0030010view1.child6 = function () {
  console.log('KM0030010view1 script8');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/c_DOODR', 'false');
};
// script9="child;7;SET;_KM0030010form2/c_INPUTODRCD=false"
expj.KM0030010.KM0030010view1.child7 = function () {
  console.log('KM0030010view1 script9');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010view1', '_KM0030010form2/c_INPUTODRCD', 'false');
};
expj.KM0030010.KM0030010view1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010view1['onClick' + i])) {
        expj.KM0030010.KM0030010view1['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010view1.executeAllOnDecision = function () {
  console.log('execute KM0030010view1.onDecision');
};
expj.KM0030010.KM0030010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KM0030010view1", "expj.KM0030010.KM0030010view1.executeAllOnClick");
%>
  expj.KM0030010.KM0030010view1.executePScriptOnLoad();
};

expj.KM0030010.KM0030010view1.executePScriptOnLoad = function () {
  console.log('execute KM0030010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KM0030010-KM0030010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String KM0030010view1_Id = "KM0030010view1";
 String KM0030010view1_select = "single";
 String KM0030010view1_sortable = "true";
 String KM0030010view1_resize = "true";
 String KM0030010view1_scroll = "true";
 StringBuffer KM0030010view1_HB = new StringBuffer();
 StringBuffer KM0030010view1_DB = new StringBuffer();
%>
<%
 KM0030010view1_select = "single";
 KM0030010view1_sortable = "true";
 KM0030010view1_resize = "true";
 KM0030010view1_scroll = "true";
%>
<%
 KM0030010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
%>
     
<%
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DETAIL_NO",rb))).append("', 'name':'l_DETAL_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ARRANGE_ITEMS_SPECIES",rb))).append("', 'name':'l_ESTIMATE_TYPE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ESTIMATE_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_ODR_CD",rb))).append("', 'name':'l_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_TYP",rb))).append("', 'name':'l_ODR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt6197",rb))).append("', 'name':'l_CUST_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb))).append("', 'name':'l_CUST_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb))).append("', 'name':'l_DESINATED_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY_4",rb))).append("', 'name':'l_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'l_UNIT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_UNIT_PRICE",rb))).append("', 'name':'l_ESTIMATE_UNIT_PRICE', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt1647",rb))).append("', 'name':'l_CUR_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_AMOUNT",rb))).append("', 'name':'l_ODR_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_AMOUNT_EXCH_RATES",rb))).append("', 'name':'l_ODR_AMOUNT_EXCH_RATES', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_CD",rb))).append("', 'name':'l_DLV_LOC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_NAME",rb))).append("', 'name':'l_DLV_LOC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEPO_TYP",rb))).append("', 'name':'l_DEPO_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_NAME",rb))).append("', 'name':'l_CUST_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME_4",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_ACPT_DATE",rb))).append("', 'name':'l_ODR_ACPT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3152",rb))).append("', 'name':'l_ESTIMATE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb))).append("', 'name':'l_JOB_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ALC_GRP_CD",rb))).append("', 'name':'l_ALC_GRP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_COMMENT_1",rb))).append("', 'name':'l_REMARKS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3165",rb))).append("', 'name':'l_APPR_REMARKS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt6705",rb))).append("', 'name':'l_OWN_PERSON_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt4347",rb))).append("', 'name':'l_CUST_CHRG_PSN_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt6706",rb))).append("', 'name':'l_OWN_ORG_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt4348",rb))).append("', 'name':'l_CUST_CHRG_ORG_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_ESTIMATE_TYPE', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_UPDATE_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_TODR_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_TEST_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_TPJ_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_PREC_ARRANGE_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_c_DOODR', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_c_INPUTODRCD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_ODR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_DEPO_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
KM0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_ANS_DLV_DATE_EXIST_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0030010view1_sortable).append("}").append(",");
%>
<%
 int aKM0030010StructLength = aKM0030010Control.getListsize();
 final KM0030010Struct structBackup = aKM0030010Struct;
 aKM0030010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKM0030010StructLength; ++loopCount) {
  if((aKM0030010Struct = (KM0030010Struct) aKM0030010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKM0030010Struct", aKM0030010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KM0030010view1_DB.append("[");
 KM0030010view1_DB.append(loopCount);
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_DETAL_NO-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_DETAL_NO\" data-name=\"l_DETAL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_DETAL_NO())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_ESTIMATE_TYPE-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_ESTIMATE_TYPE\" data-name=\"l_ESTIMATE_TYPE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_ESTIMATE_TYPE())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_ESTIMATE_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_ESTIMATE_ITEM_NAME\" data-name=\"l_ESTIMATE_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_ESTIMATE_ITEM_NAME())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_ODR_NO\" data-name=\"l_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_ODR_NO())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_ODR_TYP\" data-name=\"l_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_ODR_TYP())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_CUST_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_CUST_ODR_NO\" data-name=\"l_CUST_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_CUST_ODR_NO())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_CUST_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_CUST_ITEM_CD\" data-name=\"l_CUST_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_CUST_ITEM_CD())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_ITEM_CD())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_DESINATED_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_DESINATED_DLV_DATE\" data-name=\"l_DESINATED_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_DESINATED_DLV_DATE())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_ODR_QTY\" data-name=\"l_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_ODR_QTY())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_UNIT_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_UNIT_CD\" data-name=\"l_UNIT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_UNIT_CD())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_ESTIMATE_UNIT_PRICE-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_ESTIMATE_UNIT_PRICE\" data-name=\"l_ESTIMATE_UNIT_PRICE\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_ESTIMATE_UNIT_PRICE())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_CUR_UNIT-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_CUR_UNIT\" data-name=\"l_CUR_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_CUR_UNIT())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_ODR_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_ODR_AMOUNT\" data-name=\"l_ODR_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_ODR_AMOUNT())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_ODR_AMOUNT_EXCH_RATES-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_ODR_AMOUNT_EXCH_RATES\" data-name=\"l_ODR_AMOUNT_EXCH_RATES\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_ODR_AMOUNT_EXCH_RATES())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_DLV_LOC_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_DLV_LOC_CD\" data-name=\"l_DLV_LOC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_DLV_LOC_CD())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_DLV_LOC_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_DLV_LOC_NAME\" data-name=\"l_DLV_LOC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_DLV_LOC_NAME())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_DEPO_TYP-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_DEPO_TYP\" data-name=\"l_DEPO_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_DEPO_TYP())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_CUST_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_CUST_ITEM_NAME\" data-name=\"l_CUST_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_CUST_ITEM_NAME())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_ITEM_NAME())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_ODR_ACPT_DATE-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_ODR_ACPT_DATE\" data-name=\"l_ODR_ACPT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_ODR_ACPT_DATE())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_ESTIMATE_QTY-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_ESTIMATE_QTY\" data-name=\"l_ESTIMATE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_ESTIMATE_QTY())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_JOB_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_JOB_ODR_DLV_DATE\" data-name=\"l_JOB_ODR_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_JOB_ODR_DLV_DATE())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_ALC_GRP_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_ALC_GRP_CD\" data-name=\"l_ALC_GRP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_ALC_GRP_CD())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_JOB_ODR_CD())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_REMARKS-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_REMARKS\" data-name=\"l_REMARKS\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_REMARKS())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_APPR_REMARKS-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_APPR_REMARKS\" data-name=\"l_APPR_REMARKS\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_APPR_REMARKS())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_OWN_PERSON_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_OWN_PERSON_CD\" data-name=\"l_OWN_PERSON_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_OWN_PERSON_CD())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_CUST_CHRG_PSN_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_CUST_CHRG_PSN_NAME\" data-name=\"l_CUST_CHRG_PSN_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_CUST_CHRG_PSN_NAME())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_OWN_ORG_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_OWN_ORG_CD\" data-name=\"l_OWN_ORG_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_OWN_ORG_CD())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_CUST_CHRG_ORG_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_CUST_CHRG_ORG_NAME\" data-name=\"l_CUST_CHRG_ORG_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_CUST_CHRG_ORG_NAME())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_h_ESTIMATE_TYPE-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_h_ESTIMATE_TYPE\" data-name=\"l_h_ESTIMATE_TYPE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_h_ESTIMATE_TYPE())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-h_UPDATE_FLG-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-h_UPDATE_FLG\" data-name=\"h_UPDATE_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.geth_UPDATE_FLG())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_TODR_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_TODR_MODIFY_COUNT\" data-name=\"l_TODR_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_TODR_MODIFY_COUNT())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_TEST_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_TEST_MODIFY_COUNT\" data-name=\"l_TEST_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_TEST_MODIFY_COUNT())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_TPJ_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_TPJ_MODIFY_COUNT\" data-name=\"l_TPJ_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_TPJ_MODIFY_COUNT())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_h_PREC_ARRANGE_FLG-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_h_PREC_ARRANGE_FLG\" data-name=\"l_h_PREC_ARRANGE_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_h_PREC_ARRANGE_FLG())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_c_DOODR-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_c_DOODR\" data-name=\"l_c_DOODR\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_c_DOODR())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_c_INPUTODRCD-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_c_INPUTODRCD\" data-name=\"l_c_INPUTODRCD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_c_INPUTODRCD())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_h_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_h_ODR_TYP\" data-name=\"l_h_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_h_ODR_TYP())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_h_DEPO_TYP-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_h_DEPO_TYP\" data-name=\"l_h_DEPO_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_h_DEPO_TYP())).append("</span>'");
 KM0030010view1_DB.append(",").append("'<span id=\"expj-KM0030010-KM0030010view1-l_h_ANS_DLV_DATE_EXIST_FLG-").append(loopCount).append("\" class=\"expj-label expj-KM0030010-KM0030010view1-l_h_ANS_DLV_DATE_EXIST_FLG\" data-name=\"l_h_ANS_DLV_DATE_EXIST_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0030010Struct.getl_h_ANS_DLV_DATE_EXIST_FLG())).append("</span>'");
 KM0030010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKM0030010StructLength) {
   KM0030010view1_DB.append(",");
  }
 }
 aKM0030010Struct = structBackup;
 viewIdList.add(KM0030010view1_Id);
 viewSelectList.add(KM0030010view1_select);
 viewResizeList.add(KM0030010view1_resize);
 viewScrollList.add(KM0030010view1_scroll);
 viewHeaderDataList.add(KM0030010view1_HB);
 viewBodyDataList.add(KM0030010view1_DB);
%>
<%
}
%>
<!-- ここに中段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame01 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02 button-area" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame03 button-area-right" style="width:60px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KM0030010-KM0030010form2">
expj.KM0030010.KM0030010form2 = {};
expj.KM0030010.KM0030010form2.executeAllOnDecision = function () {
  console.log('execute KM0030010form2.onDecision');
};
expj.KM0030010.KM0030010form2.executeOnLoad = function () {
  expj.KM0030010.KM0030010form2.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KM0030010-KM0030010form2" action="KM0030010Servlet" name="KM0030010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:207px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:207px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DETAIL_NO",rb)%></span><!-- 明細番号 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-DETAIL_NO">
expj.KM0030010.KM0030010form2.DETAIL_NO = {};
expj.KM0030010.KM0030010form2.DETAIL_NO.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/DETAIL_NO.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.DETAIL_NO.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-DETAIL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'DETAIL_NO', this);
  });
  expj.KM0030010.KM0030010form2.DETAIL_NO.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.DETAIL_NO.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/DETAIL_NO.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-DETAIL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-DETAIL_NO" name="DETAIL_NO" class="KM0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;3.0;CEIL;0" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getDETAIL_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ODR_ACPT_DATE",rb)%></span><!-- 受注日 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ODR_ACPT_DATE">
expj.KM0030010.KM0030010form2.ODR_ACPT_DATE = {};
expj.KM0030010.KM0030010form2.ODR_ACPT_DATE.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ODR_ACPT_DATE.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ODR_ACPT_DATE.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ODR_ACPT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ODR_ACPT_DATE', this);
  });
  expj.KM0030010.KM0030010form2.ODR_ACPT_DATE.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ODR_ACPT_DATE.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ODR_ACPT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ODR_ACPT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ODR_ACPT_DATE" name="ODR_ACPT_DATE" class="KM0030010-focus-move  required-value expj-KM0030010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getODR_ACPT_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-CalendarTargetOdrAcptDate">
expj.KM0030010.KM0030010form2.CalendarTargetOdrAcptDate = {};
// script1="onClick;0;CALENDAR;_KM0030010form2/ODR_ACPT_DATE@<%=contextNo%>"
expj.KM0030010.KM0030010form2.CalendarTargetOdrAcptDate.onClick0 = function () {
  console.log('CalendarTargetOdrAcptDate script1');
expj.common.pscript.executeCalendar('KM0030010','KM0030010form2','_KM0030010form2/ODR_ACPT_DATE');
};
expj.KM0030010.KM0030010form2.CalendarTargetOdrAcptDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010form2.CalendarTargetOdrAcptDate['onClick' + i])) {
        expj.KM0030010.KM0030010form2.CalendarTargetOdrAcptDate['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010form2.CalendarTargetOdrAcptDate.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010form2.CalendarTargetOdrAcptDate.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-CalendarTargetOdrAcptDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010form2', 'CalendarTargetOdrAcptDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KM0030010','KM0030010form2','_KM0030010form2/ODR_ACPT_DATE');
  expj.KM0030010.KM0030010form2.CalendarTargetOdrAcptDate.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.CalendarTargetOdrAcptDate.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/CalendarTargetOdrAcptDate.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-CalendarTargetOdrAcptDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0030010-KM0030010form2-CalendarTargetOdrAcptDate" class="KM0030010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_ODR_CD",rb)%></span><!-- 受注番号 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ACPT_ODR_CD">
expj.KM0030010.KM0030010form2.ACPT_ODR_CD = {};
expj.KM0030010.KM0030010form2.ACPT_ODR_CD.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ACPT_ODR_CD.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ACPT_ODR_CD.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ACPT_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ACPT_ODR_CD', this);
  });
  expj.KM0030010.KM0030010form2.ACPT_ODR_CD.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ACPT_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ACPT_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ACPT_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ACPT_ODR_CD" name="ACPT_ODR_CD" class="KM0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getACPT_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KM0030010-KM0030010form2-h_ODR_TYP3" name="h_ODR_TYP3" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0030010Struct.geth_ODR_TYP3()) %>">
<script class="expj-script-KM0030010-KM0030010form2-h_ODR_TYP3">
expj.KM0030010.KM0030010form2.h_ODR_TYP3 = {};
expj.KM0030010.KM0030010form2.h_ODR_TYP3.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/h_ODR_TYP3.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.h_ODR_TYP3.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-h_ODR_TYP3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'h_ODR_TYP3', this);
  });
  expj.KM0030010.KM0030010form2.h_ODR_TYP3.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.h_ODR_TYP3.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/h_ODR_TYP3.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-h_ODR_TYP3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-c_DOODR">
expj.KM0030010.KM0030010form2.c_DOODR = {};
// script1="onLoad;0;CALL;onClick@0"
expj.KM0030010.KM0030010form2.c_DOODR.onLoad0 = function () {
  console.log('c_DOODR script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_c_DOODR[eq]true@*0,*5"
expj.KM0030010.KM0030010form2.c_DOODR.onClick0 = function () {
  console.log('c_DOODR script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form2', '_c_DOODR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script3="child;0;UNMASK;_PREPARE_QTY,_JOB_ODR_DLV_DATE,_ALC_GRP_CD,_CalendarTargetJobOdrDlvDate@*1"
expj.KM0030010.KM0030010form2.c_DOODR.child0 = function () {
  console.log('c_DOODR script3');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form2', '_PREPARE_QTY');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form2', '_JOB_ODR_DLV_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form2', '_ALC_GRP_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form2', '_CalendarTargetJobOdrDlvDate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;CHK;_KM0030010form1/h_PRD_REQ_JOB_ODR_TYP_2[eq]2@*2,*4"
expj.KM0030010.KM0030010form2.c_DOODR.child1 = function () {
  console.log('c_DOODR script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form2', '_KM0030010form1/h_PRD_REQ_JOB_ODR_TYP_2'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;2;SET;_c_INPUTODRCD=true@*3"
expj.KM0030010.KM0030010form2.c_DOODR.child2 = function () {
  console.log('c_DOODR script5');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010form2', '_c_INPUTODRCD', 'true');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script6="child;3;MASK;_c_INPUTODRCD"
expj.KM0030010.KM0030010form2.c_DOODR.child3 = function () {
  console.log('c_DOODR script6');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form2', '_c_INPUTODRCD');
};
// script7="child;4;UNMASK;_c_INPUTODRCD"
expj.KM0030010.KM0030010form2.c_DOODR.child4 = function () {
  console.log('c_DOODR script7');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form2', '_c_INPUTODRCD');
};
// script8="child;5;SET;_c_INPUTODRCD@*6"
expj.KM0030010.KM0030010form2.c_DOODR.child5 = function () {
  console.log('c_DOODR script8');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010form2', '_c_INPUTODRCD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script9="child;6;SET;_PREPARE_QTY=0,_JOB_ODR_DLV_DATE,_ALC_GRP_CD,_c_INPUTODRCD,_CalendarTargetJobOdrDlvDate@*7"
expj.KM0030010.KM0030010form2.c_DOODR.child6 = function () {
  console.log('c_DOODR script9');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010form2', '_PREPARE_QTY', '0');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010form2', '_JOB_ODR_DLV_DATE', '');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010form2', '_ALC_GRP_CD', '');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010form2', '_c_INPUTODRCD', '');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010form2', '_CalendarTargetJobOdrDlvDate', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script10="child;7;MASK;_PREPARE_QTY,_JOB_ODR_DLV_DATE,_ALC_GRP_CD,_c_INPUTODRCD,_CalendarTargetJobOdrDlvDate"
expj.KM0030010.KM0030010form2.c_DOODR.child7 = function () {
  console.log('c_DOODR script10');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form2', '_PREPARE_QTY');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form2', '_JOB_ODR_DLV_DATE');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form2', '_ALC_GRP_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form2', '_c_INPUTODRCD');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form2', '_CalendarTargetJobOdrDlvDate');
};
expj.KM0030010.KM0030010form2.c_DOODR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010form2.c_DOODR['onClick' + i])) {
        expj.KM0030010.KM0030010form2.c_DOODR['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010form2.c_DOODR.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/c_DOODR.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.c_DOODR.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-c_DOODR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010form2', 'c_DOODR', this, 'CheckBox');
    }
  });
  expj.KM0030010.KM0030010form2.c_DOODR.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.c_DOODR.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/c_DOODR.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-c_DOODR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KM0030010.KM0030010form2.c_DOODR['onLoad' + i])) {
      expj.KM0030010.KM0030010form2.c_DOODR['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_DOODR" value="true" <%= ("true".equals(TypeConverter.convert(aKM0030010Struct.getc_DOODR())) || "1".equals(TypeConverter.convert(aKM0030010Struct.getc_DOODR())))?"checked=\"checked\"":"" %>  class="KM0030010-focus-move" id="expj-KM0030010-KM0030010form2-c_DOODR"><label for="expj-KM0030010-KM0030010form2-c_DOODR"><%=CoreTools.getRBString("Expj.Cmt3153",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_TYP",rb)%></span><!-- 注文区分 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ODR_TYP">
expj.KM0030010.KM0030010form2.ODR_TYP = {};
expj.KM0030010.KM0030010form2.ODR_TYP.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ODR_TYP.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ODR_TYP.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ODR_TYP', this);
  });
  expj.KM0030010.KM0030010form2.ODR_TYP.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ODR_TYP" name="ODR_TYP" class="KM0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getODR_TYP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KM0030010-KM0030010form2-h_ODR_TYP" name="h_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0030010Struct.geth_ODR_TYP()) %>">
<script class="expj-script-KM0030010-KM0030010form2-h_ODR_TYP">
expj.KM0030010.KM0030010form2.h_ODR_TYP = {};
expj.KM0030010.KM0030010form2.h_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/h_ODR_TYP.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.h_ODR_TYP.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-h_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'h_ODR_TYP', this);
  });
  expj.KM0030010.KM0030010form2.h_ODR_TYP.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.h_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/h_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-h_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3152",rb)%></span><!-- 手配数量 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-PREPARE_QTY">
expj.KM0030010.KM0030010form2.PREPARE_QTY = {};
expj.KM0030010.KM0030010form2.PREPARE_QTY.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/PREPARE_QTY.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.PREPARE_QTY.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-PREPARE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'PREPARE_QTY', this);
  });
  expj.KM0030010.KM0030010form2.PREPARE_QTY.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.PREPARE_QTY.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/PREPARE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-PREPARE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-PREPARE_QTY" name="PREPARE_QTY" class="KM0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getPREPARE_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt6197",rb)%></span><!-- 得意先注文番号 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-CUST_ODR_NO">
expj.KM0030010.KM0030010form2.CUST_ODR_NO = {};
expj.KM0030010.KM0030010form2.CUST_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/CUST_ODR_NO.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.CUST_ODR_NO.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-CUST_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'CUST_ODR_NO', this);
  });
  expj.KM0030010.KM0030010form2.CUST_ODR_NO.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.CUST_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/CUST_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-CUST_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-CUST_ODR_NO" name="CUST_ODR_NO" class="KM0030010-focus-move  required-value expj-KM0030010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getCUST_ODR_NO()) %>" maxlength="23" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb)%></span><!-- 製番納期 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-JOB_ODR_DLV_DATE">
expj.KM0030010.KM0030010form2.JOB_ODR_DLV_DATE = {};
expj.KM0030010.KM0030010form2.JOB_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/JOB_ODR_DLV_DATE.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.JOB_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-JOB_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'JOB_ODR_DLV_DATE', this);
  });
  expj.KM0030010.KM0030010form2.JOB_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.JOB_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/JOB_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-JOB_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-JOB_ODR_DLV_DATE" name="JOB_ODR_DLV_DATE" class="KM0030010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getJOB_ODR_DLV_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-CalendarTargetJobOdrDlvDate">
expj.KM0030010.KM0030010form2.CalendarTargetJobOdrDlvDate = {};
// script1="onClick;0;CALENDAR;_KM0030010form2/JOB_ODR_DLV_DATE@<%=contextNo%>"
expj.KM0030010.KM0030010form2.CalendarTargetJobOdrDlvDate.onClick0 = function () {
  console.log('CalendarTargetJobOdrDlvDate script1');
expj.common.pscript.executeCalendar('KM0030010','KM0030010form2','_KM0030010form2/JOB_ODR_DLV_DATE');
};
expj.KM0030010.KM0030010form2.CalendarTargetJobOdrDlvDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010form2.CalendarTargetJobOdrDlvDate['onClick' + i])) {
        expj.KM0030010.KM0030010form2.CalendarTargetJobOdrDlvDate['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010form2.CalendarTargetJobOdrDlvDate.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010form2.CalendarTargetJobOdrDlvDate.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-CalendarTargetJobOdrDlvDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010form2', 'CalendarTargetJobOdrDlvDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KM0030010','KM0030010form2','_KM0030010form2/JOB_ODR_DLV_DATE');
  expj.KM0030010.KM0030010form2.CalendarTargetJobOdrDlvDate.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.CalendarTargetJobOdrDlvDate.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/CalendarTargetJobOdrDlvDate.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-CalendarTargetJobOdrDlvDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0030010-KM0030010form2-CalendarTargetJobOdrDlvDate" class="KM0030010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)%></span><!-- 指定納期 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-DESINATED_DLV_DATE">
expj.KM0030010.KM0030010form2.DESINATED_DLV_DATE = {};
expj.KM0030010.KM0030010form2.DESINATED_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/DESINATED_DLV_DATE.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.DESINATED_DLV_DATE.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-DESINATED_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'DESINATED_DLV_DATE', this);
  });
  expj.KM0030010.KM0030010form2.DESINATED_DLV_DATE.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.DESINATED_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/DESINATED_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-DESINATED_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-DESINATED_DLV_DATE" name="DESINATED_DLV_DATE" class="KM0030010-focus-move  required-value expj-KM0030010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getDESINATED_DLV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-CalendarTargetDesinatedDlvDate">
expj.KM0030010.KM0030010form2.CalendarTargetDesinatedDlvDate = {};
// script1="onClick;0;CALENDAR;_KM0030010form2/DESINATED_DLV_DATE@<%=contextNo%>"
expj.KM0030010.KM0030010form2.CalendarTargetDesinatedDlvDate.onClick0 = function () {
  console.log('CalendarTargetDesinatedDlvDate script1');
expj.common.pscript.executeCalendar('KM0030010','KM0030010form2','_KM0030010form2/DESINATED_DLV_DATE');
};
expj.KM0030010.KM0030010form2.CalendarTargetDesinatedDlvDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010form2.CalendarTargetDesinatedDlvDate['onClick' + i])) {
        expj.KM0030010.KM0030010form2.CalendarTargetDesinatedDlvDate['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010form2.CalendarTargetDesinatedDlvDate.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010form2.CalendarTargetDesinatedDlvDate.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-CalendarTargetDesinatedDlvDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010form2', 'CalendarTargetDesinatedDlvDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KM0030010','KM0030010form2','_KM0030010form2/DESINATED_DLV_DATE');
  expj.KM0030010.KM0030010form2.CalendarTargetDesinatedDlvDate.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.CalendarTargetDesinatedDlvDate.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/CalendarTargetDesinatedDlvDate.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-CalendarTargetDesinatedDlvDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0030010-KM0030010form2-CalendarTargetDesinatedDlvDate" class="KM0030010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ALC_GRP_CD",rb)%></span><!-- 引当グループコード --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ALC_GRP_CD">
expj.KM0030010.KM0030010form2.ALC_GRP_CD = {};
expj.KM0030010.KM0030010form2.ALC_GRP_CD.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ALC_GRP_CD.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ALC_GRP_CD.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ALC_GRP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ALC_GRP_CD', this);
  });
  expj.KM0030010.KM0030010form2.ALC_GRP_CD.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ALC_GRP_CD.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ALC_GRP_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ALC_GRP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ALC_GRP_CD" name="ALC_GRP_CD" class="KM0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getALC_GRP_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_LOC_CD",rb)%></span><!-- 納品場所コード --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-DLV_LOC_CD">
expj.KM0030010.KM0030010form2.DLV_LOC_CD = {};
expj.KM0030010.KM0030010form2.DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/DLV_LOC_CD.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'DLV_LOC_CD', this);
  });
  expj.KM0030010.KM0030010form2.DLV_LOC_CD.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-DLV_LOC_CD" name="DLV_LOC_CD" class="KM0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getDLV_LOC_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-PeekerTargetDlvLocCd">
expj.KM0030010.KM0030010form2.PeekerTargetDlvLocCd = {};
// script1="onClick;0;PEEKER;_KM0030010form2/DLV_LOC_CD@<%=contextNo%>"
expj.KM0030010.KM0030010form2.PeekerTargetDlvLocCd.onClick0 = function () {
  console.log('PeekerTargetDlvLocCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0030010';
var parameterValues = 'PeekerTargetDlvLocCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form2', '_KM0030010form1/CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form2', '_KM0030010form2/DLV_LOC_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%DLV_LOC_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0030010form2/DLV_LOC_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0030010.KM0030010form2.PeekerTargetDlvLocCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010form2.PeekerTargetDlvLocCd['onClick' + i])) {
        expj.KM0030010.KM0030010form2.PeekerTargetDlvLocCd['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010form2.PeekerTargetDlvLocCd.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010form2.PeekerTargetDlvLocCd.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-PeekerTargetDlvLocCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010form2', 'PeekerTargetDlvLocCd', this, 'Button');
    }
  });
  expj.KM0030010.KM0030010form2.PeekerTargetDlvLocCd.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.PeekerTargetDlvLocCd.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/PeekerTargetDlvLocCd.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-PeekerTargetDlvLocCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0030010-KM0030010form2-PeekerTargetDlvLocCd" class="KM0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-c_INPUTODRCD">
expj.KM0030010.KM0030010form2.c_INPUTODRCD = {};
// script1="onLoad;0;CALL;onClick@0"
expj.KM0030010.KM0030010form2.c_INPUTODRCD.onLoad0 = function () {
  console.log('c_INPUTODRCD script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_c_INPUTODRCD[eq]true@*0,*1"
expj.KM0030010.KM0030010form2.c_INPUTODRCD.onClick0 = function () {
  console.log('c_INPUTODRCD script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form2', '_c_INPUTODRCD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_JOB_ODR_CD"
expj.KM0030010.KM0030010form2.c_INPUTODRCD.child0 = function () {
  console.log('c_INPUTODRCD script3');
expj.common.pscript.setUnMaskToReferenceComponent('KM0030010', 'KM0030010form2', '_JOB_ODR_CD');
};
// script4="child;1;SET;_JOB_ODR_CD@*2"
expj.KM0030010.KM0030010form2.c_INPUTODRCD.child1 = function () {
  console.log('c_INPUTODRCD script4');
expj.common.pscript.setReferenceComponentValue('KM0030010', 'KM0030010form2', '_JOB_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;2;MASK;_JOB_ODR_CD"
expj.KM0030010.KM0030010form2.c_INPUTODRCD.child2 = function () {
  console.log('c_INPUTODRCD script5');
expj.common.pscript.setMaskToReferenceComponent('KM0030010', 'KM0030010form2', '_JOB_ODR_CD');
};
expj.KM0030010.KM0030010form2.c_INPUTODRCD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010form2.c_INPUTODRCD['onClick' + i])) {
        expj.KM0030010.KM0030010form2.c_INPUTODRCD['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010form2.c_INPUTODRCD.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/c_INPUTODRCD.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.c_INPUTODRCD.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-c_INPUTODRCD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010form2', 'c_INPUTODRCD', this, 'CheckBox');
    }
  });
  expj.KM0030010.KM0030010form2.c_INPUTODRCD.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.c_INPUTODRCD.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/c_INPUTODRCD.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-c_INPUTODRCD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KM0030010.KM0030010form2.c_INPUTODRCD['onLoad' + i])) {
      expj.KM0030010.KM0030010form2.c_INPUTODRCD['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_INPUTODRCD" value="true" <%= ("true".equals(TypeConverter.convert(aKM0030010Struct.getc_INPUTODRCD())) || "1".equals(TypeConverter.convert(aKM0030010Struct.getc_INPUTODRCD())))?"checked=\"checked\"":"" %>  class="KM0030010-focus-move" id="expj-KM0030010-KM0030010form2-c_INPUTODRCD"><label for="expj-KM0030010-KM0030010form2-c_INPUTODRCD"><%=CoreTools.getRBString("Expj.Cmt3154",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ARRANGE_ITEMS_SPECIES",rb)%></span><!-- 手配品目種 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ESTIMATE_TYPE">
expj.KM0030010.KM0030010form2.ESTIMATE_TYPE = {};
expj.KM0030010.KM0030010form2.ESTIMATE_TYPE.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ESTIMATE_TYPE.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ESTIMATE_TYPE.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ESTIMATE_TYPE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ESTIMATE_TYPE', this);
  });
  expj.KM0030010.KM0030010form2.ESTIMATE_TYPE.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ESTIMATE_TYPE.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ESTIMATE_TYPE.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ESTIMATE_TYPE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ESTIMATE_TYPE" name="ESTIMATE_TYPE" class="KM0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getESTIMATE_TYPE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KM0030010-KM0030010form2-h_ESTIMATE_TYPE" name="h_ESTIMATE_TYPE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0030010Struct.geth_ESTIMATE_TYPE()) %>">
<script class="expj-script-KM0030010-KM0030010form2-h_ESTIMATE_TYPE">
expj.KM0030010.KM0030010form2.h_ESTIMATE_TYPE = {};
expj.KM0030010.KM0030010form2.h_ESTIMATE_TYPE.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/h_ESTIMATE_TYPE.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.h_ESTIMATE_TYPE.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-h_ESTIMATE_TYPE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'h_ESTIMATE_TYPE', this);
  });
  expj.KM0030010.KM0030010form2.h_ESTIMATE_TYPE.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.h_ESTIMATE_TYPE.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/h_ESTIMATE_TYPE.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-h_ESTIMATE_TYPE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-JOB_ODR_CD">
expj.KM0030010.KM0030010form2.JOB_ODR_CD = {};
expj.KM0030010.KM0030010form2.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/JOB_ODR_CD.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'JOB_ODR_CD', this);
  });
  expj.KM0030010.KM0030010form2.JOB_ODR_CD.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-JOB_ODR_CD" name="JOB_ODR_CD" class="KM0030010-focus-move  required-value expj-KM0030010-required-C" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getJOB_ODR_CD()) %>" maxlength="25" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_NAME",rb)%></span><!-- 品目名 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ITEM_NAME">
expj.KM0030010.KM0030010form2.ITEM_NAME = {};
expj.KM0030010.KM0030010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ITEM_NAME.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ITEM_NAME', this);
  });
  expj.KM0030010.KM0030010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:602px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ITEM_NAME" name="ITEM_NAME" class="KM0030010-focus-move  " style="width:602px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)%></span><!-- 得意先品目番号 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-CUST_ITEM_CD">
expj.KM0030010.KM0030010form2.CUST_ITEM_CD = {};
expj.KM0030010.KM0030010form2.CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/CUST_ITEM_CD.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'CUST_ITEM_CD', this);
  });
  expj.KM0030010.KM0030010form2.CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-CUST_ITEM_CD" name="CUST_ITEM_CD" class="KM0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getCUST_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-PeekerTargetCustItemCd">
expj.KM0030010.KM0030010form2.PeekerTargetCustItemCd = {};
// script1="onClick;0;PEEKER;_KM0030010form2/CUST_ITEM_CD@<%=contextNo%>"
expj.KM0030010.KM0030010form2.PeekerTargetCustItemCd.onClick0 = function () {
  console.log('PeekerTargetCustItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0030010';
var parameterValues = 'PeekerTargetCustItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form2', '_KM0030010form1/CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form2', '_KM0030010form2/CUST_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0030010form2/CUST_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0030010.KM0030010form2.PeekerTargetCustItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010form2.PeekerTargetCustItemCd['onClick' + i])) {
        expj.KM0030010.KM0030010form2.PeekerTargetCustItemCd['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010form2.PeekerTargetCustItemCd.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010form2.PeekerTargetCustItemCd.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-PeekerTargetCustItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010form2', 'PeekerTargetCustItemCd', this, 'Button');
    }
  });
  expj.KM0030010.KM0030010form2.PeekerTargetCustItemCd.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.PeekerTargetCustItemCd.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/PeekerTargetCustItemCd.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-PeekerTargetCustItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0030010-KM0030010form2-PeekerTargetCustItemCd" class="KM0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-CUST_ITEM_NAME">
expj.KM0030010.KM0030010form2.CUST_ITEM_NAME = {};
expj.KM0030010.KM0030010form2.CUST_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/CUST_ITEM_NAME.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.CUST_ITEM_NAME.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-CUST_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'CUST_ITEM_NAME', this);
  });
  expj.KM0030010.KM0030010form2.CUST_ITEM_NAME.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.CUST_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/CUST_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-CUST_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-CUST_ITEM_NAME" name="CUST_ITEM_NAME" class="KM0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getCUST_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.QTY",rb)%></span><!-- 数量 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-QTY">
expj.KM0030010.KM0030010form2.QTY = {};
expj.KM0030010.KM0030010form2.QTY.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/QTY.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.QTY.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'QTY', this);
  });
  expj.KM0030010.KM0030010form2.QTY.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.QTY.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/QTY.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-QTY" name="QTY" class="KM0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getQTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-QTY_UNIT">
expj.KM0030010.KM0030010form2.QTY_UNIT = {};
expj.KM0030010.KM0030010form2.QTY_UNIT.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/QTY_UNIT.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.QTY_UNIT.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-QTY_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'QTY_UNIT', this);
  });
  expj.KM0030010.KM0030010form2.QTY_UNIT.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.QTY_UNIT.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/QTY_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-QTY_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-QTY_UNIT" name="QTY_UNIT" class="KM0030010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getQTY_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_UNIT_PRICE",rb)%></span><!-- 受注単価 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ODR_UNIT_PRICE">
expj.KM0030010.KM0030010form2.ODR_UNIT_PRICE = {};
expj.KM0030010.KM0030010form2.ODR_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ODR_UNIT_PRICE.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ODR_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ODR_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ODR_UNIT_PRICE', this);
  });
  expj.KM0030010.KM0030010form2.ODR_UNIT_PRICE.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ODR_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ODR_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ODR_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ODR_UNIT_PRICE" name="ODR_UNIT_PRICE" class="KM0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getODR_UNIT_PRICE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ODR_PRICE_UNIT">
expj.KM0030010.KM0030010form2.ODR_PRICE_UNIT = {};
expj.KM0030010.KM0030010form2.ODR_PRICE_UNIT.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ODR_PRICE_UNIT.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ODR_PRICE_UNIT.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ODR_PRICE_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ODR_PRICE_UNIT', this);
  });
  expj.KM0030010.KM0030010form2.ODR_PRICE_UNIT.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ODR_PRICE_UNIT.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ODR_PRICE_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ODR_PRICE_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ODR_PRICE_UNIT" name="ODR_PRICE_UNIT" class="KM0030010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getODR_PRICE_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_AMOUNT",rb)%></span><!-- 受注金額 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ODR_AMOUNT">
expj.KM0030010.KM0030010form2.ODR_AMOUNT = {};
expj.KM0030010.KM0030010form2.ODR_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ODR_AMOUNT.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ODR_AMOUNT.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ODR_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ODR_AMOUNT', this);
  });
  expj.KM0030010.KM0030010form2.ODR_AMOUNT.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ODR_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ODR_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ODR_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ODR_AMOUNT" name="ODR_AMOUNT" class="KM0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getODR_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_AMOUNT_EXCH_RATES",rb)%></span><!-- 受注金額(邦貨) --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ODR_AMOUNT_EXCH_RATES">
expj.KM0030010.KM0030010form2.ODR_AMOUNT_EXCH_RATES = {};
expj.KM0030010.KM0030010form2.ODR_AMOUNT_EXCH_RATES.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ODR_AMOUNT_EXCH_RATES.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ODR_AMOUNT_EXCH_RATES.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ODR_AMOUNT_EXCH_RATES').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ODR_AMOUNT_EXCH_RATES', this);
  });
  expj.KM0030010.KM0030010form2.ODR_AMOUNT_EXCH_RATES.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ODR_AMOUNT_EXCH_RATES.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ODR_AMOUNT_EXCH_RATES.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ODR_AMOUNT_EXCH_RATES');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ODR_AMOUNT_EXCH_RATES" name="ODR_AMOUNT_EXCH_RATES" class="KM0030010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getODR_AMOUNT_EXCH_RATES()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_INST_COMMENT_1",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ISSUE_INST_COMMENT">
expj.KM0030010.KM0030010form2.ISSUE_INST_COMMENT = {};
expj.KM0030010.KM0030010form2.ISSUE_INST_COMMENT.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ISSUE_INST_COMMENT.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ISSUE_INST_COMMENT.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ISSUE_INST_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ISSUE_INST_COMMENT', this);
  });
  expj.KM0030010.KM0030010form2.ISSUE_INST_COMMENT.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ISSUE_INST_COMMENT.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ISSUE_INST_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ISSUE_INST_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ISSUE_INST_COMMENT" name="ISSUE_INST_COMMENT" class="KM0030010-focus-move  " style="width:714px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getISSUE_INST_COMMENT()) %>" maxlength="100" ></div><!--/td-->
<input type="hidden" id="expj-KM0030010-KM0030010form2-h_DLV_LOC_CD" name="h_DLV_LOC_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0030010Struct.geth_DLV_LOC_CD()) %>">
<script class="expj-script-KM0030010-KM0030010form2-h_DLV_LOC_CD">
expj.KM0030010.KM0030010form2.h_DLV_LOC_CD = {};
expj.KM0030010.KM0030010form2.h_DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/h_DLV_LOC_CD.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.h_DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-h_DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'h_DLV_LOC_CD', this);
  });
  expj.KM0030010.KM0030010form2.h_DLV_LOC_CD.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.h_DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/h_DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-h_DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3165",rb)%></span><!-- 承認備考 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-APPROVED_COMMENT">
expj.KM0030010.KM0030010form2.APPROVED_COMMENT = {};
expj.KM0030010.KM0030010form2.APPROVED_COMMENT.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/APPROVED_COMMENT.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.APPROVED_COMMENT.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-APPROVED_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'APPROVED_COMMENT', this);
  });
  expj.KM0030010.KM0030010form2.APPROVED_COMMENT.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.APPROVED_COMMENT.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/APPROVED_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-APPROVED_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-APPROVED_COMMENT" name="APPROVED_COMMENT" class="KM0030010-focus-move  " style="width:714px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getAPPROVED_COMMENT()) %>" maxlength="80" ></div><!--/td-->
<input type="hidden" id="expj-KM0030010-KM0030010form2-h_ANS_DLV_DATE_EXIST_FLG" name="h_ANS_DLV_DATE_EXIST_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0030010Struct.geth_ANS_DLV_DATE_EXIST_FLG()) %>">
<script class="expj-script-KM0030010-KM0030010form2-h_ANS_DLV_DATE_EXIST_FLG">
expj.KM0030010.KM0030010form2.h_ANS_DLV_DATE_EXIST_FLG = {};
expj.KM0030010.KM0030010form2.h_ANS_DLV_DATE_EXIST_FLG.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/h_ANS_DLV_DATE_EXIST_FLG.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.h_ANS_DLV_DATE_EXIST_FLG.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-h_ANS_DLV_DATE_EXIST_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'h_ANS_DLV_DATE_EXIST_FLG', this);
  });
  expj.KM0030010.KM0030010form2.h_ANS_DLV_DATE_EXIST_FLG.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.h_ANS_DLV_DATE_EXIST_FLG.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/h_ANS_DLV_DATE_EXIST_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-h_ANS_DLV_DATE_EXIST_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt6705",rb)%></span><!-- 受注担当者コード --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-CUST_CHRG_PSN_CD">
expj.KM0030010.KM0030010form2.CUST_CHRG_PSN_CD = {};
expj.KM0030010.KM0030010form2.CUST_CHRG_PSN_CD.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/CUST_CHRG_PSN_CD.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.CUST_CHRG_PSN_CD.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-CUST_CHRG_PSN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'CUST_CHRG_PSN_CD', this);
  });
  expj.KM0030010.KM0030010form2.CUST_CHRG_PSN_CD.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.CUST_CHRG_PSN_CD.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/CUST_CHRG_PSN_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-CUST_CHRG_PSN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-CUST_CHRG_PSN_CD" name="CUST_CHRG_PSN_CD" class="KM0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getCUST_CHRG_PSN_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-peekerTargetCustChrgPsnCd">
expj.KM0030010.KM0030010form2.peekerTargetCustChrgPsnCd = {};
// script1="onClick;0;PEEKER;_KM0030010form2/CUST_CHRG_PSN_CD@<%=contextNo%>"
expj.KM0030010.KM0030010form2.peekerTargetCustChrgPsnCd.onClick0 = function () {
  console.log('peekerTargetCustChrgPsnCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0030010';
var parameterValues = 'peekerTargetCustChrgPsnCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form2', '_KM0030010form2/CUST_CHRG_PSN_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0030010form2/CUST_CHRG_PSN_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0030010.KM0030010form2.peekerTargetCustChrgPsnCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010form2.peekerTargetCustChrgPsnCd['onClick' + i])) {
        expj.KM0030010.KM0030010form2.peekerTargetCustChrgPsnCd['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010form2.peekerTargetCustChrgPsnCd.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010form2.peekerTargetCustChrgPsnCd.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-peekerTargetCustChrgPsnCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010form2', 'peekerTargetCustChrgPsnCd', this, 'Button');
    }
  });
  expj.KM0030010.KM0030010form2.peekerTargetCustChrgPsnCd.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.peekerTargetCustChrgPsnCd.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/peekerTargetCustChrgPsnCd.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-peekerTargetCustChrgPsnCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0030010-KM0030010form2-peekerTargetCustChrgPsnCd" class="KM0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-CUST_CHRG_PSN_NAME">
expj.KM0030010.KM0030010form2.CUST_CHRG_PSN_NAME = {};
expj.KM0030010.KM0030010form2.CUST_CHRG_PSN_NAME.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/CUST_CHRG_PSN_NAME.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.CUST_CHRG_PSN_NAME.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-CUST_CHRG_PSN_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'CUST_CHRG_PSN_NAME', this);
  });
  expj.KM0030010.KM0030010form2.CUST_CHRG_PSN_NAME.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.CUST_CHRG_PSN_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/CUST_CHRG_PSN_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-CUST_CHRG_PSN_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-CUST_CHRG_PSN_NAME" name="CUST_CHRG_PSN_NAME" class="KM0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getCUST_CHRG_PSN_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt6706",rb)%></span><!-- 受注担当部門コード --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ES_ORG_CD">
expj.KM0030010.KM0030010form2.ES_ORG_CD = {};
expj.KM0030010.KM0030010form2.ES_ORG_CD.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ES_ORG_CD.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ES_ORG_CD.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ES_ORG_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ES_ORG_CD', this);
  });
  expj.KM0030010.KM0030010form2.ES_ORG_CD.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ES_ORG_CD.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ES_ORG_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ES_ORG_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ES_ORG_CD" name="ES_ORG_CD" class="KM0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getES_ORG_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-peekerTargeteSoRGCd">
expj.KM0030010.KM0030010form2.peekerTargeteSoRGCd = {};
// script1="onClick;0;PEEKER;_KM0030010form2/ES_ORG_CD@<%=contextNo%>"
expj.KM0030010.KM0030010form2.peekerTargeteSoRGCd.onClick0 = function () {
  console.log('peekerTargeteSoRGCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0030010';
var parameterValues = 'peekerTargeteSoRGCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010form2', '_KM0030010form2/ES_ORG_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ORG_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0030010form2/ES_ORG_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0030010.KM0030010form2.peekerTargeteSoRGCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010form2.peekerTargeteSoRGCd['onClick' + i])) {
        expj.KM0030010.KM0030010form2.peekerTargeteSoRGCd['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010form2.peekerTargeteSoRGCd.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010form2.peekerTargeteSoRGCd.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-peekerTargeteSoRGCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010form2', 'peekerTargeteSoRGCd', this, 'Button');
    }
  });
  expj.KM0030010.KM0030010form2.peekerTargeteSoRGCd.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.peekerTargeteSoRGCd.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/peekerTargeteSoRGCd.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-peekerTargeteSoRGCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0030010-KM0030010form2-peekerTargeteSoRGCd" class="KM0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ES_ORG_NAME">
expj.KM0030010.KM0030010form2.ES_ORG_NAME = {};
expj.KM0030010.KM0030010form2.ES_ORG_NAME.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ES_ORG_NAME.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ES_ORG_NAME.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ES_ORG_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ES_ORG_NAME', this);
  });
  expj.KM0030010.KM0030010form2.ES_ORG_NAME.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ES_ORG_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ES_ORG_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ES_ORG_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ES_ORG_NAME" name="ES_ORG_NAME" class="KM0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getES_ORG_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ITEM_CD">
expj.KM0030010.KM0030010form2.ITEM_CD = {};
expj.KM0030010.KM0030010form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ITEM_CD.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ITEM_CD', this);
  });
  expj.KM0030010.KM0030010form2.ITEM_CD.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ITEM_CD" name="ITEM_CD" class="KM0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010form2-ITEM_NAME_R">
expj.KM0030010.KM0030010form2.ITEM_NAME_R = {};
expj.KM0030010.KM0030010form2.ITEM_NAME_R.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/ITEM_NAME_R.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.ITEM_NAME_R.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-ITEM_NAME_R').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'ITEM_NAME_R', this);
  });
  expj.KM0030010.KM0030010form2.ITEM_NAME_R.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.ITEM_NAME_R.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/ITEM_NAME_R.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-ITEM_NAME_R');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0030010-KM0030010form2-ITEM_NAME_R" name="ITEM_NAME_R" class="KM0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0030010Struct.getITEM_NAME_R()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KM0030010-KM0030010form2-h_PREC_ARRANGE_FLG" name="h_PREC_ARRANGE_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0030010Struct.geth_PREC_ARRANGE_FLG()) %>">
<script class="expj-script-KM0030010-KM0030010form2-h_PREC_ARRANGE_FLG">
expj.KM0030010.KM0030010form2.h_PREC_ARRANGE_FLG = {};
expj.KM0030010.KM0030010form2.h_PREC_ARRANGE_FLG.executeAllOnDecision = function () {
  console.log('execute KM0030010form2/h_PREC_ARRANGE_FLG.onDecision');
  expj.KM0030010.KM0030010form2.executeAllOnDecision();
  expj.KM0030010.executeAllOnDecision();
};
expj.KM0030010.KM0030010form2.h_PREC_ARRANGE_FLG.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010form2-h_PREC_ARRANGE_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0030010', 'KM0030010form2', 'h_PREC_ARRANGE_FLG', this);
  });
  expj.KM0030010.KM0030010form2.h_PREC_ARRANGE_FLG.executePScriptOnLoad();
};

expj.KM0030010.KM0030010form2.h_PREC_ARRANGE_FLG.executePScriptOnLoad = function () {
  console.log('execute KM0030010form2/h_PREC_ARRANGE_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010form2-h_PREC_ARRANGE_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KM0030010-KM0030010button2">
expj.KM0030010.KM0030010button2 = {};
expj.KM0030010.KM0030010button2.executeAllOnDecision = function () {
  console.log('execute KM0030010button2.onDecision');
};
expj.KM0030010.KM0030010button2.executeOnLoad = function () {
  expj.KM0030010.KM0030010button2.executePScriptOnLoad();
};

expj.KM0030010.KM0030010button2.executePScriptOnLoad = function () {
  console.log('execute KM0030010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0030010-KM0030010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0030010-KM0030010button2-Modify">
expj.KM0030010.KM0030010button2.Modify = {};
// script1="onClick;0;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*0"
expj.KM0030010.KM0030010button2.Modify.onClick0 = function () {
  console.log('Modify script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_KM0030010form2/DESINATED_DLV_DATE[lt]<%= aKM0030010Control.get_businessOprDate() %>@!KQ00006"
expj.KM0030010.KM0030010button2.Modify.child0 = function () {
  console.log('Modify script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/DESINATED_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber('<%= aKM0030010Control.get_businessOprDate() %>'))) {
expj.common.pscript.viewErrorMessage('KM0030010', 'KM0030010button2', 'KQ00006');
}
};
// script3="onClick;1;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*1"
expj.KM0030010.KM0030010button2.Modify.onClick1 = function () {
  console.log('Modify script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;CHK;_KM0030010form2/h_ESTIMATE_TYPE[eq]1[and]_KM0030010form2/CUST_ITEM_CD[eq]@!KM00033"
expj.KM0030010.KM0030010button2.Modify.child1 = function () {
  console.log('Modify script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/h_ESTIMATE_TYPE'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/CUST_ITEM_CD'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('KM0030010', 'KM0030010button2', 'KM00033');
}
};
// script5="onClick;2;CHK;_KM0030010form1/rdoSHIP_INST[eq]true[and]_KM0030010form1/h_APR_ODR[eq]1@*2"
expj.KM0030010.KM0030010button2.Modify.onClick2 = function () {
  console.log('Modify script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/h_APR_ODR'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script6="child;2;CHK;_KM0030010form2/ES_ORG_CD[eq]@!KM00061"
expj.KM0030010.KM0030010button2.Modify.child2 = function () {
  console.log('Modify script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/ES_ORG_CD'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('KM0030010', 'KM0030010button2', 'KM00061');
}
};
// script7="onClick;3;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*3"
expj.KM0030010.KM0030010button2.Modify.onClick3 = function () {
  console.log('Modify script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script8="child;3;CHK;_KM0030010form2/ODR_ACPT_DATE[lt]<%= aKM0030010Control.get_businessOprDate() %>@$KQ00318"
expj.KM0030010.KM0030010button2.Modify.child3 = function () {
  console.log('Modify script8');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/ODR_ACPT_DATE')), '[lt]', expj.common.pscript.convertNumber('<%= aKM0030010Control.get_businessOprDate() %>'))) {
expj.common.pscript.addWarningMessage('KM0030010', 'KM0030010button2', 'KQ00318');
}
};
// script9="onClick;4;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*4"
expj.KM0030010.KM0030010button2.Modify.onClick4 = function () {
  console.log('Modify script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script10="child;4;CHK;_KM0030010form2/ODR_ACPT_DATE[gt]<%= aKM0030010Control.get_businessOprDate() %>@!KQ00317"
expj.KM0030010.KM0030010button2.Modify.child4 = function () {
  console.log('Modify script10');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/ODR_ACPT_DATE')), '[gt]', expj.common.pscript.convertNumber('<%= aKM0030010Control.get_businessOprDate() %>'))) {
expj.common.pscript.viewErrorMessage('KM0030010', 'KM0030010button2', 'KQ00317');
}
};
// script11="onClick;5;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*5"
expj.KM0030010.KM0030010button2.Modify.onClick5 = function () {
  console.log('Modify script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script12="child;5;CHK;_KM0030010form2/c_DOODR[eq]true[and]_KM0030010view1/l_h_PREC_ARRANGE_FLG[eq]1[and]_KM0030010form2/ALC_GRP_CD[eq]@$KM00031"
expj.KM0030010.KM0030010button2.Modify.child5 = function () {
  console.log('Modify script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/c_DOODR'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010view1/l_h_PREC_ARRANGE_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/ALC_GRP_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0030010', 'KM0030010button2', 'KM00031');
}
};
// script13="onClick;6;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*6"
expj.KM0030010.KM0030010button2.Modify.onClick6 = function () {
  console.log('Modify script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script14="child;6;CHK;_KM0030010form2/c_DOODR[eq]true[and]_KM0030010form2/JOB_ODR_DLV_DATE[neq][and]_KM0030010form2/JOB_ODR_DLV_DATE[gt]_KM0030010form2/DESINATED_DLV_DATE@!KQ00321"
expj.KM0030010.KM0030010button2.Modify.child6 = function () {
  console.log('Modify script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/c_DOODR'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/JOB_ODR_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/JOB_ODR_DLV_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/DESINATED_DLV_DATE')))) {
expj.common.pscript.viewErrorMessage('KM0030010', 'KM0030010button2', 'KQ00321');
}
};
// script15="onClick;7;CHK;_KM0030010form2/c_INPUTODRCD[eq]true@*7"
expj.KM0030010.KM0030010button2.Modify.onClick7 = function () {
  console.log('Modify script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/c_INPUTODRCD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script16="child;7;SELCHK;KM0030010view1:_l_JOB_ODR_CD[neq]_KM0030010form2/JOB_ODR_CD@*8"
expj.KM0030010.KM0030010button2.Modify.child7 = function () {
  console.log('Modify script16');
var selectCells = expj.common.pscript.getSelectedVIEWCells('KM0030010', 'KM0030010view1');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.l_JOB_ODR_CD, '[neq]', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/JOB_ODR_CD')))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script17="child;8;COLCHK;KM0030010view1:_l_JOB_ODR_CD[neq]_KM0030010form2/JOB_ODR_CD@,!KQ00322"
expj.KM0030010.KM0030010button2.Modify.child8 = function () {
  console.log('Modify script17');
var selectCells = expj.common.pscript.getPreviewVIEWCells('KM0030010', 'KM0030010view1');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.l_JOB_ODR_CD, '[neq]', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/JOB_ODR_CD')))) {
checkFlg = false;
break;
}
}
if (checkFlg) {

} else {
expj.common.pscript.viewErrorMessage('KM0030010', 'KM0030010button2', 'KQ00322');
}
};
// script18="onClick;8;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*9"
expj.KM0030010.KM0030010button2.Modify.onClick8 = function () {
  console.log('Modify script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script19="child;9;CHK;_KM0030010form2/c_DOODR[eq]true[and]_KM0030010form2/QTY[neq]0.0[and]_KM0030010form2/PREPARE_QTY[neq]_KM0030010form2/QTY@$KQ00355"
expj.KM0030010.KM0030010button2.Modify.child9 = function () {
  console.log('Modify script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/c_DOODR'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/QTY'), '[neq]', '0.0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/PREPARE_QTY'), '[neq]', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/QTY'))) {
expj.common.pscript.addWarningMessage('KM0030010', 'KM0030010button2', 'KQ00355');
}
};
// script20="onClick;9;CHK;_KM0030010form1/rdoSHIP_INST[eq]true@*10"
expj.KM0030010.KM0030010button2.Modify.onClick9 = function () {
  console.log('Modify script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/rdoSHIP_INST'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script21="child;10;CHK;_KM0030010form2/c_DOODR[neq]true[and]_KM0030010view1/l_h_PREC_ARRANGE_FLG[eq]1[and]_KM0030010form2/ALC_GRP_CD[eq]@$KM00031"
expj.KM0030010.KM0030010button2.Modify.child10 = function () {
  console.log('Modify script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/c_DOODR'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010view1/l_h_PREC_ARRANGE_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/ALC_GRP_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0030010', 'KM0030010button2', 'KM00031');
}
};
// script22="onClick;10;CHK;_KM0030010form1/rdoSHIP_UPDATE[eq]true@*11"
expj.KM0030010.KM0030010button2.Modify.onClick10 = function () {
  console.log('Modify script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/rdoSHIP_UPDATE'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script23="child;11;CHK;_KM0030010form2/DESINATED_DLV_DATE[lt]<%= aKM0030010Control.get_businessOprDate() %>@$KQ00106"
expj.KM0030010.KM0030010button2.Modify.child11 = function () {
  console.log('Modify script23');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/DESINATED_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber('<%= aKM0030010Control.get_businessOprDate() %>'))) {
expj.common.pscript.addWarningMessage('KM0030010', 'KM0030010button2', 'KQ00106');
}
};
// script24="onClick;11;CHK;_KM0030010form1/rdoSHIP_UPDATE[eq]true@*12"
expj.KM0030010.KM0030010button2.Modify.onClick11 = function () {
  console.log('Modify script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/rdoSHIP_UPDATE'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script25="child;12;CHK;_KM0030010form2/h_ANS_DLV_DATE_EXIST_FLG[eq]Y[and]_KM0030010form2/h_DLV_LOC_CD[neq]_KM0030010form2/DLV_LOC_CD@!KQ00316"
expj.KM0030010.KM0030010button2.Modify.child12 = function () {
  console.log('Modify script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/h_ANS_DLV_DATE_EXIST_FLG'), '[eq]', 'Y') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/h_DLV_LOC_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/DLV_LOC_CD'))) {
expj.common.pscript.viewErrorMessage('KM0030010', 'KM0030010button2', 'KQ00316');
}
};
// script26="onClick;12;CHK;_KM0030010form1/rdoSHIP_UPDATE[eq]true@*13"
expj.KM0030010.KM0030010button2.Modify.onClick12 = function () {
  console.log('Modify script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/rdoSHIP_UPDATE'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script27="child;13;CHK;_KM0030010form2/h_ANS_DLV_DATE_EXIST_FLG[eq]Y@$KQ00314"
expj.KM0030010.KM0030010button2.Modify.child13 = function () {
  console.log('Modify script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/h_ANS_DLV_DATE_EXIST_FLG'), '[eq]', 'Y')) {
expj.common.pscript.addWarningMessage('KM0030010', 'KM0030010button2', 'KQ00314');
}
};
// script28="onClick;13;CHK;_KM0030010form1/rdoSHIP_UPDATE[eq]true[and]_KM0030010form1/h_APR_ODR[eq]1@*14"
expj.KM0030010.KM0030010button2.Modify.onClick13 = function () {
  console.log('Modify script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/rdoSHIP_UPDATE'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form1/h_APR_ODR'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script29="child;14;CHK;_KM0030010form2/ES_ORG_CD[eq]@!KM00061"
expj.KM0030010.KM0030010button2.Modify.child14 = function () {
  console.log('Modify script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button2', '_KM0030010form2/ES_ORG_CD'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('KM0030010', 'KM0030010button2', 'KM00061');
}
};
// script30="onClick;14;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0030010form1/*,_KM0030010form2/*@KM0030010Servlet,,"
expj.KM0030010.KM0030010button2.Modify.onClick14 = function () {
  console.log('Modify script30');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0030010', 'KM0030010button2', '_KM0030010form1/*,_KM0030010form2/*', 'KM0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0030010', response);
expj.common.updateBusinessScreenTab('KM0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0030010.KM0030010button2.Modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 14; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010button2.Modify['onClick' + i])) {
        expj.KM0030010.KM0030010button2.Modify['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010button2.Modify.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010button2.Modify.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010button2-Modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010button2', 'Modify', this, 'Button');
    }
  });
  expj.KM0030010.KM0030010button2.Modify.executePScriptOnLoad();
};

expj.KM0030010.KM0030010button2.Modify.executePScriptOnLoad = function () {
  console.log('execute KM0030010button2/Modify.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010button2-Modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0030010-KM0030010button2-Modify" name="Modify" class="KM0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnModify",rb)%></button><!-- 修正ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:42px"><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 525px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KM0030010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:525px;">
<script class="expj-script-KM0030010-KM0030010button0">
expj.KM0030010.KM0030010button0 = {};
expj.KM0030010.KM0030010button0.executeAllOnDecision = function () {
  console.log('execute KM0030010button0.onDecision');
};
expj.KM0030010.KM0030010button0.executeOnLoad = function () {
  expj.KM0030010.KM0030010button0.executePScriptOnLoad();
};

expj.KM0030010.KM0030010button0.executePScriptOnLoad = function () {
  console.log('execute KM0030010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0030010-KM0030010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:525px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0030010-KM0030010button0-Insert">
expj.KM0030010.KM0030010button0.Insert = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0030010form1/*,_KM0030010view1/*@KM0030010Servlet,,$ZZ07001"
expj.KM0030010.KM0030010button0.Insert.onClick0 = function () {
  console.log('Insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0030010', 'KM0030010button0', '_KM0030010form1/*,_KM0030010view1/*', 'KM0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0030010', response);
expj.common.updateBusinessScreenTab('KM0030010', contents);
};
expj.common.pscript.callConfirm('KM0030010', 'KM0030010button0', 'ZZ07001', okEvent);
};
expj.KM0030010.KM0030010button0.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010button0.Insert['onClick' + i])) {
        expj.KM0030010.KM0030010button0.Insert['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010button0.Insert.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010button0.Insert.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010button0-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010button0', 'Insert', this, 'Button');
    }
  });
  expj.KM0030010.KM0030010button0.Insert.executePScriptOnLoad();
};

expj.KM0030010.KM0030010button0.Insert.executePScriptOnLoad = function () {
  console.log('execute KM0030010button0/Insert.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010button0-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0030010-KM0030010button0-Insert" name="Insert" class="KM0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010button0-Update">
expj.KM0030010.KM0030010button0.Update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0030010form1/*,_KM0030010view1/*@KM0030010Servlet,,$ZZ07003"
expj.KM0030010.KM0030010button0.Update.onClick0 = function () {
  console.log('Update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0030010', 'KM0030010button0', '_KM0030010form1/*,_KM0030010view1/*', 'KM0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0030010', response);
expj.common.updateBusinessScreenTab('KM0030010', contents);
};
expj.common.pscript.callConfirm('KM0030010', 'KM0030010button0', 'ZZ07003', okEvent);
};
expj.KM0030010.KM0030010button0.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010button0.Update['onClick' + i])) {
        expj.KM0030010.KM0030010button0.Update['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010button0.Update.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010button0.Update.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010button0-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010button0', 'Update', this, 'Button');
    }
  });
  expj.KM0030010.KM0030010button0.Update.executePScriptOnLoad();
};

expj.KM0030010.KM0030010button0.Update.executePScriptOnLoad = function () {
  console.log('execute KM0030010button0/Update.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010button0-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0030010-KM0030010button0-Update" name="Update" class="KM0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010button0-Delete">
expj.KM0030010.KM0030010button0.Delete = {};
// script1="onClick;0;CHK;_KM0030010form2/h_ANS_DLV_DATE_EXIST_FLG[eq]Y@!KQ00050"
expj.KM0030010.KM0030010button0.Delete.onClick0 = function () {
  console.log('Delete script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button0', '_KM0030010form2/h_ANS_DLV_DATE_EXIST_FLG'), '[eq]', 'Y')) {
expj.common.pscript.viewErrorMessage('KM0030010', 'KM0030010button0', 'KQ00050');
}
};
// script2="onClick;1;CHK;_KM0030010form1/h_APR_ODR[eq]1@*0"
expj.KM0030010.KM0030010button0.Delete.onClick1 = function () {
  console.log('Delete script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button0', '_KM0030010form1/h_APR_ODR'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;CHK;_KM0030010form2/ES_ORG_CD[eq]@!KM00061"
expj.KM0030010.KM0030010button0.Delete.child0 = function () {
  console.log('Delete script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0030010', 'KM0030010button0', '_KM0030010form2/ES_ORG_CD'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('KM0030010', 'KM0030010button0', 'KM00061');
}
};
// script4="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0030010form1/*,_KM0030010view1/+@KM0030010Servlet,,$ZZ07004"
expj.KM0030010.KM0030010button0.Delete.onClick2 = function () {
  console.log('Delete script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0030010', 'KM0030010button0', '_KM0030010form1/*,_KM0030010view1/+', 'KM0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0030010', response);
expj.common.updateBusinessScreenTab('KM0030010', contents);
};
expj.common.pscript.callConfirm('KM0030010', 'KM0030010button0', 'ZZ07004', okEvent);
};
expj.KM0030010.KM0030010button0.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010button0.Delete['onClick' + i])) {
        expj.KM0030010.KM0030010button0.Delete['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010button0.Delete.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010button0.Delete.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010button0-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010button0', 'Delete', this, 'Button');
    }
  });
  expj.KM0030010.KM0030010button0.Delete.executePScriptOnLoad();
};

expj.KM0030010.KM0030010button0.Delete.executePScriptOnLoad = function () {
  console.log('execute KM0030010button0/Delete.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010button0-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0030010-KM0030010button0-Delete" name="Delete" class="KM0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010button0-Clear">
expj.KM0030010.KM0030010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KM0030010Servlet,,$ZZ07008"
expj.KM0030010.KM0030010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0030010', 'KM0030010button0', '', 'KM0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0030010', response);
expj.common.updateBusinessScreenTab('KM0030010', contents);
};
expj.common.pscript.callConfirm('KM0030010', 'KM0030010button0', 'ZZ07008', okEvent);
};
expj.KM0030010.KM0030010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010button0.Clear['onClick' + i])) {
        expj.KM0030010.KM0030010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010button0.Clear.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010button0.Clear.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010button0', 'Clear', this, 'Button');
    }
  });
  expj.KM0030010.KM0030010button0.Clear.executePScriptOnLoad();
};

expj.KM0030010.KM0030010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KM0030010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0030010-KM0030010button0-Clear" name="Clear" class="KM0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KM0030010-KM0030010button0-Close">
expj.KM0030010.KM0030010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KM0030010.KM0030010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KM0030010');
};
expj.KM0030010.KM0030010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0030010.KM0030010button0.Close['onClick' + i])) {
        expj.KM0030010.KM0030010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KM0030010.KM0030010button0.Close.executeAllOnDecision = function () {
};
expj.KM0030010.KM0030010button0.Close.executeOnLoad = function () {
  $('#expj-KM0030010-KM0030010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0030010', 'KM0030010button0', 'Close', this, 'Button');
    }
  });
  expj.KM0030010.KM0030010button0.Close.executePScriptOnLoad();
};

expj.KM0030010.KM0030010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KM0030010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KM0030010-KM0030010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0030010-KM0030010button0-Close" name="Close" class="KM0030010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KM0030010 (END)-->
<%
MessageStruct msgStruct = aKM0030010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KM0030010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KM0030010)) {
  expj.common.treeInstanceMap.KM0030010 = {};
}
expj.common.treeInstanceMap.KM0030010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KM0030010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KM0030010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KM0030010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KM0030010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KM0030010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KM0030010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KM0030010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KM0030010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KM0030010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KM0030010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0030010)) {
  expj.common.detailDialogMap.KM0030010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0030010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KM0030010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0030010.<%=detailId %>)) {
  expj.common.detailDialogMap.KM0030010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0030010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KM0030010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0030010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KM0030010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KM0030010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KM0030010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KM0030010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KM0030010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KM0030010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KM0030010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KM0030010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KM0030010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KM0030010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KM0030010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KM0030010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
<%
}
%>
};
</script>
<%
 }
//DETAIL JS宣言(END)

//VIEW JS宣言
for (int i = 0; i < viewIdList.size(); i++) {
 String viewId = (String) viewIdList.get(i);
 String viewResize = (String) viewResizeList.get(i);
 String viewSelect = (String) viewSelectList.get(i);
 String viewScroll = (String) viewScrollList.get(i);
 StringBuffer viewHeaderBuffer = (StringBuffer) viewHeaderDataList.get(i);
 StringBuffer viewDataBuffer = (StringBuffer) viewBodyDataList.get(i);
%>
<script class="expj-script-KM0030010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KM0030010)) {
  expj.common.viewInstanceMap.KM0030010 = {};
}
expj.common.viewInstanceMap.KM0030010.<%=viewId %> = {};
expj.common.viewInstanceMap.KM0030010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KM0030010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KM0030010.<%=viewId %>.init = function () {
  // DataGrid(VIEW)のボディデータ
  var body_data = [<%=viewDataBuffer.toString() %>];
  // DataGrid(VIEW)のヘッダーデータ
  var header_data = [<%=viewHeaderBuffer.toString() %>];
  var viewSelectEvent = function (target) {
    console.log('execute <%=viewId %>.onClick');
    expj.common.pscript.onClickTargetButtonData = null;
<%
 String viewClickFunctionName = (String) viewSelectEvent.get((String) viewId);
 if (viewClickFunctionName != null) {
%>
    <%=viewClickFunctionName %>();
<%
 }
%>
    expj.KM0030010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KM0030010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KM0030010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KM0030010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KM0030010_init">
/**
 * KM0030010用のロード完了時初期化関数
 */
expj.KM0030010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KM0030010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KM0030010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KM0030010');
  expj.common.calendarInstanceMap.KM0030010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KM0030010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KM0030010.<%=detailId %>.init();
  expj.common.detailDialogMap.KM0030010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KM0030010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KM0030010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KM0030010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KM0030010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KM0030010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KM0030010-<%=detailId %>');
<%
 }
%>
  try{expj.KM0030010.KM0030010form1.PROJECT_CD.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form1.PeekerIPROJECT_CD.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form1.PROJECT_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form1.h_PRD_REQ_JOB_ODR_TYP_2.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form1.h_PRD_REQ_JOB_ODR_TYP_1.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form1.ESTIMATE_NO.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form1.CUST_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form1.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form1.rdoSHIP_INST.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form1.rdoSHIP_UPDATE.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form1.h_APR_ODR.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.DETAIL_NO.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ODR_ACPT_DATE.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.CalendarTargetOdrAcptDate.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ACPT_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.h_ODR_TYP3.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.c_DOODR.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.h_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.PREPARE_QTY.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.CUST_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.JOB_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.CalendarTargetJobOdrDlvDate.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.DESINATED_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.CalendarTargetDesinatedDlvDate.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ALC_GRP_CD.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.PeekerTargetDlvLocCd.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.c_INPUTODRCD.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ESTIMATE_TYPE.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.h_ESTIMATE_TYPE.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.PeekerTargetCustItemCd.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.CUST_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.QTY.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.QTY_UNIT.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ODR_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ODR_PRICE_UNIT.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ODR_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ODR_AMOUNT_EXCH_RATES.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ISSUE_INST_COMMENT.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.h_DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.APPROVED_COMMENT.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.h_ANS_DLV_DATE_EXIST_FLG.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.CUST_CHRG_PSN_CD.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.peekerTargetCustChrgPsnCd.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.CUST_CHRG_PSN_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ES_ORG_CD.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.peekerTargeteSoRGCd.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ES_ORG_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.ITEM_NAME_R.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.h_PREC_ARRANGE_FLG.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010button2.Modify.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010button0.Insert.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010button0.Update.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010button0.Delete.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form1.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010button1.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010view1.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010form2.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010button2.executeOnLoad();}catch(e){};
  try{expj.KM0030010.KM0030010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KM0030010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KM0030010', 'KM0030010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KM0030010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KM0030010-focus-move');
  // 初期フォーカス当てる処理
  $('.KM0030010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KM0030010', '<%=request.getContextPath() %>');
};

/**
 * KM0030010の全体onDecision処理
 */
expj.KM0030010.executeAllOnDecision = function () {
  expj.KM0030010.KM0030010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KM0030010_console">
expj.KM0030010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>