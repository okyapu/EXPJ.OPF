<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:47:04 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AN0070\AN0070010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AN0070.*" %>
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
<jsp:useBean id="aAN0070010Control" class="com.nec.jp.orteus.metamorBase.AN0070.AN0070010Control" scope="request"/>
<jsp:useBean id="aAN0070010Struct" class="com.nec.jp.orteus.metamorBase.AN0070.AN0070010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

生産計画期間パラメータメンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0070/jsp/AN0070010.jsp,v $
$Author: geng-jia $
$Revision: 1.7 $ $Date: 2017/02/22 02:06:26 $
********************************************************* --%>
<html>
<head>
<title>生産計画期間パラメータメンテナンス</title>
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
<script class="expj-script-AN0070010_init">
  // AN0070010名前空間
  expj.AN0070010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AN0070010" data-screen="AN0070010" data-newdata="<%=aAN0070010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px">
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

    <div class="expj-tr expjDynamicHeight" style="">
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);height:100%;"> <div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2-->
          <div class="expj-tr" style="width:100%;height:0px;display:none;">

            <div class="expj-td frame01"></div><!--/td-->

            <div class="expj-td frame02"></div><!--/td-->

            <div class="expj-td frame03"></div><!--/td-->

          </div><!--/tr-->

          <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">

            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style="height:100%;">
              <script class="expj-script-AN0070010-AN0070010view1">
expj.AN0070010.AN0070010view1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AN0070010.AN0070010view1.onLoad0 = function () {
  console.log('AN0070010view1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;?AN0070010view1/*[eq]NORMAL@*0,*1"
expj.AN0070010.AN0070010view1.onDecision0 = function () {
  console.log('AN0070010view1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0070010', 'AN0070010view1', '?AN0070010view1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AN0070010button1/Update"
expj.AN0070010.AN0070010view1.child0 = function () {
  console.log('AN0070010view1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AN0070010', 'AN0070010view1', '_AN0070010button1/Update');
};
// script4="child;1;MASK;_AN0070010button1/Update"
expj.AN0070010.AN0070010view1.child1 = function () {
  console.log('AN0070010view1 script4');
expj.common.pscript.setMaskToReferenceComponent('AN0070010', 'AN0070010view1', '_AN0070010button1/Update');
};
expj.AN0070010.AN0070010view1.executeAllOnClick = function () {
};
expj.AN0070010.AN0070010view1.executeAllOnDecision = function () {
  console.log('execute AN0070010view1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0070010.AN0070010view1['onDecision' + i])) {
        expj.AN0070010.AN0070010view1['onDecision' + i]();
      }
    }
  }
};
expj.AN0070010.AN0070010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AN0070010view1", "expj.AN0070010.AN0070010view1.executeAllOnClick");
%>
  expj.AN0070010.AN0070010view1.executePScriptOnLoad();
};

expj.AN0070010.AN0070010view1.executePScriptOnLoad = function () {
  console.log('execute AN0070010view1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AN0070010.AN0070010view1['onLoad' + i])) {
      expj.AN0070010.AN0070010view1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AN0070010-AN0070010view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aAN0070010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String AN0070010view1_Id = "AN0070010view1";
 String AN0070010view1_select = "single";
 String AN0070010view1_sortable = "true";
 String AN0070010view1_resize = "true";
 String AN0070010view1_scroll = "true";
 StringBuffer AN0070010view1_HB = new StringBuffer();
 StringBuffer AN0070010view1_DB = new StringBuffer();
%>
<%
 AN0070010view1_select = "none";
 AN0070010view1_sortable = "false";
 AN0070010view1_resize = "true";
 AN0070010view1_scroll = "true";
%>
<%
 AN0070010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AN0070010view1_sortable).append("}").append(",");
%>
    <script class="expj-script-AN0070010-AN0070010view1-h_MODIFY_COUNT">
expj.AN0070010.AN0070010view1.h_MODIFY_COUNT = {};
expj.AN0070010.AN0070010view1.h_MODIFY_COUNT.executeAllOnClick = function () {
};
expj.AN0070010.AN0070010view1.h_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AN0070010view1/h_MODIFY_COUNT.onDecision');
  expj.AN0070010.AN0070010view1.executeAllOnDecision();
  expj.AN0070010.executeAllOnDecision();
};
expj.AN0070010.AN0070010view1.h_MODIFY_COUNT.executeOnLoad = function () {
  $('.expj-AN0070010-AN0070010view1-h_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0070010', 'AN0070010view1', 'h_MODIFY_COUNT', this);
  });
  expj.AN0070010.AN0070010view1.h_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AN0070010.AN0070010view1.h_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AN0070010view1/h_MODIFY_COUNT.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AN0070010-AN0070010view1-h_PRD_PLAN_PERIOD_TYP">
