<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 13:03:12 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KU0090\KU0090010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KU0090.*" %>
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
<jsp:useBean id="aKU0090010Control" class="com.nec.jp.orteus.metamorBase.KU0090.KU0090010Control" scope="request"/>
<jsp:useBean id="aKU0090010Struct" class="com.nec.jp.orteus.metamorBase.KU0090.KU0090010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

出荷インボイス一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0090/jsp/KU0090010.jsp,v $
$Author: geng-jia $
$Revision: 1.2 $ $Date: 2017/02/22 02:07:31 $
********************************************************* --%>
<html>
<head>
<title>出荷インボイス一覧</title>
<%@include file="common/expj_v5.jsp" %>
<%
    // システムオプション識別子
    String strOptionId = aKU0090010Struct.getOPTION_ID();
	String strMoveServlet = "";
	// Explanner/Jaの場合
	if("JA*".equals(strOptionId)){
	    strMoveServlet = "KU1150010Servlet";
	}
	// Explanner/Ja以外の場合
	else{
	    strMoveServlet = "KU0080010Servlet";
	}
    ScreenMoveUtil su = new ScreenMoveUtil(strMoveServlet, so);
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
<script class="expj-script-KU0090010_init">
  // KU0090010名前空間
  expj.KU0090010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-KU0090010" data-screen="KU0090010" data-newdata="<%=aKU0090010Control.isNewData() %>">
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
              <!-- 1段目のDataGrid配置↓ -->
              <script class="expj-script-KU0090010-KU0090010form1">
expj.KU0090010.KU0090010form1 = {};
// script1="onLoad;1;CALL;onDecision@0,1,2"
expj.KU0090010.KU0090010form1.onLoad1 = function () {
  console.log('KU0090010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHK;?KU0090010form1/CUST_CD[eq]SAME[and]?KU0090010form1/OPed[eq]SAME[and]?KU0090010form1/DLV_LOC_CD[eq]SAME[and]?KU0090010form1/INVOICE_CD[eq]SAME[and]?KU0090010form1/SHIP_INVOICE_DATE_FROM[eq]SAME[and]?KU0090010form1/SHIP_INVOICE_DATE_TO[eq]SAME[and]?KU0090010form1/SCDL_SHIP_DATE_FROM[eq]SAME[and]?KU0090010form1/SCDL_SHIP_DATE_TO[eq]SAME@*6,*1"
expj.KU0090010.KU0090010form1.onDecision0 = function () {
  console.log('KU0090010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/OPed'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/DLV_LOC_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/INVOICE_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/SHIP_INVOICE_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/SHIP_INVOICE_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/SCDL_SHIP_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/SCDL_SHIP_DATE_TO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_KU0090010button2/Maintenance"
expj.KU0090010.KU0090010form1.child0 = function () {
  console.log('KU0090010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('KU0090010', 'KU0090010form1', '_KU0090010button2/Maintenance');
};
// script4="child;1;MASK;_KU0090010button2/Maintenance"
expj.KU0090010.KU0090010form1.child1 = function () {
  console.log('KU0090010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('KU0090010', 'KU0090010form1', '_KU0090010button2/Maintenance');
};
// script5="onDecision;1;CHK;?KU0090010form1/*[eq]NORMAL@*2,*4"
expj.KU0090010.KU0090010form1.onDecision1 = function () {
  console.log('KU0090010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?KU0090010form1/CUST_CD[eq]SAME[and]?KU0090010form1/OPed[eq]SAME[and]?KU0090010form1/DLV_LOC_CD[eq]SAME[and]?KU0090010form1/INVOICE_CD[eq]SAME[and]?KU0090010form1/SHIP_INVOICE_DATE_FROM[eq]SAME[and]?KU0090010form1/SHIP_INVOICE_DATE_TO[eq]SAME[and]?KU0090010form1/SCDL_SHIP_DATE_FROM[eq]SAME[and]?KU0090010form1/SCDL_SHIP_DATE_TO[eq]SAME@*3,*4"
expj.KU0090010.KU0090010form1.child2 = function () {
  console.log('KU0090010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/OPed'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/DLV_LOC_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/INVOICE_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/SHIP_INVOICE_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/SHIP_INVOICE_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/SCDL_SHIP_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010form1/SCDL_SHIP_DATE_TO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_KU0090010button0/CsvOut"
expj.KU0090010.KU0090010form1.child3 = function () {
  console.log('KU0090010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('KU0090010', 'KU0090010form1', '_KU0090010button0/CsvOut');
};
// script8="child;4;MASK;_KU0090010button0/CsvOut"
expj.KU0090010.KU0090010form1.child4 = function () {
  console.log('KU0090010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('KU0090010', 'KU0090010form1', '_KU0090010button0/CsvOut');
};
// script9="onDecision;2;CHK;_KU0090010form1/OPTION_ID[neq]JA*@*5"
expj.KU0090010.KU0090010form1.onDecision2 = function () {
  console.log('KU0090010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '_KU0090010form1/OPTION_ID'), '[neq]', 'JA*')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script10="child;5;MASK;_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM,_KU0090010form1/SHIP_PLAN_DATE_TIME_TO"
expj.KU0090010.KU0090010form1.child5 = function () {
  console.log('KU0090010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('KU0090010', 'KU0090010form1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM');
expj.common.pscript.setMaskToReferenceComponent('KU0090010', 'KU0090010form1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_TO');
};
// script11="child;6;CHKRQ;?KU0090010view1/?[eq]SINGLE@*0,*1"
expj.KU0090010.KU0090010form1.child6 = function () {
  console.log('KU0090010form1 script11');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '?KU0090010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
expj.KU0090010.KU0090010form1.executeAllOnDecision = function () {
  console.log('execute KU0090010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0090010.KU0090010form1['onDecision' + i])) {
        expj.KU0090010.KU0090010form1['onDecision' + i]();
      }
    }
  }
};
expj.KU0090010.KU0090010form1.executeOnLoad = function () {
  expj.KU0090010.KU0090010form1.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.KU0090010.KU0090010form1['onLoad' + i])) {
      expj.KU0090010.KU0090010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0090010-KU0090010form1" action="KU0090010Servlet" name="KU0090010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKU0090010Control.getReadStatusString()) %>" style="height:119px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:119px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:48px;align:"></div>
<div class="div-td" style="width:30px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:78px;align:"></div>
<div class="div-td" style="width:110px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-CUST_CD">
expj.KU0090010.KU0090010form1.CUST_CD = {};
expj.KU0090010.KU0090010form1.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KU0090010form1/CUST_CD.onDecision');
  expj.KU0090010.KU0090010form1.executeAllOnDecision();
  expj.KU0090010.executeAllOnDecision();
};
expj.KU0090010.KU0090010form1.CUST_CD.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0090010', 'KU0090010form1', 'CUST_CD', this);
  });
  expj.KU0090010.KU0090010form1.CUST_CD.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:250px;text-align:left;"><input type="text" id="expj-KU0090010-KU0090010form1-CUST_CD" name="CUST_CD" class="KU0090010-focus-move  " style="width:250px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKU0090010Struct.getCUST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-PeekerCustCd">
expj.KU0090010.KU0090010form1.PeekerCustCd = {};
// script1="onClick;0;PEEKER;_KU0090010form1/CUST_CD@<%=contextNo%>"
expj.KU0090010.KU0090010form1.PeekerCustCd.onClick0 = function () {
  console.log('PeekerCustCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0090010';
var parameterValues = 'PeekerCustCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KU0090010form1/CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0090010.KU0090010form1.PeekerCustCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0090010.KU0090010form1.PeekerCustCd['onClick' + i])) {
        expj.KU0090010.KU0090010form1.PeekerCustCd['onClick' + i]();
      }
    }
  }
};
expj.KU0090010.KU0090010form1.PeekerCustCd.executeAllOnDecision = function () {
};
expj.KU0090010.KU0090010form1.PeekerCustCd.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-PeekerCustCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0090010', 'KU0090010form1', 'PeekerCustCd', this, 'Button');
    }
  });
  expj.KU0090010.KU0090010form1.PeekerCustCd.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.PeekerCustCd.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/PeekerCustCd.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-PeekerCustCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0090010-KU0090010form1-PeekerCustCd" class="KU0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:78px;"></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-OPed">
expj.KU0090010.KU0090010form1.OPed = {};
// script1="onClick;0;CHK;_KU0090010form1/OPed[eq]true@*0,*1"
expj.KU0090010.KU0090010form1.OPed.onClick0 = function () {
  console.log('OPed script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010form1', '_KU0090010form1/OPed'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;SET;_KU0090010form1/OPed=true"
expj.KU0090010.KU0090010form1.OPed.child0 = function () {
  console.log('OPed script2');
expj.common.pscript.setReferenceComponentValue('KU0090010', 'KU0090010form1', '_KU0090010form1/OPed', 'true');
};
// script3="child;1;SET;_KU0090010form1/OPed=false"
expj.KU0090010.KU0090010form1.OPed.child1 = function () {
  console.log('OPed script3');
expj.common.pscript.setReferenceComponentValue('KU0090010', 'KU0090010form1', '_KU0090010form1/OPed', 'false');
};
expj.KU0090010.KU0090010form1.OPed.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0090010.KU0090010form1.OPed['onClick' + i])) {
        expj.KU0090010.KU0090010form1.OPed['onClick' + i]();
      }
    }
  }
};
expj.KU0090010.KU0090010form1.OPed.executeAllOnDecision = function () {
  console.log('execute KU0090010form1/OPed.onDecision');
  expj.KU0090010.KU0090010form1.executeAllOnDecision();
  expj.KU0090010.executeAllOnDecision();
};
expj.KU0090010.KU0090010form1.OPed.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-OPed').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0090010', 'KU0090010form1', 'OPed', this, 'CheckBox');
    }
  });
  expj.KU0090010.KU0090010form1.OPed.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.OPed.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/OPed.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-OPed');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="checkbox" name="OPed" value="true" <%= ("true".equals(TypeConverter.convert(aKU0090010Struct.getOPed())) || "1".equals(TypeConverter.convert(aKU0090010Struct.getOPed())))?"checked=\"checked\"":"" %>  class="KU0090010-focus-move" id="expj-KU0090010-KU0090010form1-OPed"><label for="expj-KU0090010-KU0090010form1-OPed"><%=CoreTools.getRBString("Expj.Cmt6221",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-KU0090010-KU0090010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0090010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-KU0090010-KU0090010form1-DOWNLOAD_FILE">
