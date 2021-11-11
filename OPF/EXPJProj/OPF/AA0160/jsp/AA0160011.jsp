<%-- ***
This file is generated
 GeneratedDate  : Thu Feb 16 17:45:30 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0160\AA0160011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0160.*" %>
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
<jsp:useBean id="aAA0160010Control" class="com.nec.jp.orteus.metamorBase.AA0160.AA0160010Control" scope="request"/>
<jsp:useBean id="aAA0160010Struct" class="com.nec.jp.orteus.metamorBase.AA0160.AA0160010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

製品構成データ取込処理サブ1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0160/jsp/AA0160011.jsp,v $
$Author: geng-jia $
$Revision: 1.6 $ $Date: 2017/02/22 02:04:09 $
********************************************************* --%>
<html>
<head>
<title>製品構成データ取込処理サブ1</title>
<%@include file="common/expj_v5.jsp" %>
<%@include file="common/upload.jsp" %>

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
<script class="expj-script-AA0160010_init">
  // AA0160010名前空間
  expj.AA0160010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AA0160010" data-screen="AA0160011" data-newdata="<%=aAA0160010Control.isNewData() %>">
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
              <script class="expj-script-AA0160010-AA0160011form1">
expj.AA0160010.AA0160011form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AA0160010.AA0160011form1.onLoad0 = function () {
  console.log('AA0160011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AA0160010.AA0160011form1.onDecision0 = function () {
  console.log('AA0160011form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0160010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AA0160011button1/CsvIn"
expj.AA0160010.AA0160011form1.child0 = function () {
  console.log('AA0160011form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0160010', 'AA0160011form1', '_AA0160011button1/CsvIn');
};
// script4="child;1;MASK;_AA0160011button1/CsvIn"
expj.AA0160010.AA0160011form1.child1 = function () {
  console.log('AA0160011form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0160010', 'AA0160011form1', '_AA0160011button1/CsvIn');
};
expj.AA0160010.AA0160011form1.executeAllOnDecision = function () {
  console.log('execute AA0160011form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0160010.AA0160011form1['onDecision' + i])) {
        expj.AA0160010.AA0160011form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0160010.AA0160011form1.executeOnLoad = function () {
  expj.AA0160010.AA0160011form1.executePScriptOnLoad();
};

expj.AA0160010.AA0160011form1.executePScriptOnLoad = function () {
  console.log('execute AA0160011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0160010.AA0160011form1['onLoad' + i])) {
      expj.AA0160010.AA0160011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0160010-AA0160011form1" action="AA0160010Servlet" name="AA0160011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
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
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0046",rb)%></span><!-- 取込ファイル --></div><!--/td-->
<script class="expj-script-AA0160010-AA0160011form1-FileName">
expj.AA0160010.AA0160011form1.FileName = {};
expj.AA0160010.AA0160011form1.FileName.executeAllOnDecision = function () {
  console.log('execute AA0160011form1/FileName.onDecision');
  expj.AA0160010.AA0160011form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160011form1.FileName.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160011form1-FileName').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160011form1', 'FileName', this);
  });
  expj.AA0160010.AA0160011form1.FileName.executePScriptOnLoad();
};

expj.AA0160010.AA0160011form1.FileName.executePScriptOnLoad = function () {
  console.log('execute AA0160011form1/FileName.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160011form1-FileName');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AA0160010-AA0160011form1-FileName" name="FileName" class="AA0160010-focus-move  required-value expj-AA0160010-required-A" style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0160010Struct.getFileName()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160011form1-CANCEL_FILE" name="CANCEL_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.getCANCEL_FILE()) %>">
<script class="expj-script-AA0160010-AA0160011form1-CANCEL_FILE">
expj.AA0160010.AA0160011form1.CANCEL_FILE = {};
expj.AA0160010.AA0160011form1.CANCEL_FILE.executeAllOnDecision = function () {
  console.log('execute AA0160011form1/CANCEL_FILE.onDecision');
  expj.AA0160010.AA0160011form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160011form1.CANCEL_FILE.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160011form1-CANCEL_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160011form1', 'CANCEL_FILE', this);
  });
  expj.AA0160010.AA0160011form1.CANCEL_FILE.executePScriptOnLoad();
};

expj.AA0160010.AA0160011form1.CANCEL_FILE.executePScriptOnLoad = function () {
  console.log('execute AA0160011form1/CANCEL_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160011form1-CANCEL_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AA0160010-AA0160011form1-JUDGMENT_TXT" name="JUDGMENT_TXT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.getJUDGMENT_TXT()) %>">
<script class="expj-script-AA0160010-AA0160011form1-JUDGMENT_TXT">
expj.AA0160010.AA0160011form1.JUDGMENT_TXT = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AA0160010.AA0160011form1.JUDGMENT_TXT.onLoad0 = function () {
  console.log('JUDGMENT_TXT script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;~LEN(_AA0160011form1/JUDGMENT_TXT)[eq]0@*0,*1"
expj.AA0160010.AA0160011form1.JUDGMENT_TXT.onDecision0 = function () {
  console.log('JUDGMENT_TXT script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AA0160010', 'AA0160011form1', '_AA0160011form1/JUDGMENT_TXT'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;MASK;_AA0160011button0/CsvOut"
expj.AA0160010.AA0160011form1.JUDGMENT_TXT.child0 = function () {
  console.log('JUDGMENT_TXT script3');
expj.common.pscript.setMaskToReferenceComponent('AA0160010', 'AA0160011form1', '_AA0160011button0/CsvOut');
};
// script4="child;1;UNMASK;_AA0160011button0/CsvOut"
expj.AA0160010.AA0160011form1.JUDGMENT_TXT.child1 = function () {
  console.log('JUDGMENT_TXT script4');
expj.common.pscript.setUnMaskToReferenceComponent('AA0160010', 'AA0160011form1', '_AA0160011button0/CsvOut');
};
expj.AA0160010.AA0160011form1.JUDGMENT_TXT.executeAllOnDecision = function () {
  console.log('execute AA0160011form1/JUDGMENT_TXT.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0160010.AA0160011form1.JUDGMENT_TXT['onDecision' + i])) {
        expj.AA0160010.AA0160011form1.JUDGMENT_TXT['onDecision' + i]();
      }
    }
  }
  expj.AA0160010.AA0160011form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160011form1.JUDGMENT_TXT.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160011form1-JUDGMENT_TXT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160011form1', 'JUDGMENT_TXT', this);
  });
  expj.AA0160010.AA0160011form1.JUDGMENT_TXT.executePScriptOnLoad();
};

expj.AA0160010.AA0160011form1.JUDGMENT_TXT.executePScriptOnLoad = function () {
  console.log('execute AA0160011form1/JUDGMENT_TXT.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160011form1-JUDGMENT_TXT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0160010.AA0160011form1.JUDGMENT_TXT['onLoad' + i])) {
      expj.AA0160010.AA0160011form1.JUDGMENT_TXT['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AA0160010-AA0160011form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AA0160010-AA0160011form1-DOWNLOAD_FILE">
expj.AA0160010.AA0160011form1.DOWNLOAD_FILE = {};
expj.AA0160010.AA0160011form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AA0160011form1/DOWNLOAD_FILE.onDecision');
  expj.AA0160010.AA0160011form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160011form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160011form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160011form1', 'DOWNLOAD_FILE', this);
  });
  expj.AA0160010.AA0160011form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AA0160010.AA0160011form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AA0160011form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160011form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- 1段目のDataGrid配置↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AA0160010-AA0160011button1">
expj.AA0160010.AA0160011button1 = {};
expj.AA0160010.AA0160011button1.executeAllOnDecision = function () {
  console.log('execute AA0160011button1.onDecision');
};
expj.AA0160010.AA0160011button1.executeOnLoad = function () {
  expj.AA0160010.AA0160011button1.executePScriptOnLoad();
};

expj.AA0160010.AA0160011button1.executePScriptOnLoad = function () {
  console.log('execute AA0160011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0160010-AA0160011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0160010-AA0160011button1-Browse">
expj.AA0160010.AA0160011button1.Browse = {};
// script1="onClick;0;FILEDLG;_AA0160011form1/FileName"
expj.AA0160010.AA0160011button1.Browse.onClick0 = function () {
  console.log('Browse script1');
expj.common.pscript.openFileDialog('AA0160010', 'AA0160011button1', '_AA0160011form1/FileName');
};
expj.AA0160010.AA0160011button1.Browse.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0160010.AA0160011button1.Browse['onClick' + i])) {
        expj.AA0160010.AA0160011button1.Browse['onClick' + i]();
      }
    }
  }
};
expj.AA0160010.AA0160011button1.Browse.executeAllOnDecision = function () {
};
expj.AA0160010.AA0160011button1.Browse.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160011button1-Browse').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0160010', 'AA0160011button1', 'Browse', this, 'Button');
    }
  });
  expj.AA0160010.AA0160011button1.Browse.executePScriptOnLoad();
};

