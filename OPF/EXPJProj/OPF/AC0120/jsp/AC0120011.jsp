<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:28:57 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0120\AC0120011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0120.*" %>
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
<jsp:useBean id="aAC0120010Control" class="com.nec.jp.orteus.metamorBase.AC0120.AC0120010Control" scope="request"/>
<jsp:useBean id="aAC0120010Struct" class="com.nec.jp.orteus.metamorBase.AC0120.AC0120010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

所要量メンテナンス（製番）
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0120/jsp/AC0120011.jsp,v $
$Author: geng-jia $	
$Revision: 1.20 $ $Date: 2017/02/22 02:04:33 $
********************************************************* --%>
<html>
<head>
<title>所要量メンテナンス（製番）</title>
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
<script class="expj-script-AC0120010_init">
  // AC0120010名前空間
  expj.AC0120010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<%
String kind = Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 1, Kind.FLOOR, 4);
if ("1".equals(aAC0120010Struct.geth_Sub1_UNIT_QTY_TYP())) {
	kind = Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 1, Kind.CEIL, 0);
}
%>
  <div id="expj-business-screen-AC0120010" data-screen="AC0120011" data-newdata="<%=aAC0120010Control.isNewData() %>">
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
 
            <div class="expj-td frame04" style=""></div><!--/td-->

            <div class="expj-td frame05" style=""> 
              <script class="expj-script-AC0120010-AC0120011form1">
