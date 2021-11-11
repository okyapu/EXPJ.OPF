<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:58:02 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KM0020\KM0020011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KM0020.*" %>
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
<jsp:useBean id="aKM0020010Control" class="com.nec.jp.orteus.metamorBase.KM0020.KM0020010Control" scope="request"/>
<jsp:useBean id="aKM0020010Struct" class="com.nec.jp.orteus.metamorBase.KM0020.KM0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

見積登録1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0020/jsp/KM0020011.jsp,v $
$Author: geng-jia $	
$Revision: 1.4 $　$Date: 2017/02/22 02:07:02 $
********************************************************* --%>
<html>
<head>
<title>見積登録1</title>
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
<script class="expj-script-KM0020010_init">
  // KM0020010名前空間
  expj.KM0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<% String CallButton = aKM0020010Control.getButton(); %>
  <div id="expj-business-screen-KM0020010" data-screen="KM0020011" data-newdata="<%=aKM0020010Control.isNewData() %>">
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
			  <script class="expj-script-KM0020010-KM0020011form1">
expj.KM0020010.KM0020011form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6,7"
expj.KM0020010.KM0020011form1.onLoad0 = function () {
  console.log('KM0020011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision7)){this.onDecision7();}
};
// script2="onDecision;0;CHK;<%=aKM0020010Struct.geth_CALLBUTTON()%>[eq]1@*1,*3"
expj.KM0020010.KM0020011form1.onDecision0 = function () {
  console.log('KM0020011form1 script2');
if (expj.common.pscript.evaluate('<%=aKM0020010Struct.geth_CALLBUTTON()%>', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="child;1;CHKRQ;A@*2,*3"
expj.KM0020010.KM0020011form1.child1 = function () {
  console.log('KM0020011form1 script3');
if (expj.common.pscript.satisfiedRequiredComponent('KM0020010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;2;UNMASK;_KM0020011button1/insertSub1"
expj.KM0020010.KM0020011form1.child2 = function () {
  console.log('KM0020011form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011button1/insertSub1');
};
// script5="child;3;MASK;_KM0020011button1/insertSub1"
expj.KM0020010.KM0020011form1.child3 = function () {
  console.log('KM0020011form1 script5');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011button1/insertSub1');
};
// script6="onDecision;1;CHK;<%=aKM0020010Struct.geth_CALLBUTTON()%>[eq]2@*4,*6"
expj.KM0020010.KM0020011form1.onDecision1 = function () {
  console.log('KM0020011form1 script6');
if (expj.common.pscript.evaluate('<%=aKM0020010Struct.geth_CALLBUTTON()%>', '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script7="child;4;CHKRQ;A@*5,*6"
expj.KM0020010.KM0020011form1.child4 = function () {
  console.log('KM0020011form1 script7');
if (expj.common.pscript.satisfiedRequiredComponent('KM0020010', 'A')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="child;5;UNMASK;_KM0020011button1/updateSub1"
expj.KM0020010.KM0020011form1.child5 = function () {
  console.log('KM0020011form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011button1/updateSub1');
};
// script9="child;6;MASK;_KM0020011button1/updateSub1"
expj.KM0020010.KM0020011form1.child6 = function () {
  console.log('KM0020011form1 script9');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011button1/updateSub1');
};
// script10="onDecision;2;MASK;_KM0020011form2/l_ES_COST_MATERIAL,_KM0020011form2/l_ES_COST_PROCESS,_KM0020011form2/l_ES_COST_OUTSOUCE,_KM0020011form2/l_ES_COST_SERVICE"
expj.KM0020010.KM0020011form1.onDecision2 = function () {
  console.log('KM0020011form1 script10');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ES_COST_MATERIAL');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ES_COST_PROCESS');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ES_COST_OUTSOUCE');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ES_COST_SERVICE');
};
// script11="onDecision;3;CHK;_KM0020011form2/l_ESTIMATE_TYP[eq]1@*7,*8"
expj.KM0020010.KM0020011form1.onDecision3 = function () {
  console.log('KM0020011form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ESTIMATE_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_KM0020011form2/l_ES_COST_MATERIAL,_KM0020011form2/l_ES_COST_PROCESS,_KM0020011form2/l_ES_COST_OUTSOUCE@*17"
expj.KM0020010.KM0020011form1.child7 = function () {
  console.log('KM0020011form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ES_COST_MATERIAL');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ES_COST_PROCESS');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ES_COST_OUTSOUCE');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
// script13="child;8;UNMASK;_KM0020011form2/l_ES_COST_SERVICE@*16"
expj.KM0020010.KM0020011form1.child8 = function () {
  console.log('KM0020011form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ES_COST_SERVICE');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child16)){this.child16();}}
};
// script14="onDecision;4;MASK;_KM0020011form2/l_ESTIMATE_TYP,_KM0020011form2/l_DESINATED_DLV_DATE,_KM0020011form2/l_CUST_ITEM_CD,_KM0020011form2/l_ITEM_NAME,_KM0020011form2/l_ESTIMATE_QTY,_KM0020011form2/l_UNIT_PRICE,_KM0020011form2/l_DISCOUNT_PRICE,_KM0020011form2/l_SPEC_CLASS1_TYP,_KM0020011form2/l_SPEC_CLASS2_TYP,_KM0020011form2/l_SPEC_SELECT1_TYP,_KM0020011form2/l_SPEC_SELECT2_TYP,_KM0020011form2/l_SPEC_SELECT3_TYP,_KM0020011form2/l_SPEC_SELECT4_TYP,_KM0020011form2/l_REMARKS,_KM0020011form2/l_UNIT_CD,_KM0020011form2/PeekerItemCd,_KM0020011form2/CalendarSalesDate"
expj.KM0020010.KM0020011form1.onDecision4 = function () {
  console.log('KM0020011form1 script14');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ESTIMATE_TYP');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_DESINATED_DLV_DATE');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_CUST_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ITEM_NAME');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ESTIMATE_QTY');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_UNIT_PRICE');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_DISCOUNT_PRICE');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_SPEC_CLASS1_TYP');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_SPEC_CLASS2_TYP');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_SPEC_SELECT1_TYP');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_SPEC_SELECT2_TYP');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_SPEC_SELECT3_TYP');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_SPEC_SELECT4_TYP');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_REMARKS');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_UNIT_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/PeekerItemCd');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/CalendarSalesDate');
};
// script15="onDecision;5;CHK;_KM0020011form2/PROJECT_STAT[eq]1[or]_KM0020011form2/PROJECT_STAT[eq]2@*9"
expj.KM0020010.KM0020011form1.onDecision5 = function () {
  console.log('KM0020011form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/PROJECT_STAT'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/PROJECT_STAT'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script16="child;9;UNMASK;_KM0020011form2/l_ESTIMATE_TYP,_KM0020011form2/l_DESINATED_DLV_DATE,_KM0020011form2/l_CUST_ITEM_CD,_KM0020011form2/l_ITEM_NAME,_KM0020011form2/l_ESTIMATE_QTY,_KM0020011form2/l_UNIT_PRICE,_KM0020011form2/l_DISCOUNT_PRICE,_KM0020011form2/l_SPEC_CLASS1_TYP,_KM0020011form2/l_SPEC_CLASS2_TYP,_KM0020011form2/l_SPEC_SELECT1_TYP,_KM0020011form2/l_SPEC_SELECT2_TYP,_KM0020011form2/l_SPEC_SELECT3_TYP,_KM0020011form2/l_SPEC_SELECT4_TYP,_KM0020011form2/l_REMARKS,_KM0020011form2/l_UNIT_CD,_KM0020011form2/PeekerItemCd,_KM0020011form2/CalendarSalesDate"
expj.KM0020010.KM0020011form1.child9 = function () {
  console.log('KM0020011form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ESTIMATE_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_DESINATED_DLV_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_CUST_ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ITEM_NAME');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ESTIMATE_QTY');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_UNIT_PRICE');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_DISCOUNT_PRICE');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_SPEC_CLASS1_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_SPEC_CLASS2_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_SPEC_SELECT1_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_SPEC_SELECT2_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_SPEC_SELECT3_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_SPEC_SELECT4_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_REMARKS');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/l_UNIT_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/PeekerItemCd');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/CalendarSalesDate');
};
// script17="onDecision;6;CHK;_KM0020011form2/PROJECT_STAT[eq]1[or]_KM0020011form2/PROJECT_STAT[eq]2@*10,*11"
expj.KM0020010.KM0020011form1.onDecision6 = function () {
  console.log('KM0020011form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/PROJECT_STAT'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/PROJECT_STAT'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script18="child;10;CHK;_KM0020011form2/l_CUST_ITEM_CD[eq]@*11,*12"
expj.KM0020010.KM0020011form1.child10 = function () {
  console.log('KM0020011form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/l_CUST_ITEM_CD'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script19="child;11;MASK;_KM0020011form2/SelectUnitCost"
expj.KM0020010.KM0020011form1.child11 = function () {
  console.log('KM0020011form1 script19');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/SelectUnitCost');
};
// script20="child;12;UNMASK;_KM0020011form2/SelectUnitCost"
expj.KM0020010.KM0020011form1.child12 = function () {
  console.log('KM0020011form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/SelectUnitCost');
};
// script21="onDecision;7;CHK;_KM0020011form2/PROJECT_STAT[eq]1[or]_KM0020011form2/PROJECT_STAT[eq]2@*13,*14"
expj.KM0020010.KM0020011form1.onDecision7 = function () {
  console.log('KM0020011form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/PROJECT_STAT'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/PROJECT_STAT'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script22="child;13;CHK;<%= aKM0020010Struct.geth_CUR_CD()%>[eq]<%= aKM0020010Struct.getHOME_CUR_CD()%>@*14,*15"
expj.KM0020010.KM0020011form1.child13 = function () {
  console.log('KM0020011form1 script22');
if (expj.common.pscript.evaluate('<%= aKM0020010Struct.geth_CUR_CD()%>', '[eq]', '<%= aKM0020010Struct.getHOME_CUR_CD()%>')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script23="child;14;MASK;_KM0020011form2/LcConversion@*21"
expj.KM0020010.KM0020011form1.child14 = function () {
  console.log('KM0020011form1 script23');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/LcConversion');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child21)){this.child21();}}
};
// script24="child;15;UNMASK;_KM0020011form2/LcConversion@*20"
expj.KM0020010.KM0020011form1.child15 = function () {
  console.log('KM0020011form1 script24');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020011form1', '_KM0020011form2/LcConversion');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child20)){this.child20();}}
};
// script25="child;16;SET;_KM0020011form2/l_ES_COST_MATERIAL=@*18"
expj.KM0020010.KM0020011form1.child16 = function () {
  console.log('KM0020011form1 script25');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ES_COST_MATERIAL', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child18)){this.child18();}}
};
// script26="child;17;SET;_KM0020011form2/l_ES_COST_SERVICE="
expj.KM0020010.KM0020011form1.child17 = function () {
  console.log('KM0020011form1 script26');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ES_COST_SERVICE', '');
};
// script27="child;18;SET;_KM0020011form2/l_ES_COST_PROCESS=@*19"
expj.KM0020010.KM0020011form1.child18 = function () {
  console.log('KM0020011form1 script27');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ES_COST_PROCESS', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child19)){this.child19();}}
};
// script28="child;19;SET;_KM0020011form2/l_ES_COST_OUTSOUCE="
expj.KM0020010.KM0020011form1.child19 = function () {
  console.log('KM0020011form1 script28');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ES_COST_OUTSOUCE', '');
};
// script29="child;20;SET;_KM0020011form2/l_ESTIMATE_GAIN=[{_KM0020011form2/l_ESTIMATE_AMOUNT_JPN}-{_KM0020011form2/l_ES_COST_ALL}]"
expj.KM0020010.KM0020011form1.child20 = function () {
  console.log('KM0020011form1 script29');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ESTIMATE_GAIN', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ESTIMATE_AMOUNT_JPN') + '-' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ES_COST_ALL')));
};
// script30="child;21;SET;_KM0020011form2/l_ESTIMATE_AMOUNT_JPN=_KM0020011form2/l_ESTIMATE_AMOUNT@*22"
expj.KM0020010.KM0020011form1.child21 = function () {
  console.log('KM0020011form1 script30');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ESTIMATE_AMOUNT_JPN', expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ESTIMATE_AMOUNT'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child22)){this.child22();}}
};
// script31="child;22;SET;_KM0020011form2/l_ESTIMATE_GAIN=[{_KM0020011form2/l_ESTIMATE_AMOUNT_JPN}-{_KM0020011form2/l_ES_COST_ALL}]"
expj.KM0020010.KM0020011form1.child22 = function () {
  console.log('KM0020011form1 script31');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ESTIMATE_GAIN', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ESTIMATE_AMOUNT_JPN') + '-' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form1', '_KM0020011form2/l_ES_COST_ALL')));
};
expj.KM0020010.KM0020011form1.executeAllOnDecision = function () {
  console.log('execute KM0020011form1.onDecision');
  for (var i = 0; i <= 7; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011form1['onDecision' + i])) {
        expj.KM0020010.KM0020011form1['onDecision' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020011form1.executeOnLoad = function () {
  expj.KM0020010.KM0020011form1.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form1.executePScriptOnLoad = function () {
  console.log('execute KM0020011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KM0020010.KM0020011form1['onLoad' + i])) {
      expj.KM0020010.KM0020011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KM0020010-KM0020011form1" action="KM0020010Servlet" name="KM0020011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CD",rb)%></span><!-- 案件番号 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form1-PROJECT_CD">
expj.KM0020010.KM0020011form1.PROJECT_CD = {};
expj.KM0020010.KM0020011form1.PROJECT_CD.executeAllOnDecision = function () {
  console.log('execute KM0020011form1/PROJECT_CD.onDecision');
  expj.KM0020010.KM0020011form1.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form1.PROJECT_CD.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form1-PROJECT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form1', 'PROJECT_CD', this);
  });
  expj.KM0020010.KM0020011form1.PROJECT_CD.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form1.PROJECT_CD.executePScriptOnLoad = function () {
  console.log('execute KM0020011form1/PROJECT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form1-PROJECT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form1-PROJECT_CD" name="PROJECT_CD" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getPROJECT_CD()) %>" maxlength="25" disabled></div><!--/td-->
<input type="hidden" id="expj-KM0020010-KM0020011form1-h_CUR_CD" name="h_CUR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0020010Struct.geth_CUR_CD()) %>">
<script class="expj-script-KM0020010-KM0020011form1-h_CUR_CD">
expj.KM0020010.KM0020011form1.h_CUR_CD = {};
expj.KM0020010.KM0020011form1.h_CUR_CD.executeAllOnDecision = function () {
  console.log('execute KM0020011form1/h_CUR_CD.onDecision');
  expj.KM0020010.KM0020011form1.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form1.h_CUR_CD.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form1-h_CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form1', 'h_CUR_CD', this);
  });
  expj.KM0020010.KM0020011form1.h_CUR_CD.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form1.h_CUR_CD.executePScriptOnLoad = function () {
  console.log('execute KM0020011form1/h_CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form1-h_CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_NAME",rb)%></span><!-- 得意先名 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form1-CUST_NAME">
expj.KM0020010.KM0020011form1.CUST_NAME = {};
expj.KM0020010.KM0020011form1.CUST_NAME.executeAllOnDecision = function () {
  console.log('execute KM0020011form1/CUST_NAME.onDecision');
  expj.KM0020010.KM0020011form1.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form1.CUST_NAME.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form1-CUST_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form1', 'CUST_NAME', this);
  });
  expj.KM0020010.KM0020011form1.CUST_NAME.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form1.CUST_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0020011form1/CUST_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form1-CUST_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form1-CUST_NAME" name="CUST_NAME" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getCUST_NAME()) %>" maxlength="40" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ESTIMATES_CD",rb)%></span><!-- 見積番号 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form1-ESTIMATE_NO">
expj.KM0020010.KM0020011form1.ESTIMATE_NO = {};
expj.KM0020010.KM0020011form1.ESTIMATE_NO.executeAllOnDecision = function () {
  console.log('execute KM0020011form1/ESTIMATE_NO.onDecision');
  expj.KM0020010.KM0020011form1.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form1.ESTIMATE_NO.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form1-ESTIMATE_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form1', 'ESTIMATE_NO', this);
  });
  expj.KM0020010.KM0020011form1.ESTIMATE_NO.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form1.ESTIMATE_NO.executePScriptOnLoad = function () {
  console.log('execute KM0020011form1/ESTIMATE_NO.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form1-ESTIMATE_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form1-ESTIMATE_NO" name="ESTIMATE_NO" class="KM0020010-focus-move  " style="width:260px;text-align: right;" data-kind="OBT_NUMBER_Z;3.0;CEIL;0" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getESTIMATE_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KM0020010-KM0020011form1-h_CUST_CD" name="h_CUST_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0020010Struct.geth_CUST_CD()) %>">
<script class="expj-script-KM0020010-KM0020011form1-h_CUST_CD">
expj.KM0020010.KM0020011form1.h_CUST_CD = {};
expj.KM0020010.KM0020011form1.h_CUST_CD.executeAllOnDecision = function () {
  console.log('execute KM0020011form1/h_CUST_CD.onDecision');
  expj.KM0020010.KM0020011form1.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form1.h_CUST_CD.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form1-h_CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form1', 'h_CUST_CD', this);
  });
  expj.KM0020010.KM0020011form1.h_CUST_CD.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form1.h_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KM0020011form1/h_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form1-h_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DETAIL_NO",rb)%></span><!-- 明細番号 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form1-l_DETAL_NO">
expj.KM0020010.KM0020011form1.l_DETAL_NO = {};
expj.KM0020010.KM0020011form1.l_DETAL_NO.executeAllOnDecision = function () {
  console.log('execute KM0020011form1/l_DETAL_NO.onDecision');
  expj.KM0020010.KM0020011form1.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form1.l_DETAL_NO.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form1-l_DETAL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form1', 'l_DETAL_NO', this);
  });
  expj.KM0020010.KM0020011form1.l_DETAL_NO.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form1.l_DETAL_NO.executePScriptOnLoad = function () {
  console.log('execute KM0020011form1/l_DETAL_NO.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form1-l_DETAL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form1-l_DETAL_NO" name="l_DETAL_NO" class="KM0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER;3" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_DETAL_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.AUTO_NO",rb)%></span><!-- （自動採番） --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KM0020010-KM0020011form2">
expj.KM0020010.KM0020011form2 = {};
expj.KM0020010.KM0020011form2.executeAllOnDecision = function () {
  console.log('execute KM0020011form2.onDecision');
};
expj.KM0020010.KM0020011form2.executeOnLoad = function () {
  expj.KM0020010.KM0020011form2.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KM0020010-KM0020011form2" action="KM0020010Servlet" name="KM0020011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:right"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:100px;align:right"></div>
<div class="div-td" style="width:70px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ARRANGE_ITEMS_SPECIES",rb)%></span><!-- 手配品目種 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_ESTIMATE_TYP">
expj.KM0020010.KM0020011form2.l_ESTIMATE_TYP = {};
expj.KM0020010.KM0020011form2.l_ESTIMATE_TYP.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_ESTIMATE_TYP.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_ESTIMATE_TYP.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_ESTIMATE_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_ESTIMATE_TYP', this);
  });
  expj.KM0020010.KM0020011form2.l_ESTIMATE_TYP.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_ESTIMATE_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_ESTIMATE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_ESTIMATE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KM0020010-KM0020011form2-l_ESTIMATE_TYP" name='l_ESTIMATE_TYP' class='KM0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKM0020010Control.getStruct().getList_l_ESTIMATE_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKM0020010Control.getStruct().getList_l_ESTIMATE_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKM0020010Control.getStruct().getList_l_ESTIMATE_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKM0020010Struct.getl_ESTIMATE_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:100px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:70px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)%></span><!-- 指定納期 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_DESINATED_DLV_DATE">
expj.KM0020010.KM0020011form2.l_DESINATED_DLV_DATE = {};
expj.KM0020010.KM0020011form2.l_DESINATED_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_DESINATED_DLV_DATE.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_DESINATED_DLV_DATE.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_DESINATED_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_DESINATED_DLV_DATE', this);
  });
  expj.KM0020010.KM0020011form2.l_DESINATED_DLV_DATE.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_DESINATED_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_DESINATED_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_DESINATED_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_DESINATED_DLV_DATE" name="l_DESINATED_DLV_DATE" class="KM0020010-focus-move  required-value expj-KM0020010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_DESINATED_DLV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-CalendarSalesDate">
expj.KM0020010.KM0020011form2.CalendarSalesDate = {};
// script1="onClick;0;CALENDAR;_KM0020011form2/l_DESINATED_DLV_DATE"
expj.KM0020010.KM0020011form2.CalendarSalesDate.onClick0 = function () {
  console.log('CalendarSalesDate script1');
expj.common.pscript.executeCalendar('KM0020010','KM0020011form2','_KM0020011form2/l_DESINATED_DLV_DATE');
};
expj.KM0020010.KM0020011form2.CalendarSalesDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011form2.CalendarSalesDate['onClick' + i])) {
        expj.KM0020010.KM0020011form2.CalendarSalesDate['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020011form2.CalendarSalesDate.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020011form2.CalendarSalesDate.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-CalendarSalesDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020011form2', 'CalendarSalesDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KM0020010','KM0020011form2','_KM0020011form2/l_DESINATED_DLV_DATE');
  expj.KM0020010.KM0020011form2.CalendarSalesDate.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.CalendarSalesDate.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/CalendarSalesDate.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-CalendarSalesDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0020010-KM0020011form2-CalendarSalesDate" class="KM0020010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)%></span><!-- 得意先品目番号 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_CUST_ITEM_CD">
expj.KM0020010.KM0020011form2.l_CUST_ITEM_CD = {};
expj.KM0020010.KM0020011form2.l_CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_CUST_ITEM_CD.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_CUST_ITEM_CD', this);
  });
  expj.KM0020010.KM0020011form2.l_CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_CUST_ITEM_CD" name="l_CUST_ITEM_CD" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_CUST_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-PeekerItemCd">
expj.KM0020010.KM0020011form2.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_KM0020011form2/l_CUST_ITEM_CD:_KM0020011form2/l_CUST_ITEM_NAME:_KM0020011form2/l_ITEM_NAME@<%=contextNo%>"
expj.KM0020010.KM0020011form2.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0020010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_KM0020011form2/l_CUST_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_KM0020011form1/h_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PJ_ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0020011form2/l_CUST_ITEM_CD:_KM0020011form2/l_CUST_ITEM_NAME:_KM0020011form2/l_ITEM_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0020010.KM0020011form2.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011form2.PeekerItemCd['onClick' + i])) {
        expj.KM0020010.KM0020011form2.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020011form2.PeekerItemCd.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020011form2.PeekerItemCd.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020011form2', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.KM0020010.KM0020011form2.PeekerItemCd.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0020010-KM0020011form2-PeekerItemCd" class="KM0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_CUST_ITEM_NAME">
expj.KM0020010.KM0020011form2.l_CUST_ITEM_NAME = {};
expj.KM0020010.KM0020011form2.l_CUST_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_CUST_ITEM_NAME.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_CUST_ITEM_NAME.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_CUST_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_CUST_ITEM_NAME', this);
  });
  expj.KM0020010.KM0020011form2.l_CUST_ITEM_NAME.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_CUST_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_CUST_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_CUST_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_CUST_ITEM_NAME" name="l_CUST_ITEM_NAME" class="KM0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_CUST_ITEM_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_NAME",rb)%></span><!-- 品目名 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_ITEM_NAME">
