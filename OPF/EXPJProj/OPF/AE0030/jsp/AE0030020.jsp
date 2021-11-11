<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:34:06 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AE0030\AE0030020.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0030.*" %>
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
<jsp:useBean id="aAE0030020Control" class="com.nec.jp.orteus.metamorBase.AE0030.AE0030020Control" scope="request"/>
<jsp:useBean id="aAE0030020Struct" class="com.nec.jp.orteus.metamorBase.AE0030.AE0030020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

注文書発行
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0030/jsp/AE0030020.jsp,v $
$Author: geng-jia $
$Revision: 1.25 $　$Date: 2017/02/22 02:05:08 $
********************************************************* --%>
<html>
<head>
<title>注文書発行</title>
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
<script class="expj-script-AE0030020_init">
  // AE0030020名前空間
  expj.AE0030020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AE0030020" data-screen="AE0030020" data-newdata="<%=aAE0030020Control.isNewData() %>">
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
              <script class="expj-script-AE0030020-AE0030020form1">
expj.AE0030020.AE0030020form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5"
expj.AE0030020.AE0030020form1.onLoad0 = function () {
  console.log('AE0030020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script2="onDecision;0;CHK;_r1_FILTER1[eq]true@*0,*1"
expj.AE0030020.AE0030020form1.onDecision0 = function () {
  console.log('AE0030020form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_r1_FILTER1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;CHKRQ;A,B@*2,*3"
expj.AE0030020.AE0030020form1.child0 = function () {
  console.log('AE0030020form1 script3');
if (expj.common.pscript.satisfiedRequiredComponent('AE0030020', 'A') && expj.common.pscript.satisfiedRequiredComponent('AE0030020', 'B')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;1;CHKRQ;A,C@*2,*3"
expj.AE0030020.AE0030020form1.child1 = function () {
  console.log('AE0030020form1 script4');
if (expj.common.pscript.satisfiedRequiredComponent('AE0030020', 'A') && expj.common.pscript.satisfiedRequiredComponent('AE0030020', 'C')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;2;UNMASK;_AE0030020button1/Select@*18"
expj.AE0030020.AE0030020form1.child2 = function () {
  console.log('AE0030020form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020button1/Select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child18)){this.child18();}}
};
// script6="child;3;MASK;_AE0030020button1/Select,_AE0030020button0/Print,_AE0030020button0/PartialSlipOutput"
expj.AE0030020.AE0030020form1.child3 = function () {
  console.log('AE0030020form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020button1/Select');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020button0/Print');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020button0/PartialSlipOutput');
};
// script11="onDecision;1;CHK;?PLANT_CD[eq]SAME[and]?r1_FILTER1[eq]SAME[and]?PUCH_ODR_START_DATE[eq]SAME[and]?r2_FILTER1[eq]SAME[and]?PUCH_ODR_DLV_DATE[eq]SAME[and]?r1_FILTER2[eq]SAME[and]?PUCH_ODR_CD[eq]SAME[and]?r2_FILTER2[eq]SAME[and]?r1_FILTER3[eq]SAME[and]?r2_FILTER3[eq]SAME[and]?JOB_ODR_CD[eq]SAME[and]?VEND_CD[eq]SAME[and]?PUCH_ODR_PERSON[eq]SAME[and]?ReOutputFlag[eq]SAME[and]?AE0030020form1/*[eq]NORMAL@*4,*5"
expj.AE0030020.AE0030020form1.onDecision1 = function () {
  console.log('AE0030020form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?r1_FILTER1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?PUCH_ODR_START_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?r2_FILTER1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?PUCH_ODR_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?r1_FILTER2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?r2_FILTER2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?r1_FILTER3'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?r2_FILTER3'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?PUCH_ODR_PERSON'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?ReOutputFlag'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '?AE0030020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script12="child;4;UNMASK;_AE0030020button2/CheckAll,_AE0030020button2/UncheckAll"
expj.AE0030020.AE0030020form1.child4 = function () {
  console.log('AE0030020form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020button2/UncheckAll');
};
// script13="child;5;MASK;_AE0030020button2/CheckAll,_AE0030020button2/UncheckAll"
expj.AE0030020.AE0030020form1.child5 = function () {
  console.log('AE0030020form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020button2/UncheckAll');
};
// script14="onDecision;2;CHK;_r1_FILTER1[eq]true@*6,*8"
expj.AE0030020.AE0030020form1.onDecision2 = function () {
  console.log('AE0030020form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_r1_FILTER1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script15="child;6;UNMASK;_PUCH_ODR_START_DATE,_CalendarPuchOdrStartDate,_PUCH_ODR_START_TIME@*7"
expj.AE0030020.AE0030020form1.child6 = function () {
  console.log('AE0030020form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PUCH_ODR_START_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_CalendarPuchOdrStartDate');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PUCH_ODR_START_TIME');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script16="child;7;MASK;_PUCH_ODR_DLV_DATE,_CalendarPuchOdrDlvDate,_PUCH_ODR_DLV_TIME"
expj.AE0030020.AE0030020form1.child7 = function () {
  console.log('AE0030020form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PUCH_ODR_DLV_DATE');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_CalendarPuchOdrDlvDate');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PUCH_ODR_DLV_TIME');
};
// script17="child;8;UNMASK;_PUCH_ODR_DLV_DATE,_CalendarPuchOdrDlvDate,_PUCH_ODR_DLV_TIME@*9"
expj.AE0030020.AE0030020form1.child8 = function () {
  console.log('AE0030020form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PUCH_ODR_DLV_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_CalendarPuchOdrDlvDate');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PUCH_ODR_DLV_TIME');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script18="child;9;MASK;_PUCH_ODR_START_DATE,_CalendarPuchOdrStartDate,_PUCH_ODR_START_TIME"
expj.AE0030020.AE0030020form1.child9 = function () {
  console.log('AE0030020form1 script18');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PUCH_ODR_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_CalendarPuchOdrStartDate');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PUCH_ODR_START_TIME');
};
// script19="onDecision;3;CHK;_r1_FILTER2[eq]true@*10,*12"
expj.AE0030020.AE0030020form1.onDecision3 = function () {
  console.log('AE0030020form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_r1_FILTER2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script20="child;10;UNMASK;_PUCH_ODR_CD,_PeekerPuchOdrDd@*11"
expj.AE0030020.AE0030020form1.child10 = function () {
  console.log('AE0030020form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PUCH_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PeekerPuchOdrDd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script21="child;11;MASK;_JOB_ODR_CD,_PeekerJOB_ODR_CD"
expj.AE0030020.AE0030020form1.child11 = function () {
  console.log('AE0030020form1 script21');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PeekerJOB_ODR_CD');
};
// script22="child;12;UNMASK;_JOB_ODR_CD,_PeekerJOB_ODR_CD@*13"
expj.AE0030020.AE0030020form1.child12 = function () {
  console.log('AE0030020form1 script22');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PeekerJOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child13)){this.child13();}}
};
// script23="child;13;MASK;_PUCH_ODR_CD,_PeekerPuchOdrDd"
expj.AE0030020.AE0030020form1.child13 = function () {
  console.log('AE0030020form1 script23');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PUCH_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PeekerPuchOdrDd');
};
// script24="onDecision;4;CHK;_r1_FILTER1[eq]true[and]_AE0030020form1/TIME_CTRL[eq]true@*14,*15"
expj.AE0030020.AE0030020form1.onDecision4 = function () {
  console.log('AE0030020form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_r1_FILTER1'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_AE0030020form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script25="child;14;UNMASK;_PUCH_ODR_START_TIME"
expj.AE0030020.AE0030020form1.child14 = function () {
  console.log('AE0030020form1 script25');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PUCH_ODR_START_TIME');
};
// script26="child;15;MASK;_PUCH_ODR_START_TIME"
expj.AE0030020.AE0030020form1.child15 = function () {
  console.log('AE0030020form1 script26');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PUCH_ODR_START_TIME');
};
// script27="onDecision;5;CHK;_r2_FILTER1[eq]true[and]_AE0030020form1/TIME_CTRL[eq]true@*16,*17"
expj.AE0030020.AE0030020form1.onDecision5 = function () {
  console.log('AE0030020form1 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_r2_FILTER1'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_AE0030020form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script28="child;16;UNMASK;_PUCH_ODR_DLV_TIME"
expj.AE0030020.AE0030020form1.child16 = function () {
  console.log('AE0030020form1 script28');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PUCH_ODR_DLV_TIME');
};
// script29="child;17;MASK;_PUCH_ODR_DLV_TIME"
expj.AE0030020.AE0030020form1.child17 = function () {
  console.log('AE0030020form1 script29');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_PUCH_ODR_DLV_TIME');
};
// script30="child;18;CHK;_r1_FILTER3[eq]true@*19,*21"
expj.AE0030020.AE0030020form1.child18 = function () {
  console.log('AE0030020form1 script30');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_r1_FILTER3'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script31="child;19;UNMASK;_AE0030020button0/Print@*20"
expj.AE0030020.AE0030020form1.child19 = function () {
  console.log('AE0030020form1 script31');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020button0/Print');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child20)){this.child20();}}
};
// script32="child;20;MASK;_AE0030020button0/PartialSlipOutput"
expj.AE0030020.AE0030020form1.child20 = function () {
  console.log('AE0030020form1 script32');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020button0/PartialSlipOutput');
};
// script33="child;21;UNMASK;_AE0030020button0/PartialSlipOutput@*22"
expj.AE0030020.AE0030020form1.child21 = function () {
  console.log('AE0030020form1 script33');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020button0/PartialSlipOutput');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child22)){this.child22();}}
};
// script34="child;22;MASK;_AE0030020button0/Print"
expj.AE0030020.AE0030020form1.child22 = function () {
  console.log('AE0030020form1 script34');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020button0/Print');
};
expj.AE0030020.AE0030020form1.executeAllOnDecision = function () {
  console.log('execute AE0030020form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020form1['onDecision' + i])) {
        expj.AE0030020.AE0030020form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020form1.executeOnLoad = function () {
  expj.AE0030020.AE0030020form1.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0030020.AE0030020form1['onLoad' + i])) {
      expj.AE0030020.AE0030020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0030020-AE0030020form1" action="AE0030020Servlet" name="AE0030020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0030020Control.getReadStatusString()) %>" style="height:165px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:165px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ISSUE_PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-PLANT_CD">
expj.AE0030020.AE0030020form1.PLANT_CD = {};
expj.AE0030020.AE0030020form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/PLANT_CD.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0030020', 'AE0030020form1', 'PLANT_CD', this);
  });
  expj.AE0030020.AE0030020form1.PLANT_CD.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0030020-AE0030020form1-PLANT_CD" name="PLANT_CD" class="AE0030020-focus-move  required-value expj-AE0030020-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0030020Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-PeekerPlantCd">
expj.AE0030020.AE0030020form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AE0030020form1/PLANT_CD@<%=contextNo%>"
expj.AE0030020.AE0030020form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0030020';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0030020form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0030020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0030020.AE0030020form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020form1.PeekerPlantCd['onClick' + i])) {
        expj.AE0030020.AE0030020form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AE0030020.AE0030020form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AE0030020.AE0030020form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0030020-AE0030020form1-PeekerPlantCd" class="AE0030020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-PLANT_NAME">
expj.AE0030020.AE0030020form1.PLANT_NAME = {};
expj.AE0030020.AE0030020form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/PLANT_NAME.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0030020', 'AE0030020form1', 'PLANT_NAME', this);
  });
  expj.AE0030020.AE0030020form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0030020-AE0030020form1-PLANT_NAME" name="PLANT_NAME" class="AE0030020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0030020Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PUCH_ODR_START_DATE_1",rb)%></span><!-- 発注予定日 --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-PUCH_ODR_START_DATE">
expj.AE0030020.AE0030020form1.PUCH_ODR_START_DATE = {};
// script1="onDecision;0;CHK;_AE0030020form1/TIME_CTRL[eq]true@*0,*1"
expj.AE0030020.AE0030020form1.PUCH_ODR_START_DATE.onDecision0 = function () {
  console.log('PUCH_ODR_START_DATE script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_AE0030020form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;UNMASK;_AE0030020form1/PUCH_ODR_START_TIME"
expj.AE0030020.AE0030020form1.PUCH_ODR_START_DATE.child0 = function () {
  console.log('PUCH_ODR_START_DATE script2');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020form1/PUCH_ODR_START_TIME');
};
// script3="child;1;MASK;_AE0030020form1/PUCH_ODR_START_TIME"
expj.AE0030020.AE0030020form1.PUCH_ODR_START_DATE.child1 = function () {
  console.log('PUCH_ODR_START_DATE script3');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020form1/PUCH_ODR_START_TIME');
};
expj.AE0030020.AE0030020form1.PUCH_ODR_START_DATE.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/PUCH_ODR_START_DATE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020form1.PUCH_ODR_START_DATE['onDecision' + i])) {
        expj.AE0030020.AE0030020form1.PUCH_ODR_START_DATE['onDecision' + i]();
      }
    }
  }
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.PUCH_ODR_START_DATE.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-PUCH_ODR_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0030020', 'AE0030020form1', 'PUCH_ODR_START_DATE', this);
  });
  expj.AE0030020.AE0030020form1.PUCH_ODR_START_DATE.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.PUCH_ODR_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/PUCH_ODR_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-PUCH_ODR_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0030020-AE0030020form1-PUCH_ODR_START_DATE" name="PUCH_ODR_START_DATE" class="AE0030020-focus-move  required-value expj-AE0030020-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0030020Struct.getPUCH_ODR_START_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-CalendarPuchOdrStartDate">
expj.AE0030020.AE0030020form1.CalendarPuchOdrStartDate = {};
// script1="onClick;0;CALENDAR;_AE0030020form1/PUCH_ODR_START_DATE"
expj.AE0030020.AE0030020form1.CalendarPuchOdrStartDate.onClick0 = function () {
  console.log('CalendarPuchOdrStartDate script1');
expj.common.pscript.executeCalendar('AE0030020','AE0030020form1','_AE0030020form1/PUCH_ODR_START_DATE');
};
expj.AE0030020.AE0030020form1.CalendarPuchOdrStartDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020form1.CalendarPuchOdrStartDate['onClick' + i])) {
        expj.AE0030020.AE0030020form1.CalendarPuchOdrStartDate['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020form1.CalendarPuchOdrStartDate.executeAllOnDecision = function () {
};
expj.AE0030020.AE0030020form1.CalendarPuchOdrStartDate.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-CalendarPuchOdrStartDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020form1', 'CalendarPuchOdrStartDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0030020','AE0030020form1','_AE0030020form1/PUCH_ODR_START_DATE');
  expj.AE0030020.AE0030020form1.CalendarPuchOdrStartDate.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.CalendarPuchOdrStartDate.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/CalendarPuchOdrStartDate.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-CalendarPuchOdrStartDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0030020-AE0030020form1-CalendarPuchOdrStartDate" class="AE0030020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-PUCH_ODR_START_TIME">
expj.AE0030020.AE0030020form1.PUCH_ODR_START_TIME = {};
expj.AE0030020.AE0030020form1.PUCH_ODR_START_TIME.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/PUCH_ODR_START_TIME.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.PUCH_ODR_START_TIME.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-PUCH_ODR_START_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0030020', 'AE0030020form1', 'PUCH_ODR_START_TIME', this);
  });
  expj.AE0030020.AE0030020form1.PUCH_ODR_START_TIME.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.PUCH_ODR_START_TIME.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/PUCH_ODR_START_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-PUCH_ODR_START_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AE0030020-AE0030020form1-PUCH_ODR_START_TIME" name="PUCH_ODR_START_TIME" class="AE0030020-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAE0030020Struct.getPUCH_ODR_START_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-r1_FILTER1">
expj.AE0030020.AE0030020form1.r1_FILTER1 = {};
// script1="onClick;0;SET;_PUCH_ODR_DLV_DATE="
expj.AE0030020.AE0030020form1.r1_FILTER1.onClick0 = function () {
  console.log('r1_FILTER1 script1');
expj.common.pscript.setReferenceComponentValue('AE0030020', 'AE0030020form1', '_PUCH_ODR_DLV_DATE', '');
};
// script2="onClick;1;SET;_PUCH_ODR_DLV_TIME="
expj.AE0030020.AE0030020form1.r1_FILTER1.onClick1 = function () {
  console.log('r1_FILTER1 script2');
expj.common.pscript.setReferenceComponentValue('AE0030020', 'AE0030020form1', '_PUCH_ODR_DLV_TIME', '');
};
expj.AE0030020.AE0030020form1.r1_FILTER1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020form1.r1_FILTER1['onClick' + i])) {
        expj.AE0030020.AE0030020form1.r1_FILTER1['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020form1.r1_FILTER1.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/r1_FILTER1.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.r1_FILTER1.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-r1_FILTER1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020form1', 'r1_FILTER1', this, 'RadioButton');
    }
  });
  expj.AE0030020.AE0030020form1.r1_FILTER1.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.r1_FILTER1.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/r1_FILTER1.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-r1_FILTER1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="FILTER1" data-name="r1_FILTER1" value="true" <%= ("true".equals(TypeConverter.convert(aAE0030020Struct.getr1_FILTER1())))?"checked=\"checked\"":"" %> class="" id="expj-AE0030020-AE0030020form1-r1_FILTER1" ><label for="expj-AE0030020-AE0030020form1-r1_FILTER1"><%=CoreTools.getRBString("Expj.Cmt0502",rb)%></label></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-r1_FILTER3">
expj.AE0030020.AE0030020form1.r1_FILTER3 = {};
expj.AE0030020.AE0030020form1.r1_FILTER3.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/r1_FILTER3.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.r1_FILTER3.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-r1_FILTER3').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020form1', 'r1_FILTER3', this, 'RadioButton');
    }
  });
  expj.AE0030020.AE0030020form1.r1_FILTER3.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.r1_FILTER3.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/r1_FILTER3.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-r1_FILTER3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="radio" name="FILTER3" data-name="r1_FILTER3" value="true" <%= ("true".equals(TypeConverter.convert(aAE0030020Struct.getr1_FILTER3())))?"checked=\"checked\"":"" %> class="" id="expj-AE0030020-AE0030020form1-r1_FILTER3" ><label for="expj-AE0030020-AE0030020form1-r1_FILTER3"><%=CoreTools.getRBString("Expj.Cmt6214",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AE0030020-AE0030020form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0030020Struct.getTIME_CTRL()) %>">
