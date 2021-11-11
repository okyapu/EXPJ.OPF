<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 13:02:17 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KU0030\KU0030010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KU0030.*" %>
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
<jsp:useBean id="aKU0030010Control" class="com.nec.jp.orteus.metamorBase.KU0030.KU0030010Control" scope="request"/>
<jsp:useBean id="aKU0030010Struct" class="com.nec.jp.orteus.metamorBase.KU0030.KU0030010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

出荷実績メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0030/jsp/KU0030010.jsp,v $
$Author: geng-jia $	
$Revision: 1.32 $ $Date: 2017/02/22 02:07:26 $
********************************************************* --%>
<html>
<head>
<title>出荷実績メンテナンス</title>
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
<script class="expj-script-KU0030010_init">
  // KU0030010名前空間
  expj.KU0030010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KU0030010" data-screen="KU0030010" data-newdata="<%=aKU0030010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
<!--one start -->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

<!--one end -->

<!--two start -->
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
              <script class="expj-script-KU0030010-KU0030010form1">
expj.KU0030010.KU0030010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6,7,8,9,10"
expj.KU0030010.KU0030010form1.onLoad0 = function () {
  console.log('KU0030010form1 script1');
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
// script2="onDecision;0;MASK;_KU0030010form2/SelectUnitCost,_KU0030010button2/insert,_KU0030010button2/torikeshi,_KU0030010button2/recall"
expj.KU0030010.KU0030010form1.onDecision0 = function () {
  console.log('KU0030010form1 script2');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/SelectUnitCost');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/torikeshi');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/recall');
};
// script3="onDecision;1;CHKRQ;A@*1,*2"
expj.KU0030010.KU0030010form1.onDecision1 = function () {
  console.log('KU0030010form1 script3');
if (expj.common.pscript.satisfiedRequiredComponent('KU0030010', 'A')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="onDecision;2;CHK;?KU0030010form1/g_SLIP_CD[neq]SAME@*3"
expj.KU0030010.KU0030010form1.onDecision2 = function () {
  console.log('KU0030010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '?KU0030010form1/g_SLIP_CD'), '[neq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="onDecision;3;CHK;_KU0030010form1/r_SEL_PTN1[eq]true@*19"
expj.KU0030010.KU0030010form1.onDecision3 = function () {
  console.log('KU0030010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script6="onDecision;4;CHK;_KU0030010form1/r_SEL_PTN1[eq]true@*4"
expj.KU0030010.KU0030010form1.onDecision4 = function () {
  console.log('KU0030010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="onDecision;5;CHK;_KU0030010form1/r_SEL_PTN2[eq]true@*5"
expj.KU0030010.KU0030010form1.onDecision5 = function () {
  console.log('KU0030010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="onDecision;6;CHK;_KU0030010form1/r_SEL_PTN2[eq]true@*6"
expj.KU0030010.KU0030010form1.onDecision6 = function () {
  console.log('KU0030010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="onDecision;7;CHK;_KU0030010form1/r_SEL_PTN3[eq]true@*7"
expj.KU0030010.KU0030010form1.onDecision7 = function () {
  console.log('KU0030010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN3'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="onDecision;8;CHK;_KU0030010form1/r_SEL_PTN3[eq]true@*8"
expj.KU0030010.KU0030010form1.onDecision8 = function () {
  console.log('KU0030010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN3'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;0;MASK;_KU0030010form2/g_SHIP_QTY2@"
expj.KU0030010.KU0030010form1.child0 = function () {
  console.log('KU0030010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SHIP_QTY2');
};
// script12="child;1;UNMASK;_KU0030010button1/search"
expj.KU0030010.KU0030010form1.child1 = function () {
  console.log('KU0030010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button1/search');
};
// script13="child;2;MASK;_KU0030010button1/search,_KU0030010form2/SelectUnitCost,_KU0030010button2/insert,_KU0030010button2/torikeshi,_KU0030010button2/recall"
expj.KU0030010.KU0030010form1.child2 = function () {
  console.log('KU0030010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button1/search');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/SelectUnitCost');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/torikeshi');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/recall');
};
// script14="child;3;MASK;_KU0030010form2/SelectUnitCost,_KU0030010button2/insert,_KU0030010button2/torikeshi,_KU0030010button2/recall"
expj.KU0030010.KU0030010form1.child3 = function () {
  console.log('KU0030010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/SelectUnitCost');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/torikeshi');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/recall');
};
// script15="child;4;SET;_KU0030010form1/r_SEL_PTN=ORDER,_KU0030010form1/h_SHIP_CMPLT_FLG=0"
expj.KU0030010.KU0030010form1.child4 = function () {
  console.log('KU0030010form1 script15');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN', 'ORDER');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SHIP_CMPLT_FLG', '0');
};
// script16="child;5;SET;_KU0030010form1/r_SEL_PTN=CANCEL,_KU0030010form1/h_SHIP_CMPLT_FLG=1"
expj.KU0030010.KU0030010form1.child5 = function () {
  console.log('KU0030010form1 script16');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN', 'CANCEL');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SHIP_CMPLT_FLG', '1');
};
// script17="child;6;MASK;_KU0030010form2/g_SHIP_QTY2,_KU0030010form2/g_UNIT_PRICE,_KU0030010form2/g_WH_CD,_KU0030010form2/PeekerWhCd,_KU0030010form2/g_SALES_DEPT_CD,_KU0030010form2/PeekerIOrgCd,_KU0030010form2/g_JOB_ODR_CD,_KU0030010form2/PeekerJobOdrCd,_KU0030010form2/c_JOB_ODR_CD@*9"
expj.KU0030010.KU0030010form1.child6 = function () {
  console.log('KU0030010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SHIP_QTY2');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_UNIT_PRICE');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_WH_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerWhCd');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SALES_DEPT_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerIOrgCd');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerJobOdrCd');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/c_JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script18="child;7;SET;_KU0030010form1/r_SEL_PTN=RECALL,_KU0030010form1/h_SHIP_CMPLT_FLG=1"
expj.KU0030010.KU0030010form1.child7 = function () {
  console.log('KU0030010form1 script18');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN', 'RECALL');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SHIP_CMPLT_FLG', '1');
};
// script19="child;8;MASK;_KU0030010form2/g_UNIT_PRICE,_KU0030010form2/g_WH_CD,_KU0030010form2/PeekerWhCd,_KU0030010form2/g_SALES_DEPT_CD,_KU0030010form2/PeekerIOrgCd,_KU0030010form2/g_JOB_ODR_CD,_KU0030010form2/PeekerJobOdrCd,_KU0030010form2/c_JOB_ODR_CD@*14"
expj.KU0030010.KU0030010form1.child8 = function () {
  console.log('KU0030010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_UNIT_PRICE');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_WH_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerWhCd');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SALES_DEPT_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerIOrgCd');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerJobOdrCd');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/c_JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script20="child;9;CHK;_KU0030010form1/g_SLIP_CD[neq][and]?KU0030010form1/g_SLIP_CD[eq]SAME[and]_KU0030010form2/g_DATE[neq]@*10"
expj.KU0030010.KU0030010form1.child9 = function () {
  console.log('KU0030010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/g_SLIP_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '?KU0030010form1/g_SLIP_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_DATE'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script21="child;10;CHK;_KU0030010form1/r_SEL_PTN2[eq]true[and]_KU0030010form1/h_SELECT_FG[eq]OK[and]_KU0030010form1/h_RESULT[eq]OK@*11"
expj.KU0030010.KU0030010form1.child10 = function () {
  console.log('KU0030010form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN2'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SELECT_FG'), '[eq]', 'OK') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_RESULT'), '[eq]', 'OK')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script22="child;11;UNMASK;_KU0030010button2/torikeshi"
expj.KU0030010.KU0030010form1.child11 = function () {
  console.log('KU0030010form1 script22');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/torikeshi');
};
// script23="child;14;CHK;_KU0030010form1/g_SLIP_CD[neq][and]?KU0030010form1/g_SLIP_CD[eq]SAME[and]_KU0030010form2/g_DATE[neq]@*15"
expj.KU0030010.KU0030010form1.child14 = function () {
  console.log('KU0030010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/g_SLIP_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '?KU0030010form1/g_SLIP_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_DATE'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script24="child;15;CHK;?KU0030010form1/g_SLIP_CD[eq]SAME[and]_KU0030010form1/r_SEL_PTN3[eq]true[and]_KU0030010form1/h_SELECT_FG[eq]OK@*16"
expj.KU0030010.KU0030010form1.child15 = function () {
  console.log('KU0030010form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '?KU0030010form1/g_SLIP_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN3'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SELECT_FG'), '[eq]', 'OK')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script25="child;16;UNMASK;_KU0030010button2/recall"
expj.KU0030010.KU0030010form1.child16 = function () {
  console.log('KU0030010form1 script25');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/recall');
};
// script26="child;19;CHK;_KU0030010form3/h_MRP_ODR_TYP[eq]1[or]_KU0030010form3/h_MRP_ODR_TYP[eq]2@*20,*21"
expj.KU0030010.KU0030010form1.child19 = function () {
  console.log('KU0030010form1 script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_MRP_ODR_TYP'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_MRP_ODR_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script27="child;20;UNMASK;_KU0030010form2/c_JOB_ODR_CD@*23"
expj.KU0030010.KU0030010form1.child20 = function () {
  console.log('KU0030010form1 script27');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/c_JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child23)){this.child23();}}
};
// script28="child;21;MASK;_KU0030010form2/c_JOB_ODR_CD@*22"
expj.KU0030010.KU0030010form1.child21 = function () {
  console.log('KU0030010form1 script28');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/c_JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child22)){this.child22();}}
};
// script29="child;22;SET;_KU0030010form2/c_JOB_ODR_CD=false@*23"
expj.KU0030010.KU0030010form1.child22 = function () {
  console.log('KU0030010form1 script29');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/c_JOB_ODR_CD', 'false');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child23)){this.child23();}}
};
// script30="child;23;CHK;_KU0030010form2/c_JOB_ODR_CD[eq]true@*24,*25"
expj.KU0030010.KU0030010form1.child23 = function () {
  console.log('KU0030010form1 script30');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/c_JOB_ODR_CD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
} else {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
}
};
// script31="child;24;UNMASK;_KU0030010form2/g_JOB_ODR_CD,_KU0030010form2/PeekerJobOdrCd@*32"
expj.KU0030010.KU0030010form1.child24 = function () {
  console.log('KU0030010form1 script31');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child32)){this.child32();}}
};
// script32="child;25;MASK;_KU0030010form2/g_JOB_ODR_CD,_KU0030010form2/PeekerJobOdrCd@*26"
expj.KU0030010.KU0030010form1.child25 = function () {
  console.log('KU0030010form1 script32');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child26)){this.child26();}}
};
// script33="child;26;SET;_KU0030010form2/g_JOB_ODR_CD=@*27"
expj.KU0030010.KU0030010form1.child26 = function () {
  console.log('KU0030010form1 script33');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_JOB_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child27)){this.child27();}}
};
// script34="child;27;CHK;_KU0030010form1/g_SLIP_CD[neq][and]_KU0030010form2/g_DATE[neq][and]_KU0030010form2/g_WH_CD[neq][and]_KU0030010form2/g_SALES_DEPT_CD[neq]@*28,*29"
expj.KU0030010.KU0030010form1.child27 = function () {
  console.log('KU0030010form1 script34');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/g_SLIP_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_WH_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SALES_DEPT_CD'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
} else {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
}
};
// script35="child;28;CHK;?KU0030010form1/g_SLIP_CD[eq]SAME[and]_KU0030010form1/r_SEL_PTN1[eq]true[and]_KU0030010form1/h_SELECT_FG[eq]OK[and]_KU0030010form1/h_RESULT[eq]OK@*30,*31"
expj.KU0030010.KU0030010form1.child28 = function () {
  console.log('KU0030010form1 script35');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '?KU0030010form1/g_SLIP_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN1'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SELECT_FG'), '[eq]', 'OK') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_RESULT'), '[eq]', 'OK')) {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
} else {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
}
};
// script36="child;30;UNMASK;_KU0030010button2/insert"
expj.KU0030010.KU0030010form1.child30 = function () {
  console.log('KU0030010form1 script36');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/insert');
};
// script37="child;29;CHK;_KU0030010form1/r_SEL_PTN1[eq]true[and]_KU0030010form1/h_SELECT_FG[eq]OK@*31"
expj.KU0030010.KU0030010form1.child29 = function () {
  console.log('KU0030010form1 script37');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN1'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SELECT_FG'), '[eq]', 'OK')) {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
}
};
// script38="child;31;MASK;_KU0030010button2/insert"
expj.KU0030010.KU0030010form1.child31 = function () {
  console.log('KU0030010form1 script38');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/insert');
};
// script39="child;32;CHK;_KU0030010form2/g_JOB_ODR_CD[eq]@*29,*38"
expj.KU0030010.KU0030010form1.child32 = function () {
  console.log('KU0030010form1 script39');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_JOB_ODR_CD'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
} else {
if(expj.common.checkNameSpace(this.child38)){this.child38();}
}
};
// script40="onDecision;9;CHK;_KU0030010form3/g_CUST_CD[neq][and]_KU0030010form3/g_ITEM_CD[neq][and]_KU0030010form2/g_DATE[neq]@*33"
expj.KU0030010.KU0030010form1.onDecision9 = function () {
  console.log('KU0030010form1 script40');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_ITEM_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_DATE'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child33)){this.child33();}
}
};
// script41="child;33;CHK;_KU0030010form1/g_SLIP_CD[neq][and]?KU0030010form1/g_SLIP_CD[eq]SAME[and]_KU0030010form1/h_SELECT_FG[eq]OK@*34"
expj.KU0030010.KU0030010form1.child33 = function () {
  console.log('KU0030010form1 script41');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/g_SLIP_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '?KU0030010form1/g_SLIP_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SELECT_FG'), '[eq]', 'OK')) {
if(expj.common.checkNameSpace(this.child34)){this.child34();}
}
};
// script42="child;34;CHK;_KU0030010form1/r_SEL_PTN1[eq]true@*35"
expj.KU0030010.KU0030010form1.child34 = function () {
  console.log('KU0030010form1 script42');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child35)){this.child35();}
}
};
// script43="child;35;UNMASK;_KU0030010form2/SelectUnitCost"
expj.KU0030010.KU0030010form1.child35 = function () {
  console.log('KU0030010form1 script43');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/SelectUnitCost');
};
// script44="onDecision;10;CHK;_KU0030010form2/h_LOT_CTRL_FLG[eq]1[and]_KU0030010form1/r_SEL_PTN[neq]CANCEL@*36,*37"
expj.KU0030010.KU0030010form1.onDecision10 = function () {
  console.log('KU0030010form1 script44');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/h_LOT_CTRL_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN'), '[neq]', 'CANCEL')) {
if(expj.common.checkNameSpace(this.child36)){this.child36();}
} else {
if(expj.common.checkNameSpace(this.child37)){this.child37();}
}
};
// script45="child;36;UNMASK;_KU0030010form2/g_STOCK_LOT_CD,_KU0030010form2/PeekerStockLotNo"
expj.KU0030010.KU0030010form1.child36 = function () {
  console.log('KU0030010form1 script45');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_STOCK_LOT_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerStockLotNo');
};
// script46="child;37;MASK;_KU0030010form2/g_STOCK_LOT_CD,_KU0030010form2/PeekerStockLotNo"
expj.KU0030010.KU0030010form1.child37 = function () {
  console.log('KU0030010form1 script46');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_STOCK_LOT_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerStockLotNo');
};
// script47="child;38;CHK;_KU0030010form1/g_SLIP_CD[neq][and]_KU0030010form2/g_DATE[neq][and]_KU0030010form2/g_WH_CD[neq][and]_KU0030010form2/g_SALES_DEPT_CD[neq][and]?KU0030010form1/g_SLIP_CD[eq]SAME[and]_KU0030010form1/r_SEL_PTN1[eq]true[and]_KU0030010form1/h_SELECT_FG[eq]OK[and]_KU0030010form1/h_RESULT[eq]OK@*30,*31"
expj.KU0030010.KU0030010form1.child38 = function () {
  console.log('KU0030010form1 script47');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/g_SLIP_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_WH_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SALES_DEPT_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '?KU0030010form1/g_SLIP_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN1'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SELECT_FG'), '[eq]', 'OK') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_RESULT'), '[eq]', 'OK')) {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
} else {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
}
};
expj.KU0030010.KU0030010form1.executeAllOnDecision = function () {
  console.log('execute KU0030010form1.onDecision');
  for (var i = 0; i <= 10; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010form1['onDecision' + i])) {
        expj.KU0030010.KU0030010form1['onDecision' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010form1.executeOnLoad = function () {
  expj.KU0030010.KU0030010form1.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form1.executePScriptOnLoad = function () {
  console.log('execute KU0030010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KU0030010.KU0030010form1['onLoad' + i])) {
      expj.KU0030010.KU0030010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0030010-KU0030010form1" action="KU0030010Servlet" name="KU0030010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKU0030010Control.getReadStatusString()) %>" style="height:69px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:69px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:75px;align:"></div>
<div class="div-td" style="width:75px;align:"></div>
<div class="div-td" style="width:110px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:260px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SLIP_CD",rb)%></span><!-- 伝票番号 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form1-g_SLIP_CD">
expj.KU0030010.KU0030010form1.g_SLIP_CD = {};
expj.KU0030010.KU0030010form1.g_SLIP_CD.executeAllOnDecision = function () {
  console.log('execute KU0030010form1/g_SLIP_CD.onDecision');
  expj.KU0030010.KU0030010form1.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form1.g_SLIP_CD.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form1-g_SLIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form1', 'g_SLIP_CD', this);
  });
  expj.KU0030010.KU0030010form1.g_SLIP_CD.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form1.g_SLIP_CD.executePScriptOnLoad = function () {
  console.log('execute KU0030010form1/g_SLIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form1-g_SLIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form1-g_SLIP_CD" name="g_SLIP_CD" class="KU0030010-focus-move  required-value expj-KU0030010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_SLIP_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form1-PeekerSlipCd">
expj.KU0030010.KU0030010form1.PeekerSlipCd = {};
// script1="onClick;0;PEEKER;_KU0030010form1/g_SLIP_CD@<%=contextNo%>"
expj.KU0030010.KU0030010form1.PeekerSlipCd.onClick0 = function () {
  console.log('PeekerSlipCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0030010';
var parameterValues = 'PeekerSlipCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/g_SLIP_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SHIP_CMPLT_FLG') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%SLIP_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_KU0030010form1/g_SLIP_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0030010.KU0030010form1.PeekerSlipCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010form1.PeekerSlipCd['onClick' + i])) {
        expj.KU0030010.KU0030010form1.PeekerSlipCd['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010form1.PeekerSlipCd.executeAllOnDecision = function () {
};
expj.KU0030010.KU0030010form1.PeekerSlipCd.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form1-PeekerSlipCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010form1', 'PeekerSlipCd', this, 'Button');
    }
  });
  expj.KU0030010.KU0030010form1.PeekerSlipCd.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form1.PeekerSlipCd.executePScriptOnLoad = function () {
  console.log('execute KU0030010form1/PeekerSlipCd.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form1-PeekerSlipCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0030010-KU0030010form1-PeekerSlipCd" class="KU0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form1-h_SHIP_CMPLT_FLG" name="h_SHIP_CMPLT_FLG" class="" data-kind="" maxlength="2147483647" value="">
<script class="expj-script-KU0030010-KU0030010form1-h_SHIP_CMPLT_FLG">
expj.KU0030010.KU0030010form1.h_SHIP_CMPLT_FLG = {};
expj.KU0030010.KU0030010form1.h_SHIP_CMPLT_FLG.executeAllOnDecision = function () {
  console.log('execute KU0030010form1/h_SHIP_CMPLT_FLG.onDecision');
  expj.KU0030010.KU0030010form1.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form1.h_SHIP_CMPLT_FLG.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form1-h_SHIP_CMPLT_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form1', 'h_SHIP_CMPLT_FLG', this);
  });
  expj.KU0030010.KU0030010form1.h_SHIP_CMPLT_FLG.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form1.h_SHIP_CMPLT_FLG.executePScriptOnLoad = function () {
  console.log('execute KU0030010form1/h_SHIP_CMPLT_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form1-h_SHIP_CMPLT_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form1-r_SEL_PTN1">
expj.KU0030010.KU0030010form1.r_SEL_PTN1 = {};
// script1="onClick;0;UNMASK;_KU0030010form2/g_UNIT_PRICE,_KU0030010form2/g_WH_CD,_KU0030010form2/PeekerWhCd,_KU0030010form2/g_SALES_DEPT_CD,_KU0030010form2/PeekerIOrgCd"
expj.KU0030010.KU0030010form1.r_SEL_PTN1.onClick0 = function () {
  console.log('r_SEL_PTN1 script1');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_UNIT_PRICE');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_WH_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerWhCd');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SALES_DEPT_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerIOrgCd');
};
// script2="onClick;1;SET;_KU0030010form1/g_SLIP_CD=,_KU0030010form1/h_SHIP_CMPLT_FLG=0,_KU0030010form2/g_DESINATED_SHIP_DATE=,_KU0030010form2/g_DATE=,_KU0030010form2/g_SHIP_QTY2=0,_KU0030010form2/g_SHIP_QTY=0,_KU0030010form2/h_SHIP_QTY=,_KU0030010form2/g_UNIT_PRICE=0,_KU0030010form2/g_SHIP_ODR_AMOUNT=0,_KU0030010form2/h_EXCH_TYP=,_KU0030010form2/g_WH_CD=,_KU0030010form2/g_REMARKS=,_KU0030010form2/g_CURRNCY=,_KU0030010form3/g_CUST_ANAME=,_KU0030010form3/g_CUST_ITEM_CD=,_KU0030010form3/g_ITEM_CD=,_KU0030010form3/h_ITEM_CD=,_KU0030010form3/h_AP_SECRTY_TYP=,_KU0030010form3/h_MODFIY_CNT=,_KU0030010form3/h_RETURN_QTY=,_KU0030010form3/h_TOTAL_SHIP_QTY=,_KU0030010form1/h_RESULT=NG,_KU0030010form1/h_SELECT_FG=NG,_KU0030010form2/g_CUR_UNIT=,_KU0030010form2/g_JOB_ODR_CD=,_KU0030010form2/c_JOB_ODR_CD=false,_KU0030010form3/h_MRP_ODR_TYP=,_KU0030010form2/g_DIRECT_DLV_FLG=false,_KU0030010form2/g_STOCK_LOT_CD="
expj.KU0030010.KU0030010form1.r_SEL_PTN1.onClick1 = function () {
  console.log('r_SEL_PTN1 script2');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/g_SLIP_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SHIP_CMPLT_FLG', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_DESINATED_SHIP_DATE', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_DATE', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SHIP_QTY2', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SHIP_QTY', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/h_SHIP_QTY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_UNIT_PRICE', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SHIP_ODR_AMOUNT', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/h_EXCH_TYP', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_WH_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_REMARKS', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_CURRNCY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ANAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_AP_SECRTY_TYP', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_MODFIY_CNT', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_RETURN_QTY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_TOTAL_SHIP_QTY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_RESULT', 'NG');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SELECT_FG', 'NG');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_CUR_UNIT', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_JOB_ODR_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/c_JOB_ODR_CD', 'false');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_MRP_ODR_TYP', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_DIRECT_DLV_FLG', 'false');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_STOCK_LOT_CD', '');
};
// script3="onClick;2;SET;_KU0030010form2/g_STOCK_UNIT=,_KU0030010form2/g_STOCK_UNIT2=,_KU0030010form2/g_CUR_UNIT2=,_KU0030010form2/g_WH_NAME=,_KU0030010form2/g_SALES_DEPT_CD=,_KU0030010form2/g_ORG_NAME=,_KU0030010form3/g_CUST_ANAME=,_KU0030010form3/g_CUST_CD=,_KU0030010form3/g_CUST_ITEM_NAME=,_KU0030010form3/g_ITEM_NAME=,_KU0030010form3/g_CUST_ODR_NO=,_KU0030010form3/g_ODR_NO=,_KU0030010form3/g_PART_DLV_SEQ_NO=,_KU0030010form3/g_SHIP_ODR_NO="
expj.KU0030010.KU0030010form1.r_SEL_PTN1.onClick2 = function () {
  console.log('r_SEL_PTN1 script3');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_STOCK_UNIT', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_STOCK_UNIT2', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_CUR_UNIT2', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_WH_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SALES_DEPT_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_ORG_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ANAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ITEM_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_ITEM_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_PART_DLV_SEQ_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_SHIP_ODR_NO', '');
};
// script4="onClick;3;MASK;_KU0030010button1/search,_KU0030010form2/g_SHIP_QTY2,_KU0030010form2/SelectUnitCost,_KU0030010button2/insert,_KU0030010button2/torikeshi,_KU0030010button2/recall,_KU0030010form2/g_JOB_ODR_CD,_KU0030010form2/PeekerJobOdrCd,_KU0030010form2/c_JOB_ODR_CD,_KU0030010form2/g_STOCK_LOT_CD,_KU0030010form2/PeekerStockLotNo"
expj.KU0030010.KU0030010form1.r_SEL_PTN1.onClick3 = function () {
  console.log('r_SEL_PTN1 script4');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button1/search');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SHIP_QTY2');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/SelectUnitCost');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/torikeshi');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/recall');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerJobOdrCd');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/c_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_STOCK_LOT_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerStockLotNo');
};
// script5="onClick;4;SET;_KU0030010form1/k_MODE=ORDER"
expj.KU0030010.KU0030010form1.r_SEL_PTN1.onClick4 = function () {
  console.log('r_SEL_PTN1 script5');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/k_MODE', 'ORDER');
};
// script6="onClick;5;SET;_KU0030010form1/r_SEL_PTN=ORDER"
expj.KU0030010.KU0030010form1.r_SEL_PTN1.onClick5 = function () {
  console.log('r_SEL_PTN1 script6');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN', 'ORDER');
};
expj.KU0030010.KU0030010form1.r_SEL_PTN1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010form1.r_SEL_PTN1['onClick' + i])) {
        expj.KU0030010.KU0030010form1.r_SEL_PTN1['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010form1.r_SEL_PTN1.executeAllOnDecision = function () {
  console.log('execute KU0030010form1/r_SEL_PTN1.onDecision');
  expj.KU0030010.KU0030010form1.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form1.r_SEL_PTN1.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form1-r_SEL_PTN1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010form1', 'r_SEL_PTN1', this, 'RadioButton');
    }
  });
  expj.KU0030010.KU0030010form1.r_SEL_PTN1.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form1.r_SEL_PTN1.executePScriptOnLoad = function () {
  console.log('execute KU0030010form1/r_SEL_PTN1.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form1-r_SEL_PTN1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="radio" name="r_SEL_PTN0" data-name="r_SEL_PTN1" value="true" <%= ("true".equals(TypeConverter.convert(aKU0030010Struct.getr_SEL_PTN1())) || "".equals(TypeConverter.convert(aKU0030010Struct.getr_SEL_PTN1())))?"checked=\"checked\"": "" %> class="" id="expj-KU0030010-KU0030010form1-r_SEL_PTN1" ><label for="expj-KU0030010-KU0030010form1-r_SEL_PTN1"><%=CoreTools.getRBString("Expj.Cmt0479",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<input type="hidden" id="expj-KU0030010-KU0030010form1-h_RESULT" name="h_RESULT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_RESULT()) %>">
<script class="expj-script-KU0030010-KU0030010form1-h_RESULT">
expj.KU0030010.KU0030010form1.h_RESULT = {};
expj.KU0030010.KU0030010form1.h_RESULT.executeAllOnDecision = function () {
  console.log('execute KU0030010form1/h_RESULT.onDecision');
  expj.KU0030010.KU0030010form1.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form1.h_RESULT.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form1-h_RESULT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form1', 'h_RESULT', this);
  });
  expj.KU0030010.KU0030010form1.h_RESULT.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form1.h_RESULT.executePScriptOnLoad = function () {
  console.log('execute KU0030010form1/h_RESULT.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form1-h_RESULT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form1-m_selRadio" name="m_selRadio" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getm_selRadio()) %>">
<script class="expj-script-KU0030010-KU0030010form1-m_selRadio">
expj.KU0030010.KU0030010form1.m_selRadio = {};
expj.KU0030010.KU0030010form1.m_selRadio.executeAllOnDecision = function () {
  console.log('execute KU0030010form1/m_selRadio.onDecision');
  expj.KU0030010.KU0030010form1.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form1.m_selRadio.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form1-m_selRadio').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form1', 'm_selRadio', this);
  });
  expj.KU0030010.KU0030010form1.m_selRadio.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form1.m_selRadio.executePScriptOnLoad = function () {
  console.log('execute KU0030010form1/m_selRadio.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form1-m_selRadio');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:75px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form1-h_GYOMU_DATE" name="h_GYOMU_DATE" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_GYOMU_DATE()) %>">
<script class="expj-script-KU0030010-KU0030010form1-h_GYOMU_DATE">
expj.KU0030010.KU0030010form1.h_GYOMU_DATE = {};
expj.KU0030010.KU0030010form1.h_GYOMU_DATE.executeAllOnDecision = function () {
  console.log('execute KU0030010form1/h_GYOMU_DATE.onDecision');
  expj.KU0030010.KU0030010form1.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form1.h_GYOMU_DATE.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form1-h_GYOMU_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form1', 'h_GYOMU_DATE', this);
  });
  expj.KU0030010.KU0030010form1.h_GYOMU_DATE.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form1.h_GYOMU_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0030010form1/h_GYOMU_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form1-h_GYOMU_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:75px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form1-r_SEL_PTN" name="r_SEL_PTN" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getr_SEL_PTN()) %>">
<script class="expj-script-KU0030010-KU0030010form1-r_SEL_PTN">
expj.KU0030010.KU0030010form1.r_SEL_PTN = {};
expj.KU0030010.KU0030010form1.r_SEL_PTN.executeAllOnDecision = function () {
  console.log('execute KU0030010form1/r_SEL_PTN.onDecision');
  expj.KU0030010.KU0030010form1.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form1.r_SEL_PTN.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form1-r_SEL_PTN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form1', 'r_SEL_PTN', this);
  });
  expj.KU0030010.KU0030010form1.r_SEL_PTN.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form1.r_SEL_PTN.executePScriptOnLoad = function () {
  console.log('execute KU0030010form1/r_SEL_PTN.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form1-r_SEL_PTN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form1-h_SELECT_FG" name="h_SELECT_FG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_SELECT_FG()) %>">
<script class="expj-script-KU0030010-KU0030010form1-h_SELECT_FG">
expj.KU0030010.KU0030010form1.h_SELECT_FG = {};
expj.KU0030010.KU0030010form1.h_SELECT_FG.executeAllOnDecision = function () {
  console.log('execute KU0030010form1/h_SELECT_FG.onDecision');
  expj.KU0030010.KU0030010form1.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form1.h_SELECT_FG.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form1-h_SELECT_FG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form1', 'h_SELECT_FG', this);
  });
  expj.KU0030010.KU0030010form1.h_SELECT_FG.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form1.h_SELECT_FG.executePScriptOnLoad = function () {
  console.log('execute KU0030010form1/h_SELECT_FG.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form1-h_SELECT_FG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form1-r_SEL_PTN2">
expj.KU0030010.KU0030010form1.r_SEL_PTN2 = {};
// script1="onClick;0;UNMASK;"
expj.KU0030010.KU0030010form1.r_SEL_PTN2.onClick0 = function () {
  console.log('r_SEL_PTN2 script1');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '');
};
// script2="onClick;1;SET;_KU0030010form1/g_SLIP_CD=,_KU0030010form1/h_SHIP_CMPLT_FLG=1,_KU0030010form2/g_DESINATED_SHIP_DATE=,_KU0030010form2/g_DATE=,_KU0030010form2/g_SHIP_QTY2=0,_KU0030010form2/g_SHIP_QTY=0,_KU0030010form2/h_SHIP_QTY=,_KU0030010form2/g_UNIT_PRICE=0,_KU0030010form2/g_SHIP_ODR_AMOUNT=0,_KU0030010form2/h_EXCH_TYP=,_KU0030010form2/g_WH_CD=,_KU0030010form2/g_REMARKS=,_KU0030010form2/g_CURRNCY=,_KU0030010form3/g_CUST_ANAME=,_KU0030010form3/g_CUST_ITEM_CD=,_KU0030010form3/g_ITEM_CD=,_KU0030010form3/h_ITEM_CD=,_KU0030010form3/h_AP_SECRTY_TYP=,_KU0030010form3/h_MODFIY_CNT=,_KU0030010form3/h_RETURN_QTY=,_KU0030010form3/h_TOTAL_SHIP_QTY=,_KU0030010form1/h_RESULT=NG,_KU0030010form1/h_SELECT_FG=NG,_KU0030010form2/g_CUR_UNIT=,_KU0030010form2/g_JOB_ODR_CD=,_KU0030010form2/c_JOB_ODR_CD=false,_KU0030010form3/h_MRP_ODR_TYP=,_KU0030010form2/g_DIRECT_DLV_FLG=false,_KU0030010form2/g_STOCK_LOT_CD="
expj.KU0030010.KU0030010form1.r_SEL_PTN2.onClick1 = function () {
  console.log('r_SEL_PTN2 script2');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/g_SLIP_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SHIP_CMPLT_FLG', '1');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_DESINATED_SHIP_DATE', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_DATE', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SHIP_QTY2', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SHIP_QTY', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/h_SHIP_QTY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_UNIT_PRICE', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SHIP_ODR_AMOUNT', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/h_EXCH_TYP', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_WH_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_REMARKS', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_CURRNCY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ANAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_AP_SECRTY_TYP', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_MODFIY_CNT', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_RETURN_QTY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_TOTAL_SHIP_QTY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_RESULT', 'NG');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SELECT_FG', 'NG');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_CUR_UNIT', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_JOB_ODR_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/c_JOB_ODR_CD', 'false');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_MRP_ODR_TYP', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_DIRECT_DLV_FLG', 'false');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_STOCK_LOT_CD', '');
};
// script3="onClick;2;SET;_KU0030010form2/g_STOCK_UNIT=,_KU0030010form2/g_STOCK_UNIT2=,_KU0030010form2/g_CUR_UNIT2=,_KU0030010form2/g_WH_NAME=,_KU0030010form2/g_SALES_DEPT_CD=,_KU0030010form2/g_ORG_NAME=,_KU0030010form3/g_CUST_ANAME=,_KU0030010form3/g_CUST_CD=,_KU0030010form3/g_CUST_ITEM_NAME=,_KU0030010form3/g_ITEM_NAME=,_KU0030010form3/g_CUST_ODR_NO=,_KU0030010form3/g_ODR_NO=,_KU0030010form3/g_PART_DLV_SEQ_NO=,_KU0030010form3/g_SHIP_ODR_NO="
expj.KU0030010.KU0030010form1.r_SEL_PTN2.onClick2 = function () {
  console.log('r_SEL_PTN2 script3');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_STOCK_UNIT', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_STOCK_UNIT2', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_CUR_UNIT2', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_WH_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SALES_DEPT_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_ORG_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ANAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ITEM_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_ITEM_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_PART_DLV_SEQ_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_SHIP_ODR_NO', '');
};
// script4="onClick;3;MASK;_KU0030010button1/search,_KU0030010form2/g_SHIP_QTY2,_KU0030010form2/g_UNIT_PRICE,_KU0030010form2/g_WH_CD,_KU0030010form2/PeekerWhCd,_KU0030010form2/g_SALES_DEPT_CD,_KU0030010form2/PeekerIOrgCd,_KU0030010form2/SelectUnitCost,_KU0030010button2/insert,_KU0030010button2/torikeshi,_KU0030010button2/recall,_KU0030010form2/g_JOB_ODR_CD,_KU0030010form2/PeekerJobOdrCd,_KU0030010form2/c_JOB_ODR_CD,_KU0030010form2/g_STOCK_LOT_CD,_KU0030010form2/PeekerStockLotNo"
expj.KU0030010.KU0030010form1.r_SEL_PTN2.onClick3 = function () {
  console.log('r_SEL_PTN2 script4');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button1/search');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SHIP_QTY2');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_UNIT_PRICE');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_WH_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerWhCd');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SALES_DEPT_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerIOrgCd');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/SelectUnitCost');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/torikeshi');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/recall');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerJobOdrCd');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/c_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_STOCK_LOT_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerStockLotNo');
};
// script5="onClick;4;SET;_KU0030010form1/k_MODE=CANCEL"
expj.KU0030010.KU0030010form1.r_SEL_PTN2.onClick4 = function () {
  console.log('r_SEL_PTN2 script5');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/k_MODE', 'CANCEL');
};
// script6="onClick;5;SET;_KU0030010form1/r_SEL_PTN=CANCEL"
expj.KU0030010.KU0030010form1.r_SEL_PTN2.onClick5 = function () {
  console.log('r_SEL_PTN2 script6');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN', 'CANCEL');
};
expj.KU0030010.KU0030010form1.r_SEL_PTN2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010form1.r_SEL_PTN2['onClick' + i])) {
        expj.KU0030010.KU0030010form1.r_SEL_PTN2['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010form1.r_SEL_PTN2.executeAllOnDecision = function () {
  console.log('execute KU0030010form1/r_SEL_PTN2.onDecision');
  expj.KU0030010.KU0030010form1.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form1.r_SEL_PTN2.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form1-r_SEL_PTN2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010form1', 'r_SEL_PTN2', this, 'RadioButton');
    }
  });
  expj.KU0030010.KU0030010form1.r_SEL_PTN2.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form1.r_SEL_PTN2.executePScriptOnLoad = function () {
  console.log('execute KU0030010form1/r_SEL_PTN2.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form1-r_SEL_PTN2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="radio" name="r_SEL_PTN0" data-name="r_SEL_PTN2" value="true" <%= ("true".equals(TypeConverter.convert(aKU0030010Struct.getr_SEL_PTN2())))?"checked=\"checked\"":"" %> class="" id="expj-KU0030010-KU0030010form1-r_SEL_PTN2" ><label for="expj-KU0030010-KU0030010form1-r_SEL_PTN2"><%=CoreTools.getRBString("Expj.Cmt0480",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<input type="hidden" id="expj-KU0030010-KU0030010form1-k_MODE" name="k_MODE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getk_MODE()) %>">
<script class="expj-script-KU0030010-KU0030010form1-k_MODE">
expj.KU0030010.KU0030010form1.k_MODE = {};
expj.KU0030010.KU0030010form1.k_MODE.executeAllOnDecision = function () {
  console.log('execute KU0030010form1/k_MODE.onDecision');
  expj.KU0030010.KU0030010form1.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form1.k_MODE.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form1-k_MODE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form1', 'k_MODE', this);
  });
  expj.KU0030010.KU0030010form1.k_MODE.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form1.k_MODE.executePScriptOnLoad = function () {
  console.log('execute KU0030010form1/k_MODE.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form1-k_MODE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:75px;"></div><!--/td-->
<div class="div-td" style="width:75px;"></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form1-r_SEL_PTN3">
expj.KU0030010.KU0030010form1.r_SEL_PTN3 = {};
// script1="onClick;0;UNMASK;_KU0030010form2/g_SHIP_QTY2"
expj.KU0030010.KU0030010form1.r_SEL_PTN3.onClick0 = function () {
  console.log('r_SEL_PTN3 script1');
expj.common.pscript.setUnMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SHIP_QTY2');
};
// script2="onClick;1;SET;_KU0030010form1/g_SLIP_CD=,_KU0030010form1/h_SHIP_CMPLT_FLG=1,_KU0030010form2/g_DESINATED_SHIP_DATE=,_KU0030010form2/g_DATE=,_KU0030010form2/g_SHIP_QTY2=0,_KU0030010form2/g_SHIP_QTY=0,_KU0030010form2/h_SHIP_QTY=,_KU0030010form2/g_UNIT_PRICE=0,_KU0030010form2/g_SHIP_ODR_AMOUNT=0,_KU0030010form2/h_EXCH_TYP=,_KU0030010form2/g_WH_CD=,_KU0030010form2/g_REMARKS=,_KU0030010form2/g_CURRNCY=,_KU0030010form3/g_CUST_ANAME=,_KU0030010form3/g_CUST_ITEM_CD=,_KU0030010form3/g_ITEM_CD=,_KU0030010form3/h_ITEM_CD=,_KU0030010form3/h_AP_SECRTY_TYP=,_KU0030010form3/h_MODFIY_CNT=,_KU0030010form3/h_RETURN_QTY=,_KU0030010form3/h_TOTAL_SHIP_QTY=,_KU0030010form1/h_RESULT=NG,_KU0030010form1/h_SELECT_FG=NG,_KU0030010form2/g_CUR_UNIT=,_KU0030010form2/g_JOB_ODR_CD=,_KU0030010form2/c_JOB_ODR_CD=false,_KU0030010form3/h_MRP_ODR_TYP=,_KU0030010form2/g_DIRECT_DLV_FLG=false,_KU0030010form2/g_STOCK_LOT_CD="
expj.KU0030010.KU0030010form1.r_SEL_PTN3.onClick1 = function () {
  console.log('r_SEL_PTN3 script2');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/g_SLIP_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SHIP_CMPLT_FLG', '1');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_DESINATED_SHIP_DATE', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_DATE', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SHIP_QTY2', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SHIP_QTY', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/h_SHIP_QTY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_UNIT_PRICE', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SHIP_ODR_AMOUNT', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/h_EXCH_TYP', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_WH_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_REMARKS', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_CURRNCY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ANAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_AP_SECRTY_TYP', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_MODFIY_CNT', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_RETURN_QTY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_TOTAL_SHIP_QTY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_RESULT', 'NG');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/h_SELECT_FG', 'NG');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_CUR_UNIT', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_JOB_ODR_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/c_JOB_ODR_CD', 'false');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/h_MRP_ODR_TYP', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_DIRECT_DLV_FLG', 'false');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_STOCK_LOT_CD', '');
};
// script3="onClick;2;SET;_KU0030010form2/g_STOCK_UNIT=,_KU0030010form2/g_STOCK_UNIT2=,_KU0030010form2/g_CUR_UNIT2=,_KU0030010form2/g_WH_NAME=,_KU0030010form2/g_SALES_DEPT_CD=,_KU0030010form2/g_ORG_NAME=,_KU0030010form3/g_CUST_ANAME=,_KU0030010form3/g_CUST_CD=,_KU0030010form3/g_CUST_ITEM_NAME=,_KU0030010form3/g_ITEM_NAME=,_KU0030010form3/g_CUST_ODR_NO=,_KU0030010form3/g_ODR_NO=,_KU0030010form3/g_PART_DLV_SEQ_NO=,_KU0030010form3/g_SHIP_ODR_NO="
expj.KU0030010.KU0030010form1.r_SEL_PTN3.onClick2 = function () {
  console.log('r_SEL_PTN3 script3');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_STOCK_UNIT', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_STOCK_UNIT2', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_CUR_UNIT2', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_WH_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SALES_DEPT_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form2/g_ORG_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ANAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ITEM_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_ITEM_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_CUST_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_PART_DLV_SEQ_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form3/g_SHIP_ODR_NO', '');
};
// script4="onClick;3;MASK;_KU0030010button1/search,_KU0030010form2/g_UNIT_PRICE,_KU0030010form2/g_WH_CD,_KU0030010form2/PeekerWhCd,_KU0030010form2/g_SALES_DEPT_CD,_KU0030010form2/PeekerIOrgCd,_KU0030010form2/SelectUnitCost,_KU0030010button2/insert,_KU0030010button2/torikeshi,_KU0030010button2/recall,_KU0030010form2/g_JOB_ODR_CD,_KU0030010form2/PeekerJobOdrCd,_KU0030010form2/c_JOB_ODR_CD,_KU0030010form2/g_STOCK_LOT_CD,_KU0030010form2/PeekerStockLotNo"
expj.KU0030010.KU0030010form1.r_SEL_PTN3.onClick3 = function () {
  console.log('r_SEL_PTN3 script4');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button1/search');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_UNIT_PRICE');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_WH_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerWhCd');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_SALES_DEPT_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerIOrgCd');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/SelectUnitCost');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/torikeshi');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010button2/recall');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerJobOdrCd');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/c_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/g_STOCK_LOT_CD');
