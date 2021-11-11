<%-- ***
This file is generated
 GeneratedDate  : Thu Nov 11 14:49:02 JST 2021
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\TT0010\TT0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.TT0010.*" %>
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
<jsp:useBean id="aTT0010010Control" class="com.nec.jp.orteus.metamorBase.TT0010.TT0010010Control" scope="request"/>
<jsp:useBean id="aTT0010010Struct" class="com.nec.jp.orteus.metamorBase.TT0010.TT0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

画面テスト
$Source: D:/EXPJCVS/EXPJCORE/ejstudioV2/EXPJStudio/tools/framework/expjhtml5/pattern/expj/initHtml.vm,v $
$Author: n-saito $
$Revision: 1.1 $ $Date: 2017/03/13 08:12:49 $
********************************************************* --%>
<html>
<head>
<title>画面テスト</title>
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
 List viewTypeList = new ArrayList();
 Map viewSelectEvent = new HashMap();
 Map treeClickEvent = new HashMap();
%>
<script class="expj-script-TT0010010_init">
  // TT0010010名前空間
  expj.TT0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-TT0010010" data-screen="TT0010010" data-newdata="<%=aTT0010010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:968px;height:590px;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px">
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

    <div class="expj-tr" style="">
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:958px;">
        <div class="expj-table data-grid-table" style="width:946px;"><!--table2-->
          <div class="expj-tr" style="width:100%;height:0px;display:none;">

            <div class="expj-td frame01"></div><!--/td-->

            <div class="expj-td frame02"></div><!--/td-->

            <div class="expj-td frame03"></div><!--/td-->

          </div><!--/tr-->

          <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">

            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style="">
              <!-- 1段目のDataGrid配置↓ -->
              <script class="expj-script-TT0010010-TT0010010form1">
expj.TT0010010.TT0010010form1 = {};
expj.TT0010010.TT0010010form1.executeAllOnDecision = function () {
  console.log('execute TT0010010form1.onDecision');
};
expj.TT0010010.TT0010010form1.executeOnLoad = function () {
  expj.TT0010010.TT0010010form1.executePScriptOnLoad();
};

expj.TT0010010.TT0010010form1.executePScriptOnLoad = function () {
  console.log('execute TT0010010form1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-TT0010010-TT0010010form1" action="TT0010010Servlet" name="TT0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 100%; height:27px;">
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
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-TT0010010-TT0010010form1-ITEM_CD">
expj.TT0010010.TT0010010form1.ITEM_CD = {};
expj.TT0010010.TT0010010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute TT0010010form1/ITEM_CD.onDecision');
  expj.TT0010010.TT0010010form1.executeAllOnDecision();
  expj.TT0010010.executeAllOnDecision();
};
expj.TT0010010.TT0010010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-TT0010010-TT0010010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('TT0010010', 'TT0010010form1', 'ITEM_CD', this);
  });
  expj.TT0010010.TT0010010form1.ITEM_CD.executePScriptOnLoad();
};

expj.TT0010010.TT0010010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute TT0010010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-TT0010010-TT0010010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-TT0010010-TT0010010form1-ITEM_CD" name="ITEM_CD" class="TT0010010-focus-move  " style="width:100%;" data-kind="" value="<%= TypeConverter.sanitizer(aTT0010010Struct.getITEM_CD()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-TT0010010-TT0010010form1-Select">
expj.TT0010010.TT0010010form1.Select = {};
expj.TT0010010.TT0010010form1.Select.executeAllOnDecision = function () {
};
expj.TT0010010.TT0010010form1.Select.executeOnLoad = function () {
  $('#expj-TT0010010-TT0010010form1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('TT0010010', 'TT0010010form1', 'Select', this, 'Button');
    }
  });
  expj.TT0010010.TT0010010form1.Select.executePScriptOnLoad();
};

