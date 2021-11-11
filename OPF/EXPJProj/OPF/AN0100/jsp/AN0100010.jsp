<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:47:35 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AN0100\AN0100010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AN0100.*" %>
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
<jsp:useBean id="aAN0100010Control" class="com.nec.jp.orteus.metamorBase.AN0100.AN0100010Control" scope="request"/>
<jsp:useBean id="aAN0100010Struct" class="com.nec.jp.orteus.metamorBase.AN0100.AN0100010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

システム管理情報メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0100/jsp/AN0100010.jsp,v $
$Author: geng-jia $
$Revision: 1.7 $ $Date: 2017/02/22 02:06:28 $
********************************************************* --%>
<html>
<head>
<title>システム管理情報メンテナンス</title>
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
<script class="expj-script-AN0100010_init">
  // AN0100010名前空間
  expj.AN0100010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AN0100010" data-screen="AN0100010" data-newdata="<%=aAN0100010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px">
      <div class="expj-td" style="width:968px;"></div><!--/td-->

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
             <script class="expj-script-AN0100010-AN0100010view1">
expj.AN0100010.AN0100010view1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AN0100010.AN0100010view1.onLoad0 = function () {
  console.log('AN0100010view1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;?AN0100010view1/*[eq]NORMAL@*0,*1"
expj.AN0100010.AN0100010view1.onDecision0 = function () {
  console.log('AN0100010view1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0100010', 'AN0100010view1', '?AN0100010view1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AN0100010button1/Update"
expj.AN0100010.AN0100010view1.child0 = function () {
  console.log('AN0100010view1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AN0100010', 'AN0100010view1', '_AN0100010button1/Update');
};
// script4="child;1;MASK;_AN0100010button1/Update"
expj.AN0100010.AN0100010view1.child1 = function () {
  console.log('AN0100010view1 script4');
expj.common.pscript.setMaskToReferenceComponent('AN0100010', 'AN0100010view1', '_AN0100010button1/Update');
};
expj.AN0100010.AN0100010view1.executeAllOnClick = function () {
};
expj.AN0100010.AN0100010view1.executeAllOnDecision = function () {
  console.log('execute AN0100010view1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0100010.AN0100010view1['onDecision' + i])) {
        expj.AN0100010.AN0100010view1['onDecision' + i]();
      }
    }
  }
};
expj.AN0100010.AN0100010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AN0100010view1", "expj.AN0100010.AN0100010view1.executeAllOnClick");
%>
  expj.AN0100010.AN0100010view1.executePScriptOnLoad();
};

expj.AN0100010.AN0100010view1.executePScriptOnLoad = function () {
  console.log('execute AN0100010view1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AN0100010.AN0100010view1['onLoad' + i])) {
      expj.AN0100010.AN0100010view1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AN0100010-AN0100010view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%=TypeConverter.sanitizer(aAN0100010Control.getReadStatusString())%>"></div>
<!-- VIEW END -->
<%
 String AN0100010view1_Id = "AN0100010view1";
 String AN0100010view1_select = "single";
 String AN0100010view1_sortable = "true";
 String AN0100010view1_resize = "true";
 String AN0100010view1_scroll = "true";
 StringBuffer AN0100010view1_HB = new StringBuffer();
 StringBuffer AN0100010view1_DB = new StringBuffer();
%>
<%
 AN0100010view1_select = "none";
 AN0100010view1_sortable = "false";
 AN0100010view1_resize = "true";
 AN0100010view1_scroll = "true";
%>
<%
 AN0100010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AN0100010view1_sortable).append("}").append(",");
%>
    <script class="expj-script-AN0100010-AN0100010view1-l_INSTALL_FLG">
expj.AN0100010.AN0100010view1.l_INSTALL_FLG = {};
expj.AN0100010.AN0100010view1.l_INSTALL_FLG.executeAllOnClick = function () {
};
expj.AN0100010.AN0100010view1.l_INSTALL_FLG.executeAllOnDecision = function () {
  console.log('execute AN0100010view1/l_INSTALL_FLG.onDecision');
  expj.AN0100010.AN0100010view1.executeAllOnDecision();
  expj.AN0100010.executeAllOnDecision();
};
expj.AN0100010.AN0100010view1.l_INSTALL_FLG.executeOnLoad = function () {
  $('.expj-AN0100010-AN0100010view1-l_INSTALL_FLG').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AN0100010', 'AN0100010view1', 'l_INSTALL_FLG', this);
  });
  expj.AN0100010.AN0100010view1.l_INSTALL_FLG.executePScriptOnLoad();
};

