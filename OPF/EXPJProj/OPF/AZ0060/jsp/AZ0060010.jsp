<%-- ***
This file is generated
 GeneratedDate  : Wed Feb 15 13:55:43 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0060\AZ0060010.html
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

マスタ系承認
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0060/jsp/AZ0060010.jsp,v $
$Author: geng-jia $	
$Revision: 1.19 $　$Date: 2017/02/22 01:42:11 $
********************************************************* --%>
<html>
<head>
<title>マスタ系承認</title>
<%@include file="common/expj_v5.jsp" %>
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
  <div id="expj-business-screen-AZ0060010" data-screen="AZ0060010" data-newdata="<%=aAZ0060010Control.isNewData() %>">
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
              <script class="expj-script-AZ0060010-AZ0060010form1">
expj.AZ0060010.AZ0060010form1 = {};
expj.AZ0060010.AZ0060010form1.executeAllOnDecision = function () {
  console.log('execute AZ0060010form1.onDecision');
};
expj.AZ0060010.AZ0060010form1.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010form1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010form1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010form1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AZ0060010-AZ0060010form1" action="AZ0060010Servlet" name="AZ0060010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<input type="hidden" id="expj-AZ0060010-AZ0060010form1-h_APPR_POWER_TYP" name="h_APPR_POWER_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAZ0060010Struct.geth_APPR_POWER_TYP()) %>">
<script class="expj-script-AZ0060010-AZ0060010form1-h_APPR_POWER_TYP">
expj.AZ0060010.AZ0060010form1.h_APPR_POWER_TYP = {};
expj.AZ0060010.AZ0060010form1.h_APPR_POWER_TYP.executeAllOnDecision = function () {
  console.log('execute AZ0060010form1/h_APPR_POWER_TYP.onDecision');
  expj.AZ0060010.AZ0060010form1.executeAllOnDecision();
  expj.AZ0060010.executeAllOnDecision();
};
expj.AZ0060010.AZ0060010form1.h_APPR_POWER_TYP.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010form1-h_APPR_POWER_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0060010', 'AZ0060010form1', 'h_APPR_POWER_TYP', this);
  });
  expj.AZ0060010.AZ0060010form1.h_APPR_POWER_TYP.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010form1.h_APPR_POWER_TYP.executePScriptOnLoad = function () {
  console.log('execute AZ0060010form1/h_APPR_POWER_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010form1-h_APPR_POWER_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<script class="expj-script-AZ0060010-AZ0060010form1-r1_FILTER1">
expj.AZ0060010.AZ0060010form1.r1_FILTER1 = {};
expj.AZ0060010.AZ0060010form1.r1_FILTER1.executeAllOnDecision = function () {
  console.log('execute AZ0060010form1/r1_FILTER1.onDecision');
  expj.AZ0060010.AZ0060010form1.executeAllOnDecision();
  expj.AZ0060010.executeAllOnDecision();
};
expj.AZ0060010.AZ0060010form1.r1_FILTER1.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010form1-r1_FILTER1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0060010', 'AZ0060010form1', 'r1_FILTER1', this, 'RadioButton');
    }
  });
  expj.AZ0060010.AZ0060010form1.r1_FILTER1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010form1.r1_FILTER1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010form1/r1_FILTER1.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010form1-r1_FILTER1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="FILTER1" data-name="r1_FILTER1" value="true" <%= ("true".equals(TypeConverter.convert(aAZ0060010Struct.getr1_FILTER1())) || "".equals(TypeConverter.convert(aAZ0060010Struct.getr1_FILTER1())))?"checked=\"checked\"": "" %> class="" id="expj-AZ0060010-AZ0060010form1-r1_FILTER1" ><label for="expj-AZ0060010-AZ0060010form1-r1_FILTER1"><%=CoreTools.getRBString("Expj.Cmt5096",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AZ0060010-AZ0060010form1-r2_FILTER1">
expj.AZ0060010.AZ0060010form1.r2_FILTER1 = {};
expj.AZ0060010.AZ0060010form1.r2_FILTER1.executeAllOnDecision = function () {
  console.log('execute AZ0060010form1/r2_FILTER1.onDecision');
  expj.AZ0060010.AZ0060010form1.executeAllOnDecision();
  expj.AZ0060010.executeAllOnDecision();
};
expj.AZ0060010.AZ0060010form1.r2_FILTER1.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010form1-r2_FILTER1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0060010', 'AZ0060010form1', 'r2_FILTER1', this, 'RadioButton');
    }
  });
  expj.AZ0060010.AZ0060010form1.r2_FILTER1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010form1.r2_FILTER1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010form1/r2_FILTER1.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010form1-r2_FILTER1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="FILTER1" data-name="r2_FILTER1" value="true" <%= ("true".equals(TypeConverter.convert(aAZ0060010Struct.getr2_FILTER1())))?"checked=\"checked\"":"" %> class="" id="expj-AZ0060010-AZ0060010form1-r2_FILTER1" ><label for="expj-AZ0060010-AZ0060010form1-r2_FILTER1"><%=CoreTools.getRBString("Expj.Cmt3168",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AZ0060010-AZ0060010form1-r3_FILTER1">
expj.AZ0060010.AZ0060010form1.r3_FILTER1 = {};
expj.AZ0060010.AZ0060010form1.r3_FILTER1.executeAllOnDecision = function () {
  console.log('execute AZ0060010form1/r3_FILTER1.onDecision');
  expj.AZ0060010.AZ0060010form1.executeAllOnDecision();
  expj.AZ0060010.executeAllOnDecision();
};
expj.AZ0060010.AZ0060010form1.r3_FILTER1.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010form1-r3_FILTER1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0060010', 'AZ0060010form1', 'r3_FILTER1', this, 'RadioButton');
    }
  });
  expj.AZ0060010.AZ0060010form1.r3_FILTER1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010form1.r3_FILTER1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010form1/r3_FILTER1.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010form1-r3_FILTER1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="radio" name="FILTER1" data-name="r3_FILTER1" value="true" <%= ("true".equals(TypeConverter.convert(aAZ0060010Struct.getr3_FILTER1())))?"checked=\"checked\"":"" %> class="" id="expj-AZ0060010-AZ0060010form1-r3_FILTER1" ><label for="expj-AZ0060010-AZ0060010form1-r3_FILTER1"><%=CoreTools.getRBString("Expj.Cmt3169",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AZ0060010-AZ0060010form1-h_SELECT_TYP" name="h_SELECT_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAZ0060010Struct.geth_SELECT_TYP()) %>">
