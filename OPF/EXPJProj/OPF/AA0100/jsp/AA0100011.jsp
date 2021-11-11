<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:23:07 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0100\AA0100011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0100.*" %>
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
<jsp:useBean id="aAA0100010Control" class="com.nec.jp.orteus.metamorBase.AA0100.AA0100010Control" scope="request"/>
<jsp:useBean id="aAA0100010Struct" class="com.nec.jp.orteus.metamorBase.AA0100.AA0100010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

休日メンテナンスサブ1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0100/jsp/AA0100011.jsp,v $
$Author: geng-jia $    
$Revision: 1.9 $ $Date: 2017/02/22 02:03:58 $
********************************************************* --%>
<html>
<head>
<title>休日メンテナンスサブ1</title>
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
<script class="expj-script-AA0100010_init">
  // AA0100010名前空間
  expj.AA0100010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

<% String CallButton = aAA0100010Control.getButton(); %>
  <div id="expj-business-screen-AA0100010" data-screen="AA0100011" data-newdata="<%=aAA0100010Control.isNewData() %>">
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
              <script class="expj-script-AA0100010-AA0100011form1">
expj.AA0100010.AA0100011form1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0100010.AA0100011form1.onLoad0 = function () {
  console.log('AA0100011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="onLoad;1;CALL;onDecision@0"
expj.AA0100010.AA0100011form1.onLoad1 = function () {
  console.log('AA0100011form1 script2');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script3="child;0;CHK;<%=CallButton%>[eq]append[or]<%=CallButton%>[eq]sub1Insert@*1,*2"
expj.AA0100010.AA0100011form1.child0 = function () {
  console.log('AA0100011form1 script3');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'append') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'sub1Insert')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;1;MASK;_AA0100011button1/sub1Update"
expj.AA0100010.AA0100011form1.child1 = function () {
  console.log('AA0100011form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0100010', 'AA0100011form1', '_AA0100011button1/sub1Update');
};
// script5="child;2;MASK;_AA0100011button1/sub1Insert"
expj.AA0100010.AA0100011form1.child2 = function () {
  console.log('AA0100011form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AA0100010', 'AA0100011form1', '_AA0100011button1/sub1Insert');
};
// script6="onDecision;0;CHKRQ;A@*3,*6"
expj.AA0100010.AA0100011form1.onDecision0 = function () {
  console.log('AA0100011form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AA0100010', 'A')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script7="child;3;CHK;<%=CallButton%>[eq]append[or]<%=CallButton%>[eq]sub1Insert@*4,*5"
expj.AA0100010.AA0100011form1.child3 = function () {
  console.log('AA0100011form1 script7');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'append') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'sub1Insert')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_AA0100011button1/sub1Insert"
expj.AA0100010.AA0100011form1.child4 = function () {
  console.log('AA0100011form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AA0100010', 'AA0100011form1', '_AA0100011button1/sub1Insert');
};
// script9="child;5;UNMASK;_AA0100011button1/sub1Update"
expj.AA0100010.AA0100011form1.child5 = function () {
  console.log('AA0100011form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AA0100010', 'AA0100011form1', '_AA0100011button1/sub1Update');
};
// script10="child;6;MASK;_AA0100011button1/sub1Insert,_AA0100011button1/sub1Update"
expj.AA0100010.AA0100011form1.child6 = function () {
  console.log('AA0100011form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AA0100010', 'AA0100011form1', '_AA0100011button1/sub1Insert');
expj.common.pscript.setMaskToReferenceComponent('AA0100010', 'AA0100011form1', '_AA0100011button1/sub1Update');
};
expj.AA0100010.AA0100011form1.executeAllOnDecision = function () {
  console.log('execute AA0100011form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100010.AA0100011form1['onDecision' + i])) {
        expj.AA0100010.AA0100011form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0100010.AA0100011form1.executeOnLoad = function () {
  expj.AA0100010.AA0100011form1.executePScriptOnLoad();
};

expj.AA0100010.AA0100011form1.executePScriptOnLoad = function () {
  console.log('execute AA0100011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AA0100010.AA0100011form1['onLoad' + i])) {
      expj.AA0100010.AA0100011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0100010-AA0100011form1" action="AA0100010Servlet" name="AA0100011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0103",rb)%></span><!-- 月日 --></div><!--/td-->
<script class="expj-script-AA0100010-AA0100011form1-HOLIDAY_MMDD">
expj.AA0100010.AA0100011form1.HOLIDAY_MMDD = {};
expj.AA0100010.AA0100011form1.HOLIDAY_MMDD.executeAllOnDecision = function () {
  console.log('execute AA0100011form1/HOLIDAY_MMDD.onDecision');
  expj.AA0100010.AA0100011form1.executeAllOnDecision();
  expj.AA0100010.executeAllOnDecision();
};
expj.AA0100010.AA0100011form1.HOLIDAY_MMDD.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100011form1-HOLIDAY_MMDD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100010', 'AA0100011form1', 'HOLIDAY_MMDD', this);
  });
  expj.AA0100010.AA0100011form1.HOLIDAY_MMDD.executePScriptOnLoad();
};

expj.AA0100010.AA0100011form1.HOLIDAY_MMDD.executePScriptOnLoad = function () {
  console.log('execute AA0100011form1/HOLIDAY_MMDD.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100011form1-HOLIDAY_MMDD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0100010-AA0100011form1-HOLIDAY_MMDD" name="HOLIDAY_MMDD" class="AA0100010-focus-move  required-value expj-AA0100010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_MD" value="<%= TypeConverter.sanitizer(aAA0100010Struct.getHOLIDAY_MMDD()) %>" maxlength="2147483647" ></div><!--/td-->
<input type="hidden" id="expj-AA0100010-AA0100011form1-p_HOLIDAY_DATE" name="p_HOLIDAY_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0100010Struct.getp_HOLIDAY_DATE()) %>">
<script class="expj-script-AA0100010-AA0100011form1-p_HOLIDAY_DATE">
expj.AA0100010.AA0100011form1.p_HOLIDAY_DATE = {};
expj.AA0100010.AA0100011form1.p_HOLIDAY_DATE.executeAllOnDecision = function () {
  console.log('execute AA0100011form1/p_HOLIDAY_DATE.onDecision');
  expj.AA0100010.AA0100011form1.executeAllOnDecision();
  expj.AA0100010.executeAllOnDecision();
};
expj.AA0100010.AA0100011form1.p_HOLIDAY_DATE.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100011form1-p_HOLIDAY_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100010', 'AA0100011form1', 'p_HOLIDAY_DATE', this);
  });
  expj.AA0100010.AA0100011form1.p_HOLIDAY_DATE.executePScriptOnLoad();
};

expj.AA0100010.AA0100011form1.p_HOLIDAY_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0100011form1/p_HOLIDAY_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100011form1-p_HOLIDAY_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0100010-AA0100011form1-HOLIDAY_DATE" name="HOLIDAY_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0100010Struct.getHOLIDAY_DATE()) %>">
<script class="expj-script-AA0100010-AA0100011form1-HOLIDAY_DATE">
expj.AA0100010.AA0100011form1.HOLIDAY_DATE = {};
expj.AA0100010.AA0100011form1.HOLIDAY_DATE.executeAllOnDecision = function () {
  console.log('execute AA0100011form1/HOLIDAY_DATE.onDecision');
  expj.AA0100010.AA0100011form1.executeAllOnDecision();
  expj.AA0100010.executeAllOnDecision();
};
expj.AA0100010.AA0100011form1.HOLIDAY_DATE.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100011form1-HOLIDAY_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100010', 'AA0100011form1', 'HOLIDAY_DATE', this);
  });
  expj.AA0100010.AA0100011form1.HOLIDAY_DATE.executePScriptOnLoad();
};

