<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:30:42 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0030\AD0030030.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0030.*" %>
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
<jsp:useBean id="aAD0030030Control" class="com.nec.jp.orteus.metamorBase.AD0030.AD0030030Control" scope="request"/>
<jsp:useBean id="aAD0030030Struct" class="com.nec.jp.orteus.metamorBase.AD0030.AD0030030Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

作業指示確定実行
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/jsp/AD0030030.jsp,v $
$Author: geng-jia $	
$Revision: 1.24 $　$Date: 2017/02/22 02:04:45 $
********************************************************* --%>
<html>
<head>
<title>作業指示確定実行</title>
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
<script class="expj-script-AD0030030_init">
  // AD0030030名前空間
  expj.AD0030030 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AD0030030" data-screen="AD0030030" data-newdata="<%=aAD0030030Control.isNewData() %>">
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
              <script class="expj-script-AD0030030-AD0030030form1">
expj.AD0030030.AD0030030form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,21"
expj.AD0030030.AD0030030form1.onLoad0 = function () {
  console.log('AD0030030form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision21)){this.onDecision21();}
};
// script2="onDecision;0;CHK;_r1_FILTER1[eq]true@*0,*1"
expj.AD0030030.AD0030030form1.onDecision0 = function () {
  console.log('AD0030030form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_r1_FILTER1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;CHKRQ;A@*2,*3"
expj.AD0030030.AD0030030form1.child0 = function () {
  console.log('AD0030030form1 script3');
if (expj.common.pscript.satisfiedRequiredComponent('AD0030030', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;1;CHKRQ;B@*2,*3"
expj.AD0030030.AD0030030form1.child1 = function () {
  console.log('AD0030030form1 script4');
if (expj.common.pscript.satisfiedRequiredComponent('AD0030030', 'B')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;2;UNMASK;_AD0030030button1/Select,_AD0030030button1/UpdateAll"
expj.AD0030030.AD0030030form1.child2 = function () {
  console.log('AD0030030form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_AD0030030button1/Select');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_AD0030030button1/UpdateAll');
};
// script6="child;3;MASK;_AD0030030button1/Select,_AD0030030button1/UpdateAll"
expj.AD0030030.AD0030030form1.child3 = function () {
  console.log('AD0030030form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_AD0030030button1/Select');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_AD0030030button1/UpdateAll');
};
// script7="onDecision;1;CHKRQ;?AD0030030view1/?[neq]NOT_SELECTED@*4,*6"
expj.AD0030030.AD0030030form1.onDecision1 = function () {
  console.log('AD0030030form1 script7');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?AD0030030view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="child;4;CHK;?r1_FILTER1[eq]SAME[and]?OPR_INST_START_DATE[eq]SAME[and]?OPR_INST_START_TIME[eq]SAME[and]?WORK_ODR_DLV_DATE[eq]SAME[and]?WORK_ODR_DLV_TIME[eq]SAME[and]?c_OUTPUT_RSLT[eq]SAME[and]?c_OUTSIDE_TYP_IN[eq]SAME[and]?c_OUTSIDE_TYP_OUT[eq]SAME[and]?JOB_ODR_CD[eq]SAME[and]?ITEM_CD[eq]SAME[and]?WS_CD[eq]SAME[and]?VEND_CD[eq]SAME[and]?AD0030030form1/*[eq]NORMAL@*5,*6"
expj.AD0030030.AD0030030form1.child4 = function () {
  console.log('AD0030030form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?r1_FILTER1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?OPR_INST_START_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?OPR_INST_START_TIME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?WORK_ODR_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?WORK_ODR_DLV_TIME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?c_OUTPUT_RSLT'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?c_OUTSIDE_TYP_IN'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?c_OUTSIDE_TYP_OUT'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?AD0030030form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;5;UNMASK;_AD0030030button2/UpdateAssort"
expj.AD0030030.AD0030030form1.child5 = function () {
  console.log('AD0030030form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_AD0030030button2/UpdateAssort');
};
// script10="child;6;MASK;_AD0030030button2/UpdateAssort"
expj.AD0030030.AD0030030form1.child6 = function () {
  console.log('AD0030030form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_AD0030030button2/UpdateAssort');
};
// script11="onDecision;2;CHK;?r1_FILTER1[eq]SAME[and]?OPR_INST_START_DATE[eq]SAME[and]?OPR_INST_START_TIME[eq]SAME[and]?WORK_ODR_DLV_DATE[eq]SAME[and]?WORK_ODR_DLV_TIME[eq]SAME[and]?c_OUTPUT_RSLT[eq]SAME[and]?c_OUTSIDE_TYP_IN[eq]SAME[and]?c_OUTSIDE_TYP_OUT[eq]SAME[and]?JOB_ODR_CD[eq]SAME[and]?ITEM_CD[eq]SAME[and]?WS_CD[eq]SAME[and]?VEND_CD[eq]SAME[and]?AD0030030form1/*[eq]NORMAL@*7,*8"
expj.AD0030030.AD0030030form1.onDecision2 = function () {
  console.log('AD0030030form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?r1_FILTER1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?OPR_INST_START_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?OPR_INST_START_TIME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?WORK_ODR_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?WORK_ODR_DLV_TIME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?c_OUTPUT_RSLT'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?c_OUTSIDE_TYP_IN'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?c_OUTSIDE_TYP_OUT'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '?AD0030030form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_AD0030030button2/CheckAll,_AD0030030button2/CheckClear"
expj.AD0030030.AD0030030form1.child7 = function () {
  console.log('AD0030030form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_AD0030030button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_AD0030030button2/CheckClear');
};
// script13="child;8;MASK;_AD0030030button2/CheckAll,_AD0030030button2/CheckClear"
expj.AD0030030.AD0030030form1.child8 = function () {
  console.log('AD0030030form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_AD0030030button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_AD0030030button2/CheckClear');
};
// script14="onDecision;3;CHK;_r1_FILTER1[eq]true@*9,*12"
expj.AD0030030.AD0030030form1.onDecision3 = function () {
  console.log('AD0030030form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_r1_FILTER1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script15="child;9;UNMASK;_OPR_INST_START_DATE,_OPR_INST_START_TIME,_CalendarOprInstStartDate@*10"
expj.AD0030030.AD0030030form1.child9 = function () {
  console.log('AD0030030form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_OPR_INST_START_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_OPR_INST_START_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_CalendarOprInstStartDate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script16="child;10;MASK;_WORK_ODR_DLV_DATE,_WORK_ODR_DLV_TIME,_CalendarPrdDueDate@*11"
expj.AD0030030.AD0030030form1.child10 = function () {
  console.log('AD0030030form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_WORK_ODR_DLV_DATE');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_WORK_ODR_DLV_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_CalendarPrdDueDate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script17="child;11;SET;_WORK_ODR_DLV_DATE=,_WORK_ODR_DLV_TIME="
expj.AD0030030.AD0030030form1.child11 = function () {
  console.log('AD0030030form1 script17');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_WORK_ODR_DLV_DATE', '');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_WORK_ODR_DLV_TIME', '');
};
// script18="child;12;UNMASK;_WORK_ODR_DLV_DATE,_WORK_ODR_DLV_TIME,_CalendarPrdDueDate@*13"
expj.AD0030030.AD0030030form1.child12 = function () {
  console.log('AD0030030form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_WORK_ODR_DLV_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_WORK_ODR_DLV_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_CalendarPrdDueDate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child13)){this.child13();}}
};
// script19="child;13;MASK;_OPR_INST_START_DATE,_OPR_INST_START_TIME,_CalendarOprInstStartDate@*14"
expj.AD0030030.AD0030030form1.child13 = function () {
  console.log('AD0030030form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_OPR_INST_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_OPR_INST_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_CalendarOprInstStartDate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script20="child;14;SET;_OPR_INST_START_DATE=,_OPR_INST_START_TIME="
expj.AD0030030.AD0030030form1.child14 = function () {
  console.log('AD0030030form1 script20');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_OPR_INST_START_DATE', '');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_OPR_INST_START_TIME', '');
};
// script21="onDecision;4;CHK;_c_OUTSIDE_TYP_OUT[eq]true@*15,*16"
expj.AD0030030.AD0030030form1.onDecision4 = function () {
  console.log('AD0030030form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_c_OUTSIDE_TYP_OUT'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script22="child;15;UNMASK;_VEND_CD,_PeekerVendCd"
expj.AD0030030.AD0030030form1.child15 = function () {
  console.log('AD0030030form1 script22');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_VEND_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_PeekerVendCd');
};
// script23="child;16;MASK;_VEND_CD,_PeekerVendCd@*17"
expj.AD0030030.AD0030030form1.child16 = function () {
  console.log('AD0030030form1 script23');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_VEND_CD');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_PeekerVendCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
// script24="child;17;SET;_VEND_CD=,_VEND_ANAME="
expj.AD0030030.AD0030030form1.child17 = function () {
  console.log('AD0030030form1 script24');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_VEND_CD', '');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_VEND_ANAME', '');
};
// script25="onDecision;5;CHK;_c_OUTPUT_RSLT[eq]true[or]_c_OUTSIDE_TYP_IN[eq]true@*18,*19"
expj.AD0030030.AD0030030form1.onDecision5 = function () {
  console.log('AD0030030form1 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_c_OUTPUT_RSLT'), '[eq]', 'true') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_c_OUTSIDE_TYP_IN'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script26="child;18;UNMASK;_WS_CD,_PeekerWcCd"
expj.AD0030030.AD0030030form1.child18 = function () {
  console.log('AD0030030form1 script26');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_WS_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_PeekerWcCd');
};
// script27="child;19;MASK;_WS_CD,_PeekerWcCd@*20"
expj.AD0030030.AD0030030form1.child19 = function () {
  console.log('AD0030030form1 script27');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_WS_CD');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_PeekerWcCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child20)){this.child20();}}
};
// script28="child;20;SET;_WS_CD=,_WS_NAME="
expj.AD0030030.AD0030030form1.child20 = function () {
  console.log('AD0030030form1 script28');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_WS_CD', '');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_WS_NAME', '');
};
// script29="onDecision;21;CHK;_TIME_CTRL[eq]false@*22"
expj.AD0030030.AD0030030form1.onDecision21 = function () {
  console.log('AD0030030form1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_TIME_CTRL'), '[eq]', 'false')) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script30="child;22;MASK;_OPR_INST_START_TIME,_WORK_ODR_DLV_TIME@*23"
expj.AD0030030.AD0030030form1.child22 = function () {
  console.log('AD0030030form1 script30');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_OPR_INST_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_WORK_ODR_DLV_TIME');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child23)){this.child23();}}
};
// script31="child;23;SET;_OPR_INST_START_TIME=,_WORK_ODR_DLV_TIME="
expj.AD0030030.AD0030030form1.child23 = function () {
  console.log('AD0030030form1 script31');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_OPR_INST_START_TIME', '');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_WORK_ODR_DLV_TIME', '');
};
expj.AD0030030.AD0030030form1.executeAllOnDecision = function () {
  console.log('execute AD0030030form1.onDecision');
  for (var i = 0; i <= 21; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030form1['onDecision' + i])) {
        expj.AD0030030.AD0030030form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030form1.executeOnLoad = function () {
  expj.AD0030030.AD0030030form1.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0030030.AD0030030form1['onLoad' + i])) {
      expj.AD0030030.AD0030030form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0030030-AD0030030form1" action="AD0030030Servlet" name="AD0030030form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0030030Control.getReadStatusString()) %>" style="height:142px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:142px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_INST_START_DATE",rb)%></span><!-- 製造着手日 --></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-OPR_INST_START_DATE">
expj.AD0030030.AD0030030form1.OPR_INST_START_DATE = {};
expj.AD0030030.AD0030030form1.OPR_INST_START_DATE.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/OPR_INST_START_DATE.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.OPR_INST_START_DATE.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-OPR_INST_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030030', 'AD0030030form1', 'OPR_INST_START_DATE', this);
  });
  expj.AD0030030.AD0030030form1.OPR_INST_START_DATE.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.OPR_INST_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/OPR_INST_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-OPR_INST_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030030-AD0030030form1-OPR_INST_START_DATE" name="OPR_INST_START_DATE" class="AD0030030-focus-move  required-value expj-AD0030030-required-A" style="width:100%;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0030030Struct.getOPR_INST_START_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-CalendarOprInstStartDate">
expj.AD0030030.AD0030030form1.CalendarOprInstStartDate = {};
// script1="onClick;0;CALENDAR;_AD0030030form1/OPR_INST_START_DATE"
expj.AD0030030.AD0030030form1.CalendarOprInstStartDate.onClick0 = function () {
  console.log('CalendarOprInstStartDate script1');
expj.common.pscript.executeCalendar('AD0030030','AD0030030form1','_AD0030030form1/OPR_INST_START_DATE');
};
expj.AD0030030.AD0030030form1.CalendarOprInstStartDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030form1.CalendarOprInstStartDate['onClick' + i])) {
        expj.AD0030030.AD0030030form1.CalendarOprInstStartDate['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030form1.CalendarOprInstStartDate.executeAllOnDecision = function () {
};
expj.AD0030030.AD0030030form1.CalendarOprInstStartDate.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-CalendarOprInstStartDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030form1', 'CalendarOprInstStartDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0030030','AD0030030form1','_AD0030030form1/OPR_INST_START_DATE');
  expj.AD0030030.AD0030030form1.CalendarOprInstStartDate.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.CalendarOprInstStartDate.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/CalendarOprInstStartDate.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-CalendarOprInstStartDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030030-AD0030030form1-CalendarOprInstStartDate" class="AD0030030-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-OPR_INST_START_TIME">
expj.AD0030030.AD0030030form1.OPR_INST_START_TIME = {};
expj.AD0030030.AD0030030form1.OPR_INST_START_TIME.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/OPR_INST_START_TIME.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.OPR_INST_START_TIME.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-OPR_INST_START_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030030', 'AD0030030form1', 'OPR_INST_START_TIME', this);
  });
  expj.AD0030030.AD0030030form1.OPR_INST_START_TIME.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.OPR_INST_START_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/OPR_INST_START_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-OPR_INST_START_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0030030-AD0030030form1-OPR_INST_START_TIME" name="OPR_INST_START_TIME" class="AD0030030-focus-move  " style="width:100%;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0030030Struct.getOPR_INST_START_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-r1_FILTER1">
expj.AD0030030.AD0030030form1.r1_FILTER1 = {};
// script1="onClick;0;SET;_WORK_ODR_DLV_DATE=,_WORK_ODR_DLV_TIME="
expj.AD0030030.AD0030030form1.r1_FILTER1.onClick0 = function () {
  console.log('r1_FILTER1 script1');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_WORK_ODR_DLV_DATE', '');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_WORK_ODR_DLV_TIME', '');
};
expj.AD0030030.AD0030030form1.r1_FILTER1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030form1.r1_FILTER1['onClick' + i])) {
        expj.AD0030030.AD0030030form1.r1_FILTER1['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030form1.r1_FILTER1.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/r1_FILTER1.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.r1_FILTER1.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-r1_FILTER1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030form1', 'r1_FILTER1', this, 'RadioButton');
    }
  });
  expj.AD0030030.AD0030030form1.r1_FILTER1.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.r1_FILTER1.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/r1_FILTER1.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-r1_FILTER1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="FILTER1" data-name="r1_FILTER1" value="true" <%= ("true".equals(TypeConverter.convert(aAD0030030Struct.getr1_FILTER1())) || "".equals(TypeConverter.convert(aAD0030030Struct.getr1_FILTER1())))?"checked=\"checked\"": "" %> class="" id="expj-AD0030030-AD0030030form1-r1_FILTER1" ><label for="expj-AD0030030-AD0030030form1-r1_FILTER1"><%=CoreTools.getRBString("Expj.Cmt0500",rb)%></label></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-c_OUTPUT_RSLT">
expj.AD0030030.AD0030030form1.c_OUTPUT_RSLT = {};
// script1="onClick;0;CHK;_THIS[eq]true[or]_c_OUTSIDE_TYP_IN[eq]true@*0,*1"
expj.AD0030030.AD0030030form1.c_OUTPUT_RSLT.onClick0 = function () {
  console.log('c_OUTPUT_RSLT script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_THIS'), '[eq]', 'true') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_c_OUTSIDE_TYP_IN'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;UNMASK;_WS_CD"
expj.AD0030030.AD0030030form1.c_OUTPUT_RSLT.child0 = function () {
  console.log('c_OUTPUT_RSLT script2');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_WS_CD');
};
// script3="child;1;MASK;_WS_CD@*2"
expj.AD0030030.AD0030030form1.c_OUTPUT_RSLT.child1 = function () {
  console.log('c_OUTPUT_RSLT script3');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_WS_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;SET;_WS_CD="
expj.AD0030030.AD0030030form1.c_OUTPUT_RSLT.child2 = function () {
  console.log('c_OUTPUT_RSLT script4');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_WS_CD', '');
};
expj.AD0030030.AD0030030form1.c_OUTPUT_RSLT.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030form1.c_OUTPUT_RSLT['onClick' + i])) {
        expj.AD0030030.AD0030030form1.c_OUTPUT_RSLT['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030form1.c_OUTPUT_RSLT.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/c_OUTPUT_RSLT.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.c_OUTPUT_RSLT.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-c_OUTPUT_RSLT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030form1', 'c_OUTPUT_RSLT', this, 'CheckBox');
    }
  });
  expj.AD0030030.AD0030030form1.c_OUTPUT_RSLT.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.c_OUTPUT_RSLT.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/c_OUTPUT_RSLT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-c_OUTPUT_RSLT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c_OUTPUT_RSLT" value="true" <%= ("true".equals(TypeConverter.convert(aAD0030030Struct.getc_OUTPUT_RSLT())) || "".equals(TypeConverter.convert(aAD0030030Struct.getc_OUTPUT_RSLT())))?"checked=\"checked\"": "" %> class="AD0030030-focus-move" id="expj-AD0030030-AD0030030form1-c_OUTPUT_RSLT"><label for="expj-AD0030030-AD0030030form1-c_OUTPUT_RSLT"><%=CoreTools.getRBString("Expj.Cmt0419",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_3",rb)%></span><!-- 製造納期 --></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-WORK_ODR_DLV_DATE">
expj.AD0030030.AD0030030form1.WORK_ODR_DLV_DATE = {};
expj.AD0030030.AD0030030form1.WORK_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/WORK_ODR_DLV_DATE.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.WORK_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-WORK_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030030', 'AD0030030form1', 'WORK_ODR_DLV_DATE', this);
  });
  expj.AD0030030.AD0030030form1.WORK_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.WORK_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/WORK_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-WORK_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030030-AD0030030form1-WORK_ODR_DLV_DATE" name="WORK_ODR_DLV_DATE" class="AD0030030-focus-move  required-value expj-AD0030030-required-B" style="width:100%;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0030030Struct.getWORK_ODR_DLV_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-CalendarPrdDueDate">
expj.AD0030030.AD0030030form1.CalendarPrdDueDate = {};
// script1="onClick;0;CALENDAR;_AD0030030form1/WORK_ODR_DLV_DATE"
expj.AD0030030.AD0030030form1.CalendarPrdDueDate.onClick0 = function () {
  console.log('CalendarPrdDueDate script1');
expj.common.pscript.executeCalendar('AD0030030','AD0030030form1','_AD0030030form1/WORK_ODR_DLV_DATE');
};
expj.AD0030030.AD0030030form1.CalendarPrdDueDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030form1.CalendarPrdDueDate['onClick' + i])) {
        expj.AD0030030.AD0030030form1.CalendarPrdDueDate['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030form1.CalendarPrdDueDate.executeAllOnDecision = function () {
};
expj.AD0030030.AD0030030form1.CalendarPrdDueDate.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-CalendarPrdDueDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030form1', 'CalendarPrdDueDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0030030','AD0030030form1','_AD0030030form1/WORK_ODR_DLV_DATE');
  expj.AD0030030.AD0030030form1.CalendarPrdDueDate.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.CalendarPrdDueDate.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/CalendarPrdDueDate.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-CalendarPrdDueDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030030-AD0030030form1-CalendarPrdDueDate" class="AD0030030-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-WORK_ODR_DLV_TIME">
expj.AD0030030.AD0030030form1.WORK_ODR_DLV_TIME = {};
expj.AD0030030.AD0030030form1.WORK_ODR_DLV_TIME.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/WORK_ODR_DLV_TIME.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.WORK_ODR_DLV_TIME.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-WORK_ODR_DLV_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030030', 'AD0030030form1', 'WORK_ODR_DLV_TIME', this);
  });
  expj.AD0030030.AD0030030form1.WORK_ODR_DLV_TIME.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.WORK_ODR_DLV_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/WORK_ODR_DLV_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-WORK_ODR_DLV_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0030030-AD0030030form1-WORK_ODR_DLV_TIME" name="WORK_ODR_DLV_TIME" class="AD0030030-focus-move  " style="width:100%;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0030030Struct.getWORK_ODR_DLV_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-r2_FILTER1">
expj.AD0030030.AD0030030form1.r2_FILTER1 = {};
// script1="onClick;0;SET;_OPR_INST_START_DATE=,_OPR_INST_START_TIME="
expj.AD0030030.AD0030030form1.r2_FILTER1.onClick0 = function () {
  console.log('r2_FILTER1 script1');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_OPR_INST_START_DATE', '');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_OPR_INST_START_TIME', '');
};
expj.AD0030030.AD0030030form1.r2_FILTER1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030form1.r2_FILTER1['onClick' + i])) {
        expj.AD0030030.AD0030030form1.r2_FILTER1['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030form1.r2_FILTER1.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/r2_FILTER1.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.r2_FILTER1.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-r2_FILTER1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030form1', 'r2_FILTER1', this, 'RadioButton');
    }
  });
  expj.AD0030030.AD0030030form1.r2_FILTER1.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.r2_FILTER1.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/r2_FILTER1.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-r2_FILTER1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="FILTER1" data-name="r2_FILTER1" value="true" <%= ("true".equals(TypeConverter.convert(aAD0030030Struct.getr2_FILTER1())))?"checked=\"checked\"":"" %> class="" id="expj-AD0030030-AD0030030form1-r2_FILTER1" ><label for="expj-AD0030030-AD0030030form1-r2_FILTER1"><%=CoreTools.getRBString("Expj.Cmt0501",rb)%></label></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-c_OUTSIDE_TYP_IN">
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_IN = {};
// script1="onClick;0;CHK;_THIS[eq]true[or]_c_OUTPUT_RSLT[eq]true@*0,*1"
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_IN.onClick0 = function () {
  console.log('c_OUTSIDE_TYP_IN script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_THIS'), '[eq]', 'true') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_c_OUTPUT_RSLT'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;UNMASK;_WS_CD"
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_IN.child0 = function () {
  console.log('c_OUTSIDE_TYP_IN script2');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_WS_CD');
};
// script3="child;1;MASK;_WS_CD@*2"
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_IN.child1 = function () {
  console.log('c_OUTSIDE_TYP_IN script3');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_WS_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;SET;_WS_CD=,_WS_NAME="
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_IN.child2 = function () {
  console.log('c_OUTSIDE_TYP_IN script4');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_WS_CD', '');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_WS_NAME', '');
};
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_IN.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_IN['onClick' + i])) {
        expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_IN['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_IN.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/c_OUTSIDE_TYP_IN.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_IN.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-c_OUTSIDE_TYP_IN').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030form1', 'c_OUTSIDE_TYP_IN', this, 'CheckBox');
    }
  });
  expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_IN.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_IN.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/c_OUTSIDE_TYP_IN.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-c_OUTSIDE_TYP_IN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c_OUTSIDE_TYP_IN" value="true" <%= ("true".equals(TypeConverter.convert(aAD0030030Struct.getc_OUTSIDE_TYP_IN())) || "".equals(TypeConverter.convert(aAD0030030Struct.getc_OUTSIDE_TYP_IN())))?"checked=\"checked\"": "" %> class="AD0030030-focus-move" id="expj-AD0030030-AD0030030form1-c_OUTSIDE_TYP_IN"><label for="expj-AD0030030-AD0030030form1-c_OUTSIDE_TYP_IN"><%=CoreTools.getRBString("Expj.Cmt0417",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-JOB_ODR_CD">
expj.AD0030030.AD0030030form1.JOB_ODR_CD = {};
expj.AD0030030.AD0030030form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/JOB_ODR_CD.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030030', 'AD0030030form1', 'JOB_ODR_CD', this);
  });
  expj.AD0030030.AD0030030form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030030-AD0030030form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AD0030030-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAD0030030Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-PeekerJOB_ODR_CD">
