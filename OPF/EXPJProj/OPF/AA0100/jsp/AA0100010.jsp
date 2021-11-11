<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:23:04 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0100\AA0100010.html
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

休日メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0100/jsp/AA0100010.jsp,v $
$Author: geng-jia $	
$Revision: 1.9 $ $Date: 2017/02/22 02:03:58 $
********************************************************* --%>
<html>
<head>
<title>休日メンテナンス</title>
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

  <div id="expj-business-screen-AA0100010" data-screen="AA0100010" data-newdata="<%=aAA0100010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style=""></div><!--/td-->

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
              <script class="expj-script-AA0100010-AA0100010form1">
expj.AA0100010.AA0100010form1 = {};
// script1="onLoad;1;CALL;onDecision@0,1"
expj.AA0100010.AA0100010form1.onLoad1 = function () {
  console.log('AA0100010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHK;?AA0100010form1/*[eq]NORMAL[or]?AA0100010form1/*[eq]NOT_FOUND@*1,*6"
expj.AA0100010.AA0100010form1.onDecision0 = function () {
  console.log('AA0100010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0100010', 'AA0100010form1', '?AA0100010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0100010', 'AA0100010form1', '?AA0100010form1/*'), '[eq]', 'NOT_FOUND')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script3="child;1;CHK;?AA0100010form1/HOLIDAY_DATE[eq]SAME@*2,*6"
expj.AA0100010.AA0100010form1.child1 = function () {
  console.log('AA0100010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0100010', 'AA0100010form1', '?AA0100010form1/HOLIDAY_DATE'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script4="child;2;CHKRQ;?AA0100010view1/?[eq]SINGLE@*3,*4"
expj.AA0100010.AA0100010form1.child2 = function () {
  console.log('AA0100010form1 script4');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0100010', 'AA0100010form1', '?AA0100010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;3;UNMASK;_AA0100010button2/append,_AA0100010button2/modify,_AA0100010button2/erase"
expj.AA0100010.AA0100010form1.child3 = function () {
  console.log('AA0100010form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AA0100010', 'AA0100010form1', '_AA0100010button2/append');
expj.common.pscript.setUnMaskToReferenceComponent('AA0100010', 'AA0100010form1', '_AA0100010button2/modify');
expj.common.pscript.setUnMaskToReferenceComponent('AA0100010', 'AA0100010form1', '_AA0100010button2/erase');
};
// script6="child;4;UNMASK;_AA0100010button2/append@*5"
expj.AA0100010.AA0100010form1.child4 = function () {
  console.log('AA0100010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AA0100010', 'AA0100010form1', '_AA0100010button2/append');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script7="child;5;MASK;_AA0100010button2/modify,_AA0100010button2/erase"
expj.AA0100010.AA0100010form1.child5 = function () {
  console.log('AA0100010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AA0100010', 'AA0100010form1', '_AA0100010button2/modify');
expj.common.pscript.setMaskToReferenceComponent('AA0100010', 'AA0100010form1', '_AA0100010button2/erase');
};
// script8="child;6;MASK;_AA0100010button2/append,_AA0100010button2/modify,_AA0100010button2/erase"
expj.AA0100010.AA0100010form1.child6 = function () {
  console.log('AA0100010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AA0100010', 'AA0100010form1', '_AA0100010button2/append');
expj.common.pscript.setMaskToReferenceComponent('AA0100010', 'AA0100010form1', '_AA0100010button2/modify');
expj.common.pscript.setMaskToReferenceComponent('AA0100010', 'AA0100010form1', '_AA0100010button2/erase');
};
// script9="onDecision;1;CHKRQ;A@*7,*8"
expj.AA0100010.AA0100010form1.onDecision1 = function () {
  console.log('AA0100010form1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('AA0100010', 'A')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="child;7;UNMASK;_AA0100010button1/select"
expj.AA0100010.AA0100010form1.child7 = function () {
  console.log('AA0100010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AA0100010', 'AA0100010form1', '_AA0100010button1/select');
};
// script11="child;8;MASK;_AA0100010button1/select"
expj.AA0100010.AA0100010form1.child8 = function () {
  console.log('AA0100010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AA0100010', 'AA0100010form1', '_AA0100010button1/select');
};
expj.AA0100010.AA0100010form1.executeAllOnDecision = function () {
  console.log('execute AA0100010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100010.AA0100010form1['onDecision' + i])) {
        expj.AA0100010.AA0100010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0100010.AA0100010form1.executeOnLoad = function () {
  expj.AA0100010.AA0100010form1.executePScriptOnLoad();
};

expj.AA0100010.AA0100010form1.executePScriptOnLoad = function () {
  console.log('execute AA0100010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AA0100010.AA0100010form1['onLoad' + i])) {
      expj.AA0100010.AA0100010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0100010-AA0100010form1" action="AA0100010Servlet" name="AA0100010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0100010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0102",rb)%></span><!-- 年 --></div><!--/td-->
<script class="expj-script-AA0100010-AA0100010form1-HOLIDAY_DATE">
expj.AA0100010.AA0100010form1.HOLIDAY_DATE = {};
expj.AA0100010.AA0100010form1.HOLIDAY_DATE.executeAllOnDecision = function () {
  console.log('execute AA0100010form1/HOLIDAY_DATE.onDecision');
  expj.AA0100010.AA0100010form1.executeAllOnDecision();
  expj.AA0100010.executeAllOnDecision();
};
expj.AA0100010.AA0100010form1.HOLIDAY_DATE.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100010form1-HOLIDAY_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0100010', 'AA0100010form1', 'HOLIDAY_DATE', this);
  });
  expj.AA0100010.AA0100010form1.HOLIDAY_DATE.executePScriptOnLoad();
};

expj.AA0100010.AA0100010form1.HOLIDAY_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0100010form1/HOLIDAY_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100010form1-HOLIDAY_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0100010-AA0100010form1-HOLIDAY_DATE" name="HOLIDAY_DATE" class="AA0100010-focus-move expj-align-right required-value expj-AA0100010-required-A" style="width:150px;" data-kind="OBT_N" value="<%= TypeConverter.sanitizer(aAA0100010Struct.getHOLIDAY_DATE()) %>" maxlength="4" ></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0100010-AA0100010button1">
expj.AA0100010.AA0100010button1 = {};
expj.AA0100010.AA0100010button1.executeAllOnDecision = function () {
  console.log('execute AA0100010button1.onDecision');
};
expj.AA0100010.AA0100010button1.executeOnLoad = function () {
  expj.AA0100010.AA0100010button1.executePScriptOnLoad();
};

expj.AA0100010.AA0100010button1.executePScriptOnLoad = function () {
  console.log('execute AA0100010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0100010-AA0100010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0100010-AA0100010button1-select">
expj.AA0100010.AA0100010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0100010form1/*@AA0100010Servlet"
expj.AA0100010.AA0100010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0100010', 'AA0100010button1', '_AA0100010form1/*', 'AA0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0100010', response);
expj.common.updateBusinessScreenTab('AA0100010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0100010.AA0100010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100010.AA0100010button1.select['onClick' + i])) {
        expj.AA0100010.AA0100010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AA0100010.AA0100010button1.select.executeAllOnDecision = function () {
};
expj.AA0100010.AA0100010button1.select.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100010', 'AA0100010button1', 'select', this, 'Button');
    }
  });
  expj.AA0100010.AA0100010button1.select.executePScriptOnLoad();
};

expj.AA0100010.AA0100010button1.select.executePScriptOnLoad = function () {
  console.log('execute AA0100010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100010-AA0100010button1-select" name="select" class="AA0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0100010-AA0100010view1">
expj.AA0100010.AA0100010view1 = {};
expj.AA0100010.AA0100010view1.executeAllOnClick = function () {
};
expj.AA0100010.AA0100010view1.executeAllOnDecision = function () {
  console.log('execute AA0100010view1.onDecision');
};
expj.AA0100010.AA0100010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0100010view1", "expj.AA0100010.AA0100010view1.executeAllOnClick");
%>
  expj.AA0100010.AA0100010view1.executePScriptOnLoad();
};

expj.AA0100010.AA0100010view1.executePScriptOnLoad = function () {
  console.log('execute AA0100010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0100010-AA0100010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0100010view1_Id = "AA0100010view1";
 String AA0100010view1_select = "single";
 String AA0100010view1_sortable = "true";
 String AA0100010view1_resize = "true";
 String AA0100010view1_scroll = "true";
 StringBuffer AA0100010view1_HB = new StringBuffer();
 StringBuffer AA0100010view1_DB = new StringBuffer();
%>
<%
 AA0100010view1_select = "single";
 AA0100010view1_sortable = "true";
 AA0100010view1_resize = "true";
 AA0100010view1_scroll = "true";
%>
<%
 AA0100010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0100010view1_sortable).append("}").append(",");
%>
     
<%
AA0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0103",rb))).append("', 'name':'HOLIDAY_MMDD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0100010view1_sortable).append("}").append(",");
AA0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'400px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.HOLIDAY_NAME_1",rb))).append("', 'name':'p_HOLIDAY_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0100010view1_sortable).append("}").append(",");
AA0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'w_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0100010view1_sortable).append("}").append(",");
AA0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'p_HOLIDAY_DATE', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0100010view1_sortable).append("}").append(",");
%>
<%
 int aAA0100010StructLength = aAA0100010Control.getListsize();
 final AA0100010Struct structBackup = aAA0100010Struct;
 aAA0100010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0100010StructLength; ++loopCount) {
  if((aAA0100010Struct = (AA0100010Struct) aAA0100010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0100010Struct", aAA0100010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0100010view1_DB.append("[");
 AA0100010view1_DB.append(loopCount);
 AA0100010view1_DB.append(",").append("'<span id=\"expj-AA0100010-AA0100010view1-HOLIDAY_MMDD-").append(loopCount).append("\" class=\"expj-label expj-AA0100010-AA0100010view1-HOLIDAY_MMDD\" data-name=\"HOLIDAY_MMDD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0100010Struct.getHOLIDAY_MMDD())).append("</span>'");
 AA0100010view1_DB.append(",").append("'<span id=\"expj-AA0100010-AA0100010view1-p_HOLIDAY_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0100010-AA0100010view1-p_HOLIDAY_NAME\" data-name=\"p_HOLIDAY_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0100010Struct.getp_HOLIDAY_NAME())).append("</span>'");
 AA0100010view1_DB.append(",").append("'<span id=\"expj-AA0100010-AA0100010view1-w_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AA0100010-AA0100010view1-w_MODIFY_COUNT\" data-name=\"w_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0100010Struct.getw_MODIFY_COUNT())).append("</span>'");
 AA0100010view1_DB.append(",").append("'<span id=\"expj-AA0100010-AA0100010view1-p_HOLIDAY_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0100010-AA0100010view1-p_HOLIDAY_DATE\" data-name=\"p_HOLIDAY_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0100010Struct.getp_HOLIDAY_DATE())).append("</span>'");
 AA0100010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0100010StructLength) {
   AA0100010view1_DB.append(",");
  }
 }
 aAA0100010Struct = structBackup;
 viewIdList.add(AA0100010view1_Id);
 viewSelectList.add(AA0100010view1_select);
 viewResizeList.add(AA0100010view1_resize);
 viewScrollList.add(AA0100010view1_scroll);
 viewHeaderDataList.add(AA0100010view1_HB);
 viewBodyDataList.add(AA0100010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AA0100010-AA0100010button2">
expj.AA0100010.AA0100010button2 = {};
expj.AA0100010.AA0100010button2.executeAllOnDecision = function () {
  console.log('execute AA0100010button2.onDecision');
};
expj.AA0100010.AA0100010button2.executeOnLoad = function () {
  expj.AA0100010.AA0100010button2.executePScriptOnLoad();
};

expj.AA0100010.AA0100010button2.executePScriptOnLoad = function () {
  console.log('execute AA0100010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0100010-AA0100010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0100010-AA0100010button2-append">
expj.AA0100010.AA0100010button2.append = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0100010form1/*@AA0100010Servlet"
expj.AA0100010.AA0100010button2.append.onClick0 = function () {
  console.log('append script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0100010', 'AA0100010button2', '_AA0100010form1/*', 'AA0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0100010', response);
expj.common.changeBusinessScreenTab('AA0100010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0100010.AA0100010button2.append.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100010.AA0100010button2.append['onClick' + i])) {
        expj.AA0100010.AA0100010button2.append['onClick' + i]();
      }
    }
  }
};
expj.AA0100010.AA0100010button2.append.executeAllOnDecision = function () {
};
expj.AA0100010.AA0100010button2.append.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100010button2-append').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100010', 'AA0100010button2', 'append', this, 'Button');
    }
  });
  expj.AA0100010.AA0100010button2.append.executePScriptOnLoad();
};

expj.AA0100010.AA0100010button2.append.executePScriptOnLoad = function () {
  console.log('execute AA0100010button2/append.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100010button2-append');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100010-AA0100010button2-append" name="append" class="AA0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AA0100010-AA0100010button2-modify">
expj.AA0100010.AA0100010button2.modify = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0100010view1/+@AA0100010Servlet"
expj.AA0100010.AA0100010button2.modify.onClick0 = function () {
  console.log('modify script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0100010', 'AA0100010button2', '_AA0100010view1/+', 'AA0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0100010', response);
expj.common.changeBusinessScreenTab('AA0100010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0100010.AA0100010button2.modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100010.AA0100010button2.modify['onClick' + i])) {
        expj.AA0100010.AA0100010button2.modify['onClick' + i]();
      }
    }
  }
};
expj.AA0100010.AA0100010button2.modify.executeAllOnDecision = function () {
};
expj.AA0100010.AA0100010button2.modify.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100010button2-modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100010', 'AA0100010button2', 'modify', this, 'Button');
    }
  });
  expj.AA0100010.AA0100010button2.modify.executePScriptOnLoad();
};

expj.AA0100010.AA0100010button2.modify.executePScriptOnLoad = function () {
  console.log('execute AA0100010button2/modify.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100010button2-modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100010-AA0100010button2-modify" name="modify" class="AA0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AA0100010-AA0100010button2-erase">
expj.AA0100010.AA0100010button2.erase = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0100010view1/+@AA0100010Servlet,,$ZZ07004"
expj.AA0100010.AA0100010button2.erase.onClick0 = function () {
  console.log('erase script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0100010', 'AA0100010button2', '_AA0100010view1/+', 'AA0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0100010', response);
expj.common.updateBusinessScreenTab('AA0100010', contents);
};
expj.common.pscript.callConfirm('AA0100010', 'AA0100010button2', 'ZZ07004', okEvent);
};
expj.AA0100010.AA0100010button2.erase.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100010.AA0100010button2.erase['onClick' + i])) {
        expj.AA0100010.AA0100010button2.erase['onClick' + i]();
      }
    }
  }
};
expj.AA0100010.AA0100010button2.erase.executeAllOnDecision = function () {
};
expj.AA0100010.AA0100010button2.erase.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100010button2-erase').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100010', 'AA0100010button2', 'erase', this, 'Button');
    }
  });
  expj.AA0100010.AA0100010button2.erase.executePScriptOnLoad();
};

expj.AA0100010.AA0100010button2.erase.executePScriptOnLoad = function () {
  console.log('execute AA0100010button2/erase.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100010button2-erase');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100010-AA0100010button2-erase" name="erase" class="AA0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
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
<span class="version">AA0100010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0100010-AA0100010button0">
expj.AA0100010.AA0100010button0 = {};
expj.AA0100010.AA0100010button0.executeAllOnDecision = function () {
  console.log('execute AA0100010button0.onDecision');
};
expj.AA0100010.AA0100010button0.executeOnLoad = function () {
  expj.AA0100010.AA0100010button0.executePScriptOnLoad();
};

expj.AA0100010.AA0100010button0.executePScriptOnLoad = function () {
  console.log('execute AA0100010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0100010-AA0100010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0100010-AA0100010button0-clear">
expj.AA0100010.AA0100010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0100010Servlet,,$ZZ07008"
expj.AA0100010.AA0100010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0100010', 'AA0100010button0', '', 'AA0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0100010', response);
expj.common.updateBusinessScreenTab('AA0100010', contents);
};
expj.common.pscript.callConfirm('AA0100010', 'AA0100010button0', 'ZZ07008', okEvent);
};
expj.AA0100010.AA0100010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100010.AA0100010button0.clear['onClick' + i])) {
        expj.AA0100010.AA0100010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AA0100010.AA0100010button0.clear.executeAllOnDecision = function () {
};
expj.AA0100010.AA0100010button0.clear.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100010', 'AA0100010button0', 'clear', this, 'Button');
    }
  });
  expj.AA0100010.AA0100010button0.clear.executePScriptOnLoad();
};

expj.AA0100010.AA0100010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AA0100010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100010-AA0100010button0-clear" name="clear" class="AA0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0100010-AA0100010button0-close">
expj.AA0100010.AA0100010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AA0100010.AA0100010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AA0100010');
};
expj.AA0100010.AA0100010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0100010.AA0100010button0.close['onClick' + i])) {
        expj.AA0100010.AA0100010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AA0100010.AA0100010button0.close.executeAllOnDecision = function () {
};
expj.AA0100010.AA0100010button0.close.executeOnLoad = function () {
  $('#expj-AA0100010-AA0100010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0100010', 'AA0100010button0', 'close', this, 'Button');
    }
  });
  expj.AA0100010.AA0100010button0.close.executePScriptOnLoad();
};

expj.AA0100010.AA0100010button0.close.executePScriptOnLoad = function () {
  console.log('execute AA0100010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AA0100010-AA0100010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0100010-AA0100010button0-close" name="close" class="AA0100010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0100010 (END)-->
<%
MessageStruct msgStruct = aAA0100010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
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
  try{expj.AA0100010.AA0100010form1.HOLIDAY_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100010button1.select.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100010button2.append.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100010button2.modify.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100010button2.erase.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100010button0.close.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100010form1.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100010button1.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100010view1.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100010button2.executeOnLoad();}catch(e){};
  try{expj.AA0100010.AA0100010button0.executeOnLoad();}catch(e){};
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
  expj.AA0100010.AA0100010form1.executeAllOnDecision();
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