expj.AN0100010.AN0100010view1.l_INSTALL_FLG.executePScriptOnLoad = function () {
  console.log('execute AN0100010view1/l_INSTALL_FLG.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AN0100010-AN0100010view1-l_INSTALL_DATE">
expj.AN0100010.AN0100010view1.l_INSTALL_DATE = {};
expj.AN0100010.AN0100010view1.l_INSTALL_DATE.executeAllOnClick = function () {
};
expj.AN0100010.AN0100010view1.l_INSTALL_DATE.executeAllOnDecision = function () {
  console.log('execute AN0100010view1/l_INSTALL_DATE.onDecision');
  expj.AN0100010.AN0100010view1.executeAllOnDecision();
  expj.AN0100010.executeAllOnDecision();
};
expj.AN0100010.AN0100010view1.l_INSTALL_DATE.executeOnLoad = function () {
  $('.expj-AN0100010-AN0100010view1-l_INSTALL_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0100010', 'AN0100010view1', 'l_INSTALL_DATE', this);
  });
  expj.AN0100010.AN0100010view1.l_INSTALL_DATE.executePScriptOnLoad();
};

expj.AN0100010.AN0100010view1.l_INSTALL_DATE.executePScriptOnLoad = function () {
  console.log('execute AN0100010view1/l_INSTALL_DATE.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
AN0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPTION_ID",rb))).append("', 'name':'l_OPTION_ID', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AN0100010view1_sortable).append("}").append(",");
AN0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'400px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPTION_NAME",rb))).append("', 'name':'l_OPTION_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AN0100010view1_sortable).append("}").append(",");
AN0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INSTALL_FLG",rb))).append("', 'name':'l_INSTALL_FLG', 'class':'expj-tooltip expj-view-cell-combobox', 'sortable':").append(AN0100010view1_sortable).append("}").append(",");
AN0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INSTALL_DATE",rb))).append("', 'name':'l_INSTALL_DATE', 'class':'expj-tooltip expj-view-cell-textinput', 'sortable':").append(AN0100010view1_sortable).append("}").append(",");
AN0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_INSTALL_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0100010view1_sortable).append("}").append(",");
AN0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_INSTALL_DATE', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0100010view1_sortable).append("}").append(",");
AN0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0100010view1_sortable).append("}").append(",");
%>
<%
 int aAN0100010StructLength = aAN0100010Control.getListsize();
 final AN0100010Struct structBackup = aAN0100010Struct;
 aAN0100010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAN0100010StructLength; ++loopCount) {
  if((aAN0100010Struct = (AN0100010Struct) aAN0100010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAN0100010Struct", aAN0100010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AN0100010view1_DB.append("[");
 AN0100010view1_DB.append(loopCount);
 AN0100010view1_DB.append(",").append("'<span id=\"expj-AN0100010-AN0100010view1-l_OPTION_ID-").append(loopCount).append("\" class=\"expj-label expj-AN0100010-AN0100010view1-l_OPTION_ID\" data-name=\"l_OPTION_ID\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0100010Struct.getl_OPTION_ID())).append("</span>'");
 AN0100010view1_DB.append(",").append("'<span id=\"expj-AN0100010-AN0100010view1-l_OPTION_NAME-").append(loopCount).append("\" class=\"expj-label expj-AN0100010-AN0100010view1-l_OPTION_NAME\" data-name=\"l_OPTION_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0100010Struct.getl_OPTION_NAME())).append("</span>'");
 AN0100010view1_DB.append(",").append("'<select id=\"expj-AN0100010-AN0100010view1-l_INSTALL_FLG-").append(loopCount).append("\" class=\"expj-AN0100010-AN0100010view1-l_INSTALL_FLG AN0100010-focus-move\" data-name=\"l_INSTALL_FLG\" data-view=\"true\">"); for(int i = 0, size = aAN0100010Control.getStruct().getList_l_INSTALL_FLG_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAN0100010Control.getStruct().getList_l_INSTALL_FLG_name().get(i));    String val = TypeConverter.sanitizer((String)aAN0100010Control.getStruct().getList_l_INSTALL_FLG_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAN0100010Struct.getl_INSTALL_FLG()))) ? " selected" : "";    AN0100010view1_DB.append("<option value=\"").append(val).append("\"").append( selected ).append(">").append(name).append("</option>");  } AN0100010view1_DB.append("</select>'");
 AN0100010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AN0100010-AN0100010view1-l_INSTALL_DATE-").append(loopCount).append("\" class=\"expj-AN0100010-AN0100010view1-l_INSTALL_DATE AN0100010-focus-move\" data-name=\"l_INSTALL_DATE\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("OBT_DATE;TYPE_YMD").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAN0100010Struct.getl_INSTALL_DATE())).append("\">'");
 AN0100010view1_DB.append(",").append("'<span id=\"expj-AN0100010-AN0100010view1-l_h_INSTALL_FLG-").append(loopCount).append("\" class=\"expj-label expj-AN0100010-AN0100010view1-l_h_INSTALL_FLG\" data-name=\"l_h_INSTALL_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0100010Struct.getl_h_INSTALL_FLG())).append("</span>'");
 AN0100010view1_DB.append(",").append("'<span id=\"expj-AN0100010-AN0100010view1-l_h_INSTALL_DATE-").append(loopCount).append("\" class=\"expj-label expj-AN0100010-AN0100010view1-l_h_INSTALL_DATE\" data-name=\"l_h_INSTALL_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0100010Struct.getl_h_INSTALL_DATE())).append("</span>'");
 AN0100010view1_DB.append(",").append("'<span id=\"expj-AN0100010-AN0100010view1-l_h_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AN0100010-AN0100010view1-l_h_MODIFY_COUNT\" data-name=\"l_h_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0100010Struct.getl_h_MODIFY_COUNT())).append("</span>'");
 AN0100010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAN0100010StructLength) {
   AN0100010view1_DB.append(",");
  }
 }
 aAN0100010Struct = structBackup;
 viewIdList.add(AN0100010view1_Id);
 viewSelectList.add(AN0100010view1_select);
 viewResizeList.add(AN0100010view1_resize);
 viewScrollList.add(AN0100010view1_scroll);
 viewHeaderDataList.add(AN0100010view1_HB);
 viewBodyDataList.add(AN0100010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AN0100010-AN0100010button1">
expj.AN0100010.AN0100010button1 = {};
expj.AN0100010.AN0100010button1.executeAllOnDecision = function () {
  console.log('execute AN0100010button1.onDecision');
};
expj.AN0100010.AN0100010button1.executeOnLoad = function () {
  expj.AN0100010.AN0100010button1.executePScriptOnLoad();
};

expj.AN0100010.AN0100010button1.executePScriptOnLoad = function () {
  console.log('execute AN0100010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0100010-AN0100010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0100010-AN0100010button1-Update">
expj.AN0100010.AN0100010button1.Update = {};
// script1="onClick;0;COLCHKT;AN0100010view1:_l_INSTALL_DATE[eq]''@#AN10001"
expj.AN0100010.AN0100010button1.Update.onClick0 = function () {
  console.log('Update script1');
var selectCells = expj.common.pscript.getPreviewVIEWCells('AN0100010', 'AN0100010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_INSTALL_DATE, '[eq]', '')) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addErrorMessage('AN0100010', 'AN0100010button1', 'AN10001');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0100010view1/*@AN0100010Servlet,,$ZZ07003"
expj.AN0100010.AN0100010button1.Update.onClick1 = function () {
  console.log('Update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0100010', 'AN0100010button1', '_AN0100010view1/*', 'AN0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0100010', response);
expj.common.updateBusinessScreenTab('AN0100010', contents);
};
expj.common.pscript.callConfirm('AN0100010', 'AN0100010button1', 'ZZ07003', okEvent);
};
expj.AN0100010.AN0100010button1.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0100010.AN0100010button1.Update['onClick' + i])) {
        expj.AN0100010.AN0100010button1.Update['onClick' + i]();
      }
    }
  }
};
expj.AN0100010.AN0100010button1.Update.executeAllOnDecision = function () {
};
expj.AN0100010.AN0100010button1.Update.executeOnLoad = function () {
  $('#expj-AN0100010-AN0100010button1-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0100010', 'AN0100010button1', 'Update', this, 'Button');
    }
  });
  expj.AN0100010.AN0100010button1.Update.executePScriptOnLoad();
};