expj.KU0090010.KU0090010form1.DOWNLOAD_FILE = {};
expj.KU0090010.KU0090010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute KU0090010form1/DOWNLOAD_FILE.onDecision');
  expj.KU0090010.KU0090010form1.executeAllOnDecision();
  expj.KU0090010.executeAllOnDecision();
};
expj.KU0090010.KU0090010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0090010', 'KU0090010form1', 'DOWNLOAD_FILE', this);
  });
  expj.KU0090010.KU0090010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_LOC_CD",rb)%></span><!-- 納品場所コード --></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-DLV_LOC_CD">
expj.KU0090010.KU0090010form1.DLV_LOC_CD = {};
expj.KU0090010.KU0090010form1.DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KU0090010form1/DLV_LOC_CD.onDecision');
  expj.KU0090010.KU0090010form1.executeAllOnDecision();
  expj.KU0090010.executeAllOnDecision();
};
expj.KU0090010.KU0090010form1.DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0090010', 'KU0090010form1', 'DLV_LOC_CD', this);
  });
  expj.KU0090010.KU0090010form1.DLV_LOC_CD.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:250px;text-align:left;"><input type="text" id="expj-KU0090010-KU0090010form1-DLV_LOC_CD" name="DLV_LOC_CD" class="KU0090010-focus-move  " style="width:250px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKU0090010Struct.getDLV_LOC_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:78px;"></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
<input type="hidden" id="expj-KU0090010-KU0090010form1-OPTION_ID" name="OPTION_ID" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0090010Struct.getOPTION_ID()) %>">
<script class="expj-script-KU0090010-KU0090010form1-OPTION_ID">
expj.KU0090010.KU0090010form1.OPTION_ID = {};
expj.KU0090010.KU0090010form1.OPTION_ID.executeAllOnDecision = function () {
  console.log('execute KU0090010form1/OPTION_ID.onDecision');
  expj.KU0090010.KU0090010form1.executeAllOnDecision();
  expj.KU0090010.executeAllOnDecision();
};
expj.KU0090010.KU0090010form1.OPTION_ID.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-OPTION_ID').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0090010', 'KU0090010form1', 'OPTION_ID', this);
  });
  expj.KU0090010.KU0090010form1.OPTION_ID.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.OPTION_ID.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/OPTION_ID.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-OPTION_ID');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INVOICE_CD_1",rb)%></span><!-- インボイス番号 --></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-INVOICE_CD">
