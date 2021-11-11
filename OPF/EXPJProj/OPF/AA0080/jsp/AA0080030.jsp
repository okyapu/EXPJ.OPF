<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:22:39 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0080\AA0080030.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0080.*" %>
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
<jsp:useBean id="aAA0080030Control" class="com.nec.jp.orteus.metamorBase.AA0080.AA0080030Control" scope="request"/>
<jsp:useBean id="aAA0080030Struct" class="com.nec.jp.orteus.metamorBase.AA0080.AA0080030Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

カレンダ一括コピー
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0080/jsp/AA0080030.jsp,v $
$Author: geng-jia $	
$Revision: 1.10 $ $Date: 2017/02/22 02:03:56 $
********************************************************* --%>
<html>
<head>
<title>カレンダ一括コピー</title>
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
<script class="expj-script-AA0080030_init">
  // AA0080030名前空間
  expj.AA0080030 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0080030" data-screen="AA0080030" data-newdata="<%=aAA0080030Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style=""></div><!--/td-->

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
              <script class="expj-script-AA0080030-AA0080030form1">
expj.AA0080030.AA0080030form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AA0080030.AA0080030form1.onLoad0 = function () {
  console.log('AA0080030form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AA0080030.AA0080030form1.onDecision0 = function () {
  console.log('AA0080030form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0080030', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AA0080030button1/copy"
expj.AA0080030.AA0080030form1.child0 = function () {
  console.log('AA0080030form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0080030', 'AA0080030form1', '_AA0080030button1/copy');
};
// script4="child;1;MASK;_AA0080030button1/copy"
expj.AA0080030.AA0080030form1.child1 = function () {
  console.log('AA0080030form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0080030', 'AA0080030form1', '_AA0080030button1/copy');
};
expj.AA0080030.AA0080030form1.executeAllOnDecision = function () {
  console.log('execute AA0080030form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080030.AA0080030form1['onDecision' + i])) {
        expj.AA0080030.AA0080030form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0080030.AA0080030form1.executeOnLoad = function () {
  expj.AA0080030.AA0080030form1.executePScriptOnLoad();
};

expj.AA0080030.AA0080030form1.executePScriptOnLoad = function () {
  console.log('execute AA0080030form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0080030.AA0080030form1['onLoad' + i])) {
      expj.AA0080030.AA0080030form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0080030-AA0080030form1" action="AA0080030Servlet" name="AA0080030form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CAL_NO_1",rb)%></span><!-- コピー元カレンダ番号 --></div><!--/td-->
<script class="expj-script-AA0080030-AA0080030form1-CAL_NO_FROM">
expj.AA0080030.AA0080030form1.CAL_NO_FROM = {};
expj.AA0080030.AA0080030form1.CAL_NO_FROM.executeAllOnDecision = function () {
  console.log('execute AA0080030form1/CAL_NO_FROM.onDecision');
  expj.AA0080030.AA0080030form1.executeAllOnDecision();
  expj.AA0080030.executeAllOnDecision();
};
expj.AA0080030.AA0080030form1.CAL_NO_FROM.executeOnLoad = function () {
  $('#expj-AA0080030-AA0080030form1-CAL_NO_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0080030', 'AA0080030form1', 'CAL_NO_FROM', this);
  });
  expj.AA0080030.AA0080030form1.CAL_NO_FROM.executePScriptOnLoad();
};

expj.AA0080030.AA0080030form1.CAL_NO_FROM.executePScriptOnLoad = function () {
  console.log('execute AA0080030form1/CAL_NO_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AA0080030-AA0080030form1-CAL_NO_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0080030-AA0080030form1-CAL_NO_FROM" name="CAL_NO_FROM" class="AA0080030-focus-move expj-align-right required-value expj-AA0080030-required-A" style="width:150px;" data-kind="OBT_N" value="<%= TypeConverter.sanitizer(aAA0080030Struct.getCAL_NO_FROM()) %>" maxlength="6" ></div><!--/td-->
<script class="expj-script-AA0080030-AA0080030form1-PeekerCalNoFrom">
expj.AA0080030.AA0080030form1.PeekerCalNoFrom = {};
// script1="onClick;0;PEEKER;_AA0080030form1/CAL_NO_FROM@<%=contextNo%>"
expj.AA0080030.AA0080030form1.PeekerCalNoFrom.onClick0 = function () {
  console.log('PeekerCalNoFrom script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0080030';
var parameterValues = 'PeekerCalNoFrom%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0080030', 'AA0080030form1', '_AA0080030form1/CAL_NO_FROM') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CAL_NO_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0080030form1/CAL_NO_FROM%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0080030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0080030.AA0080030form1.PeekerCalNoFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080030.AA0080030form1.PeekerCalNoFrom['onClick' + i])) {
        expj.AA0080030.AA0080030form1.PeekerCalNoFrom['onClick' + i]();
      }
    }
  }
};
expj.AA0080030.AA0080030form1.PeekerCalNoFrom.executeAllOnDecision = function () {
};
expj.AA0080030.AA0080030form1.PeekerCalNoFrom.executeOnLoad = function () {
  $('#expj-AA0080030-AA0080030form1-PeekerCalNoFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0080030', 'AA0080030form1', 'PeekerCalNoFrom', this, 'Button');
    }
  });
  expj.AA0080030.AA0080030form1.PeekerCalNoFrom.executePScriptOnLoad();
};

