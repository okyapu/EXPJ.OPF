<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 13:02:28 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KU0050\KU0050010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KU0050.*" %>
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
<jsp:useBean id="aKU0050010Control" class="com.nec.jp.orteus.metamorBase.KU0050.KU0050010Control" scope="request"/>
<jsp:useBean id="aKU0050010Struct" class="com.nec.jp.orteus.metamorBase.KU0050.KU0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

出荷指示一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0050/jsp/KU0050010.jsp,v $
$Author: geng-jia $	
$Revision: 1.14 $　$Date: 2017/02/22 02:07:28 $
********************************************************* --%>
<html>
<head>
<title>出荷指示一覧</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil suAG0070 = new ScreenMoveUtil("AG0070010Servlet", so);
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
<script class="expj-script-KU0050010_init">
  // KU0050010名前空間
  expj.KU0050010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KU0050010" data-screen="KU0050010" data-newdata="<%=aKU0050010Control.isNewData() %>">
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
              <script class="expj-script-KU0050010-KU0050010form1">
expj.KU0050010.KU0050010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5"
expj.KU0050010.KU0050010form1.onLoad0 = function () {
  console.log('KU0050010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script2="onDecision;0;CHK;_KU0050010form1/r_SEL_PTN1[eq]true@*0"
expj.KU0050010.KU0050010form1.onDecision0 = function () {
  console.log('KU0050010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/r_SEL_PTN1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onDecision;1;CHK;_KU0050010form1/r_SEL_PTN2[eq]true@*1"
expj.KU0050010.KU0050010form1.onDecision1 = function () {
  console.log('KU0050010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/r_SEL_PTN2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="onDecision;2;CHK;_KU0050010form1/r_SEL_PTN3[eq]true@*3"
expj.KU0050010.KU0050010form1.onDecision2 = function () {
  console.log('KU0050010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/r_SEL_PTN3'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="onDecision;3;CHK;_KU0050010form1/r_SEL_PTN4[eq]true@*2"
expj.KU0050010.KU0050010form1.onDecision3 = function () {
  console.log('KU0050010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/r_SEL_PTN4'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script6="child;0;SET;_KU0050010form1/r_SEL_PTN=SIJI@*4"
expj.KU0050010.KU0050010form1.child0 = function () {
  console.log('KU0050010form1 script6');
expj.common.pscript.setReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/r_SEL_PTN', 'SIJI');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script7="child;1;SET;_KU0050010form1/r_SEL_PTN=SIJIALARM@*4"
expj.KU0050010.KU0050010form1.child1 = function () {
  console.log('KU0050010form1 script7');
expj.common.pscript.setReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/r_SEL_PTN', 'SIJIALARM');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script8="child;2;SET;_KU0050010form1/r_SEL_PTN=SIJICOMPILE@*4"
expj.KU0050010.KU0050010form1.child2 = function () {
  console.log('KU0050010form1 script8');
expj.common.pscript.setReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/r_SEL_PTN', 'SIJICOMPILE');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script9="child;3;SET;_KU0050010form1/r_SEL_PTN=MISIJI,_KU0050010form1/c_USER=@*5"
expj.KU0050010.KU0050010form1.child3 = function () {
  console.log('KU0050010form1 script9');
expj.common.pscript.setReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/r_SEL_PTN', 'MISIJI');
expj.common.pscript.setReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/c_USER', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script10="child;4;UNMASK;_KU0050010form1/c_USER"
expj.KU0050010.KU0050010form1.child4 = function () {
  console.log('KU0050010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010form1/c_USER');
};
// script11="child;5;MASK;_KU0050010form1/c_USER"
expj.KU0050010.KU0050010form1.child5 = function () {
  console.log('KU0050010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010form1/c_USER');
};
// script12="onDecision;4;CHKRQ;?KU0050010view1/?[neq]NOT_SELECTED@*6,*9"
expj.KU0050010.KU0050010form1.onDecision4 = function () {
  console.log('KU0050010form1 script12');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?KU0050010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script13="child;6;CHK;?IN_CUST_CD[eq]SAME[and]?IN_ITEM_CD[eq]SAME[and]?IN_CUST_ITEM_CD[eq]SAME[and]?FROM_SEARCH_DATE[eq]SAME[and]?TO_SEARCH_DATE[eq]SAME[and]?IN_CUST_ODR_NO[eq]SAME[and]?IN_LOT_NO[eq]SAME[and]?r_SEL_PTN1[eq]SAME[and]?r_SEL_PTN2[eq]SAME[and]?r_SEL_PTN3[eq]SAME[and]?r_SEL_PTN4[eq]SAME[and]?c_USER[eq]SAME[and]?FROM_SHIP_DATE[eq]SAME[and]?TO_SHIP_DATE[eq]SAME[and]_h_LOTCTRL[eq]true@*7,*9"
expj.KU0050010.KU0050010form1.child6 = function () {
  console.log('KU0050010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?IN_CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?IN_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?IN_CUST_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?FROM_SEARCH_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?TO_SEARCH_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?IN_CUST_ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?IN_LOT_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?r_SEL_PTN1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?r_SEL_PTN2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?r_SEL_PTN3'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?r_SEL_PTN4'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?c_USER'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?FROM_SHIP_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '?TO_SHIP_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '_h_LOTCTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script14="child;7;SELCHK;KU0050010view1:_LOT_NO[neq]@*8,*9"
expj.KU0050010.KU0050010form1.child7 = function () {
  console.log('KU0050010form1 script14');
var selectCells = expj.common.pscript.getSelectedVIEWCells('KU0050010', 'KU0050010view1');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.LOT_NO, '[neq]', ''))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script15="child;8;UNMASK;_KU0050010button2/SelectLotTraceRef"
expj.KU0050010.KU0050010form1.child8 = function () {
  console.log('KU0050010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010button2/SelectLotTraceRef');
};
// script16="child;9;MASK;_KU0050010button2/SelectLotTraceRef"
expj.KU0050010.KU0050010form1.child9 = function () {
  console.log('KU0050010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010button2/SelectLotTraceRef');
};
// script17="onDecision;5;CHK;_KU0050010form1/r_SEL_PTN4[eq]true@*10,*11"
expj.KU0050010.KU0050010form1.onDecision5 = function () {
  console.log('KU0050010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/r_SEL_PTN4'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script18="child;10;UNMASK;_KU0050010form1/FROM_SHIP_DATE,_KU0050010form1/CalendarShipDateFrom,_KU0050010form1/TO_SHIP_DATE,_KU0050010form1/CalendarShipDateTo,_KU0050010form1/IN_LOT_NO,_KU0050010form1/PeekerIN_LOT_CD"
expj.KU0050010.KU0050010form1.child10 = function () {
  console.log('KU0050010form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010form1/FROM_SHIP_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010form1/CalendarShipDateFrom');
expj.common.pscript.setUnMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010form1/TO_SHIP_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010form1/CalendarShipDateTo');
expj.common.pscript.setUnMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010form1/IN_LOT_NO');
expj.common.pscript.setUnMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010form1/PeekerIN_LOT_CD');
};
// script19="child;11;MASK;_KU0050010form1/FROM_SHIP_DATE,_KU0050010form1/CalendarShipDateFrom,_KU0050010form1/TO_SHIP_DATE,_KU0050010form1/CalendarShipDateTo,_KU0050010form1/IN_LOT_NO,_KU0050010form1/PeekerIN_LOT_CD@*12"
expj.KU0050010.KU0050010form1.child11 = function () {
  console.log('KU0050010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010form1/FROM_SHIP_DATE');
expj.common.pscript.setMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010form1/CalendarShipDateFrom');
expj.common.pscript.setMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010form1/TO_SHIP_DATE');
expj.common.pscript.setMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010form1/CalendarShipDateTo');
expj.common.pscript.setMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010form1/IN_LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('KU0050010', 'KU0050010form1', '_KU0050010form1/PeekerIN_LOT_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child12)){this.child12();}}
};
// script20="child;12;SET;_KU0050010form1/FROM_SHIP_DATE=,_KU0050010form1/TO_SHIP_DATE=,_KU0050010form1/IN_LOT_NO="
expj.KU0050010.KU0050010form1.child12 = function () {
  console.log('KU0050010form1 script20');
expj.common.pscript.setReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/FROM_SHIP_DATE', '');
expj.common.pscript.setReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/TO_SHIP_DATE', '');
expj.common.pscript.setReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/IN_LOT_NO', '');
};
expj.KU0050010.KU0050010form1.executeAllOnDecision = function () {
  console.log('execute KU0050010form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0050010.KU0050010form1['onDecision' + i])) {
        expj.KU0050010.KU0050010form1['onDecision' + i]();
      }
    }
  }
};
expj.KU0050010.KU0050010form1.executeOnLoad = function () {
  expj.KU0050010.KU0050010form1.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KU0050010.KU0050010form1['onLoad' + i])) {
      expj.KU0050010.KU0050010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0050010-KU0050010form1" action="KU0050010Servlet" name="KU0050010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:165px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:165px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:34px;align:"></div>
<div class="div-td" style="width:20px;align:"></div>
<div class="div-td" style="width:34px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:68px;align:"></div>
<div class="div-td" style="width:80px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-IN_CUST_CD">
expj.KU0050010.KU0050010form1.IN_CUST_CD = {};
expj.KU0050010.KU0050010form1.IN_CUST_CD.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/IN_CUST_CD.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.IN_CUST_CD.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-IN_CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0050010', 'KU0050010form1', 'IN_CUST_CD', this);
  });
  expj.KU0050010.KU0050010form1.IN_CUST_CD.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.IN_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/IN_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-IN_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0050010-KU0050010form1-IN_CUST_CD" name="IN_CUST_CD" class="KU0050010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKU0050010Struct.getIN_CUST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-PeekerIN_CUST_CD">
expj.KU0050010.KU0050010form1.PeekerIN_CUST_CD = {};
// script1="onClick;0;PEEKER;_KU0050010form1/IN_CUST_CD@<%=contextNo%>"
expj.KU0050010.KU0050010form1.PeekerIN_CUST_CD.onClick0 = function () {
  console.log('PeekerIN_CUST_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0050010';
var parameterValues = 'PeekerIN_CUST_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/IN_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KU0050010form1/IN_CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0050010.KU0050010form1.PeekerIN_CUST_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0050010.KU0050010form1.PeekerIN_CUST_CD['onClick' + i])) {
        expj.KU0050010.KU0050010form1.PeekerIN_CUST_CD['onClick' + i]();
      }
    }
  }
};
expj.KU0050010.KU0050010form1.PeekerIN_CUST_CD.executeAllOnDecision = function () {
};
expj.KU0050010.KU0050010form1.PeekerIN_CUST_CD.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-PeekerIN_CUST_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010form1', 'PeekerIN_CUST_CD', this, 'Button');
    }
  });
  expj.KU0050010.KU0050010form1.PeekerIN_CUST_CD.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.PeekerIN_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/PeekerIN_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-PeekerIN_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0050010-KU0050010form1-PeekerIN_CUST_CD" class="KU0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-r_SEL_PTN3">
expj.KU0050010.KU0050010form1.r_SEL_PTN3 = {};
expj.KU0050010.KU0050010form1.r_SEL_PTN3.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/r_SEL_PTN3.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.r_SEL_PTN3.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-r_SEL_PTN3').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010form1', 'r_SEL_PTN3', this, 'RadioButton');
    }
  });
  expj.KU0050010.KU0050010form1.r_SEL_PTN3.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.r_SEL_PTN3.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/r_SEL_PTN3.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-r_SEL_PTN3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;"><input type="radio" name="r_SEL_PTN0" data-name="r_SEL_PTN3" value="true" <%= ("true".equals(TypeConverter.convert(aKU0050010Struct.getr_SEL_PTN3())))?"checked=\"checked\"":"" %> class="" id="expj-KU0050010-KU0050010form1-r_SEL_PTN3" ><label for="expj-KU0050010-KU0050010form1-r_SEL_PTN3"><%=CoreTools.getRBString("Expj.Cmt0466",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-IN_ITEM_CD">
expj.KU0050010.KU0050010form1.IN_ITEM_CD = {};
expj.KU0050010.KU0050010form1.IN_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/IN_ITEM_CD.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.IN_ITEM_CD.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-IN_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0050010', 'KU0050010form1', 'IN_ITEM_CD', this);
  });
  expj.KU0050010.KU0050010form1.IN_ITEM_CD.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.IN_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/IN_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-IN_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0050010-KU0050010form1-IN_ITEM_CD" name="IN_ITEM_CD" class="KU0050010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKU0050010Struct.getIN_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-PeekerIN_ITEM_CD">
expj.KU0050010.KU0050010form1.PeekerIN_ITEM_CD = {};
// script1="onClick;0;PEEKER;_KU0050010form1/IN_ITEM_CD@<%=contextNo%>"
expj.KU0050010.KU0050010form1.PeekerIN_ITEM_CD.onClick0 = function () {
  console.log('PeekerIN_ITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0050010';
var parameterValues = 'PeekerIN_ITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/IN_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KU0050010form1/IN_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0050010.KU0050010form1.PeekerIN_ITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0050010.KU0050010form1.PeekerIN_ITEM_CD['onClick' + i])) {
        expj.KU0050010.KU0050010form1.PeekerIN_ITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.KU0050010.KU0050010form1.PeekerIN_ITEM_CD.executeAllOnDecision = function () {
};
expj.KU0050010.KU0050010form1.PeekerIN_ITEM_CD.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-PeekerIN_ITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010form1', 'PeekerIN_ITEM_CD', this, 'Button');
    }
  });
  expj.KU0050010.KU0050010form1.PeekerIN_ITEM_CD.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.PeekerIN_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/PeekerIN_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-PeekerIN_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0050010-KU0050010form1-PeekerIN_ITEM_CD" class="KU0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-r_SEL_PTN1">
expj.KU0050010.KU0050010form1.r_SEL_PTN1 = {};
expj.KU0050010.KU0050010form1.r_SEL_PTN1.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/r_SEL_PTN1.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.r_SEL_PTN1.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-r_SEL_PTN1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010form1', 'r_SEL_PTN1', this, 'RadioButton');
    }
  });
  expj.KU0050010.KU0050010form1.r_SEL_PTN1.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.r_SEL_PTN1.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/r_SEL_PTN1.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-r_SEL_PTN1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;"><input type="radio" name="r_SEL_PTN0" data-name="r_SEL_PTN1" value="true" <%= ("true".equals(TypeConverter.convert(aKU0050010Struct.getr_SEL_PTN1())))?"checked=\"checked\"":"" %> class="" id="expj-KU0050010-KU0050010form1-r_SEL_PTN1" ><label for="expj-KU0050010-KU0050010form1-r_SEL_PTN1"><%=CoreTools.getRBString("Expj.Cmt0454",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)%></span><!-- 得意先品目番号 --></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-IN_CUST_ITEM_CD">
expj.KU0050010.KU0050010form1.IN_CUST_ITEM_CD = {};
expj.KU0050010.KU0050010form1.IN_CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/IN_CUST_ITEM_CD.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.IN_CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-IN_CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0050010', 'KU0050010form1', 'IN_CUST_ITEM_CD', this);
  });
  expj.KU0050010.KU0050010form1.IN_CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.IN_CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/IN_CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-IN_CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0050010-KU0050010form1-IN_CUST_ITEM_CD" name="IN_CUST_ITEM_CD" class="KU0050010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKU0050010Struct.getIN_CUST_ITEM_CD()) %>" maxlength="35" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-r_SEL_PTN2">