expj.AD0030030.AD0030030form1.PeekerJOB_ODR_CD = {};
// script1="onClick;0;PEEKER;_AD0030030form1/JOB_ODR_CD@<%=contextNo%>"
expj.AD0030030.AD0030030form1.PeekerJOB_ODR_CD.onClick0 = function () {
  console.log('PeekerJOB_ODR_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0030030';
var parameterValues = 'PeekerJOB_ODR_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_AD0030030form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_AD0030030form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_12%&%';
parameterValues += 'TARGET_FIELD%=%_AD0030030form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0030030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0030030.AD0030030form1.PeekerJOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030form1.PeekerJOB_ODR_CD['onClick' + i])) {
        expj.AD0030030.AD0030030form1.PeekerJOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030form1.PeekerJOB_ODR_CD.executeAllOnDecision = function () {
};
expj.AD0030030.AD0030030form1.PeekerJOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-PeekerJOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030form1', 'PeekerJOB_ODR_CD', this, 'Button');
    }
  });
  expj.AD0030030.AD0030030form1.PeekerJOB_ODR_CD.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.PeekerJOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/PeekerJOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-PeekerJOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030030-AD0030030form1-PeekerJOB_ODR_CD" class="AD0030030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-c_OUTSIDE_TYP_OUT">
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_OUT = {};
// script1="onClick;0;CHK;_THIS[eq]true@*0,*1"
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_OUT.onClick0 = function () {
  console.log('c_OUTSIDE_TYP_OUT script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;UNMASK;_VEND_CD"
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_OUT.child0 = function () {
  console.log('c_OUTSIDE_TYP_OUT script2');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_VEND_CD');
};
// script3="child;1;MASK;_VEND_CD@*2"
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_OUT.child1 = function () {
  console.log('c_OUTSIDE_TYP_OUT script3');
expj.common.pscript.setMaskToReferenceComponent('AD0030030', 'AD0030030form1', '_VEND_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;SET;_VEND_CD=,_VEND_ANAME="
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_OUT.child2 = function () {
  console.log('c_OUTSIDE_TYP_OUT script4');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_VEND_CD', '');
expj.common.pscript.setReferenceComponentValue('AD0030030', 'AD0030030form1', '_VEND_ANAME', '');
};
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_OUT.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_OUT['onClick' + i])) {
        expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_OUT['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_OUT.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/c_OUTSIDE_TYP_OUT.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_OUT.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-c_OUTSIDE_TYP_OUT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030form1', 'c_OUTSIDE_TYP_OUT', this, 'CheckBox');
    }
  });
  expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_OUT.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_OUT.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/c_OUTSIDE_TYP_OUT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-c_OUTSIDE_TYP_OUT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c_OUTSIDE_TYP_OUT" value="true" <%= ("true".equals(TypeConverter.convert(aAD0030030Struct.getc_OUTSIDE_TYP_OUT())) || "".equals(TypeConverter.convert(aAD0030030Struct.getc_OUTSIDE_TYP_OUT())))?"checked=\"checked\"": "" %> class="AD0030030-focus-move" id="expj-AD0030030-AD0030030form1-c_OUTSIDE_TYP_OUT"><label for="expj-AD0030030-AD0030030form1-c_OUTSIDE_TYP_OUT"><%=CoreTools.getRBString("Expj.Cmt0416",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-ITEM_CD">
expj.AD0030030.AD0030030form1.ITEM_CD = {};
expj.AD0030030.AD0030030form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/ITEM_CD.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030030', 'AD0030030form1', 'ITEM_CD', this);
  });
  expj.AD0030030.AD0030030form1.ITEM_CD.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030030-AD0030030form1-ITEM_CD" name="ITEM_CD" class="AD0030030-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030030Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-PeekerItemCd">
