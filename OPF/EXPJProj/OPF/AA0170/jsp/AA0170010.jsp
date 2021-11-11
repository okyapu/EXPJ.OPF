<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:25:01 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0170\AA0170010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0170.*" %>
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
<jsp:useBean id="aAA0170010Control" class="com.nec.jp.orteus.metamorBase.AA0170.AA0170010Control" scope="request"/>
<jsp:useBean id="aAA0170010Struct" class="com.nec.jp.orteus.metamorBase.AA0170.AA0170010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

構成系列メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0170/jsp/AA0170010.jsp,v $
$Author: geng-jia $     
$Revision: 1.5 $ $Date: 2017/02/22 02:04:09 $
********************************************************* --%>
<html>
<head>
<title>構成系列メンテナンス</title>
<%@include file="common/expj_v5.jsp" %>
<% ScreenMoveUtil su = new ScreenMoveUtil("AA0170010Servlet", so); %>

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
<script class="expj-script-AA0170010_init">
  // AA0170010名前空間
  expj.AA0170010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0170010" data-screen="AA0170010" data-newdata="<%=aAA0170010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style=""></div><!--/td-->

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
			  <script class="expj-script-AA0170010-AA0170010form1">
expj.AA0170010.AA0170010form1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0170010.AA0170010form1.onLoad0 = function () {
  console.log('AA0170010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;?AA0170010form1/*[neq]NORMAL@*1"
expj.AA0170010.AA0170010form1.child0 = function () {
  console.log('AA0170010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/*'), '[neq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;MASK;_AA0170010button2/insertPs,_AA0170010button2/updatePs,_AA0170010button2/deletePs,_AA0170010button2/deleteAllPs@*2"
expj.AA0170010.AA0170010form1.child1 = function () {
  console.log('AA0170010form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/insertPs');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/updatePs');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/deletePs');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/deleteAllPs');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;MASK;_AA0170010button3/insertProcGrp,_AA0170010button3/updateProcGrp,_AA0170010button3/copyProcGrp,_AA0170010button3/deleteProcGrp,_AA0170010button3/deleteAllProcGrp,_AA0170010button3/renumProcGrp"
expj.AA0170010.AA0170010form1.child2 = function () {
  console.log('AA0170010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/insertProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/updateProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/copyProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/deleteProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/deleteAllProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/renumProcGrp');
};
// script5="onLoad;1;CALL;onDecision@0,1,2"
expj.AA0170010.AA0170010form1.onLoad1 = function () {
  console.log('AA0170010form1 script5');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script6="onDecision;0;CHKRQ;A@*3,*7"
expj.AA0170010.AA0170010form1.onDecision0 = function () {
  console.log('AA0170010form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AA0170010', 'A')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script7="child;3;UNMASK;_AA0170010button1/select"
expj.AA0170010.AA0170010form1.child3 = function () {
  console.log('AA0170010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button1/select');
};
// script11="child;7;MASK;_AA0170010button1/select@*8"
expj.AA0170010.AA0170010form1.child7 = function () {
  console.log('AA0170010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script12="child;8;MASK;_AA0170010button2/insertPs,_AA0170010button2/updatePs,_AA0170010button2/deletePs,_AA0170010button2/deleteAllPs@*9"
expj.AA0170010.AA0170010form1.child8 = function () {
  console.log('AA0170010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/insertPs');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/updatePs');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/deletePs');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/deleteAllPs');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script13="child;9;MASK;_AA0170010button3/insertProcGrp,_AA0170010button3/updateProcGrp,_AA0170010button3/copyProcGrp,_AA0170010button3/deleteProcGrp,_AA0170010button3/deleteAllProcGrp,_AA0170010button3/renumProcGrp"
expj.AA0170010.AA0170010form1.child9 = function () {
  console.log('AA0170010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/insertProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/updateProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/copyProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/deleteProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/deleteAllProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/renumProcGrp');
};
// script14="onDecision;1;CHKRQ;?AA0170010view1/?[eq]SINGLE@*10,*17"
expj.AA0170010.AA0170010form1.onDecision1 = function () {
  console.log('AA0170010form1 script14');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script15="child;10;CHK;?AA0170010form1/*[eq]NORMAL@*11,*14"
expj.AA0170010.AA0170010form1.child10 = function () {
  console.log('AA0170010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script16="child;11;CHK;?AA0170010form1/main_TARGET_ITEM_CD[eq]SAME[and]?AA0170010form1/main_LEVEL[eq]SAME[and]?AA0170010form1/main_TARGET_DATE[eq]SAME[and]?AA0170010form1/main_DEVELOP_TYP[eq]SAME@*12,*13"
expj.AA0170010.AA0170010form1.child11 = function () {
  console.log('AA0170010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/main_TARGET_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/main_LEVEL'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/main_TARGET_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/main_DEVELOP_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script17="child;12;UNMASK;_AA0170010button2/insertPs,_AA0170010button2/updatePs,_AA0170010button2/deletePs,_AA0170010button2/deleteAllPs,_AA0170010button3/insertProcGrp,_AA0170010button3/deleteAllProcGrp,_AA0170010button3/renumProcGrp"
expj.AA0170010.AA0170010form1.child12 = function () {
  console.log('AA0170010form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/insertPs');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/updatePs');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/deletePs');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/deleteAllPs');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/insertProcGrp');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/deleteAllProcGrp');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/renumProcGrp');
};
// script18="child;13;MASK;_AA0170010button2/insertPs,_AA0170010button2/updatePs,_AA0170010button2/deletePs,_AA0170010button2/deleteAllPs,_AA0170010button3/insertProcGrp,_AA0170010button3/deleteAllProcGrp,_AA0170010button3/renumProcGrp"
expj.AA0170010.AA0170010form1.child13 = function () {
  console.log('AA0170010form1 script18');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/insertPs');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/updatePs');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/deletePs');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/deleteAllPs');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/insertProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/deleteAllProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/renumProcGrp');
};
// script19="child;14;CHK;?AA0170010form1/main_TARGET_ITEM_CD[eq]SAME[and]?AA0170010form1/main_LEVEL[eq]SAME[and]?AA0170010form1/main_TARGET_DATE[eq]SAME[and]?AA0170010form1/main_DEVELOP_TYP[eq]SAME@*15"
expj.AA0170010.AA0170010form1.child14 = function () {
  console.log('AA0170010form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/main_TARGET_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/main_LEVEL'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/main_TARGET_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/main_DEVELOP_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script20="child;15;CHK;?AA0170010form1/*[eq]NOT_FOUND[and]?AA0170010view1$[neq]0@*16"
expj.AA0170010.AA0170010form1.child15 = function () {
  console.log('AA0170010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/*'), '[eq]', 'NOT_FOUND') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010view1$'), '[neq]', '0')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script21="child;16;UNMASK;_AA0170010button2/insertPs,_AA0170010button2/updatePs,_AA0170010button2/deletePs,_AA0170010button2/deleteAllPs,_AA0170010button3/insertProcGrp,_AA0170010button3/deleteAllProcGrp,_AA0170010button3/renumProcGrp"
expj.AA0170010.AA0170010form1.child16 = function () {
  console.log('AA0170010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/insertPs');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/updatePs');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/deletePs');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/deleteAllPs');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/insertProcGrp');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/deleteAllProcGrp');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/renumProcGrp');
};
// script22="child;17;MASK;_AA0170010button2/insertPs,_AA0170010button2/updatePs,_AA0170010button2/deletePs,_AA0170010button2/deleteAllPs,_AA0170010button3/insertProcGrp,_AA0170010button3/deleteAllProcGrp,_AA0170010button3/renumProcGrp"
expj.AA0170010.AA0170010form1.child17 = function () {
  console.log('AA0170010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/insertPs');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/updatePs');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/deletePs');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button2/deleteAllPs');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/insertProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/deleteAllProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/renumProcGrp');
};
// script28="onDecision;2;CHKRQ;?AA0170010view2/?[eq]SINGLE@*22,*24"
expj.AA0170010.AA0170010form1.onDecision2 = function () {
  console.log('AA0170010form1 script28');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010view2/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
} else {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script29="child;22;CHK;?AA0170010form1/main_TARGET_ITEM_CD[eq]SAME[and]?AA0170010form1/main_LEVEL[eq]SAME[and]?AA0170010form1/main_TARGET_DATE[eq]SAME[and]?AA0170010form1/main_DEVELOP_TYP[eq]SAME@*23,*24"
expj.AA0170010.AA0170010form1.child22 = function () {
  console.log('AA0170010form1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/main_TARGET_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/main_LEVEL'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/main_TARGET_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '?AA0170010form1/main_DEVELOP_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script30="child;23;UNMASK;_AA0170010button3/updateProcGrp,_AA0170010button3/copyProcGrp,_AA0170010button3/deleteProcGrp"
expj.AA0170010.AA0170010form1.child23 = function () {
  console.log('AA0170010form1 script30');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/updateProcGrp');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/copyProcGrp');
expj.common.pscript.setUnMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/deleteProcGrp');
};
// script31="child;24;MASK;_AA0170010button3/updateProcGrp,_AA0170010button3/copyProcGrp,_AA0170010button3/deleteProcGrp"
expj.AA0170010.AA0170010form1.child24 = function () {
  console.log('AA0170010form1 script31');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/updateProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/copyProcGrp');
expj.common.pscript.setMaskToReferenceComponent('AA0170010', 'AA0170010form1', '_AA0170010button3/deleteProcGrp');
};
expj.AA0170010.AA0170010form1.executeAllOnDecision = function () {
  console.log('execute AA0170010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010form1['onDecision' + i])) {
        expj.AA0170010.AA0170010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010form1.executeOnLoad = function () {
  expj.AA0170010.AA0170010form1.executePScriptOnLoad();
};

expj.AA0170010.AA0170010form1.executePScriptOnLoad = function () {
  console.log('execute AA0170010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AA0170010.AA0170010form1['onLoad' + i])) {
      expj.AA0170010.AA0170010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0170010-AA0170010form1" action="AA0170010Servlet" name="AA0170010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0170010Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD_6",rb)%></span><!-- 対象品目番号 --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010form1-main_TARGET_ITEM_CD">
expj.AA0170010.AA0170010form1.main_TARGET_ITEM_CD = {};
expj.AA0170010.AA0170010form1.main_TARGET_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0170010form1/main_TARGET_ITEM_CD.onDecision');
  expj.AA0170010.AA0170010form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170010form1.main_TARGET_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010form1-main_TARGET_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170010form1', 'main_TARGET_ITEM_CD', this);
  });
  expj.AA0170010.AA0170010form1.main_TARGET_ITEM_CD.executePScriptOnLoad();
};

expj.AA0170010.AA0170010form1.main_TARGET_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0170010form1/main_TARGET_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010form1-main_TARGET_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170010form1-main_TARGET_ITEM_CD" name="main_TARGET_ITEM_CD" class="AA0170010-focus-move  required-value expj-AA0170010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getmain_TARGET_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010form1-PeekerTargetItemCd">
expj.AA0170010.AA0170010form1.PeekerTargetItemCd = {};
// script1="onClick;0;PEEKER;_AA0170010form1/main_TARGET_ITEM_CD@<%=contextNo%>"
expj.AA0170010.AA0170010form1.PeekerTargetItemCd.onClick0 = function () {
  console.log('PeekerTargetItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0170010';
var parameterValues = 'PeekerTargetItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010form1', '_AA0170010form1/main_TARGET_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0170010form1/main_TARGET_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0170010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0170010.AA0170010form1.PeekerTargetItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010form1.PeekerTargetItemCd['onClick' + i])) {
        expj.AA0170010.AA0170010form1.PeekerTargetItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010form1.PeekerTargetItemCd.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010form1.PeekerTargetItemCd.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010form1-PeekerTargetItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010form1', 'PeekerTargetItemCd', this, 'Button');
    }
  });
  expj.AA0170010.AA0170010form1.PeekerTargetItemCd.executePScriptOnLoad();
};

expj.AA0170010.AA0170010form1.PeekerTargetItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0170010form1/PeekerTargetItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010form1-PeekerTargetItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0170010-AA0170010form1-PeekerTargetItemCd" class="AA0170010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0017",rb)%></span><!-- 展開区分 --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010form1-main_DEVELOP_TYP">
expj.AA0170010.AA0170010form1.main_DEVELOP_TYP = {};
expj.AA0170010.AA0170010form1.main_DEVELOP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0170010form1/main_DEVELOP_TYP.onDecision');
  expj.AA0170010.AA0170010form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170010form1.main_DEVELOP_TYP.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010form1-main_DEVELOP_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0170010', 'AA0170010form1', 'main_DEVELOP_TYP', this);
  });
  expj.AA0170010.AA0170010form1.main_DEVELOP_TYP.executePScriptOnLoad();
};

expj.AA0170010.AA0170010form1.main_DEVELOP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0170010form1/main_DEVELOP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010form1-main_DEVELOP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0170010-AA0170010form1-main_DEVELOP_TYP" name='main_DEVELOP_TYP' class='AA0170010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0170010Control.getStruct().getList_main_DEVELOP_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0170010Control.getStruct().getList_main_DEVELOP_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0170010Control.getStruct().getList_main_DEVELOP_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0170010Struct.getmain_DEVELOP_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_3",rb)%></span><!-- 対象日付 --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010form1-main_TARGET_DATE">
expj.AA0170010.AA0170010form1.main_TARGET_DATE = {};
expj.AA0170010.AA0170010form1.main_TARGET_DATE.executeAllOnDecision = function () {
  console.log('execute AA0170010form1/main_TARGET_DATE.onDecision');
  expj.AA0170010.AA0170010form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170010form1.main_TARGET_DATE.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010form1-main_TARGET_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170010form1', 'main_TARGET_DATE', this);
  });
  expj.AA0170010.AA0170010form1.main_TARGET_DATE.executePScriptOnLoad();
};

