<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 13:02:39 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KU0060\KU0060010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KU0060.*" %>
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
<jsp:useBean id="aKU0060010Control" class="com.nec.jp.orteus.metamorBase.KU0060.KU0060010Control" scope="request"/>
<jsp:useBean id="aKU0060010Struct" class="com.nec.jp.orteus.metamorBase.KU0060.KU0060010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

出荷指示一括メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0060/jsp/KU0060010.jsp,v $
$Author: geng-jia $	
$Revision: 1.23 $　$Date: 2017/02/22 02:07:29 $
********************************************************* --%>
<html>
<head>
<title>出荷指示一括メンテナンス</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("KU0010010Servlet", so);
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
<script class="expj-script-KU0060010_init">
  // KU0060010名前空間
  expj.KU0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-KU0060010" data-screen="KU0060010" data-newdata="<%=aKU0060010Control.isNewData() %>">
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
              <script class="expj-script-KU0060010-KU0060010form1">
expj.KU0060010.KU0060010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.KU0060010.KU0060010form1.onLoad0 = function () {
  console.log('KU0060010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;?KU0060010view1/?[neq]NOT_SELECTED@*0,*12"
expj.KU0060010.KU0060010form1.onDecision0 = function () {
  console.log('KU0060010form1 script2');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?KU0060010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script3="child;0;CHK;_r1_SHIP_ODR[eq]true@*1,*8"
expj.KU0060010.KU0060010form1.child0 = function () {
  console.log('KU0060010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '_r1_SHIP_ODR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script4="child;1;CHK;?ODR_NO[eq]SAME[and]?ITEM_CD[eq]SAME[and]?DESINATED_DLV_DATE[eq]SAME[and]?DESINATED_SHIP_DATE[eq]SAME[and]?CUST_ODR_NO[eq]SAME[and]?CUST_CD[eq]SAME[and]?CUST_ITEM_CD[eq]SAME[and]?CUST_CHRG_PSN_CD[eq]SAME[and]?SLIP_CD[eq]SAME[and]?r1_SHIP_ODR[eq]SAME[and]?r2_SHIP_ODR[eq]SAME[and]?KU0060010form1/*[eq]NORMAL@*2"
expj.KU0060010.KU0060010form1.child1 = function () {
  console.log('KU0060010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?DESINATED_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?DESINATED_SHIP_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_CHRG_PSN_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?SLIP_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?r1_SHIP_ODR'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?r2_SHIP_ODR'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?KU0060010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script5="child;2;CHK;?KU0060010view1/?[eq]SINGLE@*3,*4"
expj.KU0060010.KU0060010form1.child2 = function () {
  console.log('KU0060010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?KU0060010view1/?'), '[eq]', 'SINGLE')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;3;UNMASK;_KU0060010button2/ScrmvToShipDir,_KU0060010button2/Insert,_KU0060010button2/CheckAll,_KU0060010button2/CheckAllClear,_KU0060010button2/CheckAllStock,_KU0060010button2/CheckAllStockClear@*6"
expj.KU0060010.KU0060010form1.child3 = function () {
  console.log('KU0060010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/ScrmvToShipDir');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/Insert');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllClear');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllStock');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllStockClear');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script7="child;4;CHKRQ;?KU0060010view1/?[eq]MULTI@*5"
expj.KU0060010.KU0060010form1.child4 = function () {
  console.log('KU0060010form1 script7');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?KU0060010view1/?'), '[eq]', 'MULTI'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;5;UNMASK;_KU0060010button2/Insert,_KU0060010button2/CheckAll,_KU0060010button2/CheckAllClear,_KU0060010button2/CheckAllStock,_KU0060010button2/CheckAllStockClear@*7"
expj.KU0060010.KU0060010form1.child5 = function () {
  console.log('KU0060010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/Insert');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllClear');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllStock');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllStockClear');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script9="child;6;MASK;_KU0060010button2/Delete"
expj.KU0060010.KU0060010form1.child6 = function () {
  console.log('KU0060010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/Delete');
};
// script10="child;7;MASK;_KU0060010button2/ScrmvToShipDir,_KU0060010button2/Delete"
expj.KU0060010.KU0060010form1.child7 = function () {
  console.log('KU0060010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/ScrmvToShipDir');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/Delete');
};
// script11="child;8;CHK;_r2_SHIP_ODR[eq]true@*9"
expj.KU0060010.KU0060010form1.child8 = function () {
  console.log('KU0060010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '_r2_SHIP_ODR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script12="child;9;CHK;?ODR_NO[eq]SAME[and]?ITEM_CD[eq]SAME[and]?DESINATED_DLV_DATE[eq]SAME[and]?DESINATED_SHIP_DATE[eq]SAME[and]?CUST_ODR_NO[eq]SAME[and]?CUST_CD[eq]SAME[and]?CUST_ITEM_CD[eq]SAME[and]?CUST_CHRG_PSN_CD[eq]SAME[and]?SLIP_CD[eq]SAME[and]?r1_SHIP_ODR[eq]SAME[and]?r2_SHIP_ODR[eq]SAME[and]?KU0060010form1/*[eq]NORMAL@*10"
expj.KU0060010.KU0060010form1.child9 = function () {
  console.log('KU0060010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?DESINATED_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?DESINATED_SHIP_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_CHRG_PSN_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?SLIP_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?r1_SHIP_ODR'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?r2_SHIP_ODR'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?KU0060010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script13="child;10;UNMASK;_KU0060010button2/Delete,_KU0060010button2/CheckAll,_KU0060010button2/CheckAllClear@*11"
expj.KU0060010.KU0060010form1.child10 = function () {
  console.log('KU0060010form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/Delete');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllClear');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script14="child;11;MASK;_KU0060010view1/l_DESINATED_SHIP_DATE,_KU0060010view1/l_SHIP_QTY,_KU0060010view1/l_c_DIRECT_DLV_FLG,_KU0060010button2/ScrmvToShipDir,_KU0060010button2/Insert,_KU0060010button2/CheckAllStock,_KU0060010button2/CheckAllStockClear"
expj.KU0060010.KU0060010form1.child11 = function () {
  console.log('KU0060010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010view1/l_DESINATED_SHIP_DATE');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010view1/l_SHIP_QTY');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010view1/l_c_DIRECT_DLV_FLG');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/ScrmvToShipDir');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/Insert');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllStock');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllStockClear');
};
// script15="child;12;CHK;_r1_SHIP_ODR[eq]true@*13,*17"
expj.KU0060010.KU0060010form1.child12 = function () {
  console.log('KU0060010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '_r1_SHIP_ODR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script16="child;13;CHK;?ODR_NO[eq]SAME[and]?ITEM_CD[eq]SAME[and]?DESINATED_DLV_DATE[eq]SAME[and]?DESINATED_SHIP_DATE[eq]SAME[and]?CUST_ODR_NO[eq]SAME[and]?CUST_CD[eq]SAME[and]?CUST_ITEM_CD[eq]SAME[and]?CUST_CHRG_PSN_CD[eq]SAME[and]?SLIP_CD[eq]SAME[and]?r1_SHIP_ODR[eq]SAME[and]?r2_SHIP_ODR[eq]SAME[and]?KU0060010form1/*[eq]NORMAL@*14,*16"
expj.KU0060010.KU0060010form1.child13 = function () {
  console.log('KU0060010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?DESINATED_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?DESINATED_SHIP_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_CHRG_PSN_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?SLIP_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?r1_SHIP_ODR'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?r2_SHIP_ODR'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?KU0060010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script17="child;14;UNMASK;_KU0060010button2/CheckAll,_KU0060010button2/CheckAllClear,_KU0060010button2/CheckAllStock,_KU0060010button2/CheckAllStockClear@*15"
expj.KU0060010.KU0060010form1.child14 = function () {
  console.log('KU0060010form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllClear');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllStock');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllStockClear');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child15)){this.child15();}}
};
// script18="child;15;MASK;_KU0060010form1/SLIP_CD,_KU0060010button2/ScrmvToShipDir,_KU0060010button2/Insert,_KU0060010button2/Delete"
expj.KU0060010.KU0060010form1.child15 = function () {
  console.log('KU0060010form1 script18');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010form1/SLIP_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/ScrmvToShipDir');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/Insert');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/Delete');
};
// script19="child;16;MASK;_KU0060010form1/SLIP_CD,_KU0060010button2/ScrmvToShipDir,_KU0060010button2/Insert,_KU0060010button2/Delete,_KU0060010button2/CheckAll,_KU0060010button2/CheckAllClear,_KU0060010button2/CheckAllStock,_KU0060010button2/CheckAllStockClear"
expj.KU0060010.KU0060010form1.child16 = function () {
  console.log('KU0060010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010form1/SLIP_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/ScrmvToShipDir');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/Insert');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/Delete');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllClear');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllStock');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllStockClear');
};
// script20="child;17;CHK;_r2_SHIP_ODR[eq]true@*18"
expj.KU0060010.KU0060010form1.child17 = function () {
  console.log('KU0060010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '_r2_SHIP_ODR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script21="child;18;CHK;?ODR_NO[eq]SAME[and]?ITEM_CD[eq]SAME[and]?DESINATED_DLV_DATE[eq]SAME[and]?DESINATED_SHIP_DATE[eq]SAME[and]?CUST_ODR_NO[eq]SAME[and]?CUST_CD[eq]SAME[and]?CUST_ITEM_CD[eq]SAME[and]?CUST_CHRG_PSN_CD[eq]SAME[and]?SLIP_CD[eq]SAME[and]?r1_SHIP_ODR[eq]SAME[and]?r2_SHIP_ODR[eq]SAME[and]?KU0060010form1/*[eq]NORMAL@*19,*21"
expj.KU0060010.KU0060010form1.child18 = function () {
  console.log('KU0060010form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?DESINATED_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?DESINATED_SHIP_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?CUST_CHRG_PSN_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?SLIP_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?r1_SHIP_ODR'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?r2_SHIP_ODR'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010form1', '?KU0060010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script22="child;19;UNMASK;_KU0060010form1/SLIP_CD,_KU0060010button2/CheckAll,_KU0060010button2/CheckAllClear@*20"
expj.KU0060010.KU0060010form1.child19 = function () {
  console.log('KU0060010form1 script22');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010form1/SLIP_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllClear');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child20)){this.child20();}}
};
// script23="child;20;MASK;_KU0060010button2/ScrmvToShipDir,_KU0060010button2/Insert,_KU0060010button2/Delete,_KU0060010button2/CheckAllStock,_KU0060010button2/CheckAllStockClear"
expj.KU0060010.KU0060010form1.child20 = function () {
  console.log('KU0060010form1 script23');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/ScrmvToShipDir');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/Insert');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/Delete');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllStock');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllStockClear');
};
// script24="child;21;MASK;_KU0060010button2/ScrmvToShipDir,_KU0060010button2/Insert,_KU0060010button2/Delete,_KU0060010button2/CheckAll,_KU0060010button2/CheckAllClear,_KU0060010button2/CheckAllStock,_KU0060010button2/CheckAllStockClear"
expj.KU0060010.KU0060010form1.child21 = function () {
  console.log('KU0060010form1 script24');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/ScrmvToShipDir');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/Insert');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/Delete');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllClear');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllStock');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010button2/CheckAllStockClear');
};
expj.KU0060010.KU0060010form1.executeAllOnDecision = function () {
  console.log('execute KU0060010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010form1['onDecision' + i])) {
        expj.KU0060010.KU0060010form1['onDecision' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010form1.executeOnLoad = function () {
  expj.KU0060010.KU0060010form1.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KU0060010.KU0060010form1['onLoad' + i])) {
      expj.KU0060010.KU0060010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0060010-KU0060010form1" action="KU0060010Servlet" name="KU0060010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKU0060010Control.getReadStatusString()) %>" style="height:211px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:211px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_ODR_CD",rb)%></span><!-- 受注番号 --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010form1-ODR_NO">
expj.KU0060010.KU0060010form1.ODR_NO = {};
expj.KU0060010.KU0060010form1.ODR_NO.executeAllOnDecision = function () {
  console.log('execute KU0060010form1/ODR_NO.onDecision');
  expj.KU0060010.KU0060010form1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010form1.ODR_NO.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010form1-ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0060010', 'KU0060010form1', 'ODR_NO', this);
  });
  expj.KU0060010.KU0060010form1.ODR_NO.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1/ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010form1-ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0060010-KU0060010form1-ODR_NO" name="ODR_NO" class="KU0060010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKU0060010Struct.getODR_NO()) %>" maxlength="15" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010form1-r1_SHIP_ODR">
expj.KU0060010.KU0060010form1.r1_SHIP_ODR = {};
// script1="onClick;0;SET;_KU0060010form1/SLIP_CD="
expj.KU0060010.KU0060010form1.r1_SHIP_ODR.onClick0 = function () {
  console.log('r1_SHIP_ODR script1');
expj.common.pscript.setReferenceComponentValue('KU0060010', 'KU0060010form1', '_KU0060010form1/SLIP_CD', '');
};
// script2="onClick;1;MASK;_KU0060010form1/SLIP_CD"
expj.KU0060010.KU0060010form1.r1_SHIP_ODR.onClick1 = function () {
  console.log('r1_SHIP_ODR script2');
expj.common.pscript.setMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010form1/SLIP_CD');
};
expj.KU0060010.KU0060010form1.r1_SHIP_ODR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010form1.r1_SHIP_ODR['onClick' + i])) {
        expj.KU0060010.KU0060010form1.r1_SHIP_ODR['onClick' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010form1.r1_SHIP_ODR.executeAllOnDecision = function () {
  console.log('execute KU0060010form1/r1_SHIP_ODR.onDecision');
  expj.KU0060010.KU0060010form1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010form1.r1_SHIP_ODR.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010form1-r1_SHIP_ODR').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010form1', 'r1_SHIP_ODR', this, 'RadioButton');
    }
  });
  expj.KU0060010.KU0060010form1.r1_SHIP_ODR.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.r1_SHIP_ODR.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1/r1_SHIP_ODR.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010form1-r1_SHIP_ODR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="radio" name="SHIP_ODR" data-name="r1_SHIP_ODR" value="true" <%= ("true".equals(TypeConverter.convert(aKU0060010Struct.getr1_SHIP_ODR())) || "".equals(TypeConverter.convert(aKU0060010Struct.getr1_SHIP_ODR())))?"checked=\"checked\"": "" %> class="" id="expj-KU0060010-KU0060010form1-r1_SHIP_ODR" ><label for="expj-KU0060010-KU0060010form1-r1_SHIP_ODR"><%=CoreTools.getRBString("Expj.Cmt0478",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010form1-ITEM_CD">
expj.KU0060010.KU0060010form1.ITEM_CD = {};
expj.KU0060010.KU0060010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KU0060010form1/ITEM_CD.onDecision');
  expj.KU0060010.KU0060010form1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0060010', 'KU0060010form1', 'ITEM_CD', this);
  });
  expj.KU0060010.KU0060010form1.ITEM_CD.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0060010-KU0060010form1-ITEM_CD" name="ITEM_CD" class="KU0060010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKU0060010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010form1-r2_SHIP_ODR">
expj.KU0060010.KU0060010form1.r2_SHIP_ODR = {};
// script1="onClick;0;UNMASK;_KU0060010form1/SLIP_CD"
expj.KU0060010.KU0060010form1.r2_SHIP_ODR.onClick0 = function () {
  console.log('r2_SHIP_ODR script1');
expj.common.pscript.setUnMaskToReferenceComponent('KU0060010', 'KU0060010form1', '_KU0060010form1/SLIP_CD');
};
expj.KU0060010.KU0060010form1.r2_SHIP_ODR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010form1.r2_SHIP_ODR['onClick' + i])) {
        expj.KU0060010.KU0060010form1.r2_SHIP_ODR['onClick' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010form1.r2_SHIP_ODR.executeAllOnDecision = function () {
  console.log('execute KU0060010form1/r2_SHIP_ODR.onDecision');
  expj.KU0060010.KU0060010form1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010form1.r2_SHIP_ODR.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010form1-r2_SHIP_ODR').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010form1', 'r2_SHIP_ODR', this, 'RadioButton');
    }
  });
  expj.KU0060010.KU0060010form1.r2_SHIP_ODR.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.r2_SHIP_ODR.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1/r2_SHIP_ODR.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010form1-r2_SHIP_ODR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="radio" name="SHIP_ODR" data-name="r2_SHIP_ODR" value="true" <%= ("true".equals(TypeConverter.convert(aKU0060010Struct.getr2_SHIP_ODR())))?"checked=\"checked\"":"" %> class="" id="expj-KU0060010-KU0060010form1-r2_SHIP_ODR" ><label for="expj-KU0060010-KU0060010form1-r2_SHIP_ODR"><%=CoreTools.getRBString("Expj.Cmt0456",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)%></span><!-- 指定納期 --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010form1-DESINATED_DLV_DATE">