expj.KU0050010.KU0050010form1.r_SEL_PTN2 = {};
expj.KU0050010.KU0050010form1.r_SEL_PTN2.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/r_SEL_PTN2.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.r_SEL_PTN2.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-r_SEL_PTN2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010form1', 'r_SEL_PTN2', this, 'RadioButton');
    }
  });
  expj.KU0050010.KU0050010form1.r_SEL_PTN2.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.r_SEL_PTN2.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/r_SEL_PTN2.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-r_SEL_PTN2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;"><input type="radio" name="r_SEL_PTN0" data-name="r_SEL_PTN2" value="true" <%= ("true".equals(TypeConverter.convert(aKU0050010Struct.getr_SEL_PTN2())))?"checked=\"checked\"":"" %> class="" id="expj-KU0050010-KU0050010form1-r_SEL_PTN2" ><label for="expj-KU0050010-KU0050010form1-r_SEL_PTN2"><%=CoreTools.getRBString("Expj.Cmt0467",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-KU0050010-KU0050010form1-r_SEL_PTN" name="r_SEL_PTN" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0050010Struct.getr_SEL_PTN()) %>">
<script class="expj-script-KU0050010-KU0050010form1-r_SEL_PTN">
expj.KU0050010.KU0050010form1.r_SEL_PTN = {};
expj.KU0050010.KU0050010form1.r_SEL_PTN.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/r_SEL_PTN.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.r_SEL_PTN.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-r_SEL_PTN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0050010', 'KU0050010form1', 'r_SEL_PTN', this);
  });
  expj.KU0050010.KU0050010form1.r_SEL_PTN.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.r_SEL_PTN.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/r_SEL_PTN.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-r_SEL_PTN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DESINATED_SHIP_DATE",rb)%></span><!-- 出荷指定日 --></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-FROM_SEARCH_DATE">