expj.AA0170010.AA0170010form1.main_TARGET_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0170010form1/main_TARGET_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010form1-main_TARGET_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170010form1-main_TARGET_DATE" name="main_TARGET_DATE" class="AA0170010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getmain_TARGET_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010form1-CalendarTargetDate">
expj.AA0170010.AA0170010form1.CalendarTargetDate = {};
// script1="onClick;0;CALENDAR;_AA0170010form1/main_TARGET_DATE"
expj.AA0170010.AA0170010form1.CalendarTargetDate.onClick0 = function () {
  console.log('CalendarTargetDate script1');
expj.common.pscript.executeCalendar('AA0170010','AA0170010form1','_AA0170010form1/main_TARGET_DATE');
};
expj.AA0170010.AA0170010form1.CalendarTargetDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010form1.CalendarTargetDate['onClick' + i])) {
        expj.AA0170010.AA0170010form1.CalendarTargetDate['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010form1.CalendarTargetDate.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010form1.CalendarTargetDate.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010form1-CalendarTargetDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010form1', 'CalendarTargetDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0170010','AA0170010form1','_AA0170010form1/main_TARGET_DATE');
  expj.AA0170010.AA0170010form1.CalendarTargetDate.executePScriptOnLoad();
};

expj.AA0170010.AA0170010form1.CalendarTargetDate.executePScriptOnLoad = function () {
  console.log('execute AA0170010form1/CalendarTargetDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010form1-CalendarTargetDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0170010-AA0170010form1-CalendarTargetDate" class="AA0170010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0018",rb)%></span><!-- 初期展開レベル --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010form1-main_LEVEL">
expj.AA0170010.AA0170010form1.main_LEVEL = {};
expj.AA0170010.AA0170010form1.main_LEVEL.executeAllOnDecision = function () {
  console.log('execute AA0170010form1/main_LEVEL.onDecision');
  expj.AA0170010.AA0170010form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170010form1.main_LEVEL.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010form1-main_LEVEL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170010form1', 'main_LEVEL', this);
  });
  expj.AA0170010.AA0170010form1.main_LEVEL.executePScriptOnLoad();
};

