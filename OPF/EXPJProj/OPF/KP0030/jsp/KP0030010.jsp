<%-- ***
This file is generated
 GeneratedDate  : Thu Feb 16 20:08:56 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KP0030\KP0030010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KP0030.*" %>
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
<jsp:useBean id="aKP0030010Control" class="com.nec.jp.orteus.metamorBase.KP0030.KP0030010Control" scope="request"/>
<jsp:useBean id="aKP0030010Struct" class="com.nec.jp.orteus.metamorBase.KP0030.KP0030010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

販売所要計画明細一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0030/jsp/KP0030010.jsp,v $
$Author: geng-jia $	
$Revision: 1.15 $　$Date: 2017/02/22 02:07:08 $
********************************************************* --%>
<html>
<head>
<title>販売所要計画明細一覧</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("KP0020010Servlet", so);
String numberColKind = "OBT_NUMBER;14.1;FLOOR;4";
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
<script class="expj-script-KP0030010_init">
  // KP0030010名前空間
  expj.KP0030010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-KP0030010" data-screen="KP0030010" data-newdata="<%=aKP0030010Control.isNewData() %>">
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
              <script class="expj-script-KP0030010-KP0030010form1">
expj.KP0030010.KP0030010form1 = {};
expj.KP0030010.KP0030010form1.executeAllOnDecision = function () {
  console.log('execute KP0030010form1.onDecision');
};
expj.KP0030010.KP0030010form1.executeOnLoad = function () {
  expj.KP0030010.KP0030010form1.executePScriptOnLoad();
};

expj.KP0030010.KP0030010form1.executePScriptOnLoad = function () {
  console.log('execute KP0030010form1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KP0030010-KP0030010form1" action="KP0030010Servlet" name="KP0030010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:119px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:119px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:center"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:170px;align:left"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KP0030010-KP0030010form1-IN_CUST_CD">
expj.KP0030010.KP0030010form1.IN_CUST_CD = {};
expj.KP0030010.KP0030010form1.IN_CUST_CD.executeAllOnDecision = function () {
  console.log('execute KP0030010form1/IN_CUST_CD.onDecision');
  expj.KP0030010.KP0030010form1.executeAllOnDecision();
  expj.KP0030010.executeAllOnDecision();
};
expj.KP0030010.KP0030010form1.IN_CUST_CD.executeOnLoad = function () {
  $('#expj-KP0030010-KP0030010form1-IN_CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0030010', 'KP0030010form1', 'IN_CUST_CD', this);
  });
  expj.KP0030010.KP0030010form1.IN_CUST_CD.executePScriptOnLoad();
};

expj.KP0030010.KP0030010form1.IN_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KP0030010form1/IN_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0030010-KP0030010form1-IN_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KP0030010-KP0030010form1-IN_CUST_CD" name="IN_CUST_CD" class="KP0030010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKP0030010Struct.getIN_CUST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KP0030010-KP0030010form1-PeekerIN_CUST_CD">
expj.KP0030010.KP0030010form1.PeekerIN_CUST_CD = {};
// script1="onClick;0;PEEKER;_KP0030010form1/IN_CUST_CD@<%=contextNo%>"
expj.KP0030010.KP0030010form1.PeekerIN_CUST_CD.onClick0 = function () {
  console.log('PeekerIN_CUST_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KP0030010';
var parameterValues = 'PeekerIN_CUST_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KP0030010', 'KP0030010form1', '_KP0030010form1/IN_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KP0030010form1/IN_CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KP0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KP0030010.KP0030010form1.PeekerIN_CUST_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0030010.KP0030010form1.PeekerIN_CUST_CD['onClick' + i])) {
        expj.KP0030010.KP0030010form1.PeekerIN_CUST_CD['onClick' + i]();
      }
    }
  }
};
expj.KP0030010.KP0030010form1.PeekerIN_CUST_CD.executeAllOnDecision = function () {
};
expj.KP0030010.KP0030010form1.PeekerIN_CUST_CD.executeOnLoad = function () {
  $('#expj-KP0030010-KP0030010form1-PeekerIN_CUST_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0030010', 'KP0030010form1', 'PeekerIN_CUST_CD', this, 'Button');
    }
  });
  expj.KP0030010.KP0030010form1.PeekerIN_CUST_CD.executePScriptOnLoad();
};