expj.KU0050010.KU0050010form1.FROM_SEARCH_DATE = {};
expj.KU0050010.KU0050010form1.FROM_SEARCH_DATE.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/FROM_SEARCH_DATE.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.FROM_SEARCH_DATE.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-FROM_SEARCH_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0050010', 'KU0050010form1', 'FROM_SEARCH_DATE', this);
  });
  expj.KU0050010.KU0050010form1.FROM_SEARCH_DATE.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.FROM_SEARCH_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/FROM_SEARCH_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-FROM_SEARCH_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0050010-KU0050010form1-FROM_SEARCH_DATE" name="FROM_SEARCH_DATE" class="KU0050010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0050010Struct.getFROM_SEARCH_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-CalendarSearchFrom">
expj.KU0050010.KU0050010form1.CalendarSearchFrom = {};
// script1="onClick;0;CALENDAR;_KU0050010form1/FROM_SEARCH_DATE"
expj.KU0050010.KU0050010form1.CalendarSearchFrom.onClick0 = function () {
  console.log('CalendarSearchFrom script1');
expj.common.pscript.executeCalendar('KU0050010','KU0050010form1','_KU0050010form1/FROM_SEARCH_DATE');
};
expj.KU0050010.KU0050010form1.CalendarSearchFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0050010.KU0050010form1.CalendarSearchFrom['onClick' + i])) {
        expj.KU0050010.KU0050010form1.CalendarSearchFrom['onClick' + i]();
      }
    }
  }
};
expj.KU0050010.KU0050010form1.CalendarSearchFrom.executeAllOnDecision = function () {
};
expj.KU0050010.KU0050010form1.CalendarSearchFrom.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-CalendarSearchFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010form1', 'CalendarSearchFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0050010','KU0050010form1','_KU0050010form1/FROM_SEARCH_DATE');
  expj.KU0050010.KU0050010form1.CalendarSearchFrom.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.CalendarSearchFrom.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/CalendarSearchFrom.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-CalendarSearchFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0050010-KU0050010form1-CalendarSearchFrom" class="KU0050010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-TO_SEARCH_DATE">