expj.AN0100010.AN0100010button1.Update.executePScriptOnLoad = function () {
  console.log('execute AN0100010button1/Update.onLoad');
  var targetComponent = document.getElementById('expj-AN0100010-AN0100010button1-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0100010-AN0100010button1-Update" name="Update" class="AN0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AN0100010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AN0100010-AN0100010button0">
expj.AN0100010.AN0100010button0 = {};
expj.AN0100010.AN0100010button0.executeAllOnDecision = function () {
  console.log('execute AN0100010button0.onDecision');
};
expj.AN0100010.AN0100010button0.executeOnLoad = function () {
  expj.AN0100010.AN0100010button0.executePScriptOnLoad();
};

expj.AN0100010.AN0100010button0.executePScriptOnLoad = function () {
  console.log('execute AN0100010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0100010-AN0100010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0100010-AN0100010button0-Close">
expj.AN0100010.AN0100010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AN0100010.AN0100010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AN0100010');
};
expj.AN0100010.AN0100010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0100010.AN0100010button0.Close['onClick' + i])) {
        expj.AN0100010.AN0100010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AN0100010.AN0100010button0.Close.executeAllOnDecision = function () {
};
expj.AN0100010.AN0100010button0.Close.executeOnLoad = function () {
  $('#expj-AN0100010-AN0100010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0100010', 'AN0100010button0', 'Close', this, 'Button');
    }
  });
  expj.AN0100010.AN0100010button0.Close.executePScriptOnLoad();
};