expj.TT0010010.TT0010010form1.Select.executePScriptOnLoad = function () {
  console.log('execute TT0010010form1/Select.onLoad');
  var targetComponent = document.getElementById('expj-TT0010010-TT0010010form1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-TT0010010-TT0010010form1-Select" name="Select" class="TT0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- 1段目のDataGrid配置↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:664px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-TT0010010-TT0010010button1">
expj.TT0010010.TT0010010button1 = {};
expj.TT0010010.TT0010010button1.executeAllOnDecision = function () {
  console.log('execute TT0010010button1.onDecision');
};
expj.TT0010010.TT0010010button1.executeOnLoad = function () {
  expj.TT0010010.TT0010010button1.executePScriptOnLoad();
};

expj.TT0010010.TT0010010button1.executePScriptOnLoad = function () {
  console.log('execute TT0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-TT0010010-TT0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-TT0010010-TT0010010button1-Select">
expj.TT0010010.TT0010010button1.Select = {};
expj.TT0010010.TT0010010button1.Select.executeAllOnDecision = function () {
};
expj.TT0010010.TT0010010button1.Select.executeOnLoad = function () {
  $('#expj-TT0010010-TT0010010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('TT0010010', 'TT0010010button1', 'Select', this, 'Button');
    }
  });
  expj.TT0010010.TT0010010button1.Select.executePScriptOnLoad();
};

expj.TT0010010.TT0010010button1.Select.executePScriptOnLoad = function () {
  console.log('execute TT0010010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-TT0010010-TT0010010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:105px;float:none;height:30px;"><button type="button" id="expj-TT0010010-TT0010010button1-Select" name="Select" class="TT0010010-focus-move" data-lock="1" style="width:px;">検索</button><!-- 検索ボタン --></div><!--/td-->
<div class="div-td" style="width:105px;"></div><!--/td-->
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
<div class="expj-td" style="width:958px;"><div class="expj-table data-grid-table" style="width:946px;"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- 2段目のDataGrid配置↓ --><script class="expj-script-TT0010010-TT0010010form2">
expj.TT0010010.TT0010010form2 = {};
expj.TT0010010.TT0010010form2.executeAllOnDecision = function () {
  console.log('execute TT0010010form2.onDecision');
};
expj.TT0010010.TT0010010form2.executeOnLoad = function () {
  expj.TT0010010.TT0010010form2.executePScriptOnLoad();
};

expj.TT0010010.TT0010010form2.executePScriptOnLoad = function () {
  console.log('execute TT0010010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-TT0010010-TT0010010form2" action="TT0010010Servlet" name="TT0010010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:418px;overflow-y:auto;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 100%; height:418px;">
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
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_NAME",rb)%></span><!-- 品目名 --></div><!--/td-->
<script class="expj-script-TT0010010-TT0010010form2-ITEM_NAME">
expj.TT0010010.TT0010010form2.ITEM_NAME = {};
expj.TT0010010.TT0010010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute TT0010010form2/ITEM_NAME.onDecision');
  expj.TT0010010.TT0010010form2.executeAllOnDecision();
  expj.TT0010010.executeAllOnDecision();
};
expj.TT0010010.TT0010010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-TT0010010-TT0010010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('TT0010010', 'TT0010010form2', 'ITEM_NAME', this);
  });
  expj.TT0010010.TT0010010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.TT0010010.TT0010010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute TT0010010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-TT0010010-TT0010010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-TT0010010-TT0010010form2-ITEM_NAME" name="ITEM_NAME" class="TT0010010-focus-move  " style="width:100%;" data-kind="" value="<%= TypeConverter.sanitizer(aTT0010010Struct.getITEM_NAME()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
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
<div class="div-td" style="width:170px;"></div><!--/td-->
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
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
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
<!-- 2段目のDataGrid配置↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:664px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-TT0010010-TT0010010button2">
expj.TT0010010.TT0010010button2 = {};
expj.TT0010010.TT0010010button2.executeAllOnDecision = function () {
  console.log('execute TT0010010button2.onDecision');
};
expj.TT0010010.TT0010010button2.executeOnLoad = function () {
  expj.TT0010010.TT0010010button2.executePScriptOnLoad();
};

expj.TT0010010.TT0010010button2.executePScriptOnLoad = function () {
  console.log('execute TT0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-TT0010010-TT0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-TT0010010-TT0010010button2-Update">
expj.TT0010010.TT0010010button2.Update = {};
expj.TT0010010.TT0010010button2.Update.executeAllOnDecision = function () {
};
expj.TT0010010.TT0010010button2.Update.executeOnLoad = function () {
  $('#expj-TT0010010-TT0010010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('TT0010010', 'TT0010010button2', 'Update', this, 'Button');
    }
  });
  expj.TT0010010.TT0010010button2.Update.executePScriptOnLoad();
};

expj.TT0010010.TT0010010button2.Update.executePScriptOnLoad = function () {
  console.log('execute TT0010010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-TT0010010-TT0010010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:105px;float:none;height:30px;"><button type="button" id="expj-TT0010010-TT0010010button2-Update" name="Update" class="TT0010010-focus-move" data-lock="1" style="width:px;">更新</button><!-- 更新ボタン --></div><!--/td-->
<div class="div-td" style="width:105px;"></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:968px;height:42px;"><div class="div-table" style="width:968px;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:748px; padding-top:15px; position:fixed;">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">TT0010010 Revision: 1.1  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-TT0010010-TT0010010button0">
expj.TT0010010.TT0010010button0 = {};
expj.TT0010010.TT0010010button0.executeAllOnDecision = function () {
  console.log('execute TT0010010button0.onDecision');
};
expj.TT0010010.TT0010010button0.executeOnLoad = function () {
  expj.TT0010010.TT0010010button0.executePScriptOnLoad();
};

expj.TT0010010.TT0010010button0.executePScriptOnLoad = function () {
  console.log('execute TT0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-TT0010010-TT0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-TT0010010-TT0010010button0-Clear">
expj.TT0010010.TT0010010button0.Clear = {};
expj.TT0010010.TT0010010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('TT0010010', 'TT0010010button0', '', 'TT0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'TT0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('TT0010010', response);
expj.common.updateBusinessScreenTab('TT0010010', contents);
};
expj.common.pscript.callConfirm('TT0010010', 'TT0010010button0', 'ZZ07008', okEvent);
};
expj.TT0010010.TT0010010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.TT0010010.TT0010010button0.Clear['onClick' + i])) {
        expj.TT0010010.TT0010010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.TT0010010.TT0010010button0.Clear.executeAllOnDecision = function () {
};
expj.TT0010010.TT0010010button0.Clear.executeOnLoad = function () {
  $('#expj-TT0010010-TT0010010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('TT0010010', 'TT0010010button0', 'Clear', this, 'Button');
    }
  });
  expj.TT0010010.TT0010010button0.Clear.executePScriptOnLoad();
};

expj.TT0010010.TT0010010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute TT0010010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-TT0010010-TT0010010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-TT0010010-TT0010010button0-Clear" name="Clear" class="TT0010010-focus-move" data-lock="0" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-TT0010010-TT0010010button0-Close">
expj.TT0010010.TT0010010button0.Close = {};
expj.TT0010010.TT0010010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('TT0010010');
};
expj.TT0010010.TT0010010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.TT0010010.TT0010010button0.Close['onClick' + i])) {
        expj.TT0010010.TT0010010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.TT0010010.TT0010010button0.Close.executeAllOnDecision = function () {
};
expj.TT0010010.TT0010010button0.Close.executeOnLoad = function () {
  $('#expj-TT0010010-TT0010010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('TT0010010', 'TT0010010button0', 'Close', this, 'Button');
    }
  });
  expj.TT0010010.TT0010010button0.Close.executePScriptOnLoad();
};