expj.AA0080030.AA0080030form1.PeekerCalNoFrom.executePScriptOnLoad = function () {
  console.log('execute AA0080030form1/PeekerCalNoFrom.onLoad');
  var targetComponent = document.getElementById('expj-AA0080030-AA0080030form1-PeekerCalNoFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0080030-AA0080030form1-PeekerCalNoFrom" class="AA0080030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0080030-AA0080030form1-CAL_NAME_FROM">
expj.AA0080030.AA0080030form1.CAL_NAME_FROM = {};
expj.AA0080030.AA0080030form1.CAL_NAME_FROM.executeAllOnDecision = function () {
  console.log('execute AA0080030form1/CAL_NAME_FROM.onDecision');
  expj.AA0080030.AA0080030form1.executeAllOnDecision();
  expj.AA0080030.executeAllOnDecision();
};
expj.AA0080030.AA0080030form1.CAL_NAME_FROM.executeOnLoad = function () {
  $('#expj-AA0080030-AA0080030form1-CAL_NAME_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0080030', 'AA0080030form1', 'CAL_NAME_FROM', this);
  });
  expj.AA0080030.AA0080030form1.CAL_NAME_FROM.executePScriptOnLoad();
};

expj.AA0080030.AA0080030form1.CAL_NAME_FROM.executePScriptOnLoad = function () {
  console.log('execute AA0080030form1/CAL_NAME_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AA0080030-AA0080030form1-CAL_NAME_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:430px;text-align:left;"><input type="text" id="expj-AA0080030-AA0080030form1-CAL_NAME_FROM" name="CAL_NAME_FROM" class="AA0080030-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0080030Struct.getCAL_NAME_FROM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CAL_NO_2",rb)%></span><!-- コピー先カレンダ番号 --></div><!--/td-->
<script class="expj-script-AA0080030-AA0080030form1-CAL_NO_TO">
expj.AA0080030.AA0080030form1.CAL_NO_TO = {};
expj.AA0080030.AA0080030form1.CAL_NO_TO.executeAllOnDecision = function () {
  console.log('execute AA0080030form1/CAL_NO_TO.onDecision');
  expj.AA0080030.AA0080030form1.executeAllOnDecision();
  expj.AA0080030.executeAllOnDecision();
};
expj.AA0080030.AA0080030form1.CAL_NO_TO.executeOnLoad = function () {
  $('#expj-AA0080030-AA0080030form1-CAL_NO_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0080030', 'AA0080030form1', 'CAL_NO_TO', this);
  });
  expj.AA0080030.AA0080030form1.CAL_NO_TO.executePScriptOnLoad();
};