expj.KU0090010.KU0090010form1.INVOICE_CD = {};
expj.KU0090010.KU0090010form1.INVOICE_CD.executeAllOnDecision = function () {
  console.log('execute KU0090010form1/INVOICE_CD.onDecision');
  expj.KU0090010.KU0090010form1.executeAllOnDecision();
  expj.KU0090010.executeAllOnDecision();
};
expj.KU0090010.KU0090010form1.INVOICE_CD.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-INVOICE_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0090010', 'KU0090010form1', 'INVOICE_CD', this);
  });
  expj.KU0090010.KU0090010form1.INVOICE_CD.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.INVOICE_CD.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/INVOICE_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-INVOICE_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:250px;text-align:left;"><input type="text" id="expj-KU0090010-KU0090010form1-INVOICE_CD" name="INVOICE_CD" class="KU0090010-focus-move  " style="width:250px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKU0090010Struct.getINVOICE_CD()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:78px;"></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_INVOICE_DATE",rb)%></span><!-- 出荷インボイス作成日 --></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-SHIP_INVOICE_DATE_FROM">
expj.KU0090010.KU0090010form1.SHIP_INVOICE_DATE_FROM = {};
expj.KU0090010.KU0090010form1.SHIP_INVOICE_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute KU0090010form1/SHIP_INVOICE_DATE_FROM.onDecision');
  expj.KU0090010.KU0090010form1.executeAllOnDecision();
  expj.KU0090010.executeAllOnDecision();
};
expj.KU0090010.KU0090010form1.SHIP_INVOICE_DATE_FROM.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-SHIP_INVOICE_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0090010', 'KU0090010form1', 'SHIP_INVOICE_DATE_FROM', this);
  });
  expj.KU0090010.KU0090010form1.SHIP_INVOICE_DATE_FROM.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.SHIP_INVOICE_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/SHIP_INVOICE_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-SHIP_INVOICE_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0090010-KU0090010form1-SHIP_INVOICE_DATE_FROM" name="SHIP_INVOICE_DATE_FROM" class="KU0090010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aKU0090010Struct.getSHIP_INVOICE_DATE_FROM()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-CalendarShipInvoiceDateFrom">
expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateFrom = {};
// script1="onClick;0;CALENDAR;_KU0090010form1/SHIP_INVOICE_DATE_FROM@<%=contextNo%>"
expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateFrom.onClick0 = function () {
  console.log('CalendarShipInvoiceDateFrom script1');
expj.common.pscript.executeCalendar('KU0090010','KU0090010form1','_KU0090010form1/SHIP_INVOICE_DATE_FROM');
};
expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateFrom['onClick' + i])) {
        expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateFrom['onClick' + i]();
      }
    }
  }
};
expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateFrom.executeAllOnDecision = function () {
};
expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateFrom.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-CalendarShipInvoiceDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0090010', 'KU0090010form1', 'CalendarShipInvoiceDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0090010','KU0090010form1','_KU0090010form1/SHIP_INVOICE_DATE_FROM');
  expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateFrom.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateFrom.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/CalendarShipInvoiceDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-CalendarShipInvoiceDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0090010-KU0090010form1-CalendarShipInvoiceDateFrom" class="KU0090010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:48px;"></div><!--/td-->
<div class="div-td" style="width:30px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-SHIP_INVOICE_DATE_TO">
expj.KU0090010.KU0090010form1.SHIP_INVOICE_DATE_TO = {};
expj.KU0090010.KU0090010form1.SHIP_INVOICE_DATE_TO.executeAllOnDecision = function () {
  console.log('execute KU0090010form1/SHIP_INVOICE_DATE_TO.onDecision');
  expj.KU0090010.KU0090010form1.executeAllOnDecision();
  expj.KU0090010.executeAllOnDecision();
};
expj.KU0090010.KU0090010form1.SHIP_INVOICE_DATE_TO.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-SHIP_INVOICE_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0090010', 'KU0090010form1', 'SHIP_INVOICE_DATE_TO', this);
  });
  expj.KU0090010.KU0090010form1.SHIP_INVOICE_DATE_TO.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.SHIP_INVOICE_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/SHIP_INVOICE_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-SHIP_INVOICE_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0090010-KU0090010form1-SHIP_INVOICE_DATE_TO" name="SHIP_INVOICE_DATE_TO" class="KU0090010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aKU0090010Struct.getSHIP_INVOICE_DATE_TO()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-CalendarShipInvoiceDateTo">
expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateTo = {};
// script1="onClick;0;CALENDAR;_KU0090010form1/SHIP_INVOICE_DATE_TO@<%=contextNo%>"
expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateTo.onClick0 = function () {
  console.log('CalendarShipInvoiceDateTo script1');
expj.common.pscript.executeCalendar('KU0090010','KU0090010form1','_KU0090010form1/SHIP_INVOICE_DATE_TO');
};
expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateTo['onClick' + i])) {
        expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateTo['onClick' + i]();
      }
    }
  }
};
expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateTo.executeAllOnDecision = function () {
};
expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateTo.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-CalendarShipInvoiceDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0090010', 'KU0090010form1', 'CalendarShipInvoiceDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0090010','KU0090010form1','_KU0090010form1/SHIP_INVOICE_DATE_TO');
  expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateTo.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateTo.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/CalendarShipInvoiceDateTo.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-CalendarShipInvoiceDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0090010-KU0090010form1-CalendarShipInvoiceDateTo" class="KU0090010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:78px;"></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SCDL_SHIP_DATE",rb)%></span><!-- 出荷予定日 --></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-SCDL_SHIP_DATE_FROM">