expj.KM0020010.KM0020011form2.l_ITEM_NAME = {};
expj.KM0020010.KM0020011form2.l_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_ITEM_NAME.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_ITEM_NAME.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_ITEM_NAME', this);
  });
  expj.KM0020010.KM0020011form2.l_ITEM_NAME.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:602px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_ITEM_NAME" name="l_ITEM_NAME" class="KM0020010-focus-move  required-value expj-KM0020010-required-A" style="width:602px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_ITEM_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.QTY",rb)%></span><!-- 数量 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_ESTIMATE_QTY">
expj.KM0020010.KM0020011form2.l_ESTIMATE_QTY = {};
// script1="onDecision;0;SET;_l_AMOUNT=[{_l_ESTIMATE_QTY}*{_l_UNIT_PRICE}]"
expj.KM0020010.KM0020011form2.l_ESTIMATE_QTY.onDecision0 = function () {
  console.log('l_ESTIMATE_QTY script1');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_UNIT_PRICE')));
};
// script2="onDecision;1;SET;_l_DISCOUNT_AMOUNT=[{_l_ESTIMATE_QTY}*{_l_DISCOUNT_PRICE}]"
expj.KM0020010.KM0020011form2.l_ESTIMATE_QTY.onDecision1 = function () {
  console.log('l_ESTIMATE_QTY script2');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_DISCOUNT_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_DISCOUNT_PRICE')));
};
// script3="onDecision;2;SET;_l_ESTIMATE_AMOUNT=[{_l_ESTIMATE_QTY}*{_l_ESTIMATE_UNIT_PRICE}]"
expj.KM0020010.KM0020011form2.l_ESTIMATE_QTY.onDecision2 = function () {
  console.log('l_ESTIMATE_QTY script3');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_UNIT_PRICE')));
};
expj.KM0020010.KM0020011form2.l_ESTIMATE_QTY.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_ESTIMATE_QTY.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011form2.l_ESTIMATE_QTY['onDecision' + i])) {
        expj.KM0020010.KM0020011form2.l_ESTIMATE_QTY['onDecision' + i]();
      }
    }
  }
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_ESTIMATE_QTY.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_ESTIMATE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_ESTIMATE_QTY', this);
  });
  expj.KM0020010.KM0020011form2.l_ESTIMATE_QTY.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_ESTIMATE_QTY.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_ESTIMATE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_ESTIMATE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_ESTIMATE_QTY" name="l_ESTIMATE_QTY" class="KM0020010-focus-move  required-value expj-KM0020010-required-A" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_ESTIMATE_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_UNIT_CD">