expj.AA0080030.AA0080030form1.CAL_NO_TO.executePScriptOnLoad = function () {
  console.log('execute AA0080030form1/CAL_NO_TO.onLoad');
  var targetComponent = document.getElementById('expj-AA0080030-AA0080030form1-CAL_NO_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0080030-AA0080030form1-CAL_NO_TO" name="CAL_NO_TO" class="AA0080030-focus-move expj-align-right required-value expj-AA0080030-required-A" style="width:150px;" data-kind="OBT_N" value="<%= TypeConverter.sanitizer(aAA0080030Struct.getCAL_NO_TO()) %>" maxlength="6" ></div><!--/td-->
<script class="expj-script-AA0080030-AA0080030form1-PeekerCalNoTo">
expj.AA0080030.AA0080030form1.PeekerCalNoTo = {};
// script1="onClick;0;PEEKER;_AA0080030form1/CAL_NO_TO@<%=contextNo%>"
expj.AA0080030.AA0080030form1.PeekerCalNoTo.onClick0 = function () {
  console.log('PeekerCalNoTo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0080030';
var parameterValues = 'PeekerCalNoTo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0080030', 'AA0080030form1', '_AA0080030form1/CAL_NO_TO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CAL_NO_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0080030form1/CAL_NO_TO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0080030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0080030.AA0080030form1.PeekerCalNoTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080030.AA0080030form1.PeekerCalNoTo['onClick' + i])) {
        expj.AA0080030.AA0080030form1.PeekerCalNoTo['onClick' + i]();
      }
    }
  }
};
expj.AA0080030.AA0080030form1.PeekerCalNoTo.executeAllOnDecision = function () {
};
expj.AA0080030.AA0080030form1.PeekerCalNoTo.executeOnLoad = function () {
  $('#expj-AA0080030-AA0080030form1-PeekerCalNoTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0080030', 'AA0080030form1', 'PeekerCalNoTo', this, 'Button');
    }
  });
  expj.AA0080030.AA0080030form1.PeekerCalNoTo.executePScriptOnLoad();
};

expj.AA0080030.AA0080030form1.PeekerCalNoTo.executePScriptOnLoad = function () {
  console.log('execute AA0080030form1/PeekerCalNoTo.onLoad');
  var targetComponent = document.getElementById('expj-AA0080030-AA0080030form1-PeekerCalNoTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0080030-AA0080030form1-PeekerCalNoTo" class="AA0080030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0080030-AA0080030form1-CAL_NAME_TO">
expj.AA0080030.AA0080030form1.CAL_NAME_TO = {};
expj.AA0080030.AA0080030form1.CAL_NAME_TO.executeAllOnDecision = function () {
  console.log('execute AA0080030form1/CAL_NAME_TO.onDecision');
  expj.AA0080030.AA0080030form1.executeAllOnDecision();
  expj.AA0080030.executeAllOnDecision();
};
expj.AA0080030.AA0080030form1.CAL_NAME_TO.executeOnLoad = function () {
  $('#expj-AA0080030-AA0080030form1-CAL_NAME_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0080030', 'AA0080030form1', 'CAL_NAME_TO', this);
  });
  expj.AA0080030.AA0080030form1.CAL_NAME_TO.executePScriptOnLoad();
};