expj.KU0090010.KU0090010form1.SCDL_SHIP_DATE_FROM = {};
expj.KU0090010.KU0090010form1.SCDL_SHIP_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute KU0090010form1/SCDL_SHIP_DATE_FROM.onDecision');
  expj.KU0090010.KU0090010form1.executeAllOnDecision();
  expj.KU0090010.executeAllOnDecision();
};
expj.KU0090010.KU0090010form1.SCDL_SHIP_DATE_FROM.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-SCDL_SHIP_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0090010', 'KU0090010form1', 'SCDL_SHIP_DATE_FROM', this);
  });
  expj.KU0090010.KU0090010form1.SCDL_SHIP_DATE_FROM.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.SCDL_SHIP_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/SCDL_SHIP_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-SCDL_SHIP_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0090010-KU0090010form1-SCDL_SHIP_DATE_FROM" name="SCDL_SHIP_DATE_FROM" class="KU0090010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aKU0090010Struct.getSCDL_SHIP_DATE_FROM()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-CalendarSCDLShipDateFrom">
expj.KU0090010.KU0090010form1.CalendarSCDLShipDateFrom = {};
// script1="onClick;0;CALENDAR;_KU0090010form1/SCDL_SHIP_DATE_FROM@<%=contextNo%>"
expj.KU0090010.KU0090010form1.CalendarSCDLShipDateFrom.onClick0 = function () {
  console.log('CalendarSCDLShipDateFrom script1');
expj.common.pscript.executeCalendar('KU0090010','KU0090010form1','_KU0090010form1/SCDL_SHIP_DATE_FROM');
};
expj.KU0090010.KU0090010form1.CalendarSCDLShipDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0090010.KU0090010form1.CalendarSCDLShipDateFrom['onClick' + i])) {
        expj.KU0090010.KU0090010form1.CalendarSCDLShipDateFrom['onClick' + i]();
      }
    }
  }
};
expj.KU0090010.KU0090010form1.CalendarSCDLShipDateFrom.executeAllOnDecision = function () {
};
expj.KU0090010.KU0090010form1.CalendarSCDLShipDateFrom.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-CalendarSCDLShipDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0090010', 'KU0090010form1', 'CalendarSCDLShipDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0090010','KU0090010form1','_KU0090010form1/SCDL_SHIP_DATE_FROM');
  expj.KU0090010.KU0090010form1.CalendarSCDLShipDateFrom.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.CalendarSCDLShipDateFrom.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/CalendarSCDLShipDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-CalendarSCDLShipDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0090010-KU0090010form1-CalendarSCDLShipDateFrom" class="KU0090010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-SHIP_PLAN_DATE_TIME_FROM">
expj.KU0090010.KU0090010form1.SHIP_PLAN_DATE_TIME_FROM = {};
expj.KU0090010.KU0090010form1.SHIP_PLAN_DATE_TIME_FROM.executeAllOnDecision = function () {
  console.log('execute KU0090010form1/SHIP_PLAN_DATE_TIME_FROM.onDecision');
  expj.KU0090010.KU0090010form1.executeAllOnDecision();
  expj.KU0090010.executeAllOnDecision();
};
expj.KU0090010.KU0090010form1.SHIP_PLAN_DATE_TIME_FROM.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-SHIP_PLAN_DATE_TIME_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0090010', 'KU0090010form1', 'SHIP_PLAN_DATE_TIME_FROM', this);
  });
  expj.KU0090010.KU0090010form1.SHIP_PLAN_DATE_TIME_FROM.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.SHIP_PLAN_DATE_TIME_FROM.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/SHIP_PLAN_DATE_TIME_FROM.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-SHIP_PLAN_DATE_TIME_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:78px;text-align:left;"><input type="text" id="expj-KU0090010-KU0090010form1-SHIP_PLAN_DATE_TIME_FROM" name="SHIP_PLAN_DATE_TIME_FROM" class="KU0090010-focus-move  " style="width:78px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aKU0090010Struct.getSHIP_PLAN_DATE_TIME_FROM()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-SCDL_SHIP_DATE_TO">
expj.KU0090010.KU0090010form1.SCDL_SHIP_DATE_TO = {};
expj.KU0090010.KU0090010form1.SCDL_SHIP_DATE_TO.executeAllOnDecision = function () {
  console.log('execute KU0090010form1/SCDL_SHIP_DATE_TO.onDecision');
  expj.KU0090010.KU0090010form1.executeAllOnDecision();
  expj.KU0090010.executeAllOnDecision();
};
expj.KU0090010.KU0090010form1.SCDL_SHIP_DATE_TO.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-SCDL_SHIP_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0090010', 'KU0090010form1', 'SCDL_SHIP_DATE_TO', this);
  });
  expj.KU0090010.KU0090010form1.SCDL_SHIP_DATE_TO.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.SCDL_SHIP_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/SCDL_SHIP_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-SCDL_SHIP_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0090010-KU0090010form1-SCDL_SHIP_DATE_TO" name="SCDL_SHIP_DATE_TO" class="KU0090010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aKU0090010Struct.getSCDL_SHIP_DATE_TO()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-CalendarSCDLShipDateTo">
expj.KU0090010.KU0090010form1.CalendarSCDLShipDateTo = {};
// script1="onClick;0;CALENDAR;_KU0090010form1/SCDL_SHIP_DATE_TO@<%=contextNo%>"
expj.KU0090010.KU0090010form1.CalendarSCDLShipDateTo.onClick0 = function () {
  console.log('CalendarSCDLShipDateTo script1');
expj.common.pscript.executeCalendar('KU0090010','KU0090010form1','_KU0090010form1/SCDL_SHIP_DATE_TO');
};
expj.KU0090010.KU0090010form1.CalendarSCDLShipDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0090010.KU0090010form1.CalendarSCDLShipDateTo['onClick' + i])) {
        expj.KU0090010.KU0090010form1.CalendarSCDLShipDateTo['onClick' + i]();
      }
    }
  }
};
expj.KU0090010.KU0090010form1.CalendarSCDLShipDateTo.executeAllOnDecision = function () {
};
expj.KU0090010.KU0090010form1.CalendarSCDLShipDateTo.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-CalendarSCDLShipDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0090010', 'KU0090010form1', 'CalendarSCDLShipDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0090010','KU0090010form1','_KU0090010form1/SCDL_SHIP_DATE_TO');
  expj.KU0090010.KU0090010form1.CalendarSCDLShipDateTo.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.CalendarSCDLShipDateTo.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/CalendarSCDLShipDateTo.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-CalendarSCDLShipDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0090010-KU0090010form1-CalendarSCDLShipDateTo" class="KU0090010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010form1-SHIP_PLAN_DATE_TIME_TO">