expj.common.pscript.setMaskToReferenceComponent('KU0030010', 'KU0030010form1', '_KU0030010form2/PeekerStockLotNo');
};
// script5="onClick;4;SET;_KU0030010form1/k_MODE=RECALL"
expj.KU0030010.KU0030010form1.r_SEL_PTN3.onClick4 = function () {
  console.log('r_SEL_PTN3 script5');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/k_MODE', 'RECALL');
};
// script6="onClick;5;SET;_KU0030010form1/r_SEL_PTN=RECALL"
expj.KU0030010.KU0030010form1.r_SEL_PTN3.onClick5 = function () {
  console.log('r_SEL_PTN3 script6');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form1', '_KU0030010form1/r_SEL_PTN', 'RECALL');
};
expj.KU0030010.KU0030010form1.r_SEL_PTN3.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010form1.r_SEL_PTN3['onClick' + i])) {
        expj.KU0030010.KU0030010form1.r_SEL_PTN3['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010form1.r_SEL_PTN3.executeAllOnDecision = function () {
  console.log('execute KU0030010form1/r_SEL_PTN3.onDecision');
  expj.KU0030010.KU0030010form1.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form1.r_SEL_PTN3.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form1-r_SEL_PTN3').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010form1', 'r_SEL_PTN3', this, 'RadioButton');
    }
  });
  expj.KU0030010.KU0030010form1.r_SEL_PTN3.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form1.r_SEL_PTN3.executePScriptOnLoad = function () {
  console.log('execute KU0030010form1/r_SEL_PTN3.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form1-r_SEL_PTN3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="radio" name="r_SEL_PTN0" data-name="r_SEL_PTN3" value="true" <%= ("true".equals(TypeConverter.convert(aKU0030010Struct.getr_SEL_PTN3())))?"checked=\"checked\"":"" %> class="" id="expj-KU0030010-KU0030010form1-r_SEL_PTN3" ><label for="expj-KU0030010-KU0030010form1-r_SEL_PTN3"><%=CoreTools.getRBString("Expj.Cmt0481",rb)%></label></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KU0030010-KU0030010button1">
expj.KU0030010.KU0030010button1 = {};
expj.KU0030010.KU0030010button1.executeAllOnDecision = function () {
  console.log('execute KU0030010button1.onDecision');
};
expj.KU0030010.KU0030010button1.executeOnLoad = function () {
  expj.KU0030010.KU0030010button1.executePScriptOnLoad();
};

expj.KU0030010.KU0030010button1.executePScriptOnLoad = function () {
  console.log('execute KU0030010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0030010-KU0030010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0030010-KU0030010button1-search">
expj.KU0030010.KU0030010button1.search = {};
// script1="onClick;0;SET;_KU0030010form2/g_DESINATED_SHIP_DATE=,_KU0030010form2/g_DATE=,_KU0030010form2/g_SHIP_QTY2=0,_KU0030010form2/g_SHIP_QTY=0,_KU0030010form2/h_SHIP_QTY=,_KU0030010form2/g_UNIT_PRICE=0,_KU0030010form2/g_SHIP_ODR_AMOUNT=0,_KU0030010form2/h_EXCH_TYP=,_KU0030010form2/g_WH_CD=,_KU0030010form2/g_REMARKS=,_KU0030010form2/g_CURRNCY=,_KU0030010form3/g_CUST_ANAME=,_KU0030010form3/g_CUST_ITEM_CD=,_KU0030010form3/g_ITEM_CD=,_KU0030010form3/h_ITEM_CD=,_KU0030010form3/h_AP_SECRTY_TYP=,_KU0030010form3/h_MODFIY_CNT=,_KU0030010form3/h_RETURN_QTY=,_KU0030010form3/h_TOTAL_SHIP_QTY=,_KU0030010form2/g_STOCK_LOT_CD="
expj.KU0030010.KU0030010button1.search.onClick0 = function () {
  console.log('search script1');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_DESINATED_SHIP_DATE', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_DATE', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_SHIP_QTY2', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_SHIP_QTY', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/h_SHIP_QTY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_UNIT_PRICE', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_SHIP_ODR_AMOUNT', '0');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/h_EXCH_TYP', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_WH_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_REMARKS', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_CURRNCY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/g_CUST_ANAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/g_CUST_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/g_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/h_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/h_AP_SECRTY_TYP', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/h_MODFIY_CNT', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/h_RETURN_QTY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/h_TOTAL_SHIP_QTY', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_STOCK_LOT_CD', '');
};
// script2="onClick;1;SET;_KU0030010form2/g_STOCK_UNIT=,_KU0030010form2/g_STOCK_UNIT2=,_KU0030010form2/g_CUR_UNIT2=,_KU0030010form2/g_WH_NAME=,_KU0030010form2/g_SALES_DEPT_CD=,_KU0030010form2/g_ORG_NAME=,_KU0030010form3/g_CUST_ANAME=,_KU0030010form3/g_CUST_CD=,_KU0030010form3/g_CUST_ITEM_NAME=,_KU0030010form3/g_ITEM_NAME=,_KU0030010form3/g_CUST_ODR_NO=,_KU0030010form3/g_ODR_NO=,_KU0030010form3/g_PART_DLV_SEQ_NO=,_KU0030010form3/g_SHIP_ODR_NO="
expj.KU0030010.KU0030010button1.search.onClick1 = function () {
  console.log('search script2');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_STOCK_UNIT', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_STOCK_UNIT2', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_CUR_UNIT2', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_WH_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_SALES_DEPT_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form2/g_ORG_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/g_CUST_ANAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/g_CUST_CD', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/g_CUST_ITEM_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/g_ITEM_NAME', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/g_CUST_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/g_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/g_PART_DLV_SEQ_NO', '');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form3/g_SHIP_ODR_NO', '');
};
// script3="onClick;2;SET;_KU0030010form1/k_MODE=SEARCH,_KU0030010form1/h_RESULT=NG,_KU0030010form1/h_SELECT_FG=NG"
expj.KU0030010.KU0030010button1.search.onClick2 = function () {
  console.log('search script3');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form1/k_MODE', 'SEARCH');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form1/h_RESULT', 'NG');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button1', '_KU0030010form1/h_SELECT_FG', 'NG');
};
// script4="onClick;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0030010form1/*,_KU0030010form2/*,_KU0030010form3/*@KU0030010Servlet"
expj.KU0030010.KU0030010button1.search.onClick3 = function () {
  console.log('search script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0030010', 'KU0030010button1', '_KU0030010form1/*,_KU0030010form2/*,_KU0030010form3/*', 'KU0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0030010', response);
expj.common.updateBusinessScreenTab('KU0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KU0030010.KU0030010button1.search.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010button1.search['onClick' + i])) {
        expj.KU0030010.KU0030010button1.search['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010button1.search.executeAllOnDecision = function () {
};
expj.KU0030010.KU0030010button1.search.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010button1-search').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010button1', 'search', this, 'Button');
    }
  });
  expj.KU0030010.KU0030010button1.search.executePScriptOnLoad();
};