expj.KU0050010.KU0050010form1.TO_SEARCH_DATE = {};
expj.KU0050010.KU0050010form1.TO_SEARCH_DATE.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/TO_SEARCH_DATE.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.TO_SEARCH_DATE.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-TO_SEARCH_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0050010', 'KU0050010form1', 'TO_SEARCH_DATE', this);
  });
  expj.KU0050010.KU0050010form1.TO_SEARCH_DATE.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.TO_SEARCH_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/TO_SEARCH_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-TO_SEARCH_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0050010-KU0050010form1-TO_SEARCH_DATE" name="TO_SEARCH_DATE" class="KU0050010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0050010Struct.getTO_SEARCH_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-CalendarSearchTo">
expj.KU0050010.KU0050010form1.CalendarSearchTo = {};
// script1="onClick;0;CALENDAR;_KU0050010form1/TO_SEARCH_DATE"
expj.KU0050010.KU0050010form1.CalendarSearchTo.onClick0 = function () {
  console.log('CalendarSearchTo script1');
expj.common.pscript.executeCalendar('KU0050010','KU0050010form1','_KU0050010form1/TO_SEARCH_DATE');
};
expj.KU0050010.KU0050010form1.CalendarSearchTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0050010.KU0050010form1.CalendarSearchTo['onClick' + i])) {
        expj.KU0050010.KU0050010form1.CalendarSearchTo['onClick' + i]();
      }
    }
  }
};
expj.KU0050010.KU0050010form1.CalendarSearchTo.executeAllOnDecision = function () {
};
expj.KU0050010.KU0050010form1.CalendarSearchTo.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-CalendarSearchTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010form1', 'CalendarSearchTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0050010','KU0050010form1','_KU0050010form1/TO_SEARCH_DATE');
  expj.KU0050010.KU0050010form1.CalendarSearchTo.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.CalendarSearchTo.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/CalendarSearchTo.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-CalendarSearchTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0050010-KU0050010form1-CalendarSearchTo" class="KU0050010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-r_SEL_PTN4">
expj.KU0050010.KU0050010form1.r_SEL_PTN4 = {};
expj.KU0050010.KU0050010form1.r_SEL_PTN4.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/r_SEL_PTN4.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.r_SEL_PTN4.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-r_SEL_PTN4').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010form1', 'r_SEL_PTN4', this, 'RadioButton');
    }
  });
  expj.KU0050010.KU0050010form1.r_SEL_PTN4.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.r_SEL_PTN4.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/r_SEL_PTN4.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-r_SEL_PTN4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;"><input type="radio" name="r_SEL_PTN0" data-name="r_SEL_PTN4" value="true" <%= ("true".equals(TypeConverter.convert(aKU0050010Struct.getr_SEL_PTN4())))?"checked=\"checked\"":"" %> class="" id="expj-KU0050010-KU0050010form1-r_SEL_PTN4" ><label for="expj-KU0050010-KU0050010form1-r_SEL_PTN4"><%=CoreTools.getRBString("Expj.Cmt3051",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_DATE",rb)%></span><!-- 出荷実績日 --></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-FROM_SHIP_DATE">
expj.KU0050010.KU0050010form1.FROM_SHIP_DATE = {};
expj.KU0050010.KU0050010form1.FROM_SHIP_DATE.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/FROM_SHIP_DATE.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.FROM_SHIP_DATE.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-FROM_SHIP_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0050010', 'KU0050010form1', 'FROM_SHIP_DATE', this);
  });
  expj.KU0050010.KU0050010form1.FROM_SHIP_DATE.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.FROM_SHIP_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/FROM_SHIP_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-FROM_SHIP_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0050010-KU0050010form1-FROM_SHIP_DATE" name="FROM_SHIP_DATE" class="KU0050010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0050010Struct.getFROM_SHIP_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-CalendarShipDateFrom">