expj.KU0060010.KU0060010form1.DESINATED_DLV_DATE = {};
expj.KU0060010.KU0060010form1.DESINATED_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KU0060010form1/DESINATED_DLV_DATE.onDecision');
  expj.KU0060010.KU0060010form1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010form1.DESINATED_DLV_DATE.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010form1-DESINATED_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0060010', 'KU0060010form1', 'DESINATED_DLV_DATE', this);
  });
  expj.KU0060010.KU0060010form1.DESINATED_DLV_DATE.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.DESINATED_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1/DESINATED_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010form1-DESINATED_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0060010-KU0060010form1-DESINATED_DLV_DATE" name="DESINATED_DLV_DATE" class="KU0060010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0060010Struct.getDESINATED_DLV_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010form1-DesinatedDlvDateCalendar">
expj.KU0060010.KU0060010form1.DesinatedDlvDateCalendar = {};
// script1="onClick;0;CALENDAR;_KU0060010form1/DESINATED_DLV_DATE"
expj.KU0060010.KU0060010form1.DesinatedDlvDateCalendar.onClick0 = function () {
  console.log('DesinatedDlvDateCalendar script1');
expj.common.pscript.executeCalendar('KU0060010','KU0060010form1','_KU0060010form1/DESINATED_DLV_DATE');
};
expj.KU0060010.KU0060010form1.DesinatedDlvDateCalendar.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010form1.DesinatedDlvDateCalendar['onClick' + i])) {
        expj.KU0060010.KU0060010form1.DesinatedDlvDateCalendar['onClick' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010form1.DesinatedDlvDateCalendar.executeAllOnDecision = function () {
};
expj.KU0060010.KU0060010form1.DesinatedDlvDateCalendar.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010form1-DesinatedDlvDateCalendar').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010form1', 'DesinatedDlvDateCalendar', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0060010','KU0060010form1','_KU0060010form1/DESINATED_DLV_DATE');
  expj.KU0060010.KU0060010form1.DesinatedDlvDateCalendar.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.DesinatedDlvDateCalendar.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1/DesinatedDlvDateCalendar.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010form1-DesinatedDlvDateCalendar');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0060010-KU0060010form1-DesinatedDlvDateCalendar" class="KU0060010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KU0060010-KU0060010form1-strBUSINESS_OPR_DATE" name="strBUSINESS_OPR_DATE" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0060010Struct.getstrBUSINESS_OPR_DATE()) %>">
<script class="expj-script-KU0060010-KU0060010form1-strBUSINESS_OPR_DATE">
expj.KU0060010.KU0060010form1.strBUSINESS_OPR_DATE = {};
expj.KU0060010.KU0060010form1.strBUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute KU0060010form1/strBUSINESS_OPR_DATE.onDecision');
  expj.KU0060010.KU0060010form1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010form1.strBUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010form1-strBUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0060010', 'KU0060010form1', 'strBUSINESS_OPR_DATE', this);
  });
  expj.KU0060010.KU0060010form1.strBUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.strBUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1/strBUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010form1-strBUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DESINATED_SHIP_DATE",rb)%></span><!-- 出荷指定日 --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010form1-DESINATED_SHIP_DATE">