expj.KP0030010.KP0030010form1.PeekerIN_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KP0030010form1/PeekerIN_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0030010-KP0030010form1-PeekerIN_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KP0030010-KP0030010form1-PeekerIN_CUST_CD" class="KP0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)%></span><!-- 得意先品目番号 --></div><!--/td-->
<script class="expj-script-KP0030010-KP0030010form1-IN_CUST_ITEM_CD">
expj.KP0030010.KP0030010form1.IN_CUST_ITEM_CD = {};
expj.KP0030010.KP0030010form1.IN_CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KP0030010form1/IN_CUST_ITEM_CD.onDecision');
  expj.KP0030010.KP0030010form1.executeAllOnDecision();
  expj.KP0030010.executeAllOnDecision();
};
expj.KP0030010.KP0030010form1.IN_CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KP0030010-KP0030010form1-IN_CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0030010', 'KP0030010form1', 'IN_CUST_ITEM_CD', this);
  });
  expj.KP0030010.KP0030010form1.IN_CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KP0030010.KP0030010form1.IN_CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KP0030010form1/IN_CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0030010-KP0030010form1-IN_CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KP0030010-KP0030010form1-IN_CUST_ITEM_CD" name="IN_CUST_ITEM_CD" class="KP0030010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKP0030010Struct.getIN_CUST_ITEM_CD()) %>" maxlength="35" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KP0030010-KP0030010form1-IN_ITEM_CD">
expj.KP0030010.KP0030010form1.IN_ITEM_CD = {};
expj.KP0030010.KP0030010form1.IN_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KP0030010form1/IN_ITEM_CD.onDecision');
  expj.KP0030010.KP0030010form1.executeAllOnDecision();
  expj.KP0030010.executeAllOnDecision();
};
expj.KP0030010.KP0030010form1.IN_ITEM_CD.executeOnLoad = function () {
  $('#expj-KP0030010-KP0030010form1-IN_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0030010', 'KP0030010form1', 'IN_ITEM_CD', this);
  });
  expj.KP0030010.KP0030010form1.IN_ITEM_CD.executePScriptOnLoad();
};

expj.KP0030010.KP0030010form1.IN_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KP0030010form1/IN_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0030010-KP0030010form1-IN_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KP0030010-KP0030010form1-IN_ITEM_CD" name="IN_ITEM_CD" class="KP0030010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aKP0030010Struct.getIN_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KP0030010-KP0030010form1-PeekerIN_ITEM_CD">
expj.KP0030010.KP0030010form1.PeekerIN_ITEM_CD = {};
// script1="onClick;0;PEEKER;_KP0030010form1/IN_ITEM_CD@<%=contextNo%>"
expj.KP0030010.KP0030010form1.PeekerIN_ITEM_CD.onClick0 = function () {
  console.log('PeekerIN_ITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KP0030010';
var parameterValues = 'PeekerIN_ITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KP0030010', 'KP0030010form1', '_KP0030010form1/IN_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KP0030010form1/IN_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KP0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KP0030010.KP0030010form1.PeekerIN_ITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0030010.KP0030010form1.PeekerIN_ITEM_CD['onClick' + i])) {
        expj.KP0030010.KP0030010form1.PeekerIN_ITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.KP0030010.KP0030010form1.PeekerIN_ITEM_CD.executeAllOnDecision = function () {
};
expj.KP0030010.KP0030010form1.PeekerIN_ITEM_CD.executeOnLoad = function () {
  $('#expj-KP0030010-KP0030010form1-PeekerIN_ITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0030010', 'KP0030010form1', 'PeekerIN_ITEM_CD', this, 'Button');
    }
  });
  expj.KP0030010.KP0030010form1.PeekerIN_ITEM_CD.executePScriptOnLoad();
};

expj.KP0030010.KP0030010form1.PeekerIN_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KP0030010form1/PeekerIN_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0030010-KP0030010form1-PeekerIN_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KP0030010-KP0030010form1-PeekerIN_ITEM_CD" class="KP0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_LOC_CD",rb)%></span><!-- 納品場所コード --></div><!--/td-->
<script class="expj-script-KP0030010-KP0030010form1-IN_DLV_LOC_CD">
expj.KP0030010.KP0030010form1.IN_DLV_LOC_CD = {};
expj.KP0030010.KP0030010form1.IN_DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KP0030010form1/IN_DLV_LOC_CD.onDecision');
  expj.KP0030010.KP0030010form1.executeAllOnDecision();
  expj.KP0030010.executeAllOnDecision();
};
expj.KP0030010.KP0030010form1.IN_DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KP0030010-KP0030010form1-IN_DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0030010', 'KP0030010form1', 'IN_DLV_LOC_CD', this);
  });
  expj.KP0030010.KP0030010form1.IN_DLV_LOC_CD.executePScriptOnLoad();
};