<script class="expj-script-AE0030020-AE0030020form1-TIME_CTRL">
expj.AE0030020.AE0030020form1.TIME_CTRL = {};
expj.AE0030020.AE0030020form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/TIME_CTRL.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0030020', 'AE0030020form1', 'TIME_CTRL', this);
  });
  expj.AE0030020.AE0030020form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PUCH_ODR_DLV_DATE",rb)%></span><!-- 発注納期 --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-PUCH_ODR_DLV_DATE">
expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_DATE = {};
// script1="onDecision;0;CHK;_AE0030020form1/TIME_CTRL[eq]true@*0,*1"
expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_DATE.onDecision0 = function () {
  console.log('PUCH_ODR_DLV_DATE script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_AE0030020form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;UNMASK;_AE0030020form1/PUCH_ODR_DLV_TIME"
expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_DATE.child0 = function () {
  console.log('PUCH_ODR_DLV_DATE script2');
expj.common.pscript.setUnMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020form1/PUCH_ODR_DLV_TIME');
};
// script3="child;1;MASK;_AE0030020form1/PUCH_ODR_DLV_TIME"
expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_DATE.child1 = function () {
  console.log('PUCH_ODR_DLV_DATE script3');
expj.common.pscript.setMaskToReferenceComponent('AE0030020', 'AE0030020form1', '_AE0030020form1/PUCH_ODR_DLV_TIME');
};
expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/PUCH_ODR_DLV_DATE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_DATE['onDecision' + i])) {
        expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_DATE['onDecision' + i]();
      }
    }
  }
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-PUCH_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0030020', 'AE0030020form1', 'PUCH_ODR_DLV_DATE', this);
  });
  expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/PUCH_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-PUCH_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0030020-AE0030020form1-PUCH_ODR_DLV_DATE" name="PUCH_ODR_DLV_DATE" class="AE0030020-focus-move  required-value expj-AE0030020-required-C" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0030020Struct.getPUCH_ODR_DLV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-CalendarPuchOdrDlvDate">
