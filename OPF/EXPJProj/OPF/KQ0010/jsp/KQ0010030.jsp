<%-- ***
This file is generated
 GeneratedDate  : Thu Feb 16 20:13:59 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KQ0010\KQ0010030.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KQ0010.*" %>
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
<jsp:useBean id="aKQ0010030Control" class="com.nec.jp.orteus.metamorBase.KQ0010.KQ0010030Control" scope="request"/>
<jsp:useBean id="aKQ0010030Struct" class="com.nec.jp.orteus.metamorBase.KQ0010.KQ0010030Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

受注承認
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/jsp/KQ0010030.jsp,v $
$Author: geng-jia $	
$Revision: 1.12 $　$Date: 2017/02/22 02:07:11 $
********************************************************* --%>
<html>
<head>
<title>受注承認</title>
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
<script class="expj-script-KQ0010030_init">
  // KQ0010030名前空間
  expj.KQ0010030 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-KQ0010030" data-screen="KQ0010030" data-newdata="<%=aKQ0010030Control.isNewData() %>">
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
			  <script class="expj-script-KQ0010030-KQ0010030form1">
expj.KQ0010030.KQ0010030form1 = {};
expj.KQ0010030.KQ0010030form1.executeAllOnDecision = function () {
  console.log('execute KQ0010030form1.onDecision');
};
expj.KQ0010030.KQ0010030form1.executeOnLoad = function () {
  expj.KQ0010030.KQ0010030form1.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form1.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KQ0010030-KQ0010030form1" action="KQ0010030Servlet" name="KQ0010030form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
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
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<input type="hidden" id="expj-KQ0010030-KQ0010030form1-h_APPR_POWER_TYP" name="h_APPR_POWER_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010030Struct.geth_APPR_POWER_TYP()) %>">
<script class="expj-script-KQ0010030-KQ0010030form1-h_APPR_POWER_TYP">
expj.KQ0010030.KQ0010030form1.h_APPR_POWER_TYP = {};
expj.KQ0010030.KQ0010030form1.h_APPR_POWER_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0010030form1/h_APPR_POWER_TYP.onDecision');
  expj.KQ0010030.KQ0010030form1.executeAllOnDecision();
  expj.KQ0010030.executeAllOnDecision();
};
expj.KQ0010030.KQ0010030form1.h_APPR_POWER_TYP.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030form1-h_APPR_POWER_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010030', 'KQ0010030form1', 'h_APPR_POWER_TYP', this);
  });
  expj.KQ0010030.KQ0010030form1.h_APPR_POWER_TYP.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form1.h_APPR_POWER_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form1/h_APPR_POWER_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030form1-h_APPR_POWER_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030form1-r1_FILTER1">
expj.KQ0010030.KQ0010030form1.r1_FILTER1 = {};
expj.KQ0010030.KQ0010030form1.r1_FILTER1.executeAllOnDecision = function () {
  console.log('execute KQ0010030form1/r1_FILTER1.onDecision');
  expj.KQ0010030.KQ0010030form1.executeAllOnDecision();
  expj.KQ0010030.executeAllOnDecision();
};
expj.KQ0010030.KQ0010030form1.r1_FILTER1.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030form1-r1_FILTER1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030form1', 'r1_FILTER1', this, 'RadioButton');
    }
  });
  expj.KQ0010030.KQ0010030form1.r1_FILTER1.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form1.r1_FILTER1.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form1/r1_FILTER1.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030form1-r1_FILTER1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="FILTER1" data-name="r1_FILTER1" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0010030Struct.getr1_FILTER1())) || "".equals(TypeConverter.convert(aKQ0010030Struct.getr1_FILTER1())))?"checked=\"checked\"": "" %> class="" id="expj-KQ0010030-KQ0010030form1-r1_FILTER1" ><label for="expj-KQ0010030-KQ0010030form1-r1_FILTER1"><%=CoreTools.getRBString("Expj.Cmt5096",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030form1-r2_FILTER1">
expj.KQ0010030.KQ0010030form1.r2_FILTER1 = {};
expj.KQ0010030.KQ0010030form1.r2_FILTER1.executeAllOnDecision = function () {
  console.log('execute KQ0010030form1/r2_FILTER1.onDecision');
  expj.KQ0010030.KQ0010030form1.executeAllOnDecision();
  expj.KQ0010030.executeAllOnDecision();
};
expj.KQ0010030.KQ0010030form1.r2_FILTER1.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030form1-r2_FILTER1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030form1', 'r2_FILTER1', this, 'RadioButton');
    }
  });
  expj.KQ0010030.KQ0010030form1.r2_FILTER1.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form1.r2_FILTER1.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form1/r2_FILTER1.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030form1-r2_FILTER1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:34px;text-align:left;"><input type="radio" name="FILTER1" data-name="r2_FILTER1" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0010030Struct.getr2_FILTER1())))?"checked=\"checked\"":"" %> class="" id="expj-KQ0010030-KQ0010030form1-r2_FILTER1" ><label for="expj-KQ0010030-KQ0010030form1-r2_FILTER1"><%=CoreTools.getRBString("Expj.Cmt3168",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<input type="hidden" id="expj-KQ0010030-KQ0010030form1-h_REQUEST_APPR_SAME" name="h_REQUEST_APPR_SAME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010030Struct.geth_REQUEST_APPR_SAME()) %>">
<script class="expj-script-KQ0010030-KQ0010030form1-h_REQUEST_APPR_SAME">
expj.KQ0010030.KQ0010030form1.h_REQUEST_APPR_SAME = {};
expj.KQ0010030.KQ0010030form1.h_REQUEST_APPR_SAME.executeAllOnDecision = function () {
  console.log('execute KQ0010030form1/h_REQUEST_APPR_SAME.onDecision');
  expj.KQ0010030.KQ0010030form1.executeAllOnDecision();
  expj.KQ0010030.executeAllOnDecision();
};
expj.KQ0010030.KQ0010030form1.h_REQUEST_APPR_SAME.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030form1-h_REQUEST_APPR_SAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010030', 'KQ0010030form1', 'h_REQUEST_APPR_SAME', this);
  });
  expj.KQ0010030.KQ0010030form1.h_REQUEST_APPR_SAME.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form1.h_REQUEST_APPR_SAME.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form1/h_REQUEST_APPR_SAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030form1-h_REQUEST_APPR_SAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030form1-r3_FILTER1">
expj.KQ0010030.KQ0010030form1.r3_FILTER1 = {};
expj.KQ0010030.KQ0010030form1.r3_FILTER1.executeAllOnDecision = function () {
  console.log('execute KQ0010030form1/r3_FILTER1.onDecision');
  expj.KQ0010030.KQ0010030form1.executeAllOnDecision();
  expj.KQ0010030.executeAllOnDecision();
};
expj.KQ0010030.KQ0010030form1.r3_FILTER1.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030form1-r3_FILTER1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030form1', 'r3_FILTER1', this, 'RadioButton');
    }
  });
  expj.KQ0010030.KQ0010030form1.r3_FILTER1.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form1.r3_FILTER1.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form1/r3_FILTER1.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030form1-r3_FILTER1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="radio" name="FILTER1" data-name="r3_FILTER1" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0010030Struct.getr3_FILTER1())))?"checked=\"checked\"":"" %> class="" id="expj-KQ0010030-KQ0010030form1-r3_FILTER1" ><label for="expj-KQ0010030-KQ0010030form1-r3_FILTER1"><%=CoreTools.getRBString("Expj.Cmt3169",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-KQ0010030-KQ0010030form1-h_SELECT_TYP" name="h_SELECT_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010030Struct.geth_SELECT_TYP()) %>">