expj.KP0030010.KP0030010form1.IN_DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KP0030010form1/IN_DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0030010-KP0030010form1-IN_DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KP0030010-KP0030010form1-IN_DLV_LOC_CD" name="IN_DLV_LOC_CD" class="KP0030010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKP0030010Struct.getIN_DLV_LOC_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0746",rb)%></span><!-- 計画期間 --></div><!--/td-->
<script class="expj-script-KP0030010-KP0030010form1-IN_STR_DATE">
expj.KP0030010.KP0030010form1.IN_STR_DATE = {};
expj.KP0030010.KP0030010form1.IN_STR_DATE.executeAllOnDecision = function () {
  console.log('execute KP0030010form1/IN_STR_DATE.onDecision');
  expj.KP0030010.KP0030010form1.executeAllOnDecision();
  expj.KP0030010.executeAllOnDecision();
};
expj.KP0030010.KP0030010form1.IN_STR_DATE.executeOnLoad = function () {
  $('#expj-KP0030010-KP0030010form1-IN_STR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0030010', 'KP0030010form1', 'IN_STR_DATE', this);
  });
  expj.KP0030010.KP0030010form1.IN_STR_DATE.executePScriptOnLoad();
};

expj.KP0030010.KP0030010form1.IN_STR_DATE.executePScriptOnLoad = function () {
  console.log('execute KP0030010form1/IN_STR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KP0030010-KP0030010form1-IN_STR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KP0030010-KP0030010form1-IN_STR_DATE" name="IN_STR_DATE" class="KP0030010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKP0030010Struct.getIN_STR_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KP0030010-KP0030010form1-CalendarIN_PLN_STR_DATE">
expj.KP0030010.KP0030010form1.CalendarIN_PLN_STR_DATE = {};
// script1="onClick;0;CALENDAR;_KP0030010form1/IN_STR_DATE"
expj.KP0030010.KP0030010form1.CalendarIN_PLN_STR_DATE.onClick0 = function () {
  console.log('CalendarIN_PLN_STR_DATE script1');
expj.common.pscript.executeCalendar('KP0030010','KP0030010form1','_KP0030010form1/IN_STR_DATE');
};
expj.KP0030010.KP0030010form1.CalendarIN_PLN_STR_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0030010.KP0030010form1.CalendarIN_PLN_STR_DATE['onClick' + i])) {
        expj.KP0030010.KP0030010form1.CalendarIN_PLN_STR_DATE['onClick' + i]();
      }
    }
  }
};
expj.KP0030010.KP0030010form1.CalendarIN_PLN_STR_DATE.executeAllOnDecision = function () {
};
expj.KP0030010.KP0030010form1.CalendarIN_PLN_STR_DATE.executeOnLoad = function () {
  $('#expj-KP0030010-KP0030010form1-CalendarIN_PLN_STR_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0030010', 'KP0030010form1', 'CalendarIN_PLN_STR_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KP0030010','KP0030010form1','_KP0030010form1/IN_STR_DATE');
  expj.KP0030010.KP0030010form1.CalendarIN_PLN_STR_DATE.executePScriptOnLoad();
};

expj.KP0030010.KP0030010form1.CalendarIN_PLN_STR_DATE.executePScriptOnLoad = function () {
  console.log('execute KP0030010form1/CalendarIN_PLN_STR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KP0030010-KP0030010form1-CalendarIN_PLN_STR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KP0030010-KP0030010form1-CalendarIN_PLN_STR_DATE" class="KP0030010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KP0030010-KP0030010form1-IN_END_DATE">
expj.KP0030010.KP0030010form1.IN_END_DATE = {};
expj.KP0030010.KP0030010form1.IN_END_DATE.executeAllOnDecision = function () {
  console.log('execute KP0030010form1/IN_END_DATE.onDecision');
  expj.KP0030010.KP0030010form1.executeAllOnDecision();
  expj.KP0030010.executeAllOnDecision();
};
expj.KP0030010.KP0030010form1.IN_END_DATE.executeOnLoad = function () {
  $('#expj-KP0030010-KP0030010form1-IN_END_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0030010', 'KP0030010form1', 'IN_END_DATE', this);
  });
  expj.KP0030010.KP0030010form1.IN_END_DATE.executePScriptOnLoad();
};