expj.KU0030010.KU0030010button1.search.executePScriptOnLoad = function () {
  console.log('execute KU0030010button1/search.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010button1-search');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0030010-KU0030010button1-search" name="search" class="KU0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<!--two end --><!--four start --><div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<!--four end --><%
  int aKU0030010StructLength = aKU0030010Control.getListsize();
  final KU0030010Struct structBackup = aKU0030010Struct;
  aKU0030010Struct = null;
  for(int loopCount = 0; loopCount < aKU0030010StructLength; ++loopCount) {

  if((aKU0030010Struct = (KU0030010Struct) aKU0030010Control.getListvalue(loopCount)) == null) continue;

  String  unitFig =  aKU0030010Struct.getUNIT_FIG();
  if (unitFig == null) unitFig = "0";
%><!--five start --><div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに中段検索条件用のDataGridを配置する。↓ --><script class="expj-script-KU0030010-KU0030010form2">
expj.KU0030010.KU0030010form2 = {};
expj.KU0030010.KU0030010form2.executeAllOnDecision = function () {
  console.log('execute KU0030010form2.onDecision');
};
expj.KU0030010.KU0030010form2.executeOnLoad = function () {
  expj.KU0030010.KU0030010form2.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0030010-KU0030010form2" action="KU0030010Servlet" name="KU0030010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SHIP_DATE",rb)%></span><!-- 出荷実績日 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_DATE">
expj.KU0030010.KU0030010form2.g_DATE = {};
expj.KU0030010.KU0030010form2.g_DATE.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_DATE.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_DATE.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_DATE', this);
  });
  expj.KU0030010.KU0030010form2.g_DATE.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_DATE" name="g_DATE" class="KU0030010-focus-move  required-value expj-KU0030010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-PeekerShipDate">
expj.KU0030010.KU0030010form2.PeekerShipDate = {};
// script1="onClick;0;CALENDAR;_KU0030010form2/g_DATE@<%=contextNo%>"
expj.KU0030010.KU0030010form2.PeekerShipDate.onClick0 = function () {
  console.log('PeekerShipDate script1');
expj.common.pscript.executeCalendar('KU0030010','KU0030010form2','_KU0030010form2/g_DATE');
};
expj.KU0030010.KU0030010form2.PeekerShipDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010form2.PeekerShipDate['onClick' + i])) {
        expj.KU0030010.KU0030010form2.PeekerShipDate['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010form2.PeekerShipDate.executeAllOnDecision = function () {
};
expj.KU0030010.KU0030010form2.PeekerShipDate.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-PeekerShipDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010form2', 'PeekerShipDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0030010','KU0030010form2','_KU0030010form2/g_DATE');
  expj.KU0030010.KU0030010form2.PeekerShipDate.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.PeekerShipDate.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/PeekerShipDate.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-PeekerShipDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0030010-KU0030010form2-PeekerShipDate" class="KU0030010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_INST_DATE",rb)%></span><!-- 出荷指定日 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_DESINATED_SHIP_DATE">
expj.KU0030010.KU0030010form2.g_DESINATED_SHIP_DATE = {};
expj.KU0030010.KU0030010form2.g_DESINATED_SHIP_DATE.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_DESINATED_SHIP_DATE.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_DESINATED_SHIP_DATE.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_DESINATED_SHIP_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_DESINATED_SHIP_DATE', this);
  });
  expj.KU0030010.KU0030010form2.g_DESINATED_SHIP_DATE.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_DESINATED_SHIP_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_DESINATED_SHIP_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_DESINATED_SHIP_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_DESINATED_SHIP_DATE" name="g_DESINATED_SHIP_DATE" class="KU0030010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_DESINATED_SHIP_DATE()) %>" maxlength="10" disabled></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SHIP_QTY",rb)%></span><!-- 出荷実績数量 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_SHIP_QTY2">