expj.KM0020010.KM0020011form2.l_UNIT_CD = {};
expj.KM0020010.KM0020011form2.l_UNIT_CD.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_UNIT_CD.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_UNIT_CD.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_UNIT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_UNIT_CD', this);
  });
  expj.KM0020010.KM0020011form2.l_UNIT_CD.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_UNIT_CD.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_UNIT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_UNIT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_UNIT_CD" name="l_UNIT_CD" class="KM0020010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_UNIT_CD()) %>" maxlength="12" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:100px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:70px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.ESTIMATE_AMOUNT_1",rb)%></span><!-- 見積金額 --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:100px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:70px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.ESTIMATE_JPN",rb)%></span><!-- 予算(邦貨) --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ACTUAL_UNIT_PRICE",rb)%></span><!-- 単価 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_UNIT_PRICE">
expj.KM0020010.KM0020011form2.l_UNIT_PRICE = {};
// script1="onDecision;0;SET;_l_AMOUNT=[{_l_ESTIMATE_QTY}*{_l_UNIT_PRICE}]"
expj.KM0020010.KM0020011form2.l_UNIT_PRICE.onDecision0 = function () {
  console.log('l_UNIT_PRICE script1');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_UNIT_PRICE')));
};
// script2="onDecision;1;SET;_l_ESTIMATE_UNIT_PRICE=[{_l_UNIT_PRICE}-{_l_DISCOUNT_PRICE}]"
expj.KM0020010.KM0020011form2.l_UNIT_PRICE.onDecision1 = function () {
  console.log('l_UNIT_PRICE script2');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_UNIT_PRICE', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_UNIT_PRICE') + '-' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_DISCOUNT_PRICE')));
};
// script3="onDecision;2;SET;_l_ESTIMATE_AMOUNT=[{_l_ESTIMATE_QTY}*{_l_ESTIMATE_UNIT_PRICE}]"
expj.KM0020010.KM0020011form2.l_UNIT_PRICE.onDecision2 = function () {
  console.log('l_UNIT_PRICE script3');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_UNIT_PRICE')));
};
expj.KM0020010.KM0020011form2.l_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_UNIT_PRICE.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011form2.l_UNIT_PRICE['onDecision' + i])) {
        expj.KM0020010.KM0020011form2.l_UNIT_PRICE['onDecision' + i]();
      }
    }
  }
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_UNIT_PRICE', this);
  });
  expj.KM0020010.KM0020011form2.l_UNIT_PRICE.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_UNIT_PRICE" name="l_UNIT_PRICE" class="KM0020010-focus-move  required-value expj-KM0020010-required-A" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_UNIT_PRICE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_AMOUNT">