expj.KP0030010.KP0030010form1.IN_END_DATE.executePScriptOnLoad = function () {
  console.log('execute KP0030010form1/IN_END_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KP0030010-KP0030010form1-IN_END_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KP0030010-KP0030010form1-IN_END_DATE" name="IN_END_DATE" class="KP0030010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKP0030010Struct.getIN_END_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KP0030010-KP0030010form1-CalendarIN_PLN_END_DATE">
expj.KP0030010.KP0030010form1.CalendarIN_PLN_END_DATE = {};
// script1="onClick;0;CALENDAR;_KP0030010form1/IN_END_DATE"
expj.KP0030010.KP0030010form1.CalendarIN_PLN_END_DATE.onClick0 = function () {
  console.log('CalendarIN_PLN_END_DATE script1');
expj.common.pscript.executeCalendar('KP0030010','KP0030010form1','_KP0030010form1/IN_END_DATE');
};
expj.KP0030010.KP0030010form1.CalendarIN_PLN_END_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0030010.KP0030010form1.CalendarIN_PLN_END_DATE['onClick' + i])) {
        expj.KP0030010.KP0030010form1.CalendarIN_PLN_END_DATE['onClick' + i]();
      }
    }
  }
};
expj.KP0030010.KP0030010form1.CalendarIN_PLN_END_DATE.executeAllOnDecision = function () {
};
expj.KP0030010.KP0030010form1.CalendarIN_PLN_END_DATE.executeOnLoad = function () {
  $('#expj-KP0030010-KP0030010form1-CalendarIN_PLN_END_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0030010', 'KP0030010form1', 'CalendarIN_PLN_END_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KP0030010','KP0030010form1','_KP0030010form1/IN_END_DATE');
  expj.KP0030010.KP0030010form1.CalendarIN_PLN_END_DATE.executePScriptOnLoad();
};

