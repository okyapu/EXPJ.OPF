<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 13 16:30:04 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0060\AZ0060010iframe.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AZ0060.*" %>
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
<jsp:useBean id="aAZ0060010Control" class="com.nec.jp.orteus.metamorBase.AZ0060.AZ0060010Control" scope="request"/>
<jsp:useBean id="aAZ0060010Struct" class="com.nec.jp.orteus.metamorBase.AZ0060.AZ0060010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

表示変更
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0060/jsp/AZ0060010iframe.jsp,v $
$Author: geng-jia $	
$Revision: 1.14 $　$Date: 2017/02/22 01:42:18 $
********************************************************* --%>
<html>
<head>
<title>表示変更</title>
<%@include file="common/expj_v5.jsp" %>
<script>
	var data = "<root>";
	
	function onInitializeOnLoad(){
		setDataGridDataParent("AZ0060010",data + "</root>");
	}
</script>
<% 

String screen_Url = null;
if("BA0040010Servlet".equals(aAZ0060010Control.getScreen_url())){
	screen_Url = "BA0020010Servlet";
}else{
	screen_Url = aAZ0060010Control.getScreen_url();
}
ScreenMoveUtil su1 = new ScreenMoveUtil(screen_Url,so); 
ScreenMoveUtil su2 = new ScreenMoveUtil(screen_Url,so); 

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
<script class="expj-script-AZ0060010_init">
  // AZ0060010名前空間
  expj.AZ0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>

<body>
<%
	aAZ0060010Control.setList(aAZ0060010Control.getDetailList());		  
%>

  <script class="expj-script-AZ0060010-AZ0060010view2">
expj.AZ0060010.AZ0060010view2 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AZ0060010.AZ0060010view2.onLoad0 = function () {
  console.log('AZ0060010view2 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;?AZ0060010view2/*[eq]NORMAL@*0,*1"
expj.AZ0060010.AZ0060010view2.onDecision0 = function () {
  console.log('AZ0060010view2 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AZ0060010', 'AZ0060010view2', '?AZ0060010view2/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AZ0060010button2/CheckAll"
expj.AZ0060010.AZ0060010view2.child0 = function () {
  console.log('AZ0060010view2 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/CheckAll');
};
// script4="child;1;MASK;_AZ0060010button2/CheckAll"
expj.AZ0060010.AZ0060010view2.child1 = function () {
  console.log('AZ0060010view2 script4');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/CheckAll');
};
// script5="onLoad;1;CALL;onClick@0,1,2,3,4"
expj.AZ0060010.AZ0060010view2.onLoad1 = function () {
  console.log('AZ0060010view2 script5');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick1)){this.onClick1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick2)){this.onClick2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick3)){this.onClick3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick4)){this.onClick4();}
};
// script6="onClick;0;CHK;?AZ0060010view2/?[eq]NOT_SELECTED@*2,*3"
expj.AZ0060010.AZ0060010view2.onClick0 = function () {
  console.log('AZ0060010view2 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AZ0060010', 'AZ0060010view2', '?AZ0060010view2/?'), '[eq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script7="child;2;MASK;_AZ0060010button2/ApprAssort,_AZ0060010button2/ReserveAssort,_AZ0060010button2/ReserveDelAssort,_AZ0060010button2/ApprDelAssort,_AZ0060010button2/MastInfo,_AZ0060010button2/ApprInfo"
expj.AZ0060010.AZ0060010view2.child2 = function () {
  console.log('AZ0060010view2 script7');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprAssort');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ReserveAssort');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ReserveDelAssort');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprDelAssort');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/MastInfo');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprInfo');
};
// script9="child;3;SELCHK;AZ0060010view2:_h_STATUS[eq]1@*4,*6"
expj.AZ0060010.AZ0060010view2.child3 = function () {
  console.log('AZ0060010view2 script9');
var selectCells = expj.common.pscript.getSelectedVIEWCells('AZ0060010', 'AZ0060010view2');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.h_STATUS, '[eq]', '1'))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;4;UNMASK;_AZ0060010button2/ApprAssort,_AZ0060010button2/ReserveAssort,_AZ0060010button2/ApprDelAssort@*5"
expj.AZ0060010.AZ0060010view2.child4 = function () {
  console.log('AZ0060010view2 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprAssort');
expj.common.pscript.setUnMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ReserveAssort');
expj.common.pscript.setUnMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprDelAssort');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script11="child;5;MASK;_AZ0060010button2/ReserveDelAssort"
expj.AZ0060010.AZ0060010view2.child5 = function () {
  console.log('AZ0060010view2 script11');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ReserveDelAssort');
};
// script12="child;6;SELCHK;AZ0060010view2:_h_STATUS[eq]2@*7,*9"
expj.AZ0060010.AZ0060010view2.child6 = function () {
  console.log('AZ0060010view2 script12');
var selectCells = expj.common.pscript.getSelectedVIEWCells('AZ0060010', 'AZ0060010view2');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.h_STATUS, '[eq]', '2'))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script13="child;7;UNMASK;_AZ0060010button2/ReserveDelAssort@*8"
expj.AZ0060010.AZ0060010view2.child7 = function () {
  console.log('AZ0060010view2 script13');
expj.common.pscript.setUnMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ReserveDelAssort');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script14="child;8;MASK;_AZ0060010button2/ApprAssort,_AZ0060010button2/ReserveAssort,_AZ0060010button2/ApprDelAssort"
expj.AZ0060010.AZ0060010view2.child8 = function () {
  console.log('AZ0060010view2 script14');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprAssort');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ReserveAssort');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprDelAssort');
};
// script15="child;9;MASK;_AZ0060010button2/ApprAssort,_AZ0060010button2/ReserveAssort,_AZ0060010button2/ReserveDelAssort,_AZ0060010button2/ApprDelAssort"
expj.AZ0060010.AZ0060010view2.child9 = function () {
  console.log('AZ0060010view2 script15');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprAssort');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ReserveAssort');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ReserveDelAssort');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprDelAssort');
};
// script16="onClick;1;CHK;?AZ0060010view2/?[eq]SINGLE@*10,*17"
expj.AZ0060010.AZ0060010view2.onClick1 = function () {
  console.log('AZ0060010view2 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AZ0060010', 'AZ0060010view2', '?AZ0060010view2/?'), '[eq]', 'SINGLE')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script17="child;10;SELCHK;AZ0060010view2:_h_PROC_TYP[eq]1@*11,*13"
