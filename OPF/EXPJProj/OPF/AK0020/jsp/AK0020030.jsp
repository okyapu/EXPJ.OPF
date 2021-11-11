<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:44:27 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AK0020\AK0020030.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AK0020.*" %>
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
<jsp:useBean id="aAK0020030Control" class="com.nec.jp.orteus.metamorBase.AK0020.AK0020030Control" scope="request"/>
<jsp:useBean id="aAK0020030Struct" class="com.nec.jp.orteus.metamorBase.AK0020.AK0020030Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

自動履歴削除処理実行
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AK0020/jsp/AK0020030.jsp,v $
$Author: geng-jia $	
$Revision: 1.6 $　$Date: 2017/02/22 02:06:14 $
********************************************************* --%>
<html>
<head>
<title>自動履歴削除処理実行</title>
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
<script class="expj-script-AK0020030_init">
  // AK0020030名前空間
  expj.AK0020030 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AK0020030" data-screen="AK0020030" data-newdata="<%=aAK0020030Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

    <div class="expj-tr expjDynamicHeight" style=""> 
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);height:100%;"> 
        <div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2-->
          <div class="expj-tr" style="width:100%;height:0px;display:none;">
 
            <div class="expj-td frame01"></div><!--/td-->

            <div class="expj-td frame02"></div><!--/td-->

            <div class="expj-td frame03"></div><!--/td-->

          </div><!--/tr-->

          <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
 
            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style="height:100%;"> 
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-AK0020030-AK0020030form1">
expj.AK0020030.AK0020030form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AK0020030.AK0020030form1.onLoad0 = function () {
  console.log('AK0020030form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AK0020030.AK0020030form1.onDecision0 = function () {
  console.log('AK0020030form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AK0020030', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AK0020030button1/Execute"
expj.AK0020030.AK0020030form1.child0 = function () {
  console.log('AK0020030form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AK0020030', 'AK0020030form1', '_AK0020030button1/Execute');
};
// script4="child;1;MASK;_AK0020030button1/Execute"
expj.AK0020030.AK0020030form1.child1 = function () {
  console.log('AK0020030form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AK0020030', 'AK0020030form1', '_AK0020030button1/Execute');
};
// script5="onDecision;1;CHK;?AK0020030form1/*[eq]ERROR@*1"
expj.AK0020030.AK0020030form1.onDecision1 = function () {
  console.log('AK0020030form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AK0020030', 'AK0020030form1', '?AK0020030form1/*'), '[eq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
expj.AK0020030.AK0020030form1.executeAllOnDecision = function () {
  console.log('execute AK0020030form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AK0020030.AK0020030form1['onDecision' + i])) {
        expj.AK0020030.AK0020030form1['onDecision' + i]();
      }
    }
  }
};
expj.AK0020030.AK0020030form1.executeOnLoad = function () {
  expj.AK0020030.AK0020030form1.executePScriptOnLoad();
};

expj.AK0020030.AK0020030form1.executePScriptOnLoad = function () {
  console.log('execute AK0020030form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AK0020030.AK0020030form1['onLoad' + i])) {
      expj.AK0020030.AK0020030form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AK0020030-AK0020030form1" action="AK0020030Servlet" name="AK0020030form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAK0020030Control.getReadStatusString()) %>" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
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
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.FINAL_MONTHLY_PROC_EXEC_DATE_2",rb)%></span><!-- 削除処理基準年月 --></div><!--/td-->
<script class="expj-script-AK0020030-AK0020030form1-FINAL_MONTHLY_PROC_EXEC_DATE">
expj.AK0020030.AK0020030form1.FINAL_MONTHLY_PROC_EXEC_DATE = {};
expj.AK0020030.AK0020030form1.FINAL_MONTHLY_PROC_EXEC_DATE.executeAllOnDecision = function () {
  console.log('execute AK0020030form1/FINAL_MONTHLY_PROC_EXEC_DATE.onDecision');
  expj.AK0020030.AK0020030form1.executeAllOnDecision();
  expj.AK0020030.executeAllOnDecision();
};
expj.AK0020030.AK0020030form1.FINAL_MONTHLY_PROC_EXEC_DATE.executeOnLoad = function () {
  $('#expj-AK0020030-AK0020030form1-FINAL_MONTHLY_PROC_EXEC_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AK0020030', 'AK0020030form1', 'FINAL_MONTHLY_PROC_EXEC_DATE', this);
  });
  expj.AK0020030.AK0020030form1.FINAL_MONTHLY_PROC_EXEC_DATE.executePScriptOnLoad();
};

expj.AK0020030.AK0020030form1.FINAL_MONTHLY_PROC_EXEC_DATE.executePScriptOnLoad = function () {
  console.log('execute AK0020030form1/FINAL_MONTHLY_PROC_EXEC_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AK0020030-AK0020030form1-FINAL_MONTHLY_PROC_EXEC_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AK0020030-AK0020030form1-FINAL_MONTHLY_PROC_EXEC_DATE" name="FINAL_MONTHLY_PROC_EXEC_DATE" class="AK0020030-focus-move  required-value expj-AK0020030-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YM" value="<%= TypeConverter.sanitizer(aAK0020030Struct.getFINAL_MONTHLY_PROC_EXEC_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AK0020030-AK0020030button1">
expj.AK0020030.AK0020030button1 = {};
expj.AK0020030.AK0020030button1.executeAllOnDecision = function () {
  console.log('execute AK0020030button1.onDecision');
};
expj.AK0020030.AK0020030button1.executeOnLoad = function () {
  expj.AK0020030.AK0020030button1.executePScriptOnLoad();
};

expj.AK0020030.AK0020030button1.executePScriptOnLoad = function () {
  console.log('execute AK0020030button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AK0020030-AK0020030button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AK0020030-AK0020030button1-Execute">
expj.AK0020030.AK0020030button1.Execute = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AK0020030form1/*@AK0020030Servlet,,$ZZ07010"
expj.AK0020030.AK0020030button1.Execute.onClick0 = function () {
  console.log('Execute script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AK0020030', 'AK0020030button1', '_AK0020030form1/*', 'AK0020030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AK0020030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AK0020030', response);
expj.common.updateBusinessScreenTab('AK0020030', contents);
};
expj.common.pscript.callConfirm('AK0020030', 'AK0020030button1', 'ZZ07010', okEvent);
};
expj.AK0020030.AK0020030button1.Execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AK0020030.AK0020030button1.Execute['onClick' + i])) {
        expj.AK0020030.AK0020030button1.Execute['onClick' + i]();
      }
    }
  }
};
expj.AK0020030.AK0020030button1.Execute.executeAllOnDecision = function () {
};
expj.AK0020030.AK0020030button1.Execute.executeOnLoad = function () {
  $('#expj-AK0020030-AK0020030button1-Execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AK0020030', 'AK0020030button1', 'Execute', this, 'Button');
    }
  });
  expj.AK0020030.AK0020030button1.Execute.executePScriptOnLoad();
};

expj.AK0020030.AK0020030button1.Execute.executePScriptOnLoad = function () {
  console.log('execute AK0020030button1/Execute.onLoad');
  var targetComponent = document.getElementById('expj-AK0020030-AK0020030button1-Execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AK0020030-AK0020030button1-Execute" name="Execute" class="AK0020030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AK0020030 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AK0020030-AK0020030button0">
expj.AK0020030.AK0020030button0 = {};
expj.AK0020030.AK0020030button0.executeAllOnDecision = function () {
  console.log('execute AK0020030button0.onDecision');
};
expj.AK0020030.AK0020030button0.executeOnLoad = function () {
  expj.AK0020030.AK0020030button0.executePScriptOnLoad();
};

expj.AK0020030.AK0020030button0.executePScriptOnLoad = function () {
  console.log('execute AK0020030button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AK0020030-AK0020030button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AK0020030-AK0020030button0-Clear">
expj.AK0020030.AK0020030button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AK0020030Servlet,,$ZZ07008"
expj.AK0020030.AK0020030button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AK0020030', 'AK0020030button0', '', 'AK0020030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AK0020030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AK0020030', response);
expj.common.updateBusinessScreenTab('AK0020030', contents);
};
expj.common.pscript.callConfirm('AK0020030', 'AK0020030button0', 'ZZ07008', okEvent);
};
expj.AK0020030.AK0020030button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AK0020030.AK0020030button0.Clear['onClick' + i])) {
        expj.AK0020030.AK0020030button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AK0020030.AK0020030button0.Clear.executeAllOnDecision = function () {
};
expj.AK0020030.AK0020030button0.Clear.executeOnLoad = function () {
  $('#expj-AK0020030-AK0020030button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AK0020030', 'AK0020030button0', 'Clear', this, 'Button');
    }
  });
  expj.AK0020030.AK0020030button0.Clear.executePScriptOnLoad();
};

expj.AK0020030.AK0020030button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AK0020030button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AK0020030-AK0020030button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AK0020030-AK0020030button0-Clear" name="Clear" class="AK0020030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AK0020030-AK0020030button0-Close">
expj.AK0020030.AK0020030button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AK0020030.AK0020030button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AK0020030');
};
expj.AK0020030.AK0020030button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AK0020030.AK0020030button0.Close['onClick' + i])) {
        expj.AK0020030.AK0020030button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AK0020030.AK0020030button0.Close.executeAllOnDecision = function () {
};
expj.AK0020030.AK0020030button0.Close.executeOnLoad = function () {
  $('#expj-AK0020030-AK0020030button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AK0020030', 'AK0020030button0', 'Close', this, 'Button');
    }
  });
  expj.AK0020030.AK0020030button0.Close.executePScriptOnLoad();
};

expj.AK0020030.AK0020030button0.Close.executePScriptOnLoad = function () {
  console.log('execute AK0020030button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AK0020030-AK0020030button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AK0020030-AK0020030button0-Close" name="Close" class="AK0020030-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AK0020030 (END)-->
<%
MessageStruct msgStruct = aAK0020030Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AK0020030-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AK0020030)) {
  expj.common.treeInstanceMap.AK0020030 = {};
}
expj.common.treeInstanceMap.AK0020030.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AK0020030.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AK0020030.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AK0020030.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AK0020030.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AK0020030.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AK0020030.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AK0020030.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AK0020030.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AK0020030-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AK0020030-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AK0020030)) {
  expj.common.detailDialogMap.AK0020030 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AK0020030._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AK0020030._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AK0020030.<%=detailId %>)) {
  expj.common.detailDialogMap.AK0020030.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AK0020030.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AK0020030.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AK0020030.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AK0020030.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AK0020030.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AK0020030.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AK0020030-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AK0020030.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AK0020030-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AK0020030.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AK0020030-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AK0020030.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AK0020030.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AK0020030.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AK0020030._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AK0020030-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AK0020030)) {
  expj.common.viewInstanceMap.AK0020030 = {};
}
expj.common.viewInstanceMap.AK0020030.<%=viewId %> = {};
expj.common.viewInstanceMap.AK0020030.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AK0020030.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AK0020030.<%=viewId %>.init = function () {
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
    expj.AK0020030.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AK0020030.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AK0020030-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AK0020030-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AK0020030_init">
/**
 * AK0020030用のロード完了時初期化関数
 */
expj.AK0020030.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AK0020030');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AK0020030');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AK0020030');
  expj.common.calendarInstanceMap.AK0020030 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AK0020030.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AK0020030.<%=detailId %>.init();
  expj.common.detailDialogMap.AK0020030.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AK0020030.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AK0020030.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AK0020030');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AK0020030');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AK0020030-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AK0020030-<%=detailId %>');
<%
 }
%>
  try{expj.AK0020030.AK0020030form1.FINAL_MONTHLY_PROC_EXEC_DATE.executeOnLoad();}catch(e){};
  try{expj.AK0020030.AK0020030button1.Execute.executeOnLoad();}catch(e){};
  try{expj.AK0020030.AK0020030button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AK0020030.AK0020030button0.Close.executeOnLoad();}catch(e){};
  try{expj.AK0020030.AK0020030form1.executeOnLoad();}catch(e){};
  try{expj.AK0020030.AK0020030button1.executeOnLoad();}catch(e){};
  try{expj.AK0020030.AK0020030button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AK0020030.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AK0020030', 'AK0020030');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AK0020030');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AK0020030-focus-move');
  // 初期フォーカス当てる処理
  $('.AK0020030-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AK0020030', '<%=request.getContextPath() %>');
};

/**
 * AK0020030の全体onDecision処理
 */
expj.AK0020030.executeAllOnDecision = function () {
  expj.AK0020030.AK0020030form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AK0020030_console">
expj.AK0020030.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>