expj.AC0120010.AC0120011form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5"
expj.AC0120010.AC0120011form1.onLoad0 = function () {
  console.log('AC0120011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script2="onDecision;0;CHK;_AC0120011form2/TIME_CTRL[eq]true@*0,*1"
expj.AC0120010.AC0120011form1.onDecision0 = function () {
  console.log('AC0120011form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AC0120011form2/Sub1_PRD_DUE_TIME,_AC0120011form2/Sub1_PRD_START_TIME,_AC0120011form2/Sub1_ODR_START_TIME"
expj.AC0120010.AC0120011form1.child0 = function () {
  console.log('AC0120011form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_DUE_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_START_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_START_TIME');
};
// script4="child;1;MASK;_AC0120011form2/Sub1_PRD_DUE_TIME,_AC0120011form2/Sub1_PRD_START_TIME,_AC0120011form2/Sub1_ODR_START_TIME"
expj.AC0120010.AC0120011form1.child1 = function () {
  console.log('AC0120011form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_DUE_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_START_TIME');
};
// script5="onDecision;1;MASK;_AC0120011button2/insert,_AC0120011button2/update"
expj.AC0120010.AC0120011form1.onDecision1 = function () {
  console.log('AC0120011form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011button2/update');
};
// script6="onDecision;2;CHK;<%=aAC0120010Control.getOperationMode()%>[eq]INSERT@*2,*13"
expj.AC0120010.AC0120011form1.onDecision2 = function () {
  console.log('AC0120011form1 script6');
if (expj.common.pscript.evaluate('<%=aAC0120010Control.getOperationMode()%>', '[eq]', 'INSERT')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script7="child;2;MASK;_AC0120011form2/c_JOB_ODR_DEL@*3"
expj.AC0120010.AC0120011form1.child2 = function () {
  console.log('AC0120011form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/c_JOB_ODR_DEL');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script8="child;3;CHK;?AC0120011form2/*[eq]NORMAL@*4"
expj.AC0120010.AC0120011form1.child3 = function () {
  console.log('AC0120011form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script9="child;4;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]4[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]5[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]6[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]7@*5,*6"
expj.AC0120010.AC0120011form1.child4 = function () {
  console.log('AC0120011form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '5') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '6') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '7')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;5;MASK;_AC0120011form2/Sub1_ITEM_SPOIL,_AC0120011form2/Sub1_ODR_QTY,_AC0120011form2/Sub1_PRD_DUE_DATE,_AC0120011form2/Sub1_PRD_DUE_TIME,_AC0120011form2/CalendarSub1PrdDueDate,_AC0120011form2/Sub1_PRD_START_DATE,_AC0120011form2/Sub1_PRD_START_TIME,_AC0120011form2/CalendarSub1PrdStartDate,_AC0120011form2/Sub1_ODR_START_DATE,_AC0120011form2/Sub1_ODR_START_TIME,_AC0120011form2/CalendarSub1OdrStartDate,_AC0120011form2/Sub1_OUTSIDE_TYP,_AC0120011form2/Sub1_ITEM_SPOIL@*8"
expj.AC0120010.AC0120011form1.child5 = function () {
  console.log('AC0120011form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ITEM_SPOIL');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_QTY');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_DUE_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_DUE_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1PrdDueDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1PrdStartDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1OdrStartDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_OUTSIDE_TYP');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ITEM_SPOIL');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script11="child;6;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]8@*7,*8"
expj.AC0120010.AC0120011form1.child6 = function () {
  console.log('AC0120011form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;MASK;_AC0120011button1/selectSub1,_AC0120011form2/Sub1_PS_UNIT_NUMERATOR,_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR,_AC0120011form2/Sub1_ITEM_SPOIL,_AC0120011form2/Sub1_ODR_QTY,_AC0120011form2/Sub1_PRD_DUE_DATE,_AC0120011form2/Sub1_PRD_DUE_TIME,_AC0120011form2/CalendarSub1PrdDueDate,_AC0120011form2/Sub1_PRD_START_DATE,_AC0120011form2/Sub1_PRD_START_TIME,_AC0120011form2/CalendarSub1PrdStartDate,_AC0120011form2/Sub1_ODR_START_DATE,_AC0120011form2/Sub1_ODR_START_TIME,_AC0120011form2/CalendarSub1OdrStartDate,_AC0120011form2/Sub1_OUTSIDE_TYP,_AC0120011form2/Sub1_ITEM_SPOIL,_AC0120011form2/Sub1_PS_SPOIL@*8"
expj.AC0120010.AC0120011form1.child7 = function () {
  console.log('AC0120011form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011button1/selectSub1');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_UNIT_NUMERATOR');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ITEM_SPOIL');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_QTY');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_DUE_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_DUE_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1PrdDueDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1PrdStartDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1OdrStartDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_OUTSIDE_TYP');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ITEM_SPOIL');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_SPOIL');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script13="child;8;CHK;?AC0120011form1/Sub1_Comp_ITEM_CD[eq]SAME@*9"
expj.AC0120010.AC0120011form1.child8 = function () {
  console.log('AC0120011form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form1/Sub1_Comp_ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script14="child;9;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]4[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]5[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]6[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]7[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]8@*11,*10"
expj.AC0120010.AC0120011form1.child9 = function () {
  console.log('AC0120011form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '5') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '6') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '7') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script15="child;10;CHKRQ;C@*11"
expj.AC0120010.AC0120011form1.child10 = function () {
  console.log('AC0120011form1 script15');
if (expj.common.pscript.satisfiedRequiredComponent('AC0120010', 'C')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script16="child;11;CHKRQ;B@*12"
expj.AC0120010.AC0120011form1.child11 = function () {
  console.log('AC0120011form1 script16');
if (expj.common.pscript.satisfiedRequiredComponent('AC0120010', 'B')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script17="child;12;UNMASK;_AC0120011button2/insert"
expj.AC0120010.AC0120011form1.child12 = function () {
  console.log('AC0120011form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011button2/insert');
};
// script18="child;13;UNMASK;_AC0120011form2/c_JOB_ODR_DEL@*14"
expj.AC0120010.AC0120011form1.child13 = function () {
  console.log('AC0120011form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/c_JOB_ODR_DEL');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script19="child;14;MASK;_AC0120011form1/Sub1_Comp_ITEM_CD,_AC0120011form1/PeekerItemCd,_AC0120011button1/selectSub1@*15"
expj.AC0120010.AC0120011form1.child14 = function () {
  console.log('AC0120011form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form1/Sub1_Comp_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form1/PeekerItemCd');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011button1/selectSub1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child15)){this.child15();}}
};
// script20="child;15;CHK;?AC0120011form2/*[eq]NORMAL@*16"
expj.AC0120010.AC0120011form1.child15 = function () {
  console.log('AC0120011form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script21="child;16;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]4[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]5[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]6[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]7@*17,*18"
expj.AC0120010.AC0120011form1.child16 = function () {
  console.log('AC0120011form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '5') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '6') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '7')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script22="child;17;MASK;_AC0120011form2/Sub1_ITEM_SPOIL,_AC0120011form2/Sub1_ODR_QTY,_AC0120011form2/Sub1_PRD_DUE_DATE,_AC0120011form2/Sub1_PRD_DUE_TIME,_AC0120011form2/CalendarSub1PrdDueDate,_AC0120011form2/Sub1_PRD_START_DATE,_AC0120011form2/Sub1_PRD_START_TIME,_AC0120011form2/CalendarSub1PrdStartDate,_AC0120011form2/Sub1_ODR_START_DATE,_AC0120011form2/Sub1_ODR_START_TIME,_AC0120011form2/CalendarSub1OdrStartDate,_AC0120011form2/Sub1_OUTSIDE_TYP,_AC0120011form2/Sub1_ITEM_SPOIL@*20"
expj.AC0120010.AC0120011form1.child17 = function () {
  console.log('AC0120011form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ITEM_SPOIL');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_QTY');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_DUE_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_DUE_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1PrdDueDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1PrdStartDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1OdrStartDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_OUTSIDE_TYP');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ITEM_SPOIL');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child20)){this.child20();}}
};
// script23="child;18;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]8@*19,*20"
expj.AC0120010.AC0120011form1.child18 = function () {
  console.log('AC0120011form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script24="child;19;MASK;_AC0120011form2/Sub1_PS_UNIT_NUMERATOR,_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR,_AC0120011form2/Sub1_ITEM_SPOIL,_AC0120011form2/Sub1_ODR_QTY,_AC0120011form2/Sub1_PRD_DUE_DATE,_AC0120011form2/Sub1_PRD_DUE_TIME,_AC0120011form2/CalendarSub1PrdDueDate,_AC0120011form2/Sub1_PRD_START_DATE,_AC0120011form2/Sub1_PRD_START_TIME,_AC0120011form2/CalendarSub1PrdStartDate,_AC0120011form2/Sub1_ODR_START_DATE,_AC0120011form2/Sub1_ODR_START_TIME,_AC0120011form2/CalendarSub1OdrStartDate,_AC0120011form2/Sub1_OUTSIDE_TYP,_AC0120011form2/Sub1_ITEM_SPOIL,_AC0120011form2/Sub1_PS_SPOIL,_AC0120011form2/Sub1_PS_UNIT_NUMERATOR,_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR@*20"
expj.AC0120010.AC0120011form1.child19 = function () {
  console.log('AC0120011form1 script24');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_UNIT_NUMERATOR');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ITEM_SPOIL');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_QTY');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_DUE_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_DUE_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1PrdDueDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1PrdStartDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1OdrStartDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_OUTSIDE_TYP');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ITEM_SPOIL');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_SPOIL');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_UNIT_NUMERATOR');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child20)){this.child20();}}
};
// script25="child;20;CHK;_AC0120011form2/h_Sub1_MANHOUR_TYP[eq]1@*21,*22"
expj.AC0120010.AC0120011form1.child20 = function () {
  console.log('AC0120011form1 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MANHOUR_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script26="child;21;MASK;_AC0120011form2/Sub1_PS_UNIT_NUMERATOR,_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR,_AC0120011form2/Sub1_PS_SPOIL,_AC0120011form2/Sub1_ODR_QTY,_AC0120011form2/Sub1_OUTSIDE_TYP,_AC0120011form2/Sub1_ITEM_SPOIL@*22"
expj.AC0120010.AC0120011form1.child21 = function () {
  console.log('AC0120011form1 script26');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_UNIT_NUMERATOR');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_SPOIL');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_QTY');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_OUTSIDE_TYP');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ITEM_SPOIL');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child22)){this.child22();}}
};
// script27="child;22;CHK;?AC0120011form2/Sub1_PS_UNIT_NUMERATOR[neq]SAME[or]?AC0120011form2/Sub1_PS_UNIT_NUMERATOR[neq]SAME[or]?AC0120011form2/Sub1_PS_UNIT_DENOMINATOR[neq]SAME[or]?AC0120011form2/Sub1_PS_SPOIL[neq]SAME[or]?AC0120011form2/Sub1_DM_QTY[neq]SAME[or]?AC0120011form2/Sub1_ODR_QTY[neq]SAME[or]?AC0120011form2/Sub1_PRD_DUE_DATE[neq]SAME[or]?AC0120011form2/Sub1_PRD_DUE_TIME[neq]SAME[or]?AC0120011form2/Sub1_PRD_START_DATE[neq]SAME[or]?AC0120011form2/Sub1_PRD_START_TIME[neq]SAME[or]?AC0120011form2/Sub1_ODR_START_DATE[neq]SAME[or]?AC0120011form2/Sub1_ODR_START_TIME[neq]SAME[or]?AC0120011form2/Sub1_OUTSIDE_TYP[neq]SAME[or]?AC0120011form2/Sub1_MRP_ODR_TYP_DN[neq]SAME[or]?AC0120011form2/Sub1_ITEM_SPOIL[neq]SAME[or]?AC0120011form2/c_JOB_ODR_DEL[neq]SAME@*23"
expj.AC0120010.AC0120011form1.child22 = function () {
  console.log('AC0120011form1 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_PS_UNIT_NUMERATOR'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_PS_UNIT_NUMERATOR'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_PS_UNIT_DENOMINATOR'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_PS_SPOIL'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_DM_QTY'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_ODR_QTY'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_PRD_DUE_DATE'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_PRD_DUE_TIME'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_PRD_START_DATE'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_PRD_START_TIME'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_ODR_START_DATE'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_ODR_START_TIME'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_OUTSIDE_TYP'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_MRP_ODR_TYP_DN'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/Sub1_ITEM_SPOIL'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '?AC0120011form2/c_JOB_ODR_DEL'), '[neq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script28="child;23;CHK;_AC0120011form2/c_JOB_ODR_DEL[eq]true@*26,*24"
expj.AC0120010.AC0120011form1.child23 = function () {
  console.log('AC0120011form1 script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/c_JOB_ODR_DEL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
} else {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script29="child;24;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]4[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]5[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]6[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]7[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]8@*26,*25"
expj.AC0120010.AC0120011form1.child24 = function () {
  console.log('AC0120011form1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '5') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '6') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '7') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
} else {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
}
};
// script30="child;25;CHKRQ;C@*26"
expj.AC0120010.AC0120011form1.child25 = function () {
  console.log('AC0120011form1 script30');
if (expj.common.pscript.satisfiedRequiredComponent('AC0120010', 'C')) {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script31="child;26;CHKRQ;B@*27"
expj.AC0120010.AC0120011form1.child26 = function () {
  console.log('AC0120011form1 script31');
if (expj.common.pscript.satisfiedRequiredComponent('AC0120010', 'B')) {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script32="child;27;UNMASK;_AC0120011button2/update"
expj.AC0120010.AC0120011form1.child27 = function () {
  console.log('AC0120011form1 script32');
expj.common.pscript.setUnMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011button2/update');
};
// script33="onDecision;3;CHK;<%=aAC0120010Control.getOperationMode()%>[eq]INSERT@*28,*30"
expj.AC0120010.AC0120011form1.onDecision3 = function () {
  console.log('AC0120011form1 script33');
if (expj.common.pscript.evaluate('<%=aAC0120010Control.getOperationMode()%>', '[eq]', 'INSERT')) {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
} else {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
}
};
// script34="child;28;CHKRQ;B@*29,*30"
expj.AC0120010.AC0120011form1.child28 = function () {
  console.log('AC0120011form1 script34');
if (expj.common.pscript.satisfiedRequiredComponent('AC0120010', 'B')) {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
} else {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
}
};
// script35="child;29;UNMASK;_AC0120011button1/selectSub1"
expj.AC0120010.AC0120011form1.child29 = function () {
  console.log('AC0120011form1 script35');
expj.common.pscript.setUnMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011button1/selectSub1');
};
// script36="child;30;MASK;_AC0120011button1/selectSub1"
expj.AC0120010.AC0120011form1.child30 = function () {
  console.log('AC0120011form1 script36');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011button1/selectSub1');
};
// script37="onDecision;4;MASK;_AC0120011form2/CalendarSub1DueDateFrom,_AC0120011form2/Sub1_DUE_TIME"
expj.AC0120010.AC0120011form1.onDecision4 = function () {
  console.log('AC0120011form1 script37');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1DueDateFrom');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_DUE_TIME');
};
// script38="onDecision;5;CHK;_AC0120011form1/h_DM_STS_TYP[eq]2[or]_AC0120011form1/h_ODR_STS_TYP[eq]2@*31,*32"
expj.AC0120010.AC0120011form1.onDecision5 = function () {
  console.log('AC0120011form1 script38');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form1/h_DM_STS_TYP'), '[eq]', '2') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form1/h_ODR_STS_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
} else {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
}
};
// script39="child;31;MASK;_AC0120011form2/Sub1_PS_UNIT_NUMERATOR,_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR,_AC0120011form2/Sub1_ITEM_SPOIL,_AC0120011form2/Sub1_ODR_QTY,_AC0120011form2/Sub1_PRD_DUE_DATE,_AC0120011form2/Sub1_PRD_DUE_TIME,_AC0120011form2/CalendarSub1PrdDueDate,_AC0120011form2/Sub1_PRD_START_DATE,_AC0120011form2/Sub1_PRD_START_TIME,_AC0120011form2/CalendarSub1PrdStartDate,_AC0120011form2/Sub1_ODR_START_DATE,_AC0120011form2/Sub1_ODR_START_TIME,_AC0120011form2/CalendarSub1OdrStartDate,_AC0120011form2/Sub1_OUTSIDE_TYP,_AC0120011form2/Sub1_ITEM_SPOIL,_AC0120011form2/Sub1_PS_SPOIL,_AC0120011form2/Sub1_PS_UNIT_NUMERATOR,_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR"
expj.AC0120010.AC0120011form1.child31 = function () {
  console.log('AC0120011form1 script39');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_UNIT_NUMERATOR');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ITEM_SPOIL');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_QTY');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_DUE_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_DUE_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1PrdDueDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PRD_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1PrdStartDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ODR_START_TIME');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/CalendarSub1OdrStartDate');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_OUTSIDE_TYP');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_ITEM_SPOIL');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_SPOIL');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_UNIT_NUMERATOR');
expj.common.pscript.setMaskToReferenceComponent('AC0120010', 'AC0120011form1', '_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR');
};
expj.AC0120010.AC0120011form1.executeAllOnDecision = function () {
  console.log('execute AC0120011form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120011form1['onDecision' + i])) {
        expj.AC0120010.AC0120011form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120011form1.executeOnLoad = function () {
  expj.AC0120010.AC0120011form1.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0120010.AC0120011form1['onLoad' + i])) {
      expj.AC0120010.AC0120011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0120010-AC0120011form1" action="AC0120010Servlet" name="AC0120011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAC0120010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form1-JOB_ODR_CD">
expj.AC0120010.AC0120011form1.JOB_ODR_CD = {};
expj.AC0120010.AC0120011form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/JOB_ODR_CD.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'JOB_ODR_CD', this);
  });
  expj.AC0120010.AC0120011form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AC0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getJOB_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form1-h_Sub1_Parent_ALC_GRP_CD" name="h_Sub1_Parent_ALC_GRP_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_Sub1_Parent_ALC_GRP_CD()) %>">
<script class="expj-script-AC0120010-AC0120011form1-h_Sub1_Parent_ALC_GRP_CD">
expj.AC0120010.AC0120011form1.h_Sub1_Parent_ALC_GRP_CD = {};
expj.AC0120010.AC0120011form1.h_Sub1_Parent_ALC_GRP_CD.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/h_Sub1_Parent_ALC_GRP_CD.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.h_Sub1_Parent_ALC_GRP_CD.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-h_Sub1_Parent_ALC_GRP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'h_Sub1_Parent_ALC_GRP_CD', this);
  });
  expj.AC0120010.AC0120011form1.h_Sub1_Parent_ALC_GRP_CD.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.h_Sub1_Parent_ALC_GRP_CD.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/h_Sub1_Parent_ALC_GRP_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-h_Sub1_Parent_ALC_GRP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form1-h_Sub1_Parent_ODR_START_DATE" name="h_Sub1_Parent_ODR_START_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_Sub1_Parent_ODR_START_DATE()) %>">
<script class="expj-script-AC0120010-AC0120011form1-h_Sub1_Parent_ODR_START_DATE">
expj.AC0120010.AC0120011form1.h_Sub1_Parent_ODR_START_DATE = {};
expj.AC0120010.AC0120011form1.h_Sub1_Parent_ODR_START_DATE.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/h_Sub1_Parent_ODR_START_DATE.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.h_Sub1_Parent_ODR_START_DATE.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-h_Sub1_Parent_ODR_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'h_Sub1_Parent_ODR_START_DATE', this);
  });
  expj.AC0120010.AC0120011form1.h_Sub1_Parent_ODR_START_DATE.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.h_Sub1_Parent_ODR_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/h_Sub1_Parent_ODR_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-h_Sub1_Parent_ODR_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form1-h_Sub1_Parent_OD_LEVEL_NO" name="h_Sub1_Parent_OD_LEVEL_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_Sub1_Parent_OD_LEVEL_NO()) %>">
<script class="expj-script-AC0120010-AC0120011form1-h_Sub1_Parent_OD_LEVEL_NO">
expj.AC0120010.AC0120011form1.h_Sub1_Parent_OD_LEVEL_NO = {};
expj.AC0120010.AC0120011form1.h_Sub1_Parent_OD_LEVEL_NO.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/h_Sub1_Parent_OD_LEVEL_NO.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.h_Sub1_Parent_OD_LEVEL_NO.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-h_Sub1_Parent_OD_LEVEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'h_Sub1_Parent_OD_LEVEL_NO', this);
  });
  expj.AC0120010.AC0120011form1.h_Sub1_Parent_OD_LEVEL_NO.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.h_Sub1_Parent_OD_LEVEL_NO.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/h_Sub1_Parent_OD_LEVEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-h_Sub1_Parent_OD_LEVEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form1-JOB_ODR_CANCEL_NO" name="JOB_ODR_CANCEL_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getJOB_ODR_CANCEL_NO()) %>">
<script class="expj-script-AC0120010-AC0120011form1-JOB_ODR_CANCEL_NO">
expj.AC0120010.AC0120011form1.JOB_ODR_CANCEL_NO = {};
expj.AC0120010.AC0120011form1.JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/JOB_ODR_CANCEL_NO.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'JOB_ODR_CANCEL_NO', this);
  });
  expj.AC0120010.AC0120011form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/JOB_ODR_CANCEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-JOB_ODR_CANCEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PARENT_ITEM_CD",rb)%></span><!-- 親品目番号 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form1-Sub1_Parent_ITEM_CD">
expj.AC0120010.AC0120011form1.Sub1_Parent_ITEM_CD = {};
expj.AC0120010.AC0120011form1.Sub1_Parent_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/Sub1_Parent_ITEM_CD.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.Sub1_Parent_ITEM_CD.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-Sub1_Parent_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'Sub1_Parent_ITEM_CD', this);
  });
  expj.AC0120010.AC0120011form1.Sub1_Parent_ITEM_CD.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.Sub1_Parent_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/Sub1_Parent_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-Sub1_Parent_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form1-Sub1_Parent_ITEM_CD" name="Sub1_Parent_ITEM_CD" class="AC0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_Parent_ITEM_CD()) %>" maxlength="25" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form1-h_DM_STS_TYP" name="h_DM_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_DM_STS_TYP()) %>">
<script class="expj-script-AC0120010-AC0120011form1-h_DM_STS_TYP">
expj.AC0120010.AC0120011form1.h_DM_STS_TYP = {};
expj.AC0120010.AC0120011form1.h_DM_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/h_DM_STS_TYP.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.h_DM_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-h_DM_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'h_DM_STS_TYP', this);
  });
  expj.AC0120010.AC0120011form1.h_DM_STS_TYP.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.h_DM_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/h_DM_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-h_DM_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form1-Sub1_Parent_ITEM_NAME">
expj.AC0120010.AC0120011form1.Sub1_Parent_ITEM_NAME = {};
expj.AC0120010.AC0120011form1.Sub1_Parent_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/Sub1_Parent_ITEM_NAME.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.Sub1_Parent_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-Sub1_Parent_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'Sub1_Parent_ITEM_NAME', this);
  });
  expj.AC0120010.AC0120011form1.Sub1_Parent_ITEM_NAME.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.Sub1_Parent_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/Sub1_Parent_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-Sub1_Parent_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form1-Sub1_Parent_ITEM_NAME" name="Sub1_Parent_ITEM_NAME" class="AC0120010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_Parent_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form1-h_Sub1_Parent_ODR_QTY" name="h_Sub1_Parent_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_Sub1_Parent_ODR_QTY()) %>">