expj.AD0030030.AD0030030form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AD0030030form1/ITEM_CD@<%=contextNo%>"
expj.AD0030030.AD0030030form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0030030';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0030030form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0030030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0030030.AD0030030form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030form1.PeekerItemCd['onClick' + i])) {
        expj.AD0030030.AD0030030form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AD0030030.AD0030030form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AD0030030.AD0030030form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030030-AD0030030form1-PeekerItemCd" class="AD0030030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-ITEM_NAME">
expj.AD0030030.AD0030030form1.ITEM_NAME = {};
expj.AD0030030.AD0030030form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/ITEM_NAME.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030030', 'AD0030030form1', 'ITEM_NAME', this);
  });
  expj.AD0030030.AD0030030form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0030030-AD0030030form1-ITEM_NAME" name="ITEM_NAME" class="AD0030030-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030030Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-WS_CD">
expj.AD0030030.AD0030030form1.WS_CD = {};
expj.AD0030030.AD0030030form1.WS_CD.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/WS_CD.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.WS_CD.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030030', 'AD0030030form1', 'WS_CD', this);
  });
  expj.AD0030030.AD0030030form1.WS_CD.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.WS_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030030-AD0030030form1-WS_CD" name="WS_CD" class="AD0030030-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030030Struct.getWS_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-PeekerWcCd">