expj.KU0050010.KU0050010form1.CalendarShipDateFrom = {};
// script1="onClick;0;CALENDAR;_KU0050010form1/FROM_SHIP_DATE"
expj.KU0050010.KU0050010form1.CalendarShipDateFrom.onClick0 = function () {
  console.log('CalendarShipDateFrom script1');
expj.common.pscript.executeCalendar('KU0050010','KU0050010form1','_KU0050010form1/FROM_SHIP_DATE');
};
expj.KU0050010.KU0050010form1.CalendarShipDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0050010.KU0050010form1.CalendarShipDateFrom['onClick' + i])) {
        expj.KU0050010.KU0050010form1.CalendarShipDateFrom['onClick' + i]();
      }
    }
  }
};
expj.KU0050010.KU0050010form1.CalendarShipDateFrom.executeAllOnDecision = function () {
};
expj.KU0050010.KU0050010form1.CalendarShipDateFrom.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-CalendarShipDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010form1', 'CalendarShipDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0050010','KU0050010form1','_KU0050010form1/FROM_SHIP_DATE');
  expj.KU0050010.KU0050010form1.CalendarShipDateFrom.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.CalendarShipDateFrom.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/CalendarShipDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-CalendarShipDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0050010-KU0050010form1-CalendarShipDateFrom" class="KU0050010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-TO_SHIP_DATE">
expj.KU0050010.KU0050010form1.TO_SHIP_DATE = {};
expj.KU0050010.KU0050010form1.TO_SHIP_DATE.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/TO_SHIP_DATE.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.TO_SHIP_DATE.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-TO_SHIP_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0050010', 'KU0050010form1', 'TO_SHIP_DATE', this);
  });
  expj.KU0050010.KU0050010form1.TO_SHIP_DATE.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.TO_SHIP_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/TO_SHIP_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-TO_SHIP_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0050010-KU0050010form1-TO_SHIP_DATE" name="TO_SHIP_DATE" class="KU0050010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0050010Struct.getTO_SHIP_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-CalendarShipDateTo">
expj.KU0050010.KU0050010form1.CalendarShipDateTo = {};
// script1="onClick;0;CALENDAR;_KU0050010form1/TO_SHIP_DATE"
expj.KU0050010.KU0050010form1.CalendarShipDateTo.onClick0 = function () {
  console.log('CalendarShipDateTo script1');
expj.common.pscript.executeCalendar('KU0050010','KU0050010form1','_KU0050010form1/TO_SHIP_DATE');
};
expj.KU0050010.KU0050010form1.CalendarShipDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0050010.KU0050010form1.CalendarShipDateTo['onClick' + i])) {
        expj.KU0050010.KU0050010form1.CalendarShipDateTo['onClick' + i]();
      }
    }
  }
};
expj.KU0050010.KU0050010form1.CalendarShipDateTo.executeAllOnDecision = function () {
};
expj.KU0050010.KU0050010form1.CalendarShipDateTo.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-CalendarShipDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010form1', 'CalendarShipDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0050010','KU0050010form1','_KU0050010form1/TO_SHIP_DATE');
  expj.KU0050010.KU0050010form1.CalendarShipDateTo.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.CalendarShipDateTo.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/CalendarShipDateTo.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-CalendarShipDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0050010-KU0050010form1-CalendarShipDateTo" class="KU0050010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-c_USER">
expj.KU0050010.KU0050010form1.c_USER = {};
expj.KU0050010.KU0050010form1.c_USER.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/c_USER.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.c_USER.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-c_USER').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010form1', 'c_USER', this, 'CheckBox');
    }
  });
  expj.KU0050010.KU0050010form1.c_USER.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.c_USER.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/c_USER.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-c_USER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;"><input type="checkbox" name="c_USER" value="true" <%= ("true".equals(TypeConverter.convert(aKU0050010Struct.getc_USER())) || "1".equals(TypeConverter.convert(aKU0050010Struct.getc_USER())))?"checked=\"checked\"":"" %>  class="KU0050010-focus-move" id="expj-KU0050010-KU0050010form1-c_USER"><label for="expj-KU0050010-KU0050010form1-c_USER"><%=CoreTools.getRBString("Expj.Cmt0499",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ODR_NO",rb)%></span><!-- 得意先注文番号 --></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-IN_CUST_ODR_NO">
expj.KU0050010.KU0050010form1.IN_CUST_ODR_NO = {};
expj.KU0050010.KU0050010form1.IN_CUST_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/IN_CUST_ODR_NO.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.IN_CUST_ODR_NO.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-IN_CUST_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0050010', 'KU0050010form1', 'IN_CUST_ODR_NO', this);
  });
  expj.KU0050010.KU0050010form1.IN_CUST_ODR_NO.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.IN_CUST_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/IN_CUST_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-IN_CUST_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0050010-KU0050010form1-IN_CUST_ODR_NO" name="IN_CUST_ODR_NO" class="KU0050010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKU0050010Struct.getIN_CUST_ODR_NO()) %>" maxlength="35" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<div class="div-td" style="width:80px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-IN_LOT_NO">
expj.KU0050010.KU0050010form1.IN_LOT_NO = {};
expj.KU0050010.KU0050010form1.IN_LOT_NO.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/IN_LOT_NO.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.IN_LOT_NO.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-IN_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0050010', 'KU0050010form1', 'IN_LOT_NO', this);
  });
  expj.KU0050010.KU0050010form1.IN_LOT_NO.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.IN_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/IN_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-IN_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0050010-KU0050010form1-IN_LOT_NO" name="IN_LOT_NO" class="KU0050010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKU0050010Struct.getIN_LOT_NO()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010form1-PeekerIN_LOT_CD">
expj.KU0050010.KU0050010form1.PeekerIN_LOT_CD = {};
// script1="onClick;0;PEEKER;_KU0050010form1/IN_LOT_NO@<%=contextNo%>"
expj.KU0050010.KU0050010form1.PeekerIN_LOT_CD.onClick0 = function () {
  console.log('PeekerIN_LOT_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0050010';
var parameterValues = 'PeekerIN_LOT_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/IN_LOT_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010form1', '_KU0050010form1/IN_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%LOT_NO_16%&%';
parameterValues += 'TARGET_FIELD%=%_KU0050010form1/IN_LOT_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0050010.KU0050010form1.PeekerIN_LOT_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0050010.KU0050010form1.PeekerIN_LOT_CD['onClick' + i])) {
        expj.KU0050010.KU0050010form1.PeekerIN_LOT_CD['onClick' + i]();
      }
    }
  }
};
expj.KU0050010.KU0050010form1.PeekerIN_LOT_CD.executeAllOnDecision = function () {
};
expj.KU0050010.KU0050010form1.PeekerIN_LOT_CD.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-PeekerIN_LOT_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010form1', 'PeekerIN_LOT_CD', this, 'Button');
    }
  });
  expj.KU0050010.KU0050010form1.PeekerIN_LOT_CD.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.PeekerIN_LOT_CD.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/PeekerIN_LOT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-PeekerIN_LOT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0050010-KU0050010form1-PeekerIN_LOT_CD" class="KU0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<div class="div-td" style="width:80px;"></div><!--/td-->