expj.AA0080030.AA0080030form1.CAL_NAME_TO.executePScriptOnLoad = function () {
  console.log('execute AA0080030form1/CAL_NAME_TO.onLoad');
  var targetComponent = document.getElementById('expj-AA0080030-AA0080030form1-CAL_NAME_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:430px;text-align:left;"><input type="text" id="expj-AA0080030-AA0080030form1-CAL_NAME_TO" name="CAL_NAME_TO" class="AA0080030-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0080030Struct.getCAL_NAME_TO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0080030-AA0080030button1">
expj.AA0080030.AA0080030button1 = {};
expj.AA0080030.AA0080030button1.executeAllOnDecision = function () {
  console.log('execute AA0080030button1.onDecision');
};
expj.AA0080030.AA0080030button1.executeOnLoad = function () {
  expj.AA0080030.AA0080030button1.executePScriptOnLoad();
};

expj.AA0080030.AA0080030button1.executePScriptOnLoad = function () {
  console.log('execute AA0080030button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0080030-AA0080030button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0080030-AA0080030button1-copy">
expj.AA0080030.AA0080030button1.copy = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0080030form1/*@AA0080030Servlet,,$ZZ07009"
expj.AA0080030.AA0080030button1.copy.onClick0 = function () {
  console.log('copy script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0080030', 'AA0080030button1', '_AA0080030form1/*', 'AA0080030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0080030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0080030', response);
expj.common.updateBusinessScreenTab('AA0080030', contents);
};
expj.common.pscript.callConfirm('AA0080030', 'AA0080030button1', 'ZZ07009', okEvent);
};
expj.AA0080030.AA0080030button1.copy.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080030.AA0080030button1.copy['onClick' + i])) {
        expj.AA0080030.AA0080030button1.copy['onClick' + i]();
      }
    }
  }
};
expj.AA0080030.AA0080030button1.copy.executeAllOnDecision = function () {
};
expj.AA0080030.AA0080030button1.copy.executeOnLoad = function () {
  $('#expj-AA0080030-AA0080030button1-copy').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0080030', 'AA0080030button1', 'copy', this, 'Button');
    }
  });
  expj.AA0080030.AA0080030button1.copy.executePScriptOnLoad();
};

expj.AA0080030.AA0080030button1.copy.executePScriptOnLoad = function () {
  console.log('execute AA0080030button1/copy.onLoad');
  var targetComponent = document.getElementById('expj-AA0080030-AA0080030button1-copy');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0080030-AA0080030button1-copy" name="copy" class="AA0080030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0080030 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0080030-AA0080030button0">
expj.AA0080030.AA0080030button0 = {};
expj.AA0080030.AA0080030button0.executeAllOnDecision = function () {
  console.log('execute AA0080030button0.onDecision');
};
expj.AA0080030.AA0080030button0.executeOnLoad = function () {
  expj.AA0080030.AA0080030button0.executePScriptOnLoad();
};

expj.AA0080030.AA0080030button0.executePScriptOnLoad = function () {
  console.log('execute AA0080030button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0080030-AA0080030button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0080030-AA0080030button0-clear">
expj.AA0080030.AA0080030button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0080030form1/*@AA0080030Servlet,,$ZZ07008"
expj.AA0080030.AA0080030button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0080030', 'AA0080030button0', '_AA0080030form1/*', 'AA0080030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0080030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0080030', response);
expj.common.updateBusinessScreenTab('AA0080030', contents);
};
expj.common.pscript.callConfirm('AA0080030', 'AA0080030button0', 'ZZ07008', okEvent);
};
expj.AA0080030.AA0080030button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080030.AA0080030button0.clear['onClick' + i])) {
        expj.AA0080030.AA0080030button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AA0080030.AA0080030button0.clear.executeAllOnDecision = function () {
};
expj.AA0080030.AA0080030button0.clear.executeOnLoad = function () {
  $('#expj-AA0080030-AA0080030button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0080030', 'AA0080030button0', 'clear', this, 'Button');
    }
  });
  expj.AA0080030.AA0080030button0.clear.executePScriptOnLoad();
};

expj.AA0080030.AA0080030button0.clear.executePScriptOnLoad = function () {
  console.log('execute AA0080030button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0080030-AA0080030button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0080030-AA0080030button0-clear" name="clear" class="AA0080030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0080030-AA0080030button0-close">
expj.AA0080030.AA0080030button0.close = {};
// script1="onClick;0;CLOSE"
expj.AA0080030.AA0080030button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AA0080030');
};
expj.AA0080030.AA0080030button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080030.AA0080030button0.close['onClick' + i])) {
        expj.AA0080030.AA0080030button0.close['onClick' + i]();
      }
    }
  }
};
expj.AA0080030.AA0080030button0.close.executeAllOnDecision = function () {
};
expj.AA0080030.AA0080030button0.close.executeOnLoad = function () {
  $('#expj-AA0080030-AA0080030button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0080030', 'AA0080030button0', 'close', this, 'Button');
    }
  });
  expj.AA0080030.AA0080030button0.close.executePScriptOnLoad();
};

expj.AA0080030.AA0080030button0.close.executePScriptOnLoad = function () {
  console.log('execute AA0080030button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AA0080030-AA0080030button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0080030-AA0080030button0-close" name="close" class="AA0080030-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0080030 (END)-->
<%
MessageStruct msgStruct = aAA0080030Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0080030-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0080030)) {
  expj.common.treeInstanceMap.AA0080030 = {};
}
expj.common.treeInstanceMap.AA0080030.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0080030.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0080030.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0080030.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0080030.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0080030.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0080030.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0080030.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0080030.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0080030-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0080030-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0080030)) {
  expj.common.detailDialogMap.AA0080030 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0080030._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0080030._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0080030.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0080030.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0080030.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0080030.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0080030.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0080030.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0080030.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0080030.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0080030-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0080030.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0080030-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0080030.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0080030-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0080030.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0080030.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0080030.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0080030._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0080030-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0080030)) {
  expj.common.viewInstanceMap.AA0080030 = {};
}
expj.common.viewInstanceMap.AA0080030.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0080030.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0080030.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0080030.<%=viewId %>.init = function () {
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
    expj.AA0080030.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0080030.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0080030-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0080030-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0080030_init">
/**
 * AA0080030用のロード完了時初期化関数
 */
expj.AA0080030.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0080030');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0080030');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0080030');
  expj.common.calendarInstanceMap.AA0080030 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0080030.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0080030.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0080030.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0080030.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0080030.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0080030');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0080030');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0080030-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0080030-<%=detailId %>');
<%
 }
%>
  try{expj.AA0080030.AA0080030form1.CAL_NO_FROM.executeOnLoad();}catch(e){};
  try{expj.AA0080030.AA0080030form1.PeekerCalNoFrom.executeOnLoad();}catch(e){};
  try{expj.AA0080030.AA0080030form1.CAL_NAME_FROM.executeOnLoad();}catch(e){};
  try{expj.AA0080030.AA0080030form1.CAL_NO_TO.executeOnLoad();}catch(e){};
  try{expj.AA0080030.AA0080030form1.PeekerCalNoTo.executeOnLoad();}catch(e){};
  try{expj.AA0080030.AA0080030form1.CAL_NAME_TO.executeOnLoad();}catch(e){};
  try{expj.AA0080030.AA0080030button1.copy.executeOnLoad();}catch(e){};
  try{expj.AA0080030.AA0080030button0.clear.executeOnLoad();}catch(e){};
  try{expj.AA0080030.AA0080030button0.close.executeOnLoad();}catch(e){};
  try{expj.AA0080030.AA0080030form1.executeOnLoad();}catch(e){};
  try{expj.AA0080030.AA0080030button1.executeOnLoad();}catch(e){};
  try{expj.AA0080030.AA0080030button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0080030.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0080030', 'AA0080030');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0080030');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0080030-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0080030-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0080030', '<%=request.getContextPath() %>');
};

/**
 * AA0080030の全体onDecision処理
 */
expj.AA0080030.executeAllOnDecision = function () {
  expj.AA0080030.AA0080030form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0080030_console">
expj.AA0080030.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>