expj.KU0030010.KU0030010form2.g_SHIP_QTY2 = {};
// script1="onDecision;0;SET;_g_SHIP_ODR_AMOUNT=[{_g_UNIT_PRICE}*{_g_SHIP_QTY2}]"
expj.KU0030010.KU0030010form2.g_SHIP_QTY2.onDecision0 = function () {
  console.log('g_SHIP_QTY2 script1');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form2', '_g_SHIP_ODR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form2', '_g_UNIT_PRICE') + '*' + expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form2', '_g_SHIP_QTY2')));
};
expj.KU0030010.KU0030010form2.g_SHIP_QTY2.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_SHIP_QTY2.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010form2.g_SHIP_QTY2['onDecision' + i])) {
        expj.KU0030010.KU0030010form2.g_SHIP_QTY2['onDecision' + i]();
      }
    }
  }
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_SHIP_QTY2.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_SHIP_QTY2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_SHIP_QTY2', this);
  });
  expj.KU0030010.KU0030010form2.g_SHIP_QTY2.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_SHIP_QTY2.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_SHIP_QTY2.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_SHIP_QTY2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_SHIP_QTY2" name="g_SHIP_QTY2" class="KU0030010-focus-move expj-align-right required-value expj-KU0030010-required-C" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;CEIL;<%= unitFig%>" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_SHIP_QTY2()) %>" maxlength="19" ></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_STOCK_UNIT">