<script class="expj-script-AC0120010-AC0120011form1-h_Sub1_Parent_ODR_QTY">
expj.AC0120010.AC0120011form1.h_Sub1_Parent_ODR_QTY = {};
expj.AC0120010.AC0120011form1.h_Sub1_Parent_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/h_Sub1_Parent_ODR_QTY.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.h_Sub1_Parent_ODR_QTY.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-h_Sub1_Parent_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'h_Sub1_Parent_ODR_QTY', this);
  });
  expj.AC0120010.AC0120011form1.h_Sub1_Parent_ODR_QTY.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.h_Sub1_Parent_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/h_Sub1_Parent_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-h_Sub1_Parent_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form1-OD_NO" name="OD_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getOD_NO()) %>">
<script class="expj-script-AC0120010-AC0120011form1-OD_NO">
expj.AC0120010.AC0120011form1.OD_NO = {};
expj.AC0120010.AC0120011form1.OD_NO.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/OD_NO.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.OD_NO.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'OD_NO', this);
  });
  expj.AC0120010.AC0120011form1.OD_NO.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.OD_NO.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-OD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.COMP_ITEM_CD",rb)%></span><!-- 子品目番号 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form1-Sub1_Comp_ITEM_CD">
expj.AC0120010.AC0120011form1.Sub1_Comp_ITEM_CD = {};
expj.AC0120010.AC0120011form1.Sub1_Comp_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/Sub1_Comp_ITEM_CD.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.Sub1_Comp_ITEM_CD.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-Sub1_Comp_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'Sub1_Comp_ITEM_CD', this);
  });
  expj.AC0120010.AC0120011form1.Sub1_Comp_ITEM_CD.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.Sub1_Comp_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/Sub1_Comp_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-Sub1_Comp_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form1-Sub1_Comp_ITEM_CD" name="Sub1_Comp_ITEM_CD" class="AC0120010-focus-move  required-value expj-AC0120010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_Comp_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form1-PeekerItemCd">
expj.AC0120010.AC0120011form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AC0120011form1/Sub1_Comp_ITEM_CD@<%=contextNo%>"
expj.AC0120010.AC0120011form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0120010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form1', '_AC0120011form1/Sub1_Comp_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_10%&%';
parameterValues += 'TARGET_FIELD%=%_AC0120011form1/Sub1_Comp_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0120010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0120010.AC0120011form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120011form1.PeekerItemCd['onClick' + i])) {
        expj.AC0120010.AC0120011form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120011form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120011form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120011form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AC0120010.AC0120011form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0120010-AC0120011form1-PeekerItemCd" class="AC0120010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form1-Sub1_Comp_ITEM_NAME">
expj.AC0120010.AC0120011form1.Sub1_Comp_ITEM_NAME = {};
expj.AC0120010.AC0120011form1.Sub1_Comp_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/Sub1_Comp_ITEM_NAME.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.Sub1_Comp_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-Sub1_Comp_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'Sub1_Comp_ITEM_NAME', this);
  });
  expj.AC0120010.AC0120011form1.Sub1_Comp_ITEM_NAME.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.Sub1_Comp_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/Sub1_Comp_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-Sub1_Comp_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form1-Sub1_Comp_ITEM_NAME" name="Sub1_Comp_ITEM_NAME" class="AC0120010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_Comp_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form1-h_ODR_STS_TYP" name="h_ODR_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_ODR_STS_TYP()) %>">
<script class="expj-script-AC0120010-AC0120011form1-h_ODR_STS_TYP">
expj.AC0120010.AC0120011form1.h_ODR_STS_TYP = {};
expj.AC0120010.AC0120011form1.h_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/h_ODR_STS_TYP.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.h_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-h_ODR_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'h_ODR_STS_TYP', this);
  });
  expj.AC0120010.AC0120011form1.h_ODR_STS_TYP.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.h_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/h_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-h_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AC0120010-AC0120011form1-h_Parent_OD_MODIFY_COUNT" name="h_Parent_OD_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_Parent_OD_MODIFY_COUNT()) %>">
<script class="expj-script-AC0120010-AC0120011form1-h_Parent_OD_MODIFY_COUNT">
expj.AC0120010.AC0120011form1.h_Parent_OD_MODIFY_COUNT = {};
expj.AC0120010.AC0120011form1.h_Parent_OD_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/h_Parent_OD_MODIFY_COUNT.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.h_Parent_OD_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-h_Parent_OD_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'h_Parent_OD_MODIFY_COUNT', this);
  });
  expj.AC0120010.AC0120011form1.h_Parent_OD_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.h_Parent_OD_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/h_Parent_OD_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-h_Parent_OD_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form1-InitLevel" name="InitLevel" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getInitLevel()) %>">