<script class="expj-script-AZ0060010-AZ0060010form1-h_SELECT_TYP">
expj.AZ0060010.AZ0060010form1.h_SELECT_TYP = {};
expj.AZ0060010.AZ0060010form1.h_SELECT_TYP.executeAllOnDecision = function () {
  console.log('execute AZ0060010form1/h_SELECT_TYP.onDecision');
  expj.AZ0060010.AZ0060010form1.executeAllOnDecision();
  expj.AZ0060010.executeAllOnDecision();
};
expj.AZ0060010.AZ0060010form1.h_SELECT_TYP.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010form1-h_SELECT_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0060010', 'AZ0060010form1', 'h_SELECT_TYP', this);
  });
  expj.AZ0060010.AZ0060010form1.h_SELECT_TYP.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010form1.h_SELECT_TYP.executePScriptOnLoad = function () {
  console.log('execute AZ0060010form1/h_SELECT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010form1-h_SELECT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AZ0060010-AZ0060010form1-h_HISTORY_FOR_APPR" name="h_HISTORY_FOR_APPR" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAZ0060010Struct.geth_HISTORY_FOR_APPR()) %>">
<script class="expj-script-AZ0060010-AZ0060010form1-h_HISTORY_FOR_APPR">
expj.AZ0060010.AZ0060010form1.h_HISTORY_FOR_APPR = {};
expj.AZ0060010.AZ0060010form1.h_HISTORY_FOR_APPR.executeAllOnDecision = function () {
  console.log('execute AZ0060010form1/h_HISTORY_FOR_APPR.onDecision');
  expj.AZ0060010.AZ0060010form1.executeAllOnDecision();
  expj.AZ0060010.executeAllOnDecision();
};
expj.AZ0060010.AZ0060010form1.h_HISTORY_FOR_APPR.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010form1-h_HISTORY_FOR_APPR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0060010', 'AZ0060010form1', 'h_HISTORY_FOR_APPR', this);
  });
  expj.AZ0060010.AZ0060010form1.h_HISTORY_FOR_APPR.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010form1.h_HISTORY_FOR_APPR.executePScriptOnLoad = function () {
  console.log('execute AZ0060010form1/h_HISTORY_FOR_APPR.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010form1-h_HISTORY_FOR_APPR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AZ0060010-AZ0060010form1-h_REQUEST_APPR_SAME" name="h_REQUEST_APPR_SAME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAZ0060010Struct.geth_REQUEST_APPR_SAME()) %>">
<script class="expj-script-AZ0060010-AZ0060010form1-h_REQUEST_APPR_SAME">
expj.AZ0060010.AZ0060010form1.h_REQUEST_APPR_SAME = {};
expj.AZ0060010.AZ0060010form1.h_REQUEST_APPR_SAME.executeAllOnDecision = function () {
  console.log('execute AZ0060010form1/h_REQUEST_APPR_SAME.onDecision');
  expj.AZ0060010.AZ0060010form1.executeAllOnDecision();
  expj.AZ0060010.executeAllOnDecision();
};
expj.AZ0060010.AZ0060010form1.h_REQUEST_APPR_SAME.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010form1-h_REQUEST_APPR_SAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0060010', 'AZ0060010form1', 'h_REQUEST_APPR_SAME', this);
  });
  expj.AZ0060010.AZ0060010form1.h_REQUEST_APPR_SAME.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010form1.h_REQUEST_APPR_SAME.executePScriptOnLoad = function () {
  console.log('execute AZ0060010form1/h_REQUEST_APPR_SAME.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010form1-h_REQUEST_APPR_SAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AZ0060010-AZ0060010button1">
expj.AZ0060010.AZ0060010button1 = {};
expj.AZ0060010.AZ0060010button1.executeAllOnDecision = function () {
  console.log('execute AZ0060010button1.onDecision');
};
expj.AZ0060010.AZ0060010button1.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010button1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010button1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AZ0060010-AZ0060010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AZ0060010-AZ0060010button1-Select">
expj.AZ0060010.AZ0060010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AZ0060010form1/*@AZ0060010Servlet,,"
expj.AZ0060010.AZ0060010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AZ0060010', 'AZ0060010button1', '_AZ0060010form1/*', 'AZ0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AZ0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AZ0060010', response);
expj.common.updateBusinessScreenTab('AZ0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AZ0060010.AZ0060010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0060010.AZ0060010button1.Select['onClick' + i])) {
        expj.AZ0060010.AZ0060010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AZ0060010.AZ0060010button1.Select.executeAllOnDecision = function () {
};
expj.AZ0060010.AZ0060010button1.Select.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0060010', 'AZ0060010button1', 'Select', this, 'Button');
    }
  });
  expj.AZ0060010.AZ0060010button1.Select.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AZ0060010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AZ0060010-AZ0060010button1-Select" name="Select" class="AZ0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<%
			aAZ0060010Control.setList(aAZ0060010Control.getResultList());
		  %><div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに中段検索条件用のDataGridを配置する。↓ --><script class="expj-script-AZ0060010-AZ0060010view1">
expj.AZ0060010.AZ0060010view1 = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ClickShow=ACT,_AZ0060010form1/*,_AZ0060010view1/+@AZ0060010Servlet"
expj.AZ0060010.AZ0060010view1.onClick0 = function () {
  console.log('AZ0060010view1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AZ0060010', 'AZ0060010view1', 'ClickShow=ACT,_AZ0060010form1/*,_AZ0060010view1/+', 'AZ0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AZ0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AZ0060010', response);
expj.common.updateBusinessScreenTab('AZ0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AZ0060010.AZ0060010view1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0060010.AZ0060010view1['onClick' + i])) {
        expj.AZ0060010.AZ0060010view1['onClick' + i]();
      }
    }
  }
};
expj.AZ0060010.AZ0060010view1.executeAllOnDecision = function () {
  console.log('execute AZ0060010view1.onDecision');
};
expj.AZ0060010.AZ0060010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AZ0060010view1", "expj.AZ0060010.AZ0060010view1.executeAllOnClick");
%>
  expj.AZ0060010.AZ0060010view1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010view1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AZ0060010-AZ0060010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:163px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AZ0060010view1_Id = "AZ0060010view1";
 String AZ0060010view1_select = "single";
 String AZ0060010view1_sortable = "true";
 String AZ0060010view1_resize = "true";
 String AZ0060010view1_scroll = "true";
 StringBuffer AZ0060010view1_HB = new StringBuffer();
 StringBuffer AZ0060010view1_DB = new StringBuffer();
%>
<%
 AZ0060010view1_select = "single";
 AZ0060010view1_sortable = "true";
 AZ0060010view1_resize = "true";
 AZ0060010view1_scroll = "true";
%>
<%
 AZ0060010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AZ0060010view1_sortable).append("}").append(",");
%>
     
<%
AZ0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_SCREEN_URL', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AZ0060010view1_sortable).append("}").append(",");
AZ0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5078",rb))).append("', 'name':'l_SCREEN_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AZ0060010view1_sortable).append("}").append(",");
AZ0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5079",rb))).append("', 'name':'l_REQUEST_COUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AZ0060010view1_sortable).append("}").append(",");
AZ0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5080",rb))).append("', 'name':'l_APPRING_COUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AZ0060010view1_sortable).append("}").append(",");
AZ0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5081",rb))).append("', 'name':'l_RESERVE_COUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AZ0060010view1_sortable).append("}").append(",");
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
 AZ0060010view1_DB.append("[");
 AZ0060010view1_DB.append(loopCount);
 AZ0060010view1_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view1-h_SCREEN_URL-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view1-h_SCREEN_URL\" data-name=\"h_SCREEN_URL\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.geth_SCREEN_URL())).append("</span>'");
 AZ0060010view1_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view1-l_SCREEN_NAME-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view1-l_SCREEN_NAME\" data-name=\"l_SCREEN_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_SCREEN_NAME())).append("</span>'");
 AZ0060010view1_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view1-l_REQUEST_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view1-l_REQUEST_COUNT\" data-name=\"l_REQUEST_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_REQUEST_COUNT())).append("</span>'");
 AZ0060010view1_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view1-l_APPRING_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view1-l_APPRING_COUNT\" data-name=\"l_APPRING_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_APPRING_COUNT())).append("</span>'");
 AZ0060010view1_DB.append(",").append("'<span id=\"expj-AZ0060010-AZ0060010view1-l_RESERVE_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AZ0060010-AZ0060010view1-l_RESERVE_COUNT\" data-name=\"l_RESERVE_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAZ0060010Struct.getl_RESERVE_COUNT())).append("</span>'");
 AZ0060010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAZ0060010StructLength) {
   AZ0060010view1_DB.append(",");
  }
 }
 aAZ0060010Struct = structBackup;
 viewIdList.add(AZ0060010view1_Id);
 viewSelectList.add(AZ0060010view1_select);
 viewResizeList.add(AZ0060010view1_resize);
 viewScrollList.add(AZ0060010view1_scroll);
 viewHeaderDataList.add(AZ0060010view1_HB);
 viewBodyDataList.add(AZ0060010view1_DB);
%>
<%
}
%>
<!-- ここに中段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame01 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02 button-area" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame03 button-area-right" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに上段検索条件用のDataGridを配置する。↓ --><script class="expj-script-AZ0060010-AZ0060010form2">
expj.AZ0060010.AZ0060010form2 = {};
expj.AZ0060010.AZ0060010form2.executeAllOnDecision = function () {
  console.log('execute AZ0060010form2.onDecision');
};
expj.AZ0060010.AZ0060010form2.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010form2.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010form2.executePScriptOnLoad = function () {
  console.log('execute AZ0060010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AZ0060010-AZ0060010form2" action="AZ0060010Servlet" name="AZ0060010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<script class="expj-script-AZ0060010-AZ0060010form2-RESERVE_CAUSE">
expj.AZ0060010.AZ0060010form2.RESERVE_CAUSE = {};
expj.AZ0060010.AZ0060010form2.RESERVE_CAUSE.executeAllOnDecision = function () {
  console.log('execute AZ0060010form2/RESERVE_CAUSE.onDecision');
  expj.AZ0060010.AZ0060010form2.executeAllOnDecision();
  expj.AZ0060010.executeAllOnDecision();
};
expj.AZ0060010.AZ0060010form2.RESERVE_CAUSE.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010form2-RESERVE_CAUSE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0060010', 'AZ0060010form2', 'RESERVE_CAUSE', this);
  });
  expj.AZ0060010.AZ0060010form2.RESERVE_CAUSE.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010form2.RESERVE_CAUSE.executePScriptOnLoad = function () {
  console.log('execute AZ0060010form2/RESERVE_CAUSE.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010form2-RESERVE_CAUSE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AZ0060010-AZ0060010form2-RESERVE_CAUSE" name="RESERVE_CAUSE" class="AZ0060010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAZ0060010Struct.getRESERVE_CAUSE()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
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
<%
			aAZ0060010Control.setList(aAZ0060010Control.getDetailList());		  
		  %><div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AZ0060010-AZ0060010view2">
expj.AZ0060010.AZ0060010view2 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AZ0060010.AZ0060010view2.onLoad0 = function () {
  console.log('AZ0060010view2 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
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
// script39="onDecision;1;CHK;?AZ0060010view2/*[eq]ERROR@*27,*28"
expj.AZ0060010.AZ0060010view2.onDecision1 = function () {
  console.log('AZ0060010view2 script39');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AZ0060010', 'AZ0060010view2', '?AZ0060010view2/*'), '[eq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
} else {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
}
};
// script40="child;27;MASK;_AZ0060010button1/Select,_AZ0060010button0/Clear"
expj.AZ0060010.AZ0060010view2.child27 = function () {
  console.log('AZ0060010view2 script40');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button1/Select');
expj.common.pscript.setMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button0/Clear');
};
// script41="child;28;UNMASK;_AZ0060010button1/Select"
expj.AZ0060010.AZ0060010view2.child28 = function () {
  console.log('AZ0060010view2 script41');
expj.common.pscript.setUnMaskToReferenceComponent('AZ0060010', 'AZ0060010view2', '_AZ0060010button1/Select');
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
  for (var i = 0; i <= 1; i++) {
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
<div id="expj-AZ0060010-AZ0060010view2" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aAZ0060010Control.getReadStatusString()) %>"></div>
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
AZ0060010view2_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EXEC_TYP",rb))).append("', 'name':'l_PROC_TYP_VALUE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AZ0060010view2_sortable).append("}").append(",");
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
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:735px;"><script class="expj-script-AZ0060010-AZ0060010button2">
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
</div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 819px);"></div><!--/td-->
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
<span class="version">AZ0060010 Revision: 1.14  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AZ0060010-AZ0060010button0">
expj.AZ0060010.AZ0060010button0 = {};
expj.AZ0060010.AZ0060010button0.executeAllOnDecision = function () {
  console.log('execute AZ0060010button0.onDecision');
};
expj.AZ0060010.AZ0060010button0.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010button0.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010button0.executePScriptOnLoad = function () {
  console.log('execute AZ0060010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AZ0060010-AZ0060010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AZ0060010-AZ0060010button0-Clear">
expj.AZ0060010.AZ0060010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AZ0060010Servlet,,$ZZ07008"
expj.AZ0060010.AZ0060010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AZ0060010', 'AZ0060010button0', '', 'AZ0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AZ0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AZ0060010', response);
expj.common.updateBusinessScreenTab('AZ0060010', contents);
};
expj.common.pscript.callConfirm('AZ0060010', 'AZ0060010button0', 'ZZ07008', okEvent);
};
expj.AZ0060010.AZ0060010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0060010.AZ0060010button0.Clear['onClick' + i])) {
        expj.AZ0060010.AZ0060010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AZ0060010.AZ0060010button0.Clear.executeAllOnDecision = function () {
};
expj.AZ0060010.AZ0060010button0.Clear.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0060010', 'AZ0060010button0', 'Clear', this, 'Button');
    }
  });
  expj.AZ0060010.AZ0060010button0.Clear.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AZ0060010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AZ0060010-AZ0060010button0-Clear" name="Clear" class="AZ0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AZ0060010-AZ0060010button0-Close">
expj.AZ0060010.AZ0060010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AZ0060010.AZ0060010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AZ0060010');
};
expj.AZ0060010.AZ0060010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0060010.AZ0060010button0.Close['onClick' + i])) {
        expj.AZ0060010.AZ0060010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AZ0060010.AZ0060010button0.Close.executeAllOnDecision = function () {
};
expj.AZ0060010.AZ0060010button0.Close.executeOnLoad = function () {
  $('#expj-AZ0060010-AZ0060010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0060010', 'AZ0060010button0', 'Close', this, 'Button');
    }
  });
  expj.AZ0060010.AZ0060010button0.Close.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AZ0060010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AZ0060010-AZ0060010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AZ0060010-AZ0060010button0-Close" name="Close" class="AZ0060010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AZ0060010 (END)-->
<script class="expj-script-AZ0060010-AZ0060010Detail1">
expj.AZ0060010.AZ0060010Detail1 = {};
expj.AZ0060010.AZ0060010Detail1.executeAllOnDecision = function () {
  console.log('execute AZ0060010Detail1.onDecision');
};
expj.AZ0060010.AZ0060010Detail1.executeOnLoad = function () {
  expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad();
};

expj.AZ0060010.AZ0060010Detail1.executePScriptOnLoad = function () {
  console.log('execute AZ0060010Detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAZ0060010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AZ0060010-AZ0060010Detail1" class="expj-datagird-detail" data-float="AZ0060010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AZ0060010Detail1";
 detailFloat = "AZ0060010float1";
 detailWidth = 410;
 detailHeight = 200 + 47;
 String AZ0060010Detail1_Id = "AZ0060010Detail1";
 String AZ0060010Detail1_select = "single";
 String AZ0060010Detail1_sortable = "true";
 String AZ0060010Detail1_resize = "true";
 String AZ0060010Detail1_scroll = "true";
 StringBuffer AZ0060010Detail1_HB = new StringBuffer();
 StringBuffer AZ0060010Detail1_DB = new StringBuffer();
%>
<%
 AZ0060010Detail1_sortable = "false";
 AZ0060010Detail1_select = "none";
%>
<% AZ0060010Detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AZ0060010Detail1_sortable).append("}").append(","); %>
<%  AZ0060010Detail1_HB.append("{'visible':true,'width':'130px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col2','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col3','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
AZ0060010Detail1_HB.append("{'visible':true,'width':'60px','title':'','name':'col4','class':'expj-detail-cell expj-align-','sortable':").append(AZ0060010Detail1_sortable).append("}").append(",");
 %>
 <!-- 利用者メンテナンス-->  <%
		if("AA0090030Servlet".equals(aAZ0060010Control.getScreen_url())){
	%>
 <% AZ0060010Detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.USER_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.USER_NAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.PLANT_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.ORG_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.PASSWORD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.Cmt3161",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.EMAIL",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.LOCALE",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	 	 }
	  %>
<!-- 製品単価メンテナンス-->  <%
	  if("KA0040010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.UNIT_COST",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 支給品単価メンテナンス -->  <%
	  if("AA0040030Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['18','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['19','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['20','").append(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['21','").append(CoreTools.getRBString("Expj.UNIT_COST",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['22','").append(CoreTools.getRBString("Expj.ONEROUS_FLG",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 外注単価メンテナンス、メイン画面-->  <%
	  if("AA0040020Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_SBCNT_UNIT_COST_H".equals(aAZ0060010Control.getTable_name())){
	  %>
 <% AZ0060010Detail1_DB.append("['23','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['24','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['25','").append(CoreTools.getRBString("Expj.PROC_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['26','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['27','").append(CoreTools.getRBString("Expj.VEND_ITEM_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 外注単価メンテナンス、サッブ画面-->  <%
	  if("AA0040020Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_SBCNT_UNIT_COST".equals(aAZ0060010Control.getTable_name())){
	  %>
 <% AZ0060010Detail1_DB.append("['28','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['29','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['30','").append(CoreTools.getRBString("Expj.PROC_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['31','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['32','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['33','").append(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['34','").append(CoreTools.getRBString("Expj.UNIT_COST",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['35','").append(CoreTools.getRBString("Expj.PROCESSING_COST",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['36','").append(CoreTools.getRBString("Expj.MATERIAL_COST",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['37','").append(CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 為替レート情報メンテナンス-->  <%
	  if("AA0120010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['38','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['39','").append("通貨コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['40','").append("為替種別").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['41','").append("為替予約コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['42','").append("為替開始日付").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['43','").append("為替レート").append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 購入単価メンテナンス メイン画面-->  <%
	  if("AA0040010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_PUCH_UNIT_COST_H".equals(aAZ0060010Control.getTable_name())){
	  %>
 <% AZ0060010Detail1_DB.append("['44','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['45','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['46','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['47','").append(CoreTools.getRBString("Expj.PUCH_PRIORITY_REF_NO_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['48','").append(CoreTools.getRBString("Expj.VEND_ITEM_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 購入単価メンテナンス サッブ画面表示する項目-->  <%
	  if("AA0040010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_PUCH_UNIT_COST".equals(aAZ0060010Control.getTable_name())){
	  %>
 <% AZ0060010Detail1_DB.append("['49','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['50','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['51','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['52','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['53','").append(CoreTools.getRBString("Expj.PUCH_SIZE",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['54','").append(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['55','").append(CoreTools.getRBString("Expj.UNIT_COST",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['56','").append(CoreTools.getRBString("Expj.PROCESSING_COST",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['57','").append(CoreTools.getRBString("Expj.MATERIAL_COST",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['58','").append(CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 取引先メンテナンス-->  <%
	  if("AA0070010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['59','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['60','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['61','").append(CoreTools.getRBString("Expj.VEND_NAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['62','").append(CoreTools.getRBString("Expj.VEND_ANAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['63','").append(CoreTools.getRBString("Expj.ZIP_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['64','").append(CoreTools.getRBString("Expj.ADDRESS_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['65','").append(CoreTools.getRBString("Expj.ADDRESS_2",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['66','").append(CoreTools.getRBString("Expj.ADDRESS_K_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['67','").append(CoreTools.getRBString("Expj.ADDRESS_K_2",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['68','").append(CoreTools.getRBString("Expj.TEL",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['69','").append(CoreTools.getRBString("Expj.FAX",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['70','").append(CoreTools.getRBString("Expj.EMAIL",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['71','").append(CoreTools.getRBString("Expj.VEND_ORG",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['72','").append(CoreTools.getRBString("Expj.VEND_PERSON",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['73','").append(CoreTools.getRBString("Expj.OWN_ORG_CD_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['74','").append(CoreTools.getRBString("Expj.OWN_ORG_NAME_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['75','").append(CoreTools.getRBString("Expj.OWN_PERSON_CD_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['76','").append(CoreTools.getRBString("Expj.ROUND_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['77','").append(CoreTools.getRBString("Expj.TAX_CD_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['78','").append(CoreTools.getRBString("Expj.TAX_APPLY_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['79','").append(CoreTools.getRBString("Expj.TAX_CALC_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['80','").append(CoreTools.getRBString("Expj.INSPC_ACPT_APP_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['81','").append(CoreTools.getRBString("Expj.VEND_REM",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['82','").append(CoreTools.getRBString("Expj.CUR_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['83','").append(CoreTools.getRBString("Expj.EXCH_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['84','").append(CoreTools.getRBString("Expj.IMPORT_TRN_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 得意先メンテナンス-->  <%
	  if("KA0100010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['85','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['86','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['87','").append(CoreTools.getRBString("Expj.CUST_NAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['88','").append(CoreTools.getRBString("Expj.CUST_ANAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['89','").append(CoreTools.getRBString("Expj.CUST_KNAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['90','").append(CoreTools.getRBString("Expj.OWN_ORG_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['91','").append(CoreTools.getRBString("Expj.OWN_PERSON_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['92','").append(CoreTools.getRBString("Expj.CUR_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['93','").append(CoreTools.getRBString("Expj.INSPC_ACPT_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['94','").append(CoreTools.getRBString("Expj.EXCH_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['95','").append(CoreTools.getRBString("Expj.TAX_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['96','").append(CoreTools.getRBString("Expj.TAX_CALC_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['97','").append(CoreTools.getRBString("Expj.TAX_APPLY_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['98','").append(CoreTools.getRBString("Expj.DETAIL_ROUND_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['99','").append(CoreTools.getRBString("Expj.EDI_CUST_VEND_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['100','").append(CoreTools.getRBString("Expj.PARTIAL_SHIP_INST_FLG",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 得意先納品場所メンテナンス-->  <%
	  if("KA0100020Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['101','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['102','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['103','").append(CoreTools.getRBString("Expj.DLV_LOC_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['104','").append(CoreTools.getRBString("Expj.DLV_LOC_NAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['105','").append(CoreTools.getRBString("Expj.DLV_LOC_KNAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['106','").append(CoreTools.getRBString("Expj.DLV_LOC_ENAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['107','").append(CoreTools.getRBString("Expj.ZIP_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['108','").append(CoreTools.getRBString("Expj.ADDRESS_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['109','").append(CoreTools.getRBString("Expj.ADDRESS_2",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['110','").append(CoreTools.getRBString("Expj.ADDRESS_K_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['111','").append(CoreTools.getRBString("Expj.ADDRESS_K_2",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['112','").append(CoreTools.getRBString("Expj.TEL",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['113','").append(CoreTools.getRBString("Expj.FAX",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['114','").append(CoreTools.getRBString("Expj.TRANSPORT_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['115','").append(CoreTools.getRBString("Expj.DEPO_WH_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['116','").append(CoreTools.getRBString("Expj.SHIP_WH_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['117','").append(CoreTools.getRBString("Expj.TRANSPORT_LT",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 請求条件メンテナンス　＆請求条件データ一括登録  メイン画面表示する項目-->  <%
	  if(("BA0020010Servlet".equals(aAZ0060010Control.getScreen_url()) || "BA0040010Servlet".equals(aAZ0060010Control.getScreen_url())) && "M_CUST_STL_CTRL".equals(aAZ0060010Control.getTable_name())){
	  %>
 <% AZ0060010Detail1_DB.append("['118','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['119','").append(CoreTools.getRBString("Expj.BILL_ADDRESSEE_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['120','").append("決済条件コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['121','").append("請求部門コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['122','").append("EDI取引区分(請求)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['123','").append("EDI取引区分(入金)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['124','").append("請求残高管理フラグ").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['125','").append("売掛金残高管理フラグ").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['126','").append("回収条件基準金額").append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['127','").append("入金相殺区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 請求条件メンテナンス　＆請求条件データ一括登録  サッブ画面表示する項目-->  <%
	  if(("BA0020010Servlet".equals(aAZ0060010Control.getScreen_url()) || "BA0040010Servlet".equals(aAZ0060010Control.getScreen_url())) && "M_CLAIM_CUST_CTRL".equals(aAZ0060010Control.getTable_name())){
	  %>
 <% AZ0060010Detail1_DB.append("['128','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['129','").append(CoreTools.getRBString("Expj.BILL_ADDRESSEE_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['130','").append("決済条件コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['131','").append("得意先コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 得意先メンテナンス メイン画面表示する項目-->  <%
	  if("BA0050010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_CUST".equals(aAZ0060010Control.getTable_name())){
	  %>
 <% AZ0060010Detail1_DB.append("['132','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['133','").append("得意先コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['134','").append("得意先正式名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['135','").append("得意先名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['136','").append("得意先カナ名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['137','").append("得意先英名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['138','").append("得意先略称").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['139','").append("代表者役職名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['140','").append("代表者名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['141','").append("自社担当部門コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['142','").append("自社担当者コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 得意先メンテナンス サッブ画面表示する項目-->  <%
	  if("BA0050010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_CUST_BRANCH".equals(aAZ0060010Control.getTable_name())){
	  %>
 <% AZ0060010Detail1_DB.append("['143','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['144','").append("得意先コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['145','").append("支店コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['146','").append("支店正式名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['147','").append("支店名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['148','").append("支店名(カナ)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['149','").append("支店名(英名)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['150','").append("支店昇順").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['151','").append("担当者所属部門名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['152','").append("担当者名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['153','").append("郵便番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['154','").append("住所１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['155','").append("住所２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['156','").append("住所(カナ)１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['157','").append("住所(カナ)２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['158','").append("電話番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['159','").append("ＦＡＸ番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['160','").append("自社担当部門コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['161','").append("自社担当者コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['162','").append("ＥＤＩ相手取引先コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['163','").append("ＥＤＩ自社取引先コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['164','").append("備考１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['165','").append("備考２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['166','").append("備考３").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 会社メンテナンス-->  <%
	  if("BZ0010010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['167','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['168','").append("会社コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['169','").append("会社正式名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['170','").append("会社名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['171','").append("会社名(カナ)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['172','").append("会社名(英名)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['173','").append("郵便番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['174','").append("住所１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['175','").append("住所２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['176','").append("住所(カナ)１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['177','").append("住所(カナ)２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['178','").append("電話番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['179','").append("ＦＡＸ番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 利用者所属会社メンテナンス-->  <%
	  if("BZ0020010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['180','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['181','").append("利用者コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['182','").append("会社コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['183','").append("利用者区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 銀行メンテナンス メイン画面表示する項目-->  <%
	  if("BZ0050010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_BANK_H".equals(aAZ0060010Control.getTable_name())){
	  %>
 <% AZ0060010Detail1_DB.append("['184','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['185','").append("銀行コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['186','").append("銀行名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['187','").append("銀行略名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['188','").append("銀行名(半角カナ)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['189','").append("銀行名(英名)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['190','").append("銀行名(ＦＢ)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 銀行メンテナンス サッブ画面表示する項目-->  <%
	  if("BZ0050010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_BANK".equals(aAZ0060010Control.getTable_name())){
	  %>
 <% AZ0060010Detail1_DB.append("['191','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['192','").append("銀行コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['193','").append("銀行支店コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['194','").append("カレンダ番号").append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['195','").append("銀行支店名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['196','").append("銀行支店略名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['197','").append("銀行支店名(半角カナ)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['198','").append("銀行支店名(英名)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['199','").append("銀行支店名(ＦＢ)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['200','").append("銀行支店名称").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['201','").append("銀行支店名称(英名)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['202','").append("郵便番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['203','").append("住所１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['204','").append("住所２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['205','").append("住所(カナ)１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['206','").append("住所(カナ)２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['207','").append("電話番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['208','").append("ＦＡＸ番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!--銀行口座メンテナンス -->  <%
	  if("BZ0110010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['209','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['210','").append("口座管理コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['211','").append("口座管理名称").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['212','").append("銀行コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['213','").append("銀行支店コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['214','").append("口座種別").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['215','").append("口座番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['216','").append("口座名称").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['217','").append("ＦＢデータ区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['218','").append("振込依頼人コード").append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['219','").append("口座名称(ＦＢ)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 再評価為替レートメンテナンス-->  <%
	  if("BZ0210010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['220','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['221','").append("通貨コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['222','").append("為替種別").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['223','").append("為替予約コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['224','").append("為替開始日付").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['225','").append("為替レート").append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 科目メンテナンス-->  <%
	  if("BZ0250010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['226','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['227','").append("科目コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['228','").append("補助区分コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['229','").append("原始区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['230','").append("科目名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['231','").append("科目略名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['232','").append("科目名（半角カナ）").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['233','").append("貸借区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['234','").append("科目区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['235','").append("補助区分既定値").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['236','").append("内部取引区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 銀行手数料メンテナンス-->  <%
	  if("BZ0270010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['237','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['238','").append("銀行コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['239','").append("振込先区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['240','").append("振込内容区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['241','").append("振込情報区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['242','").append("有効開始日").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['243','").append("有効終了日").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['244','").append("下限金額").append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['245','").append("上限金額").append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['246','").append("振込手数料").append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['247','").append("消費税コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 取引先メンテナンス-->  <%
	  if("CA0020010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['248','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['249','").append("取引先コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['250','").append("取引先正式名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['251','").append("取引先名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['252','").append("取引先カナ名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['253','").append("郵便番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['254','").append("住所１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['255','").append("住所２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['256','").append("住所（カナ）１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['257','").append("住所（カナ）２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['258','").append("電話番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['259','").append("ＦＡＸ番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['260','").append("相手先担当部門").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['261','").append("相手先担当者").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['262','").append("自社担当部門コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['263','").append("自社担当者コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['264','").append("備考").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 取引先支払条件メンテナンス-->  <%
	  if("CA0040010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['265','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['266','").append("取引先コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['267','").append("科目コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['268','").append("補助区分コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['269','").append("支払パターンコード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['270','").append("端数処理区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 支払方法メンテナンス -->  <%
	  if("CA0060010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['271','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['272','").append("支払方法コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['273','").append("支払方法").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['274','").append("科目コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['275','").append("補助区分コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['276','").append("支払対象").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 支払パターンメンテナンス -->  <%
	  if("CA0080010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['277','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['278','").append("支払パターンコード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['279','").append("支払パターン名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['280','").append("条件区分").append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['281','").append("支払方法コード１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['282','").append("支払方法コード２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['283','").append("基準金額").append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['284','").append("割合１").append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['285','").append("割合２").append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 利用者権限管理メンテナンス -->  <%
	  if("CA0100010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['286','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['287','").append("利用者コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['288','").append("所属部門コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['289','").append("伝票管理部門コード（規定値）").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['290','").append("支払締め管理部門コード（規定値）").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['291','").append("支払計算管理部門コード（規定値）").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['292','").append("支払確定管理部門コード（規定値）").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 買掛仕訳パターンメンテナンス -->  <%
	  if("CA0120010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['293','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['294','").append("パターンコード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['295','").append("分類１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['296','").append("分類２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['297','").append("分類３").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['298','").append("買掛仕訳パターン名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['299','").append("借方科目コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['300','").append("借方補助区分コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['301','").append("借方部門設定区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['302','").append("借方部門コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['303','").append("貸方科目コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['304','").append("貸方補助区分コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['305','").append("貸方部門設定区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['306','").append("貸方部門コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['307','").append("伝票種類（一般会計）").append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['308','").append("パターンコード（一般会計）").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 販売単価メンテナンスJa -->  <%
	  if("KA1020010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['309','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['310','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['311','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['312','").append(CoreTools.getRBString("Expj.PURPOSE_UNIT_PRICE_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['313','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_4",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['314','").append(CoreTools.getRBString("Expj.SBCNT_SIZE",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['315','").append(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['316','").append(CoreTools.getRBString("Expj.UNIT_COST",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 得意先メンテナンスJa -->  <%
	if("KA1030010Servlet".equals(aAZ0060010Control.getScreen_url())){
	%>
 <% AZ0060010Detail1_DB.append("['317','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['318','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['319','").append(CoreTools.getRBString("Expj.CUST_NAME_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['320','").append(CoreTools.getRBString("Expj.CUST_ANAME_2",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['321','").append(CoreTools.getRBString("Expj.CUST_KNAME_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['322','").append(CoreTools.getRBString("Expj.OWN_ORG_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['323','").append(CoreTools.getRBString("Expj.OWN_PERSON_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['324','").append(CoreTools.getRBString("Expj.CUR_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['325','").append(CoreTools.getRBString("Expj.INSPC_ACPT_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['326','").append(CoreTools.getRBString("Expj.EXCH_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['327','").append(CoreTools.getRBString("Expj.TAX_CD_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['328','").append(CoreTools.getRBString("Expj.TAX_CALC_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['329','").append(CoreTools.getRBString("Expj.TAX_APPLY_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['330','").append(CoreTools.getRBString("Expj.DETAIL_ROUND_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['331','").append(CoreTools.getRBString("Expj.CUST_GRP_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 納品場所メンテナンスJa -->  <%
	if("KA1040010Servlet".equals(aAZ0060010Control.getScreen_url())){
	%>
 <% AZ0060010Detail1_DB.append("['332','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['333','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['334','").append(CoreTools.getRBString("Expj.DLV_LOC_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['335','").append(CoreTools.getRBString("Expj.DLV_LOC_NAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['336','").append(CoreTools.getRBString("Expj.DLV_LOC_KNAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['337','").append(CoreTools.getRBString("Expj.DLV_LOC_ENAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['338','").append(CoreTools.getRBString("Expj.ZIP_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['339','").append(CoreTools.getRBString("Expj.ADDRESS_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['340','").append(CoreTools.getRBString("Expj.ADDRESS_2",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['341','").append(CoreTools.getRBString("Expj.ADDRESS_K_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['342','").append(CoreTools.getRBString("Expj.ADDRESS_K_2",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['343','").append(CoreTools.getRBString("Expj.TEL",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['344','").append(CoreTools.getRBString("Expj.FAX",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['345','").append(CoreTools.getRBString("Expj.CNCNTRT_DLV_LOC_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['346','").append(CoreTools.getRBString("Expj.SHIP_CTL_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['347','").append(CoreTools.getRBString("Expj.DLV_SLIP_ISS_FLG",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['348','").append(CoreTools.getRBString("Expj.IDENT_CARD_F_ISS_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['349','").append(CoreTools.getRBString("Expj.IDENT_CARD_F_FORMAT_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['350','").append(CoreTools.getRBString("Expj.SHIP_FIX_TERM",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['351','").append(CoreTools.getRBString("Expj.MASS_PRODUCT_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['352','").append(CoreTools.getRBString("Expj.DECISION_REPLACE_PTN",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['353','").append(CoreTools.getRBString("Expj.SHIP_RSLT_APPLY_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['354','").append(CoreTools.getRBString("Expj.CNCNTRT_SHIP_RSLT_APPLY_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['355','").append(CoreTools.getRBString("Expj.NEXT_DLV_SHIFT_EFF_FLG",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['356','").append(CoreTools.getRBString("Expj.UNCNFM_PLAN_AVG_FLG",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['357','").append(CoreTools.getRBString("Expj.TRANSPORT_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['358','").append(CoreTools.getRBString("Expj.CNCNTRT_TRANS_LT",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['359','").append(CoreTools.getRBString("Expj.CUST_TRANS_LT",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 得意先指定納品場所メンテナンスJa -->  <%
	if("KA1080010Servlet".equals(aAZ0060010Control.getScreen_url())){
	%>
 <% AZ0060010Detail1_DB.append("['360','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['361','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['362','").append(CoreTools.getRBString("Expj.CUST_DESINATED_DLV_LOC_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['363','").append(CoreTools.getRBString("Expj.DLV_LOC_OPTION_CHANGE_VALUE",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['364','").append(CoreTools.getRBString("Expj.CUST_DESINATED_DLV_LOC_NAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['365','").append(CoreTools.getRBString("Expj.CUST_DESINATED_DLV_LOC_KNAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['366','").append(CoreTools.getRBString("Expj.CUST_DESINATED_DLV_LOC_ENAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['367','").append(CoreTools.getRBString("Expj.ZIP_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['368','").append(CoreTools.getRBString("Expj.ADDRESS_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['369','").append(CoreTools.getRBString("Expj.ADDRESS_2",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['370','").append(CoreTools.getRBString("Expj.ADDRESS_K_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['371','").append(CoreTools.getRBString("Expj.ADDRESS_K_2",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['372','").append(CoreTools.getRBString("Expj.TEL",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['373','").append(CoreTools.getRBString("Expj.FAX",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['374','").append(CoreTools.getRBString("Expj.FINAL_DLV_LOC_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['375','").append(CoreTools.getRBString("Expj.REMARKS_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['376','").append(CoreTools.getRBString("Expj.REMARKS_2",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['377','").append(CoreTools.getRBString("Expj.REMARKS_3",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 品目メンテナンス -->  <%
	if("AA0010010Servlet".equals(aAZ0060010Control.getScreen_url())){
	%>
 <% AZ0060010Detail1_DB.append("['378','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['379','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['380','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['381','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['382','").append(CoreTools.getRBString("Expj.HIGH_LEVEL_NO",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['383','").append(CoreTools.getRBString("Expj.SPEC",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['384','").append(CoreTools.getRBString("Expj.ISSUE_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['385','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['386','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['387','").append(CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['388','").append(CoreTools.getRBString("Expj.STOCK_UNIT_FLG",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['389','").append(CoreTools.getRBString("Expj.PRODUCT_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['390','").append(CoreTools.getRBString("Expj.STOCK_UNIT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['391','").append(CoreTools.getRBString("Expj.ABC_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['392','").append(CoreTools.getRBString("Expj.PKG_UNIT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['393','").append(CoreTools.getRBString("Expj.OPR_RSLT_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['394','").append(CoreTools.getRBString("Expj.PKG_UNIT_QTY",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['395','").append(CoreTools.getRBString("Expj.SPL_ITEM_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['396','").append(CoreTools.getRBString("Expj.ODR_LT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['397','").append(CoreTools.getRBString("Expj.ISSUE_LT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['398','").append(CoreTools.getRBString("Expj.FIXED_LT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['399','").append(CoreTools.getRBString("Expj.PROP_LOT_SIZE",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['400','").append(CoreTools.getRBString("Expj.PROP_LT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['401','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['402','").append(CoreTools.getRBString("Expj.SAFETY_LT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['403','").append(CoreTools.getRBString("Expj.SAFETY_STOCK",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['404','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['405','").append(CoreTools.getRBString("Expj.MANHOUR_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['406','").append(CoreTools.getRBString("Expj.LOT_SIZING_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['407','").append(CoreTools.getRBString("Expj.MPS_FLG",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['408','").append(CoreTools.getRBString("Expj.MAX_PERIOD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['409','").append(CoreTools.getRBString("Expj.FIXED_ODR_QTY",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['410','").append(CoreTools.getRBString("Expj.MAX_ODR_QTY",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['411','").append(CoreTools.getRBString("Expj.MIN_ODR_QTY",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['412','").append(CoreTools.getRBString("Expj.ODR_POINT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['413','").append(CoreTools.getRBString("Expj.MUL_ODR_QTY",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['414','").append(CoreTools.getRBString("Expj.CLASIFICATION_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['415','").append(CoreTools.getRBString("Expj.UNIT_WEIGHT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['416','").append(CoreTools.getRBString("Expj.TAX_CD_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['417','").append(CoreTools.getRBString("Expj.CAL_NO",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['418','").append(CoreTools.getRBString("Expj.Cmt4091",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['419','").append(CoreTools.getRBString("Expj.Cmt5070",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['420','").append(CoreTools.getRBString("Expj.LOT_CTRL_FLG",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['421','").append(CoreTools.getRBString("Expj.Cmt5071",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['422','").append(CoreTools.getRBString("Expj.Cmt4092",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['423','").append(CoreTools.getRBString("Expj.Cmt5072",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 得意先メンテナンスJF-->  <%
	  if("KA2100010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['424','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['425','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['426','").append(CoreTools.getRBString("Expj.CUST_FNAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['427','").append(CoreTools.getRBString("Expj.CUST_NAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['428','").append(CoreTools.getRBString("Expj.CUST_ANAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['429','").append(CoreTools.getRBString("Expj.CUST_KNAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['430','").append(CoreTools.getRBString("Expj.CUST_GRP_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['431','").append(CoreTools.getRBString("Expj.CUST_DLV_LOC_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['432','").append(CoreTools.getRBString("Expj.OWN_ORG_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['433','").append(CoreTools.getRBString("Expj.OWN_PERSON_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['434','").append(CoreTools.getRBString("Expj.CUR_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['435','").append(CoreTools.getRBString("Expj.INSPC_ACPT_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['436','").append(CoreTools.getRBString("Expj.EXCH_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['437','").append(CoreTools.getRBString("Expj.TAX_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['438','").append(CoreTools.getRBString("Expj.TAX_CALC_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['439','").append(CoreTools.getRBString("Expj.TAX_APPLY_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['440','").append(CoreTools.getRBString("Expj.DETAIL_ROUND_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['441','").append(CoreTools.getRBString("Expj.Cmt4170",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['442','").append(CoreTools.getRBString("Expj.DELIVERY_FLG",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['443','").append(CoreTools.getRBString("Expj.BALA_ACCO_FLG",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['444','").append(CoreTools.getRBString("Expj.UNIT_COST_USE_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 納品場所メンテナンスJF-->  <%
	  if("KA2100020Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['445','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['446','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['447','").append(CoreTools.getRBString("Expj.DLV_LOC_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['448','").append(CoreTools.getRBString("Expj.DLV_LOC_NAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['449','").append(CoreTools.getRBString("Expj.DLV_LOC_KNAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['450','").append(CoreTools.getRBString("Expj.DLV_LOC_ENAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['451','").append(CoreTools.getRBString("Expj.ZIP_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['452','").append(CoreTools.getRBString("Expj.ADDRESS_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['453','").append(CoreTools.getRBString("Expj.ADDRESS_2",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['454','").append(CoreTools.getRBString("Expj.ADDRESS_K_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['455','").append(CoreTools.getRBString("Expj.ADDRESS_K_2",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['456','").append(CoreTools.getRBString("Expj.TEL",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['457','").append(CoreTools.getRBString("Expj.FAX",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['458','").append(CoreTools.getRBString("Expj.Cmt4131",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['459','").append(CoreTools.getRBString("Expj.Cmt4038",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['460','").append(CoreTools.getRBString("Expj.TRANSPORT_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['461','").append(CoreTools.getRBString("Expj.SHIP_WH_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['462','").append(CoreTools.getRBString("Expj.TRANSPORT_LT",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 製品単価メンテナンス-->  <%
	  if("KA2040010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['463','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['464','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['465','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['466','").append(CoreTools.getRBString("Expj.SPCL_PRICE_CO",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['467','").append(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['468','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['469','").append(CoreTools.getRBString("Expj.EFF_PHASE_OUT_DATE_5",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['470','").append(CoreTools.getRBString("Expj.COMM_SIZE",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['471','").append(CoreTools.getRBString("Expj.UNIT_COST",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['472','").append(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 品目メンテナンス JF-->  <%
	if("AA2010010Servlet".equals(aAZ0060010Control.getScreen_url())){
	%>
 <% AZ0060010Detail1_DB.append("['473','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['474','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['475','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['476','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['477','").append(CoreTools.getRBString("Expj.HIGH_LEVEL_NO",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['478','").append(CoreTools.getRBString("Expj.SPEC",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['479','").append(CoreTools.getRBString("Expj.ISSUE_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['480','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['481','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['482','").append(CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['483','").append(CoreTools.getRBString("Expj.STOCK_UNIT_FLG",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['484','").append(CoreTools.getRBString("Expj.PRODUCT_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['485','").append(CoreTools.getRBString("Expj.STOCK_UNIT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['486','").append(CoreTools.getRBString("Expj.ABC_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['487','").append(CoreTools.getRBString("Expj.OPR_RSLT_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['488','").append(CoreTools.getRBString("Expj.SPL_ITEM_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['489','").append(CoreTools.getRBString("Expj.ODR_LT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['490','").append(CoreTools.getRBString("Expj.ISSUE_LT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['491','").append(CoreTools.getRBString("Expj.FIXED_LT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['492','").append(CoreTools.getRBString("Expj.PROP_LOT_SIZE",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['493','").append(CoreTools.getRBString("Expj.PROP_LT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['494','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['495','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['496','").append(CoreTools.getRBString("Expj.MPS_FLG",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['497','").append(CoreTools.getRBString("Expj.LOT_SIZING_TYP",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['498','").append(CoreTools.getRBString("Expj.MAX_PERIOD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['499','").append(CoreTools.getRBString("Expj.MUL_ODR_QTY",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['500','").append(CoreTools.getRBString("Expj.Cmt4088",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['501','").append(CoreTools.getRBString("Expj.SET_LT_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['502','").append(CoreTools.getRBString("Expj.UNIT_WEIGHT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['503','").append(CoreTools.getRBString("Expj.CLASIFICATION_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['504','").append(CoreTools.getRBString("Expj.JANCODE",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['505','").append(CoreTools.getRBString("Expj.TAX_CD_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['506','").append(CoreTools.getRBString("Expj.CAL_NO",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['507','").append(CoreTools.getRBString("Expj.SAFETY_LT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['508','").append(CoreTools.getRBString("Expj.SAFETY_STOCK",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['509','").append(CoreTools.getRBString("Expj.ODR_POINT",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['510','").append(CoreTools.getRBString("Expj.Cmt4090",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['511','").append(CoreTools.getRBString("Expj.MAX_ODR_QTY",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['512','").append(CoreTools.getRBString("Expj.MIN_ODR_QTY",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['513','").append(CoreTools.getRBString("Expj.Cmt4091",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['514','").append(CoreTools.getRBString("Expj.FIXED_ODR_QTY",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['515','").append(CoreTools.getRBString("Expj.STOCK_STATUS",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['516','").append(CoreTools.getRBString("Expj.LOT_CTRL_FLG",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['517','").append(CoreTools.getRBString("Expj.Cmt4092",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['518','").append(CoreTools.getRBString("Expj.Cmt4093",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['519','").append(CoreTools.getRBString("Expj.Cmt4094",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['520','").append(CoreTools.getRBString("Expj.Cmt4095",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['521','").append(CoreTools.getRBString("Expj.Cmt4096",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['522','").append(CoreTools.getRBString("Expj.Cmt4097",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['523','").append(CoreTools.getRBString("Expj.Cmt4098",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 取引先支払条件メンテナンスJF-->  <%
	  if("CA2040010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['524','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['525','").append("取引先コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['526','").append("科目コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['527','").append("補助区分コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['528','").append("支払パターンコード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['529','").append("条件区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['530','").append("端数処理区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['531','").append("支払方法コード１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['532','").append("支払対象区分１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['533','").append("支払方法名１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['534','").append("支払方法コード２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['535','").append("支払対象区分２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 在庫状態メンテナンスJF-->  <%
	  if("AA2340010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['536','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['537','").append(CoreTools.getRBString("Expj.STOCK_STATUS_1",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['538','").append(CoreTools.getRBString("Expj.STOCK_STATUS_NAME",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['539','").append(CoreTools.getRBString("Expj.STOCK_TYP_1",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['540','").append(CoreTools.getRBString("Expj.EFF_STOCK_TYPE",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['541','").append(CoreTools.getRBString("Expj.SHIP_TYP",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['542','").append(CoreTools.getRBString("Expj.TRANSPORT_LT",rb)).append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 得意先組合せメンテナンスJF-->  <%
	  if("KA2130010Servlet".equals(aAZ0060010Control.getScreen_url())){
	  %>
 <% AZ0060010Detail1_DB.append("['543','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['544','").append(CoreTools.getRBString("Expj.DLV_LOC_CD_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['545','").append(CoreTools.getRBString("Expj.CUST_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['546','").append(CoreTools.getRBString("Expj.BALA_ACCO_PATTERN_NO",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['547','").append(CoreTools.getRBString("Expj.CUST_PRIORITY_REF_NO",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['548','").append(CoreTools.getRBString("Expj.BALA_ACCO_PATTERN_PRIORITY_REF_NO",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['549','").append(CoreTools.getRBString("Expj.BALA_ACCO_CD_1",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['550','").append(CoreTools.getRBString("Expj.BALA_ACCO_CD_2",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['551','").append(CoreTools.getRBString("Expj.BALA_ACCO_CD_3",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 請求条件メンテナンスJFメイン画面-->  <%
	  if("BA2020010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_CUST_STL_CTRL".equals(aAZ0060010Control.getTable_name())){
	  %>
 <% AZ0060010Detail1_DB.append("['552','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['553','").append(CoreTools.getRBString("Expj.BILL_ADDRESSEE_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['554','").append("決済条件コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['555','").append("請求部門コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['556','").append("EDI取引区分(請求)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['557','").append("EDI取引区分(入金)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['558','").append("請求残高管理フラグ").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['559','").append("売掛金残高管理フラグ").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['560','").append("回収条件基準金額").append("','<div class=\"expj-align-right\">").append("").append("</div>','<div class=\"expj-align-right\">").append("").append("</div>','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['561','").append("入金相殺区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 請求条件メンテナンスJFサッブ-->  <%
	  if("BA2020010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_CLAIM_CUST_CTRL".equals(aAZ0060010Control.getTable_name())){
	  %>
 <% AZ0060010Detail1_DB.append("['562','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['563','").append(CoreTools.getRBString("Expj.BILL_ADDRESSEE_CD",rb)).append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['564','").append("決済条件コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['565','").append("得意先コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 得意先メンテナンス(売掛) メイン画面表示する項目-->  <%
	  if("BA2050010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_CUST".equals(aAZ0060010Control.getTable_name())){
	  %>
 <% AZ0060010Detail1_DB.append("['566','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['567','").append("得意先コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['568','").append("得意先正式名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['569','").append("得意先名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['570','").append("得意先カナ名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['571','").append("得意先英名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['572','").append("得意先略称").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['573','").append("代表者役職名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['574','").append("代表者名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['575','").append("請求先フラグ").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['576','").append("入金先フラグ").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['577','").append("請求サイクル").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['578','").append("仮単価売上計上フラグ").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['579','").append("入金入力区分").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['580','").append("取引停止フラグ").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<!-- 得意先メンテナンス(売掛) サッブ画面表示する項目-->  <%
	  if("BA2050010Servlet".equals(aAZ0060010Control.getScreen_url()) && "M_CUST_BRANCH".equals(aAZ0060010Control.getTable_name())){
	  %>
 <% AZ0060010Detail1_DB.append("['581','").append(CoreTools.getRBString("Expj.Cmt5084",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5085",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5086",rb)).append("','").append(CoreTools.getRBString("Expj.Cmt5087",rb)).append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['582','").append("得意先コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['583','").append("支店コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['584','").append("支店正式名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['585','").append("支店名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['586','").append("支店名(カナ)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['587','").append("支店名(英名)").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['588','").append("支店昇順").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['589','").append("担当者所属部門名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['590','").append("担当者名").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['591','").append("郵便番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['592','").append("住所１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['593','").append("住所２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['594','").append("住所(カナ)１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['595','").append("住所(カナ)２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['596','").append("電話番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['597','").append("ＦＡＸ番号").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['598','").append("ＥＤＩ相手取引先コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['599','").append("ＥＤＩ自社取引先コード").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['600','").append("備考１").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['601','").append("備考２").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AZ0060010Detail1_DB.append("['602','").append("備考３").append("','").append("").append("','").append("").append("','").append("").append("']").append(",");%>
  <%
	  	}
	  %>
<%
 detailViewId = AZ0060010Detail1_Id;
 detailViewSelect = AZ0060010Detail1_select;
 detailViewResize = AZ0060010Detail1_resize;
 detailViewScroll = AZ0060010Detail1_scroll;
 detailViewHeaderData = AZ0060010Detail1_HB;
 detailViewBodyData = AZ0060010Detail1_DB;
%>
<%
}
%>
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
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AZ0060010');
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
  try{expj.AZ0060010.AZ0060010form1.h_APPR_POWER_TYP.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010form1.r1_FILTER1.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010form1.r2_FILTER1.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010form1.r3_FILTER1.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010form1.h_SELECT_TYP.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010form1.h_HISTORY_FOR_APPR.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010form1.h_REQUEST_APPR_SAME.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010form2.RESERVE_CAUSE.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.ApprAssort.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.ReserveAssort.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.ReserveDelAssort.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.ApprDelAssort.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.MastInfo.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.ApprInfo.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010form1.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button1.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010view1.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010form2.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010view2.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button2.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010button0.executeOnLoad();}catch(e){};
  try{expj.AZ0060010.AZ0060010Detail1.executeOnLoad();}catch(e){};
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
  expj.AZ0060010.AZ0060010form1.executeAllOnDecision();
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