expj.KU0030010.KU0030010form2.g_STOCK_UNIT = {};
expj.KU0030010.KU0030010form2.g_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_STOCK_UNIT.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_STOCK_UNIT', this);
  });
  expj.KU0030010.KU0030010form2.g_STOCK_UNIT.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_STOCK_UNIT" name="g_STOCK_UNIT" class="KU0030010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_STOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form2-h_SHIP_QTY" name="h_SHIP_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_SHIP_QTY()) %>">
<script class="expj-script-KU0030010-KU0030010form2-h_SHIP_QTY">
expj.KU0030010.KU0030010form2.h_SHIP_QTY = {};
expj.KU0030010.KU0030010form2.h_SHIP_QTY.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/h_SHIP_QTY.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.h_SHIP_QTY.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-h_SHIP_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'h_SHIP_QTY', this);
  });
  expj.KU0030010.KU0030010form2.h_SHIP_QTY.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.h_SHIP_QTY.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/h_SHIP_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-h_SHIP_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_ODR_QTY",rb)%></span><!-- 出荷指示数量 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_SHIP_QTY">
expj.KU0030010.KU0030010form2.g_SHIP_QTY = {};
expj.KU0030010.KU0030010form2.g_SHIP_QTY.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_SHIP_QTY.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_SHIP_QTY.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_SHIP_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_SHIP_QTY', this);
  });
  expj.KU0030010.KU0030010form2.g_SHIP_QTY.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_SHIP_QTY.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_SHIP_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_SHIP_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_SHIP_QTY" name="g_SHIP_QTY" class="KU0030010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;CEIL;4" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_SHIP_QTY()) %>" maxlength="19" disabled></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_STOCK_UNIT2">
expj.KU0030010.KU0030010form2.g_STOCK_UNIT2 = {};
expj.KU0030010.KU0030010form2.g_STOCK_UNIT2.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_STOCK_UNIT2.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_STOCK_UNIT2.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_STOCK_UNIT2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_STOCK_UNIT2', this);
  });
  expj.KU0030010.KU0030010form2.g_STOCK_UNIT2.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_STOCK_UNIT2.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_STOCK_UNIT2.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_STOCK_UNIT2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_STOCK_UNIT2" name="g_STOCK_UNIT2" class="KU0030010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_STOCK_UNIT2()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ACTUAL_UNIT_PRICE",rb)%></span><!-- 単価 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_UNIT_PRICE">
expj.KU0030010.KU0030010form2.g_UNIT_PRICE = {};
// script1="onDecision;0;SET;_g_SHIP_ODR_AMOUNT=[{_g_UNIT_PRICE}*{_g_SHIP_QTY2}]"
expj.KU0030010.KU0030010form2.g_UNIT_PRICE.onDecision0 = function () {
  console.log('g_UNIT_PRICE script1');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010form2', '_g_SHIP_ODR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form2', '_g_UNIT_PRICE') + '*' + expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form2', '_g_SHIP_QTY2')));
};
expj.KU0030010.KU0030010form2.g_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_UNIT_PRICE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010form2.g_UNIT_PRICE['onDecision' + i])) {
        expj.KU0030010.KU0030010form2.g_UNIT_PRICE['onDecision' + i]();
      }
    }
  }
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_UNIT_PRICE', this);
  });
  expj.KU0030010.KU0030010form2.g_UNIT_PRICE.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_UNIT_PRICE" name="g_UNIT_PRICE" class="KU0030010-focus-move expj-align-right required-value expj-KU0030010-required-D" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;CEIL;4" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_UNIT_PRICE()) %>" maxlength="19" ></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_CUR_UNIT">
expj.KU0030010.KU0030010form2.g_CUR_UNIT = {};
expj.KU0030010.KU0030010form2.g_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_CUR_UNIT.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_CUR_UNIT.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_CUR_UNIT', this);
  });
  expj.KU0030010.KU0030010form2.g_CUR_UNIT.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_CUR_UNIT" name="g_CUR_UNIT" class="KU0030010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_CUR_UNIT()) %>" maxlength="40" disabled></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form2-h_UNIT_PRICE" name="h_UNIT_PRICE" class="" data-kind="OBT_NUMBER_Z;14.2;CEIL;4" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_UNIT_PRICE()) %>">
<script class="expj-script-KU0030010-KU0030010form2-h_UNIT_PRICE">
expj.KU0030010.KU0030010form2.h_UNIT_PRICE = {};
expj.KU0030010.KU0030010form2.h_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/h_UNIT_PRICE.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.h_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-h_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'h_UNIT_PRICE', this);
  });
  expj.KU0030010.KU0030010form2.h_UNIT_PRICE.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.h_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/h_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-h_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-KU0030010-KU0030010form2-h_EXCH_TYP" name="h_EXCH_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_EXCH_TYP()) %>">
<script class="expj-script-KU0030010-KU0030010form2-h_EXCH_TYP">
expj.KU0030010.KU0030010form2.h_EXCH_TYP = {};
expj.KU0030010.KU0030010form2.h_EXCH_TYP.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/h_EXCH_TYP.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.h_EXCH_TYP.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-h_EXCH_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'h_EXCH_TYP', this);
  });
  expj.KU0030010.KU0030010form2.h_EXCH_TYP.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.h_EXCH_TYP.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/h_EXCH_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-h_EXCH_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-SelectUnitCost">