expj.AE0030020.AE0030020form1.CalendarPuchOdrDlvDate = {};
// script1="onClick;0;CALENDAR;_AE0030020form1/PUCH_ODR_DLV_DATE"
expj.AE0030020.AE0030020form1.CalendarPuchOdrDlvDate.onClick0 = function () {
  console.log('CalendarPuchOdrDlvDate script1');
expj.common.pscript.executeCalendar('AE0030020','AE0030020form1','_AE0030020form1/PUCH_ODR_DLV_DATE');
};
expj.AE0030020.AE0030020form1.CalendarPuchOdrDlvDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020form1.CalendarPuchOdrDlvDate['onClick' + i])) {
        expj.AE0030020.AE0030020form1.CalendarPuchOdrDlvDate['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020form1.CalendarPuchOdrDlvDate.executeAllOnDecision = function () {
};
expj.AE0030020.AE0030020form1.CalendarPuchOdrDlvDate.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-CalendarPuchOdrDlvDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020form1', 'CalendarPuchOdrDlvDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0030020','AE0030020form1','_AE0030020form1/PUCH_ODR_DLV_DATE');
  expj.AE0030020.AE0030020form1.CalendarPuchOdrDlvDate.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.CalendarPuchOdrDlvDate.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/CalendarPuchOdrDlvDate.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-CalendarPuchOdrDlvDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0030020-AE0030020form1-CalendarPuchOdrDlvDate" class="AE0030020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-PUCH_ODR_DLV_TIME">
expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_TIME = {};
expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_TIME.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/PUCH_ODR_DLV_TIME.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_TIME.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-PUCH_ODR_DLV_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0030020', 'AE0030020form1', 'PUCH_ODR_DLV_TIME', this);
  });
  expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_TIME.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_TIME.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/PUCH_ODR_DLV_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-PUCH_ODR_DLV_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AE0030020-AE0030020form1-PUCH_ODR_DLV_TIME" name="PUCH_ODR_DLV_TIME" class="AE0030020-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAE0030020Struct.getPUCH_ODR_DLV_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-r2_FILTER1">
expj.AE0030020.AE0030020form1.r2_FILTER1 = {};
// script1="onClick;0;SET;_PUCH_ODR_START_DATE="
expj.AE0030020.AE0030020form1.r2_FILTER1.onClick0 = function () {
  console.log('r2_FILTER1 script1');
expj.common.pscript.setReferenceComponentValue('AE0030020', 'AE0030020form1', '_PUCH_ODR_START_DATE', '');
};
// script2="onClick;1;SET;_PUCH_ODR_START_TIME="
expj.AE0030020.AE0030020form1.r2_FILTER1.onClick1 = function () {
  console.log('r2_FILTER1 script2');
expj.common.pscript.setReferenceComponentValue('AE0030020', 'AE0030020form1', '_PUCH_ODR_START_TIME', '');
};
expj.AE0030020.AE0030020form1.r2_FILTER1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020form1.r2_FILTER1['onClick' + i])) {
        expj.AE0030020.AE0030020form1.r2_FILTER1['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020form1.r2_FILTER1.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/r2_FILTER1.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.r2_FILTER1.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-r2_FILTER1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020form1', 'r2_FILTER1', this, 'RadioButton');
    }
  });
  expj.AE0030020.AE0030020form1.r2_FILTER1.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.r2_FILTER1.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/r2_FILTER1.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-r2_FILTER1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="FILTER1" data-name="r2_FILTER1" value="true" <%= ("true".equals(TypeConverter.convert(aAE0030020Struct.getr2_FILTER1())))?"checked=\"checked\"":"" %> class="" id="expj-AE0030020-AE0030020form1-r2_FILTER1" ><label for="expj-AE0030020-AE0030020form1-r2_FILTER1"><%=CoreTools.getRBString("Expj.Cmt0503",rb)%></label></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-r2_FILTER3">