<script class="expj-script-KQ0010030-KQ0010030form1-h_SELECT_TYP">
expj.KQ0010030.KQ0010030form1.h_SELECT_TYP = {};
expj.KQ0010030.KQ0010030form1.h_SELECT_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0010030form1/h_SELECT_TYP.onDecision');
  expj.KQ0010030.KQ0010030form1.executeAllOnDecision();
  expj.KQ0010030.executeAllOnDecision();
};
expj.KQ0010030.KQ0010030form1.h_SELECT_TYP.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030form1-h_SELECT_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010030', 'KQ0010030form1', 'h_SELECT_TYP', this);
  });
  expj.KQ0010030.KQ0010030form1.h_SELECT_TYP.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form1.h_SELECT_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form1/h_SELECT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030form1-h_SELECT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030form1-CUST_CD">
expj.KQ0010030.KQ0010030form1.CUST_CD = {};
expj.KQ0010030.KQ0010030form1.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010030form1/CUST_CD.onDecision');
  expj.KQ0010030.KQ0010030form1.executeAllOnDecision();
  expj.KQ0010030.executeAllOnDecision();
};
expj.KQ0010030.KQ0010030form1.CUST_CD.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030form1-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010030', 'KQ0010030form1', 'CUST_CD', this);
  });
  expj.KQ0010030.KQ0010030form1.CUST_CD.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form1.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form1/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030form1-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010030-KQ0010030form1-CUST_CD" name="CUST_CD" class="KQ0010030-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKQ0010030Struct.getCUST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030form1-PeekerCustCd">
expj.KQ0010030.KQ0010030form1.PeekerCustCd = {};
// script1="onClick;0;PEEKER;_KQ0010030form1/CUST_CD@<%=contextNo%>"
expj.KQ0010030.KQ0010030form1.PeekerCustCd.onClick0 = function () {
  console.log('PeekerCustCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0010030';
var parameterValues = 'PeekerCustCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0010030', 'KQ0010030form1', '_KQ0010030form1/CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0010030form1/CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0010030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0010030.KQ0010030form1.PeekerCustCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030form1.PeekerCustCd['onClick' + i])) {
        expj.KQ0010030.KQ0010030form1.PeekerCustCd['onClick' + i]();
      }
    }
  }
};
expj.KQ0010030.KQ0010030form1.PeekerCustCd.executeAllOnDecision = function () {
};
expj.KQ0010030.KQ0010030form1.PeekerCustCd.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030form1-PeekerCustCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030form1', 'PeekerCustCd', this, 'Button');
    }
  });
  expj.KQ0010030.KQ0010030form1.PeekerCustCd.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form1.PeekerCustCd.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form1/PeekerCustCd.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030form1-PeekerCustCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0010030-KQ0010030form1-PeekerCustCd" class="KQ0010030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_ACPT_DATE",rb)%></span><!-- 受注日 --></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030form1-START_DATE">
expj.KQ0010030.KQ0010030form1.START_DATE = {};
expj.KQ0010030.KQ0010030form1.START_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0010030form1/START_DATE.onDecision');
  expj.KQ0010030.KQ0010030form1.executeAllOnDecision();
  expj.KQ0010030.executeAllOnDecision();
};
expj.KQ0010030.KQ0010030form1.START_DATE.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030form1-START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010030', 'KQ0010030form1', 'START_DATE', this);
  });
  expj.KQ0010030.KQ0010030form1.START_DATE.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form1.START_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form1/START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030form1-START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0010030-KQ0010030form1-START_DATE" name="START_DATE" class="KQ0010030-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0010030Struct.getSTART_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030form1-START_DATE_CALENDAR">
expj.KQ0010030.KQ0010030form1.START_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KQ0010030form1/START_DATE"
expj.KQ0010030.KQ0010030form1.START_DATE_CALENDAR.onClick0 = function () {
  console.log('START_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KQ0010030','KQ0010030form1','_KQ0010030form1/START_DATE');
};
expj.KQ0010030.KQ0010030form1.START_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030form1.START_DATE_CALENDAR['onClick' + i])) {
        expj.KQ0010030.KQ0010030form1.START_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KQ0010030.KQ0010030form1.START_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KQ0010030.KQ0010030form1.START_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030form1-START_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030form1', 'START_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0010030','KQ0010030form1','_KQ0010030form1/START_DATE');
  expj.KQ0010030.KQ0010030form1.START_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form1.START_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form1/START_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030form1-START_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0010030-KQ0010030form1-START_DATE_CALENDAR" class="KQ0010030-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:34px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030form1-END_DATE">
expj.KQ0010030.KQ0010030form1.END_DATE = {};
expj.KQ0010030.KQ0010030form1.END_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0010030form1/END_DATE.onDecision');
  expj.KQ0010030.KQ0010030form1.executeAllOnDecision();
  expj.KQ0010030.executeAllOnDecision();
};
expj.KQ0010030.KQ0010030form1.END_DATE.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030form1-END_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010030', 'KQ0010030form1', 'END_DATE', this);
  });
  expj.KQ0010030.KQ0010030form1.END_DATE.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form1.END_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form1/END_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030form1-END_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0010030-KQ0010030form1-END_DATE" name="END_DATE" class="KQ0010030-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0010030Struct.getEND_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030form1-END_DATE_CALENDAR">