expj.AN0070010.AN0070010view1.h_PRD_PLAN_PERIOD_TYP = {};
expj.AN0070010.AN0070010view1.h_PRD_PLAN_PERIOD_TYP.executeAllOnClick = function () {
};
expj.AN0070010.AN0070010view1.h_PRD_PLAN_PERIOD_TYP.executeAllOnDecision = function () {
  console.log('execute AN0070010view1/h_PRD_PLAN_PERIOD_TYP.onDecision');
  expj.AN0070010.AN0070010view1.executeAllOnDecision();
  expj.AN0070010.executeAllOnDecision();
};
expj.AN0070010.AN0070010view1.h_PRD_PLAN_PERIOD_TYP.executeOnLoad = function () {
  $('.expj-AN0070010-AN0070010view1-h_PRD_PLAN_PERIOD_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0070010', 'AN0070010view1', 'h_PRD_PLAN_PERIOD_TYP', this);
  });
  expj.AN0070010.AN0070010view1.h_PRD_PLAN_PERIOD_TYP.executePScriptOnLoad();
};

expj.AN0070010.AN0070010view1.h_PRD_PLAN_PERIOD_TYP.executePScriptOnLoad = function () {
  console.log('execute AN0070010view1/h_PRD_PLAN_PERIOD_TYP.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AN0070010-AN0070010view1-PLAN_SPAN">
expj.AN0070010.AN0070010view1.PLAN_SPAN = {};
expj.AN0070010.AN0070010view1.PLAN_SPAN.executeAllOnClick = function () {
};
expj.AN0070010.AN0070010view1.PLAN_SPAN.executeAllOnDecision = function () {
  console.log('execute AN0070010view1/PLAN_SPAN.onDecision');
  expj.AN0070010.AN0070010view1.executeAllOnDecision();
  expj.AN0070010.executeAllOnDecision();
};
expj.AN0070010.AN0070010view1.PLAN_SPAN.executeOnLoad = function () {
  $('.expj-AN0070010-AN0070010view1-PLAN_SPAN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0070010', 'AN0070010view1', 'PLAN_SPAN', this);
  });
  expj.AN0070010.AN0070010view1.PLAN_SPAN.executePScriptOnLoad();
};

expj.AN0070010.AN0070010view1.PLAN_SPAN.executePScriptOnLoad = function () {
  console.log('execute AN0070010view1/PLAN_SPAN.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AN0070010-AN0070010view1-h_PLAN_SPAN">
expj.AN0070010.AN0070010view1.h_PLAN_SPAN = {};
expj.AN0070010.AN0070010view1.h_PLAN_SPAN.executeAllOnClick = function () {
};
expj.AN0070010.AN0070010view1.h_PLAN_SPAN.executeAllOnDecision = function () {
  console.log('execute AN0070010view1/h_PLAN_SPAN.onDecision');
  expj.AN0070010.AN0070010view1.executeAllOnDecision();
  expj.AN0070010.executeAllOnDecision();
};
expj.AN0070010.AN0070010view1.h_PLAN_SPAN.executeOnLoad = function () {
  $('.expj-AN0070010-AN0070010view1-h_PLAN_SPAN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0070010', 'AN0070010view1', 'h_PLAN_SPAN', this);
  });
  expj.AN0070010.AN0070010view1.h_PLAN_SPAN.executePScriptOnLoad();
};

expj.AN0070010.AN0070010view1.h_PLAN_SPAN.executePScriptOnLoad = function () {
  console.log('execute AN0070010view1/h_PLAN_SPAN.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AN0070010-AN0070010view1-PRD_PLAN_FINAL_DAY_TYP">
expj.AN0070010.AN0070010view1.PRD_PLAN_FINAL_DAY_TYP = {};
expj.AN0070010.AN0070010view1.PRD_PLAN_FINAL_DAY_TYP.executeAllOnClick = function () {
};
expj.AN0070010.AN0070010view1.PRD_PLAN_FINAL_DAY_TYP.executeAllOnDecision = function () {
  console.log('execute AN0070010view1/PRD_PLAN_FINAL_DAY_TYP.onDecision');
  expj.AN0070010.AN0070010view1.executeAllOnDecision();
  expj.AN0070010.executeAllOnDecision();
};
expj.AN0070010.AN0070010view1.PRD_PLAN_FINAL_DAY_TYP.executeOnLoad = function () {
  $('.expj-AN0070010-AN0070010view1-PRD_PLAN_FINAL_DAY_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AN0070010', 'AN0070010view1', 'PRD_PLAN_FINAL_DAY_TYP', this);
  });
  expj.AN0070010.AN0070010view1.PRD_PLAN_FINAL_DAY_TYP.executePScriptOnLoad();
};