expj.AD0030030.AD0030030form1.PeekerWcCd = {};
// script1="onClick;0;PEEKER;_AD0030030form1/WS_CD@<%=contextNo%>"
expj.AD0030030.AD0030030form1.PeekerWcCd.onClick0 = function () {
  console.log('PeekerWcCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0030030';
var parameterValues = 'PeekerWcCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0030030', 'PeekerWcCd', 'SQLPARAM_1', '<%=aAD0030030Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0030030form1/WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0030030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0030030.AD0030030form1.PeekerWcCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030form1.PeekerWcCd['onClick' + i])) {
        expj.AD0030030.AD0030030form1.PeekerWcCd['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030form1.PeekerWcCd.executeAllOnDecision = function () {
};
expj.AD0030030.AD0030030form1.PeekerWcCd.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-PeekerWcCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030form1', 'PeekerWcCd', this, 'Button');
    }
  });
  expj.AD0030030.AD0030030form1.PeekerWcCd.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.PeekerWcCd.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/PeekerWcCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-PeekerWcCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030030-AD0030030form1-PeekerWcCd" class="AD0030030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-WS_NAME">
expj.AD0030030.AD0030030form1.WS_NAME = {};
expj.AD0030030.AD0030030form1.WS_NAME.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/WS_NAME.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.WS_NAME.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030030', 'AD0030030form1', 'WS_NAME', this);
  });
  expj.AD0030030.AD0030030form1.WS_NAME.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0030030-AD0030030form1-WS_NAME" name="WS_NAME" class="AD0030030-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030030Struct.getWS_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-VEND_CD">