expj.KU0030010.KU0030010form2.SelectUnitCost = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0030010form1/*,_KU0030010form2/*@KU0030010Servlet"
expj.KU0030010.KU0030010form2.SelectUnitCost.onClick0 = function () {
  console.log('SelectUnitCost script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0030010', 'KU0030010form2', '_KU0030010form1/*,_KU0030010form2/*', 'KU0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0030010', response);
expj.common.updateBusinessScreenTab('KU0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KU0030010.KU0030010form2.SelectUnitCost.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010form2.SelectUnitCost['onClick' + i])) {
        expj.KU0030010.KU0030010form2.SelectUnitCost['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010form2.SelectUnitCost.executeAllOnDecision = function () {
};
expj.KU0030010.KU0030010form2.SelectUnitCost.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-SelectUnitCost').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010form2', 'SelectUnitCost', this, 'Button');
    }
  });
  expj.KU0030010.KU0030010form2.SelectUnitCost.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.SelectUnitCost.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/SelectUnitCost.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-SelectUnitCost');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-KU0030010-KU0030010form2-SelectUnitCost" name="SelectUnitCost" class="KU0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelectUnitCost",rb)%></button><!-- 単価読込ボタン --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form2-h_DATE" name="h_DATE" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_DATE()) %>">
<script class="expj-script-KU0030010-KU0030010form2-h_DATE">
expj.KU0030010.KU0030010form2.h_DATE = {};
expj.KU0030010.KU0030010form2.h_DATE.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/h_DATE.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.h_DATE.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-h_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'h_DATE', this);
  });
  expj.KU0030010.KU0030010form2.h_DATE.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.h_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/h_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-h_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_AMOUNT",rb)%></span><!-- 出荷実績金額 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_SHIP_ODR_AMOUNT">
expj.KU0030010.KU0030010form2.g_SHIP_ODR_AMOUNT = {};
expj.KU0030010.KU0030010form2.g_SHIP_ODR_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_SHIP_ODR_AMOUNT.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_SHIP_ODR_AMOUNT.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_SHIP_ODR_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_SHIP_ODR_AMOUNT', this);
  });
  expj.KU0030010.KU0030010form2.g_SHIP_ODR_AMOUNT.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_SHIP_ODR_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_SHIP_ODR_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_SHIP_ODR_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_SHIP_ODR_AMOUNT" name="g_SHIP_ODR_AMOUNT" class="KU0030010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.2;<%=aKU0030010Struct.getROUND_TYP()%>;<%=aKU0030010Struct.getDECIMAL_FIG()%>" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_SHIP_ODR_AMOUNT()) %>" maxlength="19" disabled></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_CUR_UNIT2">
expj.KU0030010.KU0030010form2.g_CUR_UNIT2 = {};
expj.KU0030010.KU0030010form2.g_CUR_UNIT2.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_CUR_UNIT2.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_CUR_UNIT2.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_CUR_UNIT2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_CUR_UNIT2', this);
  });
  expj.KU0030010.KU0030010form2.g_CUR_UNIT2.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_CUR_UNIT2.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_CUR_UNIT2.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_CUR_UNIT2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_CUR_UNIT2" name="g_CUR_UNIT2" class="KU0030010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_CUR_UNIT2()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WH_CD",rb)%></span><!-- 保管区コード --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_WH_CD">
expj.KU0030010.KU0030010form2.g_WH_CD = {};
expj.KU0030010.KU0030010form2.g_WH_CD.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_WH_CD.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_WH_CD.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_WH_CD', this);
  });
  expj.KU0030010.KU0030010form2.g_WH_CD.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_WH_CD.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_WH_CD" name="g_WH_CD" class="KU0030010-focus-move  required-value expj-KU0030010-required-E" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_WH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-PeekerWhCd">
expj.KU0030010.KU0030010form2.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_KU0030010form2/g_WH_CD@<%=contextNo%>"
expj.KU0030010.KU0030010form2.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0030010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form2', '_KU0030010form3/g_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form2', '_KU0030010form2/g_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_12%&%';
parameterValues += 'TARGET_FIELD%=%_KU0030010form2/g_WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0030010.KU0030010form2.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010form2.PeekerWhCd['onClick' + i])) {
        expj.KU0030010.KU0030010form2.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010form2.PeekerWhCd.executeAllOnDecision = function () {
};
expj.KU0030010.KU0030010form2.PeekerWhCd.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010form2', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.KU0030010.KU0030010form2.PeekerWhCd.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0030010-KU0030010form2-PeekerWhCd" class="KU0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_WH_NAME">
expj.KU0030010.KU0030010form2.g_WH_NAME = {};
expj.KU0030010.KU0030010form2.g_WH_NAME.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_WH_NAME.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_WH_NAME.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_WH_NAME', this);
  });
  expj.KU0030010.KU0030010form2.g_WH_NAME.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_WH_NAME.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_WH_NAME" name="g_WH_NAME" class="KU0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_WH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SALES_DEPT_CD",rb)%></span><!-- 売上計上部門コード --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_SALES_DEPT_CD">
expj.KU0030010.KU0030010form2.g_SALES_DEPT_CD = {};
expj.KU0030010.KU0030010form2.g_SALES_DEPT_CD.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_SALES_DEPT_CD.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_SALES_DEPT_CD.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_SALES_DEPT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_SALES_DEPT_CD', this);
  });
  expj.KU0030010.KU0030010form2.g_SALES_DEPT_CD.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_SALES_DEPT_CD.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_SALES_DEPT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_SALES_DEPT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_SALES_DEPT_CD" name="g_SALES_DEPT_CD" class="KU0030010-focus-move  required-value expj-KU0030010-required-F" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_SALES_DEPT_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-PeekerIOrgCd">
expj.KU0030010.KU0030010form2.PeekerIOrgCd = {};
// script1="onClick;0;PEEKER;_KU0030010form2/g_SALES_DEPT_CD@<%=contextNo%>"
expj.KU0030010.KU0030010form2.PeekerIOrgCd.onClick0 = function () {
  console.log('PeekerIOrgCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0030010';
var parameterValues = 'PeekerIOrgCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form2', '_KU0030010form2/g_SALES_DEPT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ORG_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KU0030010form2/g_SALES_DEPT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0030010.KU0030010form2.PeekerIOrgCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010form2.PeekerIOrgCd['onClick' + i])) {
        expj.KU0030010.KU0030010form2.PeekerIOrgCd['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010form2.PeekerIOrgCd.executeAllOnDecision = function () {
};
expj.KU0030010.KU0030010form2.PeekerIOrgCd.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-PeekerIOrgCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010form2', 'PeekerIOrgCd', this, 'Button');
    }
  });
  expj.KU0030010.KU0030010form2.PeekerIOrgCd.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.PeekerIOrgCd.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/PeekerIOrgCd.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-PeekerIOrgCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0030010-KU0030010form2-PeekerIOrgCd" class="KU0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_ORG_NAME">
expj.KU0030010.KU0030010form2.g_ORG_NAME = {};
expj.KU0030010.KU0030010form2.g_ORG_NAME.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_ORG_NAME.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_ORG_NAME.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_ORG_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_ORG_NAME', this);
  });
  expj.KU0030010.KU0030010form2.g_ORG_NAME.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_ORG_NAME.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_ORG_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_ORG_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_ORG_NAME" name="g_ORG_NAME" class="KU0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_ORG_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_JOB_ODR_CD">
expj.KU0030010.KU0030010form2.g_JOB_ODR_CD = {};
expj.KU0030010.KU0030010form2.g_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_JOB_ODR_CD.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_JOB_ODR_CD', this);
  });
  expj.KU0030010.KU0030010form2.g_JOB_ODR_CD.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_JOB_ODR_CD" name="g_JOB_ODR_CD" class="KU0030010-focus-move  required-value expj-KU0030010-required-G" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_JOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form2-h_JOB_ODR_CD" name="h_JOB_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_JOB_ODR_CD()) %>">
<script class="expj-script-KU0030010-KU0030010form2-h_JOB_ODR_CD">
expj.KU0030010.KU0030010form2.h_JOB_ODR_CD = {};
expj.KU0030010.KU0030010form2.h_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/h_JOB_ODR_CD.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.h_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-h_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'h_JOB_ODR_CD', this);
  });
  expj.KU0030010.KU0030010form2.h_JOB_ODR_CD.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.h_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/h_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-h_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KU0030010-KU0030010form2-PeekerJobOdrCd">
expj.KU0030010.KU0030010form2.PeekerJobOdrCd = {};
// script1="onClick;0;PEEKER;_KU0030010form2/g_JOB_ODR_CD@<%=contextNo%>"
expj.KU0030010.KU0030010form2.PeekerJobOdrCd.onClick0 = function () {
  console.log('PeekerJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0030010';
var parameterValues = 'PeekerJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form2', '_KU0030010form3/g_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form2', '_KU0030010form2/g_JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form2', '_KU0030010form2/g_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_09%&%';
parameterValues += 'TARGET_FIELD%=%_KU0030010form2/g_JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0030010.KU0030010form2.PeekerJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010form2.PeekerJobOdrCd['onClick' + i])) {
        expj.KU0030010.KU0030010form2.PeekerJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010form2.PeekerJobOdrCd.executeAllOnDecision = function () {
};
expj.KU0030010.KU0030010form2.PeekerJobOdrCd.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-PeekerJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010form2', 'PeekerJobOdrCd', this, 'Button');
    }
  });
  expj.KU0030010.KU0030010form2.PeekerJobOdrCd.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.PeekerJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/PeekerJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-PeekerJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0030010-KU0030010form2-PeekerJobOdrCd" class="KU0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-c_JOB_ODR_CD">
expj.KU0030010.KU0030010form2.c_JOB_ODR_CD = {};
expj.KU0030010.KU0030010form2.c_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/c_JOB_ODR_CD.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.c_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-c_JOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010form2', 'c_JOB_ODR_CD', this, 'CheckBox');
    }
  });
  expj.KU0030010.KU0030010form2.c_JOB_ODR_CD.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.c_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/c_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-c_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_JOB_ODR_CD" value="true" <%= ("true".equals(TypeConverter.convert(aKU0030010Struct.getc_JOB_ODR_CD())) || "1".equals(TypeConverter.convert(aKU0030010Struct.getc_JOB_ODR_CD())))?"checked=\"checked\"":"" %>  class="KU0030010-focus-move" id="expj-KU0030010-KU0030010form2-c_JOB_ODR_CD"><label for="expj-KU0030010-KU0030010form2-c_JOB_ODR_CD"><%=CoreTools.getRBString("Expj.Cmt0210",rb)%></label></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_STOCK_LOT_CD">
expj.KU0030010.KU0030010form2.g_STOCK_LOT_CD = {};
expj.KU0030010.KU0030010form2.g_STOCK_LOT_CD.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_STOCK_LOT_CD.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_STOCK_LOT_CD.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_STOCK_LOT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_STOCK_LOT_CD', this);
  });
  expj.KU0030010.KU0030010form2.g_STOCK_LOT_CD.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_STOCK_LOT_CD.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_STOCK_LOT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_STOCK_LOT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_STOCK_LOT_CD" name="g_STOCK_LOT_CD" class="KU0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_STOCK_LOT_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form2-h_STOCK_LOT_CD" name="h_STOCK_LOT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_STOCK_LOT_CD()) %>">
<script class="expj-script-KU0030010-KU0030010form2-h_STOCK_LOT_CD">
expj.KU0030010.KU0030010form2.h_STOCK_LOT_CD = {};
expj.KU0030010.KU0030010form2.h_STOCK_LOT_CD.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/h_STOCK_LOT_CD.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.h_STOCK_LOT_CD.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-h_STOCK_LOT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'h_STOCK_LOT_CD', this);
  });
  expj.KU0030010.KU0030010form2.h_STOCK_LOT_CD.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.h_STOCK_LOT_CD.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/h_STOCK_LOT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-h_STOCK_LOT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-KU0030010-KU0030010form2-h_LOT_CTRL_FLG" name="h_LOT_CTRL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_LOT_CTRL_FLG()) %>">
<script class="expj-script-KU0030010-KU0030010form2-h_LOT_CTRL_FLG">
expj.KU0030010.KU0030010form2.h_LOT_CTRL_FLG = {};
expj.KU0030010.KU0030010form2.h_LOT_CTRL_FLG.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/h_LOT_CTRL_FLG.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.h_LOT_CTRL_FLG.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-h_LOT_CTRL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'h_LOT_CTRL_FLG', this);
  });
  expj.KU0030010.KU0030010form2.h_LOT_CTRL_FLG.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.h_LOT_CTRL_FLG.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/h_LOT_CTRL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-h_LOT_CTRL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KU0030010-KU0030010form2-PeekerStockLotNo">
expj.KU0030010.KU0030010form2.PeekerStockLotNo = {};
// script1="onClick;0;PEEKER;_KU0030010form2/g_STOCK_LOT_CD@<%=contextNo%>"
expj.KU0030010.KU0030010form2.PeekerStockLotNo.onClick0 = function () {
  console.log('PeekerStockLotNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0030010';
var parameterValues = 'PeekerStockLotNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form2', '_KU0030010form2/g_STOCK_LOT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010form2', '_KU0030010form3/g_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%LOT_NO_08%&%';
parameterValues += 'TARGET_FIELD%=%_KU0030010form2/g_STOCK_LOT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0030010.KU0030010form2.PeekerStockLotNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010form2.PeekerStockLotNo['onClick' + i])) {
        expj.KU0030010.KU0030010form2.PeekerStockLotNo['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010form2.PeekerStockLotNo.executeAllOnDecision = function () {
};
expj.KU0030010.KU0030010form2.PeekerStockLotNo.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-PeekerStockLotNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010form2', 'PeekerStockLotNo', this, 'Button');
    }
  });
  expj.KU0030010.KU0030010form2.PeekerStockLotNo.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.PeekerStockLotNo.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/PeekerStockLotNo.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-PeekerStockLotNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0030010-KU0030010form2-PeekerStockLotNo" class="KU0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form2-param1" name="param1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getparam1()) %>">
<script class="expj-script-KU0030010-KU0030010form2-param1">
expj.KU0030010.KU0030010form2.param1 = {};
expj.KU0030010.KU0030010form2.param1.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/param1.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.param1.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-param1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'param1', this);
  });
  expj.KU0030010.KU0030010form2.param1.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.param1.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/param1.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-param1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REFERENCE",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_REMARKS">
expj.KU0030010.KU0030010form2.g_REMARKS = {};
expj.KU0030010.KU0030010form2.g_REMARKS.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_REMARKS.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_REMARKS.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_REMARKS', this);
  });
  expj.KU0030010.KU0030010form2.g_REMARKS.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_REMARKS.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:602px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form2-g_REMARKS" name="g_REMARKS" class="KU0030010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_REMARKS()) %>" maxlength="100" ></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form2-g_CURRNCY" name="g_CURRNCY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_CURRNCY()) %>">
<script class="expj-script-KU0030010-KU0030010form2-g_CURRNCY">
expj.KU0030010.KU0030010form2.g_CURRNCY = {};
expj.KU0030010.KU0030010form2.g_CURRNCY.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_CURRNCY.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_CURRNCY.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_CURRNCY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'g_CURRNCY', this);
  });
  expj.KU0030010.KU0030010form2.g_CURRNCY.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_CURRNCY.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_CURRNCY.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_CURRNCY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-KU0030010-KU0030010form2-param2" name="param2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getparam2()) %>">
<script class="expj-script-KU0030010-KU0030010form2-param2">
expj.KU0030010.KU0030010form2.param2 = {};
expj.KU0030010.KU0030010form2.param2.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/param2.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.param2.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-param2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'param2', this);
  });
  expj.KU0030010.KU0030010form2.param2.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.param2.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/param2.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-param2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form2-g_DIRECT_DLV_FLG">
expj.KU0030010.KU0030010form2.g_DIRECT_DLV_FLG = {};
expj.KU0030010.KU0030010form2.g_DIRECT_DLV_FLG.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/g_DIRECT_DLV_FLG.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.g_DIRECT_DLV_FLG.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-g_DIRECT_DLV_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010form2', 'g_DIRECT_DLV_FLG', this, 'CheckBox');
    }
  });
  expj.KU0030010.KU0030010form2.g_DIRECT_DLV_FLG.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.g_DIRECT_DLV_FLG.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/g_DIRECT_DLV_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-g_DIRECT_DLV_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="g_DIRECT_DLV_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aKU0030010Struct.getg_DIRECT_DLV_FLG())) || "1".equals(TypeConverter.convert(aKU0030010Struct.getg_DIRECT_DLV_FLG())))?"checked=\"checked\"":"" %>  class="KU0030010-focus-move" id="expj-KU0030010-KU0030010form2-g_DIRECT_DLV_FLG"><label for="expj-KU0030010-KU0030010form2-g_DIRECT_DLV_FLG"><%=CoreTools.getRBString("Expj.DIRECT_DLV_FLG",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form2-param3" name="param3" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getparam3()) %>">
<script class="expj-script-KU0030010-KU0030010form2-param3">
expj.KU0030010.KU0030010form2.param3 = {};
expj.KU0030010.KU0030010form2.param3.executeAllOnDecision = function () {
  console.log('execute KU0030010form2/param3.onDecision');
  expj.KU0030010.KU0030010form2.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form2.param3.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form2-param3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form2', 'param3', this);
  });
  expj.KU0030010.KU0030010form2.param3.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form2.param3.executePScriptOnLoad = function () {
  console.log('execute KU0030010form2/param3.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form2-param3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに中段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-KU0030010-KU0030010button2">
expj.KU0030010.KU0030010button2 = {};
expj.KU0030010.KU0030010button2.executeAllOnDecision = function () {
  console.log('execute KU0030010button2.onDecision');
};
expj.KU0030010.KU0030010button2.executeOnLoad = function () {
  expj.KU0030010.KU0030010button2.executePScriptOnLoad();
};

expj.KU0030010.KU0030010button2.executePScriptOnLoad = function () {
  console.log('execute KU0030010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0030010-KU0030010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0030010-KU0030010button2-insert">
expj.KU0030010.KU0030010button2.insert = {};
// script1="onClick;0;SET;_KU0030010form1/k_MODE=ORDER"
expj.KU0030010.KU0030010button2.insert.onClick0 = function () {
  console.log('insert script1');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form1/k_MODE', 'ORDER');
};
// script2="onClick;1;CHK;_KU0030010form2/g_SHIP_QTY2[lt]0[or]_KU0030010form2/g_SHIP_QTY2[numeq]0@#KU00044"
expj.KU0030010.KU0030010button2.insert.onClick1 = function () {
  console.log('insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_SHIP_QTY2')), '[lt]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_SHIP_QTY2')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('KU0030010', 'KU0030010button2', 'KU00044');
}
};
// script3="onClick;2;CHK;_KU0030010form2/h_SHIP_QTY[lt]_KU0030010form2/g_SHIP_QTY2@#KU00043"
expj.KU0030010.KU0030010button2.insert.onClick2 = function () {
  console.log('insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/h_SHIP_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_SHIP_QTY2')))) {
expj.common.pscript.addErrorMessage('KU0030010', 'KU0030010button2', 'KU00043');
}
};
// script4="onClick;3;CHK;_KU0030010form2/g_DATE[gt]_KU0030010form1/h_GYOMU_DATE@#KU00107"
expj.KU0030010.KU0030010button2.insert.onClick3 = function () {
  console.log('insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form1/h_GYOMU_DATE')))) {
expj.common.pscript.addErrorMessage('KU0030010', 'KU0030010button2', 'KU00107');
}
};
// script5="onClick;4;CHK;_KU0030010form2/g_DATE[lt]_KU0030010form2/h_DATE@#KU02006"
expj.KU0030010.KU0030010button2.insert.onClick4 = function () {
  console.log('insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/h_DATE')))) {
expj.common.pscript.addErrorMessage('KU0030010', 'KU0030010button2', 'KU02006');
}
};
// script6="onClick;5;CHK;_KU0030010form1/h_GYOMU_DATE[neq][and]~TO_YYYY_MM(_KU0030010form2/g_DATE)[lt]~TO_YYYY_MM(_KU0030010form1/h_GYOMU_DATE)@$KU02007"
expj.KU0030010.KU0030010button2.insert.onClick5 = function () {
  console.log('insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form1/h_GYOMU_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KU0030010', 'KU0030010button2', '_KU0030010form2/g_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KU0030010', 'KU0030010button2', '_KU0030010form1/h_GYOMU_DATE')))) {
expj.common.pscript.addWarningMessage('KU0030010', 'KU0030010button2', 'KU02007');
}
};
// script7="onClick;6;CHK;_KU0030010form2/g_UNIT_PRICE[neq]_KU0030010form2/h_UNIT_PRICE@$KU00066"
expj.KU0030010.KU0030010button2.insert.onClick6 = function () {
  console.log('insert script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_UNIT_PRICE'), '[neq]', expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/h_UNIT_PRICE'))) {
expj.common.pscript.addWarningMessage('KU0030010', 'KU0030010button2', 'KU00066');
}
};
// script8="onClick;7;CHK;_KU0030010form2/g_JOB_ODR_CD[neq][and]_KU0030010form2/h_JOB_ODR_CD[neq]@*0,*2"
expj.KU0030010.KU0030010button2.insert.onClick7 = function () {
  console.log('insert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_JOB_ODR_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/h_JOB_ODR_CD'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script9="child;0;CHK;_KU0030010form2/g_JOB_ODR_CD[neq]_KU0030010form2/h_JOB_ODR_CD@*1,*2"
expj.KU0030010.KU0030010button2.insert.child0 = function () {
  console.log('insert script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_JOB_ODR_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/h_JOB_ODR_CD'))) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script10="child;1;CFMPUT;_KU0030010button2/insert=YES:2@KU02016"
expj.KU0030010.KU0030010button2.insert.child1 = function () {
  console.log('insert script10');
var yesFunc = function () {
expj.KU0030010.KU0030010button2.insert.child2();
};
var noFunc = function () {
};
expj.common.pscript.executeConfirmPut('KU0030010', 'KU0030010button2', '_KU0030010button2/insert', 'KU02016', yesFunc, noFunc);
};
// script11="child;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0030010form1/*,_KU0030010form2/*,_KU0030010form3/*@KU0030010Servlet,,$ZZ07001"
expj.KU0030010.KU0030010button2.insert.child2 = function () {
  console.log('insert script11');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0030010', 'KU0030010button2', '_KU0030010form1/*,_KU0030010form2/*,_KU0030010form3/*', 'KU0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0030010', response);
expj.common.updateBusinessScreenTab('KU0030010', contents);
};
expj.common.pscript.callConfirm('KU0030010', 'KU0030010button2', 'ZZ07001', okEvent);
};
expj.KU0030010.KU0030010button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 7; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010button2.insert['onClick' + i])) {
        expj.KU0030010.KU0030010button2.insert['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010button2.insert.executeAllOnDecision = function () {
};
expj.KU0030010.KU0030010button2.insert.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010button2', 'insert', this, 'Button');
    }
  });
  expj.KU0030010.KU0030010button2.insert.executePScriptOnLoad();
};

expj.KU0030010.KU0030010button2.insert.executePScriptOnLoad = function () {
  console.log('execute KU0030010button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0030010-KU0030010button2-insert" name="insert" class="KU0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010button2-torikeshi">
expj.KU0030010.KU0030010button2.torikeshi = {};
// script1="onClick;0;SET;_KU0030010form1/k_MODE=CANCEL"
expj.KU0030010.KU0030010button2.torikeshi.onClick0 = function () {
  console.log('torikeshi script1');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form1/k_MODE', 'CANCEL');
};
// script2="onClick;1;CHK;_KU0030010form2/g_DATE[gt]_KU0030010form1/h_GYOMU_DATE@#KU00107"
expj.KU0030010.KU0030010button2.torikeshi.onClick1 = function () {
  console.log('torikeshi script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form1/h_GYOMU_DATE')))) {
expj.common.pscript.addErrorMessage('KU0030010', 'KU0030010button2', 'KU00107');
}
};
// script3="onClick;2;CHK;_KU0030010form2/g_DATE[lt]_KU0030010form2/h_DATE@#KU02008"
expj.KU0030010.KU0030010button2.torikeshi.onClick2 = function () {
  console.log('torikeshi script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/h_DATE')))) {
expj.common.pscript.addErrorMessage('KU0030010', 'KU0030010button2', 'KU02008');
}
};
// script4="onClick;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0030010form1/*,_KU0030010form2/*,_KU0030010form3/*@KU0030010Servlet,,$ZZ09020"
expj.KU0030010.KU0030010button2.torikeshi.onClick3 = function () {
  console.log('torikeshi script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0030010', 'KU0030010button2', '_KU0030010form1/*,_KU0030010form2/*,_KU0030010form3/*', 'KU0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0030010', response);
expj.common.updateBusinessScreenTab('KU0030010', contents);
};
expj.common.pscript.callConfirm('KU0030010', 'KU0030010button2', 'ZZ09020', okEvent);
};
expj.KU0030010.KU0030010button2.torikeshi.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010button2.torikeshi['onClick' + i])) {
        expj.KU0030010.KU0030010button2.torikeshi['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010button2.torikeshi.executeAllOnDecision = function () {
};
expj.KU0030010.KU0030010button2.torikeshi.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010button2-torikeshi').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010button2', 'torikeshi', this, 'Button');
    }
  });
  expj.KU0030010.KU0030010button2.torikeshi.executePScriptOnLoad();
};

expj.KU0030010.KU0030010button2.torikeshi.executePScriptOnLoad = function () {
  console.log('execute KU0030010button2/torikeshi.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010button2-torikeshi');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0030010-KU0030010button2-torikeshi" name="torikeshi" class="KU0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCancel_1",rb)%></button><!-- 取消ボタン --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010button2-recall">
expj.KU0030010.KU0030010button2.recall = {};
// script1="onClick;0;SET;_KU0030010form1/k_MODE=RECALL"
expj.KU0030010.KU0030010button2.recall.onClick0 = function () {
  console.log('recall script1');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form1/k_MODE', 'RECALL');
};
// script2="onClick;1;CHK;_KU0030010form2/g_SHIP_QTY2[gt]0[or]_KU0030010form2/g_SHIP_QTY2[eq]0@*0,*1"
expj.KU0030010.KU0030010button2.recall.onClick1 = function () {
  console.log('recall script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_SHIP_QTY2')), '[gt]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_SHIP_QTY2'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onClick;2;CHK;_KU0030010form2/g_DATE[gt]_KU0030010form1/h_GYOMU_DATE@#KU00107"
expj.KU0030010.KU0030010button2.recall.onClick2 = function () {
  console.log('recall script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form1/h_GYOMU_DATE')))) {
expj.common.pscript.addErrorMessage('KU0030010', 'KU0030010button2', 'KU00107');
}
};
// script4="onClick;3;CHK;_KU0030010form2/g_DATE[lt]_KU0030010form2/h_DATE@#KU02008"
expj.KU0030010.KU0030010button2.recall.onClick3 = function () {
  console.log('recall script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/h_DATE')))) {
expj.common.pscript.addErrorMessage('KU0030010', 'KU0030010button2', 'KU02008');
}
};
// script5="onClick;4;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0030010form1/*,_KU0030010form2/*,_KU0030010form3/*@KU0030010Servlet,,$ZZ09021"
expj.KU0030010.KU0030010button2.recall.onClick4 = function () {
  console.log('recall script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0030010', 'KU0030010button2', '_KU0030010form1/*,_KU0030010form2/*,_KU0030010form3/*', 'KU0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0030010', response);
expj.common.updateBusinessScreenTab('KU0030010', contents);
};
expj.common.pscript.callConfirm('KU0030010', 'KU0030010button2', 'ZZ09021', okEvent);
};
// script6="child;0;CHK;_KU0030010form3/h_TOTAL_SHIP_QTY[lt]_KU0030010form2/g_SHIP_QTY2@#KU00043"
expj.KU0030010.KU0030010button2.recall.child0 = function () {
  console.log('recall script6');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form3/h_TOTAL_SHIP_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_SHIP_QTY2')))) {
expj.common.pscript.addErrorMessage('KU0030010', 'KU0030010button2', 'KU00043');
}
};
// script7="child;1;CHK;_KU0030010form3/h_RETURN_QTY[lt][(-1)*{_KU0030010form2/g_SHIP_QTY2}]@#KU00106"
expj.KU0030010.KU0030010button2.recall.child1 = function () {
  console.log('recall script7');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form3/h_RETURN_QTY')), '[lt]', expj.common.pscript.eval('(-1)*' + expj.common.pscript.getReferenceComponentValue('KU0030010', 'KU0030010button2', '_KU0030010form2/g_SHIP_QTY2')))) {
expj.common.pscript.addErrorMessage('KU0030010', 'KU0030010button2', 'KU00106');
}
};
expj.KU0030010.KU0030010button2.recall.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010button2.recall['onClick' + i])) {
        expj.KU0030010.KU0030010button2.recall['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010button2.recall.executeAllOnDecision = function () {
};
expj.KU0030010.KU0030010button2.recall.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010button2-recall').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010button2', 'recall', this, 'Button');
    }
  });
  expj.KU0030010.KU0030010button2.recall.executePScriptOnLoad();
};

expj.KU0030010.KU0030010button2.recall.executePScriptOnLoad = function () {
  console.log('execute KU0030010button2/recall.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010button2-recall');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0030010-KU0030010button2-recall" name="recall" class="KU0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturnGoods",rb)%></button><!-- 返品ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<!--five end --><!--six start --><div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<!--six end --><!--elevent start --><div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KU0030010-KU0030010form3">
expj.KU0030010.KU0030010form3 = {};
expj.KU0030010.KU0030010form3.executeAllOnDecision = function () {
  console.log('execute KU0030010form3.onDecision');
};
expj.KU0030010.KU0030010form3.executeOnLoad = function () {
  expj.KU0030010.KU0030010form3.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0030010-KU0030010form3" action="KU0030010Servlet" name="KU0030010form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:111px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:111px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:260px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:320px;align:"></div>
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form3-g_CUST_CD">
expj.KU0030010.KU0030010form3.g_CUST_CD = {};
expj.KU0030010.KU0030010form3.g_CUST_CD.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/g_CUST_CD.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.g_CUST_CD.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-g_CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'g_CUST_CD', this);
  });
  expj.KU0030010.KU0030010form3.g_CUST_CD.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.g_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/g_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-g_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form3-g_CUST_CD" name="g_CUST_CD" class="KU0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_CUST_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form3-g_CUST_ANAME">
expj.KU0030010.KU0030010form3.g_CUST_ANAME = {};
expj.KU0030010.KU0030010form3.g_CUST_ANAME.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/g_CUST_ANAME.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.g_CUST_ANAME.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-g_CUST_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'g_CUST_ANAME', this);
  });
  expj.KU0030010.KU0030010form3.g_CUST_ANAME.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.g_CUST_ANAME.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/g_CUST_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-g_CUST_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form3-g_CUST_ANAME" name="g_CUST_ANAME" class="KU0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_CUST_ANAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)%></span><!-- 得意先品目番号 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form3-g_CUST_ITEM_CD">
expj.KU0030010.KU0030010form3.g_CUST_ITEM_CD = {};
expj.KU0030010.KU0030010form3.g_CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/g_CUST_ITEM_CD.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.g_CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-g_CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'g_CUST_ITEM_CD', this);
  });
  expj.KU0030010.KU0030010form3.g_CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.g_CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/g_CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-g_CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form3-g_CUST_ITEM_CD" name="g_CUST_ITEM_CD" class="KU0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_CUST_ITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form3-g_CUST_ITEM_NAME">
expj.KU0030010.KU0030010form3.g_CUST_ITEM_NAME = {};
expj.KU0030010.KU0030010form3.g_CUST_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/g_CUST_ITEM_NAME.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.g_CUST_ITEM_NAME.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-g_CUST_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'g_CUST_ITEM_NAME', this);
  });
  expj.KU0030010.KU0030010form3.g_CUST_ITEM_NAME.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.g_CUST_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/g_CUST_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-g_CUST_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form3-g_CUST_ITEM_NAME" name="g_CUST_ITEM_NAME" class="KU0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_CUST_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form3-h_TOTAL_SHIP_QTY" name="h_TOTAL_SHIP_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_TOTAL_SHIP_QTY()) %>">
<script class="expj-script-KU0030010-KU0030010form3-h_TOTAL_SHIP_QTY">
expj.KU0030010.KU0030010form3.h_TOTAL_SHIP_QTY = {};
expj.KU0030010.KU0030010form3.h_TOTAL_SHIP_QTY.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/h_TOTAL_SHIP_QTY.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.h_TOTAL_SHIP_QTY.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-h_TOTAL_SHIP_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'h_TOTAL_SHIP_QTY', this);
  });
  expj.KU0030010.KU0030010form3.h_TOTAL_SHIP_QTY.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.h_TOTAL_SHIP_QTY.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/h_TOTAL_SHIP_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-h_TOTAL_SHIP_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form3-g_ITEM_CD">
expj.KU0030010.KU0030010form3.g_ITEM_CD = {};
expj.KU0030010.KU0030010form3.g_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/g_ITEM_CD.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.g_ITEM_CD.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-g_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'g_ITEM_CD', this);
  });
  expj.KU0030010.KU0030010form3.g_ITEM_CD.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.g_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/g_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-g_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form3-g_ITEM_CD" name="g_ITEM_CD" class="KU0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_ITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form3-h_ITEM_CD" name="h_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_ITEM_CD()) %>">
<script class="expj-script-KU0030010-KU0030010form3-h_ITEM_CD">
expj.KU0030010.KU0030010form3.h_ITEM_CD = {};
expj.KU0030010.KU0030010form3.h_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/h_ITEM_CD.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.h_ITEM_CD.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-h_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'h_ITEM_CD', this);
  });
  expj.KU0030010.KU0030010form3.h_ITEM_CD.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.h_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/h_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-h_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form3-g_ITEM_NAME">
expj.KU0030010.KU0030010form3.g_ITEM_NAME = {};
expj.KU0030010.KU0030010form3.g_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/g_ITEM_NAME.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.g_ITEM_NAME.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-g_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'g_ITEM_NAME', this);
  });
  expj.KU0030010.KU0030010form3.g_ITEM_NAME.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.g_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/g_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-g_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form3-g_ITEM_NAME" name="g_ITEM_NAME" class="KU0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form3-h_AP_SECRTY_TYP" name="h_AP_SECRTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_AP_SECRTY_TYP()) %>">
<script class="expj-script-KU0030010-KU0030010form3-h_AP_SECRTY_TYP">
expj.KU0030010.KU0030010form3.h_AP_SECRTY_TYP = {};
expj.KU0030010.KU0030010form3.h_AP_SECRTY_TYP.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/h_AP_SECRTY_TYP.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.h_AP_SECRTY_TYP.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-h_AP_SECRTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'h_AP_SECRTY_TYP', this);
  });
  expj.KU0030010.KU0030010form3.h_AP_SECRTY_TYP.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.h_AP_SECRTY_TYP.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/h_AP_SECRTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-h_AP_SECRTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ODR_NO",rb)%></span><!-- 得意先注文番号 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form3-g_CUST_ODR_NO">
expj.KU0030010.KU0030010form3.g_CUST_ODR_NO = {};
expj.KU0030010.KU0030010form3.g_CUST_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/g_CUST_ODR_NO.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.g_CUST_ODR_NO.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-g_CUST_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'g_CUST_ODR_NO', this);
  });
  expj.KU0030010.KU0030010form3.g_CUST_ODR_NO.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.g_CUST_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/g_CUST_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-g_CUST_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form3-g_CUST_ODR_NO" name="g_CUST_ODR_NO" class="KU0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_CUST_ODR_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form3-h_RETURN_QTY" name="h_RETURN_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_RETURN_QTY()) %>">
<script class="expj-script-KU0030010-KU0030010form3-h_RETURN_QTY">
expj.KU0030010.KU0030010form3.h_RETURN_QTY = {};
expj.KU0030010.KU0030010form3.h_RETURN_QTY.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/h_RETURN_QTY.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.h_RETURN_QTY.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-h_RETURN_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'h_RETURN_QTY', this);
  });
  expj.KU0030010.KU0030010form3.h_RETURN_QTY.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.h_RETURN_QTY.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/h_RETURN_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-h_RETURN_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form3-h_MODFIY_CNT" name="h_MODFIY_CNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_MODFIY_CNT()) %>">
<script class="expj-script-KU0030010-KU0030010form3-h_MODFIY_CNT">
expj.KU0030010.KU0030010form3.h_MODFIY_CNT = {};
expj.KU0030010.KU0030010form3.h_MODFIY_CNT.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/h_MODFIY_CNT.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.h_MODFIY_CNT.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-h_MODFIY_CNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'h_MODFIY_CNT', this);
  });
  expj.KU0030010.KU0030010form3.h_MODFIY_CNT.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.h_MODFIY_CNT.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/h_MODFIY_CNT.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-h_MODFIY_CNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_ORD_CD",rb)%></span><!-- 受注番号 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form3-g_ODR_NO">
expj.KU0030010.KU0030010form3.g_ODR_NO = {};
expj.KU0030010.KU0030010form3.g_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/g_ODR_NO.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.g_ODR_NO.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-g_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'g_ODR_NO', this);
  });
  expj.KU0030010.KU0030010form3.g_ODR_NO.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.g_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/g_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-g_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form3-g_ODR_NO" name="g_ODR_NO" class="KU0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_ODR_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KU0030010-KU0030010form3-h_MRP_ODR_TYP" name="h_MRP_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0030010Struct.geth_MRP_ODR_TYP()) %>">
<script class="expj-script-KU0030010-KU0030010form3-h_MRP_ODR_TYP">
expj.KU0030010.KU0030010form3.h_MRP_ODR_TYP = {};
expj.KU0030010.KU0030010form3.h_MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/h_MRP_ODR_TYP.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.h_MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-h_MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'h_MRP_ODR_TYP', this);
  });
  expj.KU0030010.KU0030010form3.h_MRP_ODR_TYP.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.h_MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/h_MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-h_MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_PARTIAL_ITEM",rb)%></span><!-- 分納項番 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form3-g_PART_DLV_SEQ_NO">
expj.KU0030010.KU0030010form3.g_PART_DLV_SEQ_NO = {};
expj.KU0030010.KU0030010form3.g_PART_DLV_SEQ_NO.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/g_PART_DLV_SEQ_NO.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.g_PART_DLV_SEQ_NO.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-g_PART_DLV_SEQ_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'g_PART_DLV_SEQ_NO', this);
  });
  expj.KU0030010.KU0030010form3.g_PART_DLV_SEQ_NO.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.g_PART_DLV_SEQ_NO.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/g_PART_DLV_SEQ_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-g_PART_DLV_SEQ_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form3-g_PART_DLV_SEQ_NO" name="g_PART_DLV_SEQ_NO" class="KU0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_PART_DLV_SEQ_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:320px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_ODR_NO",rb)%></span><!-- 出荷指示番号 --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010form3-g_SHIP_ODR_NO">
expj.KU0030010.KU0030010form3.g_SHIP_ODR_NO = {};
expj.KU0030010.KU0030010form3.g_SHIP_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KU0030010form3/g_SHIP_ODR_NO.onDecision');
  expj.KU0030010.KU0030010form3.executeAllOnDecision();
  expj.KU0030010.executeAllOnDecision();
};
expj.KU0030010.KU0030010form3.g_SHIP_ODR_NO.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010form3-g_SHIP_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0030010', 'KU0030010form3', 'g_SHIP_ODR_NO', this);
  });
  expj.KU0030010.KU0030010form3.g_SHIP_ODR_NO.executePScriptOnLoad();
};

expj.KU0030010.KU0030010form3.g_SHIP_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KU0030010form3/g_SHIP_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010form3-g_SHIP_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0030010-KU0030010form3-g_SHIP_ODR_NO" name="g_SHIP_ODR_NO" class="KU0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0030010Struct.getg_SHIP_ODR_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:320px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<!--elevent end --><%
  }
  aKU0030010Struct = structBackup;
%><!--eight start --><div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<!--eight end --><!--nine start --><div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KU0030010 Revision: 1.18  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KU0030010-KU0030010button0">
expj.KU0030010.KU0030010button0 = {};
expj.KU0030010.KU0030010button0.executeAllOnDecision = function () {
  console.log('execute KU0030010button0.onDecision');
};
expj.KU0030010.KU0030010button0.executeOnLoad = function () {
  expj.KU0030010.KU0030010button0.executePScriptOnLoad();
};

expj.KU0030010.KU0030010button0.executePScriptOnLoad = function () {
  console.log('execute KU0030010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0030010-KU0030010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0030010-KU0030010button0-clear">
expj.KU0030010.KU0030010button0.clear = {};
// script1="onClick;0;SET;_KU0030010form1/k_MODE=ORDER"
expj.KU0030010.KU0030010button0.clear.onClick0 = function () {
  console.log('clear script1');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button0', '_KU0030010form1/k_MODE', 'ORDER');
};
// script2="onClick;1;SET;_KU0030010form1/r_SEL_PTN=ORDER"
expj.KU0030010.KU0030010button0.clear.onClick1 = function () {
  console.log('clear script2');
expj.common.pscript.setReferenceComponentValue('KU0030010', 'KU0030010button0', '_KU0030010form1/r_SEL_PTN', 'ORDER');
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KU0030010Servlet,,$ZZ07008"
expj.KU0030010.KU0030010button0.clear.onClick2 = function () {
  console.log('clear script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0030010', 'KU0030010button0', '', 'KU0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0030010', response);
expj.common.updateBusinessScreenTab('KU0030010', contents);
};
expj.common.pscript.callConfirm('KU0030010', 'KU0030010button0', 'ZZ07008', okEvent);
};
expj.KU0030010.KU0030010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010button0.clear['onClick' + i])) {
        expj.KU0030010.KU0030010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010button0.clear.executeAllOnDecision = function () {
};
expj.KU0030010.KU0030010button0.clear.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010button0', 'clear', this, 'Button');
    }
  });
  expj.KU0030010.KU0030010button0.clear.executePScriptOnLoad();
};

expj.KU0030010.KU0030010button0.clear.executePScriptOnLoad = function () {
  console.log('execute KU0030010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0030010-KU0030010button0-clear" name="clear" class="KU0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KU0030010-KU0030010button0-close">
expj.KU0030010.KU0030010button0.close = {};
// script1="onClick;0;CLOSE"
expj.KU0030010.KU0030010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('KU0030010');
};
expj.KU0030010.KU0030010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0030010.KU0030010button0.close['onClick' + i])) {
        expj.KU0030010.KU0030010button0.close['onClick' + i]();
      }
    }
  }
};
expj.KU0030010.KU0030010button0.close.executeAllOnDecision = function () {
};
expj.KU0030010.KU0030010button0.close.executeOnLoad = function () {
  $('#expj-KU0030010-KU0030010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0030010', 'KU0030010button0', 'close', this, 'Button');
    }
  });
  expj.KU0030010.KU0030010button0.close.executePScriptOnLoad();
};

expj.KU0030010.KU0030010button0.close.executePScriptOnLoad = function () {
  console.log('execute KU0030010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-KU0030010-KU0030010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0030010-KU0030010button0-close" name="close" class="KU0030010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
<!--nine end --></div><!-- /table1 -->
</div><!-- expj-business-screen-KU0030010 (END)-->
<%
MessageStruct msgStruct = aKU0030010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KU0030010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KU0030010)) {
  expj.common.treeInstanceMap.KU0030010 = {};
}
expj.common.treeInstanceMap.KU0030010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0030010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KU0030010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0030010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KU0030010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KU0030010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KU0030010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KU0030010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KU0030010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KU0030010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KU0030010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0030010)) {
  expj.common.detailDialogMap.KU0030010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0030010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KU0030010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0030010.<%=detailId %>)) {
  expj.common.detailDialogMap.KU0030010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0030010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KU0030010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0030010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KU0030010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KU0030010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KU0030010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KU0030010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KU0030010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KU0030010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KU0030010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KU0030010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KU0030010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KU0030010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KU0030010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KU0030010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KU0030010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KU0030010)) {
  expj.common.viewInstanceMap.KU0030010 = {};
}
expj.common.viewInstanceMap.KU0030010.<%=viewId %> = {};
expj.common.viewInstanceMap.KU0030010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KU0030010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KU0030010.<%=viewId %>.init = function () {
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
    expj.KU0030010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KU0030010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KU0030010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KU0030010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KU0030010_init">
/**
 * KU0030010用のロード完了時初期化関数
 */