expj.KM0020010.KM0020011form2.l_AMOUNT = {};
expj.KM0020010.KM0020011form2.l_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_AMOUNT.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_AMOUNT.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_AMOUNT', this);
  });
  expj.KM0020010.KM0020011form2.l_AMOUNT.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_AMOUNT" name="l_AMOUNT" class="KM0020010-focus-move  " style="width:110px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-SelectUnitCost">
expj.KM0020010.KM0020011form2.SelectUnitCost = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0020011form1/*,_KM0020011form2/*@KM0020010Servlet"
expj.KM0020010.KM0020011form2.SelectUnitCost.onClick0 = function () {
  console.log('SelectUnitCost script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020011form2', '_KM0020011form1/*,_KM0020011form2/*', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.updateBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0020010.KM0020011form2.SelectUnitCost.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011form2.SelectUnitCost['onClick' + i])) {
        expj.KM0020010.KM0020011form2.SelectUnitCost['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020011form2.SelectUnitCost.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020011form2.SelectUnitCost.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-SelectUnitCost').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020011form2', 'SelectUnitCost', this, 'Button');
    }
  });
  expj.KM0020010.KM0020011form2.SelectUnitCost.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.SelectUnitCost.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/SelectUnitCost.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-SelectUnitCost');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:100px;text-align:left;"><button type="button" id="expj-KM0020010-KM0020011form2-SelectUnitCost" name="SelectUnitCost" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelectUnitCost",rb)%></button><!-- 単価読込ボタン --></div><!--/td-->
<div class="div-td" style="width:70px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MATERIAL_COST_3",rb)%></span><!-- 材料費 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_ES_COST_MATERIAL">
expj.KM0020010.KM0020011form2.l_ES_COST_MATERIAL = {};
// script1="onDecision;0;SET;_l_ES_COST_ALL=[{_l_ES_COST_MATERIAL}+{_l_ES_COST_PROCESS}+{_l_ES_COST_OUTSOUCE}+{_l_ES_COST_ETC}+{_l_ES_COST_SERVICE}]"
expj.KM0020010.KM0020011form2.l_ES_COST_MATERIAL.onDecision0 = function () {
  console.log('l_ES_COST_MATERIAL script1');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_ALL', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_MATERIAL') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_PROCESS') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_OUTSOUCE') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_ETC') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_SERVICE')));
};
expj.KM0020010.KM0020011form2.l_ES_COST_MATERIAL.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_ES_COST_MATERIAL.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011form2.l_ES_COST_MATERIAL['onDecision' + i])) {
        expj.KM0020010.KM0020011form2.l_ES_COST_MATERIAL['onDecision' + i]();
      }
    }
  }
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_ES_COST_MATERIAL.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_ES_COST_MATERIAL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_ES_COST_MATERIAL', this);
  });
  expj.KM0020010.KM0020011form2.l_ES_COST_MATERIAL.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_ES_COST_MATERIAL.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_ES_COST_MATERIAL.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_ES_COST_MATERIAL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_ES_COST_MATERIAL" name="l_ES_COST_MATERIAL" class="KM0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_ES_COST_MATERIAL()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DISCOUNT_PRICE",rb)%></span><!-- 単価値引 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_DISCOUNT_PRICE">
expj.KM0020010.KM0020011form2.l_DISCOUNT_PRICE = {};
// script1="onDecision;0;SET;_l_ESTIMATE_UNIT_PRICE=[{_l_UNIT_PRICE}-{_l_DISCOUNT_PRICE}]"
expj.KM0020010.KM0020011form2.l_DISCOUNT_PRICE.onDecision0 = function () {
  console.log('l_DISCOUNT_PRICE script1');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_UNIT_PRICE', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_UNIT_PRICE') + '-' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_DISCOUNT_PRICE')));
};
// script2="onDecision;1;SET;_l_DISCOUNT_AMOUNT=[{_l_ESTIMATE_QTY}*{_l_DISCOUNT_PRICE}]"
expj.KM0020010.KM0020011form2.l_DISCOUNT_PRICE.onDecision1 = function () {
  console.log('l_DISCOUNT_PRICE script2');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_DISCOUNT_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_DISCOUNT_PRICE')));
};
// script3="onDecision;2;SET;_l_ESTIMATE_AMOUNT=[{_l_ESTIMATE_QTY}*{_l_ESTIMATE_UNIT_PRICE}]"
expj.KM0020010.KM0020011form2.l_DISCOUNT_PRICE.onDecision2 = function () {
  console.log('l_DISCOUNT_PRICE script3');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ESTIMATE_UNIT_PRICE')));
};
expj.KM0020010.KM0020011form2.l_DISCOUNT_PRICE.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_DISCOUNT_PRICE.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011form2.l_DISCOUNT_PRICE['onDecision' + i])) {
        expj.KM0020010.KM0020011form2.l_DISCOUNT_PRICE['onDecision' + i]();
      }
    }
  }
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_DISCOUNT_PRICE.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_DISCOUNT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_DISCOUNT_PRICE', this);
  });
  expj.KM0020010.KM0020011form2.l_DISCOUNT_PRICE.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_DISCOUNT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_DISCOUNT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_DISCOUNT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_DISCOUNT_PRICE" name="l_DISCOUNT_PRICE" class="KM0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_DISCOUNT_PRICE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_DISCOUNT_AMOUNT">
expj.KM0020010.KM0020011form2.l_DISCOUNT_AMOUNT = {};
expj.KM0020010.KM0020011form2.l_DISCOUNT_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_DISCOUNT_AMOUNT.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_DISCOUNT_AMOUNT.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_DISCOUNT_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_DISCOUNT_AMOUNT', this);
  });
  expj.KM0020010.KM0020011form2.l_DISCOUNT_AMOUNT.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_DISCOUNT_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_DISCOUNT_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_DISCOUNT_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_DISCOUNT_AMOUNT" name="l_DISCOUNT_AMOUNT" class="KM0020010-focus-move  " style="width:110px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_DISCOUNT_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:100px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:70px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROCESSING_COST",rb)%></span><!-- 加工費 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_ES_COST_PROCESS">
expj.KM0020010.KM0020011form2.l_ES_COST_PROCESS = {};
// script1="onDecision;0;SET;_l_ES_COST_ALL=[{_l_ES_COST_MATERIAL}+{_l_ES_COST_PROCESS}+{_l_ES_COST_OUTSOUCE}+{_l_ES_COST_ETC}+{_l_ES_COST_SERVICE}]"
expj.KM0020010.KM0020011form2.l_ES_COST_PROCESS.onDecision0 = function () {
  console.log('l_ES_COST_PROCESS script1');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_ALL', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_MATERIAL') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_PROCESS') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_OUTSOUCE') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_ETC') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_SERVICE')));
};
expj.KM0020010.KM0020011form2.l_ES_COST_PROCESS.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_ES_COST_PROCESS.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011form2.l_ES_COST_PROCESS['onDecision' + i])) {
        expj.KM0020010.KM0020011form2.l_ES_COST_PROCESS['onDecision' + i]();
      }
    }
  }
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_ES_COST_PROCESS.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_ES_COST_PROCESS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_ES_COST_PROCESS', this);
  });
  expj.KM0020010.KM0020011form2.l_ES_COST_PROCESS.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_ES_COST_PROCESS.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_ES_COST_PROCESS.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_ES_COST_PROCESS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_ES_COST_PROCESS" name="l_ES_COST_PROCESS" class="KM0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_ES_COST_PROCESS()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ESTIMATE_UNIT_PRICE",rb)%></span><!-- 見積単価 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_ESTIMATE_UNIT_PRICE">
expj.KM0020010.KM0020011form2.l_ESTIMATE_UNIT_PRICE = {};
expj.KM0020010.KM0020011form2.l_ESTIMATE_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_ESTIMATE_UNIT_PRICE.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_ESTIMATE_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_ESTIMATE_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_ESTIMATE_UNIT_PRICE', this);
  });
  expj.KM0020010.KM0020011form2.l_ESTIMATE_UNIT_PRICE.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_ESTIMATE_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_ESTIMATE_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_ESTIMATE_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_ESTIMATE_UNIT_PRICE" name="l_ESTIMATE_UNIT_PRICE" class="KM0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_ESTIMATE_UNIT_PRICE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_ESTIMATE_AMOUNT">
expj.KM0020010.KM0020011form2.l_ESTIMATE_AMOUNT = {};
expj.KM0020010.KM0020011form2.l_ESTIMATE_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_ESTIMATE_AMOUNT.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_ESTIMATE_AMOUNT.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_ESTIMATE_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_ESTIMATE_AMOUNT', this);
  });
  expj.KM0020010.KM0020011form2.l_ESTIMATE_AMOUNT.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_ESTIMATE_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_ESTIMATE_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_ESTIMATE_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_ESTIMATE_AMOUNT" name="l_ESTIMATE_AMOUNT" class="KM0020010-focus-move  " style="width:110px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_ESTIMATE_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:100px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:70px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SBCNT_COST",rb)%></span><!-- 外注費 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_ES_COST_OUTSOUCE">
expj.KM0020010.KM0020011form2.l_ES_COST_OUTSOUCE = {};
// script1="onDecision;0;SET;_l_ES_COST_ALL=[{_l_ES_COST_MATERIAL}+{_l_ES_COST_PROCESS}+{_l_ES_COST_OUTSOUCE}+{_l_ES_COST_ETC}+{_l_ES_COST_SERVICE}]"
expj.KM0020010.KM0020011form2.l_ES_COST_OUTSOUCE.onDecision0 = function () {
  console.log('l_ES_COST_OUTSOUCE script1');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_ALL', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_MATERIAL') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_PROCESS') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_OUTSOUCE') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_ETC') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_SERVICE')));
};
expj.KM0020010.KM0020011form2.l_ES_COST_OUTSOUCE.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_ES_COST_OUTSOUCE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011form2.l_ES_COST_OUTSOUCE['onDecision' + i])) {
        expj.KM0020010.KM0020011form2.l_ES_COST_OUTSOUCE['onDecision' + i]();
      }
    }
  }
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_ES_COST_OUTSOUCE.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_ES_COST_OUTSOUCE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_ES_COST_OUTSOUCE', this);
  });
  expj.KM0020010.KM0020011form2.l_ES_COST_OUTSOUCE.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_ES_COST_OUTSOUCE.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_ES_COST_OUTSOUCE.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_ES_COST_OUTSOUCE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_ES_COST_OUTSOUCE" name="l_ES_COST_OUTSOUCE" class="KM0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_ES_COST_OUTSOUCE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ESTIMATE_AMOUNT_JPN_1",rb)%></span><!-- 見積金額(邦貨) --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_ESTIMATE_AMOUNT_JPN">
expj.KM0020010.KM0020011form2.l_ESTIMATE_AMOUNT_JPN = {};
expj.KM0020010.KM0020011form2.l_ESTIMATE_AMOUNT_JPN.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_ESTIMATE_AMOUNT_JPN.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_ESTIMATE_AMOUNT_JPN.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_ESTIMATE_AMOUNT_JPN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_ESTIMATE_AMOUNT_JPN', this);
  });
  expj.KM0020010.KM0020011form2.l_ESTIMATE_AMOUNT_JPN.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_ESTIMATE_AMOUNT_JPN.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_ESTIMATE_AMOUNT_JPN.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_ESTIMATE_AMOUNT_JPN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_ESTIMATE_AMOUNT_JPN" name="l_ESTIMATE_AMOUNT_JPN" class="KM0020010-focus-move  " style="width:110px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_ESTIMATE_AMOUNT_JPN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-LcConversion">
expj.KM0020010.KM0020011form2.LcConversion = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0020011form1/*,_KM0020011form2/*@KM0020010Servlet"
expj.KM0020010.KM0020011form2.LcConversion.onClick0 = function () {
  console.log('LcConversion script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020011form2', '_KM0020011form1/*,_KM0020011form2/*', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.updateBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0020010.KM0020011form2.LcConversion.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011form2.LcConversion['onClick' + i])) {
        expj.KM0020010.KM0020011form2.LcConversion['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020011form2.LcConversion.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020011form2.LcConversion.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-LcConversion').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020011form2', 'LcConversion', this, 'Button');
    }
  });
  expj.KM0020010.KM0020011form2.LcConversion.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.LcConversion.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/LcConversion.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-LcConversion');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:100px;text-align:left;"><button type="button" id="expj-KM0020010-KM0020011form2-LcConversion" name="LcConversion" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.Cmt5608",rb)%></button><!-- 邦貨換算ボタン --></div><!--/td-->
<div class="div-td" style="width:70px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OTHER_COST",rb)%></span><!-- その他経費 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_ES_COST_ETC">
expj.KM0020010.KM0020011form2.l_ES_COST_ETC = {};
// script1="onDecision;0;SET;_l_ES_COST_ALL=[{_l_ES_COST_MATERIAL}+{_l_ES_COST_PROCESS}+{_l_ES_COST_OUTSOUCE}+{_l_ES_COST_ETC}+{_l_ES_COST_SERVICE}]"
expj.KM0020010.KM0020011form2.l_ES_COST_ETC.onDecision0 = function () {
  console.log('l_ES_COST_ETC script1');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_ALL', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_MATERIAL') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_PROCESS') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_OUTSOUCE') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_ETC') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_SERVICE')));
};
expj.KM0020010.KM0020011form2.l_ES_COST_ETC.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_ES_COST_ETC.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011form2.l_ES_COST_ETC['onDecision' + i])) {
        expj.KM0020010.KM0020011form2.l_ES_COST_ETC['onDecision' + i]();
      }
    }
  }
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_ES_COST_ETC.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_ES_COST_ETC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_ES_COST_ETC', this);
  });
  expj.KM0020010.KM0020011form2.l_ES_COST_ETC.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_ES_COST_ETC.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_ES_COST_ETC.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_ES_COST_ETC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_ES_COST_ETC" name="l_ES_COST_ETC" class="KM0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_ES_COST_ETC()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ESTIMATE_GAIN",rb)%></span><!-- 見積利益 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_ESTIMATE_GAIN">
expj.KM0020010.KM0020011form2.l_ESTIMATE_GAIN = {};
expj.KM0020010.KM0020011form2.l_ESTIMATE_GAIN.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_ESTIMATE_GAIN.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_ESTIMATE_GAIN.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_ESTIMATE_GAIN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_ESTIMATE_GAIN', this);
  });
  expj.KM0020010.KM0020011form2.l_ESTIMATE_GAIN.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_ESTIMATE_GAIN.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_ESTIMATE_GAIN.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_ESTIMATE_GAIN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_ESTIMATE_GAIN" name="l_ESTIMATE_GAIN" class="KM0020010-focus-move  " style="width:110px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_ESTIMATE_GAIN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:100px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:70px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SERVICE_COST",rb)%></span><!-- 役務費 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_ES_COST_SERVICE">
expj.KM0020010.KM0020011form2.l_ES_COST_SERVICE = {};
// script1="onDecision;0;SET;_l_ES_COST_ALL=[{_l_ES_COST_MATERIAL}+{_l_ES_COST_PROCESS}+{_l_ES_COST_OUTSOUCE}+{_l_ES_COST_ETC}+{_l_ES_COST_SERVICE}]"
expj.KM0020010.KM0020011form2.l_ES_COST_SERVICE.onDecision0 = function () {
  console.log('l_ES_COST_SERVICE script1');
expj.common.pscript.setReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_ALL', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_MATERIAL') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_PROCESS') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_OUTSOUCE') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_ETC') + '+' + expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011form2', '_l_ES_COST_SERVICE')));
};
expj.KM0020010.KM0020011form2.l_ES_COST_SERVICE.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_ES_COST_SERVICE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011form2.l_ES_COST_SERVICE['onDecision' + i])) {
        expj.KM0020010.KM0020011form2.l_ES_COST_SERVICE['onDecision' + i]();
      }
    }
  }
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_ES_COST_SERVICE.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_ES_COST_SERVICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_ES_COST_SERVICE', this);
  });
  expj.KM0020010.KM0020011form2.l_ES_COST_SERVICE.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_ES_COST_SERVICE.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_ES_COST_SERVICE.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_ES_COST_SERVICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_ES_COST_SERVICE" name="l_ES_COST_SERVICE" class="KM0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_ES_COST_SERVICE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUR_UNIT",rb)%></span><!-- 通貨単位 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_CUR_UNIT">
expj.KM0020010.KM0020011form2.l_CUR_UNIT = {};
expj.KM0020010.KM0020011form2.l_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_CUR_UNIT.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_CUR_UNIT.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_CUR_UNIT', this);
  });
  expj.KM0020010.KM0020011form2.l_CUR_UNIT.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_CUR_UNIT" name="l_CUR_UNIT" class="KM0020010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_CUR_UNIT()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:100px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:70px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ES_COST_ALL",rb)%></span><!-- 予算合計 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_ES_COST_ALL">
expj.KM0020010.KM0020011form2.l_ES_COST_ALL = {};
expj.KM0020010.KM0020011form2.l_ES_COST_ALL.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_ES_COST_ALL.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_ES_COST_ALL.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_ES_COST_ALL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_ES_COST_ALL', this);
  });
  expj.KM0020010.KM0020011form2.l_ES_COST_ALL.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_ES_COST_ALL.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_ES_COST_ALL.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_ES_COST_ALL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_ES_COST_ALL" name="l_ES_COST_ALL" class="KM0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_ES_COST_ALL()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SPEC_CLASS1",rb)%></span><!-- 製品選択1 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_SPEC_CLASS1_TYP">
expj.KM0020010.KM0020011form2.l_SPEC_CLASS1_TYP = {};
expj.KM0020010.KM0020011form2.l_SPEC_CLASS1_TYP.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_SPEC_CLASS1_TYP.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_SPEC_CLASS1_TYP.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_SPEC_CLASS1_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_SPEC_CLASS1_TYP', this);
  });
  expj.KM0020010.KM0020011form2.l_SPEC_CLASS1_TYP.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_SPEC_CLASS1_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_SPEC_CLASS1_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_SPEC_CLASS1_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KM0020010-KM0020011form2-l_SPEC_CLASS1_TYP" name='l_SPEC_CLASS1_TYP' class='KM0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKM0020010Control.getStruct().getList_l_SPEC_CLASS1_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKM0020010Control.getStruct().getList_l_SPEC_CLASS1_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKM0020010Control.getStruct().getList_l_SPEC_CLASS1_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKM0020010Struct.getl_SPEC_CLASS1_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:100px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:70px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SPEC_CLASS2",rb)%></span><!-- 製品選択2 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_SPEC_CLASS2_TYP">
expj.KM0020010.KM0020011form2.l_SPEC_CLASS2_TYP = {};
expj.KM0020010.KM0020011form2.l_SPEC_CLASS2_TYP.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_SPEC_CLASS2_TYP.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_SPEC_CLASS2_TYP.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_SPEC_CLASS2_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_SPEC_CLASS2_TYP', this);
  });
  expj.KM0020010.KM0020011form2.l_SPEC_CLASS2_TYP.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_SPEC_CLASS2_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_SPEC_CLASS2_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_SPEC_CLASS2_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KM0020010-KM0020011form2-l_SPEC_CLASS2_TYP" name='l_SPEC_CLASS2_TYP' class='KM0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKM0020010Control.getStruct().getList_l_SPEC_CLASS2_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKM0020010Control.getStruct().getList_l_SPEC_CLASS2_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKM0020010Control.getStruct().getList_l_SPEC_CLASS2_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKM0020010Struct.getl_SPEC_CLASS2_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-KM0020010-KM0020011form2-PROJECT_STAT" name="PROJECT_STAT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getPROJECT_STAT()) %>">
<script class="expj-script-KM0020010-KM0020011form2-PROJECT_STAT">
expj.KM0020010.KM0020011form2.PROJECT_STAT = {};
expj.KM0020010.KM0020011form2.PROJECT_STAT.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/PROJECT_STAT.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.PROJECT_STAT.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-PROJECT_STAT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'PROJECT_STAT', this);
  });
  expj.KM0020010.KM0020011form2.PROJECT_STAT.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.PROJECT_STAT.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/PROJECT_STAT.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-PROJECT_STAT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SPEC_SELECT1",rb)%></span><!-- 仕様選択1 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_SPEC_SELECT1_TYP">
expj.KM0020010.KM0020011form2.l_SPEC_SELECT1_TYP = {};
expj.KM0020010.KM0020011form2.l_SPEC_SELECT1_TYP.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_SPEC_SELECT1_TYP.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_SPEC_SELECT1_TYP.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_SPEC_SELECT1_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_SPEC_SELECT1_TYP', this);
  });
  expj.KM0020010.KM0020011form2.l_SPEC_SELECT1_TYP.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_SPEC_SELECT1_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_SPEC_SELECT1_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_SPEC_SELECT1_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KM0020010-KM0020011form2-l_SPEC_SELECT1_TYP" name='l_SPEC_SELECT1_TYP' class='KM0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKM0020010Control.getStruct().getList_l_SPEC_SELECT1_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKM0020010Control.getStruct().getList_l_SPEC_SELECT1_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKM0020010Control.getStruct().getList_l_SPEC_SELECT1_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKM0020010Struct.getl_SPEC_SELECT1_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:100px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:70px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SPEC_SELECT2",rb)%></span><!-- 仕様選択2 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_SPEC_SELECT2_TYP">
expj.KM0020010.KM0020011form2.l_SPEC_SELECT2_TYP = {};
expj.KM0020010.KM0020011form2.l_SPEC_SELECT2_TYP.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_SPEC_SELECT2_TYP.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_SPEC_SELECT2_TYP.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_SPEC_SELECT2_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_SPEC_SELECT2_TYP', this);
  });
  expj.KM0020010.KM0020011form2.l_SPEC_SELECT2_TYP.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_SPEC_SELECT2_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_SPEC_SELECT2_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_SPEC_SELECT2_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KM0020010-KM0020011form2-l_SPEC_SELECT2_TYP" name='l_SPEC_SELECT2_TYP' class='KM0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKM0020010Control.getStruct().getList_l_SPEC_SELECT2_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKM0020010Control.getStruct().getList_l_SPEC_SELECT2_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKM0020010Control.getStruct().getList_l_SPEC_SELECT2_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKM0020010Struct.getl_SPEC_SELECT2_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-KM0020010-KM0020011form2-l_UNIT_COST" name="l_UNIT_COST" class="" data-kind="OBT_NUMBER_P;14.2;FLOOR;4" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_UNIT_COST()) %>">
<script class="expj-script-KM0020010-KM0020011form2-l_UNIT_COST">
expj.KM0020010.KM0020011form2.l_UNIT_COST = {};
expj.KM0020010.KM0020011form2.l_UNIT_COST.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_UNIT_COST.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_UNIT_COST.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_UNIT_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_UNIT_COST', this);
  });
  expj.KM0020010.KM0020011form2.l_UNIT_COST.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_UNIT_COST.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_UNIT_COST.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_UNIT_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SPEC_SELECT3",rb)%></span><!-- 仕様選択3 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_SPEC_SELECT3_TYP">
expj.KM0020010.KM0020011form2.l_SPEC_SELECT3_TYP = {};
expj.KM0020010.KM0020011form2.l_SPEC_SELECT3_TYP.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_SPEC_SELECT3_TYP.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_SPEC_SELECT3_TYP.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_SPEC_SELECT3_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_SPEC_SELECT3_TYP', this);
  });
  expj.KM0020010.KM0020011form2.l_SPEC_SELECT3_TYP.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_SPEC_SELECT3_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_SPEC_SELECT3_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_SPEC_SELECT3_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KM0020010-KM0020011form2-l_SPEC_SELECT3_TYP" name='l_SPEC_SELECT3_TYP' class='KM0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKM0020010Control.getStruct().getList_l_SPEC_SELECT3_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKM0020010Control.getStruct().getList_l_SPEC_SELECT3_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKM0020010Control.getStruct().getList_l_SPEC_SELECT3_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKM0020010Struct.getl_SPEC_SELECT3_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:100px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:70px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SPEC_SELECT4",rb)%></span><!-- 仕様選択4 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_SPEC_SELECT4_TYP">
expj.KM0020010.KM0020011form2.l_SPEC_SELECT4_TYP = {};
expj.KM0020010.KM0020011form2.l_SPEC_SELECT4_TYP.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_SPEC_SELECT4_TYP.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_SPEC_SELECT4_TYP.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_SPEC_SELECT4_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_SPEC_SELECT4_TYP', this);
  });
  expj.KM0020010.KM0020011form2.l_SPEC_SELECT4_TYP.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_SPEC_SELECT4_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_SPEC_SELECT4_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_SPEC_SELECT4_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KM0020010-KM0020011form2-l_SPEC_SELECT4_TYP" name='l_SPEC_SELECT4_TYP' class='KM0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKM0020010Control.getStruct().getList_l_SPEC_SELECT4_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKM0020010Control.getStruct().getList_l_SPEC_SELECT4_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKM0020010Control.getStruct().getList_l_SPEC_SELECT4_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKM0020010Struct.getl_SPEC_SELECT4_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-KM0020010-KM0020011form2-l_FLAG" name="l_FLAG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_FLAG()) %>">
<script class="expj-script-KM0020010-KM0020011form2-l_FLAG">
expj.KM0020010.KM0020011form2.l_FLAG = {};
expj.KM0020010.KM0020011form2.l_FLAG.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_FLAG.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_FLAG.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_FLAG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_FLAG', this);
  });
  expj.KM0020010.KM0020011form2.l_FLAG.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_FLAG.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_FLAG.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_FLAG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REMARKS",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011form2-l_REMARKS">
expj.KM0020010.KM0020011form2.l_REMARKS = {};
expj.KM0020010.KM0020011form2.l_REMARKS.executeAllOnDecision = function () {
  console.log('execute KM0020011form2/l_REMARKS.onDecision');
  expj.KM0020010.KM0020011form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020011form2.l_REMARKS.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011form2-l_REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020011form2', 'l_REMARKS', this);
  });
  expj.KM0020010.KM0020011form2.l_REMARKS.executePScriptOnLoad();
};

expj.KM0020010.KM0020011form2.l_REMARKS.executePScriptOnLoad = function () {
  console.log('execute KM0020011form2/l_REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011form2-l_REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020011form2-l_REMARKS" name="l_REMARKS" class="KM0020010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getl_REMARKS()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-KM0020010-KM0020011button1">
expj.KM0020010.KM0020011button1 = {};
expj.KM0020010.KM0020011button1.executeAllOnDecision = function () {
  console.log('execute KM0020011button1.onDecision');
};
expj.KM0020010.KM0020011button1.executeOnLoad = function () {
  expj.KM0020010.KM0020011button1.executePScriptOnLoad();
};

expj.KM0020010.KM0020011button1.executePScriptOnLoad = function () {
  console.log('execute KM0020011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0020010-KM0020011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0020010-KM0020011button1-insertSub1">
expj.KM0020010.KM0020011button1.insertSub1 = {};
// script1="onClick;0;CHK;_KM0020011form2/l_AMOUNT[numeq]0@!KM00015"
expj.KM0020010.KM0020011button1.insertSub1.onClick0 = function () {
  console.log('insertSub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011button1', '_KM0020011form2/l_AMOUNT')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KM0020010', 'KM0020011button1', 'KM00015');
}
};
// script2="onClick;1;CHK;_KM0020011form2/l_ESTIMATE_AMOUNT[numeq]0[or]_KM0020011form2/l_ESTIMATE_AMOUNT[lt]0@!KM00016"
expj.KM0020010.KM0020011button1.insertSub1.onClick1 = function () {
  console.log('insertSub1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011button1', '_KM0020011form2/l_ESTIMATE_AMOUNT')), '[numeq]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011button1', '_KM0020011form2/l_ESTIMATE_AMOUNT')), '[lt]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KM0020010', 'KM0020011button1', 'KM00016');
}
};
// script3="onClick;2;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_KM0020011form1/*,_KM0020011form2/*@KM0020010Servlet"
expj.KM0020010.KM0020011button1.insertSub1.onClick2 = function () {
  console.log('insertSub1 script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020011button1', '_KM0020011form1/*,_KM0020011form2/*', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.changeBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0020010.KM0020011button1.insertSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011button1.insertSub1['onClick' + i])) {
        expj.KM0020010.KM0020011button1.insertSub1['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020011button1.insertSub1.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020011button1.insertSub1.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011button1-insertSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020011button1', 'insertSub1', this, 'Button');
    }
  });
  expj.KM0020010.KM0020011button1.insertSub1.executePScriptOnLoad();
};

expj.KM0020010.KM0020011button1.insertSub1.executePScriptOnLoad = function () {
  console.log('execute KM0020011button1/insertSub1.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011button1-insertSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0020010-KM0020011button1-insertSub1" name="insertSub1" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnAddition",rb)%></button><!-- 追加ボタン --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020011button1-updateSub1">
expj.KM0020010.KM0020011button1.updateSub1 = {};
// script1="onClick;0;CHK;_KM0020011form2/l_AMOUNT[numeq]0@!KM00015"
expj.KM0020010.KM0020011button1.updateSub1.onClick0 = function () {
  console.log('updateSub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011button1', '_KM0020011form2/l_AMOUNT')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KM0020010', 'KM0020011button1', 'KM00015');
}
};
// script2="onClick;1;CHK;_KM0020011form2/l_ESTIMATE_AMOUNT[numeq]0[or]_KM0020011form2/l_ESTIMATE_AMOUNT[lt]0@!KM00016"
expj.KM0020010.KM0020011button1.updateSub1.onClick1 = function () {
  console.log('updateSub1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011button1', '_KM0020011form2/l_ESTIMATE_AMOUNT')), '[numeq]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020011button1', '_KM0020011form2/l_ESTIMATE_AMOUNT')), '[lt]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KM0020010', 'KM0020011button1', 'KM00016');
}
};
// script3="onClick;2;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_KM0020011form1/*,_KM0020011form2/*@KM0020010Servlet"
expj.KM0020010.KM0020011button1.updateSub1.onClick2 = function () {
  console.log('updateSub1 script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020011button1', '_KM0020011form1/*,_KM0020011form2/*', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.changeBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0020010.KM0020011button1.updateSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011button1.updateSub1['onClick' + i])) {
        expj.KM0020010.KM0020011button1.updateSub1['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020011button1.updateSub1.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020011button1.updateSub1.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011button1-updateSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020011button1', 'updateSub1', this, 'Button');
    }
  });
  expj.KM0020010.KM0020011button1.updateSub1.executePScriptOnLoad();
};

expj.KM0020010.KM0020011button1.updateSub1.executePScriptOnLoad = function () {
  console.log('execute KM0020011button1/updateSub1.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011button1-updateSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0020010-KM0020011button1-updateSub1" name="updateSub1" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnModify",rb)%></button><!-- 修正ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 105px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KM0020011 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-KM0020010-KM0020011button0">
expj.KM0020010.KM0020011button0 = {};
expj.KM0020010.KM0020011button0.executeAllOnDecision = function () {
  console.log('execute KM0020011button0.onDecision');
};
expj.KM0020010.KM0020011button0.executeOnLoad = function () {
  expj.KM0020010.KM0020011button0.executePScriptOnLoad();
};

expj.KM0020010.KM0020011button0.executePScriptOnLoad = function () {
  console.log('execute KM0020011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0020010-KM0020011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0020010-KM0020011button0-cancelSub1">
expj.KM0020010.KM0020011button0.cancelSub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>@KM0020010Servlet,,$ZZ07013"
expj.KM0020010.KM0020011button0.cancelSub1.onClick0 = function () {
  console.log('cancelSub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020011button0', '', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.changeBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callConfirm('KM0020010', 'KM0020011button0', 'ZZ07013', okEvent);
};
expj.KM0020010.KM0020011button0.cancelSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020011button0.cancelSub1['onClick' + i])) {
        expj.KM0020010.KM0020011button0.cancelSub1['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020011button0.cancelSub1.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020011button0.cancelSub1.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020011button0-cancelSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020011button0', 'cancelSub1', this, 'Button');
    }
  });
  expj.KM0020010.KM0020011button0.cancelSub1.executePScriptOnLoad();
};

expj.KM0020010.KM0020011button0.cancelSub1.executePScriptOnLoad = function () {
  console.log('execute KM0020011button0/cancelSub1.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020011button0-cancelSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0020010-KM0020011button0-cancelSub1" name="cancelSub1" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KM0020010 (END)-->
<%
MessageStruct msgStruct = aKM0020010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KM0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KM0020010)) {
  expj.common.treeInstanceMap.KM0020010 = {};
}
expj.common.treeInstanceMap.KM0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KM0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KM0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KM0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KM0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KM0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KM0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KM0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KM0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KM0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KM0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0020010)) {
  expj.common.detailDialogMap.KM0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KM0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.KM0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KM0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KM0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KM0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KM0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KM0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KM0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KM0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KM0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KM0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KM0020010)) {
  expj.common.viewInstanceMap.KM0020010 = {};
}
expj.common.viewInstanceMap.KM0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.KM0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KM0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KM0020010.<%=viewId %>.init = function () {
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
    expj.KM0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KM0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KM0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KM0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KM0020010_init">
/**
 * KM0020010用のロード完了時初期化関数
 */