expj.AA0160010.AA0160011button1.Browse.executePScriptOnLoad = function () {
  console.log('execute AA0160011button1/Browse.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160011button1-Browse');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0160010-AA0160011button1-Browse" name="Browse" class="AA0160010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnBrowse",rb)%></button><!-- 参照ボタン --></div><!--/td-->
<script class="expj-script-AA0160010-AA0160011button1-CsvIn">
expj.AA0160010.AA0160011button1.CsvIn = {};
// script1="onClick;0;FILEUPLOAD;AA0160010Servlet"
expj.AA0160010.AA0160011button1.CsvIn.onClick0 = function () {
  console.log('CsvIn script1');
expj.common.pscript.executeFileUpload('AA0160010', 'AA0160011button1', 'AA0160010Servlet');
};
expj.AA0160010.AA0160011button1.CsvIn.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0160010.AA0160011button1.CsvIn['onClick' + i])) {
        expj.AA0160010.AA0160011button1.CsvIn['onClick' + i]();
      }
    }
  }
};
expj.AA0160010.AA0160011button1.CsvIn.executeAllOnDecision = function () {
};
expj.AA0160010.AA0160011button1.CsvIn.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160011button1-CsvIn').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0160010', 'AA0160011button1', 'CsvIn', this, 'Button');
    }
  });
  expj.AA0160010.AA0160011button1.CsvIn.executePScriptOnLoad();
};