expj.KU0090010.KU0090010form1.SHIP_PLAN_DATE_TIME_TO = {};
expj.KU0090010.KU0090010form1.SHIP_PLAN_DATE_TIME_TO.executeAllOnDecision = function () {
  console.log('execute KU0090010form1/SHIP_PLAN_DATE_TIME_TO.onDecision');
  expj.KU0090010.KU0090010form1.executeAllOnDecision();
  expj.KU0090010.executeAllOnDecision();
};
expj.KU0090010.KU0090010form1.SHIP_PLAN_DATE_TIME_TO.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010form1-SHIP_PLAN_DATE_TIME_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0090010', 'KU0090010form1', 'SHIP_PLAN_DATE_TIME_TO', this);
  });
  expj.KU0090010.KU0090010form1.SHIP_PLAN_DATE_TIME_TO.executePScriptOnLoad();
};

expj.KU0090010.KU0090010form1.SHIP_PLAN_DATE_TIME_TO.executePScriptOnLoad = function () {
  console.log('execute KU0090010form1/SHIP_PLAN_DATE_TIME_TO.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010form1-SHIP_PLAN_DATE_TIME_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:78px;text-align:left;"><input type="text" id="expj-KU0090010-KU0090010form1-SHIP_PLAN_DATE_TIME_TO" name="SHIP_PLAN_DATE_TIME_TO" class="KU0090010-focus-move  " style="width:78px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aKU0090010Struct.getSHIP_PLAN_DATE_TIME_TO()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- 1段目のDataGrid配置↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KU0090010-KU0090010button1">
expj.KU0090010.KU0090010button1 = {};
expj.KU0090010.KU0090010button1.executeAllOnDecision = function () {
  console.log('execute KU0090010button1.onDecision');
};
expj.KU0090010.KU0090010button1.executeOnLoad = function () {
  expj.KU0090010.KU0090010button1.executePScriptOnLoad();
};

expj.KU0090010.KU0090010button1.executePScriptOnLoad = function () {
  console.log('execute KU0090010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0090010-KU0090010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0090010-KU0090010button1-Select">
expj.KU0090010.KU0090010button1.Select = {};
// script1="onClick;0;CHK;_KU0090010form1/SHIP_INVOICE_DATE_FROM[neq][and]_KU0090010form1/SHIP_INVOICE_DATE_TO[neq][and]_KU0090010form1/SHIP_INVOICE_DATE_FROM[gt]_KU0090010form1/SHIP_INVOICE_DATE_TO@!KU00115"
expj.KU0090010.KU0090010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_INVOICE_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_INVOICE_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_INVOICE_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_INVOICE_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('KU0090010', 'KU0090010button1', 'KU00115');
}
};
// script2="onClick;1;CHK;_KU0090010form1/SCDL_SHIP_DATE_FROM[neq][and]_KU0090010form1/SCDL_SHIP_DATE_TO[neq][and]_KU0090010form1/SCDL_SHIP_DATE_FROM[gt]_KU0090010form1/SCDL_SHIP_DATE_TO@!KU10017"
expj.KU0090010.KU0090010button1.Select.onClick1 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SCDL_SHIP_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SCDL_SHIP_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SCDL_SHIP_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SCDL_SHIP_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('KU0090010', 'KU0090010button1', 'KU10017');
}
};
// script3="onClick;2;CHK;_KU0090010form1/OPTION_ID[eq]JA*[and]_KU0090010form1/SCDL_SHIP_DATE_FROM[eq][and]_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM[neq]@!KU10094"
expj.KU0090010.KU0090010button1.Select.onClick2 = function () {
  console.log('Select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/OPTION_ID'), '[eq]', 'JA*') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SCDL_SHIP_DATE_FROM'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('KU0090010', 'KU0090010button1', 'KU10094');
}
};
// script4="onClick;3;CHK;_KU0090010form1/OPTION_ID[eq]JA*[and]_KU0090010form1/SCDL_SHIP_DATE_TO[eq][and]_KU0090010form1/SHIP_PLAN_DATE_TIME_TO[neq]@!KU10095"
expj.KU0090010.KU0090010button1.Select.onClick3 = function () {
  console.log('Select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/OPTION_ID'), '[eq]', 'JA*') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SCDL_SHIP_DATE_TO'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_TO'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('KU0090010', 'KU0090010button1', 'KU10095');
}
};
// script5="onClick;4;CHK;_KU0090010form1/OPTION_ID[eq]JA*[and]_KU0090010form1/SCDL_SHIP_DATE_FROM[neq][and]_KU0090010form1/SCDL_SHIP_DATE_TO[neq][and]_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM[neq][and]_KU0090010form1/SHIP_PLAN_DATE_TIME_TO[neq]@*0"
expj.KU0090010.KU0090010button1.Select.onClick4 = function () {
  console.log('Select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/OPTION_ID'), '[eq]', 'JA*') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SCDL_SHIP_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SCDL_SHIP_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script6="child;0;CHK;_KU0090010form1/SCDL_SHIP_DATE_FROM[eq]_KU0090010form1/SCDL_SHIP_DATE_TO[and]_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM[gt]_KU0090010form1/SHIP_PLAN_DATE_TIME_TO@!KU10017"
expj.KU0090010.KU0090010button1.Select.child0 = function () {
  console.log('Select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SCDL_SHIP_DATE_FROM'), '[eq]', expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SCDL_SHIP_DATE_TO')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_TO')))) {
expj.common.pscript.viewErrorMessage('KU0090010', 'KU0090010button1', 'KU10017');
}
};
// script7="onClick;5;CHK;_KU0090010form1/OPTION_ID[eq]JA*@*1"
expj.KU0090010.KU0090010button1.Select.onClick5 = function () {
  console.log('Select script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/OPTION_ID'), '[eq]', 'JA*')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script8="child;1;CHK;~LEN(_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM)[eq]1[or]~LEN(_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM)[eq]2@!KU10096"
expj.KU0090010.KU0090010button1.Select.child1 = function () {
  console.log('Select script8');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('KU0090010', 'KU0090010button1', 'KU10096');
}
};
// script9="onClick;6;CHK;_KU0090010form1/OPTION_ID[eq]JA*@*2"
expj.KU0090010.KU0090010button1.Select.onClick6 = function () {
  console.log('Select script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/OPTION_ID'), '[eq]', 'JA*')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script10="child;2;CHK;~LEN(_KU0090010form1/SHIP_PLAN_DATE_TIME_TO)[eq]1[or]~LEN(_KU0090010form1/SHIP_PLAN_DATE_TIME_TO)[eq]2@!KU10097@!KU10096"
