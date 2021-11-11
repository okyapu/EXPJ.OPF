<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:26:02 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0200\AA0200011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0200.*" %>
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
<jsp:useBean id="aAA0200010Control" class="com.nec.jp.orteus.metamorBase.AA0200.AA0200010Control" scope="request"/>
<jsp:useBean id="aAA0200010Struct" class="com.nec.jp.orteus.metamorBase.AA0200.AA0200010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

利用者データ取込処理サブ
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0200/jsp/AA0200011.jsp,v $
$Author: geng-jia $	
$Revision: 1.3 $　$Date: 2017/02/22 02:04:17 $
********************************************************* --%>
<html>
<head>
<title>利用者データ取込処理サブ</title>
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
<script class="expj-script-AA0200010_init">
  // AA0200010名前空間
  expj.AA0200010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AA0200010" data-screen="AA0200011" data-newdata="<%=aAA0200010Control.isNewData() %>">
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
              <script class="expj-script-AA0200010-AA0200011form1">
expj.AA0200010.AA0200011form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AA0200010.AA0200011form1.onLoad0 = function () {
  console.log('AA0200011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AA0200010.AA0200011form1.onDecision0 = function () {
  console.log('AA0200011form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0200010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onDecision;1;CHK;?AA0200011view/$[eq]0@*2,*3"
expj.AA0200010.AA0200011form1.onDecision1 = function () {
  console.log('AA0200011form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0200010', 'AA0200011form1', '?AA0200011view/$'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;0;UNMASK;_AA0200011button1/CsvIn"
expj.AA0200010.AA0200011form1.child0 = function () {
  console.log('AA0200011form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AA0200010', 'AA0200011form1', '_AA0200011button1/CsvIn');
};
// script5="child;1;MASK;_AA0200011button1/CsvIn"
expj.AA0200010.AA0200011form1.child1 = function () {
  console.log('AA0200011form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AA0200010', 'AA0200011form1', '_AA0200011button1/CsvIn');
};
// script6="child;2;MASK;_AA0200011button0/CSVOut"
expj.AA0200010.AA0200011form1.child2 = function () {
  console.log('AA0200011form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AA0200010', 'AA0200011form1', '_AA0200011button0/CSVOut');
};
// script7="child;3;UNMASK;_AA0200011button0/CSVOut"
expj.AA0200010.AA0200011form1.child3 = function () {
  console.log('AA0200011form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AA0200010', 'AA0200011form1', '_AA0200011button0/CSVOut');
};
expj.AA0200010.AA0200011form1.executeAllOnDecision = function () {
  console.log('execute AA0200011form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0200010.AA0200011form1['onDecision' + i])) {
        expj.AA0200010.AA0200011form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0200010.AA0200011form1.executeOnLoad = function () {
  expj.AA0200010.AA0200011form1.executePScriptOnLoad();
};

expj.AA0200010.AA0200011form1.executePScriptOnLoad = function () {
  console.log('execute AA0200011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0200010.AA0200011form1['onLoad' + i])) {
      expj.AA0200010.AA0200011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0200010-AA0200011form1" action="AA0200010Servlet" name="AA0200011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0200010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<script class="expj-script-AA0200010-AA0200011form1-FileName">
expj.AA0200010.AA0200011form1.FileName = {};
expj.AA0200010.AA0200011form1.FileName.executeAllOnDecision = function () {
  console.log('execute AA0200011form1/FileName.onDecision');
  expj.AA0200010.AA0200011form1.executeAllOnDecision();
  expj.AA0200010.executeAllOnDecision();
};
expj.AA0200010.AA0200011form1.FileName.executeOnLoad = function () {
  $('#expj-AA0200010-AA0200011form1-FileName').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0200010', 'AA0200011form1', 'FileName', this);
  });
  expj.AA0200010.AA0200011form1.FileName.executePScriptOnLoad();
};

expj.AA0200010.AA0200011form1.FileName.executePScriptOnLoad = function () {
  console.log('execute AA0200011form1/FileName.onLoad');
  var targetComponent = document.getElementById('expj-AA0200010-AA0200011form1-FileName');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AA0200010-AA0200011form1-FileName" name="FileName" class="AA0200010-focus-move  required-value expj-AA0200010-required-A" style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0200010Struct.getFileName()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0200010-AA0200011form1-CANCEL_FILE" name="CANCEL_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0200010Struct.getCANCEL_FILE()) %>">
<script class="expj-script-AA0200010-AA0200011form1-CANCEL_FILE">
expj.AA0200010.AA0200011form1.CANCEL_FILE = {};
expj.AA0200010.AA0200011form1.CANCEL_FILE.executeAllOnDecision = function () {
  console.log('execute AA0200011form1/CANCEL_FILE.onDecision');
  expj.AA0200010.AA0200011form1.executeAllOnDecision();
  expj.AA0200010.executeAllOnDecision();
};
expj.AA0200010.AA0200011form1.CANCEL_FILE.executeOnLoad = function () {
  $('#expj-AA0200010-AA0200011form1-CANCEL_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0200010', 'AA0200011form1', 'CANCEL_FILE', this);
  });
  expj.AA0200010.AA0200011form1.CANCEL_FILE.executePScriptOnLoad();
};

expj.AA0200010.AA0200011form1.CANCEL_FILE.executePScriptOnLoad = function () {
  console.log('execute AA0200011form1/CANCEL_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AA0200010-AA0200011form1-CANCEL_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AA0200010-AA0200011form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0200010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AA0200010-AA0200011form1-DOWNLOAD_FILE">
expj.AA0200010.AA0200011form1.DOWNLOAD_FILE = {};
expj.AA0200010.AA0200011form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AA0200011form1/DOWNLOAD_FILE.onDecision');
  expj.AA0200010.AA0200011form1.executeAllOnDecision();
  expj.AA0200010.executeAllOnDecision();
};
expj.AA0200010.AA0200011form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AA0200010-AA0200011form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0200010', 'AA0200011form1', 'DOWNLOAD_FILE', this);
  });
  expj.AA0200010.AA0200011form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AA0200010.AA0200011form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AA0200011form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AA0200010-AA0200011form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AA0200010-AA0200011button1">
expj.AA0200010.AA0200011button1 = {};
expj.AA0200010.AA0200011button1.executeAllOnDecision = function () {
  console.log('execute AA0200011button1.onDecision');
};
expj.AA0200010.AA0200011button1.executeOnLoad = function () {
  expj.AA0200010.AA0200011button1.executePScriptOnLoad();
};

expj.AA0200010.AA0200011button1.executePScriptOnLoad = function () {
  console.log('execute AA0200011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0200010-AA0200011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0200010-AA0200011button1-Browse">
expj.AA0200010.AA0200011button1.Browse = {};
// script1="onClick;0;FILEDLG;_AA0200011form1/FileName"
expj.AA0200010.AA0200011button1.Browse.onClick0 = function () {
  console.log('Browse script1');
expj.common.pscript.openFileDialog('AA0200010', 'AA0200011button1', '_AA0200011form1/FileName');
};
expj.AA0200010.AA0200011button1.Browse.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0200010.AA0200011button1.Browse['onClick' + i])) {
        expj.AA0200010.AA0200011button1.Browse['onClick' + i]();
      }
    }
  }
};
expj.AA0200010.AA0200011button1.Browse.executeAllOnDecision = function () {
};
expj.AA0200010.AA0200011button1.Browse.executeOnLoad = function () {
  $('#expj-AA0200010-AA0200011button1-Browse').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0200010', 'AA0200011button1', 'Browse', this, 'Button');
    }
  });
  expj.AA0200010.AA0200011button1.Browse.executePScriptOnLoad();
};