expj.AN0100010.AN0100010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AN0100010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AN0100010-AN0100010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0100010-AN0100010button0-Close" name="Close" class="AN0100010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AN0100010 (END)-->
<%
  MessageStruct msgStruct = aAN0100010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AN0100010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AN0100010)) {
  expj.common.treeInstanceMap.AN0100010 = {};
}
expj.common.treeInstanceMap.AN0100010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AN0100010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AN0100010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AN0100010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AN0100010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AN0100010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AN0100010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AN0100010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AN0100010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AN0100010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AN0100010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0100010)) {
  expj.common.detailDialogMap.AN0100010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0100010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AN0100010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0100010.<%=detailId %>)) {
  expj.common.detailDialogMap.AN0100010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0100010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AN0100010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0100010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AN0100010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AN0100010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AN0100010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AN0100010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AN0100010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AN0100010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AN0100010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AN0100010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AN0100010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AN0100010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AN0100010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AN0100010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AN0100010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AN0100010)) {
  expj.common.viewInstanceMap.AN0100010 = {};
}
expj.common.viewInstanceMap.AN0100010.<%=viewId %> = {};
expj.common.viewInstanceMap.AN0100010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AN0100010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AN0100010.<%=viewId %>.init = function () {
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
    expj.AN0100010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AN0100010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AN0100010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AN0100010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AN0100010_init">
/**
 * AN0100010用のロード完了時初期化関数
 */
expj.AN0100010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AN0100010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AN0100010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AN0100010');
  expj.common.calendarInstanceMap.AN0100010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AN0100010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AN0100010.<%=detailId %>.init();
  expj.common.detailDialogMap.AN0100010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AN0100010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AN0100010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AN0100010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AN0100010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AN0100010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AN0100010-<%=detailId %>');
<%
 }
%>
  try{expj.AN0100010.AN0100010view1.l_INSTALL_FLG.executeOnLoad();}catch(e){};
  try{expj.AN0100010.AN0100010view1.l_INSTALL_DATE.executeOnLoad();}catch(e){};
  try{expj.AN0100010.AN0100010button1.Update.executeOnLoad();}catch(e){};
  try{expj.AN0100010.AN0100010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AN0100010.AN0100010view1.executeOnLoad();}catch(e){};
  try{expj.AN0100010.AN0100010button1.executeOnLoad();}catch(e){};
  try{expj.AN0100010.AN0100010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AN0100010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AN0100010', 'AN0100010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AN0100010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AN0100010-focus-move');
  // 初期フォーカス当てる処理
  $('.AN0100010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AN0100010', '<%=request.getContextPath() %>');
};

/**
 * AN0100010の全体onDecision処理
 */
expj.AN0100010.executeAllOnDecision = function () {
  expj.AN0100010.AN0100010view1.executeAllOnDecision();
};
</script>
<script class="expj-script-AN0100010_console">
expj.AN0100010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>