expj.KU0090010.KU0090010button1.Select.child2 = function () {
  console.log('Select script10');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_TO'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_TO'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('KU0090010', 'KU0090010button1', 'KU10097');
}
};
// script11="onClick;7;CHK;_KU0090010form1/OPTION_ID[eq]JA*[and]~LEN(_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM)[eq]3@*3"
expj.KU0090010.KU0090010button1.Select.onClick7 = function () {
  console.log('Select script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/OPTION_ID'), '[eq]', 'JA*') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script12="child;3;CHK;[{~CHARAT(_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM:1)}*10+{~CHARAT(_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM:2)}][gte]60@!KU10100"
expj.KU0090010.KU0090010button1.Select.child3 = function () {
  console.log('Select script12');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('KU0090010', 'KU0090010button1', 'KU10100');
}
};
// script13="onClick;8;CHK;_KU0090010form1/OPTION_ID[eq]JA*[and]~LEN(_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM)[eq]4@*4"
expj.KU0090010.KU0090010button1.Select.onClick8 = function () {
  console.log('Select script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/OPTION_ID'), '[eq]', 'JA*') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script14="child;4;CHK;[{~CHARAT(_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM:0)}*10+{~CHARAT(_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM:1)}][gte]24[or][{~CHARAT(_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM:2)}*10+{~CHARAT(_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM:3)}][gte]60@!KU10100"
expj.KU0090010.KU0090010button1.Select.child4 = function () {
  console.log('Select script14');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_FROM', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('KU0090010', 'KU0090010button1', 'KU10100');
}
};
// script15="onClick;9;CHK;_KU0090010form1/OPTION_ID[eq]JA*[and]~LEN(_KU0090010form1/SHIP_PLAN_DATE_TIME_TO)[eq]3@*5"
expj.KU0090010.KU0090010button1.Select.onClick9 = function () {
  console.log('Select script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/OPTION_ID'), '[eq]', 'JA*') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_TO'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script16="child;5;CHK;[{~CHARAT(_KU0090010form1/SHIP_PLAN_DATE_TIME_TO:1)}*10+{~CHARAT(_KU0090010form1/SHIP_PLAN_DATE_TIME_TO:2)}][gte]60@!KU10101"
expj.KU0090010.KU0090010button1.Select.child5 = function () {
  console.log('Select script16');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_TO', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_TO', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('KU0090010', 'KU0090010button1', 'KU10101');
}
};
// script17="onClick;10;CHK;_KU0090010form1/OPTION_ID[eq]JA*[and]~LEN(_KU0090010form1/SHIP_PLAN_DATE_TIME_TO)[eq]4@*6"
expj.KU0090010.KU0090010button1.Select.onClick10 = function () {
  console.log('Select script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0090010', 'KU0090010button1', '_KU0090010form1/OPTION_ID'), '[eq]', 'JA*') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_TO'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script18="child;6;CHK;[{~CHARAT(_KU0090010form1/SHIP_PLAN_DATE_TIME_TO:0)}*10+{~CHARAT(_KU0090010form1/SHIP_PLAN_DATE_TIME_TO:1)}][gte]24[or][{~CHARAT(_KU0090010form1/SHIP_PLAN_DATE_TIME_TO:2)}*10+{~CHARAT(_KU0090010form1/SHIP_PLAN_DATE_TIME_TO:3)}][gte]60@!KU10101"
