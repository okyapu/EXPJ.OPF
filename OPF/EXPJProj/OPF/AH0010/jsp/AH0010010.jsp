<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:41:43 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AH0010\AH0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AH0010.*" %>
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
<jsp:useBean id="aAH0010010Control" class="com.nec.jp.orteus.metamorBase.AH0010.AH0010010Control" scope="request"/>
<jsp:useBean id="aAH0010010Struct" class="com.nec.jp.orteus.metamorBase.AH0010.AH0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

品目別棚卸設定ファイル作成
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0010/jsp/AH0010010.jsp,v $
$Author: geng-jia $    
$Revision: 1.7 $ $Date: 2017/02/22 02:06:01 $
********************************************************* --%>
<html>
<head>
<title>品目別棚卸設定ファイル作成</title>
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
<script class="expj-script-AH0010010_init">
  // AH0010010名前空間
  expj.AH0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AH0010010" data-screen="AH0010010" data-newdata="<%=aAH0010010Control.isNewData() %>">
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
            
              <script class="expj-script-AH0010010-AH0010010form1">
expj.AH0010010.AH0010010form1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AH0010010.AH0010010form1.onLoad0 = function () {
  console.log('AH0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;_AH0010010form1/h_RADIO_TYPE[eq]1@*1,*2"
expj.AH0010010.AH0010010form1.child0 = function () {
  console.log('AH0010010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010010', 'AH0010010form1', '_AH0010010form1/h_RADIO_TYPE'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0010010form1/r_PLANT_TYPE2=true"
expj.AH0010010.AH0010010form1.child1 = function () {
  console.log('AH0010010form1 script3');
expj.common.pscript.setReferenceComponentValue('AH0010010', 'AH0010010form1', '_AH0010010form1/r_PLANT_TYPE2', 'true');
};
// script4="child;2;SET;_AH0010010form1/r_PLANT_TYPE1=true"
expj.AH0010010.AH0010010form1.child2 = function () {
  console.log('AH0010010form1 script4');
expj.common.pscript.setReferenceComponentValue('AH0010010', 'AH0010010form1', '_AH0010010form1/r_PLANT_TYPE1', 'true');
};
expj.AH0010010.AH0010010form1.executeAllOnDecision = function () {
  console.log('execute AH0010010form1.onDecision');
};
expj.AH0010010.AH0010010form1.executeOnLoad = function () {
  expj.AH0010010.AH0010010form1.executePScriptOnLoad();
};

expj.AH0010010.AH0010010form1.executePScriptOnLoad = function () {
  console.log('execute AH0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AH0010010.AH0010010form1['onLoad' + i])) {
      expj.AH0010010.AH0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0010010-AH0010010form1" action="AH0010010Servlet" name="AH0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0010010-AH0010010form1-r_PLANT_TYPE1">
expj.AH0010010.AH0010010form1.r_PLANT_TYPE1 = {};
expj.AH0010010.AH0010010form1.r_PLANT_TYPE1.executeAllOnDecision = function () {
  console.log('execute AH0010010form1/r_PLANT_TYPE1.onDecision');
  expj.AH0010010.AH0010010form1.executeAllOnDecision();
  expj.AH0010010.executeAllOnDecision();
};
expj.AH0010010.AH0010010form1.r_PLANT_TYPE1.executeOnLoad = function () {
  $('#expj-AH0010010-AH0010010form1-r_PLANT_TYPE1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010010', 'AH0010010form1', 'r_PLANT_TYPE1', this, 'RadioButton');
    }
  });
  expj.AH0010010.AH0010010form1.r_PLANT_TYPE1.executePScriptOnLoad();
};

expj.AH0010010.AH0010010form1.r_PLANT_TYPE1.executePScriptOnLoad = function () {
  console.log('execute AH0010010form1/r_PLANT_TYPE1.onLoad');
  var targetComponent = document.getElementById('expj-AH0010010-AH0010010form1-r_PLANT_TYPE1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="group1" data-name="r_PLANT_TYPE1" value="true" <%= ("true".equals(TypeConverter.convert(aAH0010010Struct.getr_PLANT_TYPE1())))?"checked=\"checked\"":"" %> class="" id="expj-AH0010010-AH0010010form1-r_PLANT_TYPE1" ><label for="expj-AH0010010-AH0010010form1-r_PLANT_TYPE1"><%=CoreTools.getRBString("Expj.Cmt0036",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AH0010010-AH0010010form1-h_RADIO_TYPE" name="h_RADIO_TYPE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0010010Struct.geth_RADIO_TYPE()) %>">
<script class="expj-script-AH0010010-AH0010010form1-h_RADIO_TYPE">
expj.AH0010010.AH0010010form1.h_RADIO_TYPE = {};
expj.AH0010010.AH0010010form1.h_RADIO_TYPE.executeAllOnDecision = function () {
  console.log('execute AH0010010form1/h_RADIO_TYPE.onDecision');
  expj.AH0010010.AH0010010form1.executeAllOnDecision();
  expj.AH0010010.executeAllOnDecision();
};
expj.AH0010010.AH0010010form1.h_RADIO_TYPE.executeOnLoad = function () {
  $('#expj-AH0010010-AH0010010form1-h_RADIO_TYPE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010010', 'AH0010010form1', 'h_RADIO_TYPE', this);
  });
  expj.AH0010010.AH0010010form1.h_RADIO_TYPE.executePScriptOnLoad();
};

expj.AH0010010.AH0010010form1.h_RADIO_TYPE.executePScriptOnLoad = function () {
  console.log('execute AH0010010form1/h_RADIO_TYPE.onLoad');
  var targetComponent = document.getElementById('expj-AH0010010-AH0010010form1-h_RADIO_TYPE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0010010-AH0010010form1-r_PLANT_TYPE2">
expj.AH0010010.AH0010010form1.r_PLANT_TYPE2 = {};
expj.AH0010010.AH0010010form1.r_PLANT_TYPE2.executeAllOnDecision = function () {
  console.log('execute AH0010010form1/r_PLANT_TYPE2.onDecision');
  expj.AH0010010.AH0010010form1.executeAllOnDecision();
  expj.AH0010010.executeAllOnDecision();
};
expj.AH0010010.AH0010010form1.r_PLANT_TYPE2.executeOnLoad = function () {
  $('#expj-AH0010010-AH0010010form1-r_PLANT_TYPE2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010010', 'AH0010010form1', 'r_PLANT_TYPE2', this, 'RadioButton');
    }
  });
  expj.AH0010010.AH0010010form1.r_PLANT_TYPE2.executePScriptOnLoad();
};

expj.AH0010010.AH0010010form1.r_PLANT_TYPE2.executePScriptOnLoad = function () {
  console.log('execute AH0010010form1/r_PLANT_TYPE2.onLoad');
  var targetComponent = document.getElementById('expj-AH0010010-AH0010010form1-r_PLANT_TYPE2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="group1" data-name="r_PLANT_TYPE2" value="false" <%= ("true".equals(TypeConverter.convert(aAH0010010Struct.getr_PLANT_TYPE2())))?"checked=\"checked\"":"" %> class="" id="expj-AH0010010-AH0010010form1-r_PLANT_TYPE2" ><label for="expj-AH0010010-AH0010010form1-r_PLANT_TYPE2"><%=CoreTools.getRBString("Expj.Cmt0035",rb)%></label></div><!--/td-->
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
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AH0010010-AH0010010button1">
expj.AH0010010.AH0010010button1 = {};
expj.AH0010010.AH0010010button1.executeAllOnDecision = function () {
  console.log('execute AH0010010button1.onDecision');
};
expj.AH0010010.AH0010010button1.executeOnLoad = function () {
  expj.AH0010010.AH0010010button1.executePScriptOnLoad();
};

expj.AH0010010.AH0010010button1.executePScriptOnLoad = function () {
  console.log('execute AH0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0010010-AH0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0010010-AH0010010button1-execute">
expj.AH0010010.AH0010010button1.execute = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0010010.AH0010010button1.execute.onClick0 = function () {
  console.log('execute script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0010010form1/r_PLANT_TYPE2[eq]true@*1,*2"
expj.AH0010010.AH0010010button1.execute.child0 = function () {
  console.log('execute script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010010', 'AH0010010button1', '_AH0010010form1/r_PLANT_TYPE2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0010010form1/h_RADIO_TYPE=1@*3"
expj.AH0010010.AH0010010button1.execute.child1 = function () {
  console.log('execute script3');
expj.common.pscript.setReferenceComponentValue('AH0010010', 'AH0010010button1', '_AH0010010form1/h_RADIO_TYPE', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script4="child;2;SET;_AH0010010form1/h_RADIO_TYPE=0@*3"
expj.AH0010010.AH0010010button1.execute.child2 = function () {
  console.log('execute script4');
expj.common.pscript.setReferenceComponentValue('AH0010010', 'AH0010010button1', '_AH0010010form1/h_RADIO_TYPE', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0010010form1/*@AH0010010Servlet,,$ZZ07009"
expj.AH0010010.AH0010010button1.execute.child3 = function () {
  console.log('execute script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0010010', 'AH0010010button1', '_AH0010010form1/*', 'AH0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0010010', response);
expj.common.updateBusinessScreenTab('AH0010010', contents);
};
expj.common.pscript.callConfirm('AH0010010', 'AH0010010button1', 'ZZ07009', okEvent);
};
expj.AH0010010.AH0010010button1.execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0010010.AH0010010button1.execute['onClick' + i])) {
        expj.AH0010010.AH0010010button1.execute['onClick' + i]();
      }
    }
  }
};
expj.AH0010010.AH0010010button1.execute.executeAllOnDecision = function () {
};
expj.AH0010010.AH0010010button1.execute.executeOnLoad = function () {
  $('#expj-AH0010010-AH0010010button1-execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010010', 'AH0010010button1', 'execute', this, 'Button');
    }
  });
  expj.AH0010010.AH0010010button1.execute.executePScriptOnLoad();
};

expj.AH0010010.AH0010010button1.execute.executePScriptOnLoad = function () {
  console.log('execute AH0010010button1/execute.onLoad');
  var targetComponent = document.getElementById('expj-AH0010010-AH0010010button1-execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0010010-AH0010010button1-execute" name="execute" class="AH0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AH0010010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AH0010010-AH0010010button0">
expj.AH0010010.AH0010010button0 = {};
expj.AH0010010.AH0010010button0.executeAllOnDecision = function () {
  console.log('execute AH0010010button0.onDecision');
};
expj.AH0010010.AH0010010button0.executeOnLoad = function () {
  expj.AH0010010.AH0010010button0.executePScriptOnLoad();
};

expj.AH0010010.AH0010010button0.executePScriptOnLoad = function () {
  console.log('execute AH0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0010010-AH0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0010010-AH0010010button0-close">
expj.AH0010010.AH0010010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AH0010010.AH0010010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AH0010010');
};
expj.AH0010010.AH0010010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0010010.AH0010010button0.close['onClick' + i])) {
        expj.AH0010010.AH0010010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AH0010010.AH0010010button0.close.executeAllOnDecision = function () {
};
expj.AH0010010.AH0010010button0.close.executeOnLoad = function () {
  $('#expj-AH0010010-AH0010010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010010', 'AH0010010button0', 'close', this, 'Button');
    }
  });
  expj.AH0010010.AH0010010button0.close.executePScriptOnLoad();
};

expj.AH0010010.AH0010010button0.close.executePScriptOnLoad = function () {
  console.log('execute AH0010010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AH0010010-AH0010010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0010010-AH0010010button0-close" name="close" class="AH0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AH0010010 (END)-->
<%
MessageStruct msgStruct = aAH0010010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AH0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AH0010010)) {
  expj.common.treeInstanceMap.AH0010010 = {};
}
expj.common.treeInstanceMap.AH0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AH0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AH0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AH0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AH0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AH0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AH0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AH0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AH0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010010)) {
  expj.common.detailDialogMap.AH0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AH0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.AH0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AH0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AH0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AH0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AH0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AH0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AH0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AH0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AH0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AH0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AH0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AH0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AH0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AH0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AH0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AH0010010)) {
  expj.common.viewInstanceMap.AH0010010 = {};
}
expj.common.viewInstanceMap.AH0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.AH0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AH0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AH0010010.<%=viewId %>.init = function () {
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
    expj.AH0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AH0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AH0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AH0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AH0010010_init">
/**
 * AH0010010用のロード完了時初期化関数
 */
expj.AH0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AH0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AH0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AH0010010');
  expj.common.calendarInstanceMap.AH0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AH0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AH0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.AH0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AH0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AH0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AH0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AH0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AH0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AH0010010-<%=detailId %>');
<%
 }
%>
  try{expj.AH0010010.AH0010010form1.r_PLANT_TYPE1.executeOnLoad();}catch(e){};
  try{expj.AH0010010.AH0010010form1.h_RADIO_TYPE.executeOnLoad();}catch(e){};
  try{expj.AH0010010.AH0010010form1.r_PLANT_TYPE2.executeOnLoad();}catch(e){};
  try{expj.AH0010010.AH0010010button1.execute.executeOnLoad();}catch(e){};
  try{expj.AH0010010.AH0010010button0.close.executeOnLoad();}catch(e){};
  try{expj.AH0010010.AH0010010form1.executeOnLoad();}catch(e){};
  try{expj.AH0010010.AH0010010button1.executeOnLoad();}catch(e){};
  try{expj.AH0010010.AH0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AH0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AH0010010', 'AH0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AH0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AH0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.AH0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AH0010010', '<%=request.getContextPath() %>');
};

/**
 * AH0010010の全体onDecision処理
 */
expj.AH0010010.executeAllOnDecision = function () {
  expj.AH0010010.AH0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AH0010010_console">
expj.AH0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>