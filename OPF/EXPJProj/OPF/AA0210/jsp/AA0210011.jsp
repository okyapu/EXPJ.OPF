<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:26:15 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0210\AA0210011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0210.*" %>
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
<jsp:useBean id="aAA0210010Control" class="com.nec.jp.orteus.metamorBase.AA0210.AA0210010Control" scope="request"/>
<jsp:useBean id="aAA0210010Struct" class="com.nec.jp.orteus.metamorBase.AA0210.AA0210010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

�����f�[�^�捞�����iCSV�A�b�v���[�h�j
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0210/jsp/AA0210011.jsp,v $
$Author: geng-jia $	
$Revision: 1.2 $�@$Date: 2017/02/22 02:04:18 $
********************************************************* --%>
<html>
<head>
<title>�����f�[�^�捞�����iCSV�A�b�v���[�h�j</title>
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
<script class="expj-script-AA0210010_init">
  // AA0210010���O���
  expj.AA0210010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AA0210010" data-screen="AA0210011" data-newdata="<%=aAA0210010Control.isNewData() %>">
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
              <!-- �����ɏ�i���������p��DataGrid��z�u����B�� -->
              <script class="expj-script-AA0210010-AA0210011form1">
expj.AA0210010.AA0210011form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AA0210010.AA0210011form1.onLoad0 = function () {
  console.log('AA0210011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AA0210010.AA0210011form1.onDecision0 = function () {
  console.log('AA0210011form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0210010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AA0210011button1/CsvIn"
expj.AA0210010.AA0210011form1.child0 = function () {
  console.log('AA0210011form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0210010', 'AA0210011form1', '_AA0210011button1/CsvIn');
};
// script4="child;1;MASK;_AA0210011button1/CsvIn"
expj.AA0210010.AA0210011form1.child1 = function () {
  console.log('AA0210011form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0210010', 'AA0210011form1', '_AA0210011button1/CsvIn');
};
// script5="onDecision;1;CHK;?AA0210011view1/$[eq]0@*2,*3"
expj.AA0210010.AA0210011form1.onDecision1 = function () {
  console.log('AA0210011form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0210010', 'AA0210011form1', '?AA0210011view1/$'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;MASK;_AA0210011button0/CsvOut"
expj.AA0210010.AA0210011form1.child2 = function () {
  console.log('AA0210011form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AA0210010', 'AA0210011form1', '_AA0210011button0/CsvOut');
};
// script7="child;3;UNMASK;_AA0210011button0/CsvOut"
expj.AA0210010.AA0210011form1.child3 = function () {
  console.log('AA0210011form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AA0210010', 'AA0210011form1', '_AA0210011button0/CsvOut');
};
expj.AA0210010.AA0210011form1.executeAllOnDecision = function () {
  console.log('execute AA0210011form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0210010.AA0210011form1['onDecision' + i])) {
        expj.AA0210010.AA0210011form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0210010.AA0210011form1.executeOnLoad = function () {
  expj.AA0210010.AA0210011form1.executePScriptOnLoad();
};

expj.AA0210010.AA0210011form1.executePScriptOnLoad = function () {
  console.log('execute AA0210011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0210010.AA0210011form1['onLoad' + i])) {
      expj.AA0210010.AA0210011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0210010-AA0210011form1" action="AA0210010Servlet" name="AA0210011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0046",rb)%></span><!-- �捞�t�@�C�� --></div><!--/td-->
<script class="expj-script-AA0210010-AA0210011form1-FileName">
expj.AA0210010.AA0210011form1.FileName = {};
expj.AA0210010.AA0210011form1.FileName.executeAllOnDecision = function () {
  console.log('execute AA0210011form1/FileName.onDecision');
  expj.AA0210010.AA0210011form1.executeAllOnDecision();
  expj.AA0210010.executeAllOnDecision();
};
expj.AA0210010.AA0210011form1.FileName.executeOnLoad = function () {
  $('#expj-AA0210010-AA0210011form1-FileName').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0210010', 'AA0210011form1', 'FileName', this);
  });
  expj.AA0210010.AA0210011form1.FileName.executePScriptOnLoad();
};

expj.AA0210010.AA0210011form1.FileName.executePScriptOnLoad = function () {
  console.log('execute AA0210011form1/FileName.onLoad');
  var targetComponent = document.getElementById('expj-AA0210010-AA0210011form1-FileName');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AA0210010-AA0210011form1-FileName" name="FileName" class="AA0210010-focus-move  required-value expj-AA0210010-required-A" style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0210010Struct.getFileName()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0210010-AA0210011form1-CANCEL_FILE" name="CANCEL_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0210010Struct.getCANCEL_FILE()) %>">
<script class="expj-script-AA0210010-AA0210011form1-CANCEL_FILE">
expj.AA0210010.AA0210011form1.CANCEL_FILE = {};
expj.AA0210010.AA0210011form1.CANCEL_FILE.executeAllOnDecision = function () {
  console.log('execute AA0210011form1/CANCEL_FILE.onDecision');
  expj.AA0210010.AA0210011form1.executeAllOnDecision();
  expj.AA0210010.executeAllOnDecision();
};
expj.AA0210010.AA0210011form1.CANCEL_FILE.executeOnLoad = function () {
  $('#expj-AA0210010-AA0210011form1-CANCEL_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0210010', 'AA0210011form1', 'CANCEL_FILE', this);
  });
  expj.AA0210010.AA0210011form1.CANCEL_FILE.executePScriptOnLoad();
};

expj.AA0210010.AA0210011form1.CANCEL_FILE.executePScriptOnLoad = function () {
  console.log('execute AA0210011form1/CANCEL_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AA0210010-AA0210011form1-CANCEL_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AA0210010-AA0210011form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0210010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AA0210010-AA0210011form1-DOWNLOAD_FILE">
expj.AA0210010.AA0210011form1.DOWNLOAD_FILE = {};
expj.AA0210010.AA0210011form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AA0210011form1/DOWNLOAD_FILE.onDecision');
  expj.AA0210010.AA0210011form1.executeAllOnDecision();
  expj.AA0210010.executeAllOnDecision();
};
expj.AA0210010.AA0210011form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AA0210010-AA0210011form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0210010', 'AA0210011form1', 'DOWNLOAD_FILE', this);
  });
  expj.AA0210010.AA0210011form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AA0210010.AA0210011form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AA0210011form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AA0210010-AA0210011form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- �����ɏ�i���������p��DataGrid��z�u����B�� --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AA0210010-AA0210011button1">
expj.AA0210010.AA0210011button1 = {};
expj.AA0210010.AA0210011button1.executeAllOnDecision = function () {
  console.log('execute AA0210011button1.onDecision');
};
expj.AA0210010.AA0210011button1.executeOnLoad = function () {
  expj.AA0210010.AA0210011button1.executePScriptOnLoad();
};

expj.AA0210010.AA0210011button1.executePScriptOnLoad = function () {
  console.log('execute AA0210011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0210010-AA0210011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0210010-AA0210011button1-Browse">
expj.AA0210010.AA0210011button1.Browse = {};
// script1="onClick;0;FILEDLG;_AA0210011form1/FileName"
expj.AA0210010.AA0210011button1.Browse.onClick0 = function () {
  console.log('Browse script1');
expj.common.pscript.openFileDialog('AA0210010', 'AA0210011button1', '_AA0210011form1/FileName');
};
expj.AA0210010.AA0210011button1.Browse.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0210010.AA0210011button1.Browse['onClick' + i])) {
        expj.AA0210010.AA0210011button1.Browse['onClick' + i]();
      }
    }
  }
};
expj.AA0210010.AA0210011button1.Browse.executeAllOnDecision = function () {
};
expj.AA0210010.AA0210011button1.Browse.executeOnLoad = function () {
  $('#expj-AA0210010-AA0210011button1-Browse').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0210010', 'AA0210011button1', 'Browse', this, 'Button');
    }
  });
  expj.AA0210010.AA0210011button1.Browse.executePScriptOnLoad();
};

expj.AA0210010.AA0210011button1.Browse.executePScriptOnLoad = function () {
  console.log('execute AA0210011button1/Browse.onLoad');
  var targetComponent = document.getElementById('expj-AA0210010-AA0210011button1-Browse');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0210010-AA0210011button1-Browse" name="Browse" class="AA0210010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnBrowse",rb)%></button><!-- �Q�ƃ{�^�� --></div><!--/td-->
<script class="expj-script-AA0210010-AA0210011button1-CsvIn">
expj.AA0210010.AA0210011button1.CsvIn = {};
// script1="onClick;0;FILEUPLOAD;AA0210010Servlet"
expj.AA0210010.AA0210011button1.CsvIn.onClick0 = function () {
  console.log('CsvIn script1');
expj.common.pscript.executeFileUpload('AA0210010', 'AA0210011button1', 'AA0210010Servlet');
};
expj.AA0210010.AA0210011button1.CsvIn.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0210010.AA0210011button1.CsvIn['onClick' + i])) {
        expj.AA0210010.AA0210011button1.CsvIn['onClick' + i]();
      }
    }
  }
};
expj.AA0210010.AA0210011button1.CsvIn.executeAllOnDecision = function () {
};
expj.AA0210010.AA0210011button1.CsvIn.executeOnLoad = function () {
  $('#expj-AA0210010-AA0210011button1-CsvIn').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0210010', 'AA0210011button1', 'CsvIn', this, 'Button');
    }
  });
  expj.AA0210010.AA0210011button1.CsvIn.executePScriptOnLoad();
};