expj.TT0010010.TT0010010button0.Close.executePScriptOnLoad = function () {
  console.log('execute TT0010010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-TT0010010-TT0010010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-TT0010010-TT0010010button0-Close" name="Close" class="TT0010010-focus-move expj-business-screen-close-button" data-lock="0" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-TT0010010 (END)-->
<%
MessageStruct msgStruct = aTT0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-TT0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.TT0010010)) {
  expj.common.treeInstanceMap.TT0010010 = {};
}
expj.common.treeInstanceMap.TT0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.TT0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.TT0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.TT0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.TT0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.TT0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.TT0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.TT0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.TT0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-TT0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-TT0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.TT0010010)) {
  expj.common.detailDialogMap.TT0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.TT0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.TT0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.TT0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.TT0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.TT0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.TT0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.TT0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.TT0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.TT0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.TT0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-TT0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.TT0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-TT0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.TT0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-TT0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.TT0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.TT0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.TT0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.TT0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
 String viewType = (String) viewTypeList.get(i);
 StringBuffer viewHeaderBuffer = (StringBuffer) viewHeaderDataList.get(i);
 StringBuffer viewDataBuffer = (StringBuffer) viewBodyDataList.get(i);
%>
<script class="expj-script-TT0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.TT0010010)) {
  expj.common.viewInstanceMap.TT0010010 = {};
}
expj.common.viewInstanceMap.TT0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.TT0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.TT0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.TT0010010.<%=viewId %>.init = function () {
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
    expj.TT0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.TT0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-TT0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent, '<%=viewType %>');
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-TT0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-TT0010010_init">
/**
 * TT0010010用のロード完了時初期化関数
 */
expj.TT0010010.executeScreenLoad = function () {
  expj.common.revokeControl('#expj-business-screen-tabs-body-TT0010010');
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-TT0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('TT0010010');
  expj.common.calendarInstanceMap.TT0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.TT0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.TT0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.TT0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.TT0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.TT0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-TT0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-TT0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-TT0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-TT0010010-<%=detailId %>');
<%
 }
%>
  try{expj.TT0010010.TT0010010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.TT0010010.TT0010010form1.Select.executeOnLoad();}catch(e){};
  try{expj.TT0010010.TT0010010button1.Select.executeOnLoad();}catch(e){};
  try{expj.TT0010010.TT0010010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.TT0010010.TT0010010button2.Update.executeOnLoad();}catch(e){};
  try{expj.TT0010010.TT0010010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.TT0010010.TT0010010button0.Close.executeOnLoad();}catch(e){};
  try{expj.TT0010010.TT0010010form1.executeOnLoad();}catch(e){};
  try{expj.TT0010010.TT0010010button1.executeOnLoad();}catch(e){};
  try{expj.TT0010010.TT0010010form2.executeOnLoad();}catch(e){};
  try{expj.TT0010010.TT0010010button2.executeOnLoad();}catch(e){};
  try{expj.TT0010010.TT0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.TT0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-TT0010010', 'TT0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-TT0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.TT0010010-focus-move');
  // 初期フォーカス処理
  setTimeout(function () {
    $('.TT0010010-focus-move').each(function(){
      if(!$(this).is(':disabled') && this.type !== 'image'){
        $(this).focus();
        return false;
      }
    });
  }, expj.common.screenFrameLoadingTime);
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('TT0010010', '<%=request.getContextPath() %>');
};

/**
 * TT0010010の全体onDecision処理
 */
expj.TT0010010.executeAllOnDecision = function () {
  expj.TT0010010.TT0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-TT0010010_console">
expj.TT0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>