expj.AE0030020.AE0030020form1.r2_FILTER3 = {};
expj.AE0030020.AE0030020form1.r2_FILTER3.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/r2_FILTER3.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.r2_FILTER3.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-r2_FILTER3').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020form1', 'r2_FILTER3', this, 'RadioButton');
    }
  });
  expj.AE0030020.AE0030020form1.r2_FILTER3.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.r2_FILTER3.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/r2_FILTER3.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-r2_FILTER3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="radio" name="FILTER3" data-name="r2_FILTER3" value="true" <%= ("true".equals(TypeConverter.convert(aAE0030020Struct.getr2_FILTER3())))?"checked=\"checked\"":"" %> class="" id="expj-AE0030020-AE0030020form1-r2_FILTER3" ><label for="expj-AE0030020-AE0030020form1-r2_FILTER3"><%=CoreTools.getRBString("Expj.Cmt6215",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_CD",rb)%></span><!-- 発注番号 --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-PUCH_ODR_CD">
expj.AE0030020.AE0030020form1.PUCH_ODR_CD = {};
expj.AE0030020.AE0030020form1.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/PUCH_ODR_CD.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0030020', 'AE0030020form1', 'PUCH_ODR_CD', this);
  });
  expj.AE0030020.AE0030020form1.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0030020-AE0030020form1-PUCH_ODR_CD" name="PUCH_ODR_CD" class="AE0030020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0030020Struct.getPUCH_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-PeekerPuchOdrDd">
expj.AE0030020.AE0030020form1.PeekerPuchOdrDd = {};
// script1="onClick;0;PEEKER;_AE0030020form1/PUCH_ODR_CD@<%=contextNo%>"
expj.AE0030020.AE0030020form1.PeekerPuchOdrDd.onClick0 = function () {
  console.log('PeekerPuchOdrDd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0030020';
var parameterValues = 'PeekerPuchOdrDd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_PUCH_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PUCH_ODR_CD_08%&%';
parameterValues += 'TARGET_FIELD%=%_AE0030020form1/PUCH_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0030020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0030020.AE0030020form1.PeekerPuchOdrDd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020form1.PeekerPuchOdrDd['onClick' + i])) {
        expj.AE0030020.AE0030020form1.PeekerPuchOdrDd['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020form1.PeekerPuchOdrDd.executeAllOnDecision = function () {
};
expj.AE0030020.AE0030020form1.PeekerPuchOdrDd.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-PeekerPuchOdrDd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020form1', 'PeekerPuchOdrDd', this, 'Button');
    }
  });
  expj.AE0030020.AE0030020form1.PeekerPuchOdrDd.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.PeekerPuchOdrDd.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/PeekerPuchOdrDd.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-PeekerPuchOdrDd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0030020-AE0030020form1-PeekerPuchOdrDd" class="AE0030020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-r1_FILTER2">
expj.AE0030020.AE0030020form1.r1_FILTER2 = {};
// script1="onClick;0;SET;_JOB_ODR_CD="
expj.AE0030020.AE0030020form1.r1_FILTER2.onClick0 = function () {
  console.log('r1_FILTER2 script1');
expj.common.pscript.setReferenceComponentValue('AE0030020', 'AE0030020form1', '_JOB_ODR_CD', '');
};
expj.AE0030020.AE0030020form1.r1_FILTER2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020form1.r1_FILTER2['onClick' + i])) {
        expj.AE0030020.AE0030020form1.r1_FILTER2['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020form1.r1_FILTER2.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/r1_FILTER2.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.r1_FILTER2.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-r1_FILTER2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020form1', 'r1_FILTER2', this, 'RadioButton');
    }
  });
  expj.AE0030020.AE0030020form1.r1_FILTER2.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.r1_FILTER2.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/r1_FILTER2.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-r1_FILTER2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="FILTER2" data-name="r1_FILTER2" value="true" <%= ("true".equals(TypeConverter.convert(aAE0030020Struct.getr1_FILTER2())))?"checked=\"checked\"":"" %> class="" id="expj-AE0030020-AE0030020form1-r1_FILTER2" ><label for="expj-AE0030020-AE0030020form1-r1_FILTER2"><%=CoreTools.getRBString("Expj.Cmt0504",rb)%></label></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-ReOutputFlag">
expj.AE0030020.AE0030020form1.ReOutputFlag = {};
expj.AE0030020.AE0030020form1.ReOutputFlag.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/ReOutputFlag.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.ReOutputFlag.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-ReOutputFlag').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020form1', 'ReOutputFlag', this, 'CheckBox');
    }
  });
  expj.AE0030020.AE0030020form1.ReOutputFlag.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.ReOutputFlag.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/ReOutputFlag.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-ReOutputFlag');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="ReOutputFlag" value="true" <%= ("true".equals(TypeConverter.convert(aAE0030020Struct.getReOutputFlag())) || "1".equals(TypeConverter.convert(aAE0030020Struct.getReOutputFlag())))?"checked=\"checked\"":"" %>  class="AE0030020-focus-move" id="expj-AE0030020-AE0030020form1-ReOutputFlag"><label for="expj-AE0030020-AE0030020form1-ReOutputFlag"><%=CoreTools.getRBString("Expj.Cmt0203",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-JOB_ODR_CD">
expj.AE0030020.AE0030020form1.JOB_ODR_CD = {};
expj.AE0030020.AE0030020form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/JOB_ODR_CD.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0030020', 'AE0030020form1', 'JOB_ODR_CD', this);
  });
  expj.AE0030020.AE0030020form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0030020-AE0030020form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AE0030020-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAE0030020Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-PeekerJOB_ODR_CD">
expj.AE0030020.AE0030020form1.PeekerJOB_ODR_CD = {};
// script1="onClick;0;PEEKER;_AE0030020form1/JOB_ODR_CD@<%=contextNo%>"
expj.AE0030020.AE0030020form1.PeekerJOB_ODR_CD.onClick0 = function () {
  console.log('PeekerJOB_ODR_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0030020';
var parameterValues = 'PeekerJOB_ODR_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_AE0030020form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_AE0030020form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AE0030020form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0030020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0030020.AE0030020form1.PeekerJOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020form1.PeekerJOB_ODR_CD['onClick' + i])) {
        expj.AE0030020.AE0030020form1.PeekerJOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020form1.PeekerJOB_ODR_CD.executeAllOnDecision = function () {
};
expj.AE0030020.AE0030020form1.PeekerJOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-PeekerJOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020form1', 'PeekerJOB_ODR_CD', this, 'Button');
    }
  });
  expj.AE0030020.AE0030020form1.PeekerJOB_ODR_CD.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.PeekerJOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/PeekerJOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-PeekerJOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0030020-AE0030020form1-PeekerJOB_ODR_CD" class="AE0030020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-r2_FILTER2">
expj.AE0030020.AE0030020form1.r2_FILTER2 = {};
// script1="onClick;0;SET;_PUCH_ODR_CD="
expj.AE0030020.AE0030020form1.r2_FILTER2.onClick0 = function () {
  console.log('r2_FILTER2 script1');
expj.common.pscript.setReferenceComponentValue('AE0030020', 'AE0030020form1', '_PUCH_ODR_CD', '');
};
expj.AE0030020.AE0030020form1.r2_FILTER2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020form1.r2_FILTER2['onClick' + i])) {
        expj.AE0030020.AE0030020form1.r2_FILTER2['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020form1.r2_FILTER2.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/r2_FILTER2.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.r2_FILTER2.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-r2_FILTER2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020form1', 'r2_FILTER2', this, 'RadioButton');
    }
  });
  expj.AE0030020.AE0030020form1.r2_FILTER2.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.r2_FILTER2.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/r2_FILTER2.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-r2_FILTER2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="FILTER2" data-name="r2_FILTER2" value="true" <%= ("true".equals(TypeConverter.convert(aAE0030020Struct.getr2_FILTER2())))?"checked=\"checked\"":"" %> class="" id="expj-AE0030020-AE0030020form1-r2_FILTER2" ><label for="expj-AE0030020-AE0030020form1-r2_FILTER2"><%=CoreTools.getRBString("Expj.Cmt0505",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-VEND_CD">
expj.AE0030020.AE0030020form1.VEND_CD = {};
expj.AE0030020.AE0030020form1.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/VEND_CD.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.VEND_CD.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0030020', 'AE0030020form1', 'VEND_CD', this);
  });
  expj.AE0030020.AE0030020form1.VEND_CD.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0030020-AE0030020form1-VEND_CD" name="VEND_CD" class="AE0030020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0030020Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-PeekerVendCd">