<input type="hidden" id="expj-KU0050010-KU0050010form1-h_LOTCTRL" name="h_LOTCTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0050010Struct.geth_LOTCTRL()) %>">
<script class="expj-script-KU0050010-KU0050010form1-h_LOTCTRL">
expj.KU0050010.KU0050010form1.h_LOTCTRL = {};
expj.KU0050010.KU0050010form1.h_LOTCTRL.executeAllOnDecision = function () {
  console.log('execute KU0050010form1/h_LOTCTRL.onDecision');
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
  expj.KU0050010.executeAllOnDecision();
};
expj.KU0050010.KU0050010form1.h_LOTCTRL.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010form1-h_LOTCTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0050010', 'KU0050010form1', 'h_LOTCTRL', this);
  });
  expj.KU0050010.KU0050010form1.h_LOTCTRL.executePScriptOnLoad();
};

expj.KU0050010.KU0050010form1.h_LOTCTRL.executePScriptOnLoad = function () {
  console.log('execute KU0050010form1/h_LOTCTRL.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010form1-h_LOTCTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KU0050010-KU0050010button1">
expj.KU0050010.KU0050010button1 = {};
expj.KU0050010.KU0050010button1.executeAllOnDecision = function () {
  console.log('execute KU0050010button1.onDecision');
};
expj.KU0050010.KU0050010button1.executeOnLoad = function () {
  expj.KU0050010.KU0050010button1.executePScriptOnLoad();
};

expj.KU0050010.KU0050010button1.executePScriptOnLoad = function () {
  console.log('execute KU0050010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0050010-KU0050010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0050010-KU0050010button1-Select">
expj.KU0050010.KU0050010button1.Select = {};
// script1="onClick;0;CHK;_KU0050010form1/FROM_SEARCH_DATE[neq][and]_KU0050010form1/TO_SEARCH_DATE[neq][and]_KU0050010form1/TO_SEARCH_DATE[lt]_KU0050010form1/FROM_SEARCH_DATE@!KU01004"
expj.KU0050010.KU0050010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010button1', '_KU0050010form1/FROM_SEARCH_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010button1', '_KU0050010form1/TO_SEARCH_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010button1', '_KU0050010form1/TO_SEARCH_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010button1', '_KU0050010form1/FROM_SEARCH_DATE')))) {
expj.common.pscript.viewErrorMessage('KU0050010', 'KU0050010button1', 'KU01004');
}
};
// script2="onClick;1;CHK;_KU0050010form1/FROM_SHIP_DATE[neq][and]_KU0050010form1/TO_SHIP_DATE[neq][and]_KU0050010form1/TO_SHIP_DATE[lt]_KU0050010form1/FROM_SHIP_DATE@!KU10102"
expj.KU0050010.KU0050010button1.Select.onClick1 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010button1', '_KU0050010form1/FROM_SHIP_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010button1', '_KU0050010form1/TO_SHIP_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010button1', '_KU0050010form1/TO_SHIP_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0050010', 'KU0050010button1', '_KU0050010form1/FROM_SHIP_DATE')))) {
expj.common.pscript.viewErrorMessage('KU0050010', 'KU0050010button1', 'KU10102');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0050010form1/*@KU0050010Servlet"
expj.KU0050010.KU0050010button1.Select.onClick2 = function () {
  console.log('Select script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0050010', 'KU0050010button1', '_KU0050010form1/*', 'KU0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0050010', response);
expj.common.updateBusinessScreenTab('KU0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KU0050010.KU0050010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0050010.KU0050010button1.Select['onClick' + i])) {
        expj.KU0050010.KU0050010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KU0050010.KU0050010button1.Select.executeAllOnDecision = function () {
};
expj.KU0050010.KU0050010button1.Select.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010button1', 'Select', this, 'Button');
    }
  });
  expj.KU0050010.KU0050010button1.Select.executePScriptOnLoad();
};

expj.KU0050010.KU0050010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KU0050010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0050010-KU0050010button1-Select" name="Select" class="KU0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段一覧用のDataGridを配置する。↓ --><script class="expj-script-KU0050010-KU0050010view1">
expj.KU0050010.KU0050010view1 = {};
expj.KU0050010.KU0050010view1.executeAllOnClick = function () {
};
expj.KU0050010.KU0050010view1.executeAllOnDecision = function () {
  console.log('execute KU0050010view1.onDecision');
};
expj.KU0050010.KU0050010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KU0050010view1", "expj.KU0050010.KU0050010view1.executeAllOnClick");
%>
  expj.KU0050010.KU0050010view1.executePScriptOnLoad();
};

expj.KU0050010.KU0050010view1.executePScriptOnLoad = function () {
  console.log('execute KU0050010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KU0050010-KU0050010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%=TypeConverter.sanitizer(aKU0050010Control.getReadStatus())%>"></div>
<!-- VIEW END -->
<%
 String KU0050010view1_Id = "KU0050010view1";
 String KU0050010view1_select = "single";
 String KU0050010view1_sortable = "true";
 String KU0050010view1_resize = "true";
 String KU0050010view1_scroll = "true";
 StringBuffer KU0050010view1_HB = new StringBuffer();
 StringBuffer KU0050010view1_DB = new StringBuffer();
%>
<%
 KU0050010view1_select = "single";
 KU0050010view1_sortable = "true";
 KU0050010view1_resize = "true";
 KU0050010view1_scroll = "true";
%>
<%
 KU0050010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
%>
     
<%
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CD",rb))).append("', 'name':'CUST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb))).append("', 'name':'CUST_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_SHIP_DATE",rb))).append("', 'name':'SHIP_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_DATE",rb))).append("', 'name':'T_SHIP_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ODR_NO",rb))).append("', 'name':'CUST_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SLIP_CD",rb))).append("', 'name':'SLIP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_ODR_NO",rb))).append("', 'name':'SHIP_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUS_DLV_KEY_CD",rb))).append("', 'name':'DLV_KEY_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.QTY",rb))).append("', 'name':'SHIP_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD",rb))).append("', 'name':'ALLCT_WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME",rb))).append("', 'name':'WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_ORD_CD",rb))).append("', 'name':'ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PART_DLV_SEQ_NO",rb))).append("', 'name':'PART_DLV_SEQ_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEPO_TYP",rb))).append("', 'name':'DEPO_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_NAME",rb))).append("', 'name':'CUST_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_NAME",rb))).append("', 'name':'CUST_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_LOT_CD",rb))).append("', 'name':'LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'170px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REFERENCE",rb))).append("', 'name':'REMARKS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_SHIP_ITEM_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
KU0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_INV_LOT_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KU0050010view1_sortable).append("}").append(",");
%>
<%
 int aKU0050010StructLength = aKU0050010Control.getListsize();
 final KU0050010Struct structBackup = aKU0050010Struct;
 aKU0050010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKU0050010StructLength; ++loopCount) {
  if((aKU0050010Struct = (KU0050010Struct) aKU0050010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKU0050010Struct", aKU0050010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KU0050010view1_DB.append("[");
 KU0050010view1_DB.append(loopCount);
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-CUST_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-CUST_CD\" data-name=\"CUST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getCUST_CD())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getITEM_CD())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getITEM_NAME())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getJOB_ODR_CD())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-CUST_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-CUST_ITEM_CD\" data-name=\"CUST_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getCUST_ITEM_CD())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-SHIP_DATE-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-SHIP_DATE\" data-name=\"SHIP_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getSHIP_DATE())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-T_SHIP_DATE-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-T_SHIP_DATE\" data-name=\"T_SHIP_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getT_SHIP_DATE())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-CUST_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-CUST_ODR_NO\" data-name=\"CUST_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getCUST_ODR_NO())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-SLIP_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-SLIP_CD\" data-name=\"SLIP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getSLIP_CD())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-SHIP_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-SHIP_ODR_NO\" data-name=\"SHIP_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getSHIP_ODR_NO())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-DLV_KEY_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-DLV_KEY_NO\" data-name=\"DLV_KEY_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getDLV_KEY_NO())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-SHIP_QTY-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-SHIP_QTY\" data-name=\"SHIP_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aKU0050010Struct.getSHIP_QTY())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-UNIT-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-UNIT\" data-name=\"UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getUNIT())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-ALLCT_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-ALLCT_WH_CD\" data-name=\"ALLCT_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getALLCT_WH_CD())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-WH_NAME\" data-name=\"WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getWH_NAME())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-ODR_NO\" data-name=\"ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getODR_NO())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-PART_DLV_SEQ_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-PART_DLV_SEQ_NO\" data-name=\"PART_DLV_SEQ_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getPART_DLV_SEQ_NO())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-DEPO_TYP-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-DEPO_TYP\" data-name=\"DEPO_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getDEPO_TYP())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-CUST_NAME-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-CUST_NAME\" data-name=\"CUST_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getCUST_NAME())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-CUST_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-CUST_ITEM_NAME\" data-name=\"CUST_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getCUST_ITEM_NAME())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-LOT_NO\" data-name=\"LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getLOT_NO())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-REMARKS-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-REMARKS\" data-name=\"REMARKS\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getREMARKS())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-l_SHIP_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-l_SHIP_ITEM_CD\" data-name=\"l_SHIP_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getl_SHIP_ITEM_CD())).append("</span>'");
 KU0050010view1_DB.append(",").append("'<span id=\"expj-KU0050010-KU0050010view1-l_INV_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0050010-KU0050010view1-l_INV_LOT_NO\" data-name=\"l_INV_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0050010Struct.getl_INV_LOT_NO())).append("</span>'");
 KU0050010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKU0050010StructLength) {
   KU0050010view1_DB.append(",");
  }
 }
 aKU0050010Struct = structBackup;
 viewIdList.add(KU0050010view1_Id);
 viewSelectList.add(KU0050010view1_select);
 viewResizeList.add(KU0050010view1_resize);
 viewScrollList.add(KU0050010view1_scroll);
 viewHeaderDataList.add(KU0050010view1_HB);
 viewBodyDataList.add(KU0050010view1_DB);
%>
<%
}
%>
<!-- ここに下段一覧用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame18 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KU0050010-KU0050010button2">
expj.KU0050010.KU0050010button2 = {};
expj.KU0050010.KU0050010button2.executeAllOnDecision = function () {
  console.log('execute KU0050010button2.onDecision');
};
expj.KU0050010.KU0050010button2.executeOnLoad = function () {
  expj.KU0050010.KU0050010button2.executePScriptOnLoad();
};

expj.KU0050010.KU0050010button2.executePScriptOnLoad = function () {
  console.log('execute KU0050010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0050010-KU0050010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0050010-KU0050010button2-SelectLotTraceRef">
expj.KU0050010.KU0050010button2.SelectLotTraceRef = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_KU0050010view1/+@AG0070010Servlet,<%=contextNo%>,<%=suAG0070.getScreenName()%>,<%=suAG0070.getScreenID()%>"
expj.KU0050010.KU0050010button2.SelectLotTraceRef.onClick0 = function () {
  console.log('SelectLotTraceRef script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0050010', 'KU0050010button2', '_KU0050010view1/+', 'AG0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=suAG0070.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AG0070010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AG0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=suAG0070.getScreenName()%>', contents, 'KU0050010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KU0050010.KU0050010button2.SelectLotTraceRef.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0050010.KU0050010button2.SelectLotTraceRef['onClick' + i])) {
        expj.KU0050010.KU0050010button2.SelectLotTraceRef['onClick' + i]();
      }
    }
  }
};
expj.KU0050010.KU0050010button2.SelectLotTraceRef.executeAllOnDecision = function () {
};
expj.KU0050010.KU0050010button2.SelectLotTraceRef.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010button2-SelectLotTraceRef').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010button2', 'SelectLotTraceRef', this, 'Button');
    }
  });
  expj.KU0050010.KU0050010button2.SelectLotTraceRef.executePScriptOnLoad();
};

expj.KU0050010.KU0050010button2.SelectLotTraceRef.executePScriptOnLoad = function () {
  console.log('execute KU0050010button2/SelectLotTraceRef.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010button2-SelectLotTraceRef');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0050010-KU0050010button2-SelectLotTraceRef" name="SelectLotTraceRef" class="KU0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLotTraceRef",rb)%></button><!-- ロットトレース参照ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame21 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame20" style="width:12px;"></div><!--/td-->
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
<span class="version">KU0050010 Revision: 1.8  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KU0050010-KU0050010button0">
expj.KU0050010.KU0050010button0 = {};
expj.KU0050010.KU0050010button0.executeAllOnDecision = function () {
  console.log('execute KU0050010button0.onDecision');
};
expj.KU0050010.KU0050010button0.executeOnLoad = function () {
  expj.KU0050010.KU0050010button0.executePScriptOnLoad();
};

expj.KU0050010.KU0050010button0.executePScriptOnLoad = function () {
  console.log('execute KU0050010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0050010-KU0050010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0050010-KU0050010button0-Clear">
expj.KU0050010.KU0050010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KU0050010Servlet,,$ZZ07008"
expj.KU0050010.KU0050010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0050010', 'KU0050010button0', '', 'KU0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0050010', response);
expj.common.updateBusinessScreenTab('KU0050010', contents);
};
expj.common.pscript.callConfirm('KU0050010', 'KU0050010button0', 'ZZ07008', okEvent);
};
expj.KU0050010.KU0050010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0050010.KU0050010button0.Clear['onClick' + i])) {
        expj.KU0050010.KU0050010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KU0050010.KU0050010button0.Clear.executeAllOnDecision = function () {
};
expj.KU0050010.KU0050010button0.Clear.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010button0', 'Clear', this, 'Button');
    }
  });
  expj.KU0050010.KU0050010button0.Clear.executePScriptOnLoad();
};

expj.KU0050010.KU0050010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KU0050010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0050010-KU0050010button0-Clear" name="Clear" class="KU0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KU0050010-KU0050010button0-Close">
expj.KU0050010.KU0050010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KU0050010.KU0050010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KU0050010');
};
expj.KU0050010.KU0050010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0050010.KU0050010button0.Close['onClick' + i])) {
        expj.KU0050010.KU0050010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KU0050010.KU0050010button0.Close.executeAllOnDecision = function () {
};
expj.KU0050010.KU0050010button0.Close.executeOnLoad = function () {
  $('#expj-KU0050010-KU0050010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0050010', 'KU0050010button0', 'Close', this, 'Button');
    }
  });
  expj.KU0050010.KU0050010button0.Close.executePScriptOnLoad();
};

expj.KU0050010.KU0050010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KU0050010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KU0050010-KU0050010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0050010-KU0050010button0-Close" name="Close" class="KU0050010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KU0050010 (END)-->
<%
MessageStruct msgStruct = aKU0050010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KU0050010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KU0050010)) {
  expj.common.treeInstanceMap.KU0050010 = {};
}
expj.common.treeInstanceMap.KU0050010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0050010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KU0050010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0050010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KU0050010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KU0050010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KU0050010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KU0050010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KU0050010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KU0050010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KU0050010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0050010)) {
  expj.common.detailDialogMap.KU0050010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0050010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KU0050010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0050010.<%=detailId %>)) {
  expj.common.detailDialogMap.KU0050010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0050010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KU0050010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0050010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KU0050010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KU0050010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KU0050010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KU0050010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KU0050010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KU0050010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KU0050010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KU0050010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KU0050010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KU0050010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KU0050010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KU0050010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KU0050010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KU0050010)) {
  expj.common.viewInstanceMap.KU0050010 = {};
}
expj.common.viewInstanceMap.KU0050010.<%=viewId %> = {};
expj.common.viewInstanceMap.KU0050010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KU0050010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KU0050010.<%=viewId %>.init = function () {
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
    expj.KU0050010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KU0050010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KU0050010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KU0050010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KU0050010_init">
/**
 * KU0050010用のロード完了時初期化関数
 */
expj.KU0050010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KU0050010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KU0050010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KU0050010');
  expj.common.calendarInstanceMap.KU0050010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KU0050010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KU0050010.<%=detailId %>.init();
  expj.common.detailDialogMap.KU0050010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KU0050010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KU0050010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KU0050010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KU0050010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KU0050010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KU0050010-<%=detailId %>');
<%
 }
%>
  try{expj.KU0050010.KU0050010form1.IN_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.PeekerIN_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.r_SEL_PTN3.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.IN_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.PeekerIN_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.r_SEL_PTN1.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.IN_CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.r_SEL_PTN2.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.r_SEL_PTN.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.FROM_SEARCH_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.CalendarSearchFrom.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.TO_SEARCH_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.CalendarSearchTo.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.r_SEL_PTN4.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.FROM_SHIP_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.CalendarShipDateFrom.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.TO_SHIP_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.CalendarShipDateTo.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.c_USER.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.IN_CUST_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.IN_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.PeekerIN_LOT_CD.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.h_LOTCTRL.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010button2.SelectLotTraceRef.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010form1.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010button1.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010view1.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010button2.executeOnLoad();}catch(e){};
  try{expj.KU0050010.KU0050010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KU0050010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KU0050010', 'KU0050010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KU0050010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KU0050010-focus-move');
  // 初期フォーカス当てる処理
  $('.KU0050010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KU0050010', '<%=request.getContextPath() %>');
};

/**
 * KU0050010の全体onDecision処理
 */
expj.KU0050010.executeAllOnDecision = function () {
  expj.KU0050010.KU0050010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KU0050010_console">
expj.KU0050010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>