expj.AA0160010.AA0160011button1.CsvIn.executePScriptOnLoad = function () {
  console.log('execute AA0160011button1/CsvIn.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160011button1-CsvIn');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0160010-AA0160011button1-CsvIn" name="CsvIn" class="AA0160010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvIn",rb)%></button><!-- 取込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- 2段目のDataGrid配置↓ --><script class="expj-script-AA0160010-AA0160011view1">
expj.AA0160010.AA0160011view1 = {};
expj.AA0160010.AA0160011view1.executeAllOnClick = function () {
};
expj.AA0160010.AA0160011view1.executeAllOnDecision = function () {
  console.log('execute AA0160011view1.onDecision');
};
expj.AA0160010.AA0160011view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0160011view1", "expj.AA0160010.AA0160011view1.executeAllOnClick");
%>
  expj.AA0160010.AA0160011view1.executePScriptOnLoad();
};

expj.AA0160010.AA0160011view1.executePScriptOnLoad = function () {
  console.log('execute AA0160011view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0160010-AA0160011view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0160011view1_Id = "AA0160011view1";
 String AA0160011view1_select = "single";
 String AA0160011view1_sortable = "true";
 String AA0160011view1_resize = "true";
 String AA0160011view1_scroll = "true";
 StringBuffer AA0160011view1_HB = new StringBuffer();
 StringBuffer AA0160011view1_DB = new StringBuffer();
%>
<%
 AA0160011view1_select = "none";
 AA0160011view1_sortable = "true";
 AA0160011view1_resize = "true";
 AA0160011view1_scroll = "true";
%>
<%
 AA0160011view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0160011view1_sortable).append("}").append(",");
%>
     
<%
AA0160011view1_HB.append("{'visible':true, 'type':'string', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3094",rb))).append("', 'name':'ERROR_IN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0160011view1_sortable).append("}").append(",");
AA0160011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PARENT_ITEM_CD",rb))).append("', 'name':'PARENT_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0160011view1_sortable).append("}").append(",");
AA0160011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.COMP_ITEM_CD",rb))).append("', 'name':'COMP_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0160011view1_sortable).append("}").append(",");
AA0160011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_EDITION",rb))).append("', 'name':'PS_EDITION', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0160011view1_sortable).append("}").append(",");
AA0160011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3097",rb))).append("', 'name':'ERR_CTR_NM', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0160011view1_sortable).append("}").append(",");
AA0160011view1_HB.append("{'visible':true, 'type':'string', 'width':'387px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3098",rb))).append("', 'name':'ERR_INFO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0160011view1_sortable).append("}").append(",");
%>
<%
 int aAA0160010StructLength = aAA0160010Control.getListsize();
 final AA0160010Struct structBackup = aAA0160010Struct;
 aAA0160010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0160010StructLength; ++loopCount) {
  if((aAA0160010Struct = (AA0160010Struct) aAA0160010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0160010Struct", aAA0160010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0160011view1_DB.append("[");
 AA0160011view1_DB.append(loopCount);
 AA0160011view1_DB.append(",").append("'<span id=\"expj-AA0160010-AA0160011view1-ERROR_IN-").append(loopCount).append("\" class=\"expj-label expj-AA0160010-AA0160011view1-ERROR_IN\" data-name=\"ERROR_IN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0160010Struct.getERROR_IN())).append("</span>'");
 AA0160011view1_DB.append(",").append("'<span id=\"expj-AA0160010-AA0160011view1-PARENT_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0160010-AA0160011view1-PARENT_ITEM_CD\" data-name=\"PARENT_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0160010Struct.getPARENT_ITEM_CD())).append("</span>'");
 AA0160011view1_DB.append(",").append("'<span id=\"expj-AA0160010-AA0160011view1-COMP_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0160010-AA0160011view1-COMP_ITEM_CD\" data-name=\"COMP_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0160010Struct.getCOMP_ITEM_CD())).append("</span>'");
 AA0160011view1_DB.append(",").append("'<span id=\"expj-AA0160010-AA0160011view1-PS_EDITION-").append(loopCount).append("\" class=\"expj-label expj-AA0160010-AA0160011view1-PS_EDITION\" data-name=\"PS_EDITION\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0160010Struct.getPS_EDITION())).append("</span>'");
 AA0160011view1_DB.append(",").append("'<span id=\"expj-AA0160010-AA0160011view1-ERR_CTR_NM-").append(loopCount).append("\" class=\"expj-label expj-AA0160010-AA0160011view1-ERR_CTR_NM\" data-name=\"ERR_CTR_NM\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0160010Struct.getERR_CTR_NM())).append("</span>'");
 AA0160011view1_DB.append(",").append("'<span id=\"expj-AA0160010-AA0160011view1-ERR_INFO-").append(loopCount).append("\" class=\"expj-label expj-AA0160010-AA0160011view1-ERR_INFO\" data-name=\"ERR_INFO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0160010Struct.getERR_INFO())).append("</span>'");
 AA0160011view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0160010StructLength) {
   AA0160011view1_DB.append(",");
  }
 }
 aAA0160010Struct = structBackup;
 viewIdList.add(AA0160011view1_Id);
 viewSelectList.add(AA0160011view1_select);
 viewResizeList.add(AA0160011view1_resize);
 viewScrollList.add(AA0160011view1_scroll);
 viewHeaderDataList.add(AA0160011view1_HB);
 viewBodyDataList.add(AA0160011view1_DB);
%>
<%
}
%>
<!-- 2段目のDataGrid配置↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"></div><!--/td-->
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
<span class="version">AA0160011 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0160010-AA0160011button0">
expj.AA0160010.AA0160011button0 = {};
expj.AA0160010.AA0160011button0.executeAllOnDecision = function () {
  console.log('execute AA0160011button0.onDecision');
};
expj.AA0160010.AA0160011button0.executeOnLoad = function () {
  expj.AA0160010.AA0160011button0.executePScriptOnLoad();
};

expj.AA0160010.AA0160011button0.executePScriptOnLoad = function () {
  console.log('execute AA0160011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0160010-AA0160011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0160010-AA0160011button0-CsvOut">
expj.AA0160010.AA0160011button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0160011form1/*,_AA0160011view1/*@AA0160010Servlet,,$ZZ07011"
expj.AA0160010.AA0160011button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0160010', 'AA0160011button0', '_AA0160011form1/*,_AA0160011view1/*', 'AA0160010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0160010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0160010', response);
expj.common.updateBusinessScreenTab('AA0160010', contents);
};
expj.common.pscript.callConfirm('AA0160010', 'AA0160011button0', 'ZZ07011', okEvent);
};
expj.AA0160010.AA0160011button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0160010.AA0160011button0.CsvOut['onClick' + i])) {
        expj.AA0160010.AA0160011button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AA0160010.AA0160011button0.CsvOut.executeAllOnDecision = function () {
};
expj.AA0160010.AA0160011button0.CsvOut.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160011button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0160010', 'AA0160011button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AA0160010.AA0160011button0.CsvOut.executePScriptOnLoad();
};

expj.AA0160010.AA0160011button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AA0160011button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160011button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0160010-AA0160011button0-CsvOut" name="CsvOut" class="AA0160010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AA0160010-AA0160011button0-return_sub1">
expj.AA0160010.AA0160011button0.return_sub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0160010form1/*@AA0160010Servlet,,$ZZ07013"
expj.AA0160010.AA0160011button0.return_sub1.onClick0 = function () {
  console.log('return_sub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0160010', 'AA0160011button0', '_AA0160010form1/*', 'AA0160010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0160010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0160010', response);
expj.common.changeBusinessScreenTab('AA0160010', contents);
};
expj.common.pscript.callConfirm('AA0160010', 'AA0160011button0', 'ZZ07013', okEvent);
};
expj.AA0160010.AA0160011button0.return_sub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0160010.AA0160011button0.return_sub1['onClick' + i])) {
        expj.AA0160010.AA0160011button0.return_sub1['onClick' + i]();
      }
    }
  }
};
expj.AA0160010.AA0160011button0.return_sub1.executeAllOnDecision = function () {
};
expj.AA0160010.AA0160011button0.return_sub1.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160011button0-return_sub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0160010', 'AA0160011button0', 'return_sub1', this, 'Button');
    }
  });
  expj.AA0160010.AA0160011button0.return_sub1.executePScriptOnLoad();
};

expj.AA0160010.AA0160011button0.return_sub1.executePScriptOnLoad = function () {
  console.log('execute AA0160011button0/return_sub1.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160011button0-return_sub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0160010-AA0160011button0-return_sub1" name="return_sub1" class="AA0160010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0160010 (END)-->
<%
MessageStruct msgStruct = aAA0160010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0160010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0160010)) {
  expj.common.treeInstanceMap.AA0160010 = {};
}
expj.common.treeInstanceMap.AA0160010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0160010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0160010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0160010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0160010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0160010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0160010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0160010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0160010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0160010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0160010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0160010)) {
  expj.common.detailDialogMap.AA0160010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0160010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0160010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0160010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0160010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0160010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0160010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0160010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0160010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0160010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0160010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0160010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0160010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0160010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0160010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0160010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0160010)) {
  expj.common.viewInstanceMap.AA0160010 = {};
}
expj.common.viewInstanceMap.AA0160010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0160010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0160010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0160010.<%=viewId %>.init = function () {
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
    expj.AA0160010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0160010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0160010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0160010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0160010_init">
/**
 * AA0160010用のロード完了時初期化関数
 */
expj.AA0160010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0160010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0160010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0160010');
  expj.common.calendarInstanceMap.AA0160010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0160010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0160010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0160010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0160010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0160010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0160010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0160010.AA0160011form1.FileName.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160011form1.CANCEL_FILE.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160011form1.JUDGMENT_TXT.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160011form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160011button1.Browse.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160011button1.CsvIn.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160011button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160011button0.return_sub1.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160011form1.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160011button1.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160011view1.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0160010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0160010', 'AA0160010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0160010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0160010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0160010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0160010', '<%=request.getContextPath() %>');
};

/**
 * AA0160010の全体onDecision処理
 */
expj.AA0160010.executeAllOnDecision = function () {
  expj.AA0160010.AA0160011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0160010_console">
expj.AA0160010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>