expj.AA0100010.AA0100011form1.HOLIDAY_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0100011form1/HOLIDAY_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100011form1-HOLIDAY_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0100010-AA0100011form1-w_MODIFY_COUNT" name="w_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0100010Struct.getw_MODIFY_COUNT()) %>">
<script class="expj-script-AA0100010-AA0100011form1-w_MODIFY_COUNT">
expj.AA0100010.AA0100011form1.w_MODIFY_COUNT = {};
expj.AA0100010.AA0100011form1.w_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AA0100011form1/w_MODIFY_COUNT.onDecision');
  expj.AA0100010.AA0100011form1.executeAllOnDecision();
  expj.AA0100010.executeAllOnDecision();
};
expj.AA0100010.AA0100011form1.w_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100011form1-w_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100010', 'AA0100011form1', 'w_MODIFY_COUNT', this);
  });
  expj.AA0100010.AA0100011form1.w_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AA0100010.AA0100011form1.w_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AA0100011form1/w_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100011form1-w_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0100010-AA0100011form2">
expj.AA0100010.AA0100011form2 = {};
expj.AA0100010.AA0100011form2.executeAllOnDecision = function () {
  console.log('execute AA0100011form2.onDecision');
};
expj.AA0100010.AA0100011form2.executeOnLoad = function () {
  expj.AA0100010.AA0100011form2.executePScriptOnLoad();
};