expj.AA0200010.AA0200011button1.Browse.executePScriptOnLoad = function () {
  console.log('execute AA0200011button1/Browse.onLoad');
  var targetComponent = document.getElementById('expj-AA0200010-AA0200011button1-Browse');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0200010-AA0200011button1-Browse" name="Browse" class="AA0200010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnBrowse",rb)%></button><!-- 参照ボタン --></div><!--/td-->
<script class="expj-script-AA0200010-AA0200011button1-CsvIn">
expj.AA0200010.AA0200011button1.CsvIn = {};
// script1="onClick;0;FILEUPLOAD;AA0200010Servlet"
expj.AA0200010.AA0200011button1.CsvIn.onClick0 = function () {
  console.log('CsvIn script1');
expj.common.pscript.executeFileUpload('AA0200010', 'AA0200011button1', 'AA0200010Servlet');
};
expj.AA0200010.AA0200011button1.CsvIn.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0200010.AA0200011button1.CsvIn['onClick' + i])) {
        expj.AA0200010.AA0200011button1.CsvIn['onClick' + i]();
      }
    }
  }
};
expj.AA0200010.AA0200011button1.CsvIn.executeAllOnDecision = function () {
};
expj.AA0200010.AA0200011button1.CsvIn.executeOnLoad = function () {
  $('#expj-AA0200010-AA0200011button1-CsvIn').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0200010', 'AA0200011button1', 'CsvIn', this, 'Button');
    }
  });
  expj.AA0200010.AA0200011button1.CsvIn.executePScriptOnLoad();
};

