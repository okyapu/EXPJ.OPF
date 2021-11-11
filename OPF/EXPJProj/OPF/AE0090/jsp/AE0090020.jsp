<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 10:05:36 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AE0090\AE0090020.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0090.*" %>
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
<jsp:useBean id="aAE0090020Control" class="com.nec.jp.orteus.metamorBase.AE0090.AE0090020Control" scope="request"/>
<jsp:useBean id="aAE0090020Struct" class="com.nec.jp.orteus.metamorBase.AE0090.AE0090020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

発注残一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0090/jsp/AE0090020.jsp,v $
$Author: geng-jia $	
$Revision: 1.29 $　$Date: 2017/02/22 02:05:20 $
********************************************************* --%>
<html>
<head>
<title>発注残一覧</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("AE0010010Servlet", so);
ScreenMoveUtil su2 = new ScreenMoveUtil("AE0060010Servlet", so);
%>

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
<script class="expj-script-AE0090020_init">
  // AE0090020名前空間
  expj.AE0090020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AE0090020" data-screen="AE0090020" data-newdata="<%=aAE0090020Control.isNewData() %>">
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
              <script class="expj-script-AE0090020-AE0090020form1">
expj.AE0090020.AE0090020form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4"
expj.AE0090020.AE0090020form1.onLoad0 = function () {
  console.log('AE0090020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AE0090020.AE0090020form1.onDecision0 = function () {
  console.log('AE0090020form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0090020', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AE0090020button1/Select"
expj.AE0090020.AE0090020form1.child0 = function () {
  console.log('AE0090020form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_AE0090020button1/Select');
};
// script4="child;1;MASK;_AE0090020button1/Select"
expj.AE0090020.AE0090020form1.child1 = function () {
  console.log('AE0090020form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_AE0090020button1/Select');
};
// script5="onDecision;1;CHKRQ;?AE0090020view1/?[neq]NOT_SELECTED@*2,*4"
expj.AE0090020.AE0090020form1.onDecision1 = function () {
  console.log('AE0090020form1 script5');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?AE0090020view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?PLANT_CD[eq]SAME[and]?VEND_CD[eq]SAME[and]?ITEM_CD[eq]SAME[and]?PUCH_ODR_CD[eq]SAME[and]?PUCH_ODR_START_DATE[eq]SAME[and]?PUCH_ODR_DLV_DATE[eq]SAME[and]?c1_WORK_STS_TYP[eq]SAME[and]?c2_WORK_STS_TYP[eq]SAME[and]?c3_WORK_STS_TYP[eq]SAME[and]?c4_WORK_STS_TYP[eq]SAME[and]?c5_WORK_STS_TYP[eq]SAME[and]?c6_WORK_STS_TYP[eq]SAME[and]?c7_WORK_STS_TYP[eq]SAME[and]?c8_WORK_STS_TYP[eq]SAME[and]?AE0090020form1/*[eq]NORMAL@*3,*4"
expj.AE0090020.AE0090020form1.child2 = function () {
  console.log('AE0090020form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?PUCH_ODR_START_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?PUCH_ODR_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c1_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c2_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c3_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c4_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c5_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c6_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c7_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c8_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?AE0090020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AE0090020button2/Button1"
expj.AE0090020.AE0090020form1.child3 = function () {
  console.log('AE0090020form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_AE0090020button2/Button1');
};
// script8="child;4;MASK;_AE0090020button2/Button1"
expj.AE0090020.AE0090020form1.child4 = function () {
  console.log('AE0090020form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_AE0090020button2/Button1');
};
// script9="onDecision;2;CHKRQ;?AE0090020view1/?[neq]NOT_SELECTED@*5,*8"
expj.AE0090020.AE0090020form1.onDecision2 = function () {
  console.log('AE0090020form1 script9');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?AE0090020view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="child;5;CHK;_AE0090020view1/l_STATUS[neq]1@*6,*8"
expj.AE0090020.AE0090020form1.child5 = function () {
  console.log('AE0090020form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '_AE0090020view1/l_STATUS'), '[neq]', '1')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;6;CHK;?PLANT_CD[eq]SAME[and]?VEND_CD[eq]SAME[and]?ITEM_CD[eq]SAME[and]?PUCH_ODR_CD[eq]SAME[and]?PUCH_ODR_START_DATE[eq]SAME[and]?PUCH_ODR_DLV_DATE[eq]SAME[and]?c1_WORK_STS_TYP[eq]SAME[and]?c2_WORK_STS_TYP[eq]SAME[and]?c3_WORK_STS_TYP[eq]SAME[and]?c4_WORK_STS_TYP[eq]SAME[and]?c5_WORK_STS_TYP[eq]SAME[and]?c6_WORK_STS_TYP[eq]SAME[and]?c7_WORK_STS_TYP[eq]SAME[and]?c8_WORK_STS_TYP[eq]SAME[and]?AE0090020form1/*[eq]NORMAL@*7,*8"
expj.AE0090020.AE0090020form1.child6 = function () {
  console.log('AE0090020form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?PUCH_ODR_START_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?PUCH_ODR_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c1_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c2_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c3_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c4_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c5_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c6_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c7_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c8_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?AE0090020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_AE0090020button2/Button2"
expj.AE0090020.AE0090020form1.child7 = function () {
  console.log('AE0090020form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_AE0090020button2/Button2');
};
// script13="child;8;MASK;_AE0090020button2/Button2"
expj.AE0090020.AE0090020form1.child8 = function () {
  console.log('AE0090020form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_AE0090020button2/Button2');
};
// script14="onDecision;3;CHK;?AE0090020form1/*[eq]NORMAL@*9,*11"
expj.AE0090020.AE0090020form1.onDecision3 = function () {
  console.log('AE0090020form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?AE0090020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script15="child;9;CHK;?PLANT_CD[eq]SAME[and]?VEND_CD[eq]SAME[and]?ITEM_CD[eq]SAME[and]?PUCH_ODR_CD[eq]SAME[and]?PUCH_ODR_START_DATE[eq]SAME[and]?PUCH_ODR_DLV_DATE[eq]SAME[and]?c1_WORK_STS_TYP[eq]SAME[and]?c2_WORK_STS_TYP[eq]SAME[and]?c3_WORK_STS_TYP[eq]SAME[and]?c4_WORK_STS_TYP[eq]SAME[and]?c5_WORK_STS_TYP[eq]SAME[and]?c6_WORK_STS_TYP[eq]SAME[and]?c7_WORK_STS_TYP[eq]SAME[and]?c8_WORK_STS_TYP[eq]SAME@*10,*11"
expj.AE0090020.AE0090020form1.child9 = function () {
  console.log('AE0090020form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?PUCH_ODR_START_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?PUCH_ODR_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c1_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c2_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c3_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c4_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c5_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c6_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c7_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '?c8_WORK_STS_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script16="child;10;UNMASK;_AE0090020button0/CsvOut"
expj.AE0090020.AE0090020form1.child10 = function () {
  console.log('AE0090020form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_AE0090020button0/CsvOut');
};
// script17="child;11;MASK;_AE0090020button0/CsvOut"
expj.AE0090020.AE0090020form1.child11 = function () {
  console.log('AE0090020form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_AE0090020button0/CsvOut');
};
// script18="onDecision;4;CHK;_AE0090020form1/TIME_CTRL[eq]true@*12,*13"
expj.AE0090020.AE0090020form1.onDecision4 = function () {
  console.log('AE0090020form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '_AE0090020form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script19="child;12;UNMASK;_PUCH_ODR_START_TIME,_PUCH_ODR_DLV_TIME"
expj.AE0090020.AE0090020form1.child12 = function () {
  console.log('AE0090020form1 script19');
expj.common.pscript.setUnMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_PUCH_ODR_START_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_PUCH_ODR_DLV_TIME');
};
// script20="child;13;MASK;_PUCH_ODR_START_TIME,_PUCH_ODR_DLV_TIME"
expj.AE0090020.AE0090020form1.child13 = function () {
  console.log('AE0090020form1 script20');
expj.common.pscript.setMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_PUCH_ODR_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_PUCH_ODR_DLV_TIME');
};
expj.AE0090020.AE0090020form1.executeAllOnDecision = function () {
  console.log('execute AE0090020form1.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020form1['onDecision' + i])) {
        expj.AE0090020.AE0090020form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020form1.executeOnLoad = function () {
  expj.AE0090020.AE0090020form1.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0090020.AE0090020form1['onLoad' + i])) {
      expj.AE0090020.AE0090020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0090020-AE0090020form1" action="AE0090020Servlet" name="AE0090020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0090020Control.getReadStatusString()) %>" style="height:188px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:188px;">
<!--DWLayoutTable--> <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:left"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-PLANT_CD">
expj.AE0090020.AE0090020form1.PLANT_CD = {};
expj.AE0090020.AE0090020form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/PLANT_CD.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'PLANT_CD', this);
  });
  expj.AE0090020.AE0090020form1.PLANT_CD.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-PLANT_CD" name="PLANT_CD" class="AE0090020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-PeekerPlantCd">
expj.AE0090020.AE0090020form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AE0090020form1/PLANT_CD@<%=contextNo%>"
expj.AE0090020.AE0090020form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0090020';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0090020form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0090020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0090020.AE0090020form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020form1.PeekerPlantCd['onClick' + i])) {
        expj.AE0090020.AE0090020form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AE0090020.AE0090020form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0090020-AE0090020form1-PeekerPlantCd" class="AE0090020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-PLANT_NAME">
expj.AE0090020.AE0090020form1.PLANT_NAME = {};
expj.AE0090020.AE0090020form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/PLANT_NAME.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'PLANT_NAME', this);
  });
  expj.AE0090020.AE0090020form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-PLANT_NAME" name="PLANT_NAME" class="AE0090020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-VEND_CD">
expj.AE0090020.AE0090020form1.VEND_CD = {};
expj.AE0090020.AE0090020form1.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/VEND_CD.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.VEND_CD.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'VEND_CD', this);
  });
  expj.AE0090020.AE0090020form1.VEND_CD.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-VEND_CD" name="VEND_CD" class="AE0090020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-PeekerCurCd">
expj.AE0090020.AE0090020form1.PeekerCurCd = {};
// script1="onClick;0;PEEKER;_AE0090020form1/VEND_CD@<%=contextNo%>"
expj.AE0090020.AE0090020form1.PeekerCurCd.onClick0 = function () {
  console.log('PeekerCurCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0090020';
var parameterValues = 'PeekerCurCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AE0090020form1/VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0090020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0090020.AE0090020form1.PeekerCurCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020form1.PeekerCurCd['onClick' + i])) {
        expj.AE0090020.AE0090020form1.PeekerCurCd['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020form1.PeekerCurCd.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020form1.PeekerCurCd.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PeekerCurCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'PeekerCurCd', this, 'Button');
    }
  });
  expj.AE0090020.AE0090020form1.PeekerCurCd.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PeekerCurCd.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PeekerCurCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PeekerCurCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0090020-AE0090020form1-PeekerCurCd" class="AE0090020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-VEND_NAME">
expj.AE0090020.AE0090020form1.VEND_NAME = {};
expj.AE0090020.AE0090020form1.VEND_NAME.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/VEND_NAME.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.VEND_NAME.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'VEND_NAME', this);
  });
  expj.AE0090020.AE0090020form1.VEND_NAME.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-VEND_NAME" name="VEND_NAME" class="AE0090020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getVEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-ITEM_CD">
expj.AE0090020.AE0090020form1.ITEM_CD = {};
expj.AE0090020.AE0090020form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/ITEM_CD.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'ITEM_CD', this);
  });
  expj.AE0090020.AE0090020form1.ITEM_CD.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-ITEM_CD" name="ITEM_CD" class="AE0090020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-PeekerItemCd">
expj.AE0090020.AE0090020form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AE0090020form1/ITEM_CD@<%=contextNo%>"
expj.AE0090020.AE0090020form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0090020';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0090020form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0090020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0090020.AE0090020form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020form1.PeekerItemCd['onClick' + i])) {
        expj.AE0090020.AE0090020form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AE0090020.AE0090020form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0090020-AE0090020form1-PeekerItemCd" class="AE0090020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-ITEM_NAME">
expj.AE0090020.AE0090020form1.ITEM_NAME = {};
expj.AE0090020.AE0090020form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/ITEM_NAME.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'ITEM_NAME', this);
  });
  expj.AE0090020.AE0090020form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-ITEM_NAME" name="ITEM_NAME" class="AE0090020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3123",rb)%></span><!-- 受入保管区コード --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-WH_CD">
expj.AE0090020.AE0090020form1.WH_CD = {};
expj.AE0090020.AE0090020form1.WH_CD.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/WH_CD.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.WH_CD.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'WH_CD', this);
  });
  expj.AE0090020.AE0090020form1.WH_CD.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-WH_CD" name="WH_CD" class="AE0090020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-PeekerWhCd">
expj.AE0090020.AE0090020form1.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AE0090020form1/WH_CD@<%=contextNo%>"
expj.AE0090020.AE0090020form1.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0090020';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '_AE0090020form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_10%&%';
parameterValues += 'TARGET_FIELD%=%_AE0090020form1/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0090020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0090020.AE0090020form1.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020form1.PeekerWhCd['onClick' + i])) {
        expj.AE0090020.AE0090020form1.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020form1.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020form1.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AE0090020.AE0090020form1.PeekerWhCd.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0090020-AE0090020form1-PeekerWhCd" class="AE0090020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-WH_NAME">
expj.AE0090020.AE0090020form1.WH_NAME = {};
expj.AE0090020.AE0090020form1.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/WH_NAME.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.WH_NAME.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'WH_NAME', this);
  });
  expj.AE0090020.AE0090020form1.WH_NAME.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-WH_NAME" name="WH_NAME" class="AE0090020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getWH_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_CD",rb)%></span><!-- 発注番号 --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-PUCH_ODR_CD">
expj.AE0090020.AE0090020form1.PUCH_ODR_CD = {};
expj.AE0090020.AE0090020form1.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/PUCH_ODR_CD.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'PUCH_ODR_CD', this);
  });
  expj.AE0090020.AE0090020form1.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-PUCH_ODR_CD" name="PUCH_ODR_CD" class="AE0090020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getPUCH_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-PeekerPuchOdrCd">
expj.AE0090020.AE0090020form1.PeekerPuchOdrCd = {};
// script1="onClick;0;PEEKER;_AE0090020form1/PUCH_ODR_CD@<%=contextNo%>"
expj.AE0090020.AE0090020form1.PeekerPuchOdrCd.onClick0 = function () {
  console.log('PeekerPuchOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0090020';
var parameterValues = 'PeekerPuchOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '_PUCH_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PUCH_ODR_CD_10%&%';
parameterValues += 'TARGET_FIELD%=%_AE0090020form1/PUCH_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0090020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0090020.AE0090020form1.PeekerPuchOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020form1.PeekerPuchOdrCd['onClick' + i])) {
        expj.AE0090020.AE0090020form1.PeekerPuchOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020form1.PeekerPuchOdrCd.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020form1.PeekerPuchOdrCd.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PeekerPuchOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'PeekerPuchOdrCd', this, 'Button');
    }
  });
  expj.AE0090020.AE0090020form1.PeekerPuchOdrCd.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PeekerPuchOdrCd.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PeekerPuchOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PeekerPuchOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0090020-AE0090020form1-PeekerPuchOdrCd" class="AE0090020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0721",rb)%></span><!-- ステータス --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-c1_WORK_STS_TYP">
expj.AE0090020.AE0090020form1.c1_WORK_STS_TYP = {};
expj.AE0090020.AE0090020form1.c1_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/c1_WORK_STS_TYP.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.c1_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-c1_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'c1_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AE0090020.AE0090020form1.c1_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.c1_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/c1_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-c1_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c1_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAE0090020Struct.getc1_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAE0090020Struct.getc1_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AE0090020-focus-move" id="expj-AE0090020-AE0090020form1-c1_WORK_STS_TYP"><label for="expj-AE0090020-AE0090020form1-c1_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0722",rb)%></label></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-c2_WORK_STS_TYP">
expj.AE0090020.AE0090020form1.c2_WORK_STS_TYP = {};
expj.AE0090020.AE0090020form1.c2_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/c2_WORK_STS_TYP.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.c2_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-c2_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'c2_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AE0090020.AE0090020form1.c2_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.c2_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/c2_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-c2_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c2_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAE0090020Struct.getc2_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAE0090020Struct.getc2_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AE0090020-focus-move" id="expj-AE0090020-AE0090020form1-c2_WORK_STS_TYP"><label for="expj-AE0090020-AE0090020form1-c2_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0726",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_START_DATE_1",rb)%></span><!-- 発注予定日 --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-PUCH_ODR_START_DATE">
expj.AE0090020.AE0090020form1.PUCH_ODR_START_DATE = {};
// script1="onDecision;0;CHK;_AE0090020form1/TIME_CTRL[eq]true@*0,*1"
expj.AE0090020.AE0090020form1.PUCH_ODR_START_DATE.onDecision0 = function () {
  console.log('PUCH_ODR_START_DATE script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '_AE0090020form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;UNMASK;_AE0090020form1/PUCH_ODR_START_TIME"
expj.AE0090020.AE0090020form1.PUCH_ODR_START_DATE.child0 = function () {
  console.log('PUCH_ODR_START_DATE script2');
expj.common.pscript.setUnMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_AE0090020form1/PUCH_ODR_START_TIME');
};
// script3="child;1;MASK;_AE0090020form1/PUCH_ODR_START_TIME"
expj.AE0090020.AE0090020form1.PUCH_ODR_START_DATE.child1 = function () {
  console.log('PUCH_ODR_START_DATE script3');
expj.common.pscript.setMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_AE0090020form1/PUCH_ODR_START_TIME');
};
expj.AE0090020.AE0090020form1.PUCH_ODR_START_DATE.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/PUCH_ODR_START_DATE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020form1.PUCH_ODR_START_DATE['onDecision' + i])) {
        expj.AE0090020.AE0090020form1.PUCH_ODR_START_DATE['onDecision' + i]();
      }
    }
  }
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.PUCH_ODR_START_DATE.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PUCH_ODR_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'PUCH_ODR_START_DATE', this);
  });
  expj.AE0090020.AE0090020form1.PUCH_ODR_START_DATE.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PUCH_ODR_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PUCH_ODR_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PUCH_ODR_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-PUCH_ODR_START_DATE" name="PUCH_ODR_START_DATE" class="AE0090020-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getPUCH_ODR_START_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-CalendarPuchOdrStartDate">
expj.AE0090020.AE0090020form1.CalendarPuchOdrStartDate = {};
// script1="onClick;0;CALENDAR;_AE0090020form1/PUCH_ODR_START_DATE"
expj.AE0090020.AE0090020form1.CalendarPuchOdrStartDate.onClick0 = function () {
  console.log('CalendarPuchOdrStartDate script1');
expj.common.pscript.executeCalendar('AE0090020','AE0090020form1','_AE0090020form1/PUCH_ODR_START_DATE');
};
expj.AE0090020.AE0090020form1.CalendarPuchOdrStartDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020form1.CalendarPuchOdrStartDate['onClick' + i])) {
        expj.AE0090020.AE0090020form1.CalendarPuchOdrStartDate['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020form1.CalendarPuchOdrStartDate.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020form1.CalendarPuchOdrStartDate.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-CalendarPuchOdrStartDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'CalendarPuchOdrStartDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0090020','AE0090020form1','_AE0090020form1/PUCH_ODR_START_DATE');
  expj.AE0090020.AE0090020form1.CalendarPuchOdrStartDate.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.CalendarPuchOdrStartDate.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/CalendarPuchOdrStartDate.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-CalendarPuchOdrStartDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0090020-AE0090020form1-CalendarPuchOdrStartDate" class="AE0090020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-PUCH_ODR_START_TIME">
expj.AE0090020.AE0090020form1.PUCH_ODR_START_TIME = {};
expj.AE0090020.AE0090020form1.PUCH_ODR_START_TIME.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/PUCH_ODR_START_TIME.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.PUCH_ODR_START_TIME.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PUCH_ODR_START_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'PUCH_ODR_START_TIME', this);
  });
  expj.AE0090020.AE0090020form1.PUCH_ODR_START_TIME.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PUCH_ODR_START_TIME.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PUCH_ODR_START_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PUCH_ODR_START_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-PUCH_ODR_START_TIME" name="PUCH_ODR_START_TIME" class="AE0090020-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getPUCH_ODR_START_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-c3_WORK_STS_TYP">
expj.AE0090020.AE0090020form1.c3_WORK_STS_TYP = {};
expj.AE0090020.AE0090020form1.c3_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/c3_WORK_STS_TYP.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.c3_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-c3_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'c3_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AE0090020.AE0090020form1.c3_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.c3_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/c3_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-c3_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c3_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAE0090020Struct.getc3_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAE0090020Struct.getc3_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AE0090020-focus-move" id="expj-AE0090020-AE0090020form1-c3_WORK_STS_TYP"><label for="expj-AE0090020-AE0090020form1-c3_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0723",rb)%></label></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-c4_WORK_STS_TYP">
expj.AE0090020.AE0090020form1.c4_WORK_STS_TYP = {};
expj.AE0090020.AE0090020form1.c4_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/c4_WORK_STS_TYP.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.c4_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-c4_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'c4_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AE0090020.AE0090020form1.c4_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.c4_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/c4_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-c4_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c4_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAE0090020Struct.getc4_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAE0090020Struct.getc4_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AE0090020-focus-move" id="expj-AE0090020-AE0090020form1-c4_WORK_STS_TYP"><label for="expj-AE0090020-AE0090020form1-c4_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0727",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_DLV_DATE",rb)%></span><!-- 発注納期 --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-PUCH_ODR_DLV_DATE">
expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_DATE = {};
// script1="onDecision;0;CHK;_AE0030010form1/TIME_CTRL[eq]true@*0,*1"
expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_DATE.onDecision0 = function () {
  console.log('PUCH_ODR_DLV_DATE script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '_AE0030010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;UNMASK;_AE0030010form1/PUCH_ODR_DLV_TIME"
expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_DATE.child0 = function () {
  console.log('PUCH_ODR_DLV_DATE script2');
expj.common.pscript.setUnMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_AE0030010form1/PUCH_ODR_DLV_TIME');
};
// script3="child;1;MASK;_AE0030010form1/PUCH_ODR_DLV_TIME"
expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_DATE.child1 = function () {
  console.log('PUCH_ODR_DLV_DATE script3');
expj.common.pscript.setMaskToReferenceComponent('AE0090020', 'AE0090020form1', '_AE0030010form1/PUCH_ODR_DLV_TIME');
};
expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/PUCH_ODR_DLV_DATE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_DATE['onDecision' + i])) {
        expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_DATE['onDecision' + i]();
      }
    }
  }
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PUCH_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'PUCH_ODR_DLV_DATE', this);
  });
  expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PUCH_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PUCH_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-PUCH_ODR_DLV_DATE" name="PUCH_ODR_DLV_DATE" class="AE0090020-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getPUCH_ODR_DLV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-CalendarPuchOdrDlvDate">
expj.AE0090020.AE0090020form1.CalendarPuchOdrDlvDate = {};
// script1="onClick;0;CALENDAR;_AE0090020form1/PUCH_ODR_DLV_DATE"
expj.AE0090020.AE0090020form1.CalendarPuchOdrDlvDate.onClick0 = function () {
  console.log('CalendarPuchOdrDlvDate script1');
expj.common.pscript.executeCalendar('AE0090020','AE0090020form1','_AE0090020form1/PUCH_ODR_DLV_DATE');
};
expj.AE0090020.AE0090020form1.CalendarPuchOdrDlvDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020form1.CalendarPuchOdrDlvDate['onClick' + i])) {
        expj.AE0090020.AE0090020form1.CalendarPuchOdrDlvDate['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020form1.CalendarPuchOdrDlvDate.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020form1.CalendarPuchOdrDlvDate.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-CalendarPuchOdrDlvDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'CalendarPuchOdrDlvDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0090020','AE0090020form1','_AE0090020form1/PUCH_ODR_DLV_DATE');
  expj.AE0090020.AE0090020form1.CalendarPuchOdrDlvDate.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.CalendarPuchOdrDlvDate.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/CalendarPuchOdrDlvDate.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-CalendarPuchOdrDlvDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0090020-AE0090020form1-CalendarPuchOdrDlvDate" class="AE0090020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-PUCH_ODR_DLV_TIME">
expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_TIME = {};
expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_TIME.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/PUCH_ODR_DLV_TIME.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_TIME.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PUCH_ODR_DLV_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'PUCH_ODR_DLV_TIME', this);
  });
  expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_TIME.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_TIME.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PUCH_ODR_DLV_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PUCH_ODR_DLV_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-PUCH_ODR_DLV_TIME" name="PUCH_ODR_DLV_TIME" class="AE0090020-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getPUCH_ODR_DLV_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-c5_WORK_STS_TYP">
expj.AE0090020.AE0090020form1.c5_WORK_STS_TYP = {};
expj.AE0090020.AE0090020form1.c5_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/c5_WORK_STS_TYP.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.c5_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-c5_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'c5_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AE0090020.AE0090020form1.c5_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.c5_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/c5_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-c5_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c5_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAE0090020Struct.getc5_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAE0090020Struct.getc5_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AE0090020-focus-move" id="expj-AE0090020-AE0090020form1-c5_WORK_STS_TYP"><label for="expj-AE0090020-AE0090020form1-c5_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0059",rb)%></label></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-c6_WORK_STS_TYP">
expj.AE0090020.AE0090020form1.c6_WORK_STS_TYP = {};
expj.AE0090020.AE0090020form1.c6_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/c6_WORK_STS_TYP.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.c6_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-c6_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'c6_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AE0090020.AE0090020form1.c6_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.c6_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/c6_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-c6_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c6_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAE0090020Struct.getc6_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAE0090020Struct.getc6_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AE0090020-focus-move" id="expj-AE0090020-AE0090020form1-c6_WORK_STS_TYP"><label for="expj-AE0090020-AE0090020form1-c6_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0728",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-JOB_ODR_CD">
expj.AE0090020.AE0090020form1.JOB_ODR_CD = {};
expj.AE0090020.AE0090020form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/JOB_ODR_CD.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'JOB_ODR_CD', this);
  });
  expj.AE0090020.AE0090020form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AE0090020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AE0090020-AE0090020form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AE0090020-AE0090020form1-DOWNLOAD_FILE">
expj.AE0090020.AE0090020form1.DOWNLOAD_FILE = {};
expj.AE0090020.AE0090020form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/DOWNLOAD_FILE.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'DOWNLOAD_FILE', this);
  });
  expj.AE0090020.AE0090020form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AE0090020-AE0090020form1-PeekerJobOdrCd">
expj.AE0090020.AE0090020form1.PeekerJobOdrCd = {};
// script1="onClick;0;PEEKER;_AE0090020form1/JOB_ODR_CD@<%=contextNo%>"
expj.AE0090020.AE0090020form1.PeekerJobOdrCd.onClick0 = function () {
  console.log('PeekerJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0090020';
var parameterValues = 'PeekerJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '_JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0090020form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0090020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0090020.AE0090020form1.PeekerJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020form1.PeekerJobOdrCd['onClick' + i])) {
        expj.AE0090020.AE0090020form1.PeekerJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020form1.PeekerJobOdrCd.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020form1.PeekerJobOdrCd.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PeekerJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'PeekerJobOdrCd', this, 'Button');
    }
  });
  expj.AE0090020.AE0090020form1.PeekerJobOdrCd.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PeekerJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PeekerJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PeekerJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0090020-AE0090020form1-PeekerJobOdrCd" class="AE0090020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-c7_WORK_STS_TYP">
expj.AE0090020.AE0090020form1.c7_WORK_STS_TYP = {};
expj.AE0090020.AE0090020form1.c7_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/c7_WORK_STS_TYP.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.c7_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-c7_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'c7_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AE0090020.AE0090020form1.c7_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.c7_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/c7_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-c7_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c7_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAE0090020Struct.getc7_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAE0090020Struct.getc7_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AE0090020-focus-move" id="expj-AE0090020-AE0090020form1-c7_WORK_STS_TYP"><label for="expj-AE0090020-AE0090020form1-c7_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0472",rb)%></label></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-c8_WORK_STS_TYP">
expj.AE0090020.AE0090020form1.c8_WORK_STS_TYP = {};
expj.AE0090020.AE0090020form1.c8_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/c8_WORK_STS_TYP.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.c8_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-c8_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'c8_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AE0090020.AE0090020form1.c8_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.c8_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/c8_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-c8_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c8_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAE0090020Struct.getc8_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAE0090020Struct.getc8_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AE0090020-focus-move" id="expj-AE0090020-AE0090020form1-c8_WORK_STS_TYP"><label for="expj-AE0090020-AE0090020form1-c8_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0734",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3124",rb)%></span><!-- 購買担当者コード --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020form1-PUCH_ODR_PERSON">
expj.AE0090020.AE0090020form1.PUCH_ODR_PERSON = {};
expj.AE0090020.AE0090020form1.PUCH_ODR_PERSON.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/PUCH_ODR_PERSON.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.PUCH_ODR_PERSON.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PUCH_ODR_PERSON').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'PUCH_ODR_PERSON', this);
  });
  expj.AE0090020.AE0090020form1.PUCH_ODR_PERSON.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PUCH_ODR_PERSON.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PUCH_ODR_PERSON.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PUCH_ODR_PERSON');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0090020-AE0090020form1-PUCH_ODR_PERSON" name="PUCH_ODR_PERSON" class="AE0090020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getPUCH_ODR_PERSON()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AE0090020-AE0090020form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0090020Struct.getTIME_CTRL()) %>">
<script class="expj-script-AE0090020-AE0090020form1-TIME_CTRL">
expj.AE0090020.AE0090020form1.TIME_CTRL = {};
expj.AE0090020.AE0090020form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AE0090020form1/TIME_CTRL.onDecision');
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
  expj.AE0090020.executeAllOnDecision();
};
expj.AE0090020.AE0090020form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090020', 'AE0090020form1', 'TIME_CTRL', this);
  });
  expj.AE0090020.AE0090020form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AE0090020-AE0090020form1-PeekerPuchOdrPerson">
expj.AE0090020.AE0090020form1.PeekerPuchOdrPerson = {};
// script1="onClick;0;PEEKER;_AE0090020form1/PUCH_ODR_PERSON@<%=contextNo%>"
expj.AE0090020.AE0090020form1.PeekerPuchOdrPerson.onClick0 = function () {
  console.log('PeekerPuchOdrPerson script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0090020';
var parameterValues = 'PeekerPuchOdrPerson%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020form1', '_PUCH_ODR_PERSON') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0090020form1/PUCH_ODR_PERSON%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0090020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0090020.AE0090020form1.PeekerPuchOdrPerson.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020form1.PeekerPuchOdrPerson['onClick' + i])) {
        expj.AE0090020.AE0090020form1.PeekerPuchOdrPerson['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020form1.PeekerPuchOdrPerson.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020form1.PeekerPuchOdrPerson.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020form1-PeekerPuchOdrPerson').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020form1', 'PeekerPuchOdrPerson', this, 'Button');
    }
  });
  expj.AE0090020.AE0090020form1.PeekerPuchOdrPerson.executePScriptOnLoad();
};

expj.AE0090020.AE0090020form1.PeekerPuchOdrPerson.executePScriptOnLoad = function () {
  console.log('execute AE0090020form1/PeekerPuchOdrPerson.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020form1-PeekerPuchOdrPerson');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0090020-AE0090020form1-PeekerPuchOdrPerson" class="AE0090020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AE0090020-AE0090020button1">
expj.AE0090020.AE0090020button1 = {};
expj.AE0090020.AE0090020button1.executeAllOnDecision = function () {
  console.log('execute AE0090020button1.onDecision');
};
expj.AE0090020.AE0090020button1.executeOnLoad = function () {
  expj.AE0090020.AE0090020button1.executePScriptOnLoad();
};

expj.AE0090020.AE0090020button1.executePScriptOnLoad = function () {
  console.log('execute AE0090020button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0090020-AE0090020button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0090020-AE0090020button1-Select">
expj.AE0090020.AE0090020button1.Select = {};
// script1="onClick;0;CHK;_AE0090020form1/PUCH_ODR_START_DATE[eq][and]_AE0090020form1/PUCH_ODR_START_TIME[neq]@#AS00103"
expj.AE0090020.AE0090020button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_START_DATE'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_START_TIME'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AE0090020', 'AE0090020button1', 'AS00103');
}
};
// script2="onClick;1;CHK;_AE0090020form1/PUCH_ODR_DLV_DATE[eq][and]_AE0090020form1/PUCH_ODR_DLV_TIME[neq]@#AS00104"
expj.AE0090020.AE0090020button1.Select.onClick1 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_DLV_DATE'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_DLV_TIME'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AE0090020', 'AE0090020button1', 'AS00104');
}
};
// script3="onClick;2;CHK;~LEN(_AE0090020form1/PUCH_ODR_START_TIME)[eq]1[or]~LEN(_AE0090020form1/PUCH_ODR_START_TIME)[eq]2@#AS00105"
expj.AE0090020.AE0090020button1.Select.onClick2 = function () {
  console.log('Select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_START_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_START_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AE0090020', 'AE0090020button1', 'AS00105');
}
};
// script4="onClick;3;CHK;~LEN(_AE0090020form1/PUCH_ODR_DLV_TIME)[eq]1[or]~LEN(_AE0090020form1/PUCH_ODR_DLV_TIME)[eq]2@#AS00106"
expj.AE0090020.AE0090020button1.Select.onClick3 = function () {
  console.log('Select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_DLV_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_DLV_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AE0090020', 'AE0090020button1', 'AS00106');
}
};
// script5="onClick;4;CHK;_AE0090020form1/TIME_CTRL[eq]true[and]~LEN(_AE0090020form1/PUCH_ODR_START_TIME)[eq]3@*0"
expj.AE0090020.AE0090020button1.Select.onClick4 = function () {
  console.log('Select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020button1', '_AE0090020form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script6="onClick;5;CHK;_AE0090020form1/TIME_CTRL[eq]true[and]~LEN(_AE0090020form1/PUCH_ODR_DLV_TIME)[eq]3@*1"
expj.AE0090020.AE0090020button1.Select.onClick5 = function () {
  console.log('Select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020button1', '_AE0090020form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script7="onClick;6;CHK;_AE0090020form1/TIME_CTRL[eq]true[and]~LEN(_AE0090020form1/PUCH_ODR_START_TIME)[eq]4@*2"
expj.AE0090020.AE0090020button1.Select.onClick6 = function () {
  console.log('Select script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020button1', '_AE0090020form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script8="onClick;7;CHK;_AE0090020form1/TIME_CTRL[eq]true[and]~LEN(_AE0090020form1/PUCH_ODR_DLV_TIME)[eq]4@*5"
expj.AE0090020.AE0090020button1.Select.onClick7 = function () {
  console.log('Select script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020button1', '_AE0090020form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_DLV_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="onClick;8;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0090020form1/*@AE0090020Servlet"
expj.AE0090020.AE0090020button1.Select.onClick8 = function () {
  console.log('Select script9');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090020', 'AE0090020button1', '_AE0090020form1/*', 'AE0090020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0090020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0090020', response);
expj.common.updateBusinessScreenTab('AE0090020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script10="child;0;CHK;[{~CHARAT(_AE0090020form1/PUCH_ODR_START_TIME:1)}*10+{~CHARAT(_AE0090020form1/PUCH_ODR_START_TIME:2)}][gte]60@#AS00107"
expj.AE0090020.AE0090020button1.Select.child0 = function () {
  console.log('Select script10');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_START_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_START_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0090020', 'AE0090020button1', 'AS00107');
}
};
// script11="child;1;CHK;[{~CHARAT(_AE0090020form1/PUCH_ODR_DLV_TIME:1)}*10+{~CHARAT(_AE0090020form1/PUCH_ODR_DLV_TIME:2)}][gte]60@#AS00108"
expj.AE0090020.AE0090020button1.Select.child1 = function () {
  console.log('Select script11');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_DLV_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_DLV_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0090020', 'AE0090020button1', 'AS00108');
}
};
// script12="child;2;CHK;[{~CHARAT(_AE0090020form1/PUCH_ODR_START_TIME:0)}*10+{~CHARAT(_AE0090020form1/PUCH_ODR_START_TIME:1)}][gte]24@#AS00107,*3"
expj.AE0090020.AE0090020button1.Select.child2 = function () {
  console.log('Select script12');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_START_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_START_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24'))) {
expj.common.pscript.addErrorMessage('AE0090020', 'AE0090020button1', 'AS00107');
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script13="child;3;CHK;_AE0090020form1/TIME_CTRL[eq]true[and]~LEN(_AE0090020form1/PUCH_ODR_START_TIME)[eq]4@*4"
expj.AE0090020.AE0090020button1.Select.child3 = function () {
  console.log('Select script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020button1', '_AE0090020form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script14="child;4;CHK;[{~CHARAT(_AE0090020form1/PUCH_ODR_START_TIME:2)}*10+{~CHARAT(_AE0090020form1/PUCH_ODR_START_TIME:3)}][gte]60@#AS00107"
expj.AE0090020.AE0090020button1.Select.child4 = function () {
  console.log('Select script14');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_START_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_START_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0090020', 'AE0090020button1', 'AS00107');
}
};
// script15="child;5;CHK;[{~CHARAT(_AE0090020form1/PUCH_ODR_DLV_TIME:0)}*10+{~CHARAT(_AE0090020form1/PUCH_ODR_DLV_TIME:1)}][gte]24@#AS00108,*6"
expj.AE0090020.AE0090020button1.Select.child5 = function () {
  console.log('Select script15');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_DLV_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_DLV_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24'))) {
expj.common.pscript.addErrorMessage('AE0090020', 'AE0090020button1', 'AS00108');
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script16="child;6;CHK;_AE0090020form1/TIME_CTRL[eq]true[and]~LEN(_AE0090020form1/PUCH_ODR_DLV_TIME)[eq]4@*7"
expj.AE0090020.AE0090020button1.Select.child6 = function () {
  console.log('Select script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0090020', 'AE0090020button1', '_AE0090020form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_DLV_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script17="child;7;CHK;[{~CHARAT(_AE0090020form1/PUCH_ODR_DLV_TIME:2)}*10+{~CHARAT(_AE0090020form1/PUCH_ODR_DLV_TIME:3)}][gte]60@#AS00108"
expj.AE0090020.AE0090020button1.Select.child7 = function () {
  console.log('Select script17');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_DLV_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0090020', 'AE0090020button1', '_AE0090020form1/PUCH_ODR_DLV_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0090020', 'AE0090020button1', 'AS00108');
}
};
expj.AE0090020.AE0090020button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 8; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020button1.Select['onClick' + i])) {
        expj.AE0090020.AE0090020button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020button1.Select.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020button1.Select.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020button1', 'Select', this, 'Button');
    }
  });
  expj.AE0090020.AE0090020button1.Select.executePScriptOnLoad();
};

expj.AE0090020.AE0090020button1.Select.executePScriptOnLoad = function () {
  console.log('execute AE0090020button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090020-AE0090020button1-Select" name="Select" class="AE0090020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AE0090020-AE0090020view1">
expj.AE0090020.AE0090020view1 = {};
expj.AE0090020.AE0090020view1.executeAllOnClick = function () {
};
expj.AE0090020.AE0090020view1.executeAllOnDecision = function () {
  console.log('execute AE0090020view1.onDecision');
};
expj.AE0090020.AE0090020view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AE0090020view1", "expj.AE0090020.AE0090020view1.executeAllOnClick");
%>
  expj.AE0090020.AE0090020view1.executePScriptOnLoad();
};

expj.AE0090020.AE0090020view1.executePScriptOnLoad = function () {
  console.log('execute AE0090020view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AE0090020-AE0090020view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AE0090020view1_Id = "AE0090020view1";
 String AE0090020view1_select = "single";
 String AE0090020view1_sortable = "true";
 String AE0090020view1_resize = "true";
 String AE0090020view1_scroll = "true";
 StringBuffer AE0090020view1_HB = new StringBuffer();
 StringBuffer AE0090020view1_DB = new StringBuffer();
%>
<%
 AE0090020view1_select = "single";
 AE0090020view1_sortable = "true";
 AE0090020view1_resize = "true";
 AE0090020view1_scroll = "true";
%>
<%
 AE0090020view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
%>
     
<%
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_STATUS', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0721",rb))).append("', 'name':'l_STATUS_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'40px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_CD",rb))).append("', 'name':'l_PLANT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_START_DATE_1",rb))).append("', 'name':'l_PUCH_ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_DLV_DATE",rb))).append("', 'name':'l_PUCH_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'l_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_NAME",rb))).append("', 'name':'l_VEND_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'105px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'numeric', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_QTY",rb))).append("', 'name':'l_PUCH_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'l_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_CD",rb))).append("', 'name':'l_PUCH_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3125",rb))).append("', 'name':'l_WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3126",rb))).append("', 'name':'l_USER_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb))).append("', 'name':'l_MRP_ODR_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb))).append("', 'name':'l_ACPT_INSPC_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_QTY_5",rb))).append("', 'name':'l_ACPT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0317",rb))).append("', 'name':'l_INSPECTED_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CONFIRM_DLV_DATE_1",rb))).append("', 'name':'l_CONFIRM_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CONFIRM_DLV_DATE_COMMENT",rb))).append("', 'name':'l_CONFIRM_DLV_DATE_COMMENT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_INST_DATE",rb))).append("', 'name':'l_PUCH_ODR_INST_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_SLIP_ISS_DATE",rb))).append("', 'name':'l_PUCH_ODR_SLIP_ISS_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_CANCEL_SLIP_ISS_DATE",rb))).append("', 'name':'l_ODR_CANCEL_SLIP_ISS_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_CANCEL_CAUSE_CD",rb))).append("', 'name':'l_ODR_CANCEL_CAUSE_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_CMPLT_DATE",rb))).append("', 'name':'l_ACPT_CMPLT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
AE0090020view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INSPC_CMPLT_DATE",rb))).append("', 'name':'l_INSPC_CMPLT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0090020view1_sortable).append("}").append(",");
%>
<%
 int aAE0090020StructLength = aAE0090020Control.getListsize();
 final AE0090020Struct structBackup = aAE0090020Struct;
 aAE0090020Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAE0090020StructLength; ++loopCount) {
  if((aAE0090020Struct = (AE0090020Struct) aAE0090020Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAE0090020Struct", aAE0090020Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AE0090020view1_DB.append("[");
 AE0090020view1_DB.append(loopCount);
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_STATUS-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_STATUS\" data-name=\"l_STATUS\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_STATUS())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_STATUS_DN-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_STATUS_DN\" data-name=\"l_STATUS_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_STATUS_DN())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_PLANT_CD\" data-name=\"l_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_PLANT_CD())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_PUCH_ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_PUCH_ODR_START_DATE\" data-name=\"l_PUCH_ODR_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_PUCH_ODR_START_DATE())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_PUCH_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_PUCH_ODR_DLV_DATE\" data-name=\"l_PUCH_ODR_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_PUCH_ODR_DLV_DATE())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_VEND_CD\" data-name=\"l_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_VEND_CD())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_VEND_ANAME-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_VEND_ANAME\" data-name=\"l_VEND_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_VEND_ANAME())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_ITEM_CD())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_ITEM_NAME())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_PUCH_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_PUCH_ODR_QTY\" data-name=\"l_PUCH_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_PUCH_ODR_QTY())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_STOCK_UNIT\" data-name=\"l_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_STOCK_UNIT())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_PUCH_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_PUCH_ODR_CD\" data-name=\"l_PUCH_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_PUCH_ODR_CD())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_JOB_ODR_CD())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_WH_NAME\" data-name=\"l_WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_WH_NAME())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_USER_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_USER_NAME\" data-name=\"l_USER_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_USER_NAME())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_MRP_ODR_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_MRP_ODR_TYP_DN\" data-name=\"l_MRP_ODR_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_MRP_ODR_TYP_DN())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_ACPT_INSPC_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_ACPT_INSPC_TYP_DN\" data-name=\"l_ACPT_INSPC_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_ACPT_INSPC_TYP_DN())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_ACPT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_ACPT_QTY\" data-name=\"l_ACPT_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_ACPT_QTY())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_INSPECTED_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_INSPECTED_QTY\" data-name=\"l_INSPECTED_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_INSPECTED_QTY())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_CONFIRM_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_CONFIRM_DLV_DATE\" data-name=\"l_CONFIRM_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_CONFIRM_DLV_DATE())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_CONFIRM_DLV_DATE_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_CONFIRM_DLV_DATE_COMMENT\" data-name=\"l_CONFIRM_DLV_DATE_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_CONFIRM_DLV_DATE_COMMENT())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_PUCH_ODR_INST_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_PUCH_ODR_INST_DATE\" data-name=\"l_PUCH_ODR_INST_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_PUCH_ODR_INST_DATE())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_PUCH_ODR_SLIP_ISS_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_PUCH_ODR_SLIP_ISS_DATE\" data-name=\"l_PUCH_ODR_SLIP_ISS_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_PUCH_ODR_SLIP_ISS_DATE())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_ODR_CANCEL_SLIP_ISS_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_ODR_CANCEL_SLIP_ISS_DATE\" data-name=\"l_ODR_CANCEL_SLIP_ISS_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_ODR_CANCEL_SLIP_ISS_DATE())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_ODR_CANCEL_CAUSE_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_ODR_CANCEL_CAUSE_CD\" data-name=\"l_ODR_CANCEL_CAUSE_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_ODR_CANCEL_CAUSE_CD())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_ACPT_CMPLT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_ACPT_CMPLT_DATE\" data-name=\"l_ACPT_CMPLT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_ACPT_CMPLT_DATE())).append("</span>'");
 AE0090020view1_DB.append(",").append("'<span id=\"expj-AE0090020-AE0090020view1-l_INSPC_CMPLT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0090020-AE0090020view1-l_INSPC_CMPLT_DATE\" data-name=\"l_INSPC_CMPLT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0090020Struct.getl_INSPC_CMPLT_DATE())).append("</span>'");
 AE0090020view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAE0090020StructLength) {
   AE0090020view1_DB.append(",");
  }
 }
 aAE0090020Struct = structBackup;
 viewIdList.add(AE0090020view1_Id);
 viewSelectList.add(AE0090020view1_select);
 viewResizeList.add(AE0090020view1_resize);
 viewScrollList.add(AE0090020view1_scroll);
 viewHeaderDataList.add(AE0090020view1_HB);
 viewBodyDataList.add(AE0090020view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AE0090020-AE0090020button2">
expj.AE0090020.AE0090020button2 = {};
expj.AE0090020.AE0090020button2.executeAllOnDecision = function () {
  console.log('execute AE0090020button2.onDecision');
};
expj.AE0090020.AE0090020button2.executeOnLoad = function () {
  expj.AE0090020.AE0090020button2.executePScriptOnLoad();
};

expj.AE0090020.AE0090020button2.executePScriptOnLoad = function () {
  console.log('execute AE0090020button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0090020-AE0090020button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0090020-AE0090020button2-Button1">
expj.AE0090020.AE0090020button2.Button1 = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AE0090020view1/+@AE0010010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AE0090020.AE0090020button2.Button1.onClick0 = function () {
  console.log('Button1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090020', 'AE0090020button2', '_AE0090020view1/+', 'AE0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AE0010010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AE0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AE0090020');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0090020.AE0090020button2.Button1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020button2.Button1['onClick' + i])) {
        expj.AE0090020.AE0090020button2.Button1['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020button2.Button1.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020button2.Button1.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020button2-Button1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020button2', 'Button1', this, 'Button');
    }
  });
  expj.AE0090020.AE0090020button2.Button1.executePScriptOnLoad();
};

expj.AE0090020.AE0090020button2.Button1.executePScriptOnLoad = function () {
  console.log('execute AE0090020button2/Button1.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020button2-Button1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090020-AE0090020button2-Button1" name="Button1" class="AE0090020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnMaintenanceRequestOrderPlan",rb)%></button><!-- 発注計画メンテボタン --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020button2-Button2">
expj.AE0090020.AE0090020button2.Button2 = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AE0090020view1/+@AE0060010Servlet,<%=contextNo%>,<%=su2.getScreenName()%>,<%=su2.getScreenID()%>"
expj.AE0090020.AE0090020button2.Button2.onClick0 = function () {
  console.log('Button2 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090020', 'AE0090020button2', '_AE0090020view1/+', 'AE0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su2.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AE0060010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AE0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su2.getScreenName()%>', contents, 'AE0090020');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0090020.AE0090020button2.Button2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020button2.Button2['onClick' + i])) {
        expj.AE0090020.AE0090020button2.Button2['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020button2.Button2.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020button2.Button2.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020button2-Button2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020button2', 'Button2', this, 'Button');
    }
  });
  expj.AE0090020.AE0090020button2.Button2.executePScriptOnLoad();
};

expj.AE0090020.AE0090020button2.Button2.executePScriptOnLoad = function () {
  console.log('execute AE0090020button2/Button2.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020button2-Button2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090020-AE0090020button2-Button2" name="Button2" class="AE0090020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnAcceptEntry",rb)%></button><!-- 受入実績入力ボタン --></div><!--/td-->
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
<span class="version">AE0090020 Revision: 1.14  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AE0090020-AE0090020button0">
expj.AE0090020.AE0090020button0 = {};
expj.AE0090020.AE0090020button0.executeAllOnDecision = function () {
  console.log('execute AE0090020button0.onDecision');
};
expj.AE0090020.AE0090020button0.executeOnLoad = function () {
  expj.AE0090020.AE0090020button0.executePScriptOnLoad();
};

expj.AE0090020.AE0090020button0.executePScriptOnLoad = function () {
  console.log('execute AE0090020button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0090020-AE0090020button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0090020-AE0090020button0-CsvOut">
expj.AE0090020.AE0090020button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0090020form1/*@AE0090020Servlet,,$ZZ07011"
expj.AE0090020.AE0090020button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090020', 'AE0090020button0', '_AE0090020form1/*', 'AE0090020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0090020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0090020', response);
expj.common.updateBusinessScreenTab('AE0090020', contents);
};
expj.common.pscript.callConfirm('AE0090020', 'AE0090020button0', 'ZZ07011', okEvent);
};
expj.AE0090020.AE0090020button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020button0.CsvOut['onClick' + i])) {
        expj.AE0090020.AE0090020button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020button0.CsvOut.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020button0.CsvOut.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AE0090020.AE0090020button0.CsvOut.executePScriptOnLoad();
};

expj.AE0090020.AE0090020button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AE0090020button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090020-AE0090020button0-CsvOut" name="CsvOut" class="AE0090020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020button0-Clear">
expj.AE0090020.AE0090020button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0090020Servlet,,$ZZ07008"
expj.AE0090020.AE0090020button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090020', 'AE0090020button0', '', 'AE0090020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0090020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0090020', response);
expj.common.updateBusinessScreenTab('AE0090020', contents);
};
expj.common.pscript.callConfirm('AE0090020', 'AE0090020button0', 'ZZ07008', okEvent);
};
expj.AE0090020.AE0090020button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020button0.Clear['onClick' + i])) {
        expj.AE0090020.AE0090020button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020button0.Clear.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020button0.Clear.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0090020.AE0090020button0.Clear.executePScriptOnLoad();
};

expj.AE0090020.AE0090020button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0090020button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090020-AE0090020button0-Clear" name="Clear" class="AE0090020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AE0090020-AE0090020button0-Close">
expj.AE0090020.AE0090020button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0090020.AE0090020button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0090020');
};
expj.AE0090020.AE0090020button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090020.AE0090020button0.Close['onClick' + i])) {
        expj.AE0090020.AE0090020button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0090020.AE0090020button0.Close.executeAllOnDecision = function () {
};
expj.AE0090020.AE0090020button0.Close.executeOnLoad = function () {
  $('#expj-AE0090020-AE0090020button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090020', 'AE0090020button0', 'Close', this, 'Button');
    }
  });
  expj.AE0090020.AE0090020button0.Close.executePScriptOnLoad();
};

expj.AE0090020.AE0090020button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0090020button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0090020-AE0090020button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090020-AE0090020button0-Close" name="Close" class="AE0090020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0090020 (END)-->
<%
MessageStruct msgStruct = aAE0090020Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0090020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0090020)) {
  expj.common.treeInstanceMap.AE0090020 = {};
}
expj.common.treeInstanceMap.AE0090020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0090020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0090020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0090020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0090020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0090020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0090020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0090020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0090020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0090020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0090020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090020)) {
  expj.common.detailDialogMap.AE0090020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0090020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090020.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0090020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0090020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0090020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0090020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0090020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0090020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0090020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0090020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0090020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0090020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0090020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0090020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0090020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0090020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0090020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0090020)) {
  expj.common.viewInstanceMap.AE0090020 = {};
}
expj.common.viewInstanceMap.AE0090020.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0090020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0090020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0090020.<%=viewId %>.init = function () {
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
    expj.AE0090020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0090020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0090020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0090020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0090020_init">
/**
 * AE0090020用のロード完了時初期化関数
 */
expj.AE0090020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0090020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0090020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0090020');
  expj.common.calendarInstanceMap.AE0090020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0090020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0090020.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0090020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0090020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0090020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0090020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0090020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0090020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0090020-<%=detailId %>');
<%
 }
%>
  try{expj.AE0090020.AE0090020form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.PeekerCurCd.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.PeekerPuchOdrCd.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.c1_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.c2_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.PUCH_ODR_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.CalendarPuchOdrStartDate.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.PUCH_ODR_START_TIME.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.c3_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.c4_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.CalendarPuchOdrDlvDate.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.PUCH_ODR_DLV_TIME.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.c5_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.c6_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.PeekerJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.c7_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.c8_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.PUCH_ODR_PERSON.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.PeekerPuchOdrPerson.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020button1.Select.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020button2.Button1.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020button2.Button2.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020form1.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020button1.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020view1.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020button2.executeOnLoad();}catch(e){};
  try{expj.AE0090020.AE0090020button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0090020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0090020', 'AE0090020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0090020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0090020-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0090020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0090020', '<%=request.getContextPath() %>');
};

/**
 * AE0090020の全体onDecision処理
 */
expj.AE0090020.executeAllOnDecision = function () {
  expj.AE0090020.AE0090020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0090020_console">
expj.AE0090020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>