expj.KU0090010.KU0090010button1.Select.child6 = function () {
  console.log('Select script18');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_TO', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_TO', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_TO', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('KU0090010', 'KU0090010button1', '_KU0090010form1/SHIP_PLAN_DATE_TIME_TO', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('KU0090010', 'KU0090010button1', 'KU10101');
}
};
// script19="onClick;11;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0090010form1/*@KU0090010Servlet,,"
expj.KU0090010.KU0090010button1.Select.onClick11 = function () {
  console.log('Select script19');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0090010', 'KU0090010button1', '_KU0090010form1/*', 'KU0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0090010', response);
expj.common.updateBusinessScreenTab('KU0090010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KU0090010.KU0090010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 11; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0090010.KU0090010button1.Select['onClick' + i])) {
        expj.KU0090010.KU0090010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KU0090010.KU0090010button1.Select.executeAllOnDecision = function () {
};
expj.KU0090010.KU0090010button1.Select.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0090010', 'KU0090010button1', 'Select', this, 'Button');
    }
  });
  expj.KU0090010.KU0090010button1.Select.executePScriptOnLoad();
};

expj.KU0090010.KU0090010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KU0090010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0090010-KU0090010button1-Select" name="Select" class="KU0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- 2段目のDataGrid配置↓ --><script class="expj-script-KU0090010-KU0090010view1">
expj.KU0090010.KU0090010view1 = {};
expj.KU0090010.KU0090010view1.executeAllOnClick = function () {
};
expj.KU0090010.KU0090010view1.executeAllOnDecision = function () {
  console.log('execute KU0090010view1.onDecision');
};
expj.KU0090010.KU0090010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KU0090010view1", "expj.KU0090010.KU0090010view1.executeAllOnClick");
%>
  expj.KU0090010.KU0090010view1.executePScriptOnLoad();
};

expj.KU0090010.KU0090010view1.executePScriptOnLoad = function () {
  console.log('execute KU0090010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KU0090010-KU0090010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String KU0090010view1_Id = "KU0090010view1";
 String KU0090010view1_select = "single";
 String KU0090010view1_sortable = "true";
 String KU0090010view1_resize = "true";
 String KU0090010view1_scroll = "true";
 StringBuffer KU0090010view1_HB = new StringBuffer();
 StringBuffer KU0090010view1_DB = new StringBuffer();
%>
<%
 KU0090010view1_select = "single";
 KU0090010view1_sortable = "true";
 KU0090010view1_resize = "true";
 KU0090010view1_scroll = "true";
%>
<%
 KU0090010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
%>
     
<%
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_INVOICE_CTL_NO",rb))).append("', 'name':'l_SHIP_INVOICE_CTL_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INVOICE_CD_1",rb))).append("', 'name':'l_INVOICE_CD_1', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'140px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SCDL_SHIP_DATE",rb))).append("', 'name':'l_SCDL_SHIP_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CD",rb))).append("', 'name':'l_CUST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'140px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_CD",rb))).append("', 'name':'l_DLV_LOC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEPARTURE_PLACE",rb))).append("', 'name':'l_DEPARTURE_PLACE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEPARTURE_DATE",rb))).append("', 'name':'l_DEPARTURE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ARRIVAL_PLACE",rb))).append("', 'name':'l_ARRIVAL_PLACE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ARRIVAL_DATE_1",rb))).append("', 'name':'l_ARRIVAL_DATE_1', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TRANSPORT_METHOD",rb))).append("', 'name':'l_TRANSPORT_METHOD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_NO",rb))).append("', 'name':'l_SHIP_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INVOICE_AMOUNT",rb))).append("', 'name':'l_INVOICE_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INVOICE_TAX_AMOUNT",rb))).append("', 'name':'l_INVOICE_TAX_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REMARKS_1",rb))).append("', 'name':'l_REMARKS_1', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
KU0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REMARKS_2",rb))).append("', 'name':'l_REMARKS_2', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0090010view1_sortable).append("}").append(",");
%>
<%
 int aKU0090010StructLength = aKU0090010Control.getListsize();
 final KU0090010Struct structBackup = aKU0090010Struct;
 aKU0090010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKU0090010StructLength; ++loopCount) {
  if((aKU0090010Struct = (KU0090010Struct) aKU0090010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKU0090010Struct", aKU0090010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KU0090010view1_DB.append("[");
 KU0090010view1_DB.append(loopCount);
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_SHIP_INVOICE_CTL_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_SHIP_INVOICE_CTL_NO\" data-name=\"l_SHIP_INVOICE_CTL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_SHIP_INVOICE_CTL_NO())).append("</span>'");
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_INVOICE_CD_1-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_INVOICE_CD_1\" data-name=\"l_INVOICE_CD_1\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_INVOICE_CD_1())).append("</span>'");
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_SCDL_SHIP_DATE-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_SCDL_SHIP_DATE\" data-name=\"l_SCDL_SHIP_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_SCDL_SHIP_DATE())).append("</span>'");
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_CUST_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_CUST_CD\" data-name=\"l_CUST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_CUST_CD())).append("</span>'");
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_DLV_LOC_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_DLV_LOC_CD\" data-name=\"l_DLV_LOC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_DLV_LOC_CD())).append("</span>'");
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_DEPARTURE_PLACE-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_DEPARTURE_PLACE\" data-name=\"l_DEPARTURE_PLACE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_DEPARTURE_PLACE())).append("</span>'");
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_DEPARTURE_DATE-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_DEPARTURE_DATE\" data-name=\"l_DEPARTURE_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_DEPARTURE_DATE())).append("</span>'");
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_ARRIVAL_PLACE-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_ARRIVAL_PLACE\" data-name=\"l_ARRIVAL_PLACE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_ARRIVAL_PLACE())).append("</span>'");
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_ARRIVAL_DATE_1-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_ARRIVAL_DATE_1\" data-name=\"l_ARRIVAL_DATE_1\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_ARRIVAL_DATE_1())).append("</span>'");
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_TRANSPORT_METHOD-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_TRANSPORT_METHOD\" data-name=\"l_TRANSPORT_METHOD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_TRANSPORT_METHOD())).append("</span>'");
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_SHIP_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_SHIP_NO\" data-name=\"l_SHIP_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_SHIP_NO())).append("</span>'");
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_INVOICE_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_INVOICE_AMOUNT\" data-name=\"l_INVOICE_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_INVOICE_AMOUNT())).append("</span>'");
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_INVOICE_TAX_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_INVOICE_TAX_AMOUNT\" data-name=\"l_INVOICE_TAX_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_INVOICE_TAX_AMOUNT())).append("</span>'");
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_REMARKS_1-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_REMARKS_1\" data-name=\"l_REMARKS_1\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_REMARKS_1())).append("</span>'");
 KU0090010view1_DB.append(",").append("'<span id=\"expj-KU0090010-KU0090010view1-l_REMARKS_2-").append(loopCount).append("\" class=\"expj-label expj-KU0090010-KU0090010view1-l_REMARKS_2\" data-name=\"l_REMARKS_2\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0090010Struct.getl_REMARKS_2())).append("</span>'");
 KU0090010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKU0090010StructLength) {
   KU0090010view1_DB.append(",");
  }
 }
 aKU0090010Struct = structBackup;
 viewIdList.add(KU0090010view1_Id);
 viewSelectList.add(KU0090010view1_select);
 viewResizeList.add(KU0090010view1_resize);
 viewScrollList.add(KU0090010view1_scroll);
 viewHeaderDataList.add(KU0090010view1_HB);
 viewBodyDataList.add(KU0090010view1_DB);
%>
<%
}
%>
<!-- 2段目のDataGrid配置↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KU0090010-KU0090010button2">
expj.KU0090010.KU0090010button2 = {};
expj.KU0090010.KU0090010button2.executeAllOnDecision = function () {
  console.log('execute KU0090010button2.onDecision');
};
expj.KU0090010.KU0090010button2.executeOnLoad = function () {
  expj.KU0090010.KU0090010button2.executePScriptOnLoad();
};

expj.KU0090010.KU0090010button2.executePScriptOnLoad = function () {
  console.log('execute KU0090010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0090010-KU0090010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0090010-KU0090010button2-Maintenance">
expj.KU0090010.KU0090010button2.Maintenance = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_KU0090010view1/+@<%=strMoveServlet%>,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.KU0090010.KU0090010button2.Maintenance.onClick0 = function () {
  console.log('Maintenance script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0090010', 'KU0090010button2', '_KU0090010view1/+', '<%=strMoveServlet%>');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('<%=strMoveServlet%>');
var response = expj.common.accessBusinessScreen('POST', '<%=strMoveServlet%>', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'KU0090010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KU0090010.KU0090010button2.Maintenance.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0090010.KU0090010button2.Maintenance['onClick' + i])) {
        expj.KU0090010.KU0090010button2.Maintenance['onClick' + i]();
      }
    }
  }
};
expj.KU0090010.KU0090010button2.Maintenance.executeAllOnDecision = function () {
};
expj.KU0090010.KU0090010button2.Maintenance.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010button2-Maintenance').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0090010', 'KU0090010button2', 'Maintenance', this, 'Button');
    }
  });
  expj.KU0090010.KU0090010button2.Maintenance.executePScriptOnLoad();
};

expj.KU0090010.KU0090010button2.Maintenance.executePScriptOnLoad = function () {
  console.log('execute KU0090010button2/Maintenance.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010button2-Maintenance');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0090010-KU0090010button2-Maintenance" name="Maintenance" class="KU0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnMaintenance",rb)%></button><!-- メンテナンスボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
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
<span class="version">KU0090010 Revision: 1.1  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KU0090010-KU0090010button0">
expj.KU0090010.KU0090010button0 = {};
expj.KU0090010.KU0090010button0.executeAllOnDecision = function () {
  console.log('execute KU0090010button0.onDecision');
};
expj.KU0090010.KU0090010button0.executeOnLoad = function () {
  expj.KU0090010.KU0090010button0.executePScriptOnLoad();
};

expj.KU0090010.KU0090010button0.executePScriptOnLoad = function () {
  console.log('execute KU0090010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0090010-KU0090010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0090010-KU0090010button0-CsvOut">
expj.KU0090010.KU0090010button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0090010form1/*@KU0090010Servlet,,$ZZ07011"
expj.KU0090010.KU0090010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0090010', 'KU0090010button0', '_KU0090010form1/*', 'KU0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0090010', response);
expj.common.updateBusinessScreenTab('KU0090010', contents);
};
expj.common.pscript.callConfirm('KU0090010', 'KU0090010button0', 'ZZ07011', okEvent);
};
expj.KU0090010.KU0090010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0090010.KU0090010button0.CsvOut['onClick' + i])) {
        expj.KU0090010.KU0090010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.KU0090010.KU0090010button0.CsvOut.executeAllOnDecision = function () {
};
expj.KU0090010.KU0090010button0.CsvOut.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0090010', 'KU0090010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.KU0090010.KU0090010button0.CsvOut.executePScriptOnLoad();
};

expj.KU0090010.KU0090010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute KU0090010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0090010-KU0090010button0-CsvOut" name="CsvOut" class="KU0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010button0-Clear">
expj.KU0090010.KU0090010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KU0090010Servlet,,$ZZ07008"
expj.KU0090010.KU0090010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0090010', 'KU0090010button0', '', 'KU0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0090010', response);
expj.common.updateBusinessScreenTab('KU0090010', contents);
};
expj.common.pscript.callConfirm('KU0090010', 'KU0090010button0', 'ZZ07008', okEvent);
};
expj.KU0090010.KU0090010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0090010.KU0090010button0.Clear['onClick' + i])) {
        expj.KU0090010.KU0090010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KU0090010.KU0090010button0.Clear.executeAllOnDecision = function () {
};
expj.KU0090010.KU0090010button0.Clear.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0090010', 'KU0090010button0', 'Clear', this, 'Button');
    }
  });
  expj.KU0090010.KU0090010button0.Clear.executePScriptOnLoad();
};

expj.KU0090010.KU0090010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KU0090010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0090010-KU0090010button0-Clear" name="Clear" class="KU0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KU0090010-KU0090010button0-Close">
expj.KU0090010.KU0090010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KU0090010.KU0090010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KU0090010');
};
expj.KU0090010.KU0090010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0090010.KU0090010button0.Close['onClick' + i])) {
        expj.KU0090010.KU0090010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KU0090010.KU0090010button0.Close.executeAllOnDecision = function () {
};
expj.KU0090010.KU0090010button0.Close.executeOnLoad = function () {
  $('#expj-KU0090010-KU0090010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0090010', 'KU0090010button0', 'Close', this, 'Button');
    }
  });
  expj.KU0090010.KU0090010button0.Close.executePScriptOnLoad();
};

expj.KU0090010.KU0090010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KU0090010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KU0090010-KU0090010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0090010-KU0090010button0-Close" name="Close" class="KU0090010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KU0090010 (END)-->
<%
MessageStruct msgStruct = aKU0090010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KU0090010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KU0090010)) {
  expj.common.treeInstanceMap.KU0090010 = {};
}
expj.common.treeInstanceMap.KU0090010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0090010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KU0090010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0090010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KU0090010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KU0090010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KU0090010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KU0090010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KU0090010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KU0090010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KU0090010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0090010)) {
  expj.common.detailDialogMap.KU0090010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0090010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KU0090010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0090010.<%=detailId %>)) {
  expj.common.detailDialogMap.KU0090010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0090010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KU0090010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0090010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KU0090010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KU0090010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KU0090010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KU0090010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KU0090010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KU0090010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KU0090010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KU0090010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KU0090010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KU0090010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KU0090010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KU0090010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KU0090010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KU0090010)) {
  expj.common.viewInstanceMap.KU0090010 = {};
}
expj.common.viewInstanceMap.KU0090010.<%=viewId %> = {};
expj.common.viewInstanceMap.KU0090010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KU0090010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KU0090010.<%=viewId %>.init = function () {
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
    expj.KU0090010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KU0090010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KU0090010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KU0090010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KU0090010_init">
/**
 * KU0090010用のロード完了時初期化関数
 */
expj.KU0090010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KU0090010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KU0090010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KU0090010');
  expj.common.calendarInstanceMap.KU0090010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KU0090010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KU0090010.<%=detailId %>.init();
  expj.common.detailDialogMap.KU0090010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KU0090010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KU0090010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KU0090010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KU0090010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KU0090010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KU0090010-<%=detailId %>');
<%
 }
%>
  try{expj.KU0090010.KU0090010form1.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.PeekerCustCd.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.OPed.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.OPTION_ID.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.INVOICE_CD.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.SHIP_INVOICE_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateFrom.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.SHIP_INVOICE_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.CalendarShipInvoiceDateTo.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.SCDL_SHIP_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.CalendarSCDLShipDateFrom.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.SHIP_PLAN_DATE_TIME_FROM.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.SCDL_SHIP_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.CalendarSCDLShipDateTo.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.SHIP_PLAN_DATE_TIME_TO.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010button2.Maintenance.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010form1.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010button1.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010view1.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010button2.executeOnLoad();}catch(e){};
  try{expj.KU0090010.KU0090010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KU0090010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KU0090010', 'KU0090010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KU0090010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KU0090010-focus-move');
  // 初期フォーカス当てる処理
  $('.KU0090010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KU0090010', '<%=request.getContextPath() %>');
};

/**
 * KU0090010の全体onDecision処理
 */
expj.KU0090010.executeAllOnDecision = function () {
  expj.KU0090010.KU0090010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KU0090010_console">
expj.KU0090010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>