expj.KQ0010030.KQ0010030form1.END_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KQ0010030form1/END_DATE"
expj.KQ0010030.KQ0010030form1.END_DATE_CALENDAR.onClick0 = function () {
  console.log('END_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KQ0010030','KQ0010030form1','_KQ0010030form1/END_DATE');
};
expj.KQ0010030.KQ0010030form1.END_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030form1.END_DATE_CALENDAR['onClick' + i])) {
        expj.KQ0010030.KQ0010030form1.END_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KQ0010030.KQ0010030form1.END_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KQ0010030.KQ0010030form1.END_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030form1-END_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030form1', 'END_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0010030','KQ0010030form1','_KQ0010030form1/END_DATE');
  expj.KQ0010030.KQ0010030form1.END_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form1.END_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form1/END_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030form1-END_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0010030-KQ0010030form1-END_DATE_CALENDAR" class="KQ0010030-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KQ0010030-KQ0010030button1">
expj.KQ0010030.KQ0010030button1 = {};
expj.KQ0010030.KQ0010030button1.executeAllOnDecision = function () {
  console.log('execute KQ0010030button1.onDecision');
};
expj.KQ0010030.KQ0010030button1.executeOnLoad = function () {
  expj.KQ0010030.KQ0010030button1.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030button1.executePScriptOnLoad = function () {
  console.log('execute KQ0010030button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0010030-KQ0010030button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0010030-KQ0010030button1-Select">
expj.KQ0010030.KQ0010030button1.Select = {};
// script1="onClick;0;CHK;_KQ0010030form1/START_DATE[neq][and]_KQ0010030form1/END_DATE[neq][and]_KQ0010030form1/END_DATE[lt]_KQ0010030form1/START_DATE@!KQ10318"
expj.KQ0010030.KQ0010030button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010030', 'KQ0010030button1', '_KQ0010030form1/START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010030', 'KQ0010030button1', '_KQ0010030form1/END_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010030', 'KQ0010030button1', '_KQ0010030form1/END_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010030', 'KQ0010030button1', '_KQ0010030form1/START_DATE')))) {
expj.common.pscript.viewErrorMessage('KQ0010030', 'KQ0010030button1', 'KQ10318');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0010030form1/*@KQ0010030Servlet;"
expj.KQ0010030.KQ0010030button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010030', 'KQ0010030button1', '_KQ0010030form1/*', 'KQ0010030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010030', response);
expj.common.updateBusinessScreenTab('KQ0010030', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KQ0010030.KQ0010030button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030button1.Select['onClick' + i])) {
        expj.KQ0010030.KQ0010030button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KQ0010030.KQ0010030button1.Select.executeAllOnDecision = function () {
};
expj.KQ0010030.KQ0010030button1.Select.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030button1', 'Select', this, 'Button');
    }
  });
  expj.KQ0010030.KQ0010030button1.Select.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030button1.Select.executePScriptOnLoad = function () {
  console.log('execute KQ0010030button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010030-KQ0010030button1-Select" name="Select" class="KQ0010030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに中段検索条件用のDataGridを配置する。↓ --><script class="expj-script-KQ0010030-KQ0010030form2">
expj.KQ0010030.KQ0010030form2 = {};
expj.KQ0010030.KQ0010030form2.executeAllOnDecision = function () {
  console.log('execute KQ0010030form2.onDecision');
};
expj.KQ0010030.KQ0010030form2.executeOnLoad = function () {
  expj.KQ0010030.KQ0010030form2.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form2.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KQ0010030-KQ0010030form2" action="KQ0010030Servlet" name="KQ0010030form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3163",rb)%></span><!-- 保留理由 --></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030form2-RESERVE_CAUSE">
expj.KQ0010030.KQ0010030form2.RESERVE_CAUSE = {};
expj.KQ0010030.KQ0010030form2.RESERVE_CAUSE.executeAllOnDecision = function () {
  console.log('execute KQ0010030form2/RESERVE_CAUSE.onDecision');
  expj.KQ0010030.KQ0010030form2.executeAllOnDecision();
  expj.KQ0010030.executeAllOnDecision();
};
expj.KQ0010030.KQ0010030form2.RESERVE_CAUSE.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030form2-RESERVE_CAUSE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010030', 'KQ0010030form2', 'RESERVE_CAUSE', this);
  });
  expj.KQ0010030.KQ0010030form2.RESERVE_CAUSE.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030form2.RESERVE_CAUSE.executePScriptOnLoad = function () {
  console.log('execute KQ0010030form2/RESERVE_CAUSE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030form2-RESERVE_CAUSE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KQ0010030-KQ0010030form2-RESERVE_CAUSE" name="RESERVE_CAUSE" class="KQ0010030-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010030Struct.getRESERVE_CAUSE()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに中段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame01" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame03 button-area-left" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KQ0010030-KQ0010030view1">
expj.KQ0010030.KQ0010030view1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.KQ0010030.KQ0010030view1.onLoad0 = function () {
  console.log('KQ0010030view1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHK;?KQ0010030view1/*[eq]NORMAL@*0,*1"
expj.KQ0010030.KQ0010030view1.onDecision0 = function () {
  console.log('KQ0010030view1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010030', 'KQ0010030view1', '?KQ0010030view1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_KQ0010030button2/CheckAll,_KQ0010030button2/CheckClear"
expj.KQ0010030.KQ0010030view1.child0 = function () {
  console.log('KQ0010030view1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/CheckClear');
};
// script4="child;1;MASK;_KQ0010030button2/CheckAll,_KQ0010030button2/CheckClear"
expj.KQ0010030.KQ0010030view1.child1 = function () {
  console.log('KQ0010030view1 script4');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/CheckClear');
};
// script5="onLoad;1;CALL;onClick@0,1,2"
expj.KQ0010030.KQ0010030view1.onLoad1 = function () {
  console.log('KQ0010030view1 script5');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick1)){this.onClick1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick2)){this.onClick2();}
};
// script6="onClick;0;CHK;?KQ0010030view1/?[eq]NOT_SELECTED@*2,*3"
expj.KQ0010030.KQ0010030view1.onClick0 = function () {
  console.log('KQ0010030view1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010030', 'KQ0010030view1', '?KQ0010030view1/?'), '[eq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script7="child;2;MASK;_KQ0010030button2/ApprAssort,_KQ0010030button2/ReserveAssort,_KQ0010030button2/ReserveDelAssort,_KQ0010030button2/ApprDelAssort"
expj.KQ0010030.KQ0010030view1.child2 = function () {
  console.log('KQ0010030view1 script7');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ApprAssort');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ReserveAssort');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ReserveDelAssort');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ApprDelAssort');
};
// script9="child;3;SELCHK;KQ0010030view1:_h_STATUS[eq]1@*4,*6"
expj.KQ0010030.KQ0010030view1.child3 = function () {
  console.log('KQ0010030view1 script9');
var selectCells = expj.common.pscript.getSelectedVIEWCells('KQ0010030', 'KQ0010030view1');
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
// script10="child;4;UNMASK;_KQ0010030button2/ApprAssort,_KQ0010030button2/ReserveAssort,_KQ0010030button2/ApprDelAssort@*5"
expj.KQ0010030.KQ0010030view1.child4 = function () {
  console.log('KQ0010030view1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ApprAssort');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ReserveAssort');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ApprDelAssort');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script11="child;5;MASK;_KQ0010030button2/ReserveDelAssort"
expj.KQ0010030.KQ0010030view1.child5 = function () {
  console.log('KQ0010030view1 script11');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ReserveDelAssort');
};
// script12="child;6;SELCHK;KQ0010030view1:_h_STATUS[eq]2@*7,*9"
expj.KQ0010030.KQ0010030view1.child6 = function () {
  console.log('KQ0010030view1 script12');
var selectCells = expj.common.pscript.getSelectedVIEWCells('KQ0010030', 'KQ0010030view1');
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
// script13="child;7;UNMASK;_KQ0010030button2/ReserveDelAssort@*8"
expj.KQ0010030.KQ0010030view1.child7 = function () {
  console.log('KQ0010030view1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ReserveDelAssort');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script14="child;8;MASK;_KQ0010030button2/ApprAssort,_KQ0010030button2/ReserveAssort,_KQ0010030button2/ApprDelAssort"
expj.KQ0010030.KQ0010030view1.child8 = function () {
  console.log('KQ0010030view1 script14');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ApprAssort');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ReserveAssort');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ApprDelAssort');
};
// script15="child;9;MASK;_KQ0010030button2/ApprAssort,_KQ0010030button2/ReserveAssort,_KQ0010030button2/ReserveDelAssort,_KQ0010030button2/ApprDelAssort"
expj.KQ0010030.KQ0010030view1.child9 = function () {
  console.log('KQ0010030view1 script15');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ApprAssort');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ReserveAssort');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ReserveDelAssort');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ApprDelAssort');
};
// script16="onClick;1;CHK;_KQ0010030form1/h_APPR_POWER_TYP[eq]0@*16"
expj.KQ0010030.KQ0010030view1.onClick1 = function () {
  console.log('KQ0010030view1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010030', 'KQ0010030view1', '_KQ0010030form1/h_APPR_POWER_TYP'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script17="child;16;MASK;_KQ0010030button2/ApprAssort,_KQ0010030button2/ReserveAssort,_KQ0010030button2/ReserveDelAssort@*17"
expj.KQ0010030.KQ0010030view1.child16 = function () {
  console.log('KQ0010030view1 script17');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ApprAssort');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ReserveAssort');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ReserveDelAssort');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
// script18="onClick;2;CHK;?KQ0010030view1/?[eq]NOT_SELECTED@*17,*18"
expj.KQ0010030.KQ0010030view1.onClick2 = function () {
  console.log('KQ0010030view1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010030', 'KQ0010030view1', '?KQ0010030view1/?'), '[eq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script19="child;17;MASK;_KQ0010030button2/ApprDelAssort"
expj.KQ0010030.KQ0010030view1.child17 = function () {
  console.log('KQ0010030view1 script19');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ApprDelAssort');
};
// script20="child;18;SELCHK;KQ0010030view1:_l_REQUEST_BY[eq]<%=aKQ0010030Control.getsysUSER_CD()%>@*19,*17"
expj.KQ0010030.KQ0010030view1.child18 = function () {
  console.log('KQ0010030view1 script20');
var selectCells = expj.common.pscript.getSelectedVIEWCells('KQ0010030', 'KQ0010030view1');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.l_REQUEST_BY, '[eq]', '<%=aKQ0010030Control.getsysUSER_CD()%>'))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script21="child;19;UNMASK;_KQ0010030button2/ApprDelAssort"
expj.KQ0010030.KQ0010030view1.child19 = function () {
  console.log('KQ0010030view1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button2/ApprDelAssort');
};
// script22="onClick;3;CHK;?KQ0010030view1/?[eq]SINGLE@*20"
expj.KQ0010030.KQ0010030view1.onClick3 = function () {
  console.log('KQ0010030view1 script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010030', 'KQ0010030view1', '?KQ0010030view1/?'), '[eq]', 'SINGLE')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script23="child;20;FSHOW;KQ0010030float1@136"
expj.KQ0010030.KQ0010030view1.child20 = function () {
  console.log('KQ0010030view1 script23');
expj.common.pscript.showDetailWindow('KQ0010030', 'KQ0010030float1', '136');
};
// script24="onClick;4;CHK;?KQ0010030view1/?[eq]SINGLE@*21"
expj.KQ0010030.KQ0010030view1.onClick4 = function () {
  console.log('KQ0010030view1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010030', 'KQ0010030view1', '?KQ0010030view1/?'), '[eq]', 'SINGLE')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script25="child;21;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ClickDetail=ACT,_KQ0010030view1/+@KQ0010030Servlet"
expj.KQ0010030.KQ0010030view1.child21 = function () {
  console.log('KQ0010030view1 script25');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010030', 'KQ0010030view1', 'ClickDetail=ACT,_KQ0010030view1/+', 'KQ0010030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010030', response);
expj.common.updateBusinessScreenTab('KQ0010030', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script26="onDecision;1;CHK;?KQ0010030view1/*[eq]ERROR@*22,*23"
expj.KQ0010030.KQ0010030view1.onDecision1 = function () {
  console.log('KQ0010030view1 script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010030', 'KQ0010030view1', '?KQ0010030view1/*'), '[eq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
} else {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script27="child;22;MASK;_KQ0010030button1/Select"
expj.KQ0010030.KQ0010030view1.child22 = function () {
  console.log('KQ0010030view1 script27');
expj.common.pscript.setMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button1/Select');
};
// script28="child;23;UNMASK;_KQ0010030button1/Select"
expj.KQ0010030.KQ0010030view1.child23 = function () {
  console.log('KQ0010030view1 script28');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010030', 'KQ0010030view1', '_KQ0010030button1/Select');
};
expj.KQ0010030.KQ0010030view1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030view1['onClick' + i])) {
        expj.KQ0010030.KQ0010030view1['onClick' + i]();
      }
    }
  }
};
expj.KQ0010030.KQ0010030view1.executeAllOnDecision = function () {
  console.log('execute KQ0010030view1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030view1['onDecision' + i])) {
        expj.KQ0010030.KQ0010030view1['onDecision' + i]();
      }
    }
  }
};
expj.KQ0010030.KQ0010030view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KQ0010030view1", "expj.KQ0010030.KQ0010030view1.executeAllOnClick");
%>
  expj.KQ0010030.KQ0010030view1.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030view1.executePScriptOnLoad = function () {
  console.log('execute KQ0010030view1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030view1['onLoad' + i])) {
      expj.KQ0010030.KQ0010030view1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KQ0010030-KQ0010030view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aKQ0010030Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String KQ0010030view1_Id = "KQ0010030view1";
 String KQ0010030view1_select = "single";
 String KQ0010030view1_sortable = "true";
 String KQ0010030view1_resize = "true";
 String KQ0010030view1_scroll = "true";
 StringBuffer KQ0010030view1_HB = new StringBuffer();
 StringBuffer KQ0010030view1_DB = new StringBuffer();
%>
<%
 KQ0010030view1_select = "multi";
 KQ0010030view1_sortable = "true";
 KQ0010030view1_resize = "true";
 KQ0010030view1_scroll = "true";
%>
<%
 KQ0010030view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
%>
     
<%
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_STATUS', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_APPR_ID', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_SCREEN_URL', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EXEC_TYP",rb))).append("', 'name':'l_PROC_TYP_VALUE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_PROC_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5099",rb))).append("', 'name':'l_STATUS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5082",rb))).append("', 'name':'l_REQUEST_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3167",rb))).append("', 'name':'l_REQUEST_BY_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_REQUEST_BY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3165",rb))).append("', 'name':'l_APPR_REMARKS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3163",rb))).append("', 'name':'l_RESERVE_CAUSE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_TYP",rb))).append("', 'name':'l_ODR_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_ODR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ODR_NO",rb))).append("', 'name':'l_CUST_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb))).append("', 'name':'l_CUST_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_NAME",rb))).append("', 'name':'l_CUST_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CD",rb))).append("', 'name':'l_CUST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_NAME",rb))).append("', 'name':'l_CUST_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb))).append("', 'name':'l_DESINATED_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY_4",rb))).append("', 'name':'l_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT_1",rb))).append("', 'name':'l_UNIT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST",rb))).append("', 'name':'l_ODR_UNIT_PRICE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUR_UNIT",rb))).append("', 'name':'l_CUR_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SPCL_PRICE_CO",rb))).append("', 'name':'l_SPCL_PRICE_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_SPCL_PRICE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_CD",rb))).append("', 'name':'l_DLV_LOC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_NAME",rb))).append("', 'name':'l_DLV_LOC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEPO_TYP",rb))).append("', 'name':'l_DEPO_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_DEPO_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_ACPT_DATE",rb))).append("', 'name':'l_ODR_ACPT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3152",rb))).append("', 'name':'l_JOB_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb))).append("', 'name':'l_JOB_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ALC_GRP_CD",rb))).append("', 'name':'l_ALC_GRP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_REMARK",rb))).append("', 'name':'l_REMARKS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUS_DLV_KEY_CD",rb))).append("', 'name':'l_CUS_DLV_KEY_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUS_DLV_CD",rb))).append("', 'name':'l_CUS_DLV_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROJECT_CD",rb))).append("', 'name':'l_PROJECT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ESTIMATES_CD",rb))).append("', 'name':'l_ESTIMATE_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DETAIL_NO",rb))).append("', 'name':'l_DETAL_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ARRANGE_ITEMS_SPECIES",rb))).append("', 'name':'l_ESTIMATE_TYPE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt6705",rb))).append("', 'name':'l_OWN_PERSON_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt6706",rb))).append("', 'name':'l_OWN_ORG_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ORGN_ODR_NO",rb))).append("', 'name':'l_ORGN_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt6679",rb))).append("', 'name':'l_ADD_ODR_FLG', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_ODR_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
KQ0010030view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_ESTIMATE_TYPE', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010030view1_sortable).append("}").append(",");
%>
<%
 int aKQ0010030StructLength = aKQ0010030Control.getListsize();
 final KQ0010030Struct structBackup = aKQ0010030Struct;
 aKQ0010030Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKQ0010030StructLength; ++loopCount) {
  if((aKQ0010030Struct = (KQ0010030Struct) aKQ0010030Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKQ0010030Struct", aKQ0010030Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KQ0010030view1_DB.append("[");
 KQ0010030view1_DB.append(loopCount);
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-h_STATUS-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-h_STATUS\" data-name=\"h_STATUS\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.geth_STATUS())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-h_APPR_ID-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-h_APPR_ID\" data-name=\"h_APPR_ID\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.geth_APPR_ID())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-h_SCREEN_URL-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-h_SCREEN_URL\" data-name=\"h_SCREEN_URL\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.geth_SCREEN_URL())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_PROC_TYP_VALUE-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_PROC_TYP_VALUE\" data-name=\"l_PROC_TYP_VALUE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_PROC_TYP_VALUE())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-h_PROC_TYP-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-h_PROC_TYP\" data-name=\"h_PROC_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.geth_PROC_TYP())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_STATUS_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_STATUS_NAME\" data-name=\"l_STATUS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_STATUS_NAME())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_REQUEST_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_REQUEST_DATE\" data-name=\"l_REQUEST_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_REQUEST_DATE())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_REQUEST_BY_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_REQUEST_BY_NAME\" data-name=\"l_REQUEST_BY_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_REQUEST_BY_NAME())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_REQUEST_BY-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_REQUEST_BY\" data-name=\"l_REQUEST_BY\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_REQUEST_BY())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_APPR_REMARKS-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_APPR_REMARKS\" data-name=\"l_APPR_REMARKS\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_APPR_REMARKS())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_RESERVE_CAUSE-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_RESERVE_CAUSE\" data-name=\"l_RESERVE_CAUSE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_RESERVE_CAUSE())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_ODR_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_ODR_TYP_DN\" data-name=\"l_ODR_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_ODR_TYP_DN())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_ODR_TYP\" data-name=\"l_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_ODR_TYP())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_CUST_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_CUST_ODR_NO\" data-name=\"l_CUST_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_CUST_ODR_NO())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_CUST_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_CUST_ITEM_CD\" data-name=\"l_CUST_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_CUST_ITEM_CD())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_CUST_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_CUST_ITEM_NAME\" data-name=\"l_CUST_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_CUST_ITEM_NAME())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_ITEM_CD())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_ITEM_NAME())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_CUST_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_CUST_CD\" data-name=\"l_CUST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_CUST_CD())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_CUST_ANAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_CUST_ANAME\" data-name=\"l_CUST_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_CUST_ANAME())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_DESINATED_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_DESINATED_DLV_DATE\" data-name=\"l_DESINATED_DLV_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_DESINATED_DLV_DATE())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_ODR_QTY\" data-name=\"l_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_ODR_QTY())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_UNIT_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_UNIT_CD\" data-name=\"l_UNIT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_UNIT_CD())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_ODR_UNIT_PRICE-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_ODR_UNIT_PRICE\" data-name=\"l_ODR_UNIT_PRICE\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_ODR_UNIT_PRICE())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_CUR_UNIT-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_CUR_UNIT\" data-name=\"l_CUR_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_CUR_UNIT())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_SPCL_PRICE_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_SPCL_PRICE_TYP_DN\" data-name=\"l_SPCL_PRICE_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_SPCL_PRICE_TYP_DN())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_SPCL_PRICE_TYP-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_SPCL_PRICE_TYP\" data-name=\"l_SPCL_PRICE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_SPCL_PRICE_TYP())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_DLV_LOC_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_DLV_LOC_CD\" data-name=\"l_DLV_LOC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_DLV_LOC_CD())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_DLV_LOC_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_DLV_LOC_NAME\" data-name=\"l_DLV_LOC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_DLV_LOC_NAME())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_DEPO_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_DEPO_TYP_DN\" data-name=\"l_DEPO_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_DEPO_TYP_DN())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_DEPO_TYP-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_DEPO_TYP\" data-name=\"l_DEPO_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_DEPO_TYP())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_ODR_ACPT_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_ODR_ACPT_DATE\" data-name=\"l_ODR_ACPT_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_ODR_ACPT_DATE())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_JOB_ODR_CD())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_JOB_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_JOB_ODR_QTY\" data-name=\"l_JOB_ODR_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_JOB_ODR_QTY())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_JOB_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_JOB_ODR_DLV_DATE\" data-name=\"l_JOB_ODR_DLV_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_JOB_ODR_DLV_DATE())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_ALC_GRP_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_ALC_GRP_CD\" data-name=\"l_ALC_GRP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_ALC_GRP_CD())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_REMARKS-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_REMARKS\" data-name=\"l_REMARKS\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_REMARKS())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_CUS_DLV_KEY_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_CUS_DLV_KEY_CD\" data-name=\"l_CUS_DLV_KEY_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_CUS_DLV_KEY_CD())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_CUS_DLV_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_CUS_DLV_CD\" data-name=\"l_CUS_DLV_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_CUS_DLV_CD())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_PROJECT_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_PROJECT_CD\" data-name=\"l_PROJECT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_PROJECT_CD())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_ESTIMATE_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_ESTIMATE_NO\" data-name=\"l_ESTIMATE_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_ESTIMATE_NO())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_DETAL_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_DETAL_NO\" data-name=\"l_DETAL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_DETAL_NO())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_ESTIMATE_TYPE-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_ESTIMATE_TYPE\" data-name=\"l_ESTIMATE_TYPE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_ESTIMATE_TYPE())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_OWN_PERSON_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_OWN_PERSON_CD\" data-name=\"l_OWN_PERSON_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_OWN_PERSON_CD())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_OWN_ORG_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_OWN_ORG_CD\" data-name=\"l_OWN_ORG_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_OWN_ORG_CD())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_ORGN_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_ORGN_ODR_NO\" data-name=\"l_ORGN_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_ORGN_ODR_NO())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_ADD_ODR_FLG-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_ADD_ODR_FLG\" data-name=\"l_ADD_ODR_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_ADD_ODR_FLG())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-h_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-h_ODR_NO\" data-name=\"h_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.geth_ODR_NO())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-h_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-h_MODIFY_COUNT\" data-name=\"h_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.geth_MODIFY_COUNT())).append("</span>'");
 KQ0010030view1_DB.append(",").append("'<span id=\"expj-KQ0010030-KQ0010030view1-l_h_ESTIMATE_TYPE-").append(loopCount).append("\" class=\"expj-label expj-KQ0010030-KQ0010030view1-l_h_ESTIMATE_TYPE\" data-name=\"l_h_ESTIMATE_TYPE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getl_h_ESTIMATE_TYPE())).append("</span>'");
 KQ0010030view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKQ0010030StructLength) {
   KQ0010030view1_DB.append(",");
  }
 }
 aKQ0010030Struct = structBackup;
 viewIdList.add(KQ0010030view1_Id);
 viewSelectList.add(KQ0010030view1_select);
 viewResizeList.add(KQ0010030view1_resize);
 viewScrollList.add(KQ0010030view1_scroll);
 viewHeaderDataList.add(KQ0010030view1_HB);
 viewBodyDataList.add(KQ0010030view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:630px;"><script class="expj-script-KQ0010030-KQ0010030button2">
expj.KQ0010030.KQ0010030button2 = {};
expj.KQ0010030.KQ0010030button2.executeAllOnDecision = function () {
  console.log('execute KQ0010030button2.onDecision');
};
expj.KQ0010030.KQ0010030button2.executeOnLoad = function () {
  expj.KQ0010030.KQ0010030button2.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030button2.executePScriptOnLoad = function () {
  console.log('execute KQ0010030button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0010030-KQ0010030button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:630px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0010030-KQ0010030button2-ApprAssort">
expj.KQ0010030.KQ0010030button2.ApprAssort = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0010030form1/*,_KQ0010030view1/+@KQ0010030Servlet,,$AZ00038"
expj.KQ0010030.KQ0010030button2.ApprAssort.onClick0 = function () {
  console.log('ApprAssort script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010030', 'KQ0010030button2', '_KQ0010030form1/*,_KQ0010030view1/+', 'KQ0010030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010030', response);
expj.common.updateBusinessScreenTab('KQ0010030', contents);
};
expj.common.pscript.callConfirm('KQ0010030', 'KQ0010030button2', 'AZ00038', okEvent);
};
expj.KQ0010030.KQ0010030button2.ApprAssort.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030button2.ApprAssort['onClick' + i])) {
        expj.KQ0010030.KQ0010030button2.ApprAssort['onClick' + i]();
      }
    }
  }
};
expj.KQ0010030.KQ0010030button2.ApprAssort.executeAllOnDecision = function () {
};
expj.KQ0010030.KQ0010030button2.ApprAssort.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030button2-ApprAssort').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030button2', 'ApprAssort', this, 'Button');
    }
  });
  expj.KQ0010030.KQ0010030button2.ApprAssort.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030button2.ApprAssort.executePScriptOnLoad = function () {
  console.log('execute KQ0010030button2/ApprAssort.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030button2-ApprAssort');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010030-KQ0010030button2-ApprAssort" name="ApprAssort" class="KQ0010030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnApprAssort",rb)%></button><!-- 選択承認ボタン --></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030button2-ReserveAssort">
expj.KQ0010030.KQ0010030button2.ReserveAssort = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0010030form1/*,_KQ0010030form2/*,_KQ0010030view1/+@KQ0010030Servlet,,$AZ00039"
expj.KQ0010030.KQ0010030button2.ReserveAssort.onClick0 = function () {
  console.log('ReserveAssort script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010030', 'KQ0010030button2', '_KQ0010030form1/*,_KQ0010030form2/*,_KQ0010030view1/+', 'KQ0010030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010030', response);
expj.common.updateBusinessScreenTab('KQ0010030', contents);
};
expj.common.pscript.callConfirm('KQ0010030', 'KQ0010030button2', 'AZ00039', okEvent);
};
expj.KQ0010030.KQ0010030button2.ReserveAssort.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030button2.ReserveAssort['onClick' + i])) {
        expj.KQ0010030.KQ0010030button2.ReserveAssort['onClick' + i]();
      }
    }
  }
};
expj.KQ0010030.KQ0010030button2.ReserveAssort.executeAllOnDecision = function () {
};
expj.KQ0010030.KQ0010030button2.ReserveAssort.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030button2-ReserveAssort').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030button2', 'ReserveAssort', this, 'Button');
    }
  });
  expj.KQ0010030.KQ0010030button2.ReserveAssort.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030button2.ReserveAssort.executePScriptOnLoad = function () {
  console.log('execute KQ0010030button2/ReserveAssort.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030button2-ReserveAssort');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010030-KQ0010030button2-ReserveAssort" name="ReserveAssort" class="KQ0010030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReserveAssort",rb)%></button><!-- 選択保留ボタン --></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030button2-ReserveDelAssort">
expj.KQ0010030.KQ0010030button2.ReserveDelAssort = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0010030form1/*,_KQ0010030view1/+@KQ0010030Servlet,,$AZ00040"
expj.KQ0010030.KQ0010030button2.ReserveDelAssort.onClick0 = function () {
  console.log('ReserveDelAssort script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010030', 'KQ0010030button2', '_KQ0010030form1/*,_KQ0010030view1/+', 'KQ0010030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010030', response);
expj.common.updateBusinessScreenTab('KQ0010030', contents);
};
expj.common.pscript.callConfirm('KQ0010030', 'KQ0010030button2', 'AZ00040', okEvent);
};
expj.KQ0010030.KQ0010030button2.ReserveDelAssort.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030button2.ReserveDelAssort['onClick' + i])) {
        expj.KQ0010030.KQ0010030button2.ReserveDelAssort['onClick' + i]();
      }
    }
  }
};
expj.KQ0010030.KQ0010030button2.ReserveDelAssort.executeAllOnDecision = function () {
};
expj.KQ0010030.KQ0010030button2.ReserveDelAssort.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030button2-ReserveDelAssort').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030button2', 'ReserveDelAssort', this, 'Button');
    }
  });
  expj.KQ0010030.KQ0010030button2.ReserveDelAssort.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030button2.ReserveDelAssort.executePScriptOnLoad = function () {
  console.log('execute KQ0010030button2/ReserveDelAssort.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030button2-ReserveDelAssort');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010030-KQ0010030button2-ReserveDelAssort" name="ReserveDelAssort" class="KQ0010030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReserveDelAssort",rb)%></button><!-- 選択保留解除ボタン --></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030button2-ApprDelAssort">
expj.KQ0010030.KQ0010030button2.ApprDelAssort = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0010030form1/*,_KQ0010030view1/+@KQ0010030Servlet,,$AZ00099"
expj.KQ0010030.KQ0010030button2.ApprDelAssort.onClick0 = function () {
  console.log('ApprDelAssort script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010030', 'KQ0010030button2', '_KQ0010030form1/*,_KQ0010030view1/+', 'KQ0010030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010030', response);
expj.common.updateBusinessScreenTab('KQ0010030', contents);
};
expj.common.pscript.callConfirm('KQ0010030', 'KQ0010030button2', 'AZ00099', okEvent);
};
expj.KQ0010030.KQ0010030button2.ApprDelAssort.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030button2.ApprDelAssort['onClick' + i])) {
        expj.KQ0010030.KQ0010030button2.ApprDelAssort['onClick' + i]();
      }
    }
  }
};
expj.KQ0010030.KQ0010030button2.ApprDelAssort.executeAllOnDecision = function () {
};
expj.KQ0010030.KQ0010030button2.ApprDelAssort.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030button2-ApprDelAssort').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030button2', 'ApprDelAssort', this, 'Button');
    }
  });
  expj.KQ0010030.KQ0010030button2.ApprDelAssort.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030button2.ApprDelAssort.executePScriptOnLoad = function () {
  console.log('execute KQ0010030button2/ApprDelAssort.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030button2-ApprDelAssort');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010030-KQ0010030button2-ApprDelAssort" name="ApprDelAssort" class="KQ0010030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnApprDelAssort",rb)%></button><!-- 選択依頼削除ボタン --></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030button2-CheckAll">
expj.KQ0010030.KQ0010030button2.CheckAll = {};
// script1="onClick;0;DGSALL;KQ0010030view1"
expj.KQ0010030.KQ0010030button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('KQ0010030', 'KQ0010030view1');
};
expj.KQ0010030.KQ0010030button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030button2.CheckAll['onClick' + i])) {
        expj.KQ0010030.KQ0010030button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.KQ0010030.KQ0010030button2.CheckAll.executeAllOnDecision = function () {
};
expj.KQ0010030.KQ0010030button2.CheckAll.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030button2', 'CheckAll', this, 'Button');
    }
  });
  expj.KQ0010030.KQ0010030button2.CheckAll.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute KQ0010030button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010030-KQ0010030button2-CheckAll" name="CheckAll" class="KQ0010030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030button2-CheckClear">
expj.KQ0010030.KQ0010030button2.CheckClear = {};
// script1="onClick;0;DGSCANCEL;KQ0010030view1"
expj.KQ0010030.KQ0010030button2.CheckClear.onClick0 = function () {
  console.log('CheckClear script1');
expj.common.pscript.unselectVIEWAllRow('KQ0010030', 'KQ0010030view1');
};
expj.KQ0010030.KQ0010030button2.CheckClear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030button2.CheckClear['onClick' + i])) {
        expj.KQ0010030.KQ0010030button2.CheckClear['onClick' + i]();
      }
    }
  }
};
expj.KQ0010030.KQ0010030button2.CheckClear.executeAllOnDecision = function () {
};
expj.KQ0010030.KQ0010030button2.CheckClear.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030button2-CheckClear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030button2', 'CheckClear', this, 'Button');
    }
  });
  expj.KQ0010030.KQ0010030button2.CheckClear.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030button2.CheckClear.executePScriptOnLoad = function () {
  console.log('execute KQ0010030button2/CheckClear.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030button2-CheckClear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010030-KQ0010030button2-CheckClear" name="CheckClear" class="KQ0010030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 714px);"></div><!--/td-->
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
<span class="version">KQ0010030 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KQ0010030-KQ0010030button0">
expj.KQ0010030.KQ0010030button0 = {};
expj.KQ0010030.KQ0010030button0.executeAllOnDecision = function () {
  console.log('execute KQ0010030button0.onDecision');
};
expj.KQ0010030.KQ0010030button0.executeOnLoad = function () {
  expj.KQ0010030.KQ0010030button0.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030button0.executePScriptOnLoad = function () {
  console.log('execute KQ0010030button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0010030-KQ0010030button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0010030-KQ0010030button0-Clear">
expj.KQ0010030.KQ0010030button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KQ0010030Servlet,,$ZZ07008"
expj.KQ0010030.KQ0010030button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010030', 'KQ0010030button0', '', 'KQ0010030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010030', response);
expj.common.updateBusinessScreenTab('KQ0010030', contents);
};
expj.common.pscript.callConfirm('KQ0010030', 'KQ0010030button0', 'ZZ07008', okEvent);
};
expj.KQ0010030.KQ0010030button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030button0.Clear['onClick' + i])) {
        expj.KQ0010030.KQ0010030button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KQ0010030.KQ0010030button0.Clear.executeAllOnDecision = function () {
};
expj.KQ0010030.KQ0010030button0.Clear.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030button0', 'Clear', this, 'Button');
    }
  });
  expj.KQ0010030.KQ0010030button0.Clear.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KQ0010030button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010030-KQ0010030button0-Clear" name="Clear" class="KQ0010030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KQ0010030-KQ0010030button0-Close">
expj.KQ0010030.KQ0010030button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KQ0010030.KQ0010030button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KQ0010030');
};
expj.KQ0010030.KQ0010030button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010030.KQ0010030button0.Close['onClick' + i])) {
        expj.KQ0010030.KQ0010030button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KQ0010030.KQ0010030button0.Close.executeAllOnDecision = function () {
};
expj.KQ0010030.KQ0010030button0.Close.executeOnLoad = function () {
  $('#expj-KQ0010030-KQ0010030button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010030', 'KQ0010030button0', 'Close', this, 'Button');
    }
  });
  expj.KQ0010030.KQ0010030button0.Close.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030button0.Close.executePScriptOnLoad = function () {
  console.log('execute KQ0010030button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010030-KQ0010030button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010030-KQ0010030button0-Close" name="Close" class="KQ0010030-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KQ0010030 (END)-->
<script class="expj-script-KQ0010030-KQ0010030detail1">
expj.KQ0010030.KQ0010030detail1 = {};
expj.KQ0010030.KQ0010030detail1.executeAllOnDecision = function () {
  console.log('execute KQ0010030detail1.onDecision');
};
expj.KQ0010030.KQ0010030detail1.executeOnLoad = function () {
  expj.KQ0010030.KQ0010030detail1.executePScriptOnLoad();
};

expj.KQ0010030.KQ0010030detail1.executePScriptOnLoad = function () {
  console.log('execute KQ0010030detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aKQ0010030Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-KQ0010030-KQ0010030detail1" class="expj-datagird-detail" data-float="KQ0010030float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "KQ0010030detail1";
 detailFloat = "KQ0010030float1";
 detailWidth = 410;
 detailHeight = 200 + 47;
 String KQ0010030detail1_Id = "KQ0010030detail1";
 String KQ0010030detail1_select = "single";
 String KQ0010030detail1_sortable = "true";
 String KQ0010030detail1_resize = "true";
 String KQ0010030detail1_scroll = "true";
 StringBuffer KQ0010030detail1_HB = new StringBuffer();
 StringBuffer KQ0010030detail1_DB = new StringBuffer();
%>
<%
 KQ0010030detail1_sortable = "false";
 KQ0010030detail1_select = "none";
%>
<% KQ0010030detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(KQ0010030detail1_sortable).append("}").append(","); %>
<%  KQ0010030detail1_HB.append("{'visible':true,'width':'130px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(KQ0010030detail1_sortable).append("}").append(",");
KQ0010030detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col2','class':'expj-detail-cell expj-align-','sortable':").append(KQ0010030detail1_sortable).append("}").append(",");
KQ0010030detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col3','class':'expj-detail-cell expj-align-','sortable':").append(KQ0010030detail1_sortable).append("}").append(",");
KQ0010030detail1_HB.append("{'visible':true,'width':'60px','title':'','name':'col4','class':'expj-detail-cell expj-align-','sortable':").append(KQ0010030detail1_sortable).append("}").append(",");
 %>
  <% KQ0010030detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ACPT_ODR_CD",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_ODR_NO\" class=\"expj-label\" data-name=\"d_OLD_ODR_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_ODR_NO())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_ODR_NO\" class=\"expj-label\" data-name=\"d_NEW_ODR_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_ODR_NO())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_ODR_NO_CHANGE\" class=\"expj-label\" data-name=\"d_ODR_NO_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_ODR_NO_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.ODR_TYP",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_ODR_TYP\" class=\"expj-label\" data-name=\"d_OLD_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_ODR_TYP())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_ODR_TYP\" class=\"expj-label\" data-name=\"d_NEW_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_ODR_TYP())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_ODR_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_ODR_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_ODR_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.CUST_ODR_NO",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_CUST_ODR_NO\" class=\"expj-label\" data-name=\"d_OLD_CUST_ODR_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_CUST_ODR_NO())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_CUST_ODR_NO\" class=\"expj-label\" data-name=\"d_NEW_CUST_ODR_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_CUST_ODR_NO())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_CUST_ODR_NO_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_ODR_NO_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_CUST_ODR_NO_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_CUST_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_CUST_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_CUST_CD())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_CUST_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_CUST_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_CUST_ITEM_CD\" class=\"expj-label\" data-name=\"d_OLD_CUST_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_CUST_ITEM_CD())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_CUST_ITEM_CD\" class=\"expj-label\" data-name=\"d_NEW_CUST_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_CUST_ITEM_CD())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_CUST_ITEM_CD_CHANGE\" class=\"expj-label\" data-name=\"d_CUST_ITEM_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_CUST_ITEM_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.DLV_LOC_CD",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_DLV_LOC_CD\" class=\"expj-label\" data-name=\"d_OLD_DLV_LOC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_DLV_LOC_CD())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_DLV_LOC_CD\" class=\"expj-label\" data-name=\"d_NEW_DLV_LOC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_DLV_LOC_CD())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_DLV_LOC_CD_CHANGE\" class=\"expj-label\" data-name=\"d_DLV_LOC_CD_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_DLV_LOC_CD_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.ODR_QTY_4",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_ODR_QTY\" class=\"expj-label\" data-name=\"d_OLD_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_ODR_QTY\" class=\"expj-label\" data-name=\"d_NEW_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_ODR_QTY())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_ODR_QTY_CHANGE\" class=\"expj-label\" data-name=\"d_ODR_QTY_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_ODR_QTY_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_DESINATED_DLV_DATE\" class=\"expj-label\" data-name=\"d_OLD_DESINATED_DLV_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_DESINATED_DLV_DATE())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_DESINATED_DLV_DATE\" class=\"expj-label\" data-name=\"d_NEW_DESINATED_DLV_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_DESINATED_DLV_DATE())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_DESINATED_DLV_DATE_CHANGE\" class=\"expj-label\" data-name=\"d_DESINATED_DLV_DATE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_DESINATED_DLV_DATE_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.SPCL_PRICE_CO",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_SPCL_PRICE_TYP\" class=\"expj-label\" data-name=\"d_OLD_SPCL_PRICE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_SPCL_PRICE_TYP())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_SPCL_PRICE_TYP\" class=\"expj-label\" data-name=\"d_NEW_SPCL_PRICE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_SPCL_PRICE_TYP())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_SPCL_PRICE_TYP_CHANGE\" class=\"expj-label\" data-name=\"d_SPCL_PRICE_TYP_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_SPCL_PRICE_TYP_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.UNIT_COST",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_ODR_UNIT_PRICE\" class=\"expj-label\" data-name=\"d_OLD_ODR_UNIT_PRICE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_ODR_UNIT_PRICE())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_ODR_UNIT_PRICE\" class=\"expj-label\" data-name=\"d_NEW_ODR_UNIT_PRICE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_ODR_UNIT_PRICE())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_ODR_UNIT_PRICE_CHANGE\" class=\"expj-label\" data-name=\"d_ODR_UNIT_PRICE_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_ODR_UNIT_PRICE_CHANGE())).append("</span>").append("']").append(",");%>
 <% KQ0010030detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.SHIP_REMARK",rb)).append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_OLD_REMARKS\" class=\"expj-label\" data-name=\"d_OLD_REMARKS\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_OLD_REMARKS())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_NEW_REMARKS\" class=\"expj-label\" data-name=\"d_NEW_REMARKS\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_NEW_REMARKS())).append("</span>").append("','").append("<span id=\"expj-KQ0010030-KQ0010030detail1-d_REMARKS_CHANGE\" class=\"expj-label\" data-name=\"d_REMARKS_CHANGE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aKQ0010030Struct.getd_REMARKS_CHANGE())).append("</span>").append("']").append(",");%>
<%
 detailViewId = KQ0010030detail1_Id;
 detailViewSelect = KQ0010030detail1_select;
 detailViewResize = KQ0010030detail1_resize;
 detailViewScroll = KQ0010030detail1_scroll;
 detailViewHeaderData = KQ0010030detail1_HB;
 detailViewBodyData = KQ0010030detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aKQ0010030Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KQ0010030-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KQ0010030)) {
  expj.common.treeInstanceMap.KQ0010030 = {};
}
expj.common.treeInstanceMap.KQ0010030.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0010030.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KQ0010030.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0010030.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KQ0010030.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KQ0010030.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KQ0010030.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KQ0010030.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KQ0010030.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KQ0010030-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KQ0010030-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010030)) {
  expj.common.detailDialogMap.KQ0010030 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010030._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KQ0010030._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010030.<%=detailId %>)) {
  expj.common.detailDialogMap.KQ0010030.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010030.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010030.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KQ0010030.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KQ0010030.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KQ0010030-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KQ0010030-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KQ0010030-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KQ0010030.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KQ0010030.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KQ0010030._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KQ0010030-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KQ0010030)) {
  expj.common.viewInstanceMap.KQ0010030 = {};
}
expj.common.viewInstanceMap.KQ0010030.<%=viewId %> = {};
expj.common.viewInstanceMap.KQ0010030.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KQ0010030.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KQ0010030.<%=viewId %>.init = function () {
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
    expj.KQ0010030.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KQ0010030.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KQ0010030-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KQ0010030-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KQ0010030_init">
/**
 * KQ0010030用のロード完了時初期化関数
 */
expj.KQ0010030.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KQ0010030');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KQ0010030');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KQ0010030');
  expj.common.calendarInstanceMap.KQ0010030 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KQ0010030.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.init();
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KQ0010030.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KQ0010030.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KQ0010030');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KQ0010030');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KQ0010030-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KQ0010030-<%=detailId %>');
<%
 }
%>
  try{expj.KQ0010030.KQ0010030form1.h_APPR_POWER_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030form1.r1_FILTER1.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030form1.r2_FILTER1.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030form1.h_REQUEST_APPR_SAME.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030form1.r3_FILTER1.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030form1.h_SELECT_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030form1.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030form1.PeekerCustCd.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030form1.START_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030form1.START_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030form1.END_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030form1.END_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030button1.Select.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030form2.RESERVE_CAUSE.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030button2.ApprAssort.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030button2.ReserveAssort.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030button2.ReserveDelAssort.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030button2.ApprDelAssort.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030button2.CheckClear.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030button0.Close.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030form1.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030button1.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030form2.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030view1.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030button2.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030button0.executeOnLoad();}catch(e){};
  try{expj.KQ0010030.KQ0010030detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KQ0010030.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KQ0010030', 'KQ0010030');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KQ0010030');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KQ0010030-focus-move');
  // 初期フォーカス当てる処理
  $('.KQ0010030-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KQ0010030', '<%=request.getContextPath() %>');
};

/**
 * KQ0010030の全体onDecision処理
 */
expj.KQ0010030.executeAllOnDecision = function () {
  expj.KQ0010030.KQ0010030form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KQ0010030_console">
expj.KQ0010030.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>