expj.AN0070010.AN0070010view1.PRD_PLAN_FINAL_DAY_TYP.executePScriptOnLoad = function () {
  console.log('execute AN0070010view1/PRD_PLAN_FINAL_DAY_TYP.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AN0070010-AN0070010view1-h_PRD_PLAN_FINAL_DAY_TYP">
expj.AN0070010.AN0070010view1.h_PRD_PLAN_FINAL_DAY_TYP = {};
expj.AN0070010.AN0070010view1.h_PRD_PLAN_FINAL_DAY_TYP.executeAllOnClick = function () {
};
expj.AN0070010.AN0070010view1.h_PRD_PLAN_FINAL_DAY_TYP.executeAllOnDecision = function () {
  console.log('execute AN0070010view1/h_PRD_PLAN_FINAL_DAY_TYP.onDecision');
  expj.AN0070010.AN0070010view1.executeAllOnDecision();
  expj.AN0070010.executeAllOnDecision();
};
expj.AN0070010.AN0070010view1.h_PRD_PLAN_FINAL_DAY_TYP.executeOnLoad = function () {
  $('.expj-AN0070010-AN0070010view1-h_PRD_PLAN_FINAL_DAY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0070010', 'AN0070010view1', 'h_PRD_PLAN_FINAL_DAY_TYP', this);
  });
  expj.AN0070010.AN0070010view1.h_PRD_PLAN_FINAL_DAY_TYP.executePScriptOnLoad();
};

