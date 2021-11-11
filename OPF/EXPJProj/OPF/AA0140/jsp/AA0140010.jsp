<%-- ***
This file is generated
 GeneratedDate  : Fri Feb 17 09:39:45 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0140\AA0140010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0140.*" %>
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
<jsp:useBean id="aAA0140010Control" class="com.nec.jp.orteus.metamorBase.AA0140.AA0140010Control" scope="request"/>
<jsp:useBean id="aAA0140010Struct" class="com.nec.jp.orteus.metamorBase.AA0140.AA0140010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

単価マスタ検索
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0140/jsp/AA0140010.jsp,v $
$Author: geng-jia $	
$Revision: 1.11 $　$Date: 2017/02/22 02:04:05 $
********************************************************* --%>
<html>
<head>
<title>単価マスタ検索</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("AA0040010Servlet", so);
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
<script class="expj-script-AA0140010_init">
  // AA0140010名前空間
  expj.AA0140010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AA0140010" data-screen="AA0140010" data-newdata="<%=aAA0140010Control.isNewData() %>">
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
              <script class="expj-script-AA0140010-AA0140010form1">
expj.AA0140010.AA0140010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AA0140010.AA0140010form1.onLoad0 = function () {
  console.log('AA0140010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AA0140010.AA0140010form1.onDecision0 = function () {
  console.log('AA0140010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0140010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AA0140010button1/Select,_AA0140010button0/CsvOut"
expj.AA0140010.AA0140010form1.child0 = function () {
  console.log('AA0140010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0140010', 'AA0140010form1', '_AA0140010button1/Select');
expj.common.pscript.setUnMaskToReferenceComponent('AA0140010', 'AA0140010form1', '_AA0140010button0/CsvOut');
};
// script4="child;1;MASK;_AA0140010button1/Select,_AA0140010button0/CsvOut"
expj.AA0140010.AA0140010form1.child1 = function () {
  console.log('AA0140010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0140010', 'AA0140010form1', '_AA0140010button1/Select');
expj.common.pscript.setMaskToReferenceComponent('AA0140010', 'AA0140010form1', '_AA0140010button0/CsvOut');
};
// script5="onDecision;1;CHKRQ;?AA0140010view1/?[neq]NOT_SELECTED@*2,*4"
expj.AA0140010.AA0140010form1.onDecision1 = function () {
  console.log('AA0140010form1 script5');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0140010', 'AA0140010form1', '?AA0140010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?ITEM_CD[eq]SAME[and]?AA0140010form1/*[eq]NORMAL@*3,*4"
expj.AA0140010.AA0140010form1.child2 = function () {
  console.log('AA0140010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0140010', 'AA0140010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0140010', 'AA0140010form1', '?AA0140010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AA0140010button2/Button1"
expj.AA0140010.AA0140010form1.child3 = function () {
  console.log('AA0140010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AA0140010', 'AA0140010form1', '_AA0140010button2/Button1');
};
// script8="child;4;MASK;_AA0140010button2/Button1"
expj.AA0140010.AA0140010form1.child4 = function () {
  console.log('AA0140010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AA0140010', 'AA0140010form1', '_AA0140010button2/Button1');
};
expj.AA0140010.AA0140010form1.executeAllOnDecision = function () {
  console.log('execute AA0140010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0140010.AA0140010form1['onDecision' + i])) {
        expj.AA0140010.AA0140010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0140010.AA0140010form1.executeOnLoad = function () {
  expj.AA0140010.AA0140010form1.executePScriptOnLoad();
};

expj.AA0140010.AA0140010form1.executePScriptOnLoad = function () {
  console.log('execute AA0140010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0140010.AA0140010form1['onLoad' + i])) {
      expj.AA0140010.AA0140010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0140010-AA0140010form1" action="AA0140010Servlet" name="AA0140010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0140010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AA0140010-AA0140010form1-ITEM_CD">
expj.AA0140010.AA0140010form1.ITEM_CD = {};
expj.AA0140010.AA0140010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0140010form1/ITEM_CD.onDecision');
  expj.AA0140010.AA0140010form1.executeAllOnDecision();
  expj.AA0140010.executeAllOnDecision();
};
expj.AA0140010.AA0140010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0140010-AA0140010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0140010', 'AA0140010form1', 'ITEM_CD', this);
  });
  expj.AA0140010.AA0140010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AA0140010.AA0140010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0140010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0140010-AA0140010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0140010-AA0140010form1-ITEM_CD" name="ITEM_CD" class="AA0140010-focus-move  required-value expj-AA0140010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0140010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0140010-AA0140010form1-PeekerITEM_CD">
expj.AA0140010.AA0140010form1.PeekerITEM_CD = {};
// script1="onClick;0;PEEKER;_AA0140010form1/ITEM_CD@<%=contextNo%>"
expj.AA0140010.AA0140010form1.PeekerITEM_CD.onClick0 = function () {
  console.log('PeekerITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0140010';
var parameterValues = 'PeekerITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0140010', 'AA0140010form1', '_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0140010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0140010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0140010.AA0140010form1.PeekerITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0140010.AA0140010form1.PeekerITEM_CD['onClick' + i])) {
        expj.AA0140010.AA0140010form1.PeekerITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.AA0140010.AA0140010form1.PeekerITEM_CD.executeAllOnDecision = function () {
};
expj.AA0140010.AA0140010form1.PeekerITEM_CD.executeOnLoad = function () {
  $('#expj-AA0140010-AA0140010form1-PeekerITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0140010', 'AA0140010form1', 'PeekerITEM_CD', this, 'Button');
    }
  });
  expj.AA0140010.AA0140010form1.PeekerITEM_CD.executePScriptOnLoad();
};

expj.AA0140010.AA0140010form1.PeekerITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0140010form1/PeekerITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0140010-AA0140010form1-PeekerITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0140010-AA0140010form1-PeekerITEM_CD" class="AA0140010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0140010-AA0140010form1-ITEM_NAME">
expj.AA0140010.AA0140010form1.ITEM_NAME = {};
expj.AA0140010.AA0140010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0140010form1/ITEM_NAME.onDecision');
  expj.AA0140010.AA0140010form1.executeAllOnDecision();
  expj.AA0140010.executeAllOnDecision();
};
expj.AA0140010.AA0140010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0140010-AA0140010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0140010', 'AA0140010form1', 'ITEM_NAME', this);
  });
  expj.AA0140010.AA0140010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AA0140010.AA0140010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0140010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0140010-AA0140010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0140010-AA0140010form1-ITEM_NAME" name="ITEM_NAME" class="AA0140010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0140010Struct.getITEM_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AA0140010-AA0140010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0140010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AA0140010-AA0140010form1-DOWNLOAD_FILE">
expj.AA0140010.AA0140010form1.DOWNLOAD_FILE = {};
expj.AA0140010.AA0140010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AA0140010form1/DOWNLOAD_FILE.onDecision');
  expj.AA0140010.AA0140010form1.executeAllOnDecision();
  expj.AA0140010.executeAllOnDecision();
};
expj.AA0140010.AA0140010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AA0140010-AA0140010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0140010', 'AA0140010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AA0140010.AA0140010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AA0140010.AA0140010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AA0140010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AA0140010-AA0140010form1-DOWNLOAD_FILE');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0140010-AA0140010button1">
expj.AA0140010.AA0140010button1 = {};
expj.AA0140010.AA0140010button1.executeAllOnDecision = function () {
  console.log('execute AA0140010button1.onDecision');
};
expj.AA0140010.AA0140010button1.executeOnLoad = function () {
  expj.AA0140010.AA0140010button1.executePScriptOnLoad();
};

expj.AA0140010.AA0140010button1.executePScriptOnLoad = function () {
  console.log('execute AA0140010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0140010-AA0140010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0140010-AA0140010button1-Select">
expj.AA0140010.AA0140010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0140010form1/*@AA0140010Servlet,,"
expj.AA0140010.AA0140010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0140010', 'AA0140010button1', '_AA0140010form1/*', 'AA0140010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0140010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0140010', response);
expj.common.updateBusinessScreenTab('AA0140010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0140010.AA0140010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0140010.AA0140010button1.Select['onClick' + i])) {
        expj.AA0140010.AA0140010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AA0140010.AA0140010button1.Select.executeAllOnDecision = function () {
};
expj.AA0140010.AA0140010button1.Select.executeOnLoad = function () {
  $('#expj-AA0140010-AA0140010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0140010', 'AA0140010button1', 'Select', this, 'Button');
    }
  });
  expj.AA0140010.AA0140010button1.Select.executePScriptOnLoad();
};

expj.AA0140010.AA0140010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AA0140010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AA0140010-AA0140010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0140010-AA0140010button1-Select" name="Select" class="AA0140010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AA0140010-AA0140010view1">
expj.AA0140010.AA0140010view1 = {};
expj.AA0140010.AA0140010view1.executeAllOnClick = function () {
};
expj.AA0140010.AA0140010view1.executeAllOnDecision = function () {
  console.log('execute AA0140010view1.onDecision');
};
expj.AA0140010.AA0140010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0140010view1", "expj.AA0140010.AA0140010view1.executeAllOnClick");
%>
  expj.AA0140010.AA0140010view1.executePScriptOnLoad();
};

expj.AA0140010.AA0140010view1.executePScriptOnLoad = function () {
  console.log('execute AA0140010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0140010-AA0140010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0140010view1_Id = "AA0140010view1";
 String AA0140010view1_select = "single";
 String AA0140010view1_sortable = "true";
 String AA0140010view1_resize = "true";
 String AA0140010view1_scroll = "true";
 StringBuffer AA0140010view1_HB = new StringBuffer();
 StringBuffer AA0140010view1_DB = new StringBuffer();
%>
<%
 AA0140010view1_select = "single";
 AA0140010view1_sortable = "true";
 AA0140010view1_resize = "true";
 AA0140010view1_scroll = "true";
%>
<%
 AA0140010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0140010view1_sortable).append("}").append(",");
%>
     
<%
AA0140010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'95px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_PRIORITY_REF_NO",rb))).append("', 'name':'PUCH_PRIORITY_REF_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AA0140010view1_sortable).append("}").append(",");
AA0140010view1_HB.append("{'visible':true, 'type':'string', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0140010view1_sortable).append("}").append(",");
AA0140010view1_HB.append("{'visible':true, 'type':'string', 'width':'160px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_NAME",rb))).append("', 'name':'VEND_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0140010view1_sortable).append("}").append(",");
AA0140010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE",rb))).append("', 'name':'EFF_PHASE_IN_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0140010view1_sortable).append("}").append(",");
AA0140010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.COMM_SIZE",rb))).append("', 'name':'PUCH_SIZE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0140010view1_sortable).append("}").append(",");
AA0140010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb))).append("', 'name':'DISPLAY_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0140010view1_sortable).append("}").append(",");
AA0140010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST_2",rb))).append("', 'name':'UNIT_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0140010view1_sortable).append("}").append(",");
AA0140010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUR_UNIT",rb))).append("', 'name':'CUR_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0140010view1_sortable).append("}").append(",");
AA0140010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROCESSING_COST_2",rb))).append("', 'name':'PROCESSING_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0140010view1_sortable).append("}").append(",");
AA0140010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MATERIAL_COST_2",rb))).append("', 'name':'MATERIAL_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0140010view1_sortable).append("}").append(",");
AA0140010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OTHER_OVERHEADS_2",rb))).append("', 'name':'OTHER_OVERHEADS', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0140010view1_sortable).append("}").append(",");
AA0140010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'w_PLANT_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0140010view1_sortable).append("}").append(",");
%>
<%
 int aAA0140010StructLength = aAA0140010Control.getListsize();
 final AA0140010Struct structBackup = aAA0140010Struct;
 aAA0140010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0140010StructLength; ++loopCount) {
  if((aAA0140010Struct = (AA0140010Struct) aAA0140010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0140010Struct", aAA0140010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0140010view1_DB.append("[");
 AA0140010view1_DB.append(loopCount);
 AA0140010view1_DB.append(",").append("'<span id=\"expj-AA0140010-AA0140010view1-PUCH_PRIORITY_REF_NO-").append(loopCount).append("\" class=\"expj-label expj-AA0140010-AA0140010view1-PUCH_PRIORITY_REF_NO\" data-name=\"PUCH_PRIORITY_REF_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0140010Struct.getPUCH_PRIORITY_REF_NO())).append("</span>'");
 AA0140010view1_DB.append(",").append("'<span id=\"expj-AA0140010-AA0140010view1-VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0140010-AA0140010view1-VEND_CD\" data-name=\"VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0140010Struct.getVEND_CD())).append("</span>'");
 AA0140010view1_DB.append(",").append("'<span id=\"expj-AA0140010-AA0140010view1-VEND_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0140010-AA0140010view1-VEND_NAME\" data-name=\"VEND_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0140010Struct.getVEND_NAME())).append("</span>'");
 AA0140010view1_DB.append(",").append("'<span id=\"expj-AA0140010-AA0140010view1-EFF_PHASE_IN_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0140010-AA0140010view1-EFF_PHASE_IN_DATE\" data-name=\"EFF_PHASE_IN_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD;\">").append(TypeConverter.sanitizer(aAA0140010Struct.getEFF_PHASE_IN_DATE())).append("</span>'");
 AA0140010view1_DB.append(",").append("'<span id=\"expj-AA0140010-AA0140010view1-PUCH_SIZE-").append(loopCount).append("\" class=\"expj-label expj-AA0140010-AA0140010view1-PUCH_SIZE\" data-name=\"PUCH_SIZE\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aAA0140010Struct.getPUCH_SIZE())).append("</span>'");
 AA0140010view1_DB.append(",").append("'<span id=\"expj-AA0140010-AA0140010view1-DISPLAY_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0140010-AA0140010view1-DISPLAY_NAME\" data-name=\"DISPLAY_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0140010Struct.getDISPLAY_NAME())).append("</span>'");
 AA0140010view1_DB.append(",").append("'<span id=\"expj-AA0140010-AA0140010view1-UNIT_COST-").append(loopCount).append("\" class=\"expj-label expj-AA0140010-AA0140010view1-UNIT_COST\" data-name=\"UNIT_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aAA0140010Struct.getUNIT_COST())).append("</span>'");
 AA0140010view1_DB.append(",").append("'<span id=\"expj-AA0140010-AA0140010view1-CUR_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AA0140010-AA0140010view1-CUR_UNIT\" data-name=\"CUR_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0140010Struct.getCUR_UNIT())).append("</span>'");
 AA0140010view1_DB.append(",").append("'<span id=\"expj-AA0140010-AA0140010view1-PROCESSING_COST-").append(loopCount).append("\" class=\"expj-label expj-AA0140010-AA0140010view1-PROCESSING_COST\" data-name=\"PROCESSING_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aAA0140010Struct.getPROCESSING_COST())).append("</span>'");
 AA0140010view1_DB.append(",").append("'<span id=\"expj-AA0140010-AA0140010view1-MATERIAL_COST-").append(loopCount).append("\" class=\"expj-label expj-AA0140010-AA0140010view1-MATERIAL_COST\" data-name=\"MATERIAL_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aAA0140010Struct.getMATERIAL_COST())).append("</span>'");
 AA0140010view1_DB.append(",").append("'<span id=\"expj-AA0140010-AA0140010view1-OTHER_OVERHEADS-").append(loopCount).append("\" class=\"expj-label expj-AA0140010-AA0140010view1-OTHER_OVERHEADS\" data-name=\"OTHER_OVERHEADS\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aAA0140010Struct.getOTHER_OVERHEADS())).append("</span>'");
 AA0140010view1_DB.append(",").append("'<span id=\"expj-AA0140010-AA0140010view1-w_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0140010-AA0140010view1-w_PLANT_CD\" data-name=\"w_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0140010Struct.getw_PLANT_CD())).append("</span>'");
 AA0140010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0140010StructLength) {
   AA0140010view1_DB.append(",");
  }
 }
 aAA0140010Struct = structBackup;
 viewIdList.add(AA0140010view1_Id);
 viewSelectList.add(AA0140010view1_select);
 viewResizeList.add(AA0140010view1_resize);
 viewScrollList.add(AA0140010view1_scroll);
 viewHeaderDataList.add(AA0140010view1_HB);
 viewBodyDataList.add(AA0140010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame01 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02 button-area" style="width:160px;"><script class="expj-script-AA0140010-AA0140010button2">
expj.AA0140010.AA0140010button2 = {};
expj.AA0140010.AA0140010button2.executeAllOnDecision = function () {
  console.log('execute AA0140010button2.onDecision');
};
expj.AA0140010.AA0140010button2.executeOnLoad = function () {
  expj.AA0140010.AA0140010button2.executePScriptOnLoad();
};

expj.AA0140010.AA0140010button2.executePScriptOnLoad = function () {
  console.log('execute AA0140010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0140010-AA0140010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:160px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0140010-AA0140010button2-Button1">
expj.AA0140010.AA0140010button2.Button1 = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AA0140010form1/ITEM_CD,_AA0140010view1/+@AA0040010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AA0140010.AA0140010button2.Button1.onClick0 = function () {
  console.log('Button1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0140010', 'AA0140010button2', '_AA0140010form1/ITEM_CD,_AA0140010view1/+', 'AA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AA0040010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AA0140010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0140010.AA0140010button2.Button1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0140010.AA0140010button2.Button1['onClick' + i])) {
        expj.AA0140010.AA0140010button2.Button1['onClick' + i]();
      }
    }
  }
};
expj.AA0140010.AA0140010button2.Button1.executeAllOnDecision = function () {
};
expj.AA0140010.AA0140010button2.Button1.executeOnLoad = function () {
  $('#expj-AA0140010-AA0140010button2-Button1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0140010', 'AA0140010button2', 'Button1', this, 'Button');
    }
  });
  expj.AA0140010.AA0140010button2.Button1.executePScriptOnLoad();
};

expj.AA0140010.AA0140010button2.Button1.executePScriptOnLoad = function () {
  console.log('execute AA0140010button2/Button1.onLoad');
  var targetComponent = document.getElementById('expj-AA0140010-AA0140010button2-Button1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(160px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0140010-AA0140010button2-Button1" name="Button1" class="AA0140010-focus-move" style="width:160px;"><%=CoreTools.getRBString("Expj.BtnMaintenancePurchUnitCost",rb)%></button><!-- 購入単価メンテナンスボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame03 button-area-right" style="width:60px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0140010 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AA0140010-AA0140010button0">
expj.AA0140010.AA0140010button0 = {};
expj.AA0140010.AA0140010button0.executeAllOnDecision = function () {
  console.log('execute AA0140010button0.onDecision');
};
expj.AA0140010.AA0140010button0.executeOnLoad = function () {
  expj.AA0140010.AA0140010button0.executePScriptOnLoad();
};

expj.AA0140010.AA0140010button0.executePScriptOnLoad = function () {
  console.log('execute AA0140010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0140010-AA0140010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0140010-AA0140010button0-CsvOut">
expj.AA0140010.AA0140010button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0140010form1/*@AA0140010Servlet,,$ZZ07011"
expj.AA0140010.AA0140010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0140010', 'AA0140010button0', '_AA0140010form1/*', 'AA0140010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0140010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0140010', response);
expj.common.updateBusinessScreenTab('AA0140010', contents);
};
expj.common.pscript.callConfirm('AA0140010', 'AA0140010button0', 'ZZ07011', okEvent);
};
expj.AA0140010.AA0140010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0140010.AA0140010button0.CsvOut['onClick' + i])) {
        expj.AA0140010.AA0140010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AA0140010.AA0140010button0.CsvOut.executeAllOnDecision = function () {
};
expj.AA0140010.AA0140010button0.CsvOut.executeOnLoad = function () {
  $('#expj-AA0140010-AA0140010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0140010', 'AA0140010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AA0140010.AA0140010button0.CsvOut.executePScriptOnLoad();
};

expj.AA0140010.AA0140010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AA0140010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AA0140010-AA0140010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0140010-AA0140010button0-CsvOut" name="CsvOut" class="AA0140010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AA0140010-AA0140010button0-Clear">
expj.AA0140010.AA0140010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0140010Servlet,,$ZZ07008"
expj.AA0140010.AA0140010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0140010', 'AA0140010button0', '', 'AA0140010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0140010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0140010', response);
expj.common.updateBusinessScreenTab('AA0140010', contents);
};
expj.common.pscript.callConfirm('AA0140010', 'AA0140010button0', 'ZZ07008', okEvent);
};
expj.AA0140010.AA0140010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0140010.AA0140010button0.Clear['onClick' + i])) {
        expj.AA0140010.AA0140010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AA0140010.AA0140010button0.Clear.executeAllOnDecision = function () {
};
expj.AA0140010.AA0140010button0.Clear.executeOnLoad = function () {
  $('#expj-AA0140010-AA0140010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0140010', 'AA0140010button0', 'Clear', this, 'Button');
    }
  });
  expj.AA0140010.AA0140010button0.Clear.executePScriptOnLoad();
};

expj.AA0140010.AA0140010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AA0140010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0140010-AA0140010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0140010-AA0140010button0-Clear" name="Clear" class="AA0140010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0140010-AA0140010button0-Close">
expj.AA0140010.AA0140010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AA0140010.AA0140010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AA0140010');
};
expj.AA0140010.AA0140010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0140010.AA0140010button0.Close['onClick' + i])) {
        expj.AA0140010.AA0140010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AA0140010.AA0140010button0.Close.executeAllOnDecision = function () {
};
expj.AA0140010.AA0140010button0.Close.executeOnLoad = function () {
  $('#expj-AA0140010-AA0140010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0140010', 'AA0140010button0', 'Close', this, 'Button');
    }
  });
  expj.AA0140010.AA0140010button0.Close.executePScriptOnLoad();
};

expj.AA0140010.AA0140010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AA0140010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AA0140010-AA0140010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0140010-AA0140010button0-Close" name="Close" class="AA0140010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0140010 (END)-->
<%
MessageStruct msgStruct = aAA0140010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0140010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0140010)) {
  expj.common.treeInstanceMap.AA0140010 = {};
}
expj.common.treeInstanceMap.AA0140010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0140010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0140010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0140010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0140010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0140010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0140010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0140010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0140010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0140010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0140010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0140010)) {
  expj.common.detailDialogMap.AA0140010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0140010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0140010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0140010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0140010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0140010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0140010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0140010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0140010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0140010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0140010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0140010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0140010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0140010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0140010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0140010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0140010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0140010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0140010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0140010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0140010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0140010)) {
  expj.common.viewInstanceMap.AA0140010 = {};
}
expj.common.viewInstanceMap.AA0140010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0140010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0140010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0140010.<%=viewId %>.init = function () {
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
    expj.AA0140010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0140010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0140010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0140010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0140010_init">
/**
 * AA0140010用のロード完了時初期化関数
 */
expj.AA0140010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0140010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0140010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0140010');
  expj.common.calendarInstanceMap.AA0140010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0140010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0140010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0140010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0140010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0140010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0140010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0140010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0140010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0140010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0140010.AA0140010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0140010.AA0140010form1.PeekerITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0140010.AA0140010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0140010.AA0140010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AA0140010.AA0140010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AA0140010.AA0140010button2.Button1.executeOnLoad();}catch(e){};
  try{expj.AA0140010.AA0140010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AA0140010.AA0140010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AA0140010.AA0140010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AA0140010.AA0140010form1.executeOnLoad();}catch(e){};
  try{expj.AA0140010.AA0140010button1.executeOnLoad();}catch(e){};
  try{expj.AA0140010.AA0140010view1.executeOnLoad();}catch(e){};
  try{expj.AA0140010.AA0140010button2.executeOnLoad();}catch(e){};
  try{expj.AA0140010.AA0140010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0140010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0140010', 'AA0140010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0140010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0140010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0140010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0140010', '<%=request.getContextPath() %>');
};

/**
 * AA0140010の全体onDecision処理
 */
expj.AA0140010.executeAllOnDecision = function () {
  expj.AA0140010.AA0140010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0140010_console">
expj.AA0140010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>