expj.AA0100010.AA0100011form2.executePScriptOnLoad = function () {
  console.log('execute AA0100011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0100010-AA0100011form2" action="AA0100010Servlet" name="AA0100011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HOLIDAY_NAME_1",rb)%></span><!-- 祝祭日名称 --></div><!--/td-->
<script class="expj-script-AA0100010-AA0100011form2-p_HOLIDAY_NAME">
expj.AA0100010.AA0100011form2.p_HOLIDAY_NAME = {};
expj.AA0100010.AA0100011form2.p_HOLIDAY_NAME.executeAllOnDecision = function () {
  console.log('execute AA0100011form2/p_HOLIDAY_NAME.onDecision');
  expj.AA0100010.AA0100011form2.executeAllOnDecision();
  expj.AA0100010.executeAllOnDecision();
};
expj.AA0100010.AA0100011form2.p_HOLIDAY_NAME.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100011form2-p_HOLIDAY_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100010', 'AA0100011form2', 'p_HOLIDAY_NAME', this);
  });
  expj.AA0100010.AA0100011form2.p_HOLIDAY_NAME.executePScriptOnLoad();
};

expj.AA0100010.AA0100011form2.p_HOLIDAY_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0100011form2/p_HOLIDAY_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100011form2-p_HOLIDAY_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AA0100010-AA0100011form2-p_HOLIDAY_NAME" name="p_HOLIDAY_NAME" class="AA0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0100010Struct.getp_HOLIDAY_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AA0100010-AA0100011button1">
expj.AA0100010.AA0100011button1 = {};
expj.AA0100010.AA0100011button1.executeAllOnDecision = function () {
  console.log('execute AA0100011button1.onDecision');
};
expj.AA0100010.AA0100011button1.executeOnLoad = function () {
  expj.AA0100010.AA0100011button1.executePScriptOnLoad();
};