expj.AA0200010.AA0200011button1.CsvIn.executePScriptOnLoad = function () {
  console.log('execute AA0200011button1/CsvIn.onLoad');
  var targetComponent = document.getElementById('expj-AA0200010-AA0200011button1-CsvIn');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0200010-AA0200011button1-CsvIn" name="CsvIn" class="AA0200010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvIn",rb)%></button><!-- 取込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AA0200010-AA0200011view">
expj.AA0200010.AA0200011view = {};
expj.AA0200010.AA0200011view.executeAllOnClick = function () {
};
expj.AA0200010.AA0200011view.executeAllOnDecision = function () {
  console.log('execute AA0200011view.onDecision');
};
expj.AA0200010.AA0200011view.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0200011view", "expj.AA0200010.AA0200011view.executeAllOnClick");
%>
  expj.AA0200010.AA0200011view.executePScriptOnLoad();
};

expj.AA0200010.AA0200011view.executePScriptOnLoad = function () {
  console.log('execute AA0200011view.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0200010-AA0200011view" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aAA0200010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String AA0200011view_Id = "AA0200011view";
 String AA0200011view_select = "single";
 String AA0200011view_sortable = "true";
 String AA0200011view_resize = "true";
 String AA0200011view_scroll = "true";
 StringBuffer AA0200011view_HB = new StringBuffer();
 StringBuffer AA0200011view_DB = new StringBuffer();
%>
<%
 AA0200011view_select = "none";
 AA0200011view_sortable = "true";
 AA0200011view_resize = "true";
 AA0200011view_scroll = "true";
%>
<%
 AA0200011view_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0200011view_sortable).append("}").append(",");
%>
     
<%
AA0200011view_HB.append("{'visible':true, 'type':'string', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3094",rb))).append("', 'name':'l_ERROR_IN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0200011view_sortable).append("}").append(",");
AA0200011view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3095",rb))).append("', 'name':'l_ERR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0200011view_sortable).append("}").append(",");
AA0200011view_HB.append("{'visible':true, 'type':'string', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.AR_USER_CD",rb))).append("', 'name':'l_USER_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0200011view_sortable).append("}").append(",");
AA0200011view_HB.append("{'visible':true, 'type':'string', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3097",rb))).append("', 'name':'l_ERR_CTR_NM', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0200011view_sortable).append("}").append(",");
AA0200011view_HB.append("{'visible':true, 'type':'string', 'width':'447px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3098",rb))).append("', 'name':'l_ERR_INFO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0200011view_sortable).append("}").append(",");
%>
<%
 int aAA0200010StructLength = aAA0200010Control.getListsize();
 final AA0200010Struct structBackup = aAA0200010Struct;
 aAA0200010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0200010StructLength; ++loopCount) {
  if((aAA0200010Struct = (AA0200010Struct) aAA0200010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0200010Struct", aAA0200010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0200011view_DB.append("[");
 AA0200011view_DB.append(loopCount);
 AA0200011view_DB.append(",").append("'<span id=\"expj-AA0200010-AA0200011view-l_ERROR_IN-").append(loopCount).append("\" class=\"expj-label expj-AA0200010-AA0200011view-l_ERROR_IN\" data-name=\"l_ERROR_IN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0200010Struct.getl_ERROR_IN())).append("</span>'");
 AA0200011view_DB.append(",").append("'<span id=\"expj-AA0200010-AA0200011view-l_ERR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0200010-AA0200011view-l_ERR_TYP\" data-name=\"l_ERR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0200010Struct.getl_ERR_TYP())).append("</span>'");
 AA0200011view_DB.append(",").append("'<span id=\"expj-AA0200010-AA0200011view-l_USER_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0200010-AA0200011view-l_USER_CD\" data-name=\"l_USER_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0200010Struct.getl_USER_CD())).append("</span>'");
 AA0200011view_DB.append(",").append("'<span id=\"expj-AA0200010-AA0200011view-l_ERR_CTR_NM-").append(loopCount).append("\" class=\"expj-label expj-AA0200010-AA0200011view-l_ERR_CTR_NM\" data-name=\"l_ERR_CTR_NM\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0200010Struct.getl_ERR_CTR_NM())).append("</span>'");
 AA0200011view_DB.append(",").append("'<span id=\"expj-AA0200010-AA0200011view-l_ERR_INFO-").append(loopCount).append("\" class=\"expj-label expj-AA0200010-AA0200011view-l_ERR_INFO\" data-name=\"l_ERR_INFO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0200010Struct.getl_ERR_INFO())).append("</span>'");
 AA0200011view_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0200010StructLength) {
   AA0200011view_DB.append(",");
  }
 }
 aAA0200010Struct = structBackup;
 viewIdList.add(AA0200011view_Id);
 viewSelectList.add(AA0200011view_select);
 viewResizeList.add(AA0200011view_resize);
 viewScrollList.add(AA0200011view_scroll);
 viewHeaderDataList.add(AA0200011view_HB);
 viewBodyDataList.add(AA0200011view_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0200011 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0200010-AA0200011button0">
expj.AA0200010.AA0200011button0 = {};
expj.AA0200010.AA0200011button0.executeAllOnDecision = function () {
  console.log('execute AA0200011button0.onDecision');
};
expj.AA0200010.AA0200011button0.executeOnLoad = function () {
  expj.AA0200010.AA0200011button0.executePScriptOnLoad();
};

expj.AA0200010.AA0200011button0.executePScriptOnLoad = function () {
  console.log('execute AA0200011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0200010-AA0200011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0200010-AA0200011button0-CSVOut">
expj.AA0200010.AA0200011button0.CSVOut = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0200011view/*@AA0200010Servlet,,$ZZ07011"
expj.AA0200010.AA0200011button0.CSVOut.onClick0 = function () {
  console.log('CSVOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0200010', 'AA0200011button0', '_AA0200011view/*', 'AA0200010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0200010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0200010', response);
expj.common.changeBusinessScreenTab('AA0200010', contents);
};
expj.common.pscript.callConfirm('AA0200010', 'AA0200011button0', 'ZZ07011', okEvent);
};
expj.AA0200010.AA0200011button0.CSVOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0200010.AA0200011button0.CSVOut['onClick' + i])) {
        expj.AA0200010.AA0200011button0.CSVOut['onClick' + i]();
      }
    }
  }
};
expj.AA0200010.AA0200011button0.CSVOut.executeAllOnDecision = function () {
};
expj.AA0200010.AA0200011button0.CSVOut.executeOnLoad = function () {
  $('#expj-AA0200010-AA0200011button0-CSVOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0200010', 'AA0200011button0', 'CSVOut', this, 'Button');
    }
  });
  expj.AA0200010.AA0200011button0.CSVOut.executePScriptOnLoad();
};

expj.AA0200010.AA0200011button0.CSVOut.executePScriptOnLoad = function () {
  console.log('execute AA0200011button0/CSVOut.onLoad');
  var targetComponent = document.getElementById('expj-AA0200010-AA0200011button0-CSVOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0200010-AA0200011button0-CSVOut" name="CSVOut" class="AA0200010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AA0200010-AA0200011button0-return_sub1">
expj.AA0200010.AA0200011button0.return_sub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0200011form1/*@AA0200010Servlet,,$ZZ07013"
expj.AA0200010.AA0200011button0.return_sub1.onClick0 = function () {
  console.log('return_sub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0200010', 'AA0200011button0', '_AA0200011form1/*', 'AA0200010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0200010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0200010', response);
expj.common.changeBusinessScreenTab('AA0200010', contents);
};
expj.common.pscript.callConfirm('AA0200010', 'AA0200011button0', 'ZZ07013', okEvent);
};
expj.AA0200010.AA0200011button0.return_sub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0200010.AA0200011button0.return_sub1['onClick' + i])) {
        expj.AA0200010.AA0200011button0.return_sub1['onClick' + i]();
      }
    }
  }
};
expj.AA0200010.AA0200011button0.return_sub1.executeAllOnDecision = function () {
};
expj.AA0200010.AA0200011button0.return_sub1.executeOnLoad = function () {
  $('#expj-AA0200010-AA0200011button0-return_sub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0200010', 'AA0200011button0', 'return_sub1', this, 'Button');
    }
  });
  expj.AA0200010.AA0200011button0.return_sub1.executePScriptOnLoad();
};

expj.AA0200010.AA0200011button0.return_sub1.executePScriptOnLoad = function () {
  console.log('execute AA0200011button0/return_sub1.onLoad');
  var targetComponent = document.getElementById('expj-AA0200010-AA0200011button0-return_sub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0200010-AA0200011button0-return_sub1" name="return_sub1" class="AA0200010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0200010 (END)-->
<%
MessageStruct msgStruct = aAA0200010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0200010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0200010)) {
  expj.common.treeInstanceMap.AA0200010 = {};
}
expj.common.treeInstanceMap.AA0200010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0200010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0200010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0200010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0200010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0200010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0200010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0200010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0200010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0200010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0200010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0200010)) {
  expj.common.detailDialogMap.AA0200010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0200010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0200010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0200010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0200010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0200010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0200010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0200010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0200010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0200010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0200010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0200010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0200010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0200010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0200010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0200010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0200010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0200010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0200010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0200010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0200010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0200010)) {
  expj.common.viewInstanceMap.AA0200010 = {};
}
expj.common.viewInstanceMap.AA0200010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0200010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0200010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0200010.<%=viewId %>.init = function () {
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
    expj.AA0200010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0200010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0200010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0200010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0200010_init">
/**
 * AA0200010用のロード完了時初期化関数
 */
expj.AA0200010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0200010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0200010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0200010');
  expj.common.calendarInstanceMap.AA0200010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0200010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0200010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0200010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0200010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0200010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0200010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0200010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0200010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0200010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0200010.AA0200011form1.FileName.executeOnLoad();}catch(e){};
  try{expj.AA0200010.AA0200011form1.CANCEL_FILE.executeOnLoad();}catch(e){};
  try{expj.AA0200010.AA0200011form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AA0200010.AA0200011button1.Browse.executeOnLoad();}catch(e){};
  try{expj.AA0200010.AA0200011button1.CsvIn.executeOnLoad();}catch(e){};
  try{expj.AA0200010.AA0200011button0.CSVOut.executeOnLoad();}catch(e){};
  try{expj.AA0200010.AA0200011button0.return_sub1.executeOnLoad();}catch(e){};
  try{expj.AA0200010.AA0200011form1.executeOnLoad();}catch(e){};
  try{expj.AA0200010.AA0200011button1.executeOnLoad();}catch(e){};
  try{expj.AA0200010.AA0200011view.executeOnLoad();}catch(e){};
  try{expj.AA0200010.AA0200011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0200010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0200010', 'AA0200010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0200010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0200010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0200010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0200010', '<%=request.getContextPath() %>');
};

/**
 * AA0200010の全体onDecision処理
 */
expj.AA0200010.executeAllOnDecision = function () {
  expj.AA0200010.AA0200011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0200010_console">
expj.AA0200010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>