expj.AN0070010.AN0070010view1.h_PRD_PLAN_FINAL_DAY_TYP.executePScriptOnLoad = function () {
  console.log('execute AN0070010view1/h_PRD_PLAN_FINAL_DAY_TYP.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
AN0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0070010view1_sortable).append("}").append(",");
AN0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_PLAN_PERIOD_TYP",rb))).append("', 'name':'DISPLAY_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AN0070010view1_sortable).append("}").append(",");
AN0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_PRD_PLAN_PERIOD_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0070010view1_sortable).append("}").append(",");
AN0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLAN_SPAN",rb))).append("', 'name':'PLAN_SPAN', 'class':'expj-tooltip expj-view-cell-textinput expj-align-right', 'sortable':").append(AN0070010view1_sortable).append("}").append(",");
AN0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_PLAN_SPAN', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0070010view1_sortable).append("}").append(",");
AN0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_PLAN_FINAL_DAY_TYP",rb))).append("', 'name':'PRD_PLAN_FINAL_DAY_TYP', 'class':'expj-tooltip expj-view-cell-combobox', 'sortable':").append(AN0070010view1_sortable).append("}").append(",");
AN0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_PRD_PLAN_FINAL_DAY_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0070010view1_sortable).append("}").append(",");
%>
<%
 int aAN0070010StructLength = aAN0070010Control.getListsize();
 final AN0070010Struct structBackup = aAN0070010Struct;
 aAN0070010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAN0070010StructLength; ++loopCount) {
  if((aAN0070010Struct = (AN0070010Struct) aAN0070010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAN0070010Struct", aAN0070010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AN0070010view1_DB.append("[");
 AN0070010view1_DB.append(loopCount);
 AN0070010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AN0070010-AN0070010view1-h_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-AN0070010-AN0070010view1-h_MODIFY_COUNT AN0070010-focus-move\" data-name=\"h_MODIFY_COUNT\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAN0070010Struct.geth_MODIFY_COUNT())).append("\">'");
 AN0070010view1_DB.append(",").append("'<span id=\"expj-AN0070010-AN0070010view1-DISPLAY_NAME-").append(loopCount).append("\" class=\"expj-label expj-AN0070010-AN0070010view1-DISPLAY_NAME\" data-name=\"DISPLAY_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0070010Struct.getDISPLAY_NAME())).append("</span>'");
 AN0070010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AN0070010-AN0070010view1-h_PRD_PLAN_PERIOD_TYP-").append(loopCount).append("\" class=\"expj-AN0070010-AN0070010view1-h_PRD_PLAN_PERIOD_TYP AN0070010-focus-move\" data-name=\"h_PRD_PLAN_PERIOD_TYP\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAN0070010Struct.geth_PRD_PLAN_PERIOD_TYP())).append("\">'");
 AN0070010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AN0070010-AN0070010view1-PLAN_SPAN-").append(loopCount).append("\" class=\"expj-AN0070010-AN0070010view1-PLAN_SPAN AN0070010-focus-move\" data-name=\"PLAN_SPAN\" data-view=\"true\" style=\"text-align:right;\" maxlength=\"2147483647\" data-kind=\"").append("OBT_INTEGER_Z;4").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAN0070010Struct.getPLAN_SPAN())).append("\">'");
 AN0070010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AN0070010-AN0070010view1-h_PLAN_SPAN-").append(loopCount).append("\" class=\"expj-AN0070010-AN0070010view1-h_PLAN_SPAN AN0070010-focus-move\" data-name=\"h_PLAN_SPAN\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAN0070010Struct.geth_PLAN_SPAN())).append("\">'");
 AN0070010view1_DB.append(",").append("'<select id=\"expj-AN0070010-AN0070010view1-PRD_PLAN_FINAL_DAY_TYP-").append(loopCount).append("\" class=\"expj-AN0070010-AN0070010view1-PRD_PLAN_FINAL_DAY_TYP AN0070010-focus-move\" data-name=\"PRD_PLAN_FINAL_DAY_TYP\" data-view=\"true\">"); for(int i = 0, size = aAN0070010Control.getStruct().getList_PRD_PLAN_FINAL_DAY_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAN0070010Control.getStruct().getList_PRD_PLAN_FINAL_DAY_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAN0070010Control.getStruct().getList_PRD_PLAN_FINAL_DAY_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAN0070010Struct.getPRD_PLAN_FINAL_DAY_TYP()))) ? " selected" : "";    AN0070010view1_DB.append("<option value=\"").append(val).append("\"").append( selected ).append(">").append(name).append("</option>");  } AN0070010view1_DB.append("</select>'");
 AN0070010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AN0070010-AN0070010view1-h_PRD_PLAN_FINAL_DAY_TYP-").append(loopCount).append("\" class=\"expj-AN0070010-AN0070010view1-h_PRD_PLAN_FINAL_DAY_TYP AN0070010-focus-move\" data-name=\"h_PRD_PLAN_FINAL_DAY_TYP\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAN0070010Struct.geth_PRD_PLAN_FINAL_DAY_TYP())).append("\">'");
 AN0070010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAN0070010StructLength) {
   AN0070010view1_DB.append(",");
  }
 }
 aAN0070010Struct = structBackup;
 viewIdList.add(AN0070010view1_Id);
 viewSelectList.add(AN0070010view1_select);
 viewResizeList.add(AN0070010view1_resize);
 viewScrollList.add(AN0070010view1_scroll);
 viewHeaderDataList.add(AN0070010view1_HB);
 viewBodyDataList.add(AN0070010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AN0070010-AN0070010button1">
expj.AN0070010.AN0070010button1 = {};
expj.AN0070010.AN0070010button1.executeAllOnDecision = function () {
  console.log('execute AN0070010button1.onDecision');
};
expj.AN0070010.AN0070010button1.executeOnLoad = function () {
  expj.AN0070010.AN0070010button1.executePScriptOnLoad();
};

expj.AN0070010.AN0070010button1.executePScriptOnLoad = function () {
  console.log('execute AN0070010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0070010-AN0070010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0070010-AN0070010button1-Update">
expj.AN0070010.AN0070010button1.Update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0070010view1/*@AN0070010Servlet,,$ZZ07003"
expj.AN0070010.AN0070010button1.Update.onClick0 = function () {
  console.log('Update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0070010', 'AN0070010button1', '_AN0070010view1/*', 'AN0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0070010', response);
expj.common.updateBusinessScreenTab('AN0070010', contents);
};
expj.common.pscript.callConfirm('AN0070010', 'AN0070010button1', 'ZZ07003', okEvent);
};
expj.AN0070010.AN0070010button1.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0070010.AN0070010button1.Update['onClick' + i])) {
        expj.AN0070010.AN0070010button1.Update['onClick' + i]();
      }
    }
  }
};
expj.AN0070010.AN0070010button1.Update.executeAllOnDecision = function () {
};
expj.AN0070010.AN0070010button1.Update.executeOnLoad = function () {
  $('#expj-AN0070010-AN0070010button1-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0070010', 'AN0070010button1', 'Update', this, 'Button');
    }
  });
  expj.AN0070010.AN0070010button1.Update.executePScriptOnLoad();
};

expj.AN0070010.AN0070010button1.Update.executePScriptOnLoad = function () {
  console.log('execute AN0070010button1/Update.onLoad');
  var targetComponent = document.getElementById('expj-AN0070010-AN0070010button1-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0070010-AN0070010button1-Update" name="Update" class="AN0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 105px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AN0070010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AN0070010-AN0070010button0">
expj.AN0070010.AN0070010button0 = {};
expj.AN0070010.AN0070010button0.executeAllOnDecision = function () {
  console.log('execute AN0070010button0.onDecision');
};
expj.AN0070010.AN0070010button0.executeOnLoad = function () {
  expj.AN0070010.AN0070010button0.executePScriptOnLoad();
};

expj.AN0070010.AN0070010button0.executePScriptOnLoad = function () {
  console.log('execute AN0070010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0070010-AN0070010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0070010-AN0070010button0-Close">
expj.AN0070010.AN0070010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AN0070010.AN0070010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AN0070010');
};
expj.AN0070010.AN0070010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0070010.AN0070010button0.Close['onClick' + i])) {
        expj.AN0070010.AN0070010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AN0070010.AN0070010button0.Close.executeAllOnDecision = function () {
};
expj.AN0070010.AN0070010button0.Close.executeOnLoad = function () {
  $('#expj-AN0070010-AN0070010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0070010', 'AN0070010button0', 'Close', this, 'Button');
    }
  });
  expj.AN0070010.AN0070010button0.Close.executePScriptOnLoad();
};

expj.AN0070010.AN0070010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AN0070010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AN0070010-AN0070010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0070010-AN0070010button0-Close" name="Close" class="AN0070010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AN0070010 (END)-->
<%
  MessageStruct msgStruct = aAN0070010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AN0070010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AN0070010)) {
  expj.common.treeInstanceMap.AN0070010 = {};
}
expj.common.treeInstanceMap.AN0070010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AN0070010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AN0070010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AN0070010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AN0070010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AN0070010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AN0070010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AN0070010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AN0070010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AN0070010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AN0070010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0070010)) {
  expj.common.detailDialogMap.AN0070010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0070010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AN0070010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0070010.<%=detailId %>)) {
  expj.common.detailDialogMap.AN0070010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0070010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AN0070010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0070010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AN0070010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AN0070010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AN0070010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AN0070010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AN0070010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AN0070010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AN0070010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AN0070010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AN0070010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AN0070010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AN0070010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AN0070010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AN0070010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AN0070010)) {
  expj.common.viewInstanceMap.AN0070010 = {};
}
expj.common.viewInstanceMap.AN0070010.<%=viewId %> = {};
expj.common.viewInstanceMap.AN0070010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AN0070010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AN0070010.<%=viewId %>.init = function () {
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
    expj.AN0070010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AN0070010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AN0070010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AN0070010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AN0070010_init">
/**
 * AN0070010用のロード完了時初期化関数
 */
expj.AN0070010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AN0070010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AN0070010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AN0070010');
  expj.common.calendarInstanceMap.AN0070010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AN0070010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AN0070010.<%=detailId %>.init();
  expj.common.detailDialogMap.AN0070010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AN0070010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AN0070010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AN0070010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AN0070010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AN0070010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AN0070010-<%=detailId %>');
<%
 }
%>
  try{expj.AN0070010.AN0070010view1.h_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AN0070010.AN0070010view1.h_PRD_PLAN_PERIOD_TYP.executeOnLoad();}catch(e){};
  try{expj.AN0070010.AN0070010view1.PLAN_SPAN.executeOnLoad();}catch(e){};
  try{expj.AN0070010.AN0070010view1.h_PLAN_SPAN.executeOnLoad();}catch(e){};
  try{expj.AN0070010.AN0070010view1.PRD_PLAN_FINAL_DAY_TYP.executeOnLoad();}catch(e){};
  try{expj.AN0070010.AN0070010view1.h_PRD_PLAN_FINAL_DAY_TYP.executeOnLoad();}catch(e){};
  try{expj.AN0070010.AN0070010button1.Update.executeOnLoad();}catch(e){};
  try{expj.AN0070010.AN0070010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AN0070010.AN0070010view1.executeOnLoad();}catch(e){};
  try{expj.AN0070010.AN0070010button1.executeOnLoad();}catch(e){};
  try{expj.AN0070010.AN0070010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AN0070010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AN0070010', 'AN0070010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AN0070010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AN0070010-focus-move');
  // 初期フォーカス当てる処理
  $('.AN0070010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AN0070010', '<%=request.getContextPath() %>');
};

/**
 * AN0070010の全体onDecision処理
 */
expj.AN0070010.executeAllOnDecision = function () {
  expj.AN0070010.AN0070010view1.executeAllOnDecision();
};
</script>
<script class="expj-script-AN0070010_console">
expj.AN0070010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>