expj.KU0060010.KU0060010form1.DESINATED_SHIP_DATE = {};
expj.KU0060010.KU0060010form1.DESINATED_SHIP_DATE.executeAllOnDecision = function () {
  console.log('execute KU0060010form1/DESINATED_SHIP_DATE.onDecision');
  expj.KU0060010.KU0060010form1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010form1.DESINATED_SHIP_DATE.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010form1-DESINATED_SHIP_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0060010', 'KU0060010form1', 'DESINATED_SHIP_DATE', this);
  });
  expj.KU0060010.KU0060010form1.DESINATED_SHIP_DATE.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.DESINATED_SHIP_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1/DESINATED_SHIP_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010form1-DESINATED_SHIP_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0060010-KU0060010form1-DESINATED_SHIP_DATE" name="DESINATED_SHIP_DATE" class="KU0060010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0060010Struct.getDESINATED_SHIP_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010form1-DesinatedShipDateCalendar">
expj.KU0060010.KU0060010form1.DesinatedShipDateCalendar = {};
// script1="onClick;0;CALENDAR;_KU0060010form1/DESINATED_SHIP_DATE"
expj.KU0060010.KU0060010form1.DesinatedShipDateCalendar.onClick0 = function () {
  console.log('DesinatedShipDateCalendar script1');
expj.common.pscript.executeCalendar('KU0060010','KU0060010form1','_KU0060010form1/DESINATED_SHIP_DATE');
};
expj.KU0060010.KU0060010form1.DesinatedShipDateCalendar.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010form1.DesinatedShipDateCalendar['onClick' + i])) {
        expj.KU0060010.KU0060010form1.DesinatedShipDateCalendar['onClick' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010form1.DesinatedShipDateCalendar.executeAllOnDecision = function () {
};
expj.KU0060010.KU0060010form1.DesinatedShipDateCalendar.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010form1-DesinatedShipDateCalendar').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010form1', 'DesinatedShipDateCalendar', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0060010','KU0060010form1','_KU0060010form1/DESINATED_SHIP_DATE');
  expj.KU0060010.KU0060010form1.DesinatedShipDateCalendar.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.DesinatedShipDateCalendar.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1/DesinatedShipDateCalendar.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010form1-DesinatedShipDateCalendar');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0060010-KU0060010form1-DesinatedShipDateCalendar" class="KU0060010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ODR_NO",rb)%></span><!-- 得意先注文番号 --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010form1-CUST_ODR_NO">
expj.KU0060010.KU0060010form1.CUST_ODR_NO = {};
expj.KU0060010.KU0060010form1.CUST_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KU0060010form1/CUST_ODR_NO.onDecision');
  expj.KU0060010.KU0060010form1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010form1.CUST_ODR_NO.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010form1-CUST_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0060010', 'KU0060010form1', 'CUST_ODR_NO', this);
  });
  expj.KU0060010.KU0060010form1.CUST_ODR_NO.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.CUST_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1/CUST_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010form1-CUST_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0060010-KU0060010form1-CUST_ODR_NO" name="CUST_ODR_NO" class="KU0060010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKU0060010Struct.getCUST_ODR_NO()) %>" maxlength="23" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010form1-CUST_CD">