expj.AA0170010.AA0170010form1.main_LEVEL.executePScriptOnLoad = function () {
  console.log('execute AA0170010form1/main_LEVEL.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010form1-main_LEVEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0170010-AA0170010form1-main_LEVEL" name="main_LEVEL" class="AA0170010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAA0170010Struct.getmain_LEVEL()) %>" maxlength="2147483647" ></div><!--/td-->
<input type="hidden" id="expj-AA0170010-AA0170010form1-hidden_ITEM_NAME" name="hidden_ITEM_NAME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0170010Struct.gethidden_ITEM_NAME()) %>">
<script class="expj-script-AA0170010-AA0170010form1-hidden_ITEM_NAME">
expj.AA0170010.AA0170010form1.hidden_ITEM_NAME = {};
expj.AA0170010.AA0170010form1.hidden_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0170010form1/hidden_ITEM_NAME.onDecision');
  expj.AA0170010.AA0170010form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170010form1.hidden_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010form1-hidden_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170010form1', 'hidden_ITEM_NAME', this);
  });
  expj.AA0170010.AA0170010form1.hidden_ITEM_NAME.executePScriptOnLoad();
};

expj.AA0170010.AA0170010form1.hidden_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0170010form1/hidden_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010form1-hidden_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0170010-AA0170010form1-hidden_ITEM_CD" name="hidden_ITEM_CD" class="expj-AA0170010-required-B" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0170010Struct.gethidden_ITEM_CD()) %>">
<script class="expj-script-AA0170010-AA0170010form1-hidden_ITEM_CD">
expj.AA0170010.AA0170010form1.hidden_ITEM_CD = {};
expj.AA0170010.AA0170010form1.hidden_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0170010form1/hidden_ITEM_CD.onDecision');
  expj.AA0170010.AA0170010form1.executeAllOnDecision();
  expj.AA0170010.executeAllOnDecision();
};
expj.AA0170010.AA0170010form1.hidden_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010form1-hidden_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0170010', 'AA0170010form1', 'hidden_ITEM_CD', this);
  });
  expj.AA0170010.AA0170010form1.hidden_ITEM_CD.executePScriptOnLoad();
};