expj.AA0210010.AA0210011button1.CsvIn.executePScriptOnLoad = function () {
  console.log('execute AA0210011button1/CsvIn.onLoad');
  var targetComponent = document.getElementById('expj-AA0210010-AA0210011button1-CsvIn');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0210010-AA0210011button1-CsvIn" name="CsvIn" class="AA0210010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvIn",rb)%></button><!-- �捞�{�^�� --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- �����ɉ��i�����e�i���X�p��DataGrid��z�u����B�� --><script class="expj-script-AA0210010-AA0210011view1">
expj.AA0210010.AA0210011view1 = {};
expj.AA0210010.AA0210011view1.executeAllOnClick = function () {
};
expj.AA0210010.AA0210011view1.executeAllOnDecision = function () {
  console.log('execute AA0210011view1.onDecision');
};
expj.AA0210010.AA0210011view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0210011view1", "expj.AA0210010.AA0210011view1.executeAllOnClick");
%>
  expj.AA0210010.AA0210011view1.executePScriptOnLoad();
};

expj.AA0210010.AA0210011view1.executePScriptOnLoad = function () {
  console.log('execute AA0210011view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0210010-AA0210011view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0210011view1_Id = "AA0210011view1";
 String AA0210011view1_select = "single";
 String AA0210011view1_sortable = "true";
 String AA0210011view1_resize = "true";
 String AA0210011view1_scroll = "true";
 StringBuffer AA0210011view1_HB = new StringBuffer();
 StringBuffer AA0210011view1_DB = new StringBuffer();
%>
<%
 AA0210011view1_select = "none";
 AA0210011view1_sortable = "true";
 AA0210011view1_resize = "true";
 AA0210011view1_scroll = "true";
%>
<%
 AA0210011view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0210011view1_sortable).append("}").append(",");
%>
     
<%
AA0210011view1_HB.append("{'visible':true, 'type':'string', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3094",rb))).append("', 'name':'l_ERR_ADR', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0210011view1_sortable).append("}").append(",");
AA0210011view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3095",rb))).append("', 'name':'l_ERR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0210011view1_sortable).append("}").append(",");
AA0210011view1_HB.append("{'visible':true, 'type':'string', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'l_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0210011view1_sortable).append("}").append(",");
AA0210011view1_HB.append("{'visible':true, 'type':'string', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3097",rb))).append("', 'name':'l_ERROR_FIELD_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0210011view1_sortable).append("}").append(",");
AA0210011view1_HB.append("{'visible':true, 'type':'string', 'width':'447px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3098",rb))).append("', 'name':'l_ERR_TEXT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0210011view1_sortable).append("}").append(",");
%>
<%
 int aAA0210010StructLength = aAA0210010Control.getListsize();
 final AA0210010Struct structBackup = aAA0210010Struct;
 aAA0210010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0210010StructLength; ++loopCount) {
  if((aAA0210010Struct = (AA0210010Struct) aAA0210010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0210010Struct", aAA0210010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0210011view1_DB.append("[");
 AA0210011view1_DB.append(loopCount);
 AA0210011view1_DB.append(",").append("'<span id=\"expj-AA0210010-AA0210011view1-l_ERR_ADR-").append(loopCount).append("\" class=\"expj-label expj-AA0210010-AA0210011view1-l_ERR_ADR\" data-name=\"l_ERR_ADR\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0210010Struct.getl_ERR_ADR())).append("</span>'");
 AA0210011view1_DB.append(",").append("'<span id=\"expj-AA0210010-AA0210011view1-l_ERR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0210010-AA0210011view1-l_ERR_TYP\" data-name=\"l_ERR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0210010Struct.getl_ERR_TYP())).append("</span>'");
 AA0210011view1_DB.append(",").append("'<span id=\"expj-AA0210010-AA0210011view1-l_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0210010-AA0210011view1-l_VEND_CD\" data-name=\"l_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0210010Struct.getl_VEND_CD())).append("</span>'");
 AA0210011view1_DB.append(",").append("'<span id=\"expj-AA0210010-AA0210011view1-l_ERROR_FIELD_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0210010-AA0210011view1-l_ERROR_FIELD_NAME\" data-name=\"l_ERROR_FIELD_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0210010Struct.getl_ERROR_FIELD_NAME())).append("</span>'");
 AA0210011view1_DB.append(",").append("'<span id=\"expj-AA0210010-AA0210011view1-l_ERR_TEXT-").append(loopCount).append("\" class=\"expj-label expj-AA0210010-AA0210011view1-l_ERR_TEXT\" data-name=\"l_ERR_TEXT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0210010Struct.getl_ERR_TEXT())).append("</span>'");
 AA0210011view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0210010StructLength) {
   AA0210011view1_DB.append(",");
  }
 }
 aAA0210010Struct = structBackup;
 viewIdList.add(AA0210011view1_Id);
 viewSelectList.add(AA0210011view1_select);
 viewResizeList.add(AA0210011view1_resize);
 viewScrollList.add(AA0210011view1_scroll);
 viewHeaderDataList.add(AA0210011view1_HB);
 viewBodyDataList.add(AA0210011view1_DB);
%>
<%
}
%>
<!-- �����ɉ��i�����e�i���X�p��DataGrid��z�u����B�� --></div><!--/td-->
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
<span class="version">AA0210011 Revision: 1.1  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0210010-AA0210011button0">
expj.AA0210010.AA0210011button0 = {};
expj.AA0210010.AA0210011button0.executeAllOnDecision = function () {
  console.log('execute AA0210011button0.onDecision');
};
expj.AA0210010.AA0210011button0.executeOnLoad = function () {
  expj.AA0210010.AA0210011button0.executePScriptOnLoad();
};

expj.AA0210010.AA0210011button0.executePScriptOnLoad = function () {
  console.log('execute AA0210011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0210010-AA0210011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0210010-AA0210011button0-CsvOut">
expj.AA0210010.AA0210011button0.CsvOut = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0210011form1/*@AA0210010Servlet,,$ZZ07011"
expj.AA0210010.AA0210011button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0210010', 'AA0210011button0', '_AA0210011form1/*', 'AA0210010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0210010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0210010', response);
expj.common.changeBusinessScreenTab('AA0210010', contents);
};
expj.common.pscript.callConfirm('AA0210010', 'AA0210011button0', 'ZZ07011', okEvent);
};
expj.AA0210010.AA0210011button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0210010.AA0210011button0.CsvOut['onClick' + i])) {
        expj.AA0210010.AA0210011button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AA0210010.AA0210011button0.CsvOut.executeAllOnDecision = function () {
};
expj.AA0210010.AA0210011button0.CsvOut.executeOnLoad = function () {
  $('#expj-AA0210010-AA0210011button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0210010', 'AA0210011button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AA0210010.AA0210011button0.CsvOut.executePScriptOnLoad();
};

expj.AA0210010.AA0210011button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AA0210011button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AA0210010-AA0210011button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0210010-AA0210011button0-CsvOut" name="CsvOut" class="AA0210010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV�o�̓{�^�� --></div><!--/td-->
<script class="expj-script-AA0210010-AA0210011button0-return_sub1">
expj.AA0210010.AA0210011button0.return_sub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0210011form1/*@AA0210010Servlet,,$ZZ07013"
expj.AA0210010.AA0210011button0.return_sub1.onClick0 = function () {
  console.log('return_sub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0210010', 'AA0210011button0', '_AA0210011form1/*', 'AA0210010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0210010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0210010', response);
expj.common.changeBusinessScreenTab('AA0210010', contents);
};
expj.common.pscript.callConfirm('AA0210010', 'AA0210011button0', 'ZZ07013', okEvent);
};
expj.AA0210010.AA0210011button0.return_sub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0210010.AA0210011button0.return_sub1['onClick' + i])) {
        expj.AA0210010.AA0210011button0.return_sub1['onClick' + i]();
      }
    }
  }
};
expj.AA0210010.AA0210011button0.return_sub1.executeAllOnDecision = function () {
};
expj.AA0210010.AA0210011button0.return_sub1.executeOnLoad = function () {
  $('#expj-AA0210010-AA0210011button0-return_sub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0210010', 'AA0210011button0', 'return_sub1', this, 'Button');
    }
  });
  expj.AA0210010.AA0210011button0.return_sub1.executePScriptOnLoad();
};

expj.AA0210010.AA0210011button0.return_sub1.executePScriptOnLoad = function () {
  console.log('execute AA0210011button0/return_sub1.onLoad');
  var targetComponent = document.getElementById('expj-AA0210010-AA0210011button0-return_sub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0210010-AA0210011button0-return_sub1" name="return_sub1" class="AA0210010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- �߂�{�^�� --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0210010 (END)-->
<%
MessageStruct msgStruct = aAA0210010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AA0210010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0210010)) {
  expj.common.treeInstanceMap.AA0210010 = {};
}
expj.common.treeInstanceMap.AA0210010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AA0210010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AA0210010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AA0210010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
expj.common.treeInstanceMap.AA0210010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0210010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0210010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0210010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0210010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0210010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js�錾
 if (detailId != null) {
%>
<script class="expj-script-AA0210010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0210010)) {
  expj.common.detailDialogMap.AA0210010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0210010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0210010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0210010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0210010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0210010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0210010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0210010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0210010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0210010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0210010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0210010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AA0210010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0210010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
  expj.common.detailDialogMap.AA0210010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0210010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0210010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0210010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0210010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0210010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
<%
}
%>
};
</script>
<%
 }
//DETAIL JS�錾(END)

//VIEW JS�錾
for (int i = 0; i < viewIdList.size(); i++) {
 String viewId = (String) viewIdList.get(i);
 String viewResize = (String) viewResizeList.get(i);
 String viewSelect = (String) viewSelectList.get(i);
 String viewScroll = (String) viewScrollList.get(i);
 StringBuffer viewHeaderBuffer = (StringBuffer) viewHeaderDataList.get(i);
 StringBuffer viewDataBuffer = (StringBuffer) viewBodyDataList.get(i);
%>
<script class="expj-script-AA0210010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0210010)) {
  expj.common.viewInstanceMap.AA0210010 = {};
}
expj.common.viewInstanceMap.AA0210010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0210010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0210010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0210010.<%=viewId %>.init = function () {
  // DataGrid(VIEW)�̃{�f�B�f�[�^
  var body_data = [<%=viewDataBuffer.toString() %>];
  // DataGrid(VIEW)�̃w�b�_�[�f�[�^
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
    expj.AA0210010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0210010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0210010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0210010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0210010_init">
/**
 * AA0210010�p�̃��[�h�������������֐�
 */
expj.AA0210010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0210010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AA0210010');
  //��DataGridTable�ɓ��I�����ݒ�
  expj.common.setExpjDynamicHeight('AA0210010');
  expj.common.calendarInstanceMap.AA0210010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AA0210010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AA0210010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0210010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0210010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0210010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0210010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0210010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0210010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0210010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0210010.AA0210011form1.FileName.executeOnLoad();}catch(e){};
  try{expj.AA0210010.AA0210011form1.CANCEL_FILE.executeOnLoad();}catch(e){};
  try{expj.AA0210010.AA0210011form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AA0210010.AA0210011button1.Browse.executeOnLoad();}catch(e){};
  try{expj.AA0210010.AA0210011button1.CsvIn.executeOnLoad();}catch(e){};
  try{expj.AA0210010.AA0210011button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AA0210010.AA0210011button0.return_sub1.executeOnLoad();}catch(e){};
  try{expj.AA0210010.AA0210011form1.executeOnLoad();}catch(e){};
  try{expj.AA0210010.AA0210011button1.executeOnLoad();}catch(e){};
  try{expj.AA0210010.AA0210011view1.executeOnLoad();}catch(e){};
  try{expj.AA0210010.AA0210011button0.executeOnLoad();}catch(e){};
  // �R���\�[���o��
  expj.AA0210010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0210010', 'AA0210010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0210010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AA0210010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AA0210010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AA0210010', '<%=request.getContextPath() %>');
};

/**
 * AA0210010�̑S��onDecision����
 */
expj.AA0210010.executeAllOnDecision = function () {
  expj.AA0210010.AA0210011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0210010_console">
expj.AA0210010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>