expj.KU0060010.KU0060010form1.CUST_CD = {};
expj.KU0060010.KU0060010form1.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KU0060010form1/CUST_CD.onDecision');
  expj.KU0060010.KU0060010form1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010form1.CUST_CD.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010form1-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0060010', 'KU0060010form1', 'CUST_CD', this);
  });
  expj.KU0060010.KU0060010form1.CUST_CD.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010form1-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0060010-KU0060010form1-CUST_CD" name="CUST_CD" class="KU0060010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKU0060010Struct.getCUST_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)%></span><!-- 得意先品目番号 --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010form1-CUST_ITEM_CD">
expj.KU0060010.KU0060010form1.CUST_ITEM_CD = {};
expj.KU0060010.KU0060010form1.CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KU0060010form1/CUST_ITEM_CD.onDecision');
  expj.KU0060010.KU0060010form1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010form1.CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010form1-CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0060010', 'KU0060010form1', 'CUST_ITEM_CD', this);
  });
  expj.KU0060010.KU0060010form1.CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1/CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010form1-CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0060010-KU0060010form1-CUST_ITEM_CD" name="CUST_ITEM_CD" class="KU0060010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKU0060010Struct.getCUST_ITEM_CD()) %>" maxlength="35" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OWN_PERSON_CD_2",rb)%></span><!-- 発行／営業担当者コード --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010form1-CUST_CHRG_PSN_CD">
expj.KU0060010.KU0060010form1.CUST_CHRG_PSN_CD = {};
expj.KU0060010.KU0060010form1.CUST_CHRG_PSN_CD.executeAllOnDecision = function () {
  console.log('execute KU0060010form1/CUST_CHRG_PSN_CD.onDecision');
  expj.KU0060010.KU0060010form1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010form1.CUST_CHRG_PSN_CD.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010form1-CUST_CHRG_PSN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0060010', 'KU0060010form1', 'CUST_CHRG_PSN_CD', this);
  });
  expj.KU0060010.KU0060010form1.CUST_CHRG_PSN_CD.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.CUST_CHRG_PSN_CD.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1/CUST_CHRG_PSN_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010form1-CUST_CHRG_PSN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0060010-KU0060010form1-CUST_CHRG_PSN_CD" name="CUST_CHRG_PSN_CD" class="KU0060010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKU0060010Struct.getCUST_CHRG_PSN_CD()) %>" maxlength="10" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SLIP_CD",rb)%></span><!-- 伝票番号 --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010form1-SLIP_CD">
expj.KU0060010.KU0060010form1.SLIP_CD = {};
expj.KU0060010.KU0060010form1.SLIP_CD.executeAllOnDecision = function () {
  console.log('execute KU0060010form1/SLIP_CD.onDecision');
  expj.KU0060010.KU0060010form1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010form1.SLIP_CD.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010form1-SLIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0060010', 'KU0060010form1', 'SLIP_CD', this);
  });
  expj.KU0060010.KU0060010form1.SLIP_CD.executePScriptOnLoad();
};