expj.KM0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KM0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KM0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KM0020010');
  expj.common.calendarInstanceMap.KM0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KM0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KM0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KM0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KM0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KM0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KM0020010-<%=detailId %>');
<%
 }
%>
  try{expj.KM0020010.KM0020011form1.PROJECT_CD.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form1.h_CUR_CD.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form1.CUST_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form1.ESTIMATE_NO.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form1.h_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form1.l_DETAL_NO.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_ESTIMATE_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_DESINATED_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.CalendarSalesDate.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_CUST_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_ESTIMATE_QTY.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_UNIT_CD.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.SelectUnitCost.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_ES_COST_MATERIAL.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_DISCOUNT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_DISCOUNT_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_ES_COST_PROCESS.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_ESTIMATE_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_ESTIMATE_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_ES_COST_OUTSOUCE.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_ESTIMATE_AMOUNT_JPN.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.LcConversion.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_ES_COST_ETC.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_ESTIMATE_GAIN.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_ES_COST_SERVICE.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_ES_COST_ALL.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_SPEC_CLASS1_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_SPEC_CLASS2_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.PROJECT_STAT.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_SPEC_SELECT1_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_SPEC_SELECT2_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_UNIT_COST.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_SPEC_SELECT3_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_SPEC_SELECT4_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_FLAG.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.l_REMARKS.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011button1.insertSub1.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011button1.updateSub1.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011button0.cancelSub1.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form1.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011form2.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011button1.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KM0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KM0020010', 'KM0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KM0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KM0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.KM0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KM0020010', '<%=request.getContextPath() %>');
};

/**
 * KM0020010の全体onDecision処理
 */
expj.KM0020010.executeAllOnDecision = function () {
  expj.KM0020010.KM0020011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KM0020010_console">
expj.KM0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>