expj.KP0030010.KP0030010form1.CalendarIN_PLN_END_DATE.executePScriptOnLoad = function () {
  console.log('execute KP0030010form1/CalendarIN_PLN_END_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KP0030010-KP0030010form1-CalendarIN_PLN_END_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-KP0030010-KP0030010form1-CalendarIN_PLN_END_DATE" class="KP0030010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KP0030010-KP0030010button1">
expj.KP0030010.KP0030010button1 = {};
expj.KP0030010.KP0030010button1.executeAllOnDecision = function () {
  console.log('execute KP0030010button1.onDecision');
};
expj.KP0030010.KP0030010button1.executeOnLoad = function () {
  expj.KP0030010.KP0030010button1.executePScriptOnLoad();
};

expj.KP0030010.KP0030010button1.executePScriptOnLoad = function () {
  console.log('execute KP0030010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KP0030010-KP0030010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KP0030010-KP0030010button1-Select">
expj.KP0030010.KP0030010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KP0030010form1/*@KP0030010Servlet"
expj.KP0030010.KP0030010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0030010', 'KP0030010button1', '_KP0030010form1/*', 'KP0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KP0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KP0030010', response);
expj.common.updateBusinessScreenTab('KP0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KP0030010.KP0030010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0030010.KP0030010button1.Select['onClick' + i])) {
        expj.KP0030010.KP0030010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KP0030010.KP0030010button1.Select.executeAllOnDecision = function () {
};
expj.KP0030010.KP0030010button1.Select.executeOnLoad = function () {
  $('#expj-KP0030010-KP0030010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0030010', 'KP0030010button1', 'Select', this, 'Button');
    }
  });
  expj.KP0030010.KP0030010button1.Select.executePScriptOnLoad();
};

expj.KP0030010.KP0030010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KP0030010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KP0030010-KP0030010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:105px;float:none;height:30px;"><button type="button" id="expj-KP0030010-KP0030010button1-Select" name="Select" class="KP0030010-focus-move" style="width:px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KP0030010-KP0030010view1">
expj.KP0030010.KP0030010view1 = {};
expj.KP0030010.KP0030010view1.executeAllOnClick = function () {
};
expj.KP0030010.KP0030010view1.executeAllOnDecision = function () {
  console.log('execute KP0030010view1.onDecision');
};
expj.KP0030010.KP0030010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KP0030010view1", "expj.KP0030010.KP0030010view1.executeAllOnClick");
%>
  expj.KP0030010.KP0030010view1.executePScriptOnLoad();
};

expj.KP0030010.KP0030010view1.executePScriptOnLoad = function () {
  console.log('execute KP0030010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KP0030010-KP0030010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String KP0030010view1_Id = "KP0030010view1";
 String KP0030010view1_select = "single";
 String KP0030010view1_sortable = "true";
 String KP0030010view1_resize = "true";
 String KP0030010view1_scroll = "true";
 StringBuffer KP0030010view1_HB = new StringBuffer();
 StringBuffer KP0030010view1_DB = new StringBuffer();
%>
<%
 KP0030010view1_select = "single";
 KP0030010view1_sortable = "true";
 KP0030010view1_resize = "true";
 KP0030010view1_scroll = "true";
%>
<%
 KP0030010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
%>
     
<%
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CD",rb))).append("', 'name':'CUST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_NAME",rb))).append("', 'name':'CUST_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_CD",rb))).append("', 'name':'DLV_LOC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_NAME",rb))).append("', 'name':'DLV_LOC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb))).append("', 'name':'CUST_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_NAME",rb))).append("', 'name':'CUST_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLN_STR_DATE",rb))).append("', 'name':'PLN_STR_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLN_END_DATE",rb))).append("', 'name':'PLN_END_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLN_QTY",rb))).append("', 'name':'PLN_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLN_QTY_REMAIN",rb))).append("', 'name':'PLN_QTY_REMAIN', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TERM_DAYS",rb))).append("', 'name':'TERM_DAYS', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLN_TERM_TYP",rb))).append("', 'name':'PLN_TERM_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_CD",rb))).append("', 'name':'PLANT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb))).append("', 'name':'MRP_ODR_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SALES_PLAN_CD",rb))).append("', 'name':'SALES_PLAN_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLN_CD",rb))).append("', 'name':'PLN_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
KP0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ADD_TO_OD_FLG",rb))).append("', 'name':'ADD_TO_OD_FLG_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0030010view1_sortable).append("}").append(",");
%>
<%
 int aKP0030010StructLength = aKP0030010Control.getListsize();
 final KP0030010Struct structBackup = aKP0030010Struct;
 aKP0030010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKP0030010StructLength; ++loopCount) {
  if((aKP0030010Struct = (KP0030010Struct) aKP0030010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKP0030010Struct", aKP0030010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KP0030010view1_DB.append("[");
 KP0030010view1_DB.append(loopCount);
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-CUST_CD-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-CUST_CD\" data-name=\"CUST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getCUST_CD())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-CUST_ANAME-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-CUST_ANAME\" data-name=\"CUST_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getCUST_ANAME())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-DLV_LOC_CD-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-DLV_LOC_CD\" data-name=\"DLV_LOC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getDLV_LOC_CD())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-DLV_LOC_NAME-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-DLV_LOC_NAME\" data-name=\"DLV_LOC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getDLV_LOC_NAME())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-CUST_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-CUST_ITEM_CD\" data-name=\"CUST_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getCUST_ITEM_CD())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-CUST_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-CUST_ITEM_NAME\" data-name=\"CUST_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getCUST_ITEM_NAME())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-PLN_STR_DATE-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-PLN_STR_DATE\" data-name=\"PLN_STR_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getPLN_STR_DATE())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-PLN_END_DATE-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-PLN_END_DATE\" data-name=\"PLN_END_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getPLN_END_DATE())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-PLN_QTY-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-PLN_QTY\" data-name=\"PLN_QTY\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aKP0030010Struct.getPLN_QTY())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-PLN_QTY_REMAIN-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-PLN_QTY_REMAIN\" data-name=\"PLN_QTY_REMAIN\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aKP0030010Struct.getPLN_QTY_REMAIN())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-STOCK_UNIT\" data-name=\"STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getSTOCK_UNIT())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-TERM_DAYS-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-TERM_DAYS\" data-name=\"TERM_DAYS\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aKP0030010Struct.getTERM_DAYS())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-PLN_TERM_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-PLN_TERM_TYP_DN\" data-name=\"PLN_TERM_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getPLN_TERM_TYP_DN())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-PLANT_CD\" data-name=\"PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getPLANT_CD())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getITEM_CD())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getITEM_NAME())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-MRP_ODR_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-MRP_ODR_TYP_DN\" data-name=\"MRP_ODR_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getMRP_ODR_TYP_DN())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-SALES_PLAN_CD-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-SALES_PLAN_CD\" data-name=\"SALES_PLAN_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getSALES_PLAN_CD())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-PLN_CD-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-PLN_CD\" data-name=\"PLN_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getPLN_CD())).append("</span>'");
 KP0030010view1_DB.append(",").append("'<span id=\"expj-KP0030010-KP0030010view1-ADD_TO_OD_FLG_DN-").append(loopCount).append("\" class=\"expj-label expj-KP0030010-KP0030010view1-ADD_TO_OD_FLG_DN\" data-name=\"ADD_TO_OD_FLG_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0030010Struct.getADD_TO_OD_FLG_DN())).append("</span>'");
 KP0030010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKP0030010StructLength) {
   KP0030010view1_DB.append(",");
  }
 }
 aKP0030010Struct = structBackup;
 viewIdList.add(KP0030010view1_Id);
 viewSelectList.add(KP0030010view1_select);
 viewResizeList.add(KP0030010view1_resize);
 viewScrollList.add(KP0030010view1_scroll);
 viewHeaderDataList.add(KP0030010view1_HB);
 viewBodyDataList.add(KP0030010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:105px;"><script class="expj-script-KP0030010-KP0030010button2">
expj.KP0030010.KP0030010button2 = {};
expj.KP0030010.KP0030010button2.executeAllOnDecision = function () {
  console.log('execute KP0030010button2.onDecision');
};
expj.KP0030010.KP0030010button2.executeOnLoad = function () {
  expj.KP0030010.KP0030010button2.executePScriptOnLoad();
};

expj.KP0030010.KP0030010button2.executePScriptOnLoad = function () {
  console.log('execute KP0030010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KP0030010-KP0030010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KP0030010-KP0030010button2-GoSub">
expj.KP0030010.KP0030010button2.GoSub = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_KP0030010view1/+@KP0020010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.KP0030010.KP0030010button2.GoSub.onClick0 = function () {
  console.log('GoSub script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0030010', 'KP0030010button2', '_KP0030010view1/+', 'KP0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('KP0020010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'KP0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'KP0030010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KP0030010.KP0030010button2.GoSub.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0030010.KP0030010button2.GoSub['onClick' + i])) {
        expj.KP0030010.KP0030010button2.GoSub['onClick' + i]();
      }
    }
  }
};
expj.KP0030010.KP0030010button2.GoSub.executeAllOnDecision = function () {
};
expj.KP0030010.KP0030010button2.GoSub.executeOnLoad = function () {
  $('#expj-KP0030010-KP0030010button2-GoSub').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0030010', 'KP0030010button2', 'GoSub', this, 'Button');
    }
  });
  expj.KP0030010.KP0030010button2.GoSub.executePScriptOnLoad();
};

expj.KP0030010.KP0030010button2.GoSub.executePScriptOnLoad = function () {
  console.log('execute KP0030010button2/GoSub.onLoad');
  var targetComponent = document.getElementById('expj-KP0030010-KP0030010button2-GoSub');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:105px;float:none;height:30px;"><button type="button" id="expj-KP0030010-KP0030010button2-GoSub" name="GoSub" class="KP0030010-focus-move" style="width:px;"><%=CoreTools.getRBString("Expj.BtnModifyPln",rb)%></button><!-- 所要計画修正ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 643px);"></div><!--/td-->
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
<span class="version">KP0030010 Revision: 1.9  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KP0030010-KP0030010button0">
expj.KP0030010.KP0030010button0 = {};
expj.KP0030010.KP0030010button0.executeAllOnDecision = function () {
  console.log('execute KP0030010button0.onDecision');
};
expj.KP0030010.KP0030010button0.executeOnLoad = function () {
  expj.KP0030010.KP0030010button0.executePScriptOnLoad();
};

expj.KP0030010.KP0030010button0.executePScriptOnLoad = function () {
  console.log('execute KP0030010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KP0030010-KP0030010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KP0030010-KP0030010button0-Clear">
expj.KP0030010.KP0030010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KP0030010Servlet,,$ZZ07008"
expj.KP0030010.KP0030010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0030010', 'KP0030010button0', '', 'KP0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KP0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KP0030010', response);
expj.common.updateBusinessScreenTab('KP0030010', contents);
};
expj.common.pscript.callConfirm('KP0030010', 'KP0030010button0', 'ZZ07008', okEvent);
};
expj.KP0030010.KP0030010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0030010.KP0030010button0.Clear['onClick' + i])) {
        expj.KP0030010.KP0030010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KP0030010.KP0030010button0.Clear.executeAllOnDecision = function () {
};
expj.KP0030010.KP0030010button0.Clear.executeOnLoad = function () {
  $('#expj-KP0030010-KP0030010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0030010', 'KP0030010button0', 'Clear', this, 'Button');
    }
  });
  expj.KP0030010.KP0030010button0.Clear.executePScriptOnLoad();
};

expj.KP0030010.KP0030010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KP0030010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KP0030010-KP0030010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0030010-KP0030010button0-Clear" name="Clear" class="KP0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KP0030010-KP0030010button0-Close">
expj.KP0030010.KP0030010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KP0030010.KP0030010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KP0030010');
};
expj.KP0030010.KP0030010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0030010.KP0030010button0.Close['onClick' + i])) {
        expj.KP0030010.KP0030010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KP0030010.KP0030010button0.Close.executeAllOnDecision = function () {
};
expj.KP0030010.KP0030010button0.Close.executeOnLoad = function () {
  $('#expj-KP0030010-KP0030010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0030010', 'KP0030010button0', 'Close', this, 'Button');
    }
  });
  expj.KP0030010.KP0030010button0.Close.executePScriptOnLoad();
};

expj.KP0030010.KP0030010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KP0030010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KP0030010-KP0030010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0030010-KP0030010button0-Close" name="Close" class="KP0030010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KP0030010 (END)-->
<%
MessageStruct msgStruct = aKP0030010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KP0030010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KP0030010)) {
  expj.common.treeInstanceMap.KP0030010 = {};
}
expj.common.treeInstanceMap.KP0030010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KP0030010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KP0030010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KP0030010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KP0030010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KP0030010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KP0030010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KP0030010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KP0030010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KP0030010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KP0030010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0030010)) {
  expj.common.detailDialogMap.KP0030010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0030010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KP0030010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0030010.<%=detailId %>)) {
  expj.common.detailDialogMap.KP0030010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0030010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KP0030010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0030010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KP0030010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KP0030010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KP0030010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KP0030010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KP0030010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KP0030010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KP0030010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KP0030010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KP0030010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KP0030010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KP0030010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KP0030010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KP0030010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KP0030010)) {
  expj.common.viewInstanceMap.KP0030010 = {};
}
expj.common.viewInstanceMap.KP0030010.<%=viewId %> = {};
expj.common.viewInstanceMap.KP0030010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KP0030010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KP0030010.<%=viewId %>.init = function () {
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
    expj.KP0030010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KP0030010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KP0030010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KP0030010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KP0030010_init">
/**
 * KP0030010用のロード完了時初期化関数
 */
expj.KP0030010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KP0030010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KP0030010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KP0030010');
  expj.common.calendarInstanceMap.KP0030010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KP0030010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KP0030010.<%=detailId %>.init();
  expj.common.detailDialogMap.KP0030010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KP0030010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KP0030010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KP0030010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KP0030010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KP0030010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KP0030010-<%=detailId %>');
<%
 }
%>
  try{expj.KP0030010.KP0030010form1.IN_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010form1.PeekerIN_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010form1.IN_CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010form1.IN_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010form1.PeekerIN_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010form1.IN_DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010form1.IN_STR_DATE.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010form1.CalendarIN_PLN_STR_DATE.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010form1.IN_END_DATE.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010form1.CalendarIN_PLN_END_DATE.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010button2.GoSub.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010form1.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010button1.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010view1.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010button2.executeOnLoad();}catch(e){};
  try{expj.KP0030010.KP0030010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KP0030010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KP0030010', 'KP0030010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KP0030010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KP0030010-focus-move');
  // 初期フォーカス当てる処理
  $('.KP0030010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KP0030010', '<%=request.getContextPath() %>');
};

/**
 * KP0030010の全体onDecision処理
 */
expj.KP0030010.executeAllOnDecision = function () {
  expj.KP0030010.KP0030010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KP0030010_console">
expj.KP0030010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>