expj.KU0060010.KU0060010form1.SLIP_CD.executePScriptOnLoad = function () {
  console.log('execute KU0060010form1/SLIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010form1-SLIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0060010-KU0060010form1-SLIP_CD" name="SLIP_CD" class="KU0060010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKU0060010Struct.getSLIP_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KU0060010-KU0060010button1">
expj.KU0060010.KU0060010button1 = {};
expj.KU0060010.KU0060010button1.executeAllOnDecision = function () {
  console.log('execute KU0060010button1.onDecision');
};
expj.KU0060010.KU0060010button1.executeOnLoad = function () {
  expj.KU0060010.KU0060010button1.executePScriptOnLoad();
};

expj.KU0060010.KU0060010button1.executePScriptOnLoad = function () {
  console.log('execute KU0060010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0060010-KU0060010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0060010-KU0060010button1-Select">
expj.KU0060010.KU0060010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0060010form1/*@KU0060010Servlet,,"
expj.KU0060010.KU0060010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0060010', 'KU0060010button1', '_KU0060010form1/*', 'KU0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0060010', response);
expj.common.updateBusinessScreenTab('KU0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KU0060010.KU0060010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010button1.Select['onClick' + i])) {
        expj.KU0060010.KU0060010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010button1.Select.executeAllOnDecision = function () {
};
expj.KU0060010.KU0060010button1.Select.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010button1', 'Select', this, 'Button');
    }
  });
  expj.KU0060010.KU0060010button1.Select.executePScriptOnLoad();
};

expj.KU0060010.KU0060010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KU0060010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0060010-KU0060010button1-Select" name="Select" class="KU0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<% 
	String editableflg = "true";
	if (aKU0060010Struct.getr2_SHIP_ODR() != null && aKU0060010Struct.getr2_SHIP_ODR().equals("true")) {
		editableflg = "false";
	}
%><div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KU0060010-KU0060010view1">
expj.KU0060010.KU0060010view1 = {};
expj.KU0060010.KU0060010view1.executeAllOnClick = function () {
};
expj.KU0060010.KU0060010view1.executeAllOnDecision = function () {
  console.log('execute KU0060010view1.onDecision');
};
expj.KU0060010.KU0060010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KU0060010view1", "expj.KU0060010.KU0060010view1.executeAllOnClick");
%>
  expj.KU0060010.KU0060010view1.executePScriptOnLoad();
};

expj.KU0060010.KU0060010view1.executePScriptOnLoad = function () {
  console.log('execute KU0060010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KU0060010-KU0060010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String KU0060010view1_Id = "KU0060010view1";
 String KU0060010view1_select = "single";
 String KU0060010view1_sortable = "true";
 String KU0060010view1_resize = "true";
 String KU0060010view1_scroll = "true";
 StringBuffer KU0060010view1_HB = new StringBuffer();
 StringBuffer KU0060010view1_DB = new StringBuffer();
%>
<%
 KU0060010view1_select = "multi";
 KU0060010view1_sortable = "false";
 KU0060010view1_resize = "true";
 KU0060010view1_scroll = "true";
%>
<%
 KU0060010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
%>
    <script class="expj-script-KU0060010-KU0060010view1-l_DESINATED_SHIP_DATE">
expj.KU0060010.KU0060010view1.l_DESINATED_SHIP_DATE = {};
// script1="onDecision;0;CHK;_THIS[lt]_KU0060010form1/strBUSINESS_OPR_DATE@!KU00023"
expj.KU0060010.KU0060010view1.l_DESINATED_SHIP_DATE.onDecision0 = function () {
  console.log('l_DESINATED_SHIP_DATE script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010view1', '_THIS')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010view1', '_KU0060010form1/strBUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('KU0060010', 'KU0060010view1', 'KU00023');
}
};
// script2="onDecision;1;CHK;_THIS[eq]@!KT00001"
expj.KU0060010.KU0060010view1.l_DESINATED_SHIP_DATE.onDecision1 = function () {
  console.log('l_DESINATED_SHIP_DATE script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010view1', '_THIS'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('KU0060010', 'KU0060010view1', 'KT00001');
}
};
expj.KU0060010.KU0060010view1.l_DESINATED_SHIP_DATE.executeAllOnClick = function () {
};
expj.KU0060010.KU0060010view1.l_DESINATED_SHIP_DATE.executeAllOnDecision = function () {
  console.log('execute KU0060010view1/l_DESINATED_SHIP_DATE.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010view1.l_DESINATED_SHIP_DATE['onDecision' + i])) {
        expj.KU0060010.KU0060010view1.l_DESINATED_SHIP_DATE['onDecision' + i]();
      }
    }
  }
  expj.KU0060010.KU0060010view1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010view1.l_DESINATED_SHIP_DATE.executeOnLoad = function () {
  $('.expj-KU0060010-KU0060010view1-l_DESINATED_SHIP_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0060010', 'KU0060010view1', 'l_DESINATED_SHIP_DATE', this);
  });
  expj.KU0060010.KU0060010view1.l_DESINATED_SHIP_DATE.executePScriptOnLoad();
};

expj.KU0060010.KU0060010view1.l_DESINATED_SHIP_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0060010view1/l_DESINATED_SHIP_DATE.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KU0060010-KU0060010view1-l_SHIP_QTY">
expj.KU0060010.KU0060010view1.l_SHIP_QTY = {};
// script1="onDecision;0;CHK;_l_SHIP_QTY[neq]_l_REST_SHIP_QTY[and]_l_PARTIAL_SHIP_INST_FLG[eq]0@!KU00089"
expj.KU0060010.KU0060010view1.l_SHIP_QTY.onDecision0 = function () {
  console.log('l_SHIP_QTY script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010view1', '_l_SHIP_QTY'), '[neq]', expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010view1', '_l_REST_SHIP_QTY')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010view1', '_l_PARTIAL_SHIP_INST_FLG'), '[eq]', '0')) {
expj.common.pscript.viewErrorMessage('KU0060010', 'KU0060010view1', 'KU00089');
}
};
// script2="onDecision;1;CHK;_l_SHIP_QTY[gt]_l_REST_SHIP_QTY[and]<%= editableflg %>[eq]true@!KU00024"
expj.KU0060010.KU0060010view1.l_SHIP_QTY.onDecision1 = function () {
  console.log('l_SHIP_QTY script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010view1', '_l_SHIP_QTY')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010view1', '_l_REST_SHIP_QTY'))) && expj.common.pscript.evaluate('<%= editableflg %>', '[eq]', 'true')) {
expj.common.pscript.viewErrorMessage('KU0060010', 'KU0060010view1', 'KU00024');
}
};
expj.KU0060010.KU0060010view1.l_SHIP_QTY.executeAllOnClick = function () {
};
expj.KU0060010.KU0060010view1.l_SHIP_QTY.executeAllOnDecision = function () {
  console.log('execute KU0060010view1/l_SHIP_QTY.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010view1.l_SHIP_QTY['onDecision' + i])) {
        expj.KU0060010.KU0060010view1.l_SHIP_QTY['onDecision' + i]();
      }
    }
  }
  expj.KU0060010.KU0060010view1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010view1.l_SHIP_QTY.executeOnLoad = function () {
  $('.expj-KU0060010-KU0060010view1-l_SHIP_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0060010', 'KU0060010view1', 'l_SHIP_QTY', this);
  });
  expj.KU0060010.KU0060010view1.l_SHIP_QTY.executePScriptOnLoad();
};

expj.KU0060010.KU0060010view1.l_SHIP_QTY.executePScriptOnLoad = function () {
  console.log('execute KU0060010view1/l_SHIP_QTY.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KU0060010-KU0060010view1-l_c_DIRECT_DLV_FLG">
expj.KU0060010.KU0060010view1.l_c_DIRECT_DLV_FLG = {};
expj.KU0060010.KU0060010view1.l_c_DIRECT_DLV_FLG.executeAllOnClick = function () {
};
expj.KU0060010.KU0060010view1.l_c_DIRECT_DLV_FLG.executeAllOnDecision = function () {
  console.log('execute KU0060010view1/l_c_DIRECT_DLV_FLG.onDecision');
  expj.KU0060010.KU0060010view1.executeAllOnDecision();
  expj.KU0060010.executeAllOnDecision();
};
expj.KU0060010.KU0060010view1.l_c_DIRECT_DLV_FLG.executeOnLoad = function () {
  $('.expj-KU0060010-KU0060010view1-l_c_DIRECT_DLV_FLG').click(function () {
    var component = this;
    if (!component.hasAttribute('disabled')) {
      setTimeout(function () {
        expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010view1', 'l_c_DIRECT_DLV_FLG', component, 'CheckBox');
      }, 0);
    }
  });
  expj.KU0060010.KU0060010view1.l_c_DIRECT_DLV_FLG.executePScriptOnLoad();
};

expj.KU0060010.KU0060010view1.l_c_DIRECT_DLV_FLG.executePScriptOnLoad = function () {
  console.log('execute KU0060010view1/l_c_DIRECT_DLV_FLG.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>

 
<%
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_ODR_CD",rb))).append("', 'name':'l_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PART_DLV_SEQ_NO",rb))).append("', 'name':'l_PART_DLV_SEQ_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SLIP_CD",rb))).append("', 'name':'l_SLIP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'140px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb))).append("', 'name':'l_DESINATED_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_SHIP_DATE",rb))).append("', 'name':'l_DESINATED_SHIP_DATE', 'class':'expj-tooltip expj-view-cell-textinput', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_ODR_QTY",rb))).append("', 'name':'l_SHIP_QTY', 'class':'expj-tooltip expj-view-cell-textinput', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REST_SHIP_ODR_QTY",rb))).append("', 'name':'l_REST_SHIP_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DIRECT_DLV_FLG",rb))).append("', 'name':'l_c_DIRECT_DLV_FLG', 'class':'expj-tooltip expj-view-cell-checkbox', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD",rb))).append("', 'name':'l_WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ODR_NO",rb))).append("', 'name':'l_CUST_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CD",rb))).append("', 'name':'l_CUST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_NAME",rb))).append("', 'name':'l_CUST_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb))).append("', 'name':'l_CUST_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_NAME",rb))).append("', 'name':'l_CUST_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_WH_NAME', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_UNIT_QTY_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_TRANSPORT_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_ODR_UNIT_PRICE', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_SPCL_PRICE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_PARTIAL_SHIP_INST_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_ODR_CTL_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
KU0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_DLV_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KU0060010view1_sortable).append("}").append(",");
%>
<%
 int aKU0060010StructLength = aKU0060010Control.getListsize();
 final KU0060010Struct structBackup = aKU0060010Struct;
 aKU0060010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKU0060010StructLength; ++loopCount) {
  if((aKU0060010Struct = (KU0060010Struct) aKU0060010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKU0060010Struct", aKU0060010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KU0060010view1_DB.append("[");
 KU0060010view1_DB.append(loopCount);
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_ODR_NO\" data-name=\"l_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_ODR_NO())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_PART_DLV_SEQ_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_PART_DLV_SEQ_NO\" data-name=\"l_PART_DLV_SEQ_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_PART_DLV_SEQ_NO())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_SLIP_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_SLIP_CD\" data-name=\"l_SLIP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_SLIP_CD())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_ITEM_CD())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_JOB_ODR_CD())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_DESINATED_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_DESINATED_DLV_DATE\" data-name=\"l_DESINATED_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_DESINATED_DLV_DATE())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-KU0060010-KU0060010view1-l_DESINATED_SHIP_DATE-").append(loopCount).append("\" class=\"expj-KU0060010-KU0060010view1-l_DESINATED_SHIP_DATE KU0060010-focus-move\" data-name=\"l_DESINATED_SHIP_DATE\" data-view=\"true\" style=\"width: 150px;\" maxlength=\"10\" data-kind=\"").append("OBT_DATE;TYPE_YMD;").append("\"").append("false".equals( editableflg ) ? " disabled=\"disabled\"" : "").append(" value=\"").append(TypeConverter.sanitizer(aKU0060010Struct.getl_DESINATED_SHIP_DATE())).append("\">'");
 KU0060010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-KU0060010-KU0060010view1-l_SHIP_QTY-").append(loopCount).append("\" class=\"expj-KU0060010-KU0060010view1-l_SHIP_QTY KU0060010-focus-move\" data-name=\"l_SHIP_QTY\" data-view=\"true\" style=\"width: 150px;text-align:right;\" maxlength=\"19\" data-kind=\"").append("OBT_NUMBER_P;14.1;CEIL;4").append("\"").append("false".equals( editableflg ) ? " disabled=\"disabled\"" : "").append(" value=\"").append(TypeConverter.sanitizer(aKU0060010Struct.getl_SHIP_QTY())).append("\">'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_REST_SHIP_QTY-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_REST_SHIP_QTY\" data-name=\"l_REST_SHIP_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;18.1;ROUND;4\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_REST_SHIP_QTY())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<input type=\"checkbox\" id=\"expj-KU0060010-KU0060010view1-l_c_DIRECT_DLV_FLG-").append(loopCount).append("\" class=\"expj-KU0060010-KU0060010view1-l_c_DIRECT_DLV_FLG KU0060010-focus-move\" data-name=\"l_c_DIRECT_DLV_FLG\" data-view=\"true\"").append("true".equals(TypeConverter.convert(aKU0060010Struct.getl_c_DIRECT_DLV_FLG())) ? " checked=\"checked\"" : "").append("true".equals( editableflg ) ? "" : " disabled=\"disabled\"").append(">'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_WH_CD\" data-name=\"l_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_WH_CD())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_ITEM_NAME())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_CUST_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_CUST_ODR_NO\" data-name=\"l_CUST_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_CUST_ODR_NO())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_CUST_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_CUST_CD\" data-name=\"l_CUST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_CUST_CD())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_CUST_NAME-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_CUST_NAME\" data-name=\"l_CUST_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_CUST_NAME())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_CUST_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_CUST_ITEM_CD\" data-name=\"l_CUST_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_CUST_ITEM_CD())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_CUST_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_CUST_ITEM_NAME\" data-name=\"l_CUST_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_CUST_ITEM_NAME())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_WH_NAME\" data-name=\"l_WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_WH_NAME())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_STOCK_UNIT\" data-name=\"l_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_STOCK_UNIT())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_UNIT_QTY_TYP-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_UNIT_QTY_TYP\" data-name=\"l_UNIT_QTY_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_UNIT_QTY_TYP())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_MRP_ODR_TYP\" data-name=\"l_MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_MRP_ODR_TYP())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_TRANSPORT_TYP-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_TRANSPORT_TYP\" data-name=\"l_TRANSPORT_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_TRANSPORT_TYP())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_ODR_UNIT_PRICE-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_ODR_UNIT_PRICE\" data-name=\"l_ODR_UNIT_PRICE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_ODR_UNIT_PRICE())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_SPCL_PRICE_TYP-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_SPCL_PRICE_TYP\" data-name=\"l_SPCL_PRICE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_SPCL_PRICE_TYP())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_PARTIAL_SHIP_INST_FLG-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_PARTIAL_SHIP_INST_FLG\" data-name=\"l_PARTIAL_SHIP_INST_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_PARTIAL_SHIP_INST_FLG())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_ODR_CTL_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_ODR_CTL_NO\" data-name=\"l_ODR_CTL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_ODR_CTL_NO())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_MODIFY_COUNT\" data-name=\"l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_MODIFY_COUNT())).append("</span>'");
 KU0060010view1_DB.append(",").append("'<span id=\"expj-KU0060010-KU0060010view1-l_DLV_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-KU0060010-KU0060010view1-l_DLV_MODIFY_COUNT\" data-name=\"l_DLV_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0060010Struct.getl_DLV_MODIFY_COUNT())).append("</span>'");
 KU0060010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKU0060010StructLength) {
   KU0060010view1_DB.append(",");
  }
 }
 aKU0060010Struct = structBackup;
 viewIdList.add(KU0060010view1_Id);
 viewSelectList.add(KU0060010view1_select);
 viewResizeList.add(KU0060010view1_resize);
 viewScrollList.add(KU0060010view1_scroll);
 viewHeaderDataList.add(KU0060010view1_HB);
 viewBodyDataList.add(KU0060010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:735px;"><script class="expj-script-KU0060010-KU0060010button2">
expj.KU0060010.KU0060010button2 = {};
expj.KU0060010.KU0060010button2.executeAllOnDecision = function () {
  console.log('execute KU0060010button2.onDecision');
};
expj.KU0060010.KU0060010button2.executeOnLoad = function () {
  expj.KU0060010.KU0060010button2.executePScriptOnLoad();
};

expj.KU0060010.KU0060010button2.executePScriptOnLoad = function () {
  console.log('execute KU0060010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0060010-KU0060010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:735px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0060010-KU0060010button2-Insert">
expj.KU0060010.KU0060010button2.Insert = {};
// script1="onClick;0;SELCHKT;KU0060010view1:_l_DESINATED_SHIP_DATE[lt]_KU0060010form1/strBUSINESS_OPR_DATE@#KU00023"
expj.KU0060010.KU0060010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
var selectCells = expj.common.pscript.getSelectedVIEWCells('KU0060010', 'KU0060010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(cell.l_DESINATED_SHIP_DATE), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0060010', 'KU0060010button2', '_KU0060010form1/strBUSINESS_OPR_DATE')))) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addErrorMessage('KU0060010', 'KU0060010button2', 'KU00023');
}
};
// script2="onClick;1;SELCHKT;KU0060010view1:_l_SHIP_QTY[lte]0@#KU00028"
expj.KU0060010.KU0060010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
var selectCells = expj.common.pscript.getSelectedVIEWCells('KU0060010', 'KU0060010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(cell.l_SHIP_QTY), '[lte]', expj.common.pscript.convertNumber('0'))) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addErrorMessage('KU0060010', 'KU0060010button2', 'KU00028');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0060010view1/+,_KU0060010form1/*@KU0060010Servlet,,$ZZ07001"
expj.KU0060010.KU0060010button2.Insert.onClick2 = function () {
  console.log('Insert script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0060010', 'KU0060010button2', '_KU0060010view1/+,_KU0060010form1/*', 'KU0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0060010', response);
expj.common.updateBusinessScreenTab('KU0060010', contents);
};
expj.common.pscript.callConfirm('KU0060010', 'KU0060010button2', 'ZZ07001', okEvent);
};
expj.KU0060010.KU0060010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010button2.Insert['onClick' + i])) {
        expj.KU0060010.KU0060010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010button2.Insert.executeAllOnDecision = function () {
};
expj.KU0060010.KU0060010button2.Insert.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010button2', 'Insert', this, 'Button');
    }
  });
  expj.KU0060010.KU0060010button2.Insert.executePScriptOnLoad();
};

expj.KU0060010.KU0060010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute KU0060010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0060010-KU0060010button2-Insert" name="Insert" class="KU0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsertAssort",rb)%></button><!-- 選択登録ボタン --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010button2-Delete">
expj.KU0060010.KU0060010button2.Delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0060010view1/+,_KU0060010form1/*@KU0060010Servlet,,$ZZ07004"
expj.KU0060010.KU0060010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0060010', 'KU0060010button2', '_KU0060010view1/+,_KU0060010form1/*', 'KU0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0060010', response);
expj.common.updateBusinessScreenTab('KU0060010', contents);
};
expj.common.pscript.callConfirm('KU0060010', 'KU0060010button2', 'ZZ07004', okEvent);
};
expj.KU0060010.KU0060010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010button2.Delete['onClick' + i])) {
        expj.KU0060010.KU0060010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010button2.Delete.executeAllOnDecision = function () {
};
expj.KU0060010.KU0060010button2.Delete.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010button2', 'Delete', this, 'Button');
    }
  });
  expj.KU0060010.KU0060010button2.Delete.executePScriptOnLoad();
};

expj.KU0060010.KU0060010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute KU0060010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0060010-KU0060010button2-Delete" name="Delete" class="KU0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAssort_1",rb)%></button><!-- 選択削除ボタン --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010button2-CheckAll">
expj.KU0060010.KU0060010button2.CheckAll = {};
// script1="onClick;0;DGSALL;KU0060010view1"
expj.KU0060010.KU0060010button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('KU0060010', 'KU0060010view1');
};
expj.KU0060010.KU0060010button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010button2.CheckAll['onClick' + i])) {
        expj.KU0060010.KU0060010button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010button2.CheckAll.executeAllOnDecision = function () {
};
expj.KU0060010.KU0060010button2.CheckAll.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010button2', 'CheckAll', this, 'Button');
    }
  });
  expj.KU0060010.KU0060010button2.CheckAll.executePScriptOnLoad();
};

expj.KU0060010.KU0060010button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute KU0060010button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0060010-KU0060010button2-CheckAll" name="CheckAll" class="KU0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010button2-CheckAllClear">
expj.KU0060010.KU0060010button2.CheckAllClear = {};
// script1="onClick;0;DGSCANCEL;KU0060010view1"
expj.KU0060010.KU0060010button2.CheckAllClear.onClick0 = function () {
  console.log('CheckAllClear script1');
expj.common.pscript.unselectVIEWAllRow('KU0060010', 'KU0060010view1');
};
expj.KU0060010.KU0060010button2.CheckAllClear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010button2.CheckAllClear['onClick' + i])) {
        expj.KU0060010.KU0060010button2.CheckAllClear['onClick' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010button2.CheckAllClear.executeAllOnDecision = function () {
};
expj.KU0060010.KU0060010button2.CheckAllClear.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010button2-CheckAllClear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010button2', 'CheckAllClear', this, 'Button');
    }
  });
  expj.KU0060010.KU0060010button2.CheckAllClear.executePScriptOnLoad();
};

expj.KU0060010.KU0060010button2.CheckAllClear.executePScriptOnLoad = function () {
  console.log('execute KU0060010button2/CheckAllClear.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010button2-CheckAllClear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0060010-KU0060010button2-CheckAllClear" name="CheckAllClear" class="KU0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010button2-CheckAllStock">
expj.KU0060010.KU0060010button2.CheckAllStock = {};
// script1="onClick;0;COLSET;_KU0060010view1/l_c_DIRECT_DLV_FLG=true"
expj.KU0060010.KU0060010button2.CheckAllStock.onClick0 = function () {
  console.log('CheckAllStock script1');
expj.common.pscript.setVIEWColumn('KU0060010', 'KU0060010button2', '_KU0060010view1/l_c_DIRECT_DLV_FLG', 'true');
};
expj.KU0060010.KU0060010button2.CheckAllStock.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010button2.CheckAllStock['onClick' + i])) {
        expj.KU0060010.KU0060010button2.CheckAllStock['onClick' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010button2.CheckAllStock.executeAllOnDecision = function () {
};
expj.KU0060010.KU0060010button2.CheckAllStock.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010button2-CheckAllStock').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010button2', 'CheckAllStock', this, 'Button');
    }
  });
  expj.KU0060010.KU0060010button2.CheckAllStock.executePScriptOnLoad();
};

expj.KU0060010.KU0060010button2.CheckAllStock.executePScriptOnLoad = function () {
  console.log('execute KU0060010button2/CheckAllStock.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010button2-CheckAllStock');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0060010-KU0060010button2-CheckAllStock" name="CheckAllStock" class="KU0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.DIRECT_DLV_FLG_1",rb)%></button><!-- 在庫チェックボタン --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010button2-CheckAllStockClear">
expj.KU0060010.KU0060010button2.CheckAllStockClear = {};
// script1="onClick;0;COLSET;_KU0060010view1/l_c_DIRECT_DLV_FLG=false"
expj.KU0060010.KU0060010button2.CheckAllStockClear.onClick0 = function () {
  console.log('CheckAllStockClear script1');
expj.common.pscript.setVIEWColumn('KU0060010', 'KU0060010button2', '_KU0060010view1/l_c_DIRECT_DLV_FLG', 'false');
};
expj.KU0060010.KU0060010button2.CheckAllStockClear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010button2.CheckAllStockClear['onClick' + i])) {
        expj.KU0060010.KU0060010button2.CheckAllStockClear['onClick' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010button2.CheckAllStockClear.executeAllOnDecision = function () {
};
expj.KU0060010.KU0060010button2.CheckAllStockClear.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010button2-CheckAllStockClear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010button2', 'CheckAllStockClear', this, 'Button');
    }
  });
  expj.KU0060010.KU0060010button2.CheckAllStockClear.executePScriptOnLoad();
};

expj.KU0060010.KU0060010button2.CheckAllStockClear.executePScriptOnLoad = function () {
  console.log('execute KU0060010button2/CheckAllStockClear.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010button2-CheckAllStockClear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0060010-KU0060010button2-CheckAllStockClear" name="CheckAllStockClear" class="KU0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.DIRECT_DLV_FLG_2",rb)%></button><!-- 在庫チェック解除ボタン --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010button2-ScrmvToShipDir">
expj.KU0060010.KU0060010button2.ScrmvToShipDir = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_KU0060010form1/r1_SHIP_ODR,_KU0060010form1/r2_SHIP_ODR,_KU0060010view1/+@KU0010010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.KU0060010.KU0060010button2.ScrmvToShipDir.onClick0 = function () {
  console.log('ScrmvToShipDir script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0060010', 'KU0060010button2', '_KU0060010form1/r1_SHIP_ODR,_KU0060010form1/r2_SHIP_ODR,_KU0060010view1/+', 'KU0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('KU0010010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'KU0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'KU0060010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KU0060010.KU0060010button2.ScrmvToShipDir.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010button2.ScrmvToShipDir['onClick' + i])) {
        expj.KU0060010.KU0060010button2.ScrmvToShipDir['onClick' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010button2.ScrmvToShipDir.executeAllOnDecision = function () {
};
expj.KU0060010.KU0060010button2.ScrmvToShipDir.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010button2-ScrmvToShipDir').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010button2', 'ScrmvToShipDir', this, 'Button');
    }
  });
  expj.KU0060010.KU0060010button2.ScrmvToShipDir.executePScriptOnLoad();
};

expj.KU0060010.KU0060010button2.ScrmvToShipDir.executePScriptOnLoad = function () {
  console.log('execute KU0060010button2/ScrmvToShipDir.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010button2-ScrmvToShipDir');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0060010-KU0060010button2-ScrmvToShipDir" name="ScrmvToShipDir" class="KU0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnShippingDirectionsMaintenance",rb)%></button><!-- 出荷指示メンテボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame09" style="width:calc(100% - 819px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame11" style="width:12px;"></div><!--/td-->
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
<span class="version">KU0060010 Revision: 1.16  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KU0060010-KU0060010button0">
expj.KU0060010.KU0060010button0 = {};
expj.KU0060010.KU0060010button0.executeAllOnDecision = function () {
  console.log('execute KU0060010button0.onDecision');
};
expj.KU0060010.KU0060010button0.executeOnLoad = function () {
  expj.KU0060010.KU0060010button0.executePScriptOnLoad();
};

expj.KU0060010.KU0060010button0.executePScriptOnLoad = function () {
  console.log('execute KU0060010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0060010-KU0060010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0060010-KU0060010button0-Clear">
expj.KU0060010.KU0060010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KU0060010Servlet,,$ZZ07008"
expj.KU0060010.KU0060010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0060010', 'KU0060010button0', '', 'KU0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0060010', response);
expj.common.updateBusinessScreenTab('KU0060010', contents);
};
expj.common.pscript.callConfirm('KU0060010', 'KU0060010button0', 'ZZ07008', okEvent);
};
expj.KU0060010.KU0060010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010button0.Clear['onClick' + i])) {
        expj.KU0060010.KU0060010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010button0.Clear.executeAllOnDecision = function () {
};
expj.KU0060010.KU0060010button0.Clear.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010button0', 'Clear', this, 'Button');
    }
  });
  expj.KU0060010.KU0060010button0.Clear.executePScriptOnLoad();
};

expj.KU0060010.KU0060010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KU0060010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0060010-KU0060010button0-Clear" name="Clear" class="KU0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KU0060010-KU0060010button0-Close">
expj.KU0060010.KU0060010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KU0060010.KU0060010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KU0060010');
};
expj.KU0060010.KU0060010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0060010.KU0060010button0.Close['onClick' + i])) {
        expj.KU0060010.KU0060010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KU0060010.KU0060010button0.Close.executeAllOnDecision = function () {
};
expj.KU0060010.KU0060010button0.Close.executeOnLoad = function () {
  $('#expj-KU0060010-KU0060010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0060010', 'KU0060010button0', 'Close', this, 'Button');
    }
  });
  expj.KU0060010.KU0060010button0.Close.executePScriptOnLoad();
};

expj.KU0060010.KU0060010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KU0060010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KU0060010-KU0060010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0060010-KU0060010button0-Close" name="Close" class="KU0060010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KU0060010 (END)-->
<%
MessageStruct msgStruct = aKU0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KU0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KU0060010)) {
  expj.common.treeInstanceMap.KU0060010 = {};
}
expj.common.treeInstanceMap.KU0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KU0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KU0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KU0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KU0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KU0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KU0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KU0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KU0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0060010)) {
  expj.common.detailDialogMap.KU0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KU0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.KU0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KU0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KU0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KU0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KU0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KU0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KU0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KU0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KU0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KU0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KU0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KU0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KU0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KU0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KU0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KU0060010)) {
  expj.common.viewInstanceMap.KU0060010 = {};
}
expj.common.viewInstanceMap.KU0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.KU0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KU0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KU0060010.<%=viewId %>.init = function () {
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
    expj.KU0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KU0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KU0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KU0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KU0060010_init">
/**
 * KU0060010用のロード完了時初期化関数
 */
expj.KU0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KU0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KU0060010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KU0060010');
  expj.common.calendarInstanceMap.KU0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KU0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KU0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.KU0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KU0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KU0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KU0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KU0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KU0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KU0060010-<%=detailId %>');
<%
 }
%>
  try{expj.KU0060010.KU0060010form1.ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010form1.r1_SHIP_ODR.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010form1.r2_SHIP_ODR.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010form1.DESINATED_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010form1.DesinatedDlvDateCalendar.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010form1.strBUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010form1.DESINATED_SHIP_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010form1.DesinatedShipDateCalendar.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010form1.CUST_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010form1.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010form1.CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010form1.CUST_CHRG_PSN_CD.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010form1.SLIP_CD.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010view1.l_DESINATED_SHIP_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010view1.l_SHIP_QTY.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010view1.l_c_DIRECT_DLV_FLG.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010button2.CheckAllClear.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010button2.CheckAllStock.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010button2.CheckAllStockClear.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010button2.ScrmvToShipDir.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010form1.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010button1.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010view1.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010button2.executeOnLoad();}catch(e){};
  try{expj.KU0060010.KU0060010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KU0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KU0060010', 'KU0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KU0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KU0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.KU0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KU0060010', '<%=request.getContextPath() %>');
};

/**
 * KU0060010の全体onDecision処理
 */
expj.KU0060010.executeAllOnDecision = function () {
  expj.KU0060010.KU0060010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KU0060010_console">
expj.KU0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>