expj.AA0170010.AA0170010form1.hidden_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0170010form1/hidden_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010form1-hidden_ITEM_CD');
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
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0170010-AA0170010button1">
expj.AA0170010.AA0170010button1 = {};
expj.AA0170010.AA0170010button1.executeAllOnDecision = function () {
  console.log('execute AA0170010button1.onDecision');
};
expj.AA0170010.AA0170010button1.executeOnLoad = function () {
  expj.AA0170010.AA0170010button1.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button1.executePScriptOnLoad = function () {
  console.log('execute AA0170010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0170010-AA0170010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0170010-AA0170010button1-select">
expj.AA0170010.AA0170010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0170010form1/*@AA0170010Servlet"
expj.AA0170010.AA0170010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170010button1', '_AA0170010form1/*', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.updateBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0170010.AA0170010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010button1.select['onClick' + i])) {
        expj.AA0170010.AA0170010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010button1.select.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010button1.select.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010button1', 'select', this, 'Button');
    }
  });
  expj.AA0170010.AA0170010button1.select.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button1.select.executePScriptOnLoad = function () {
  console.log('execute AA0170010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170010button1-select" name="select" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0170010-AA0170010view1">
expj.AA0170010.AA0170010view1 = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,selectProcGrp=ACT,_AA0170010form1/*,_AA0170010view1/+@AA0170010Servlet"
expj.AA0170010.AA0170010view1.onClick0 = function () {
  console.log('AA0170010view1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170010view1', 'selectProcGrp=ACT,_AA0170010form1/*,_AA0170010view1/+', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.updateBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0170010.AA0170010view1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010view1['onClick' + i])) {
        expj.AA0170010.AA0170010view1['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010view1.executeAllOnDecision = function () {
  console.log('execute AA0170010view1.onDecision');
};
expj.AA0170010.AA0170010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0170010view1", "expj.AA0170010.AA0170010view1.executeAllOnClick");
%>
  expj.AA0170010.AA0170010view1.executePScriptOnLoad();
};

expj.AA0170010.AA0170010view1.executePScriptOnLoad = function () {
  console.log('execute AA0170010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0170010-AA0170010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0170010view1_Id = "AA0170010view1";
 String AA0170010view1_select = "single";
 String AA0170010view1_sortable = "true";
 String AA0170010view1_resize = "true";
 String AA0170010view1_scroll = "true";
 StringBuffer AA0170010view1_HB = new StringBuffer();
 StringBuffer AA0170010view1_DB = new StringBuffer();
%>
<%
 AA0170010view1_select = "single";
 AA0170010view1_sortable = "true";
 AA0170010view1_resize = "true";
 AA0170010view1_scroll = "true";
%>
<%
 AA0170010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
%>
      <% aAA0170010Control.setList(aAA0170010Control.getDeployList()); %>
<%
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ps_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0019",rb))).append("', 'name':'ps_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ps_PARENT_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ps_PARENT_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.COMP_ITEM_CD_1",rb))).append("', 'name':'ps_COMP_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME_1",rb))).append("', 'name':'ps_COMP_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_EDITION",rb))).append("', 'name':'ps_PS_EDITION', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_UNIT_NUMERATOR_2",rb))).append("', 'name':'ps_PS_UNIT_NUMERATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_UNIT_DENOMINATOR_2",rb))).append("', 'name':'ps_PS_UNIT_DENOMINATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT",rb))).append("', 'name':'ps_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_1",rb))).append("', 'name':'ps_EFF_PHASE_IN_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_OUT_DATE_1",rb))).append("', 'name':'ps_EFF_PHASE_OUT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_SPOIL",rb))).append("', 'name':'ps_PS_SPOIL', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CONS_TYP",rb))).append("', 'name':'ps_CONS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ps_CONS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0612",rb))).append("', 'name':'ps_PS_LT_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ps_PS_LT_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_FIXED_LT",rb))).append("', 'name':'ps_PS_FIXED_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_PROP_LT",rb))).append("', 'name':'ps_PS_PROP_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_PROP_LOT_SIZE",rb))).append("', 'name':'ps_PS_PROP_LOT_SIZE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_REF_NO_1",rb))).append("', 'name':'ps_PS_REF_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.COST_UP_TYP_2",rb))).append("', 'name':'ps_COST_UP_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ps_COST_UP_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_EXP_TYP_2",rb))).append("', 'name':'ps_MRP_EXP_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ps_MRP_EXP_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MANHOUR_TYP_1",rb))).append("', 'name':'ps_COMP_MANHOUR_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ps_COMP_MANHOUR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
AA0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ps_PARENT_MANHOUR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view1_sortable).append("}").append(",");
%>
<%
 int aAA0170010StructLength = aAA0170010Control.getListsize();
 final AA0170010Struct structBackup = aAA0170010Struct;
 aAA0170010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0170010StructLength; ++loopCount) {
  if((aAA0170010Struct = (AA0170010Struct) aAA0170010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0170010Struct", aAA0170010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0170010view1_DB.append("[");
 AA0170010view1_DB.append(loopCount);
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_MODIFY_COUNT\" data-name=\"ps_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_MODIFY_COUNT())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_NO-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_NO\" data-name=\"ps_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_NO())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_PARENT_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_PARENT_ITEM_CD\" data-name=\"ps_PARENT_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_PARENT_ITEM_CD())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_PARENT_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_PARENT_ITEM_NAME\" data-name=\"ps_PARENT_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_PARENT_ITEM_NAME())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_COMP_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_COMP_ITEM_CD\" data-name=\"ps_COMP_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_COMP_ITEM_CD())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_COMP_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_COMP_ITEM_NAME\" data-name=\"ps_COMP_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_COMP_ITEM_NAME())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_PS_EDITION-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_PS_EDITION\" data-name=\"ps_PS_EDITION\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_PS_EDITION())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_PS_UNIT_NUMERATOR-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_PS_UNIT_NUMERATOR\" data-name=\"ps_PS_UNIT_NUMERATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_PS_UNIT_NUMERATOR())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_PS_UNIT_DENOMINATOR-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_PS_UNIT_DENOMINATOR\" data-name=\"ps_PS_UNIT_DENOMINATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_PS_UNIT_DENOMINATOR())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_STOCK_UNIT\" data-name=\"ps_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_STOCK_UNIT())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_EFF_PHASE_IN_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_EFF_PHASE_IN_DATE\" data-name=\"ps_EFF_PHASE_IN_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_EFF_PHASE_IN_DATE())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_EFF_PHASE_OUT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_EFF_PHASE_OUT_DATE\" data-name=\"ps_EFF_PHASE_OUT_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_EFF_PHASE_OUT_DATE())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_PS_SPOIL-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_PS_SPOIL\" data-name=\"ps_PS_SPOIL\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_PS_SPOIL())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_CONS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_CONS_NAME\" data-name=\"ps_CONS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_CONS_NAME())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_CONS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_CONS_TYP\" data-name=\"ps_CONS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_CONS_TYP())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_PS_LT_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_PS_LT_NAME\" data-name=\"ps_PS_LT_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_PS_LT_NAME())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_PS_LT_FLG-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_PS_LT_FLG\" data-name=\"ps_PS_LT_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_PS_LT_FLG())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_PS_FIXED_LT-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_PS_FIXED_LT\" data-name=\"ps_PS_FIXED_LT\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_PS_FIXED_LT())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_PS_PROP_LT-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_PS_PROP_LT\" data-name=\"ps_PS_PROP_LT\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_PS_PROP_LT())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_PS_PROP_LOT_SIZE-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_PS_PROP_LOT_SIZE\" data-name=\"ps_PS_PROP_LOT_SIZE\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_PS_PROP_LOT_SIZE())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_PS_REF_NO-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_PS_REF_NO\" data-name=\"ps_PS_REF_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_PS_REF_NO())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_COST_UP_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_COST_UP_NAME\" data-name=\"ps_COST_UP_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_COST_UP_NAME())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_COST_UP_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_COST_UP_TYP\" data-name=\"ps_COST_UP_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_COST_UP_TYP())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_MRP_EXP_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_MRP_EXP_NAME\" data-name=\"ps_MRP_EXP_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_MRP_EXP_NAME())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_MRP_EXP_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_MRP_EXP_TYP\" data-name=\"ps_MRP_EXP_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_MRP_EXP_TYP())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_COMP_MANHOUR_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_COMP_MANHOUR_NAME\" data-name=\"ps_COMP_MANHOUR_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_COMP_MANHOUR_NAME())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_COMP_MANHOUR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_COMP_MANHOUR_TYP\" data-name=\"ps_COMP_MANHOUR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_COMP_MANHOUR_TYP())).append("</span>'");
 AA0170010view1_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view1-ps_PARENT_MANHOUR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view1-ps_PARENT_MANHOUR_TYP\" data-name=\"ps_PARENT_MANHOUR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getps_PARENT_MANHOUR_TYP())).append("</span>'");
 AA0170010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0170010StructLength) {
   AA0170010view1_DB.append(",");
  }
 }
 aAA0170010Struct = structBackup;
 viewIdList.add(AA0170010view1_Id);
 viewSelectList.add(AA0170010view1_select);
 viewResizeList.add(AA0170010view1_resize);
 viewScrollList.add(AA0170010view1_scroll);
 viewHeaderDataList.add(AA0170010view1_HB);
 viewBodyDataList.add(AA0170010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:420px;"><script class="expj-script-AA0170010-AA0170010button2">
expj.AA0170010.AA0170010button2 = {};
expj.AA0170010.AA0170010button2.executeAllOnDecision = function () {
  console.log('execute AA0170010button2.onDecision');
};
expj.AA0170010.AA0170010button2.executeOnLoad = function () {
  expj.AA0170010.AA0170010button2.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button2.executePScriptOnLoad = function () {
  console.log('execute AA0170010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0170010-AA0170010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0170010-AA0170010button2-insertPs">
expj.AA0170010.AA0170010button2.insertPs = {};
// script1="onClick;0;CHK;_AA0170010form1/main_DEVELOP_TYP[eq]1[and]_AA0170010view1/ps_PARENT_MANHOUR_TYP[eq]1@!AA00178"
expj.AA0170010.AA0170010button2.insertPs.onClick0 = function () {
  console.log('insertPs script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010button2', '_AA0170010form1/main_DEVELOP_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010button2', '_AA0170010view1/ps_PARENT_MANHOUR_TYP'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0170010', 'AA0170010button2', 'AA00178');
}
};
// script2="onClick;1;CHK;_AA0170010form1/main_DEVELOP_TYP[eq]1[and]_AA0170010view1/ps_COMP_MANHOUR_TYP[eq]1@!AA00178"
expj.AA0170010.AA0170010button2.insertPs.onClick1 = function () {
  console.log('insertPs script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010button2', '_AA0170010form1/main_DEVELOP_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010button2', '_AA0170010view1/ps_COMP_MANHOUR_TYP'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0170010', 'AA0170010button2', 'AA00178');
}
};
// script3="onClick;2;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0170010form1/*,_AA0170010view1/+@AA0170010Servlet"
expj.AA0170010.AA0170010button2.insertPs.onClick2 = function () {
  console.log('insertPs script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170010button2', '_AA0170010form1/*,_AA0170010view1/+', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.changeBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0170010.AA0170010button2.insertPs.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010button2.insertPs['onClick' + i])) {
        expj.AA0170010.AA0170010button2.insertPs['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010button2.insertPs.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010button2.insertPs.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010button2-insertPs').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010button2', 'insertPs', this, 'Button');
    }
  });
  expj.AA0170010.AA0170010button2.insertPs.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button2.insertPs.executePScriptOnLoad = function () {
  console.log('execute AA0170010button2/insertPs.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010button2-insertPs');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170010button2-insertPs" name="insertPs" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010button2-updatePs">
expj.AA0170010.AA0170010button2.updatePs = {};
// script1="onClick;0;CHK;_AA0170010view1/ps_NO[eq]1@!AA00139"
expj.AA0170010.AA0170010button2.updatePs.onClick0 = function () {
  console.log('updatePs script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010button2', '_AA0170010view1/ps_NO'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0170010', 'AA0170010button2', 'AA00139');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0170010form1/*,_AA0170010view1/+@AA0170010Servlet"
expj.AA0170010.AA0170010button2.updatePs.onClick1 = function () {
  console.log('updatePs script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170010button2', '_AA0170010form1/*,_AA0170010view1/+', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.changeBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0170010.AA0170010button2.updatePs.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010button2.updatePs['onClick' + i])) {
        expj.AA0170010.AA0170010button2.updatePs['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010button2.updatePs.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010button2.updatePs.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010button2-updatePs').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010button2', 'updatePs', this, 'Button');
    }
  });
  expj.AA0170010.AA0170010button2.updatePs.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button2.updatePs.executePScriptOnLoad = function () {
  console.log('execute AA0170010button2/updatePs.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010button2-updatePs');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170010button2-updatePs" name="updatePs" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010button2-deletePs">
expj.AA0170010.AA0170010button2.deletePs = {};
// script1="onClick;0;CHK;_AA0170010view1/ps_NO[eq]1@!AA00139"
expj.AA0170010.AA0170010button2.deletePs.onClick0 = function () {
  console.log('deletePs script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010button2', '_AA0170010view1/ps_NO'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0170010', 'AA0170010button2', 'AA00139');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0170010form1/*,_AA0170010view1/+@AA0170010Servlet,,$ZZ07004"
expj.AA0170010.AA0170010button2.deletePs.onClick1 = function () {
  console.log('deletePs script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170010button2', '_AA0170010form1/*,_AA0170010view1/+', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.updateBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callConfirm('AA0170010', 'AA0170010button2', 'ZZ07004', okEvent);
};
expj.AA0170010.AA0170010button2.deletePs.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010button2.deletePs['onClick' + i])) {
        expj.AA0170010.AA0170010button2.deletePs['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010button2.deletePs.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010button2.deletePs.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010button2-deletePs').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010button2', 'deletePs', this, 'Button');
    }
  });
  expj.AA0170010.AA0170010button2.deletePs.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button2.deletePs.executePScriptOnLoad = function () {
  console.log('execute AA0170010button2/deletePs.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010button2-deletePs');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170010button2-deletePs" name="deletePs" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010button2-deleteAllPs">
expj.AA0170010.AA0170010button2.deleteAllPs = {};
// script1="onClick;0;CHK;_AA0170010view1/ps_NO[eq]1@!AA00139"
expj.AA0170010.AA0170010button2.deleteAllPs.onClick0 = function () {
  console.log('deleteAllPs script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0170010', 'AA0170010button2', '_AA0170010view1/ps_NO'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0170010', 'AA0170010button2', 'AA00139');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0170010form1/*,_AA0170010view1/+@AA0170010Servlet,,$AA90008"
expj.AA0170010.AA0170010button2.deleteAllPs.onClick1 = function () {
  console.log('deleteAllPs script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170010button2', '_AA0170010form1/*,_AA0170010view1/+', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.updateBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callConfirm('AA0170010', 'AA0170010button2', 'AA90008', okEvent);
};
expj.AA0170010.AA0170010button2.deleteAllPs.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010button2.deleteAllPs['onClick' + i])) {
        expj.AA0170010.AA0170010button2.deleteAllPs['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010button2.deleteAllPs.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010button2.deleteAllPs.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010button2-deleteAllPs').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010button2', 'deleteAllPs', this, 'Button');
    }
  });
  expj.AA0170010.AA0170010button2.deleteAllPs.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button2.deleteAllPs.executePScriptOnLoad = function () {
  console.log('execute AA0170010button2/deleteAllPs.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010button2-deleteAllPs');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170010button2-deleteAllPs" name="deleteAllPs" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAll",rb)%></button><!-- 全削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 504px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-AA0170010-AA0170010view2">
expj.AA0170010.AA0170010view2 = {};
expj.AA0170010.AA0170010view2.executeAllOnClick = function () {
};
expj.AA0170010.AA0170010view2.executeAllOnDecision = function () {
  console.log('execute AA0170010view2.onDecision');
};
expj.AA0170010.AA0170010view2.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0170010view2", "expj.AA0170010.AA0170010view2.executeAllOnClick");
%>
  expj.AA0170010.AA0170010view2.executePScriptOnLoad();
};

expj.AA0170010.AA0170010view2.executePScriptOnLoad = function () {
  console.log('execute AA0170010view2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0170010-AA0170010view2" class="expj-datagrid-view expj-view-single" style="width:100%;height:173px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0170010view2_Id = "AA0170010view2";
 String AA0170010view2_select = "single";
 String AA0170010view2_sortable = "true";
 String AA0170010view2_resize = "true";
 String AA0170010view2_scroll = "true";
 StringBuffer AA0170010view2_HB = new StringBuffer();
 StringBuffer AA0170010view2_DB = new StringBuffer();
%>
<%
 AA0170010view2_select = "single";
 AA0170010view2_sortable = "true";
 AA0170010view2_resize = "true";
 AA0170010view2_scroll = "true";
%>
<%
 AA0170010view2_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
%>
      <%
                  List listBackup = aAA0170010Control.getList();
                  aAA0170010Control.setList(aAA0170010Control.getProcedureList());
                %>
<%
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_CD",rb))).append("', 'name':'pr_PROC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NAME",rb))).append("', 'name':'pr_PROC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NO",rb))).append("', 'name':'pr_PROC_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OUTSIDE_TYP_1",rb))).append("', 'name':'pr_OUTSIDE_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_CD",rb))).append("', 'name':'pr_WS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'pr_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb))).append("', 'name':'pr_ACPT_INSPC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.FIXED_LT_1",rb))).append("', 'name':'pr_FIXED_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROP_LT_1",rb))).append("', 'name':'pr_PROP_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROP_LOT_SIZE_1",rb))).append("', 'name':'pr_PROP_LOT_SIZE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SAFETY_LT_1",rb))).append("', 'name':'pr_SAFETY_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SPOIL",rb))).append("', 'name':'pr_SPOIL', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STANDARD_COST",rb))).append("', 'name':'pr_STANDARD_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_OUTSIDE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_ACPT_INSPC_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_WS_NAME', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_VEND_NAME', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_ITEM_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_PLANT_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
AA0170010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'pr_PS_EDITION', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0170010view2_sortable).append("}").append(",");
%>
<%
 int aAA0170010StructLength = aAA0170010Control.getListsize();
 final AA0170010Struct structBackup = aAA0170010Struct;
 aAA0170010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0170010StructLength; ++loopCount) {
  if((aAA0170010Struct = (AA0170010Struct) aAA0170010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0170010Struct", aAA0170010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0170010view2_DB.append("[");
 AA0170010view2_DB.append(loopCount);
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_PROC_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_PROC_CD\" data-name=\"pr_PROC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_PROC_CD())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_PROC_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_PROC_NAME\" data-name=\"pr_PROC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_PROC_NAME())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_PROC_NO-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_PROC_NO\" data-name=\"pr_PROC_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_PROC_NO())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_OUTSIDE_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_OUTSIDE_NAME\" data-name=\"pr_OUTSIDE_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_OUTSIDE_NAME())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_WS_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_WS_CD\" data-name=\"pr_WS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_WS_CD())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_VEND_CD\" data-name=\"pr_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_VEND_CD())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_ACPT_INSPC_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_ACPT_INSPC_NAME\" data-name=\"pr_ACPT_INSPC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_ACPT_INSPC_NAME())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_FIXED_LT-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_FIXED_LT\" data-name=\"pr_FIXED_LT\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_FIXED_LT())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_PROP_LT-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_PROP_LT\" data-name=\"pr_PROP_LT\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_PROP_LT())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_PROP_LOT_SIZE-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_PROP_LOT_SIZE\" data-name=\"pr_PROP_LOT_SIZE\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_PROP_LOT_SIZE())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_SAFETY_LT-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_SAFETY_LT\" data-name=\"pr_SAFETY_LT\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_SAFETY_LT())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_SPOIL-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_SPOIL\" data-name=\"pr_SPOIL\" data-view=\"true\" data-kind=\"OBT_NUMBER;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_SPOIL())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_STANDARD_COST-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_STANDARD_COST\" data-name=\"pr_STANDARD_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_STANDARD_COST())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_OUTSIDE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_OUTSIDE_TYP\" data-name=\"pr_OUTSIDE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_OUTSIDE_TYP())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_ACPT_INSPC_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_ACPT_INSPC_TYP\" data-name=\"pr_ACPT_INSPC_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_ACPT_INSPC_TYP())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_MODIFY_COUNT\" data-name=\"pr_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_MODIFY_COUNT())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_WS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_WS_NAME\" data-name=\"pr_WS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_WS_NAME())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_VEND_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_VEND_NAME\" data-name=\"pr_VEND_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_VEND_NAME())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_ITEM_CD\" data-name=\"pr_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_ITEM_CD())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_ITEM_NAME\" data-name=\"pr_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_ITEM_NAME())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_STOCK_UNIT\" data-name=\"pr_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_STOCK_UNIT())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_PLANT_CD\" data-name=\"pr_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_PLANT_CD())).append("</span>'");
 AA0170010view2_DB.append(",").append("'<span id=\"expj-AA0170010-AA0170010view2-pr_PS_EDITION-").append(loopCount).append("\" class=\"expj-label expj-AA0170010-AA0170010view2-pr_PS_EDITION\" data-name=\"pr_PS_EDITION\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0170010Struct.getpr_PS_EDITION())).append("</span>'");
 AA0170010view2_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0170010StructLength) {
   AA0170010view2_DB.append(",");
  }
 }
 aAA0170010Struct = structBackup;
 viewIdList.add(AA0170010view2_Id);
 viewSelectList.add(AA0170010view2_select);
 viewResizeList.add(AA0170010view2_resize);
 viewScrollList.add(AA0170010view2_scroll);
 viewHeaderDataList.add(AA0170010view2_HB);
 viewBodyDataList.add(AA0170010view2_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:630px;"><script class="expj-script-AA0170010-AA0170010button3">
expj.AA0170010.AA0170010button3 = {};
expj.AA0170010.AA0170010button3.executeAllOnDecision = function () {
  console.log('execute AA0170010button3.onDecision');
};
expj.AA0170010.AA0170010button3.executeOnLoad = function () {
  expj.AA0170010.AA0170010button3.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button3.executePScriptOnLoad = function () {
  console.log('execute AA0170010button3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0170010-AA0170010button3" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:630px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0170010-AA0170010button3-insertProcGrp">
expj.AA0170010.AA0170010button3.insertProcGrp = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0170010form1/*,_AA0170010view2/+@AA0170010Servlet"
expj.AA0170010.AA0170010button3.insertProcGrp.onClick0 = function () {
  console.log('insertProcGrp script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170010button3', '_AA0170010form1/*,_AA0170010view2/+', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.changeBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0170010.AA0170010button3.insertProcGrp.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010button3.insertProcGrp['onClick' + i])) {
        expj.AA0170010.AA0170010button3.insertProcGrp['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010button3.insertProcGrp.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010button3.insertProcGrp.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010button3-insertProcGrp').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010button3', 'insertProcGrp', this, 'Button');
    }
  });
  expj.AA0170010.AA0170010button3.insertProcGrp.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button3.insertProcGrp.executePScriptOnLoad = function () {
  console.log('execute AA0170010button3/insertProcGrp.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010button3-insertProcGrp');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170010button3-insertProcGrp" name="insertProcGrp" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010button3-updateProcGrp">
expj.AA0170010.AA0170010button3.updateProcGrp = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0170010form1/*,_AA0170010view2/+@AA0170010Servlet"
expj.AA0170010.AA0170010button3.updateProcGrp.onClick0 = function () {
  console.log('updateProcGrp script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170010button3', '_AA0170010form1/*,_AA0170010view2/+', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.changeBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0170010.AA0170010button3.updateProcGrp.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010button3.updateProcGrp['onClick' + i])) {
        expj.AA0170010.AA0170010button3.updateProcGrp['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010button3.updateProcGrp.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010button3.updateProcGrp.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010button3-updateProcGrp').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010button3', 'updateProcGrp', this, 'Button');
    }
  });
  expj.AA0170010.AA0170010button3.updateProcGrp.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button3.updateProcGrp.executePScriptOnLoad = function () {
  console.log('execute AA0170010button3/updateProcGrp.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010button3-updateProcGrp');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170010button3-updateProcGrp" name="updateProcGrp" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010button3-copyProcGrp">
expj.AA0170010.AA0170010button3.copyProcGrp = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0170010form1/*,_AA0170010view2/+@AA0170010Servlet"
expj.AA0170010.AA0170010button3.copyProcGrp.onClick0 = function () {
  console.log('copyProcGrp script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170010button3', '_AA0170010form1/*,_AA0170010view2/+', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.changeBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0170010.AA0170010button3.copyProcGrp.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010button3.copyProcGrp['onClick' + i])) {
        expj.AA0170010.AA0170010button3.copyProcGrp['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010button3.copyProcGrp.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010button3.copyProcGrp.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010button3-copyProcGrp').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010button3', 'copyProcGrp', this, 'Button');
    }
  });
  expj.AA0170010.AA0170010button3.copyProcGrp.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button3.copyProcGrp.executePScriptOnLoad = function () {
  console.log('execute AA0170010button3/copyProcGrp.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010button3-copyProcGrp');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170010button3-copyProcGrp" name="copyProcGrp" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineCopy",rb)%></button><!-- 行複写ボタン --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010button3-deleteProcGrp">
expj.AA0170010.AA0170010button3.deleteProcGrp = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0170010form1/*,_AA0170010view2/+@AA0170010Servlet,,$ZZ07004"
expj.AA0170010.AA0170010button3.deleteProcGrp.onClick0 = function () {
  console.log('deleteProcGrp script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170010button3', '_AA0170010form1/*,_AA0170010view2/+', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.updateBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callConfirm('AA0170010', 'AA0170010button3', 'ZZ07004', okEvent);
};
expj.AA0170010.AA0170010button3.deleteProcGrp.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010button3.deleteProcGrp['onClick' + i])) {
        expj.AA0170010.AA0170010button3.deleteProcGrp['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010button3.deleteProcGrp.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010button3.deleteProcGrp.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010button3-deleteProcGrp').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010button3', 'deleteProcGrp', this, 'Button');
    }
  });
  expj.AA0170010.AA0170010button3.deleteProcGrp.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button3.deleteProcGrp.executePScriptOnLoad = function () {
  console.log('execute AA0170010button3/deleteProcGrp.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010button3-deleteProcGrp');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170010button3-deleteProcGrp" name="deleteProcGrp" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010button3-deleteAllProcGrp">
expj.AA0170010.AA0170010button3.deleteAllProcGrp = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0170010form1/*,_AA0170010view2/+@AA0170010Servlet,,$ZZ07014"
expj.AA0170010.AA0170010button3.deleteAllProcGrp.onClick0 = function () {
  console.log('deleteAllProcGrp script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170010button3', '_AA0170010form1/*,_AA0170010view2/+', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.updateBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callConfirm('AA0170010', 'AA0170010button3', 'ZZ07014', okEvent);
};
expj.AA0170010.AA0170010button3.deleteAllProcGrp.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010button3.deleteAllProcGrp['onClick' + i])) {
        expj.AA0170010.AA0170010button3.deleteAllProcGrp['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010button3.deleteAllProcGrp.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010button3.deleteAllProcGrp.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010button3-deleteAllProcGrp').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010button3', 'deleteAllProcGrp', this, 'Button');
    }
  });
  expj.AA0170010.AA0170010button3.deleteAllProcGrp.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button3.deleteAllProcGrp.executePScriptOnLoad = function () {
  console.log('execute AA0170010button3/deleteAllProcGrp.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010button3-deleteAllProcGrp');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170010button3-deleteAllProcGrp" name="deleteAllProcGrp" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAll",rb)%></button><!-- 全削除ボタン --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010button3-renumProcGrp">
expj.AA0170010.AA0170010button3.renumProcGrp = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0170010form1/*,_AA0170010view2/+@AA0170010Servlet,,$ZZ07009"
expj.AA0170010.AA0170010button3.renumProcGrp.onClick0 = function () {
  console.log('renumProcGrp script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170010button3', '_AA0170010form1/*,_AA0170010view2/+', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.updateBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callConfirm('AA0170010', 'AA0170010button3', 'ZZ07009', okEvent);
};
expj.AA0170010.AA0170010button3.renumProcGrp.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010button3.renumProcGrp['onClick' + i])) {
        expj.AA0170010.AA0170010button3.renumProcGrp['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010button3.renumProcGrp.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010button3.renumProcGrp.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010button3-renumProcGrp').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010button3', 'renumProcGrp', this, 'Button');
    }
  });
  expj.AA0170010.AA0170010button3.renumProcGrp.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button3.renumProcGrp.executePScriptOnLoad = function () {
  console.log('execute AA0170010button3/renumProcGrp.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010button3-renumProcGrp');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170010button3-renumProcGrp" name="renumProcGrp" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnChangeNumber",rb)%></button><!-- 番号再振ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 714px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0170010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0170010-AA0170010button0">
expj.AA0170010.AA0170010button0 = {};
expj.AA0170010.AA0170010button0.executeAllOnDecision = function () {
  console.log('execute AA0170010button0.onDecision');
};
expj.AA0170010.AA0170010button0.executeOnLoad = function () {
  expj.AA0170010.AA0170010button0.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button0.executePScriptOnLoad = function () {
  console.log('execute AA0170010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0170010-AA0170010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0170010-AA0170010button0-clear">
expj.AA0170010.AA0170010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0170010Servlet,,$ZZ07008"
expj.AA0170010.AA0170010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0170010', 'AA0170010button0', '', 'AA0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0170010', response);
expj.common.updateBusinessScreenTab('AA0170010', contents);
};
expj.common.pscript.callConfirm('AA0170010', 'AA0170010button0', 'ZZ07008', okEvent);
};
expj.AA0170010.AA0170010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010button0.clear['onClick' + i])) {
        expj.AA0170010.AA0170010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010button0.clear.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010button0.clear.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010button0', 'clear', this, 'Button');
    }
  });
  expj.AA0170010.AA0170010button0.clear.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AA0170010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170010button0-clear" name="clear" class="AA0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0170010-AA0170010button0-Close">
expj.AA0170010.AA0170010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AA0170010.AA0170010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AA0170010');
};
expj.AA0170010.AA0170010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0170010.AA0170010button0.Close['onClick' + i])) {
        expj.AA0170010.AA0170010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AA0170010.AA0170010button0.Close.executeAllOnDecision = function () {
};
expj.AA0170010.AA0170010button0.Close.executeOnLoad = function () {
  $('#expj-AA0170010-AA0170010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0170010', 'AA0170010button0', 'Close', this, 'Button');
    }
  });
  expj.AA0170010.AA0170010button0.Close.executePScriptOnLoad();
};

expj.AA0170010.AA0170010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AA0170010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AA0170010-AA0170010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0170010-AA0170010button0-Close" name="Close" class="AA0170010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0170010 (END)-->
<%
MessageStruct msgStruct = aAA0170010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0170010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0170010)) {
  expj.common.treeInstanceMap.AA0170010 = {};
}
expj.common.treeInstanceMap.AA0170010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0170010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0170010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0170010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0170010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0170010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0170010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010)) {
  expj.common.detailDialogMap.AA0170010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0170010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0170010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0170010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0170010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0170010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0170010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0170010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0170010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0170010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0170010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0170010)) {
  expj.common.viewInstanceMap.AA0170010 = {};
}
expj.common.viewInstanceMap.AA0170010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0170010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0170010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0170010.<%=viewId %>.init = function () {
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
    expj.AA0170010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0170010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0170010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0170010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0170010_init">
/**
 * AA0170010用のロード完了時初期化関数
 */
expj.AA0170010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0170010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0170010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0170010');
  expj.common.calendarInstanceMap.AA0170010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0170010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0170010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0170010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0170010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0170010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0170010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0170010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0170010.AA0170010form1.main_TARGET_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010form1.PeekerTargetItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010form1.main_DEVELOP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010form1.main_TARGET_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010form1.CalendarTargetDate.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010form1.main_LEVEL.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010form1.hidden_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010form1.hidden_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button1.select.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button2.insertPs.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button2.updatePs.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button2.deletePs.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button2.deleteAllPs.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button3.insertProcGrp.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button3.updateProcGrp.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button3.copyProcGrp.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button3.deleteProcGrp.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button3.deleteAllProcGrp.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button3.renumProcGrp.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010form1.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button1.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010view1.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button2.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010view2.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button3.executeOnLoad();}catch(e){};
  try{expj.AA0170010.AA0170010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0170010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0170010', 'AA0170010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0170010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0170010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0170010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0170010', '<%=request.getContextPath() %>');
};

/**
 * AA0170010の全体onDecision処理
 */
expj.AA0170010.executeAllOnDecision = function () {
  expj.AA0170010.AA0170010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0170010_console">
expj.AA0170010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>