expj.AD0030030.AD0030030form1.VEND_CD = {};
expj.AD0030030.AD0030030form1.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/VEND_CD.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.VEND_CD.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030030', 'AD0030030form1', 'VEND_CD', this);
  });
  expj.AD0030030.AD0030030form1.VEND_CD.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030030-AD0030030form1-VEND_CD" name="VEND_CD" class="AD0030030-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030030Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-PeekerVendCd">
expj.AD0030030.AD0030030form1.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_AD0030030form1/VEND_CD@<%=contextNo%>"
expj.AD0030030.AD0030030form1.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0030030';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030030', 'AD0030030form1', '_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_AD0030030form1/VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0030030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0030030.AD0030030form1.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030form1.PeekerVendCd['onClick' + i])) {
        expj.AD0030030.AD0030030form1.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030form1.PeekerVendCd.executeAllOnDecision = function () {
};
expj.AD0030030.AD0030030form1.PeekerVendCd.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030form1', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.AD0030030.AD0030030form1.PeekerVendCd.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030030-AD0030030form1-PeekerVendCd" class="AD0030030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030form1-VEND_ANAME">
expj.AD0030030.AD0030030form1.VEND_ANAME = {};
expj.AD0030030.AD0030030form1.VEND_ANAME.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/VEND_ANAME.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.VEND_ANAME.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-VEND_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030030', 'AD0030030form1', 'VEND_ANAME', this);
  });
  expj.AD0030030.AD0030030form1.VEND_ANAME.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.VEND_ANAME.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/VEND_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-VEND_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0030030-AD0030030form1-VEND_ANAME" name="VEND_ANAME" class="AD0030030-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030030Struct.getVEND_ANAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AD0030030-AD0030030form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030030Struct.getTIME_CTRL()) %>">
<script class="expj-script-AD0030030-AD0030030form1-TIME_CTRL">
expj.AD0030030.AD0030030form1.TIME_CTRL = {};
expj.AD0030030.AD0030030form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AD0030030form1/TIME_CTRL.onDecision');
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
  expj.AD0030030.executeAllOnDecision();
};
expj.AD0030030.AD0030030form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030030', 'AD0030030form1', 'TIME_CTRL', this);
  });
  expj.AD0030030.AD0030030form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AD0030030.AD0030030form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AD0030030form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030form1-TIME_CTRL');
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AD0030030-AD0030030button1">
expj.AD0030030.AD0030030button1 = {};
expj.AD0030030.AD0030030button1.executeAllOnDecision = function () {
  console.log('execute AD0030030button1.onDecision');
};
expj.AD0030030.AD0030030button1.executeOnLoad = function () {
  expj.AD0030030.AD0030030button1.executePScriptOnLoad();
};