expj.AA0100010.AA0100011button1.executePScriptOnLoad = function () {
  console.log('execute AA0100011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0100010-AA0100011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0100010-AA0100011button1-sub1Insert">
expj.AA0100010.AA0100011button1.sub1Insert = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0100011form1/*,_AA0100011form2/*@AA0100010Servlet,,$ZZ07001"
expj.AA0100010.AA0100011button1.sub1Insert.onClick0 = function () {
  console.log('sub1Insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0100010', 'AA0100011button1', '_AA0100011form1/*,_AA0100011form2/*', 'AA0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0100010', response);
expj.common.changeBusinessScreenTab('AA0100010', contents);
};
expj.common.pscript.callConfirm('AA0100010', 'AA0100011button1', 'ZZ07001', okEvent);
};
expj.AA0100010.AA0100011button1.sub1Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100010.AA0100011button1.sub1Insert['onClick' + i])) {
        expj.AA0100010.AA0100011button1.sub1Insert['onClick' + i]();
      }
    }
  }
};
expj.AA0100010.AA0100011button1.sub1Insert.executeAllOnDecision = function () {
};
expj.AA0100010.AA0100011button1.sub1Insert.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100011button1-sub1Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100010', 'AA0100011button1', 'sub1Insert', this, 'Button');
    }
  });
  expj.AA0100010.AA0100011button1.sub1Insert.executePScriptOnLoad();
};

expj.AA0100010.AA0100011button1.sub1Insert.executePScriptOnLoad = function () {
  console.log('execute AA0100011button1/sub1Insert.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100011button1-sub1Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100010-AA0100011button1-sub1Insert" name="sub1Insert" class="AA0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AA0100010-AA0100011button1-sub1Update">
expj.AA0100010.AA0100011button1.sub1Update = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0100011form1/*,_AA0100011form2/*@AA0100010Servlet,,$ZZ07003"
expj.AA0100010.AA0100011button1.sub1Update.onClick0 = function () {
  console.log('sub1Update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0100010', 'AA0100011button1', '_AA0100011form1/*,_AA0100011form2/*', 'AA0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0100010', response);
expj.common.changeBusinessScreenTab('AA0100010', contents);
};
expj.common.pscript.callConfirm('AA0100010', 'AA0100011button1', 'ZZ07003', okEvent);
};
expj.AA0100010.AA0100011button1.sub1Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100010.AA0100011button1.sub1Update['onClick' + i])) {
        expj.AA0100010.AA0100011button1.sub1Update['onClick' + i]();
      }
    }
  }
};
expj.AA0100010.AA0100011button1.sub1Update.executeAllOnDecision = function () {
};
expj.AA0100010.AA0100011button1.sub1Update.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100011button1-sub1Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100010', 'AA0100011button1', 'sub1Update', this, 'Button');
    }
  });
  expj.AA0100010.AA0100011button1.sub1Update.executePScriptOnLoad();
};

expj.AA0100010.AA0100011button1.sub1Update.executePScriptOnLoad = function () {
  console.log('execute AA0100011button1/sub1Update.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100011button1-sub1Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100010-AA0100011button1-sub1Update" name="sub1Update" class="AA0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0100011 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AA0100010-AA0100011button0">
expj.AA0100010.AA0100011button0 = {};
expj.AA0100010.AA0100011button0.executeAllOnDecision = function () {
  console.log('execute AA0100011button0.onDecision');
};
expj.AA0100010.AA0100011button0.executeOnLoad = function () {
  expj.AA0100010.AA0100011button0.executePScriptOnLoad();
};

expj.AA0100010.AA0100011button0.executePScriptOnLoad = function () {
  console.log('execute AA0100011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0100010-AA0100011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0100010-AA0100011button0-cancelSub1">
expj.AA0100010.AA0100011button0.cancelSub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>@AA0100010Servlet,,$ZZ07013"
expj.AA0100010.AA0100011button0.cancelSub1.onClick0 = function () {
  console.log('cancelSub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0100010', 'AA0100011button0', '', 'AA0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0100010', response);
expj.common.changeBusinessScreenTab('AA0100010', contents);
};
expj.common.pscript.callConfirm('AA0100010', 'AA0100011button0', 'ZZ07013', okEvent);
};
expj.AA0100010.AA0100011button0.cancelSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100010.AA0100011button0.cancelSub1['onClick' + i])) {
        expj.AA0100010.AA0100011button0.cancelSub1['onClick' + i]();
      }
    }
  }
};
expj.AA0100010.AA0100011button0.cancelSub1.executeAllOnDecision = function () {
};
expj.AA0100010.AA0100011button0.cancelSub1.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100011button0-cancelSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100010', 'AA0100011button0', 'cancelSub1', this, 'Button');
    }
  });
  expj.AA0100010.AA0100011button0.cancelSub1.executePScriptOnLoad();
};

expj.AA0100010.AA0100011button0.cancelSub1.executePScriptOnLoad = function () {
  console.log('execute AA0100011button0/cancelSub1.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100011button0-cancelSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100010-AA0100011button0-cancelSub1" name="cancelSub1" class="AA0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0100010 (END)-->
<% MessageStruct msgStruct = aAA0100010Control.getMessage(); %><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0100010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0100010)) {
  expj.common.treeInstanceMap.AA0100010 = {};
}
expj.common.treeInstanceMap.AA0100010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0100010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0100010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0100010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0100010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0100010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0100010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0100010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0100010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0100010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0100010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0100010)) {
  expj.common.detailDialogMap.AA0100010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0100010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0100010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0100010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0100010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0100010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0100010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0100010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0100010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0100010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0100010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0100010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0100010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0100010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0100010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0100010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0100010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0100010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0100010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0100010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0100010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0100010)) {
  expj.common.viewInstanceMap.AA0100010 = {};
}
expj.common.viewInstanceMap.AA0100010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0100010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0100010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0100010.<%=viewId %>.init = function () {
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
    expj.AA0100010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0100010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0100010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0100010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0100010_init">
/**
 * AA0100010用のロード完了時初期化関数
 */
expj.AA0100010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0100010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0100010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0100010');
  expj.common.calendarInstanceMap.AA0100010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0100010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0100010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0100010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0100010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0100010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0100010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0100010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0100010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0100010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0100010.AA0100011form1.HOLIDAY_MMDD.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100011form1.p_HOLIDAY_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100011form1.HOLIDAY_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100011form1.w_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100011form2.p_HOLIDAY_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100011button1.sub1Insert.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100011button1.sub1Update.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100011button0.cancelSub1.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100011form1.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100011form2.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100011button1.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0100010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0100010', 'AA0100010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0100010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0100010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0100010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0100010', '<%=request.getContextPath() %>');
};

/**
 * AA0100010の全体onDecision処理
 */
expj.AA0100010.executeAllOnDecision = function () {
  expj.AA0100010.AA0100011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0100010_console">
expj.AA0100010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>