<script class="expj-script-AC0120010-AC0120011form1-InitLevel">
expj.AC0120010.AC0120011form1.InitLevel = {};
expj.AC0120010.AC0120011form1.InitLevel.executeAllOnDecision = function () {
  console.log('execute AC0120011form1/InitLevel.onDecision');
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form1.InitLevel.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form1-InitLevel').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form1', 'InitLevel', this);
  });
  expj.AC0120010.AC0120011form1.InitLevel.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form1.InitLevel.executePScriptOnLoad = function () {
  console.log('execute AC0120011form1/InitLevel.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form1-InitLevel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style=""></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0120010-AC0120011button1">
expj.AC0120010.AC0120011button1 = {};
expj.AC0120010.AC0120011button1.executeAllOnDecision = function () {
  console.log('execute AC0120011button1.onDecision');
};
expj.AC0120010.AC0120011button1.executeOnLoad = function () {
  expj.AC0120010.AC0120011button1.executePScriptOnLoad();
};

expj.AC0120010.AC0120011button1.executePScriptOnLoad = function () {
  console.log('execute AC0120011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0120010-AC0120011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0120010-AC0120011button1-selectSub1">
expj.AC0120010.AC0120011button1.selectSub1 = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0120011form1/*@AC0120010Servlet"
expj.AC0120010.AC0120011button1.selectSub1.onClick0 = function () {
  console.log('selectSub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0120010', 'AC0120011button1', '_AC0120011form1/*', 'AC0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0120010', response);
expj.common.updateBusinessScreenTab('AC0120010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0120010.AC0120011button1.selectSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120011button1.selectSub1['onClick' + i])) {
        expj.AC0120010.AC0120011button1.selectSub1['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120011button1.selectSub1.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120011button1.selectSub1.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011button1-selectSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120011button1', 'selectSub1', this, 'Button');
    }
  });
  expj.AC0120010.AC0120011button1.selectSub1.executePScriptOnLoad();
};

expj.AC0120010.AC0120011button1.selectSub1.executePScriptOnLoad = function () {
  console.log('execute AC0120011button1/selectSub1.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011button1-selectSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0120010-AC0120011button1-selectSub1" name="selectSub1" class="AC0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style=""></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AC0120010-AC0120011form2">
expj.AC0120010.AC0120011form2 = {};
expj.AC0120010.AC0120011form2.executeAllOnDecision = function () {
  console.log('execute AC0120011form2.onDecision');
};
expj.AC0120010.AC0120011form2.executeOnLoad = function () {
  expj.AC0120010.AC0120011form2.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0120010-AC0120011form2" action="AC0120010Servlet" name="AC0120011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAC0120010Control.getReadStatusString()) %>" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:right"></div>
<div class="div-td" style="width:20px;align:"></div>
<div class="div-td" style="width:130px;align:"></div>
<div class="div-td" style="width:20px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_DRAW_CD">
expj.AC0120010.AC0120011form2.Sub1_DRAW_CD = {};
expj.AC0120010.AC0120011form2.Sub1_DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_DRAW_CD.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_DRAW_CD.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_DRAW_CD', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_DRAW_CD.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_DRAW_CD" name="Sub1_DRAW_CD" class="AC0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_DRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:130px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form2-h_Comp_ITEM_MODIFY_COUNT" name="h_Comp_ITEM_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_Comp_ITEM_MODIFY_COUNT()) %>">
<script class="expj-script-AC0120010-AC0120011form2-h_Comp_ITEM_MODIFY_COUNT">
expj.AC0120010.AC0120011form2.h_Comp_ITEM_MODIFY_COUNT = {};
expj.AC0120010.AC0120011form2.h_Comp_ITEM_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/h_Comp_ITEM_MODIFY_COUNT.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.h_Comp_ITEM_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-h_Comp_ITEM_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'h_Comp_ITEM_MODIFY_COUNT', this);
  });
  expj.AC0120010.AC0120011form2.h_Comp_ITEM_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.h_Comp_ITEM_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/h_Comp_ITEM_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-h_Comp_ITEM_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_SPEC">
expj.AC0120010.AC0120011form2.Sub1_SPEC = {};
expj.AC0120010.AC0120011form2.Sub1_SPEC.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_SPEC.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_SPEC.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_SPEC', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_SPEC.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_SPEC.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_SPEC" name="Sub1_SPEC" class="AC0120010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_SPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PS_UNIT_QTY",rb)%></span><!-- 製品構成単位数 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_PS_UNIT_NUMERATOR">
expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_NUMERATOR = {};
// script1="onDecision;0;SET;_AC0120011form2/h_Sub1_PS_UNIT_QTY=[{_AC0120011form2/Sub1_PS_UNIT_NUMERATOR}/{_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR}]"
expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_NUMERATOR.onDecision0 = function () {
  console.log('Sub1_PS_UNIT_NUMERATOR script1');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/h_Sub1_PS_UNIT_QTY', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/Sub1_PS_UNIT_NUMERATOR') + '/' + expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR')));
};
// script2="onDecision;1;SET;_AC0120011form2/Sub1_DM_QTY=[{_AC0120011form1/h_Sub1_Parent_ODR_QTY}*{_h_Sub1_PS_UNIT_QTY}*(1+{_AC0120011form2/Sub1_PS_SPOIL}/100)]"
expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_NUMERATOR.onDecision1 = function () {
  console.log('Sub1_PS_UNIT_NUMERATOR script2');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/Sub1_DM_QTY', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form1/h_Sub1_Parent_ODR_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_h_Sub1_PS_UNIT_QTY') + '*(1+' + expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/Sub1_PS_SPOIL') + '/100)'));
};
expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_NUMERATOR.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_PS_UNIT_NUMERATOR.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_NUMERATOR['onDecision' + i])) {
        expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_NUMERATOR['onDecision' + i]();
      }
    }
  }
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_NUMERATOR.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_PS_UNIT_NUMERATOR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_PS_UNIT_NUMERATOR', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_NUMERATOR.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_NUMERATOR.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_PS_UNIT_NUMERATOR.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_PS_UNIT_NUMERATOR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_PS_UNIT_NUMERATOR" name="Sub1_PS_UNIT_NUMERATOR" class="AC0120010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_PS_UNIT_NUMERATOR()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0005",rb)%></span><!-- ／ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_PS_UNIT_DENOMINATOR">
expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_DENOMINATOR = {};
// script1="onDecision;0;SET;_AC0120011form2/h_Sub1_PS_UNIT_QTY=[{_AC0120011form2/Sub1_PS_UNIT_NUMERATOR}/{_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR}]"
expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_DENOMINATOR.onDecision0 = function () {
  console.log('Sub1_PS_UNIT_DENOMINATOR script1');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/h_Sub1_PS_UNIT_QTY', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/Sub1_PS_UNIT_NUMERATOR') + '/' + expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR')));
};
// script2="onDecision;1;SET;_AC0120011form2/Sub1_DM_QTY=[{_AC0120011form1/h_Sub1_Parent_ODR_QTY}*{_h_Sub1_PS_UNIT_QTY}*(1+{_AC0120011form2/Sub1_PS_SPOIL}/100)]"
expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_DENOMINATOR.onDecision1 = function () {
  console.log('Sub1_PS_UNIT_DENOMINATOR script2');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/Sub1_DM_QTY', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form1/h_Sub1_Parent_ODR_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_h_Sub1_PS_UNIT_QTY') + '*(1+' + expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/Sub1_PS_SPOIL') + '/100)'));
};
expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_DENOMINATOR.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_PS_UNIT_DENOMINATOR.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_DENOMINATOR['onDecision' + i])) {
        expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_DENOMINATOR['onDecision' + i]();
      }
    }
  }
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_DENOMINATOR.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_PS_UNIT_DENOMINATOR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_PS_UNIT_DENOMINATOR', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_DENOMINATOR.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_DENOMINATOR.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_PS_UNIT_DENOMINATOR.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_PS_UNIT_DENOMINATOR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_PS_UNIT_DENOMINATOR" name="Sub1_PS_UNIT_DENOMINATOR" class="AC0120010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_PS_UNIT_DENOMINATOR()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_STOCK_UNIT">
expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT = {};
expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_STOCK_UNIT.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_STOCK_UNIT', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_STOCK_UNIT" name="Sub1_STOCK_UNIT" class="AC0120010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_STOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PS_SPOIL",rb)%></span><!-- 構成仕損率 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_PS_SPOIL">
expj.AC0120010.AC0120011form2.Sub1_PS_SPOIL = {};
// script1="onDecision;0;SET;_AC0120011form2/h_Sub1_PS_UNIT_QTY=[{_AC0120011form2/Sub1_PS_UNIT_NUMERATOR}/{_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR}]"
expj.AC0120010.AC0120011form2.Sub1_PS_SPOIL.onDecision0 = function () {
  console.log('Sub1_PS_SPOIL script1');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/h_Sub1_PS_UNIT_QTY', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/Sub1_PS_UNIT_NUMERATOR') + '/' + expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/Sub1_PS_UNIT_DENOMINATOR')));
};
// script2="onDecision;1;SET;_AC0120011form2/Sub1_DM_QTY=[{_AC0120011form1/h_Sub1_Parent_ODR_QTY}*{_h_Sub1_PS_UNIT_QTY}*(1+{_AC0120011form2/Sub1_PS_SPOIL}/100)]"
expj.AC0120010.AC0120011form2.Sub1_PS_SPOIL.onDecision1 = function () {
  console.log('Sub1_PS_SPOIL script2');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/Sub1_DM_QTY', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form1/h_Sub1_Parent_ODR_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_h_Sub1_PS_UNIT_QTY') + '*(1+' + expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/Sub1_PS_SPOIL') + '/100)'));
};
expj.AC0120010.AC0120011form2.Sub1_PS_SPOIL.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_PS_SPOIL.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120011form2.Sub1_PS_SPOIL['onDecision' + i])) {
        expj.AC0120010.AC0120011form2.Sub1_PS_SPOIL['onDecision' + i]();
      }
    }
  }
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_PS_SPOIL.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_PS_SPOIL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_PS_SPOIL', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_PS_SPOIL.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_PS_SPOIL.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_PS_SPOIL.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_PS_SPOIL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_PS_SPOIL" name="Sub1_PS_SPOIL" class="AC0120010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_PS_SPOIL()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:130px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form2-h_Sub1_PS_UNIT_QTY" name="h_Sub1_PS_UNIT_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_Sub1_PS_UNIT_QTY()) %>">
<script class="expj-script-AC0120010-AC0120011form2-h_Sub1_PS_UNIT_QTY">
expj.AC0120010.AC0120011form2.h_Sub1_PS_UNIT_QTY = {};
expj.AC0120010.AC0120011form2.h_Sub1_PS_UNIT_QTY.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/h_Sub1_PS_UNIT_QTY.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.h_Sub1_PS_UNIT_QTY.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-h_Sub1_PS_UNIT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'h_Sub1_PS_UNIT_QTY', this);
  });
  expj.AC0120010.AC0120011form2.h_Sub1_PS_UNIT_QTY.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.h_Sub1_PS_UNIT_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/h_Sub1_PS_UNIT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-h_Sub1_PS_UNIT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REQ_PRD_QTY",rb)%></span><!-- 要求数 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_DM_QTY">
expj.AC0120010.AC0120011form2.Sub1_DM_QTY = {};
expj.AC0120010.AC0120011form2.Sub1_DM_QTY.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_DM_QTY.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_DM_QTY.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_DM_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_DM_QTY', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_DM_QTY.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_DM_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_DM_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_DM_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_DM_QTY" name="Sub1_DM_QTY" class="AC0120010-focus-move expj-align-right " style="width:150px;" data-kind="<%= kind %>" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_DM_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_STOCK_UNIT_1">
expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_1.onLoad0 = function () {
  console.log('Sub1_STOCK_UNIT_1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AC0120011form2/Sub1_STOCK_UNIT"
expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_1.child0 = function () {
  console.log('Sub1_STOCK_UNIT_1 script2');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011form2', '_THIS', expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/Sub1_STOCK_UNIT'));
};
expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_1.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_STOCK_UNIT_1.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_1.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_STOCK_UNIT_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_STOCK_UNIT_1', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_1.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_1.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_STOCK_UNIT_1.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_STOCK_UNIT_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_1['onLoad' + i])) {
      expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_STOCK_UNIT_1" name="Sub1_STOCK_UNIT_1" class="AC0120010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:130px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form2-h_Sub1_ISSUE_TYP" name="h_Sub1_ISSUE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_Sub1_ISSUE_TYP()) %>">
<script class="expj-script-AC0120010-AC0120011form2-h_Sub1_ISSUE_TYP">
expj.AC0120010.AC0120011form2.h_Sub1_ISSUE_TYP = {};
expj.AC0120010.AC0120011form2.h_Sub1_ISSUE_TYP.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/h_Sub1_ISSUE_TYP.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.h_Sub1_ISSUE_TYP.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-h_Sub1_ISSUE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'h_Sub1_ISSUE_TYP', this);
  });
  expj.AC0120010.AC0120011form2.h_Sub1_ISSUE_TYP.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.h_Sub1_ISSUE_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/h_Sub1_ISSUE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-h_Sub1_ISSUE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_QTY_1",rb)%></span><!-- 手配数 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_ODR_QTY">
expj.AC0120010.AC0120011form2.Sub1_ODR_QTY = {};
expj.AC0120010.AC0120011form2.Sub1_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_ODR_QTY.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_ODR_QTY.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_ODR_QTY', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_ODR_QTY.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_ODR_QTY" name="Sub1_ODR_QTY" class="AC0120010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_ODR_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_STOCK_UNIT_2">
expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_2 = {};
// script1="onLoad;0;CALL;child@0"
expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_2.onLoad0 = function () {
  console.log('Sub1_STOCK_UNIT_2 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AC0120011form2/Sub1_STOCK_UNIT"
expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_2.child0 = function () {
  console.log('Sub1_STOCK_UNIT_2 script2');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011form2', '_THIS', expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011form2', '_AC0120011form2/Sub1_STOCK_UNIT'));
};
expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_2.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_STOCK_UNIT_2.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_2.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_STOCK_UNIT_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_STOCK_UNIT_2', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_2.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_2.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_STOCK_UNIT_2.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_STOCK_UNIT_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_2['onLoad' + i])) {
      expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_2['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_STOCK_UNIT_2" name="Sub1_STOCK_UNIT_2" class="AC0120010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:130px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form2-h_BUSINESS_OPR_DATE" name="h_BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_BUSINESS_OPR_DATE()) %>">
<script class="expj-script-AC0120010-AC0120011form2-h_BUSINESS_OPR_DATE">
expj.AC0120010.AC0120011form2.h_BUSINESS_OPR_DATE = {};
expj.AC0120010.AC0120011form2.h_BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/h_BUSINESS_OPR_DATE.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.h_BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-h_BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'h_BUSINESS_OPR_DATE', this);
  });
  expj.AC0120010.AC0120011form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/h_BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-h_BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DUE_DATE",rb)%></span><!-- 要求納期 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_DUE_DATE">
expj.AC0120010.AC0120011form2.Sub1_DUE_DATE = {};
expj.AC0120010.AC0120011form2.Sub1_DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_DUE_DATE.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_DUE_DATE.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_DUE_DATE', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_DUE_DATE.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_DUE_DATE" name="Sub1_DUE_DATE" class="AC0120010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_DUE_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-CalendarSub1DueDateFrom">
expj.AC0120010.AC0120011form2.CalendarSub1DueDateFrom = {};
// script1="onClick;0;CALENDAR;_AC0120011form2/Sub1_DUE_DATE"
expj.AC0120010.AC0120011form2.CalendarSub1DueDateFrom.onClick0 = function () {
  console.log('CalendarSub1DueDateFrom script1');
expj.common.pscript.executeCalendar('AC0120010','AC0120011form2','_AC0120011form2/Sub1_DUE_DATE');
};
expj.AC0120010.AC0120011form2.CalendarSub1DueDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120011form2.CalendarSub1DueDateFrom['onClick' + i])) {
        expj.AC0120010.AC0120011form2.CalendarSub1DueDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120011form2.CalendarSub1DueDateFrom.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120011form2.CalendarSub1DueDateFrom.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-CalendarSub1DueDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120011form2', 'CalendarSub1DueDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0120010','AC0120011form2','_AC0120011form2/Sub1_DUE_DATE');
  expj.AC0120010.AC0120011form2.CalendarSub1DueDateFrom.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.CalendarSub1DueDateFrom.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/CalendarSub1DueDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-CalendarSub1DueDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0120010-AC0120011form2-CalendarSub1DueDateFrom" class="AC0120010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_DUE_TIME">
expj.AC0120010.AC0120011form2.Sub1_DUE_TIME = {};
expj.AC0120010.AC0120011form2.Sub1_DUE_TIME.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_DUE_TIME.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_DUE_TIME.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_DUE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_DUE_TIME', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_DUE_TIME.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_DUE_TIME.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_DUE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_DUE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_DUE_TIME" name="Sub1_DUE_TIME" class="AC0120010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_DUE_TIME()) %>" maxlength="5" ></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form2-Sub1_DUE_TIME2" name="Sub1_DUE_TIME2" class="" data-kind="OBT_N;" maxlength="5" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_DUE_TIME2()) %>">
<script class="expj-script-AC0120010-AC0120011form2-Sub1_DUE_TIME2">
expj.AC0120010.AC0120011form2.Sub1_DUE_TIME2 = {};
expj.AC0120010.AC0120011form2.Sub1_DUE_TIME2.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_DUE_TIME2.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_DUE_TIME2.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_DUE_TIME2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_DUE_TIME2', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_DUE_TIME2.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_DUE_TIME2.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_DUE_TIME2.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_DUE_TIME2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form2-Sub1_DUE_TIME3" name="Sub1_DUE_TIME3" class="" data-kind="OBT_N;" maxlength="5" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_DUE_TIME3()) %>">
<script class="expj-script-AC0120010-AC0120011form2-Sub1_DUE_TIME3">
expj.AC0120010.AC0120011form2.Sub1_DUE_TIME3 = {};
expj.AC0120010.AC0120011form2.Sub1_DUE_TIME3.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_DUE_TIME3.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_DUE_TIME3.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_DUE_TIME3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_DUE_TIME3', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_DUE_TIME3.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_DUE_TIME3.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_DUE_TIME3.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_DUE_TIME3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:130px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form2-h_Sub1_OD_MODIFY_COUNT" name="h_Sub1_OD_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_Sub1_OD_MODIFY_COUNT()) %>">
<script class="expj-script-AC0120010-AC0120011form2-h_Sub1_OD_MODIFY_COUNT">
expj.AC0120010.AC0120011form2.h_Sub1_OD_MODIFY_COUNT = {};
expj.AC0120010.AC0120011form2.h_Sub1_OD_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/h_Sub1_OD_MODIFY_COUNT.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.h_Sub1_OD_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-h_Sub1_OD_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'h_Sub1_OD_MODIFY_COUNT', this);
  });
  expj.AC0120010.AC0120011form2.h_Sub1_OD_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.h_Sub1_OD_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/h_Sub1_OD_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-h_Sub1_OD_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_3",rb)%></span><!-- 製造納期 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_PRD_DUE_DATE">
expj.AC0120010.AC0120011form2.Sub1_PRD_DUE_DATE = {};
expj.AC0120010.AC0120011form2.Sub1_PRD_DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_PRD_DUE_DATE.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_PRD_DUE_DATE.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_PRD_DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_PRD_DUE_DATE', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_PRD_DUE_DATE.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_PRD_DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_PRD_DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_PRD_DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_PRD_DUE_DATE" name="Sub1_PRD_DUE_DATE" class="AC0120010-focus-move  required-value expj-AC0120010-required-C" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_PRD_DUE_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-CalendarSub1PrdDueDate">
expj.AC0120010.AC0120011form2.CalendarSub1PrdDueDate = {};
// script1="onClick;0;CALENDAR;_AC0120011form2/Sub1_PRD_DUE_DATE"
expj.AC0120010.AC0120011form2.CalendarSub1PrdDueDate.onClick0 = function () {
  console.log('CalendarSub1PrdDueDate script1');
expj.common.pscript.executeCalendar('AC0120010','AC0120011form2','_AC0120011form2/Sub1_PRD_DUE_DATE');
};
expj.AC0120010.AC0120011form2.CalendarSub1PrdDueDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120011form2.CalendarSub1PrdDueDate['onClick' + i])) {
        expj.AC0120010.AC0120011form2.CalendarSub1PrdDueDate['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120011form2.CalendarSub1PrdDueDate.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120011form2.CalendarSub1PrdDueDate.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-CalendarSub1PrdDueDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120011form2', 'CalendarSub1PrdDueDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0120010','AC0120011form2','_AC0120011form2/Sub1_PRD_DUE_DATE');
  expj.AC0120010.AC0120011form2.CalendarSub1PrdDueDate.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.CalendarSub1PrdDueDate.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/CalendarSub1PrdDueDate.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-CalendarSub1PrdDueDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0120010-AC0120011form2-CalendarSub1PrdDueDate" class="AC0120010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_PRD_DUE_TIME">
expj.AC0120010.AC0120011form2.Sub1_PRD_DUE_TIME = {};
expj.AC0120010.AC0120011form2.Sub1_PRD_DUE_TIME.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_PRD_DUE_TIME.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_PRD_DUE_TIME.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_PRD_DUE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_PRD_DUE_TIME', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_PRD_DUE_TIME.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_PRD_DUE_TIME.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_PRD_DUE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_PRD_DUE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_PRD_DUE_TIME" name="Sub1_PRD_DUE_TIME" class="AC0120010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_PRD_DUE_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:130px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form2-h_Sub1_MANHOUR_TYP" name="h_Sub1_MANHOUR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_Sub1_MANHOUR_TYP()) %>">
<script class="expj-script-AC0120010-AC0120011form2-h_Sub1_MANHOUR_TYP">
expj.AC0120010.AC0120011form2.h_Sub1_MANHOUR_TYP = {};
expj.AC0120010.AC0120011form2.h_Sub1_MANHOUR_TYP.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/h_Sub1_MANHOUR_TYP.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.h_Sub1_MANHOUR_TYP.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-h_Sub1_MANHOUR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'h_Sub1_MANHOUR_TYP', this);
  });
  expj.AC0120010.AC0120011form2.h_Sub1_MANHOUR_TYP.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.h_Sub1_MANHOUR_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/h_Sub1_MANHOUR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-h_Sub1_MANHOUR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_INST_START_DATE",rb)%></span><!-- 製造着手日 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_PRD_START_DATE">
expj.AC0120010.AC0120011form2.Sub1_PRD_START_DATE = {};
expj.AC0120010.AC0120011form2.Sub1_PRD_START_DATE.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_PRD_START_DATE.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_PRD_START_DATE.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_PRD_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_PRD_START_DATE', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_PRD_START_DATE.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_PRD_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_PRD_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_PRD_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_PRD_START_DATE" name="Sub1_PRD_START_DATE" class="AC0120010-focus-move  required-value expj-AC0120010-required-C" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_PRD_START_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-CalendarSub1PrdStartDate">
expj.AC0120010.AC0120011form2.CalendarSub1PrdStartDate = {};
// script1="onClick;0;CALENDAR;_AC0120011form2/Sub1_PRD_START_DATE"
expj.AC0120010.AC0120011form2.CalendarSub1PrdStartDate.onClick0 = function () {
  console.log('CalendarSub1PrdStartDate script1');
expj.common.pscript.executeCalendar('AC0120010','AC0120011form2','_AC0120011form2/Sub1_PRD_START_DATE');
};
expj.AC0120010.AC0120011form2.CalendarSub1PrdStartDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120011form2.CalendarSub1PrdStartDate['onClick' + i])) {
        expj.AC0120010.AC0120011form2.CalendarSub1PrdStartDate['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120011form2.CalendarSub1PrdStartDate.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120011form2.CalendarSub1PrdStartDate.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-CalendarSub1PrdStartDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120011form2', 'CalendarSub1PrdStartDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0120010','AC0120011form2','_AC0120011form2/Sub1_PRD_START_DATE');
  expj.AC0120010.AC0120011form2.CalendarSub1PrdStartDate.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.CalendarSub1PrdStartDate.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/CalendarSub1PrdStartDate.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-CalendarSub1PrdStartDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0120010-AC0120011form2-CalendarSub1PrdStartDate" class="AC0120010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_PRD_START_TIME">
expj.AC0120010.AC0120011form2.Sub1_PRD_START_TIME = {};
expj.AC0120010.AC0120011form2.Sub1_PRD_START_TIME.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_PRD_START_TIME.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_PRD_START_TIME.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_PRD_START_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_PRD_START_TIME', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_PRD_START_TIME.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_PRD_START_TIME.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_PRD_START_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_PRD_START_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_PRD_START_TIME" name="Sub1_PRD_START_TIME" class="AC0120010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_PRD_START_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:130px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ODR_START_DATE",rb)%></span><!-- 手配着手日 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_ODR_START_DATE">
expj.AC0120010.AC0120011form2.Sub1_ODR_START_DATE = {};
expj.AC0120010.AC0120011form2.Sub1_ODR_START_DATE.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_ODR_START_DATE.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_ODR_START_DATE.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_ODR_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_ODR_START_DATE', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_ODR_START_DATE.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_ODR_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_ODR_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_ODR_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_ODR_START_DATE" name="Sub1_ODR_START_DATE" class="AC0120010-focus-move  required-value expj-AC0120010-required-C" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_ODR_START_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-CalendarSub1OdrStartDate">
expj.AC0120010.AC0120011form2.CalendarSub1OdrStartDate = {};
// script1="onClick;0;CALENDAR;_AC0120011form2/Sub1_ODR_START_DATE"
expj.AC0120010.AC0120011form2.CalendarSub1OdrStartDate.onClick0 = function () {
  console.log('CalendarSub1OdrStartDate script1');
expj.common.pscript.executeCalendar('AC0120010','AC0120011form2','_AC0120011form2/Sub1_ODR_START_DATE');
};
expj.AC0120010.AC0120011form2.CalendarSub1OdrStartDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120011form2.CalendarSub1OdrStartDate['onClick' + i])) {
        expj.AC0120010.AC0120011form2.CalendarSub1OdrStartDate['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120011form2.CalendarSub1OdrStartDate.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120011form2.CalendarSub1OdrStartDate.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-CalendarSub1OdrStartDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120011form2', 'CalendarSub1OdrStartDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0120010','AC0120011form2','_AC0120011form2/Sub1_ODR_START_DATE');
  expj.AC0120010.AC0120011form2.CalendarSub1OdrStartDate.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.CalendarSub1OdrStartDate.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/CalendarSub1OdrStartDate.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-CalendarSub1OdrStartDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0120010-AC0120011form2-CalendarSub1OdrStartDate" class="AC0120010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_ODR_START_TIME">
expj.AC0120010.AC0120011form2.Sub1_ODR_START_TIME = {};
expj.AC0120010.AC0120011form2.Sub1_ODR_START_TIME.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_ODR_START_TIME.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_ODR_START_TIME.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_ODR_START_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_ODR_START_TIME', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_ODR_START_TIME.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_ODR_START_TIME.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_ODR_START_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_ODR_START_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_ODR_START_TIME" name="Sub1_ODR_START_TIME" class="AC0120010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_ODR_START_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:130px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)%></span><!-- 内外作区分 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_OUTSIDE_TYP">
expj.AC0120010.AC0120011form2.Sub1_OUTSIDE_TYP = {};
expj.AC0120010.AC0120011form2.Sub1_OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_OUTSIDE_TYP.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_OUTSIDE_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_OUTSIDE_TYP', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_OUTSIDE_TYP.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_OUTSIDE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AC0120010-AC0120011form2-Sub1_OUTSIDE_TYP" name='Sub1_OUTSIDE_TYP' class='AC0120010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAC0120010Control.getStruct().getList_Sub1_OUTSIDE_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAC0120010Control.getStruct().getList_Sub1_OUTSIDE_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAC0120010Control.getStruct().getList_Sub1_OUTSIDE_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAC0120010Struct.getSub1_OUTSIDE_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:130px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)%></span><!-- 品目手配区分 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_MRP_ODR_TYP_DN">
expj.AC0120010.AC0120011form2.Sub1_MRP_ODR_TYP_DN = {};
expj.AC0120010.AC0120011form2.Sub1_MRP_ODR_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_MRP_ODR_TYP_DN.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_MRP_ODR_TYP_DN.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_MRP_ODR_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_MRP_ODR_TYP_DN', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_MRP_ODR_TYP_DN.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_MRP_ODR_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_MRP_ODR_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_MRP_ODR_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_MRP_ODR_TYP_DN" name="Sub1_MRP_ODR_TYP_DN" class="AC0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_MRP_ODR_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form2-h_Sub1_MRP_ODR_TYP" name="h_Sub1_MRP_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_Sub1_MRP_ODR_TYP()) %>">
<script class="expj-script-AC0120010-AC0120011form2-h_Sub1_MRP_ODR_TYP">
expj.AC0120010.AC0120011form2.h_Sub1_MRP_ODR_TYP = {};
expj.AC0120010.AC0120011form2.h_Sub1_MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/h_Sub1_MRP_ODR_TYP.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.h_Sub1_MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-h_Sub1_MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'h_Sub1_MRP_ODR_TYP', this);
  });
  expj.AC0120010.AC0120011form2.h_Sub1_MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.h_Sub1_MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/h_Sub1_MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-h_Sub1_MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:130px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPOIL",rb)%></span><!-- 品目仕損率 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_ITEM_SPOIL">
expj.AC0120010.AC0120011form2.Sub1_ITEM_SPOIL = {};
expj.AC0120010.AC0120011form2.Sub1_ITEM_SPOIL.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_ITEM_SPOIL.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_ITEM_SPOIL.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_ITEM_SPOIL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_ITEM_SPOIL', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_ITEM_SPOIL.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_ITEM_SPOIL.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_ITEM_SPOIL.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_ITEM_SPOIL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_ITEM_SPOIL" name="Sub1_ITEM_SPOIL" class="AC0120010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_ITEM_SPOIL()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:130px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)%></span><!-- 在庫数単位区分 --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-Sub1_UNIT_QTY_TYP_DN">
expj.AC0120010.AC0120011form2.Sub1_UNIT_QTY_TYP_DN = {};
expj.AC0120010.AC0120011form2.Sub1_UNIT_QTY_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_UNIT_QTY_TYP_DN.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_UNIT_QTY_TYP_DN.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_UNIT_QTY_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_UNIT_QTY_TYP_DN', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_UNIT_QTY_TYP_DN.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_UNIT_QTY_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_UNIT_QTY_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_UNIT_QTY_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0120010-AC0120011form2-Sub1_UNIT_QTY_TYP_DN" name="Sub1_UNIT_QTY_TYP_DN" class="AC0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getSub1_UNIT_QTY_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form2-h_Sub1_UNIT_QTY_TYP" name="h_Sub1_UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.geth_Sub1_UNIT_QTY_TYP()) %>">
<script class="expj-script-AC0120010-AC0120011form2-h_Sub1_UNIT_QTY_TYP">
expj.AC0120010.AC0120011form2.h_Sub1_UNIT_QTY_TYP = {};
expj.AC0120010.AC0120011form2.h_Sub1_UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/h_Sub1_UNIT_QTY_TYP.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.h_Sub1_UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-h_Sub1_UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'h_Sub1_UNIT_QTY_TYP', this);
  });
  expj.AC0120010.AC0120011form2.h_Sub1_UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.h_Sub1_UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/h_Sub1_UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-h_Sub1_UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:130px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011form2-c_JOB_ODR_DEL">
expj.AC0120010.AC0120011form2.c_JOB_ODR_DEL = {};
expj.AC0120010.AC0120011form2.c_JOB_ODR_DEL.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/c_JOB_ODR_DEL.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.c_JOB_ODR_DEL.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-c_JOB_ODR_DEL').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120011form2', 'c_JOB_ODR_DEL', this, 'CheckBox');
    }
  });
  expj.AC0120010.AC0120011form2.c_JOB_ODR_DEL.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.c_JOB_ODR_DEL.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/c_JOB_ODR_DEL.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-c_JOB_ODR_DEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_JOB_ODR_DEL" value="true" <%= ("true".equals(TypeConverter.convert(aAC0120010Struct.getc_JOB_ODR_DEL())) || "1".equals(TypeConverter.convert(aAC0120010Struct.getc_JOB_ODR_DEL())))?"checked=\"checked\"":"" %>  class="AC0120010-focus-move" id="expj-AC0120010-AC0120011form2-c_JOB_ODR_DEL"><label for="expj-AC0120010-AC0120011form2-c_JOB_ODR_DEL"><%=CoreTools.getRBString("Expj.Cmt0720",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form2-Sub1_JOB_ODR_DEL_FLG" name="Sub1_JOB_ODR_DEL_FLG" class="" data-kind="" maxlength="2147483647" value="">
<script class="expj-script-AC0120010-AC0120011form2-Sub1_JOB_ODR_DEL_FLG">
expj.AC0120010.AC0120011form2.Sub1_JOB_ODR_DEL_FLG = {};
expj.AC0120010.AC0120011form2.Sub1_JOB_ODR_DEL_FLG.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/Sub1_JOB_ODR_DEL_FLG.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.Sub1_JOB_ODR_DEL_FLG.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-Sub1_JOB_ODR_DEL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'Sub1_JOB_ODR_DEL_FLG', this);
  });
  expj.AC0120010.AC0120011form2.Sub1_JOB_ODR_DEL_FLG.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.Sub1_JOB_ODR_DEL_FLG.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/Sub1_JOB_ODR_DEL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-Sub1_JOB_ODR_DEL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0120010-AC0120011form2-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0120010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AC0120010-AC0120011form2-TIME_CTRL">
expj.AC0120010.AC0120011form2.TIME_CTRL = {};
expj.AC0120010.AC0120011form2.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AC0120011form2/TIME_CTRL.onDecision');
  expj.AC0120010.AC0120011form2.executeAllOnDecision();
  expj.AC0120010.executeAllOnDecision();
};
expj.AC0120010.AC0120011form2.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011form2-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0120010', 'AC0120011form2', 'TIME_CTRL', this);
  });
  expj.AC0120010.AC0120011form2.TIME_CTRL.executePScriptOnLoad();
};

expj.AC0120010.AC0120011form2.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AC0120011form2/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011form2-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:130px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style=""></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AC0120010-AC0120011button2">
expj.AC0120010.AC0120011button2 = {};
expj.AC0120010.AC0120011button2.executeAllOnDecision = function () {
  console.log('execute AC0120011button2.onDecision');
};
expj.AC0120010.AC0120011button2.executeOnLoad = function () {
  expj.AC0120010.AC0120011button2.executePScriptOnLoad();
};

expj.AC0120010.AC0120011button2.executePScriptOnLoad = function () {
  console.log('execute AC0120011button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0120010-AC0120011button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0120010-AC0120011button2-insert">
expj.AC0120010.AC0120011button2.insert = {};
// script1="onClick;0;CHK;_AC0120011form2/TIME_CTRL[eq]true@*0"
expj.AC0120010.AC0120011button2.insert.onClick0 = function () {
  console.log('insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]~LEN(_AC0120011form2/Sub1_PRD_DUE_TIME)[eq]3@*1"
expj.AC0120010.AC0120011button2.insert.onClick1 = function () {
  console.log('insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onClick;2;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]~LEN(_AC0120011form2/Sub1_PRD_DUE_TIME)[eq]4@*2"
expj.AC0120010.AC0120011button2.insert.onClick2 = function () {
  console.log('insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="onClick;3;CHK;_AC0120011form2/TIME_CTRL[eq]true@*3"
expj.AC0120010.AC0120011button2.insert.onClick3 = function () {
  console.log('insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="onClick;4;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]~LEN(_AC0120011form2/Sub1_PRD_START_TIME)[eq]3@*4"
expj.AC0120010.AC0120011button2.insert.onClick4 = function () {
  console.log('insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="onClick;5;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]~LEN(_AC0120011form2/Sub1_PRD_START_TIME)[eq]4@*5"
expj.AC0120010.AC0120011button2.insert.onClick5 = function () {
  console.log('insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="onClick;6;CHK;_AC0120011form2/TIME_CTRL[eq]true@*6"
expj.AC0120010.AC0120011button2.insert.onClick6 = function () {
  console.log('insert script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="onClick;7;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]~LEN(_AC0120011form2/Sub1_ODR_START_TIME)[eq]3@*7"
expj.AC0120010.AC0120011button2.insert.onClick7 = function () {
  console.log('insert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="onClick;8;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]~LEN(_AC0120011form2/Sub1_ODR_START_TIME)[eq]4@*8"
expj.AC0120010.AC0120011button2.insert.onClick8 = function () {
  console.log('insert script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="onClick;9;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]_AC0120011form2/Sub1_DUE_TIME[eq][and]_AC0120011form2/Sub1_DUE_DATE[neq]@*9"
expj.AC0120010.AC0120011button2.insert.onClick9 = function () {
  console.log('insert script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_DUE_TIME'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_DUE_DATE'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script11="onClick;10;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]_AC0120011form2/Sub1_PRD_DUE_TIME[eq][and]_AC0120011form2/Sub1_PRD_DUE_DATE[neq]@*10"
expj.AC0120010.AC0120011button2.insert.onClick10 = function () {
  console.log('insert script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_DATE'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script12="onClick;11;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]_AC0120011form2/Sub1_PRD_START_TIME[eq][and]_AC0120011form2/Sub1_PRD_START_DATE[neq]@*11"
expj.AC0120010.AC0120011button2.insert.onClick11 = function () {
  console.log('insert script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_DATE'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script13="onClick;12;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]_AC0120011form2/Sub1_ODR_START_TIME[eq][and]_AC0120011form2/Sub1_ODR_START_DATE[neq]@*12"
expj.AC0120010.AC0120011button2.insert.onClick12 = function () {
  console.log('insert script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_DATE'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script14="onClick;13;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]1[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]2@*13"
expj.AC0120010.AC0120011button2.insert.onClick13 = function () {
  console.log('insert script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script15="onClick;14;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]1[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]2@*15"
expj.AC0120010.AC0120011button2.insert.onClick14 = function () {
  console.log('insert script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script16="onClick;15;CHK;_AC0120011form2/h_Sub1_UNIT_QTY_TYP[eq]1[and][{_AC0120011form2/Sub1_ODR_QTY}%1][neq]0@$AC90009"
expj.AC0120010.AC0120011button2.insert.onClick15 = function () {
  console.log('insert script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_UNIT_QTY_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_QTY') + '%1'), '[neq]', '0')) {
expj.common.pscript.addWarningMessage('AC0120010', 'AC0120011button2', 'AC90009');
}
};
// script17="onClick;16;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]1[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]2@*16"
expj.AC0120010.AC0120011button2.insert.onClick16 = function () {
  console.log('insert script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script18="onClick;17;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]1[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]2@*17"
expj.AC0120010.AC0120011button2.insert.onClick17 = function () {
  console.log('insert script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script19="onClick;18;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]1[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]2@*18"
expj.AC0120010.AC0120011button2.insert.onClick18 = function () {
  console.log('insert script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script20="onClick;19;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0120011form1/*,_AC0120011form2/*@AC0120010Servlet,,$ZZ07001"
expj.AC0120010.AC0120011button2.insert.onClick19 = function () {
  console.log('insert script20');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0120010', 'AC0120011button2', '_AC0120011form1/*,_AC0120011form2/*', 'AC0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0120010', response);
expj.common.changeBusinessScreenTab('AC0120010', contents);
};
expj.common.pscript.callConfirm('AC0120010', 'AC0120011button2', 'ZZ07001', okEvent);
};
// script21="child;0;CHK;~LEN(_AC0120011form2/Sub1_PRD_DUE_TIME)[eq]1[or]~LEN(_AC0120011form2/Sub1_PRD_DUE_TIME)[eq]2@!AS00027"
expj.AC0120010.AC0120011button2.insert.child0 = function () {
  console.log('insert script21');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00027');
}
};
// script22="child;1;CHK;[{~CHARAT(_AC0120011form2/Sub1_PRD_DUE_TIME:1)}*10+{~CHARAT(_AC0120011form2/Sub1_PRD_DUE_TIME:2)}][gte]60@!AS00028"
expj.AC0120010.AC0120011button2.insert.child1 = function () {
  console.log('insert script22');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00028');
}
};
// script23="child;2;CHK;[{~CHARAT(_AC0120011form2/Sub1_PRD_DUE_TIME:0)}*10+{~CHARAT(_AC0120011form2/Sub1_PRD_DUE_TIME:1)}][gte]24[or][{~CHARAT(_AC0120011form2/Sub1_PRD_DUE_TIME:2)}*10+{~CHARAT(_AC0120011form2/Sub1_PRD_DUE_TIME:3)}][gte]60@!AS00028"
expj.AC0120010.AC0120011button2.insert.child2 = function () {
  console.log('insert script23');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00028');
}
};
// script24="child;3;CHK;~LEN(_AC0120011form2/Sub1_PRD_START_TIME)[eq]1[or]~LEN(_AC0120011form2/Sub1_PRD_START_TIME)[eq]2@!AS00029"
expj.AC0120010.AC0120011button2.insert.child3 = function () {
  console.log('insert script24');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00029');
}
};
// script25="child;4;CHK;[{~CHARAT(_AC0120011form2/Sub1_PRD_START_TIME:1)}*10+{~CHARAT(_AC0120011form2/Sub1_PRD_START_TIME:2)}][gte]60@!AS00030"
expj.AC0120010.AC0120011button2.insert.child4 = function () {
  console.log('insert script25');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00030');
}
};
// script26="child;5;CHK;[{~CHARAT(_AC0120011form2/Sub1_PRD_START_TIME:0)}*10+{~CHARAT(_AC0120011form2/Sub1_PRD_START_TIME:1)}][gte]24[or][{~CHARAT(_AC0120011form2/Sub1_PRD_START_TIME:2)}*10+{~CHARAT(_AC0120011form2/Sub1_PRD_START_TIME:3)}][gte]60@!AS00030"
expj.AC0120010.AC0120011button2.insert.child5 = function () {
  console.log('insert script26');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00030');
}
};
// script27="child;6;CHK;~LEN(_AC0120011form2/Sub1_ODR_START_TIME)[eq]1[or]~LEN(_AC0120011form2/Sub1_ODR_START_TIME)[eq]2@!AS00031"
expj.AC0120010.AC0120011button2.insert.child6 = function () {
  console.log('insert script27');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00031');
}
};
// script28="child;7;CHK;[{~CHARAT(_AC0120011form2/Sub1_ODR_START_TIME:1)}*10+{~CHARAT(_AC0120011form2/Sub1_ODR_START_TIME:2)}][gte]60@!AS00032"
expj.AC0120010.AC0120011button2.insert.child7 = function () {
  console.log('insert script28');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00032');
}
};
// script29="child;8;CHK;[{~CHARAT(_AC0120011form2/Sub1_ODR_START_TIME:0)}*10+{~CHARAT(_AC0120011form2/Sub1_ODR_START_TIME:1)}][gte]24[or][{~CHARAT(_AC0120011form2/Sub1_ODR_START_TIME:2)}*10+{~CHARAT(_AC0120011form2/Sub1_ODR_START_TIME:3)}][gte]60@!AS00032"
expj.AC0120010.AC0120011button2.insert.child8 = function () {
  console.log('insert script29');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00032');
}
};
// script30="child;9;SET;_AC0120011form2/Sub1_DUE_TIME=2359"
expj.AC0120010.AC0120011button2.insert.child9 = function () {
  console.log('insert script30');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_DUE_TIME', '2359');
};
// script31="child;10;SET;_AC0120011form2/Sub1_PRD_DUE_TIME=2359"
expj.AC0120010.AC0120011button2.insert.child10 = function () {
  console.log('insert script31');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME', '2359');
};
// script32="child;11;SET;_AC0120011form2/Sub1_PRD_START_TIME=2359"
expj.AC0120010.AC0120011button2.insert.child11 = function () {
  console.log('insert script32');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME', '2359');
};
// script33="child;12;SET;_AC0120011form2/Sub1_ODR_START_TIME=2359"
expj.AC0120010.AC0120011button2.insert.child12 = function () {
  console.log('insert script33');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME', '2359');
};
// script34="child;13;CHK;_AC0120011form2/Sub1_ODR_QTY[neq]0.0@*14"
expj.AC0120010.AC0120011button2.insert.child13 = function () {
  console.log('insert script34');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_QTY'), '[neq]', '0.0')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script35="child;14;CHK;_AC0120011form2/Sub1_PRD_DUE_DATE[lt]_AC0120011form2/h_BUSINESS_OPR_DATE[or]_AC0120011form2/Sub1_PRD_START_DATE[lt]_AC0120011form2/h_BUSINESS_OPR_DATE[or]_AC0120011form2/Sub1_ODR_START_DATE[lt]_AC0120011form2/h_BUSINESS_OPR_DATE@$AC00016"
expj.AC0120010.AC0120011button2.insert.child14 = function () {
  console.log('insert script35');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_BUSINESS_OPR_DATE'))) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_BUSINESS_OPR_DATE'))) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AC0120010', 'AC0120011button2', 'AC00016');
}
};
// script36="child;15;CHK;_AC0120011form2/Sub1_ODR_QTY[eq]0.0@$AC00015"
expj.AC0120010.AC0120011button2.insert.child15 = function () {
  console.log('insert script36');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_QTY'), '[eq]', '0.0')) {
expj.common.pscript.addWarningMessage('AC0120010', 'AC0120011button2', 'AC00015');
}
};
// script37="child;16;CHK;_AC0120011form2/Sub1_ODR_QTY[neq]0.0[and]_AC0120011form2/Sub1_ODR_QTY[lt]_AC0120011form2/Sub1_DM_QTY@$AC00018"
expj.AC0120010.AC0120011button2.insert.child16 = function () {
  console.log('insert script37');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_QTY'), '[neq]', '0.0') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_DM_QTY')))) {
expj.common.pscript.addWarningMessage('AC0120010', 'AC0120011button2', 'AC00018');
}
};
// script38="child;17;CHK;_AC0120011form2/Sub1_ODR_QTY[neq]0.0[and]_AC0120011form2/Sub1_DUE_DATE[lt]_AC0120011form2/Sub1_PRD_DUE_DATE@$AC00019"
expj.AC0120010.AC0120011button2.insert.child17 = function () {
  console.log('insert script38');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_QTY'), '[neq]', '0.0') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_DUE_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_DATE')))) {
expj.common.pscript.addWarningMessage('AC0120010', 'AC0120011button2', 'AC00019');
}
};
// script39="child;18;CHK;_AC0120011form2/Sub1_ODR_QTY[neq]0.0[and]_AC0120011form2/Sub1_DUE_DATE[eq]_AC0120011form2/Sub1_PRD_DUE_DATE[and]_AC0120011form2/Sub1_DUE_TIME2[lt]_AC0120011form2/Sub1_PRD_DUE_TIME@$AC00019"
expj.AC0120010.AC0120011button2.insert.child18 = function () {
  console.log('insert script39');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_QTY'), '[neq]', '0.0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_DUE_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_DUE_TIME2')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME')))) {
expj.common.pscript.addWarningMessage('AC0120010', 'AC0120011button2', 'AC00019');
}
};
expj.AC0120010.AC0120011button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 19; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120011button2.insert['onClick' + i])) {
        expj.AC0120010.AC0120011button2.insert['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120011button2.insert.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120011button2.insert.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120011button2', 'insert', this, 'Button');
    }
  });
  expj.AC0120010.AC0120011button2.insert.executePScriptOnLoad();
};

expj.AC0120010.AC0120011button2.insert.executePScriptOnLoad = function () {
  console.log('execute AC0120011button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0120010-AC0120011button2-insert" name="insert" class="AC0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AC0120010-AC0120011button2-update">
expj.AC0120010.AC0120011button2.update = {};
// script1="onClick;0;CHK;_AC0120011form2/TIME_CTRL[eq]true@*0"
expj.AC0120010.AC0120011button2.update.onClick0 = function () {
  console.log('update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]~LEN(_AC0120011form2/Sub1_PRD_DUE_TIME)[eq]3@*1"
expj.AC0120010.AC0120011button2.update.onClick1 = function () {
  console.log('update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onClick;2;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]~LEN(_AC0120011form2/Sub1_PRD_DUE_TIME)[eq]4@*2"
expj.AC0120010.AC0120011button2.update.onClick2 = function () {
  console.log('update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="onClick;3;CHK;_AC0120011form2/TIME_CTRL[eq]true@*3"
expj.AC0120010.AC0120011button2.update.onClick3 = function () {
  console.log('update script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="onClick;4;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]~LEN(_AC0120011form2/Sub1_PRD_START_TIME)[eq]3@*4"
expj.AC0120010.AC0120011button2.update.onClick4 = function () {
  console.log('update script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="onClick;5;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]~LEN(_AC0120011form2/Sub1_PRD_START_TIME)[eq]4@*5"
expj.AC0120010.AC0120011button2.update.onClick5 = function () {
  console.log('update script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="onClick;6;CHK;_AC0120011form2/TIME_CTRL[eq]true@*6"
expj.AC0120010.AC0120011button2.update.onClick6 = function () {
  console.log('update script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="onClick;7;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]~LEN(_AC0120011form2/Sub1_ODR_START_TIME)[eq]3@*7"
expj.AC0120010.AC0120011button2.update.onClick7 = function () {
  console.log('update script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="onClick;8;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]~LEN(_AC0120011form2/Sub1_ODR_START_TIME)[eq]4@*8"
expj.AC0120010.AC0120011button2.update.onClick8 = function () {
  console.log('update script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="onClick;9;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]_AC0120011form2/Sub1_DUE_TIME[eq][and]_AC0120011form2/Sub1_DUE_DATE[neq]@*9"
expj.AC0120010.AC0120011button2.update.onClick9 = function () {
  console.log('update script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_DUE_TIME'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_DUE_DATE'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script11="onClick;10;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]_AC0120011form2/Sub1_PRD_DUE_TIME[eq][and]_AC0120011form2/Sub1_PRD_DUE_DATE[neq]@*10"
expj.AC0120010.AC0120011button2.update.onClick10 = function () {
  console.log('update script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_DATE'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script12="onClick;11;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]_AC0120011form2/Sub1_PRD_START_TIME[eq][and]_AC0120011form2/Sub1_PRD_START_DATE[neq]@*11"
expj.AC0120010.AC0120011button2.update.onClick11 = function () {
  console.log('update script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_DATE'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script13="onClick;12;CHK;_AC0120011form2/TIME_CTRL[eq]true[and]_AC0120011form2/Sub1_ODR_START_TIME[eq][and]_AC0120011form2/Sub1_ODR_START_DATE[neq]@*12"
expj.AC0120010.AC0120011button2.update.onClick12 = function () {
  console.log('update script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_DATE'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script14="onClick;13;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]1[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]2@*13"
expj.AC0120010.AC0120011button2.update.onClick13 = function () {
  console.log('update script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script15="onClick;14;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]1[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]2@*15"
expj.AC0120010.AC0120011button2.update.onClick14 = function () {
  console.log('update script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script16="onClick;15;CHK;_AC0120011form2/h_Sub1_UNIT_QTY_TYP[eq]1[and][{_AC0120011form2/Sub1_ODR_QTY}%1][neq]0@$AC90009"
expj.AC0120010.AC0120011button2.update.onClick15 = function () {
  console.log('update script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_UNIT_QTY_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_QTY') + '%1'), '[neq]', '0')) {
expj.common.pscript.addWarningMessage('AC0120010', 'AC0120011button2', 'AC90009');
}
};
// script17="onClick;16;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]1[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]2@*16"
expj.AC0120010.AC0120011button2.update.onClick16 = function () {
  console.log('update script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script18="onClick;17;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]1[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]2@*17"
expj.AC0120010.AC0120011button2.update.onClick17 = function () {
  console.log('update script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script19="onClick;18;CHK;_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]1[or]_AC0120011form2/h_Sub1_MRP_ODR_TYP[eq]2@*18"
expj.AC0120010.AC0120011button2.update.onClick18 = function () {
  console.log('update script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_Sub1_MRP_ODR_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script20="onClick;19;CHK;_AC0120011form2/c_JOB_ODR_DEL[eq]true@*19"
expj.AC0120010.AC0120011button2.update.onClick19 = function () {
  console.log('update script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/c_JOB_ODR_DEL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script21="onClick;20;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0120011form1/*,_AC0120011form2/*@AC0120010Servlet,,$ZZ07003"
expj.AC0120010.AC0120011button2.update.onClick20 = function () {
  console.log('update script21');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0120010', 'AC0120011button2', '_AC0120011form1/*,_AC0120011form2/*', 'AC0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0120010', response);
expj.common.changeBusinessScreenTab('AC0120010', contents);
};
expj.common.pscript.callConfirm('AC0120010', 'AC0120011button2', 'ZZ07003', okEvent);
};
// script22="child;0;CHK;~LEN(_AC0120011form2/Sub1_PRD_DUE_TIME)[eq]1[or]~LEN(_AC0120011form2/Sub1_PRD_DUE_TIME)[eq]2@!AS00027"
expj.AC0120010.AC0120011button2.update.child0 = function () {
  console.log('update script22');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00027');
}
};
// script23="child;1;CHK;[{~CHARAT(_AC0120011form2/Sub1_PRD_DUE_TIME:1)}*10+{~CHARAT(_AC0120011form2/Sub1_PRD_DUE_TIME:2)}][gte]60@!AS00028"
expj.AC0120010.AC0120011button2.update.child1 = function () {
  console.log('update script23');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00028');
}
};
// script24="child;2;CHK;[{~CHARAT(_AC0120011form2/Sub1_PRD_DUE_TIME:0)}*10+{~CHARAT(_AC0120011form2/Sub1_PRD_DUE_TIME:1)}][gte]24[or][{~CHARAT(_AC0120011form2/Sub1_PRD_DUE_TIME:2)}*10+{~CHARAT(_AC0120011form2/Sub1_PRD_DUE_TIME:3)}][gte]60@!AS00028"
expj.AC0120010.AC0120011button2.update.child2 = function () {
  console.log('update script24');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00028');
}
};
// script25="child;3;CHK;~LEN(_AC0120011form2/Sub1_PRD_START_TIME)[eq]1[or]~LEN(_AC0120011form2/Sub1_PRD_START_TIME)[eq]2@!AS00029"
expj.AC0120010.AC0120011button2.update.child3 = function () {
  console.log('update script25');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00029');
}
};
// script26="child;4;CHK;[{~CHARAT(_AC0120011form2/Sub1_PRD_START_TIME:1)}*10+{~CHARAT(_AC0120011form2/Sub1_PRD_START_TIME:2)}][gte]60@!AS00030"
expj.AC0120010.AC0120011button2.update.child4 = function () {
  console.log('update script26');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00030');
}
};
// script27="child;5;CHK;[{~CHARAT(_AC0120011form2/Sub1_PRD_START_TIME:0)}*10+{~CHARAT(_AC0120011form2/Sub1_PRD_START_TIME:1)}][gte]24[or][{~CHARAT(_AC0120011form2/Sub1_PRD_START_TIME:2)}*10+{~CHARAT(_AC0120011form2/Sub1_PRD_START_TIME:3)}][gte]60@!AS00030"
expj.AC0120010.AC0120011button2.update.child5 = function () {
  console.log('update script27');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00030');
}
};
// script28="child;6;CHK;~LEN(_AC0120011form2/Sub1_ODR_START_TIME)[eq]1[or]~LEN(_AC0120011form2/Sub1_ODR_START_TIME)[eq]2@!AS00031"
expj.AC0120010.AC0120011button2.update.child6 = function () {
  console.log('update script28');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00031');
}
};
// script29="child;7;CHK;[{~CHARAT(_AC0120011form2/Sub1_ODR_START_TIME:1)}*10+{~CHARAT(_AC0120011form2/Sub1_ODR_START_TIME:2)}][gte]60@!AS00032"
expj.AC0120010.AC0120011button2.update.child7 = function () {
  console.log('update script29');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00032');
}
};
// script30="child;8;CHK;[{~CHARAT(_AC0120011form2/Sub1_ODR_START_TIME:0)}*10+{~CHARAT(_AC0120011form2/Sub1_ODR_START_TIME:1)}][gte]24[or][{~CHARAT(_AC0120011form2/Sub1_ODR_START_TIME:2)}*10+{~CHARAT(_AC0120011form2/Sub1_ODR_START_TIME:3)}][gte]60@!AS00032"
expj.AC0120010.AC0120011button2.update.child8 = function () {
  console.log('update script30');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0120010', 'AC0120011button2', 'AS00032');
}
};
// script31="child;9;SET;_AC0120011form2/Sub1_DUE_TIME=2359"
expj.AC0120010.AC0120011button2.update.child9 = function () {
  console.log('update script31');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_DUE_TIME', '2359');
};
// script32="child;10;SET;_AC0120011form2/Sub1_PRD_DUE_TIME=2359"
expj.AC0120010.AC0120011button2.update.child10 = function () {
  console.log('update script32');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME', '2359');
};
// script33="child;11;SET;_AC0120011form2/Sub1_PRD_START_TIME=2359"
expj.AC0120010.AC0120011button2.update.child11 = function () {
  console.log('update script33');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_TIME', '2359');
};
// script34="child;12;SET;_AC0120011form2/Sub1_ODR_START_TIME=2359"
expj.AC0120010.AC0120011button2.update.child12 = function () {
  console.log('update script34');
expj.common.pscript.setReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_TIME', '2359');
};
// script35="child;13;CHK;_AC0120011form2/Sub1_ODR_QTY[neq]0.0@*14"
expj.AC0120010.AC0120011button2.update.child13 = function () {
  console.log('update script35');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_QTY'), '[neq]', '0.0')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script36="child;14;CHK;_AC0120011form2/Sub1_PRD_DUE_DATE[lt]_AC0120011form2/h_BUSINESS_OPR_DATE[or]_AC0120011form2/Sub1_PRD_START_DATE[lt]_AC0120011form2/h_BUSINESS_OPR_DATE[or]_AC0120011form2/Sub1_ODR_START_DATE[lt]_AC0120011form2/h_BUSINESS_OPR_DATE@$AC00016"
expj.AC0120010.AC0120011button2.update.child14 = function () {
  console.log('update script36');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_BUSINESS_OPR_DATE'))) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_START_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_BUSINESS_OPR_DATE'))) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_START_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AC0120010', 'AC0120011button2', 'AC00016');
}
};
// script37="child;15;CHK;_AC0120011form2/Sub1_ODR_QTY[eq]0.0@$AC00015"
expj.AC0120010.AC0120011button2.update.child15 = function () {
  console.log('update script37');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_QTY'), '[eq]', '0.0')) {
expj.common.pscript.addWarningMessage('AC0120010', 'AC0120011button2', 'AC00015');
}
};
// script38="child;16;CHK;_AC0120011form2/Sub1_ODR_QTY[neq]0.0[and]_AC0120011form2/Sub1_ODR_QTY[lt]_AC0120011form2/Sub1_DM_QTY@$AC00018"
expj.AC0120010.AC0120011button2.update.child16 = function () {
  console.log('update script38');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_QTY'), '[neq]', '0.0') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_DM_QTY')))) {
expj.common.pscript.addWarningMessage('AC0120010', 'AC0120011button2', 'AC00018');
}
};
// script39="child;17;CHK;_AC0120011form2/Sub1_ODR_QTY[neq]0.0[and]_AC0120011form2/Sub1_DUE_DATE[lt]_AC0120011form2/Sub1_PRD_DUE_DATE@$AC00019"
expj.AC0120010.AC0120011button2.update.child17 = function () {
  console.log('update script39');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_QTY'), '[neq]', '0.0') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_DUE_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_DATE')))) {
expj.common.pscript.addWarningMessage('AC0120010', 'AC0120011button2', 'AC00019');
}
};
// script40="child;18;CHK;_AC0120011form2/Sub1_ODR_QTY[neq]0.0[and]_AC0120011form2/Sub1_DUE_DATE[eq]_AC0120011form2/Sub1_PRD_DUE_DATE[and]_AC0120011form2/Sub1_DUE_TIME2[lt]_AC0120011form2/Sub1_PRD_DUE_TIME@$AC00019"
expj.AC0120010.AC0120011button2.update.child18 = function () {
  console.log('update script40');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_ODR_QTY'), '[neq]', '0.0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_DUE_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_DUE_TIME2')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '_AC0120011form2/Sub1_PRD_DUE_TIME')))) {
expj.common.pscript.addWarningMessage('AC0120010', 'AC0120011button2', 'AC00019');
}
};
// script41="child;19;CHK;?AC0120011form2/Sub1_DRAW_CD[neq]SAME[or]?AC0120011form2/Sub1_SPEC[neq]SAME[or]?AC0120011form2/Sub1_PS_UNIT_NUMERATOR[neq]SAME[or]?AC0120011form2/Sub1_PS_UNIT_DENOMINATOR[neq]SAME[or]?AC0120011form2/Sub1_PS_SPOIL[neq]SAME[or]?AC0120011form2/Sub1_DM_QTY[neq]SAME[or]?AC0120011form2/Sub1_ODR_QTY[neq]SAME[or]?AC0120011form2/Sub1_DUE_DATE[neq]SAME[or]?AC0120011form2/Sub1_DUE_TIME[neq]SAME[or]?AC0120011form2/Sub1_PRD_DUE_DATE[neq]SAME[or]?AC0120011form2/Sub1_PRD_DUE_TIME[neq]SAME[or]?AC0120011form2/Sub1_PRD_START_DATE[neq]SAME[or]?AC0120011form2/Sub1_PRD_START_TIME[neq]SAME[or]?AC0120011form2/Sub1_ODR_START_DATE[neq]SAME[or]?AC0120011form2/Sub1_ODR_START_TIME[neq]SAME[or]?AC0120011form2/Sub1_OUTSIDE_TYP[neq]SAME[or]?AC0120011form2/Sub1_MRP_ODR_TYP_DN[neq]SAME[or]?AC0120011form2/Sub1_ITEM_SPOIL[neq]SAME[or]?AC0120011form2/Sub1_UNIT_QTY_TYP_DN[neq]SAME@#AC00009"
expj.AC0120010.AC0120011button2.update.child19 = function () {
  console.log('update script41');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_DRAW_CD'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_SPEC'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_PS_UNIT_NUMERATOR'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_PS_UNIT_DENOMINATOR'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_PS_SPOIL'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_DM_QTY'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_ODR_QTY'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_DUE_DATE'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_DUE_TIME'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_PRD_DUE_DATE'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_PRD_DUE_TIME'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_PRD_START_DATE'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_PRD_START_TIME'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_ODR_START_DATE'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_ODR_START_TIME'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_OUTSIDE_TYP'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_MRP_ODR_TYP_DN'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_ITEM_SPOIL'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0120010', 'AC0120011button2', '?AC0120011form2/Sub1_UNIT_QTY_TYP_DN'), '[neq]', 'SAME')) {
expj.common.pscript.addErrorMessage('AC0120010', 'AC0120011button2', 'AC00009');
}
};
expj.AC0120010.AC0120011button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 20; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120011button2.update['onClick' + i])) {
        expj.AC0120010.AC0120011button2.update['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120011button2.update.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120011button2.update.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120011button2', 'update', this, 'Button');
    }
  });
  expj.AC0120010.AC0120011button2.update.executePScriptOnLoad();
};

expj.AC0120010.AC0120011button2.update.executePScriptOnLoad = function () {
  console.log('execute AC0120011button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0120010-AC0120011button2-update" name="update" class="AC0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:42px"><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AC0120011 Revision: 1.10  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AC0120010-AC0120011button0">
expj.AC0120010.AC0120011button0 = {};
expj.AC0120010.AC0120011button0.executeAllOnDecision = function () {
  console.log('execute AC0120011button0.onDecision');
};
expj.AC0120010.AC0120011button0.executeOnLoad = function () {
  expj.AC0120010.AC0120011button0.executePScriptOnLoad();
};

expj.AC0120010.AC0120011button0.executePScriptOnLoad = function () {
  console.log('execute AC0120011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0120010-AC0120011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0120010-AC0120011button0-cancelSub1">
expj.AC0120010.AC0120011button0.cancelSub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0120011form1/*@AC0120010Servlet,,$ZZ07013"
expj.AC0120010.AC0120011button0.cancelSub1.onClick0 = function () {
  console.log('cancelSub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0120010', 'AC0120011button0', '_AC0120011form1/*', 'AC0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0120010', response);
expj.common.changeBusinessScreenTab('AC0120010', contents);
};
expj.common.pscript.callConfirm('AC0120010', 'AC0120011button0', 'ZZ07013', okEvent);
};
expj.AC0120010.AC0120011button0.cancelSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0120010.AC0120011button0.cancelSub1['onClick' + i])) {
        expj.AC0120010.AC0120011button0.cancelSub1['onClick' + i]();
      }
    }
  }
};
expj.AC0120010.AC0120011button0.cancelSub1.executeAllOnDecision = function () {
};
expj.AC0120010.AC0120011button0.cancelSub1.executeOnLoad = function () {
  $('#expj-AC0120010-AC0120011button0-cancelSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0120010', 'AC0120011button0', 'cancelSub1', this, 'Button');
    }
  });
  expj.AC0120010.AC0120011button0.cancelSub1.executePScriptOnLoad();
};

expj.AC0120010.AC0120011button0.cancelSub1.executePScriptOnLoad = function () {
  console.log('execute AC0120011button0/cancelSub1.onLoad');
  var targetComponent = document.getElementById('expj-AC0120010-AC0120011button0-cancelSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0120010-AC0120011button0-cancelSub1" name="cancelSub1" class="AC0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0120010 (END)-->
<%
MessageStruct msgStruct = aAC0120010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0120010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0120010)) {
  expj.common.treeInstanceMap.AC0120010 = {};
}
expj.common.treeInstanceMap.AC0120010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0120010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0120010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0120010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0120010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0120010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0120010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010)) {
  expj.common.detailDialogMap.AC0120010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0120010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0120010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0120010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0120010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0120010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0120010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0120010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0120010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0120010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0120010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0120010)) {
  expj.common.viewInstanceMap.AC0120010 = {};
}
expj.common.viewInstanceMap.AC0120010.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0120010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0120010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0120010.<%=viewId %>.init = function () {
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
    expj.AC0120010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0120010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0120010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0120010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0120010_init">
/**
 * AC0120010用のロード完了時初期化関数
 */
expj.AC0120010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0120010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0120010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0120010');
  expj.common.calendarInstanceMap.AC0120010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0120010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0120010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0120010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0120010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0120010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0120010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0120010-<%=detailId %>');
<%
 }
%>
  try{expj.AC0120010.AC0120011form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.h_Sub1_Parent_ALC_GRP_CD.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.h_Sub1_Parent_ODR_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.h_Sub1_Parent_OD_LEVEL_NO.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.Sub1_Parent_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.h_DM_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.Sub1_Parent_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.h_Sub1_Parent_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.OD_NO.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.Sub1_Comp_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.Sub1_Comp_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.h_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.h_Parent_OD_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.InitLevel.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011button1.selectSub1.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.h_Comp_ITEM_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_SPEC.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_NUMERATOR.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_PS_UNIT_DENOMINATOR.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_PS_SPOIL.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.h_Sub1_PS_UNIT_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_DM_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_1.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.h_Sub1_ISSUE_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_STOCK_UNIT_2.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.h_BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.CalendarSub1DueDateFrom.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_DUE_TIME.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_DUE_TIME2.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_DUE_TIME3.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.h_Sub1_OD_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_PRD_DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.CalendarSub1PrdDueDate.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_PRD_DUE_TIME.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.h_Sub1_MANHOUR_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_PRD_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.CalendarSub1PrdStartDate.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_PRD_START_TIME.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_ODR_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.CalendarSub1OdrStartDate.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_ODR_START_TIME.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_MRP_ODR_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.h_Sub1_MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_ITEM_SPOIL.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_UNIT_QTY_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.h_Sub1_UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.c_JOB_ODR_DEL.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.Sub1_JOB_ODR_DEL_FLG.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011button2.insert.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011button2.update.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011button0.cancelSub1.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form1.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011button1.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011form2.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011button2.executeOnLoad();}catch(e){};
  try{expj.AC0120010.AC0120011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0120010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0120010', 'AC0120010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0120010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0120010-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0120010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0120010', '<%=request.getContextPath() %>');
};

/**
 * AC0120010の全体onDecision処理
 */
expj.AC0120010.executeAllOnDecision = function () {
  expj.AC0120010.AC0120011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0120010_console">
expj.AC0120010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>