expj.AD0030030.AD0030030button1.executePScriptOnLoad = function () {
  console.log('execute AD0030030button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0030030-AD0030030button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0030030-AD0030030button1-UpdateAll">
expj.AD0030030.AD0030030button1.UpdateAll = {};
// script1="onClick;0;CHK;~LEN(_AD0030030form1/OPR_INST_START_TIME)[eq]1[or]~LEN(_AD0030030form1/OPR_INST_START_TIME)[eq]2@!AS00029"
expj.AD0030030.AD0030030button1.UpdateAll.onClick0 = function () {
  console.log('UpdateAll script1');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0030030', 'AD0030030button1', 'AS00029');
}
};
// script2="onClick;1;CHK;~LEN(_AD0030030form1/WORK_ODR_DLV_TIME)[eq]1[or]~LEN(_AD0030030form1/WORK_ODR_DLV_TIME)[eq]2@!AS00027"
expj.AD0030030.AD0030030button1.UpdateAll.onClick1 = function () {
  console.log('UpdateAll script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0030030', 'AD0030030button1', 'AS00027');
}
};
// script3="onClick;2;CHK;~LEN(_AD0030030form1/OPR_INST_START_TIME)[eq]3@*3"
expj.AD0030030.AD0030030button1.UpdateAll.onClick2 = function () {
  console.log('UpdateAll script3');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;3;CHK;[{~CHARAT(_AD0030030form1/OPR_INST_START_TIME:1)}*10+{~CHARAT(_AD0030030form1/OPR_INST_START_TIME:2)}][gte]60@!AS00030"
expj.AD0030030.AD0030030button1.UpdateAll.child3 = function () {
  console.log('UpdateAll script4');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030030', 'AD0030030button1', 'AS00030');
}
};
// script5="onClick;4;CHK;~LEN(_AD0030030form1/WORK_ODR_DLV_TIME)[eq]3@*5"
expj.AD0030030.AD0030030button1.UpdateAll.onClick4 = function () {
  console.log('UpdateAll script5');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;5;CHK;[{~CHARAT(_AD0030030form1/WORK_ODR_DLV_TIME:1)}*10+{~CHARAT(_AD0030030form1/WORK_ODR_DLV_TIME:2)}][gte]60@!AS00028"
expj.AD0030030.AD0030030button1.UpdateAll.child5 = function () {
  console.log('UpdateAll script6');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030030', 'AD0030030button1', 'AS00028');
}
};
// script7="onClick;6;CHK;~LEN(_AD0030030form1/OPR_INST_START_TIME)[eq]4@*7"
expj.AD0030030.AD0030030button1.UpdateAll.onClick6 = function () {
  console.log('UpdateAll script7');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;7;CHK;[{~CHARAT(_AD0030030form1/OPR_INST_START_TIME:0)}*10+{~CHARAT(_AD0030030form1/OPR_INST_START_TIME:1)}][gte]24[or][{~CHARAT(_AD0030030form1/OPR_INST_START_TIME:2)}*10+{~CHARAT(_AD0030030form1/OPR_INST_START_TIME:3)}][gte]60@!AS00030"
expj.AD0030030.AD0030030button1.UpdateAll.child7 = function () {
  console.log('UpdateAll script8');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030030', 'AD0030030button1', 'AS00030');
}
};
// script9="onClick;8;CHK;~LEN(_AD0030030form1/WORK_ODR_DLV_TIME)[eq]4@*9"
expj.AD0030030.AD0030030button1.UpdateAll.onClick8 = function () {
  console.log('UpdateAll script9');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script10="child;9;CHK;[{~CHARAT(_AD0030030form1/WORK_ODR_DLV_TIME:0)}*10+{~CHARAT(_AD0030030form1/WORK_ODR_DLV_TIME:1)}][gte]24[or][{~CHARAT(_AD0030030form1/WORK_ODR_DLV_TIME:2)}*10+{~CHARAT(_AD0030030form1/WORK_ODR_DLV_TIME:3)}][gte]60@!AS00028"
expj.AD0030030.AD0030030button1.UpdateAll.child9 = function () {
  console.log('UpdateAll script10');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030030', 'AD0030030button1', 'AS00028');
}
};
// script11="onClick;10;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0030030form1/*@AD0030030Servlet,,$ZZ07003"
expj.AD0030030.AD0030030button1.UpdateAll.onClick10 = function () {
  console.log('UpdateAll script11');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030030', 'AD0030030button1', '_AD0030030form1/*', 'AD0030030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030030', response);
expj.common.updateBusinessScreenTab('AD0030030', contents);
};
expj.common.pscript.callConfirm('AD0030030', 'AD0030030button1', 'ZZ07003', okEvent);
};
expj.AD0030030.AD0030030button1.UpdateAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 10; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030button1.UpdateAll['onClick' + i])) {
        expj.AD0030030.AD0030030button1.UpdateAll['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030button1.UpdateAll.executeAllOnDecision = function () {
};
expj.AD0030030.AD0030030button1.UpdateAll.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030button1-UpdateAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030button1', 'UpdateAll', this, 'Button');
    }
  });
  expj.AD0030030.AD0030030button1.UpdateAll.executePScriptOnLoad();
};

expj.AD0030030.AD0030030button1.UpdateAll.executePScriptOnLoad = function () {
  console.log('execute AD0030030button1/UpdateAll.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030button1-UpdateAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030030-AD0030030button1-UpdateAll" name="UpdateAll" class="AD0030030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdateAll",rb)%></button><!-- 一括更新ボタン --></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030button1-Select">
expj.AD0030030.AD0030030button1.Select = {};
// script1="onClick;0;CHK;~LEN(_AD0030030form1/OPR_INST_START_TIME)[eq]1[or]~LEN(_AD0030030form1/OPR_INST_START_TIME)[eq]2@!AS00029"
expj.AD0030030.AD0030030button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0030030', 'AD0030030button1', 'AS00029');
}
};
// script2="onClick;1;CHK;~LEN(_AD0030030form1/WORK_ODR_DLV_TIME)[eq]1[or]~LEN(_AD0030030form1/WORK_ODR_DLV_TIME)[eq]2@!AS00027"
expj.AD0030030.AD0030030button1.Select.onClick1 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AD0030030', 'AD0030030button1', 'AS00027');
}
};
// script3="onClick;2;CHK;~LEN(_AD0030030form1/OPR_INST_START_TIME)[eq]3@*3"
expj.AD0030030.AD0030030button1.Select.onClick2 = function () {
  console.log('Select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;3;CHK;[{~CHARAT(_AD0030030form1/OPR_INST_START_TIME:1)}*10+{~CHARAT(_AD0030030form1/OPR_INST_START_TIME:2)}][gte]60@!AS00030"
expj.AD0030030.AD0030030button1.Select.child3 = function () {
  console.log('Select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030030', 'AD0030030button1', 'AS00030');
}
};
// script5="onClick;4;CHK;~LEN(_AD0030030form1/WORK_ODR_DLV_TIME)[eq]3@*5"
expj.AD0030030.AD0030030button1.Select.onClick4 = function () {
  console.log('Select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;5;CHK;[{~CHARAT(_AD0030030form1/WORK_ODR_DLV_TIME:1)}*10+{~CHARAT(_AD0030030form1/WORK_ODR_DLV_TIME:2)}][gte]60@!AS00028"
expj.AD0030030.AD0030030button1.Select.child5 = function () {
  console.log('Select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030030', 'AD0030030button1', 'AS00028');
}
};
// script7="onClick;6;CHK;~LEN(_AD0030030form1/OPR_INST_START_TIME)[eq]4@*7"
expj.AD0030030.AD0030030button1.Select.onClick6 = function () {
  console.log('Select script7');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;7;CHK;[{~CHARAT(_AD0030030form1/OPR_INST_START_TIME:0)}*10+{~CHARAT(_AD0030030form1/OPR_INST_START_TIME:1)}][gte]24[or][{~CHARAT(_AD0030030form1/OPR_INST_START_TIME:2)}*10+{~CHARAT(_AD0030030form1/OPR_INST_START_TIME:3)}][gte]60@!AS00030"
expj.AD0030030.AD0030030button1.Select.child7 = function () {
  console.log('Select script8');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/OPR_INST_START_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030030', 'AD0030030button1', 'AS00030');
}
};
// script9="onClick;8;CHK;~LEN(_AD0030030form1/WORK_ODR_DLV_TIME)[eq]4@*9"
expj.AD0030030.AD0030030button1.Select.onClick8 = function () {
  console.log('Select script9');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script10="child;9;CHK;[{~CHARAT(_AD0030030form1/WORK_ODR_DLV_TIME:0)}*10+{~CHARAT(_AD0030030form1/WORK_ODR_DLV_TIME:1)}][gte]24[or][{~CHARAT(_AD0030030form1/WORK_ODR_DLV_TIME:2)}*10+{~CHARAT(_AD0030030form1/WORK_ODR_DLV_TIME:3)}][gte]60@!AS00028"
expj.AD0030030.AD0030030button1.Select.child9 = function () {
  console.log('Select script10');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030030', 'AD0030030button1', '_AD0030030form1/WORK_ODR_DLV_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AD0030030', 'AD0030030button1', 'AS00028');
}
};
// script11="onClick;10;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0030030form1/*@AD0030030Servlet"
expj.AD0030030.AD0030030button1.Select.onClick10 = function () {
  console.log('Select script11');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030030', 'AD0030030button1', '_AD0030030form1/*', 'AD0030030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030030', response);
expj.common.updateBusinessScreenTab('AD0030030', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0030030.AD0030030button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 10; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030button1.Select['onClick' + i])) {
        expj.AD0030030.AD0030030button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030button1.Select.executeAllOnDecision = function () {
};
expj.AD0030030.AD0030030button1.Select.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030button1', 'Select', this, 'Button');
    }
  });
  expj.AD0030030.AD0030030button1.Select.executePScriptOnLoad();
};

expj.AD0030030.AD0030030button1.Select.executePScriptOnLoad = function () {
  console.log('execute AD0030030button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030030-AD0030030button1-Select" name="Select" class="AD0030030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段一覧用のDataGridを配置する。↓ --><script class="expj-script-AD0030030-AD0030030view1">
expj.AD0030030.AD0030030view1 = {};
expj.AD0030030.AD0030030view1.executeAllOnClick = function () {
};
expj.AD0030030.AD0030030view1.executeAllOnDecision = function () {
  console.log('execute AD0030030view1.onDecision');
};
expj.AD0030030.AD0030030view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AD0030030view1", "expj.AD0030030.AD0030030view1.executeAllOnClick");
%>
  expj.AD0030030.AD0030030view1.executePScriptOnLoad();
};

expj.AD0030030.AD0030030view1.executePScriptOnLoad = function () {
  console.log('execute AD0030030view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AD0030030-AD0030030view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AD0030030view1_Id = "AD0030030view1";
 String AD0030030view1_select = "single";
 String AD0030030view1_sortable = "true";
 String AD0030030view1_resize = "true";
 String AD0030030view1_scroll = "true";
 StringBuffer AD0030030view1_HB = new StringBuffer();
 StringBuffer AD0030030view1_DB = new StringBuffer();
%>
<%
 AD0030030view1_select = "multi";
 AD0030030view1_sortable = "true";
 AD0030030view1_resize = "true";
 AD0030030view1_scroll = "true";
%>
<%
 AD0030030view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
%>
     
<%
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_RSLT_TYP",rb))).append("', 'name':'OPR_RSLT_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_ODR_CD",rb))).append("', 'name':'WORK_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_IN_PROC_CD",rb))).append("', 'name':'WORK_IN_PROC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NAME",rb))).append("', 'name':'PROC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NO",rb))).append("', 'name':'PROC_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_CD",rb))).append("', 'name':'OPR_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb))).append("', 'name':'OUTSIDE_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_CD",rb))).append("', 'name':'l_WS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_NAME",rb))).append("', 'name':'WS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'l_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_ANAME",rb))).append("', 'name':'l_VEND_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_START_DATE",rb))).append("', 'name':'l_OPR_INST_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_3",rb))).append("', 'name':'l_WORK_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_QTY",rb))).append("', 'name':'OPR_INST_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_IN_PROC_COMMENT_3",rb))).append("', 'name':'WORK_IN_PROC_COMMENT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
AD0030030view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0030030view1_sortable).append("}").append(",");
%>
<%
 int aAD0030030StructLength = aAD0030030Control.getListsize();
 final AD0030030Struct structBackup = aAD0030030Struct;
 aAD0030030Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAD0030030StructLength; ++loopCount) {
  if((aAD0030030Struct = (AD0030030Struct) aAD0030030Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAD0030030Struct", aAD0030030Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AD0030030view1_DB.append("[");
 AD0030030view1_DB.append(loopCount);
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-OPR_RSLT_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-OPR_RSLT_TYP_DN\" data-name=\"OPR_RSLT_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getOPR_RSLT_TYP_DN())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-WORK_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-WORK_ODR_CD\" data-name=\"WORK_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getWORK_ODR_CD())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-WORK_IN_PROC_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-WORK_IN_PROC_CD\" data-name=\"WORK_IN_PROC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getWORK_IN_PROC_CD())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-PROC_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-PROC_NAME\" data-name=\"PROC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getPROC_NAME())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-PROC_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-PROC_NO\" data-name=\"PROC_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER_Z;6;;\">").append(TypeConverter.sanitizer(aAD0030030Struct.getPROC_NO())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-OPR_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-OPR_INST_CD\" data-name=\"OPR_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getOPR_INST_CD())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getl_ITEM_CD())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getITEM_NAME())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-OUTSIDE_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-OUTSIDE_TYP_DN\" data-name=\"OUTSIDE_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getOUTSIDE_TYP_DN())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-l_WS_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-l_WS_CD\" data-name=\"l_WS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getl_WS_CD())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-WS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-WS_NAME\" data-name=\"WS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getWS_NAME())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-l_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-l_VEND_CD\" data-name=\"l_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getl_VEND_CD())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-l_VEND_ANAME-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-l_VEND_ANAME\" data-name=\"l_VEND_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getl_VEND_ANAME())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getl_JOB_ODR_CD())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-l_OPR_INST_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-l_OPR_INST_START_DATE\" data-name=\"l_OPR_INST_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getl_OPR_INST_START_DATE())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-l_WORK_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-l_WORK_ODR_DLV_DATE\" data-name=\"l_WORK_ODR_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getl_WORK_ODR_DLV_DATE())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-OPR_INST_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-OPR_INST_QTY\" data-name=\"OPR_INST_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aAD0030030Struct.getOPR_INST_QTY())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-WORK_IN_PROC_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-WORK_IN_PROC_COMMENT\" data-name=\"WORK_IN_PROC_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.getWORK_IN_PROC_COMMENT())).append("</span>'");
 AD0030030view1_DB.append(",").append("'<span id=\"expj-AD0030030-AD0030030view1-h_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AD0030030-AD0030030view1-h_MODIFY_COUNT\" data-name=\"h_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0030030Struct.geth_MODIFY_COUNT())).append("</span>'");
 AD0030030view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAD0030030StructLength) {
   AD0030030view1_DB.append(",");
  }
 }
 aAD0030030Struct = structBackup;
 viewIdList.add(AD0030030view1_Id);
 viewSelectList.add(AD0030030view1_select);
 viewResizeList.add(AD0030030view1_resize);
 viewScrollList.add(AD0030030view1_scroll);
 viewHeaderDataList.add(AD0030030view1_HB);
 viewBodyDataList.add(AD0030030view1_DB);
%>
<%
}
%>
<!-- ここに下段一覧用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AD0030030-AD0030030button2">
expj.AD0030030.AD0030030button2 = {};
expj.AD0030030.AD0030030button2.executeAllOnDecision = function () {
  console.log('execute AD0030030button2.onDecision');
};
expj.AD0030030.AD0030030button2.executeOnLoad = function () {
  expj.AD0030030.AD0030030button2.executePScriptOnLoad();
};

expj.AD0030030.AD0030030button2.executePScriptOnLoad = function () {
  console.log('execute AD0030030button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0030030-AD0030030button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0030030-AD0030030button2-UpdateAssort">
expj.AD0030030.AD0030030button2.UpdateAssort = {};
// script1="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0030030form1/*,_AD0030030view1/+@AD0030030Servlet,,$ZZ07003"
expj.AD0030030.AD0030030button2.UpdateAssort.onClick1 = function () {
  console.log('UpdateAssort script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030030', 'AD0030030button2', '_AD0030030form1/*,_AD0030030view1/+', 'AD0030030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030030', response);
expj.common.updateBusinessScreenTab('AD0030030', contents);
};
expj.common.pscript.callConfirm('AD0030030', 'AD0030030button2', 'ZZ07003', okEvent);
};
expj.AD0030030.AD0030030button2.UpdateAssort.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030button2.UpdateAssort['onClick' + i])) {
        expj.AD0030030.AD0030030button2.UpdateAssort['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030button2.UpdateAssort.executeAllOnDecision = function () {
};
expj.AD0030030.AD0030030button2.UpdateAssort.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030button2-UpdateAssort').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030button2', 'UpdateAssort', this, 'Button');
    }
  });
  expj.AD0030030.AD0030030button2.UpdateAssort.executePScriptOnLoad();
};

expj.AD0030030.AD0030030button2.UpdateAssort.executePScriptOnLoad = function () {
  console.log('execute AD0030030button2/UpdateAssort.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030button2-UpdateAssort');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030030-AD0030030button2-UpdateAssort" name="UpdateAssort" class="AD0030030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdateAssort",rb)%></button><!-- 選択更新ボタン --></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030button2-CheckAll">
expj.AD0030030.AD0030030button2.CheckAll = {};
// script1="onClick;0;DGSALL;AD0030030view1"
expj.AD0030030.AD0030030button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('AD0030030', 'AD0030030view1');
};
expj.AD0030030.AD0030030button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030button2.CheckAll['onClick' + i])) {
        expj.AD0030030.AD0030030button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030button2.CheckAll.executeAllOnDecision = function () {
};
expj.AD0030030.AD0030030button2.CheckAll.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030button2', 'CheckAll', this, 'Button');
    }
  });
  expj.AD0030030.AD0030030button2.CheckAll.executePScriptOnLoad();
};

expj.AD0030030.AD0030030button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute AD0030030button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030030-AD0030030button2-CheckAll" name="CheckAll" class="AD0030030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030button2-CheckClear">
expj.AD0030030.AD0030030button2.CheckClear = {};
// script1="onClick;0;DGSCANCEL;AD0030030view1"
expj.AD0030030.AD0030030button2.CheckClear.onClick0 = function () {
  console.log('CheckClear script1');
expj.common.pscript.unselectVIEWAllRow('AD0030030', 'AD0030030view1');
};
expj.AD0030030.AD0030030button2.CheckClear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030button2.CheckClear['onClick' + i])) {
        expj.AD0030030.AD0030030button2.CheckClear['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030button2.CheckClear.executeAllOnDecision = function () {
};
expj.AD0030030.AD0030030button2.CheckClear.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030button2-CheckClear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030button2', 'CheckClear', this, 'Button');
    }
  });
  expj.AD0030030.AD0030030button2.CheckClear.executePScriptOnLoad();
};

expj.AD0030030.AD0030030button2.CheckClear.executePScriptOnLoad = function () {
  console.log('execute AD0030030button2/CheckClear.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030button2-CheckClear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030030-AD0030030button2-CheckClear" name="CheckClear" class="AD0030030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AD0030030 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AD0030030-AD0030030button0">
expj.AD0030030.AD0030030button0 = {};
expj.AD0030030.AD0030030button0.executeAllOnDecision = function () {
  console.log('execute AD0030030button0.onDecision');
};
expj.AD0030030.AD0030030button0.executeOnLoad = function () {
  expj.AD0030030.AD0030030button0.executePScriptOnLoad();
};

expj.AD0030030.AD0030030button0.executePScriptOnLoad = function () {
  console.log('execute AD0030030button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0030030-AD0030030button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0030030-AD0030030button0-Clear">
expj.AD0030030.AD0030030button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0030030form1/*@AD0030030Servlet,,$ZZ07008"
expj.AD0030030.AD0030030button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030030', 'AD0030030button0', '_AD0030030form1/*', 'AD0030030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030030', response);
expj.common.updateBusinessScreenTab('AD0030030', contents);
};
expj.common.pscript.callConfirm('AD0030030', 'AD0030030button0', 'ZZ07008', okEvent);
};
expj.AD0030030.AD0030030button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030button0.Clear['onClick' + i])) {
        expj.AD0030030.AD0030030button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030button0.Clear.executeAllOnDecision = function () {
};
expj.AD0030030.AD0030030button0.Clear.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030button0', 'Clear', this, 'Button');
    }
  });
  expj.AD0030030.AD0030030button0.Clear.executePScriptOnLoad();
};

expj.AD0030030.AD0030030button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AD0030030button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030030-AD0030030button0-Clear" name="Clear" class="AD0030030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AD0030030-AD0030030button0-Close">
expj.AD0030030.AD0030030button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AD0030030.AD0030030button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AD0030030');
};
expj.AD0030030.AD0030030button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030030.AD0030030button0.Close['onClick' + i])) {
        expj.AD0030030.AD0030030button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AD0030030.AD0030030button0.Close.executeAllOnDecision = function () {
};
expj.AD0030030.AD0030030button0.Close.executeOnLoad = function () {
  $('#expj-AD0030030-AD0030030button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030030', 'AD0030030button0', 'Close', this, 'Button');
    }
  });
  expj.AD0030030.AD0030030button0.Close.executePScriptOnLoad();
};

expj.AD0030030.AD0030030button0.Close.executePScriptOnLoad = function () {
  console.log('execute AD0030030button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AD0030030-AD0030030button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030030-AD0030030button0-Close" name="Close" class="AD0030030-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0030030 (END)-->
<%
MessageStruct msgStruct = aAD0030030Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0030030-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0030030)) {
  expj.common.treeInstanceMap.AD0030030 = {};
}
expj.common.treeInstanceMap.AD0030030.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0030030.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0030030.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0030030.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0030030.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0030030.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0030030.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0030030.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0030030.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0030030-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0030030-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030030)) {
  expj.common.detailDialogMap.AD0030030 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030030._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0030030._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030030.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0030030.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030030.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0030030.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030030.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0030030.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0030030.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0030030.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0030030-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0030030.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0030030-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0030030.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0030030-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0030030.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0030030.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0030030.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0030030._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0030030-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0030030)) {
  expj.common.viewInstanceMap.AD0030030 = {};
}
expj.common.viewInstanceMap.AD0030030.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0030030.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0030030.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0030030.<%=viewId %>.init = function () {
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
    expj.AD0030030.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0030030.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0030030-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0030030-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0030030_init">
/**
 * AD0030030用のロード完了時初期化関数
 */
expj.AD0030030.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0030030');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0030030');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0030030');
  expj.common.calendarInstanceMap.AD0030030 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0030030.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0030030.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0030030.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0030030.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0030030.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0030030');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0030030');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0030030-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0030030-<%=detailId %>');
<%
 }
%>
  try{expj.AD0030030.AD0030030form1.OPR_INST_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.CalendarOprInstStartDate.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.OPR_INST_START_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.r1_FILTER1.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.c_OUTPUT_RSLT.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.WORK_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.CalendarPrdDueDate.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.WORK_ODR_DLV_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.r2_FILTER1.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_IN.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.PeekerJOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.c_OUTSIDE_TYP_OUT.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.WS_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.PeekerWcCd.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.VEND_ANAME.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030button1.UpdateAll.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030button1.Select.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030button2.UpdateAssort.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030button2.CheckClear.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030button0.Close.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030form1.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030button1.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030view1.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030button2.executeOnLoad();}catch(e){};
  try{expj.AD0030030.AD0030030button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0030030.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0030030', 'AD0030030');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0030030');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0030030-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0030030-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0030030', '<%=request.getContextPath() %>');
};

/**
 * AD0030030の全体onDecision処理
 */
expj.AD0030030.executeAllOnDecision = function () {
  expj.AD0030030.AD0030030form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0030030_console">
expj.AD0030030.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>