expj.AE0030020.AE0030020form1.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_AE0030020form1/VEND_CD@<%=contextNo%>"
expj.AE0030020.AE0030020form1.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0030020';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020form1', '_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AE0030020form1/VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0030020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0030020.AE0030020form1.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020form1.PeekerVendCd['onClick' + i])) {
        expj.AE0030020.AE0030020form1.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020form1.PeekerVendCd.executeAllOnDecision = function () {
};
expj.AE0030020.AE0030020form1.PeekerVendCd.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020form1', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.AE0030020.AE0030020form1.PeekerVendCd.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0030020-AE0030020form1-PeekerVendCd" class="AE0030020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-VEND_NAME">
expj.AE0030020.AE0030020form1.VEND_NAME = {};
expj.AE0030020.AE0030020form1.VEND_NAME.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/VEND_NAME.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.VEND_NAME.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0030020', 'AE0030020form1', 'VEND_NAME', this);
  });
  expj.AE0030020.AE0030020form1.VEND_NAME.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0030020-AE0030020form1-VEND_NAME" name="VEND_NAME" class="AE0030020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0030020Struct.getVEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_PERSON",rb)%></span><!-- 発注担当者コード --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-PUCH_ODR_PERSON">
expj.AE0030020.AE0030020form1.PUCH_ODR_PERSON = {};
expj.AE0030020.AE0030020form1.PUCH_ODR_PERSON.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/PUCH_ODR_PERSON.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.PUCH_ODR_PERSON.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-PUCH_ODR_PERSON').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0030020', 'AE0030020form1', 'PUCH_ODR_PERSON', this);
  });
  expj.AE0030020.AE0030020form1.PUCH_ODR_PERSON.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.PUCH_ODR_PERSON.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/PUCH_ODR_PERSON.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-PUCH_ODR_PERSON');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0030020-AE0030020form1-PUCH_ODR_PERSON" name="PUCH_ODR_PERSON" class="AE0030020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0030020Struct.getPUCH_ODR_PERSON()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020form1-USER_NAME">
expj.AE0030020.AE0030020form1.USER_NAME = {};
expj.AE0030020.AE0030020form1.USER_NAME.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/USER_NAME.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.USER_NAME.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0030020', 'AE0030020form1', 'USER_NAME', this);
  });
  expj.AE0030020.AE0030020form1.USER_NAME.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0030020-AE0030020form1-USER_NAME" name="USER_NAME" class="AE0030020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0030020Struct.getUSER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AE0030020-AE0030020form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0030020Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AE0030020-AE0030020form1-DOWNLOAD_FILE">
expj.AE0030020.AE0030020form1.DOWNLOAD_FILE = {};
expj.AE0030020.AE0030020form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AE0030020form1/DOWNLOAD_FILE.onDecision');
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
  expj.AE0030020.executeAllOnDecision();
};
expj.AE0030020.AE0030020form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0030020', 'AE0030020form1', 'DOWNLOAD_FILE', this);
  });
  expj.AE0030020.AE0030020form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AE0030020.AE0030020form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AE0030020form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AE0030020-AE0030020button1">
expj.AE0030020.AE0030020button1 = {};
expj.AE0030020.AE0030020button1.executeAllOnDecision = function () {
  console.log('execute AE0030020button1.onDecision');
};
expj.AE0030020.AE0030020button1.executeOnLoad = function () {
  expj.AE0030020.AE0030020button1.executePScriptOnLoad();
};