expj.KU0030010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KU0030010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KU0030010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KU0030010');
  expj.common.calendarInstanceMap.KU0030010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KU0030010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KU0030010.<%=detailId %>.init();
  expj.common.detailDialogMap.KU0030010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KU0030010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KU0030010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KU0030010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KU0030010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KU0030010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KU0030010-<%=detailId %>');
<%
 }
%>
  try{expj.KU0030010.KU0030010form1.g_SLIP_CD.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form1.PeekerSlipCd.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form1.h_SHIP_CMPLT_FLG.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form1.r_SEL_PTN1.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form1.h_RESULT.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form1.m_selRadio.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form1.h_GYOMU_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form1.r_SEL_PTN.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form1.h_SELECT_FG.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form1.r_SEL_PTN2.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form1.k_MODE.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form1.r_SEL_PTN3.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010button1.search.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.PeekerShipDate.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_DESINATED_SHIP_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_SHIP_QTY2.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.h_SHIP_QTY.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_SHIP_QTY.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_STOCK_UNIT2.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.h_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.h_EXCH_TYP.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.SelectUnitCost.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.h_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_SHIP_ODR_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_CUR_UNIT2.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_WH_CD.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_WH_NAME.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_SALES_DEPT_CD.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.PeekerIOrgCd.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_ORG_NAME.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.h_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.PeekerJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.c_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_STOCK_LOT_CD.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.h_STOCK_LOT_CD.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.h_LOT_CTRL_FLG.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.PeekerStockLotNo.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.param1.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_REMARKS.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_CURRNCY.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.param2.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.g_DIRECT_DLV_FLG.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.param3.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010button2.insert.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010button2.torikeshi.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010button2.recall.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.g_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.g_CUST_ANAME.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.g_CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.g_CUST_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.h_TOTAL_SHIP_QTY.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.g_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.h_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.g_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.h_AP_SECRTY_TYP.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.g_CUST_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.h_RETURN_QTY.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.h_MODFIY_CNT.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.g_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.h_MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.g_PART_DLV_SEQ_NO.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.g_SHIP_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010button0.clear.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010button0.close.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form1.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010button1.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form2.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010button2.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010form3.executeOnLoad();}catch(e){};
  try{expj.KU0030010.KU0030010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KU0030010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KU0030010', 'KU0030010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KU0030010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KU0030010-focus-move');
  // 初期フォーカス当てる処理
  $('.KU0030010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KU0030010', '<%=request.getContextPath() %>');
};

/**
 * KU0030010の全体onDecision処理
 */
expj.KU0030010.executeAllOnDecision = function () {
  expj.KU0030010.KU0030010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KU0030010_console">
expj.KU0030010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>