expj.AZ0060010.AZ0060010view2.child10 = function () {
  console.log('AZ0060010view2 script17');
var selectCells = expj.common.pscript.getSelectedVIEWCells('AZ0060010', 'AZ0060010view2');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.h_PROC_TYP, '[eq]', '1'))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script18="child;11;UNMASK;_AZ0060010button2/ApprInfo@*12"
expj.AZ0060010.AZ0060010view2.child11 = function () {
  console.log('AZ0060010view2 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprInfo');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child12)){this.child12();}}
};
// script19="child;12;MASK;_AZ0060010button2/MastInfo"
expj.AZ0060010.AZ0060010view2.child12 = function () {
  console.log('AZ0060010view2 script19');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/MastInfo');
};
// script20="child;13;SELCHK;AZ0060010view2:_h_PROC_TYP[eq]2@*14,*15"
expj.AZ0060010.AZ0060010view2.child13 = function () {
  console.log('AZ0060010view2 script20');
var selectCells = expj.common.pscript.getSelectedVIEWCells('AZ0060010', 'AZ0060010view2');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.h_PROC_TYP, '[eq]', '2'))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script21="child;14;UNMASK;_AZ0060010button2/MastInfo,_AZ0060010button2/ApprInfo"
expj.AZ0060010.AZ0060010view2.child14 = function () {
  console.log('AZ0060010view2 script21');
expj.common.pscript.setUnMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/MastInfo');
expj.common.pscript.setUnMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprInfo');
};
// script22="child;15;UNMASK;_AZ0060010button2/MastInfo@*16"
expj.AZ0060010.AZ0060010view2.child15 = function () {
  console.log('AZ0060010view2 script22');
expj.common.pscript.setUnMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/MastInfo');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child16)){this.child16();}}
};
// script23="child;16;MASK;_AZ0060010button2/ApprInfo"
expj.AZ0060010.AZ0060010view2.child16 = function () {
  console.log('AZ0060010view2 script23');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprInfo');
};
// script24="child;17;MASK;_AZ0060010button2/MastInfo,_AZ0060010button2/ApprInfo"
expj.AZ0060010.AZ0060010view2.child17 = function () {
  console.log('AZ0060010view2 script24');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/MastInfo');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprInfo');
};
// script25="onClick;2;CHK;_AZ0060010form1/h_APPR_POWER_TYP[eq]0@*18"
expj.AZ0060010.AZ0060010view2.onClick2 = function () {
  console.log('AZ0060010view2 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AZ0060010', 'AZ0060010view2', '_AZ0060010form1/h_APPR_POWER_TYP'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script26="child;18;MASK;_AZ0060010button2/ApprAssort,_AZ0060010button2/ReserveAssort,_AZ0060010button2/ReserveDelAssort"
expj.AZ0060010.AZ0060010view2.child18 = function () {
  console.log('AZ0060010view2 script26');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprAssort');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ReserveAssort');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ReserveDelAssort');
};
// script27="onClick;3;CHK;?AZ0060010view2/?[eq]NOT_SELECTED@*19,*20"
expj.AZ0060010.AZ0060010view2.onClick3 = function () {
  console.log('AZ0060010view2 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AZ0060010', 'AZ0060010view2', '?AZ0060010view2/?'), '[eq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script28="child;19;MASK;_AZ0060010button2/ApprDelAssort"
expj.AZ0060010.AZ0060010view2.child19 = function () {
  console.log('AZ0060010view2 script28');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprDelAssort');
};
// script29="child;20;SELCHK;AZ0060010view2:_l_REQUEST_BY[eq]<%=aAZ0060010Control.getsysUSER_CD()%>@*21,*19"
expj.AZ0060010.AZ0060010view2.child20 = function () {
  console.log('AZ0060010view2 script29');
var selectCells = expj.common.pscript.getSelectedVIEWCells('AZ0060010', 'AZ0060010view2');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.l_REQUEST_BY, '[eq]', '<%=aAZ0060010Control.getsysUSER_CD()%>'))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script30="child;21;UNMASK;_AZ0060010button2/ApprDelAssort"
expj.AZ0060010.AZ0060010view2.child21 = function () {
  console.log('AZ0060010view2 script30');
expj.common.pscript.setUnMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprDelAssort');
};
// script31="onClick;4;CHK;?AZ0060010view2/?[neq]NOT_SELECTED@*22"
expj.AZ0060010.AZ0060010view2.onClick4 = function () {
  console.log('AZ0060010view2 script31');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AZ0060010', 'AZ0060010view2', '?AZ0060010view2/?'), '[neq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script32="child;22;CHK;_AZ0060010form1/h_REQUEST_APPR_SAME[eq]0@*23"
expj.AZ0060010.AZ0060010view2.child22 = function () {
  console.log('AZ0060010view2 script32');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AZ0060010', 'AZ0060010view2', '_AZ0060010form1/h_REQUEST_APPR_SAME'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script33="child;23;SELCHKT;AZ0060010view2:_l_REQUEST_BY[eq]<%=aAZ0060010Control.getsysUSER_CD()%>@*24"
expj.AZ0060010.AZ0060010view2.child23 = function () {
  console.log('AZ0060010view2 script33');
var selectCells = expj.common.pscript.getSelectedVIEWCells('AZ0060010', 'AZ0060010view2');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_REQUEST_BY, '[eq]', '<%=aAZ0060010Control.getsysUSER_CD()%>')) {
checkFlg = true;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script34="child;24;MASK;_AZ0060010button2/ApprAssort,_AZ0060010button2/ReserveAssort,_AZ0060010button2/ReserveDelAssort"
expj.AZ0060010.AZ0060010view2.child24 = function () {
  console.log('AZ0060010view2 script34');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ApprAssort');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ReserveAssort');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button2/ReserveDelAssort');
};
// script35="onClick;5;CHK;?AZ0060010view2/?[eq]SINGLE@*25"
expj.AZ0060010.AZ0060010view2.onClick5 = function () {
  console.log('AZ0060010view2 script35');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AZ0060010', 'AZ0060010view2', '?AZ0060010view2/?'), '[eq]', 'SINGLE')) {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
}
};
// script36="child;25;FSHOW;AZ0060010float1@93"
expj.AZ0060010.AZ0060010view2.child25 = function () {
  console.log('AZ0060010view2 script36');
expj.common.pscript.showDetailWindow('AZ0060010', 'AZ0060010float1', '93');
};
// script37="onClick;6;CHK;?AZ0060010view2/?[eq]SINGLE@*26"
expj.AZ0060010.AZ0060010view2.onClick6 = function () {
  console.log('AZ0060010view2 script37');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AZ0060010', 'AZ0060010view2', '?AZ0060010view2/?'), '[eq]', 'SINGLE')) {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script38="child;26;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ClickDetail=ACT,_AZ0060010view2/+@AZ0060010Servlet"
expj.AZ0060010.AZ0060010view2.child26 = function () {
  console.log('AZ0060010view2 script38');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AZ0060010', 'AZ0060010view2', 'ClickDetail=ACT,_AZ0060010view2/+', 'AZ0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AZ0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AZ0060010', response);
expj.common.updateBusinessScreenTab('AZ0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AZ0060010.AZ0060010view2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0060010.AZ0060010view2['onClick' + i])) {
        expj.AZ0060010.AZ0060010view2['onClick' + i]();
      }
    }
  }
};
expj.AZ0060010.AZ0060010view2.executeAllOnDecision = function () {
  console.log('execute AZ0060010view2.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0060010.AZ0060010view2['onDecision' + i])) {
        expj.AZ0060010.AZ0060010view2['onDecision' + i]();
      }
    }
  }
};
expj.AZ0060010.AZ0060010view2.executeOnLoad = function () {
<%
    viewSelectEvent.put("AZ0060010view2", "expj.AZ0060010.AZ0060010view2.executeAllOnClick");
%>
  expj.AZ0060010.AZ0060010view2.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010view2.executePScriptOnLoad = function () {
  console.log('execute AZ0060010view2.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AZ0060010.AZ0060010view2['onLoad' + i])) {
      expj.AZ0060010.AZ0060010view2['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AZ0060010-AZ0060010view2" class="expj-datagrid-view expj-view-multi" style="width:100%;height:170px;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aAZ0060010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String AZ0060010view2_Id = "AZ0060010view2";
 String AZ0060010view2_select = "single";
 String AZ0060010view2_sortable = "true";
 String AZ0060010view2_resize = "true";
 String AZ0060010view2_scroll = "true";
 StringBuffer AZ0060010view2_HB = new StringBuffer();
 StringBuffer AZ0060010view2_DB = new StringBuffer();
%>
<%
 AZ0060010view2_select = "multi";
 AZ0060010view2_sortable = "true";
 AZ0060010view2_resize = "true";
 AZ0060010view2_scroll = "true";
%>
<%
 AZ0060010view2_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
%>
    <%
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_STATUS', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_APPR_ID', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EXEC_TYP",rb))).append("', 'name':'l_PROC_TYP_VALUE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_PROC_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5099",rb))).append("', 'name':'l_STATUS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5082",rb))).append("', 'name':'l_REQUEST_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3167",rb))).append("', 'name':'l_REQUEST_BY_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_REQUEST_BY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3165",rb))).append("', 'name':'l_APPR_REMARKS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3163",rb))).append("', 'name':'l_RESERVE_CAUSE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5088",rb))).append("', 'name':'l_ITEM_COL1', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5089",rb))).append("', 'name':'l_ITEM_COL2', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5090",rb))).append("', 'name':'l_ITEM_COL3', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5091",rb))).append("', 'name':'l_ITEM_COL4', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'95px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5092",rb))).append("', 'name':'l_ITEM_COL5', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_KEY1', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_VALUE1', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_KEY2', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_VALUE2', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_KEY3', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_VALUE3', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_KEY4', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_VALUE4', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_KEY5', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_VALUE5', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_KEY6', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_VALUE6', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_KEY7', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_VALUE7', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_TABLE_NAME', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
%>
<%
 int aAZ0060010StructLength = aAZ0060010Control.getListsize();
 final AZ0060010Struct structBackup = aAZ0060010Struct;
 aAZ0060010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAZ0060010StructLength; ++loopCount) {
  if((aAZ0060010Struct = (AZ0060010Struct) aAZ0060010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAZ0060010Struct", aAZ0060010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AZ0060010view2_DB.append("[");
 AZ0060010view2_DB.append(loopCount);
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_STATUS-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_STATUS\" data-name=\"h_STATUS\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_STATUS())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_APPR_ID-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_APPR_ID\" data-name=\"h_APPR_ID\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_APPR_ID())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-l_PROC_TYP_VALUE-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-l_PROC_TYP_VALUE\" data-name=\"l_PROC_TYP_VALUE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_PROC_TYP_VALUE())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_PROC_TYP-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_PROC_TYP\" data-name=\"h_PROC_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_PROC_TYP())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-l_STATUS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-l_STATUS_NAME\" data-name=\"l_STATUS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_STATUS_NAME())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-l_REQUEST_DATE-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-l_REQUEST_DATE\" data-name=\"l_REQUEST_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_REQUEST_DATE())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-l_REQUEST_BY_NAME-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-l_REQUEST_BY_NAME\" data-name=\"l_REQUEST_BY_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_REQUEST_BY_NAME())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-l_REQUEST_BY-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-l_REQUEST_BY\" data-name=\"l_REQUEST_BY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_REQUEST_BY())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-l_APPR_REMARKS-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-l_APPR_REMARKS\" data-name=\"l_APPR_REMARKS\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_APPR_REMARKS())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-l_RESERVE_CAUSE-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-l_RESERVE_CAUSE\" data-name=\"l_RESERVE_CAUSE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_RESERVE_CAUSE())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-l_ITEM_COL1-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-l_ITEM_COL1\" data-name=\"l_ITEM_COL1\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_ITEM_COL1())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-l_ITEM_COL2-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-l_ITEM_COL2\" data-name=\"l_ITEM_COL2\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_ITEM_COL2())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-l_ITEM_COL3-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-l_ITEM_COL3\" data-name=\"l_ITEM_COL3\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_ITEM_COL3())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-l_ITEM_COL4-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-l_ITEM_COL4\" data-name=\"l_ITEM_COL4\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_ITEM_COL4())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-l_ITEM_COL5-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-l_ITEM_COL5\" data-name=\"l_ITEM_COL5\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_ITEM_COL5())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_MODIFY_COUNT\" data-name=\"h_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_MODIFY_COUNT())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_KEY1-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_KEY1\" data-name=\"h_KEY1\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_KEY1())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_VALUE1-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_VALUE1\" data-name=\"h_VALUE1\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_VALUE1())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_KEY2-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_KEY2\" data-name=\"h_KEY2\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_KEY2())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_VALUE2-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_VALUE2\" data-name=\"h_VALUE2\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_VALUE2())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_KEY3-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_KEY3\" data-name=\"h_KEY3\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_KEY3())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_VALUE3-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_VALUE3\" data-name=\"h_VALUE3\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_VALUE3())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_KEY4-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_KEY4\" data-name=\"h_KEY4\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_KEY4())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_VALUE4-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_VALUE4\" data-name=\"h_VALUE4\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_VALUE4())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_KEY5-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_KEY5\" data-name=\"h_KEY5\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_KEY5())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_VALUE5-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_VALUE5\" data-name=\"h_VALUE5\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_VALUE5())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_KEY6-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_KEY6\" data-name=\"h_KEY6\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_KEY6())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_VALUE6-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_VALUE6\" data-name=\"h_VALUE6\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_VALUE6())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_KEY7-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_KEY7\" data-name=\"h_KEY7\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_KEY7())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_VALUE7-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_VALUE7\" data-name=\"h_VALUE7\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_VALUE7())).append("</span>'");
 AZ0060010view2_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view2-h_TABLE_NAME-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view2-h_TABLE_NAME\" data-name=\"h_TABLE_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_TABLE_NAME())).append("</span>'");
 AZ0060010view2_DB.append("]");
%>
<%
if (loopCount + 1 < aAZ0060010StructLength) {
   AZ0060010view2_DB.append(",");
  }
 }
 aAZ0060010Struct = structBackup;
 viewIdList.add(AZ0060010view2_Id);
 viewSelectList.add(AZ0060010view2_select);
 viewResizeList.add(AZ0060010view2_resize);
 viewScrollList.add(AZ0060010view2_scroll);
 viewHeaderDataList.add(AZ0060010view2_HB);
 viewBodyDataList.add(AZ0060010view2_DB);
%>
<%
}
%>
<script class="expj-script-AZ0060010-AZ0060010button2">
expj.AZ0060010.AZ0060010button2 = {};
expj.AZ0060010.AZ0060010button2.executeAllOnDecision = function () {
  console.log('execute AZ0060010button2.onDecision');
};
expj.AZ0060010.AZ0060010button2.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010button2.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010button2.executePScriptOnLoad = function () {
  console.log('execute AZ0060010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AZ0060010-AZ0060010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:735px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AZ0060010-AZ0060010button2-ApprAssort">
expj.AZ0060010.AZ0060010button2.ApprAssort = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AZ0060010form1/*,_AZ0060010view1/+,_AZ0060010view2/+@AZ0060010Servlet,,$AZ00038"
expj.AZ0060010.AZ0060010button2.ApprAssort.onClick0 = function () {
  console.log('ApprAssort script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AZ0060010', 'AZ0060010button2', '_AZ0060010form1/*,_AZ0060010view1/+,_AZ0060010view2/+', 'AZ0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AZ0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AZ0060010', response);
expj.common.updateBusinessScreenTab('AZ0060010', contents);
};
expj.common.pscript.callConfirm('AZ0060010', 'AZ0060010button2', 'AZ00038', okEvent);
};
expj.AZ0060010.AZ0060010button2.ApprAssort.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0060010.AZ0060010button2.ApprAssort['onClick' + i])) {
        expj.AZ0060010.AZ0060010button2.ApprAssort['onClick' + i]();
      }
    }
  }
};
expj.AZ0060010.AZ0060010button2.ApprAssort.executeAllOnDecision = function () {
};
expj.AZ0060010.AZ0060010button2.ApprAssort.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010button2-ApprAssort').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0060010', 'AZ0060010button2', 'ApprAssort', this, 'Button');
    }
  });
  expj.AZ0060010.AZ0060010button2.ApprAssort.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010button2.ApprAssort.executePScriptOnLoad = function () {
  console.log('execute AZ0060010button2/ApprAssort.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010button2-ApprAssort');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AZ0060010-AZ0060010button2-ApprAssort" name="ApprAssort" class="AZ0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnApprAssort",rb)%></button><!-- 選択承認ボタン --></div><!--/td-->
<script class="expj-script-AZ0060010-AZ0060010button2-ReserveAssort">
expj.AZ0060010.AZ0060010button2.ReserveAssort = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AZ0060010form1/*,_AZ0060010view1/+,_AZ0060010form2/*,_AZ0060010view2/+@AZ0060010Servlet,,$AZ00039"
expj.AZ0060010.AZ0060010button2.ReserveAssort.onClick0 = function () {
  console.log('ReserveAssort script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AZ0060010', 'AZ0060010button2', '_AZ0060010form1/*,_AZ0060010view1/+,_AZ0060010form2/*,_AZ0060010view2/+', 'AZ0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AZ0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AZ0060010', response);
expj.common.updateBusinessScreenTab('AZ0060010', contents);
};
expj.common.pscript.callConfirm('AZ0060010', 'AZ0060010button2', 'AZ00039', okEvent);
};
expj.AZ0060010.AZ0060010button2.ReserveAssort.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0060010.AZ0060010button2.ReserveAssort['onClick' + i])) {
        expj.AZ0060010.AZ0060010button2.ReserveAssort['onClick' + i]();
      }
    }
  }
};
expj.AZ0060010.AZ0060010button2.ReserveAssort.executeAllOnDecision = function () {
};
expj.AZ0060010.AZ0060010button2.ReserveAssort.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010button2-ReserveAssort').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0060010', 'AZ0060010button2', 'ReserveAssort', this, 'Button');
    }
  });
  expj.AZ0060010.AZ0060010button2.ReserveAssort.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010button2.ReserveAssort.executePScriptOnLoad = function () {
  console.log('execute AZ0060010button2/ReserveAssort.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010button2-ReserveAssort');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AZ0060010-AZ0060010button2-ReserveAssort" name="ReserveAssort" class="AZ0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReserveAssort",rb)%></button><!-- 選択保留ボタン --></div><!--/td-->
<script class="expj-script-AZ0060010-AZ0060010button2-ReserveDelAssort">
expj.AZ0060010.AZ0060010button2.ReserveDelAssort = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AZ0060010form1/*,_AZ0060010view1/+,_AZ0060010view2/+@AZ0060010Servlet,,$AZ00040"
expj.AZ0060010.AZ0060010button2.ReserveDelAssort.onClick0 = function () {
  console.log('ReserveDelAssort script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AZ0060010', 'AZ0060010button2', '_AZ0060010form1/*,_AZ0060010view1/+,_AZ0060010view2/+', 'AZ0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AZ0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AZ0060010', response);
expj.common.updateBusinessScreenTab('AZ0060010', contents);
};
expj.common.pscript.callConfirm('AZ0060010', 'AZ0060010button2', 'AZ00040', okEvent);
};
expj.AZ0060010.AZ0060010button2.ReserveDelAssort.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0060010.AZ0060010button2.ReserveDelAssort['onClick' + i])) {
        expj.AZ0060010.AZ0060010button2.ReserveDelAssort['onClick' + i]();
      }
    }
  }
};
expj.AZ0060010.AZ0060010button2.ReserveDelAssort.executeAllOnDecision = function () {
};
expj.AZ0060010.AZ0060010button2.ReserveDelAssort.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010button2-ReserveDelAssort').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0060010', 'AZ0060010button2', 'ReserveDelAssort', this, 'Button');
    }
  });
  expj.AZ0060010.AZ0060010button2.ReserveDelAssort.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010button2.ReserveDelAssort.executePScriptOnLoad = function () {
  console.log('execute AZ0060010button2/ReserveDelAssort.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010button2-ReserveDelAssort');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AZ0060010-AZ0060010button2-ReserveDelAssort" name="ReserveDelAssort" class="AZ0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReserveDelAssort",rb)%></button><!-- 選択保留解除ボタン --></div><!--/td-->
<script class="expj-script-AZ0060010-AZ0060010button2-ApprDelAssort">
expj.AZ0060010.AZ0060010button2.ApprDelAssort = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AZ0060010form1/*,_AZ0060010view1/+,_AZ0060010view2/+@AZ0060010Servlet,,$AZ00099"
expj.AZ0060010.AZ0060010button2.ApprDelAssort.onClick0 = function () {
  console.log('ApprDelAssort script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AZ0060010', 'AZ0060010button2', '_AZ0060010form1/*,_AZ0060010view1/+,_AZ0060010view2/+', 'AZ0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AZ0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AZ0060010', response);
expj.common.updateBusinessScreenTab('AZ0060010', contents);
};
expj.common.pscript.callConfirm('AZ0060010', 'AZ0060010button2', 'AZ00099', okEvent);
};
expj.AZ0060010.AZ0060010button2.ApprDelAssort.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0060010.AZ0060010button2.ApprDelAssort['onClick' + i])) {
        expj.AZ0060010.AZ0060010button2.ApprDelAssort['onClick' + i]();
      }
    }
  }
};
expj.AZ0060010.AZ0060010button2.ApprDelAssort.executeAllOnDecision = function () {
};
expj.AZ0060010.AZ0060010button2.ApprDelAssort.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010button2-ApprDelAssort').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0060010', 'AZ0060010button2', 'ApprDelAssort', this, 'Button');
    }
  });
  expj.AZ0060010.AZ0060010button2.ApprDelAssort.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010button2.ApprDelAssort.executePScriptOnLoad = function () {
  console.log('execute AZ0060010button2/ApprDelAssort.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010button2-ApprDelAssort');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AZ0060010-AZ0060010button2-ApprDelAssort" name="ApprDelAssort" class="AZ0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnApprDelAssort",rb)%></button><!-- 選択依頼削除ボタン --></div><!--/td-->
<script class="expj-script-AZ0060010-AZ0060010button2-CheckAll">
expj.AZ0060010.AZ0060010button2.CheckAll = {};
// script1="onClick;0;DGSALL;AZ0060010view2"
expj.AZ0060010.AZ0060010button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('AZ0060010', 'AZ0060010view2');
};
expj.AZ0060010.AZ0060010button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0060010.AZ0060010button2.CheckAll['onClick' + i])) {
        expj.AZ0060010.AZ0060010button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.AZ0060010.AZ0060010button2.CheckAll.executeAllOnDecision = function () {
};
expj.AZ0060010.AZ0060010button2.CheckAll.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0060010', 'AZ0060010button2', 'CheckAll', this, 'Button');
    }
  });
  expj.AZ0060010.AZ0060010button2.CheckAll.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute AZ0060010button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AZ0060010-AZ0060010button2-CheckAll" name="CheckAll" class="AZ0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-AZ0060010-AZ0060010button2-MastInfo">
expj.AZ0060010.AZ0060010button2.MastInfo = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,h_SCREENMOVE_TYP=0,_AZ0060010view2/+@<%=screen_Url%>,<%=contextNo%>,<%=su1.getScreenName()%>,<%=su1.getScreenID()%>"
expj.AZ0060010.AZ0060010button2.MastInfo.onClick0 = function () {
  console.log('MastInfo script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AZ0060010', 'AZ0060010button2', 'h_SCREENMOVE_TYP=0,_AZ0060010view2/+', '<%=screen_Url%>');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su1.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('<%=screen_Url%>');
var response = expj.common.accessBusinessScreen('POST', '<%=screen_Url%>', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su1.getScreenName()%>', contents, 'AZ0060010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AZ0060010.AZ0060010button2.MastInfo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0060010.AZ0060010button2.MastInfo['onClick' + i])) {
        expj.AZ0060010.AZ0060010button2.MastInfo['onClick' + i]();
      }
    }
  }
};
expj.AZ0060010.AZ0060010button2.MastInfo.executeAllOnDecision = function () {
};
expj.AZ0060010.AZ0060010button2.MastInfo.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010button2-MastInfo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0060010', 'AZ0060010button2', 'MastInfo', this, 'Button');
    }
  });
  expj.AZ0060010.AZ0060010button2.MastInfo.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010button2.MastInfo.executePScriptOnLoad = function () {
  console.log('execute AZ0060010button2/MastInfo.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010button2-MastInfo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AZ0060010-AZ0060010button2-MastInfo" name="MastInfo" class="AZ0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnBeforeData",rb)%></button><!-- 変更前ボタン --></div><!--/td-->
<script class="expj-script-AZ0060010-AZ0060010button2-ApprInfo">
expj.AZ0060010.AZ0060010button2.ApprInfo = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,h_SCREENMOVE_TYP=1,_AZ0060010view2/+@<%=screen_Url%>,<%=contextNo%>,<%=su2.getScreenName()%>,<%=su2.getScreenID()%>"
expj.AZ0060010.AZ0060010button2.ApprInfo.onClick0 = function () {
  console.log('ApprInfo script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AZ0060010', 'AZ0060010button2', 'h_SCREENMOVE_TYP=1,_AZ0060010view2/+', '<%=screen_Url%>');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su2.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('<%=screen_Url%>');
var response = expj.common.accessBusinessScreen('POST', '<%=screen_Url%>', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su2.getScreenName()%>', contents, 'AZ0060010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AZ0060010.AZ0060010button2.ApprInfo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0060010.AZ0060010button2.ApprInfo['onClick' + i])) {
        expj.AZ0060010.AZ0060010button2.ApprInfo['onClick' + i]();
      }
    }
  }
};
expj.AZ0060010.AZ0060010button2.ApprInfo.executeAllOnDecision = function () {
};
expj.AZ0060010.AZ0060010button2.ApprInfo.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010button2-ApprInfo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0060010', 'AZ0060010button2', 'ApprInfo', this, 'Button');
    }
  });
  expj.AZ0060010.AZ0060010button2.ApprInfo.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010button2.ApprInfo.executePScriptOnLoad = function () {
  console.log('execute AZ0060010button2/ApprInfo.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010button2-ApprInfo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AZ0060010-AZ0060010button2-ApprInfo" name="ApprInfo" class="AZ0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnAfterData",rb)%></button><!-- 変更後ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<%
MessageStruct msgStruct = aAZ0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AZ0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0060010)) {
  expj.common.treeInstanceMap.AZ0060010 = {};
}
expj.common.treeInstanceMap.AZ0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AZ0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AZ0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AZ0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010)) {
  expj.common.detailDialogMap.AZ0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AZ0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AZ0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AZ0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0060010)) {
  expj.common.viewInstanceMap.AZ0060010 = {};
}
expj.common.viewInstanceMap.AZ0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init = function () {
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
    expj.AZ0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AZ0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AZ0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AZ0060010_init">
/**
 * AZ0060010用のロード完了時初期化関数
 */
expj.AZ0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AZ0060010');
  expj.common.calendarInstanceMap.AZ0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AZ0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AZ0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AZ0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AZ0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AZ0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AZ0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AZ0060010.AZ0060010button2.ApprAssort.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.ReserveAssort.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.ReserveDelAssort.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.ApprDelAssort.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.MastInfo.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.ApprInfo.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010view2.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AZ0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0060010', 'AZ0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AZ0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AZ0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AZ0060010', '<%=request.getContextPath() %>');
};

/**
 * AZ0060010の全体onDecision処理
 */
expj.AZ0060010.executeAllOnDecision = function () {
  expj.AZ0060010.AZ0060010view2.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0060010_console">
expj.AZ0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>