expj.AE0030020.AE0030020button1.executePScriptOnLoad = function () {
  console.log('execute AE0030020button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0030020-AE0030020button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0030020-AE0030020button1-Select">
expj.AE0030020.AE0030020button1.Select = {};
// script1="onClick;0;CHK;~LEN(_AE0030020form1/PUCH_ODR_START_TIME)[eq]1[or]~LEN(_AE0030020form1/PUCH_ODR_START_TIME)[eq]2@#AS00105"
expj.AE0030020.AE0030020button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_START_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_START_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AE0030020', 'AE0030020button1', 'AS00105');
}
};
// script2="onClick;1;CHK;~LEN(_AE0030020form1/PUCH_ODR_DLV_TIME)[eq]1[or]~LEN(_AE0030020form1/PUCH_ODR_DLV_TIME)[eq]2@#AS00106"
expj.AE0030020.AE0030020button1.Select.onClick1 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_DLV_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_DLV_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AE0030020', 'AE0030020button1', 'AS00106');
}
};
// script3="onClick;2;CHK;_AE0030020form1/TIME_CTRL[eq]true[and]~LEN(_AE0030020form1/PUCH_ODR_START_TIME)[eq]3@*0"
expj.AE0030020.AE0030020button1.Select.onClick2 = function () {
  console.log('Select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button1', '_AE0030020form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script4="onClick;3;CHK;_AE0030020form1/TIME_CTRL[eq]true[and]~LEN(_AE0030020form1/PUCH_ODR_DLV_TIME)[eq]3@*1"
expj.AE0030020.AE0030020button1.Select.onClick3 = function () {
  console.log('Select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button1', '_AE0030020form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script5="onClick;4;CHK;_AE0030020form1/TIME_CTRL[eq]true[and]~LEN(_AE0030020form1/PUCH_ODR_START_TIME)[eq]4@*2"
expj.AE0030020.AE0030020button1.Select.onClick4 = function () {
  console.log('Select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button1', '_AE0030020form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script6="onClick;5;CHK;_AE0030020form1/TIME_CTRL[eq]true[and]~LEN(_AE0030020form1/PUCH_ODR_DLV_TIME)[eq]4@*5"
expj.AE0030020.AE0030020button1.Select.onClick5 = function () {
  console.log('Select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button1', '_AE0030020form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_DLV_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="onClick;6;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0030020form1/*@AE0030020Servlet"
expj.AE0030020.AE0030020button1.Select.onClick6 = function () {
  console.log('Select script7');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0030020', 'AE0030020button1', '_AE0030020form1/*', 'AE0030020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0030020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0030020', response);
expj.common.updateBusinessScreenTab('AE0030020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script8="child;0;CHK;[{~CHARAT(_AE0030020form1/PUCH_ODR_START_TIME:1)}*10+{~CHARAT(_AE0030020form1/PUCH_ODR_START_TIME:2)}][gte]60@#AS00107"
expj.AE0030020.AE0030020button1.Select.child0 = function () {
  console.log('Select script8');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_START_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_START_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0030020', 'AE0030020button1', 'AS00107');
}
};
// script9="child;1;CHK;[{~CHARAT(_AE0030020form1/PUCH_ODR_DLV_TIME:1)}*10+{~CHARAT(_AE0030020form1/PUCH_ODR_DLV_TIME:2)}][gte]60@#AS00108"
expj.AE0030020.AE0030020button1.Select.child1 = function () {
  console.log('Select script9');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_DLV_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_DLV_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0030020', 'AE0030020button1', 'AS00108');
}
};
// script10="child;2;CHK;[{~CHARAT(_AE0030020form1/PUCH_ODR_START_TIME:0)}*10+{~CHARAT(_AE0030020form1/PUCH_ODR_START_TIME:1)}][gte]24@#AS00107,*3"
expj.AE0030020.AE0030020button1.Select.child2 = function () {
  console.log('Select script10');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_START_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_START_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24'))) {
expj.common.pscript.addErrorMessage('AE0030020', 'AE0030020button1', 'AS00107');
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script11="child;3;CHK;_AE0030020form1/TIME_CTRL[eq]true[and]~LEN(_AE0030020form1/PUCH_ODR_START_TIME)[eq]4@*4"
expj.AE0030020.AE0030020button1.Select.child3 = function () {
  console.log('Select script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button1', '_AE0030020form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script12="child;4;CHK;[{~CHARAT(_AE0030020form1/PUCH_ODR_START_TIME:2)}*10+{~CHARAT(_AE0030020form1/PUCH_ODR_START_TIME:3)}][gte]60@#AS00107"
expj.AE0030020.AE0030020button1.Select.child4 = function () {
  console.log('Select script12');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_START_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_START_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0030020', 'AE0030020button1', 'AS00107');
}
};
// script13="child;5;CHK;[{~CHARAT(_AE0030020form1/PUCH_ODR_DLV_TIME:0)}*10+{~CHARAT(_AE0030020form1/PUCH_ODR_DLV_TIME:1)}][gte]24@#AS00108,*6"
expj.AE0030020.AE0030020button1.Select.child5 = function () {
  console.log('Select script13');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_DLV_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_DLV_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24'))) {
expj.common.pscript.addErrorMessage('AE0030020', 'AE0030020button1', 'AS00108');
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script14="child;6;CHK;_AE0030020form1/TIME_CTRL[eq]true[and]~LEN(_AE0030020form1/PUCH_ODR_DLV_TIME)[eq]4@*7"
expj.AE0030020.AE0030020button1.Select.child6 = function () {
  console.log('Select script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button1', '_AE0030020form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_DLV_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script15="child;7;CHK;[{~CHARAT(_AE0030020form1/PUCH_ODR_DLV_TIME:2)}*10+{~CHARAT(_AE0030020form1/PUCH_ODR_DLV_TIME:3)}][gte]60@#AS00108"
expj.AE0030020.AE0030020button1.Select.child7 = function () {
  console.log('Select script15');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_DLV_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0030020', 'AE0030020button1', '_AE0030020form1/PUCH_ODR_DLV_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0030020', 'AE0030020button1', 'AS00108');
}
};
expj.AE0030020.AE0030020button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020button1.Select['onClick' + i])) {
        expj.AE0030020.AE0030020button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020button1.Select.executeAllOnDecision = function () {
};
expj.AE0030020.AE0030020button1.Select.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020button1', 'Select', this, 'Button');
    }
  });
  expj.AE0030020.AE0030020button1.Select.executePScriptOnLoad();
};

expj.AE0030020.AE0030020button1.Select.executePScriptOnLoad = function () {
  console.log('execute AE0030020button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0030020-AE0030020button1-Select" name="Select" class="AE0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AE0030020-AE0030020view1">
expj.AE0030020.AE0030020view1 = {};
expj.AE0030020.AE0030020view1.executeAllOnClick = function () {
};
expj.AE0030020.AE0030020view1.executeAllOnDecision = function () {
  console.log('execute AE0030020view1.onDecision');
};
expj.AE0030020.AE0030020view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AE0030020view1", "expj.AE0030020.AE0030020view1.executeAllOnClick");
%>
  expj.AE0030020.AE0030020view1.executePScriptOnLoad();
};

expj.AE0030020.AE0030020view1.executePScriptOnLoad = function () {
  console.log('execute AE0030020view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AE0030020-AE0030020view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AE0030020view1_Id = "AE0030020view1";
 String AE0030020view1_select = "single";
 String AE0030020view1_sortable = "true";
 String AE0030020view1_resize = "true";
 String AE0030020view1_scroll = "true";
 StringBuffer AE0030020view1_HB = new StringBuffer();
 StringBuffer AE0030020view1_DB = new StringBuffer();
%>
<%
 AE0030020view1_select = "multi";
 AE0030020view1_sortable = "true";
 AE0030020view1_resize = "true";
 AE0030020view1_scroll = "true";
%>
<%
 AE0030020view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AE0030020view1_sortable).append("}").append(",");
%>
     
<%
AE0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_START_DATE_1",rb))).append("', 'name':'l_PUCH_ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0030020view1_sortable).append("}").append(",");
AE0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_DLV_DATE",rb))).append("', 'name':'l_PUCH_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0030020view1_sortable).append("}").append(",");
AE0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'l_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0030020view1_sortable).append("}").append(",");
AE0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_NAME",rb))).append("', 'name':'l_VEND_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0030020view1_sortable).append("}").append(",");
AE0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0030020view1_sortable).append("}").append(",");
AE0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0030020view1_sortable).append("}").append(",");
AE0030020view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_QTY",rb))).append("', 'name':'l_PUCH_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0030020view1_sortable).append("}").append(",");
AE0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'l_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0030020view1_sortable).append("}").append(",");
AE0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_CD",rb))).append("', 'name':'l_PUCH_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0030020view1_sortable).append("}").append(",");
AE0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0030020view1_sortable).append("}").append(",");
AE0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_SLIP_ISS_DATE",rb))).append("', 'name':'l_PUCH_ODR_SLIP_ISS_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0030020view1_sortable).append("}").append(",");
AE0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AE0030020view1_sortable).append("}").append(",");
AE0030020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_PUCH_ODR_INST_SLIP_ISS_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AE0030020view1_sortable).append("}").append(",");
%>
<%
 int aAE0030020StructLength = aAE0030020Control.getListsize();
 final AE0030020Struct structBackup = aAE0030020Struct;
 aAE0030020Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAE0030020StructLength; ++loopCount) {
  if((aAE0030020Struct = (AE0030020Struct) aAE0030020Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAE0030020Struct", aAE0030020Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AE0030020view1_DB.append("[");
 AE0030020view1_DB.append(loopCount);
 AE0030020view1_DB.append(",").append("'<span id=\"expj-AE0030020-AE0030020view1-l_PUCH_ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0030020-AE0030020view1-l_PUCH_ODR_START_DATE\" data-name=\"l_PUCH_ODR_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0030020Struct.getl_PUCH_ODR_START_DATE())).append("</span>'");
 AE0030020view1_DB.append(",").append("'<span id=\"expj-AE0030020-AE0030020view1-l_PUCH_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0030020-AE0030020view1-l_PUCH_ODR_DLV_DATE\" data-name=\"l_PUCH_ODR_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0030020Struct.getl_PUCH_ODR_DLV_DATE())).append("</span>'");
 AE0030020view1_DB.append(",").append("'<span id=\"expj-AE0030020-AE0030020view1-l_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0030020-AE0030020view1-l_VEND_CD\" data-name=\"l_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0030020Struct.getl_VEND_CD())).append("</span>'");
 AE0030020view1_DB.append(",").append("'<span id=\"expj-AE0030020-AE0030020view1-l_VEND_ANAME-").append(loopCount).append("\" class=\"expj-label expj-AE0030020-AE0030020view1-l_VEND_ANAME\" data-name=\"l_VEND_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0030020Struct.getl_VEND_ANAME())).append("</span>'");
 AE0030020view1_DB.append(",").append("'<span id=\"expj-AE0030020-AE0030020view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0030020-AE0030020view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0030020Struct.getl_ITEM_CD())).append("</span>'");
 AE0030020view1_DB.append(",").append("'<span id=\"expj-AE0030020-AE0030020view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0030020-AE0030020view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0030020Struct.getl_ITEM_NAME())).append("</span>'");
 AE0030020view1_DB.append(",").append("'<span id=\"expj-AE0030020-AE0030020view1-l_PUCH_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0030020-AE0030020view1-l_PUCH_ODR_QTY\" data-name=\"l_PUCH_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0030020Struct.getl_PUCH_ODR_QTY())).append("</span>'");
 AE0030020view1_DB.append(",").append("'<span id=\"expj-AE0030020-AE0030020view1-l_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AE0030020-AE0030020view1-l_STOCK_UNIT\" data-name=\"l_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0030020Struct.getl_STOCK_UNIT())).append("</span>'");
 AE0030020view1_DB.append(",").append("'<span id=\"expj-AE0030020-AE0030020view1-l_PUCH_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0030020-AE0030020view1-l_PUCH_ODR_CD\" data-name=\"l_PUCH_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0030020Struct.getl_PUCH_ODR_CD())).append("</span>'");
 AE0030020view1_DB.append(",").append("'<span id=\"expj-AE0030020-AE0030020view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0030020-AE0030020view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0030020Struct.getl_JOB_ODR_CD())).append("</span>'");
 AE0030020view1_DB.append(",").append("'<span id=\"expj-AE0030020-AE0030020view1-l_PUCH_ODR_SLIP_ISS_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0030020-AE0030020view1-l_PUCH_ODR_SLIP_ISS_DATE\" data-name=\"l_PUCH_ODR_SLIP_ISS_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0030020Struct.getl_PUCH_ODR_SLIP_ISS_DATE())).append("</span>'");
 AE0030020view1_DB.append(",").append("'<span id=\"expj-AE0030020-AE0030020view1-l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AE0030020-AE0030020view1-l_MODIFY_COUNT\" data-name=\"l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0030020Struct.getl_MODIFY_COUNT())).append("</span>'");
 AE0030020view1_DB.append(",").append("'<span id=\"expj-AE0030020-AE0030020view1-l_PUCH_ODR_INST_SLIP_ISS_FLG-").append(loopCount).append("\" class=\"expj-label expj-AE0030020-AE0030020view1-l_PUCH_ODR_INST_SLIP_ISS_FLG\" data-name=\"l_PUCH_ODR_INST_SLIP_ISS_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0030020Struct.getl_PUCH_ODR_INST_SLIP_ISS_FLG())).append("</span>'");
 AE0030020view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAE0030020StructLength) {
   AE0030020view1_DB.append(",");
  }
 }
 aAE0030020Struct = structBackup;
 viewIdList.add(AE0030020view1_Id);
 viewSelectList.add(AE0030020view1_select);
 viewResizeList.add(AE0030020view1_resize);
 viewScrollList.add(AE0030020view1_scroll);
 viewHeaderDataList.add(AE0030020view1_HB);
 viewBodyDataList.add(AE0030020view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AE0030020-AE0030020button2">
expj.AE0030020.AE0030020button2 = {};
expj.AE0030020.AE0030020button2.executeAllOnDecision = function () {
  console.log('execute AE0030020button2.onDecision');
};
expj.AE0030020.AE0030020button2.executeOnLoad = function () {
  expj.AE0030020.AE0030020button2.executePScriptOnLoad();
};

expj.AE0030020.AE0030020button2.executePScriptOnLoad = function () {
  console.log('execute AE0030020button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0030020-AE0030020button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0030020-AE0030020button2-CheckAll">
expj.AE0030020.AE0030020button2.CheckAll = {};
// script1="onClick;0;DGSALL;AE0030020view1"
expj.AE0030020.AE0030020button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('AE0030020', 'AE0030020view1');
};
expj.AE0030020.AE0030020button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020button2.CheckAll['onClick' + i])) {
        expj.AE0030020.AE0030020button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020button2.CheckAll.executeAllOnDecision = function () {
};
expj.AE0030020.AE0030020button2.CheckAll.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020button2', 'CheckAll', this, 'Button');
    }
  });
  expj.AE0030020.AE0030020button2.CheckAll.executePScriptOnLoad();
};

expj.AE0030020.AE0030020button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute AE0030020button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0030020-AE0030020button2-CheckAll" name="CheckAll" class="AE0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020button2-UncheckAll">
expj.AE0030020.AE0030020button2.UncheckAll = {};
// script1="onClick;0;DGSCANCEL;AE0030020view1"
expj.AE0030020.AE0030020button2.UncheckAll.onClick0 = function () {
  console.log('UncheckAll script1');
expj.common.pscript.unselectVIEWAllRow('AE0030020', 'AE0030020view1');
};
expj.AE0030020.AE0030020button2.UncheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020button2.UncheckAll['onClick' + i])) {
        expj.AE0030020.AE0030020button2.UncheckAll['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020button2.UncheckAll.executeAllOnDecision = function () {
};
expj.AE0030020.AE0030020button2.UncheckAll.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020button2-UncheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020button2', 'UncheckAll', this, 'Button');
    }
  });
  expj.AE0030020.AE0030020button2.UncheckAll.executePScriptOnLoad();
};

expj.AE0030020.AE0030020button2.UncheckAll.executePScriptOnLoad = function () {
  console.log('execute AE0030020button2/UncheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020button2-UncheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0030020-AE0030020button2-UncheckAll" name="UncheckAll" class="AE0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AE0030020 Revision: 1.10  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AE0030020-AE0030020button0">
expj.AE0030020.AE0030020button0 = {};
expj.AE0030020.AE0030020button0.executeAllOnDecision = function () {
  console.log('execute AE0030020button0.onDecision');
};
expj.AE0030020.AE0030020button0.executeOnLoad = function () {
  expj.AE0030020.AE0030020button0.executePScriptOnLoad();
};

expj.AE0030020.AE0030020button0.executePScriptOnLoad = function () {
  console.log('execute AE0030020button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0030020-AE0030020button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0030020-AE0030020button0-PartialSlipOutput">
expj.AE0030020.AE0030020button0.PartialSlipOutput = {};
// script1="onClick;0;CHK;?AE0030020form1/*[eq]NORMAL@*0,*2"
expj.AE0030020.AE0030020button0.PartialSlipOutput.onClick0 = function () {
  console.log('PartialSlipOutput script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script2="child;0;CHK;?AE0030020form1/PLANT_CD[eq]SAME[and]?AE0030020form1/r1_FILTER1[eq]SAME[and]?AE0030020form1/PUCH_ODR_START_DATE[eq]SAME[and]?AE0030020form1/r2_FILTER1[eq]SAME[and]?AE0030020form1/PUCH_ODR_DLV_DATE[eq]SAME[and]?AE0030020form1/r1_FILTER2[eq]SAME[and]?AE0030020form1/PUCH_ODR_CD[eq]SAME[and]?AE0030020form1/r2_FILTER2[eq]SAME[and]?AE0030020form1/r1_FILTER3[eq]SAME[and]?AE0030020form1/r2_FILTER3[eq]SAME[and]?AE0030020form1/JOB_ODR_CD[eq]SAME[and]?AE0030020form1/VEND_CD[eq]SAME[and]?AE0030020form1/PUCH_ODR_PERSON[eq]SAME[and]?AE0030020form1/ReOutputFlag[eq]SAME@*1,*2"
expj.AE0030020.AE0030020button0.PartialSlipOutput.child0 = function () {
  console.log('PartialSlipOutput script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/r1_FILTER1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/PUCH_ODR_START_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/r2_FILTER1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/PUCH_ODR_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/r1_FILTER2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/r2_FILTER2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/r1_FILTER3'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/r2_FILTER3'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/PUCH_ODR_PERSON'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/ReOutputFlag'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;CHK;?AE0030020view1/?[neq]NOT_SELECTED@*4,*3"
expj.AE0030020.AE0030020button0.PartialSlipOutput.child1 = function () {
  console.log('PartialSlipOutput script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020view1/?'), '[neq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;2;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AE0030020form1/*@AE0030020Servlet:C,M,M"
expj.AE0030020.AE0030020button0.PartialSlipOutput.child2 = function () {
  console.log('PartialSlipOutput script4');
expj.common.pscript.viewPrinterDialog('AE0030020', 'AE0030020button0', '_AE0030020form1/*', 'AE0030020Servlet', 'C,M,M');
};
// script5="child;3;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AE0030020form1/*,_AE0030020view1/*@AE0030020Servlet:U,C,M"
expj.AE0030020.AE0030020button0.PartialSlipOutput.child3 = function () {
  console.log('PartialSlipOutput script5');
expj.common.pscript.viewPrinterDialog('AE0030020', 'AE0030020button0', '_AE0030020form1/*,_AE0030020view1/*', 'AE0030020Servlet', 'U,C,M');
};
// script6="child;4;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AE0030020form1/*,_AE0030020view1/+@AE0030020Servlet:U,U,C"
expj.AE0030020.AE0030020button0.PartialSlipOutput.child4 = function () {
  console.log('PartialSlipOutput script6');
expj.common.pscript.viewPrinterDialog('AE0030020', 'AE0030020button0', '_AE0030020form1/*,_AE0030020view1/+', 'AE0030020Servlet', 'U,U,C');
};
expj.AE0030020.AE0030020button0.PartialSlipOutput.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020button0.PartialSlipOutput['onClick' + i])) {
        expj.AE0030020.AE0030020button0.PartialSlipOutput['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020button0.PartialSlipOutput.executeAllOnDecision = function () {
};
expj.AE0030020.AE0030020button0.PartialSlipOutput.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020button0-PartialSlipOutput').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020button0', 'PartialSlipOutput', this, 'Button');
    }
  });
  expj.AE0030020.AE0030020button0.PartialSlipOutput.executePScriptOnLoad();
};

expj.AE0030020.AE0030020button0.PartialSlipOutput.executePScriptOnLoad = function () {
  console.log('execute AE0030020button0/PartialSlipOutput.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020button0-PartialSlipOutput');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0030020-AE0030020button0-PartialSlipOutput" name="PartialSlipOutput" class="AE0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPARTIAL_SLIP_OUTPUT",rb)%></button><!-- 分納伝票出力ボタン --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020button0-Print">
expj.AE0030020.AE0030020button0.Print = {};
// script1="onClick;0;CHK;?AE0030020form1/*[eq]NORMAL@*0,*2"
expj.AE0030020.AE0030020button0.Print.onClick0 = function () {
  console.log('Print script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script2="child;0;CHK;?AE0030020form1/PLANT_CD[eq]SAME[and]?AE0030020form1/r1_FILTER1[eq]SAME[and]?AE0030020form1/PUCH_ODR_START_DATE[eq]SAME[and]?AE0030020form1/r2_FILTER1[eq]SAME[and]?AE0030020form1/PUCH_ODR_DLV_DATE[eq]SAME[and]?AE0030020form1/r1_FILTER2[eq]SAME[and]?AE0030020form1/PUCH_ODR_CD[eq]SAME[and]?AE0030020form1/r2_FILTER2[eq]SAME[and]?AE0030020form1/r1_FILTER3[eq]SAME[and]?AE0030020form1/r2_FILTER3[eq]SAME[and]?AE0030020form1/JOB_ODR_CD[eq]SAME[and]?AE0030020form1/VEND_CD[eq]SAME[and]?AE0030020form1/PUCH_ODR_PERSON[eq]SAME[and]?AE0030020form1/ReOutputFlag[eq]SAME@*1,*2"
expj.AE0030020.AE0030020button0.Print.child0 = function () {
  console.log('Print script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/r1_FILTER1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/PUCH_ODR_START_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/r2_FILTER1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/PUCH_ODR_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/r1_FILTER2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/r2_FILTER2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/r1_FILTER3'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/r2_FILTER3'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/PUCH_ODR_PERSON'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020form1/ReOutputFlag'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;CHK;?AE0030020view1/?[neq]NOT_SELECTED@*4,*3"
expj.AE0030020.AE0030020button0.Print.child1 = function () {
  console.log('Print script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0030020', 'AE0030020button0', '?AE0030020view1/?'), '[neq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;2;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AE0030020form1/*@AE0030020Servlet:C,M,M"
expj.AE0030020.AE0030020button0.Print.child2 = function () {
  console.log('Print script4');
expj.common.pscript.viewPrinterDialog('AE0030020', 'AE0030020button0', '_AE0030020form1/*', 'AE0030020Servlet', 'C,M,M');
};
// script5="child;3;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AE0030020form1/*,_AE0030020view1/*@AE0030020Servlet:U,C,M"
expj.AE0030020.AE0030020button0.Print.child3 = function () {
  console.log('Print script5');
expj.common.pscript.viewPrinterDialog('AE0030020', 'AE0030020button0', '_AE0030020form1/*,_AE0030020view1/*', 'AE0030020Servlet', 'U,C,M');
};
// script6="child;4;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AE0030020form1/*,_AE0030020view1/+@AE0030020Servlet:U,U,C"
expj.AE0030020.AE0030020button0.Print.child4 = function () {
  console.log('Print script6');
expj.common.pscript.viewPrinterDialog('AE0030020', 'AE0030020button0', '_AE0030020form1/*,_AE0030020view1/+', 'AE0030020Servlet', 'U,U,C');
};
expj.AE0030020.AE0030020button0.Print.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020button0.Print['onClick' + i])) {
        expj.AE0030020.AE0030020button0.Print['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020button0.Print.executeAllOnDecision = function () {
};
expj.AE0030020.AE0030020button0.Print.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020button0-Print').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020button0', 'Print', this, 'Button');
    }
  });
  expj.AE0030020.AE0030020button0.Print.executePScriptOnLoad();
};

expj.AE0030020.AE0030020button0.Print.executePScriptOnLoad = function () {
  console.log('execute AE0030020button0/Print.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020button0-Print');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0030020-AE0030020button0-Print" name="Print" class="AE0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnORDER_SHEET_OUTPUT",rb)%></button><!-- 注文書出力ボタン --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020button0-Clear">
expj.AE0030020.AE0030020button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0030020Servlet,,$ZZ07008"
expj.AE0030020.AE0030020button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0030020', 'AE0030020button0', '', 'AE0030020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0030020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0030020', response);
expj.common.updateBusinessScreenTab('AE0030020', contents);
};
expj.common.pscript.callConfirm('AE0030020', 'AE0030020button0', 'ZZ07008', okEvent);
};
expj.AE0030020.AE0030020button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020button0.Clear['onClick' + i])) {
        expj.AE0030020.AE0030020button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020button0.Clear.executeAllOnDecision = function () {
};
expj.AE0030020.AE0030020button0.Clear.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0030020.AE0030020button0.Clear.executePScriptOnLoad();
};

expj.AE0030020.AE0030020button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0030020button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0030020-AE0030020button0-Clear" name="Clear" class="AE0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AE0030020-AE0030020button0-Close">
expj.AE0030020.AE0030020button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0030020.AE0030020button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0030020');
};
expj.AE0030020.AE0030020button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0030020.AE0030020button0.Close['onClick' + i])) {
        expj.AE0030020.AE0030020button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0030020.AE0030020button0.Close.executeAllOnDecision = function () {
};
expj.AE0030020.AE0030020button0.Close.executeOnLoad = function () {
  $('#expj-AE0030020-AE0030020button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0030020', 'AE0030020button0', 'Close', this, 'Button');
    }
  });
  expj.AE0030020.AE0030020button0.Close.executePScriptOnLoad();
};

expj.AE0030020.AE0030020button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0030020button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0030020-AE0030020button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0030020-AE0030020button0-Close" name="Close" class="AE0030020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0030020 (END)-->
<%
MessageStruct msgStruct = aAE0030020Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0030020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0030020)) {
  expj.common.treeInstanceMap.AE0030020 = {};
}
expj.common.treeInstanceMap.AE0030020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0030020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0030020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0030020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0030020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0030020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0030020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0030020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0030020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0030020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0030020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0030020)) {
  expj.common.detailDialogMap.AE0030020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0030020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0030020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0030020.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0030020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0030020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0030020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0030020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0030020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0030020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0030020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0030020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0030020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0030020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0030020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0030020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0030020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0030020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0030020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0030020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0030020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0030020)) {
  expj.common.viewInstanceMap.AE0030020 = {};
}
expj.common.viewInstanceMap.AE0030020.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0030020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0030020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0030020.<%=viewId %>.init = function () {
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
    expj.AE0030020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0030020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0030020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0030020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0030020_init">
/**
 * AE0030020用のロード完了時初期化関数
 */
expj.AE0030020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0030020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0030020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0030020');
  expj.common.calendarInstanceMap.AE0030020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0030020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0030020.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0030020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0030020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0030020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0030020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0030020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0030020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0030020-<%=detailId %>');
<%
 }
%>
  try{expj.AE0030020.AE0030020form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.PUCH_ODR_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.CalendarPuchOdrStartDate.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.PUCH_ODR_START_TIME.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.r1_FILTER1.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.r1_FILTER3.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.CalendarPuchOdrDlvDate.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.PUCH_ODR_DLV_TIME.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.r2_FILTER1.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.r2_FILTER3.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.PeekerPuchOdrDd.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.r1_FILTER2.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.ReOutputFlag.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.PeekerJOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.r2_FILTER2.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.PUCH_ODR_PERSON.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020button1.Select.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020button2.UncheckAll.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020button0.PartialSlipOutput.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020button0.Print.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020form1.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020button1.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020view1.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020button2.executeOnLoad();}catch(e){};
  try{expj.AE0030020.AE0030020button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0030020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0030020', 'AE0030020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0030020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0030020-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0030020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0030020', '<%=request.getContextPath() %>');
};

/**
 * AE0030020の全体onDecision処理
 */
expj.AE0030020.executeAllOnDecision = function () {
  expj.AE0030020.AE0030020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0030020_console">
expj.AE0030020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>