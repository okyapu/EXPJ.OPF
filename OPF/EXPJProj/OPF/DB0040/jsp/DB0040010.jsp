<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:50:59 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DB0040\DB0040010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DB0040.*" %>
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
<jsp:useBean id="aDB0040010Control" class="com.nec.jp.orteus.metamorBase.DB0040.DB0040010Control" scope="request"/>
<jsp:useBean id="aDB0040010Struct" class="com.nec.jp.orteus.metamorBase.DB0040.DB0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

加工費情報一括登録実行
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0040/jsp/DB0040010.jsp,v $
$Author: geng-jia $
$Revision: 1.8 $ $Date: 2017/02/22 02:06:43 $
********************************************************* --%>
<html>
<head>
<title>加工費情報一括登録実行</title>
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
<script class="expj-script-DB0040010_init">
  // DB0040010名前空間
  expj.DB0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<div id="expj-business-screen-DB0040010" data-screen="DB0040010" data-newdata="<%=aDB0040010Control.isNewData() %>">
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
            <script class="expj-script-DB0040010-DB0040010form1">
expj.DB0040010.DB0040010form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.DB0040010.DB0040010form1.onLoad0 = function () {
  console.log('DB0040010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.DB0040010.DB0040010form1.onDecision0 = function () {
  console.log('DB0040010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('DB0040010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_DB0040010button1/Execute"
expj.DB0040010.DB0040010form1.child0 = function () {
  console.log('DB0040010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('DB0040010', 'DB0040010form1', '_DB0040010button1/Execute');
};
// script4="child;1;MASK;_DB0040010button1/Execute"
expj.DB0040010.DB0040010form1.child1 = function () {
  console.log('DB0040010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('DB0040010', 'DB0040010form1', '_DB0040010button1/Execute');
};
expj.DB0040010.DB0040010form1.executeAllOnDecision = function () {
  console.log('execute DB0040010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DB0040010.DB0040010form1['onDecision' + i])) {
        expj.DB0040010.DB0040010form1['onDecision' + i]();
      }
    }
  }
};
expj.DB0040010.DB0040010form1.executeOnLoad = function () {
  expj.DB0040010.DB0040010form1.executePScriptOnLoad();
};

expj.DB0040010.DB0040010form1.executePScriptOnLoad = function () {
  console.log('execute DB0040010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.DB0040010.DB0040010form1['onLoad' + i])) {
      expj.DB0040010.DB0040010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DB0040010-DB0040010form1" action="DB0040010Servlet" name="DB0040010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDB0040010Control.getReadStatusString()) %>" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
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
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
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
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-DB0040010-DB0040010form1-PLANT_CD">
expj.DB0040010.DB0040010form1.PLANT_CD = {};
expj.DB0040010.DB0040010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DB0040010form1/PLANT_CD.onDecision');
  expj.DB0040010.DB0040010form1.executeAllOnDecision();
  expj.DB0040010.executeAllOnDecision();
};
expj.DB0040010.DB0040010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-DB0040010-DB0040010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0040010', 'DB0040010form1', 'PLANT_CD', this);
  });
  expj.DB0040010.DB0040010form1.PLANT_CD.executePScriptOnLoad();
};

expj.DB0040010.DB0040010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DB0040010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DB0040010-DB0040010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DB0040010-DB0040010form1-PLANT_CD" name="PLANT_CD" class="DB0040010-focus-move  required-value expj-DB0040010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDB0040010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-DB0040010-DB0040010form1-PeekerPlantCd">
expj.DB0040010.DB0040010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_DB0040010form1/PLANT_CD:_DB0040010form1/PLANT_NAME@<%=contextNo%>"
expj.DB0040010.DB0040010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DB0040010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DB0040010', 'DB0040010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DB0040010form1/PLANT_CD:_DB0040010form1/PLANT_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DB0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DB0040010.DB0040010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DB0040010.DB0040010form1.PeekerPlantCd['onClick' + i])) {
        expj.DB0040010.DB0040010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.DB0040010.DB0040010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.DB0040010.DB0040010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-DB0040010-DB0040010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0040010', 'DB0040010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.DB0040010.DB0040010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.DB0040010.DB0040010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute DB0040010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-DB0040010-DB0040010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DB0040010-DB0040010form1-PeekerPlantCd" class="DB0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DB0040010-DB0040010form1-PLANT_NAME">
expj.DB0040010.DB0040010form1.PLANT_NAME = {};
expj.DB0040010.DB0040010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute DB0040010form1/PLANT_NAME.onDecision');
  expj.DB0040010.DB0040010form1.executeAllOnDecision();
  expj.DB0040010.executeAllOnDecision();
};
expj.DB0040010.DB0040010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-DB0040010-DB0040010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0040010', 'DB0040010form1', 'PLANT_NAME', this);
  });
  expj.DB0040010.DB0040010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.DB0040010.DB0040010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute DB0040010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DB0040010-DB0040010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DB0040010-DB0040010form1-PLANT_NAME" name="PLANT_NAME" class="DB0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDB0040010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.TARGET_YEAR",rb)%></span><!-- 対象年度 --></div><!--/td-->
<script class="expj-script-DB0040010-DB0040010form1-YEAR">
expj.DB0040010.DB0040010form1.YEAR = {};
expj.DB0040010.DB0040010form1.YEAR.executeAllOnDecision = function () {
  console.log('execute DB0040010form1/YEAR.onDecision');
  expj.DB0040010.DB0040010form1.executeAllOnDecision();
  expj.DB0040010.executeAllOnDecision();
};
expj.DB0040010.DB0040010form1.YEAR.executeOnLoad = function () {
  $('#expj-DB0040010-DB0040010form1-YEAR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0040010', 'DB0040010form1', 'YEAR', this);
  });
  expj.DB0040010.DB0040010form1.YEAR.executePScriptOnLoad();
};

expj.DB0040010.DB0040010form1.YEAR.executePScriptOnLoad = function () {
  console.log('execute DB0040010form1/YEAR.onLoad');
  var targetComponent = document.getElementById('expj-DB0040010-DB0040010form1-YEAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DB0040010-DB0040010form1-YEAR" name="YEAR" class="DB0040010-focus-move expj-align-right required-value expj-DB0040010-required-A" style="width:150px;" data-kind="OBT_N" value="<%= TypeConverter.sanitizer(aDB0040010Struct.getYEAR()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HALF_TERM_TYP",rb)%></span><!-- 半期区分 --></div><!--/td-->
<script class="expj-script-DB0040010-DB0040010form1-HALF_TERM_TYP">
expj.DB0040010.DB0040010form1.HALF_TERM_TYP = {};
expj.DB0040010.DB0040010form1.HALF_TERM_TYP.executeAllOnDecision = function () {
  console.log('execute DB0040010form1/HALF_TERM_TYP.onDecision');
  expj.DB0040010.DB0040010form1.executeAllOnDecision();
  expj.DB0040010.executeAllOnDecision();
};
expj.DB0040010.DB0040010form1.HALF_TERM_TYP.executeOnLoad = function () {
  $('#expj-DB0040010-DB0040010form1-HALF_TERM_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DB0040010', 'DB0040010form1', 'HALF_TERM_TYP', this);
  });
  expj.DB0040010.DB0040010form1.HALF_TERM_TYP.executePScriptOnLoad();
};

expj.DB0040010.DB0040010form1.HALF_TERM_TYP.executePScriptOnLoad = function () {
  console.log('execute DB0040010form1/HALF_TERM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DB0040010-DB0040010form1-HALF_TERM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DB0040010-DB0040010form1-HALF_TERM_TYP" name='HALF_TERM_TYP' class='DB0040010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDB0040010Control.getStruct().getList_HALF_TERM_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDB0040010Control.getStruct().getList_HALF_TERM_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDB0040010Control.getStruct().getList_HALF_TERM_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDB0040010Struct.getHALF_TERM_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.COST_TYP",rb)%></span><!-- 原価種別 --></div><!--/td-->
<script class="expj-script-DB0040010-DB0040010form1-COST_TYP">
expj.DB0040010.DB0040010form1.COST_TYP = {};
expj.DB0040010.DB0040010form1.COST_TYP.executeAllOnDecision = function () {
  console.log('execute DB0040010form1/COST_TYP.onDecision');
  expj.DB0040010.DB0040010form1.executeAllOnDecision();
  expj.DB0040010.executeAllOnDecision();
};
expj.DB0040010.DB0040010form1.COST_TYP.executeOnLoad = function () {
  $('#expj-DB0040010-DB0040010form1-COST_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DB0040010', 'DB0040010form1', 'COST_TYP', this);
  });
  expj.DB0040010.DB0040010form1.COST_TYP.executePScriptOnLoad();
};

expj.DB0040010.DB0040010form1.COST_TYP.executePScriptOnLoad = function () {
  console.log('execute DB0040010form1/COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DB0040010-DB0040010form1-COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DB0040010-DB0040010form1-COST_TYP" name='COST_TYP' class='DB0040010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDB0040010Control.getStruct().getList_COST_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDB0040010Control.getStruct().getList_COST_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDB0040010Control.getStruct().getList_COST_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDB0040010Struct.getCOST_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-DB0040010-DB0040010button1">
expj.DB0040010.DB0040010button1 = {};
expj.DB0040010.DB0040010button1.executeAllOnDecision = function () {
  console.log('execute DB0040010button1.onDecision');
};
expj.DB0040010.DB0040010button1.executeOnLoad = function () {
  expj.DB0040010.DB0040010button1.executePScriptOnLoad();
};

expj.DB0040010.DB0040010button1.executePScriptOnLoad = function () {
  console.log('execute DB0040010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DB0040010-DB0040010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DB0040010-DB0040010button1-Execute">
expj.DB0040010.DB0040010button1.Execute = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DB0040010form1/*@DB0040010Servlet,,$ZZ07010"
expj.DB0040010.DB0040010button1.Execute.onClick0 = function () {
  console.log('Execute script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DB0040010', 'DB0040010button1', '_DB0040010form1/*', 'DB0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DB0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DB0040010', response);
expj.common.updateBusinessScreenTab('DB0040010', contents);
};
expj.common.pscript.callConfirm('DB0040010', 'DB0040010button1', 'ZZ07010', okEvent);
};
expj.DB0040010.DB0040010button1.Execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DB0040010.DB0040010button1.Execute['onClick' + i])) {
        expj.DB0040010.DB0040010button1.Execute['onClick' + i]();
      }
    }
  }
};
expj.DB0040010.DB0040010button1.Execute.executeAllOnDecision = function () {
};
expj.DB0040010.DB0040010button1.Execute.executeOnLoad = function () {
  $('#expj-DB0040010-DB0040010button1-Execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0040010', 'DB0040010button1', 'Execute', this, 'Button');
    }
  });
  expj.DB0040010.DB0040010button1.Execute.executePScriptOnLoad();
};

expj.DB0040010.DB0040010button1.Execute.executePScriptOnLoad = function () {
  console.log('execute DB0040010button1/Execute.onLoad');
  var targetComponent = document.getElementById('expj-DB0040010-DB0040010button1-Execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DB0040010-DB0040010button1-Execute" name="Execute" class="DB0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">DB0040010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-DB0040010-DB0040010button0">
expj.DB0040010.DB0040010button0 = {};
expj.DB0040010.DB0040010button0.executeAllOnDecision = function () {
  console.log('execute DB0040010button0.onDecision');
};
expj.DB0040010.DB0040010button0.executeOnLoad = function () {
  expj.DB0040010.DB0040010button0.executePScriptOnLoad();
};

expj.DB0040010.DB0040010button0.executePScriptOnLoad = function () {
  console.log('execute DB0040010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DB0040010-DB0040010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DB0040010-DB0040010button0-Clear">
expj.DB0040010.DB0040010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@DB0040010Servlet,,$ZZ07008"
expj.DB0040010.DB0040010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DB0040010', 'DB0040010button0', '', 'DB0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DB0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DB0040010', response);
expj.common.updateBusinessScreenTab('DB0040010', contents);
};
expj.common.pscript.callConfirm('DB0040010', 'DB0040010button0', 'ZZ07008', okEvent);
};
expj.DB0040010.DB0040010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DB0040010.DB0040010button0.Clear['onClick' + i])) {
        expj.DB0040010.DB0040010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.DB0040010.DB0040010button0.Clear.executeAllOnDecision = function () {
};
expj.DB0040010.DB0040010button0.Clear.executeOnLoad = function () {
  $('#expj-DB0040010-DB0040010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0040010', 'DB0040010button0', 'Clear', this, 'Button');
    }
  });
  expj.DB0040010.DB0040010button0.Clear.executePScriptOnLoad();
};

expj.DB0040010.DB0040010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute DB0040010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-DB0040010-DB0040010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DB0040010-DB0040010button0-Clear" name="Clear" class="DB0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-DB0040010-DB0040010button0-Close">
expj.DB0040010.DB0040010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.DB0040010.DB0040010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('DB0040010');
};
expj.DB0040010.DB0040010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DB0040010.DB0040010button0.Close['onClick' + i])) {
        expj.DB0040010.DB0040010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.DB0040010.DB0040010button0.Close.executeAllOnDecision = function () {
};
expj.DB0040010.DB0040010button0.Close.executeOnLoad = function () {
  $('#expj-DB0040010-DB0040010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0040010', 'DB0040010button0', 'Close', this, 'Button');
    }
  });
  expj.DB0040010.DB0040010button0.Close.executePScriptOnLoad();
};

expj.DB0040010.DB0040010button0.Close.executePScriptOnLoad = function () {
  console.log('execute DB0040010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-DB0040010-DB0040010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DB0040010-DB0040010button0-Close" name="Close" class="DB0040010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-DB0040010 (END)-->
<%
MessageStruct msgStruct = aDB0040010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-DB0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DB0040010)) {
  expj.common.treeInstanceMap.DB0040010 = {};
}
expj.common.treeInstanceMap.DB0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.DB0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.DB0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.DB0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.DB0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DB0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DB0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DB0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DB0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DB0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-DB0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DB0040010)) {
  expj.common.detailDialogMap.DB0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DB0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DB0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DB0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.DB0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DB0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DB0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DB0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DB0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DB0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DB0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DB0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.DB0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DB0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.DB0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DB0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DB0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DB0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DB0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DB0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-DB0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DB0040010)) {
  expj.common.viewInstanceMap.DB0040010 = {};
}
expj.common.viewInstanceMap.DB0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.DB0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DB0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DB0040010.<%=viewId %>.init = function () {
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
    expj.DB0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DB0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DB0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DB0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DB0040010_init">
/**
 * DB0040010用のロード完了時初期化関数
 */
expj.DB0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DB0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('DB0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('DB0040010');
  expj.common.calendarInstanceMap.DB0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.DB0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.DB0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.DB0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DB0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DB0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DB0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DB0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DB0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DB0040010-<%=detailId %>');
<%
 }
%>
  try{expj.DB0040010.DB0040010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DB0040010.DB0040010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.DB0040010.DB0040010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.DB0040010.DB0040010form1.YEAR.executeOnLoad();}catch(e){};
  try{expj.DB0040010.DB0040010form1.HALF_TERM_TYP.executeOnLoad();}catch(e){};
  try{expj.DB0040010.DB0040010form1.COST_TYP.executeOnLoad();}catch(e){};
  try{expj.DB0040010.DB0040010button1.Execute.executeOnLoad();}catch(e){};
  try{expj.DB0040010.DB0040010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.DB0040010.DB0040010button0.Close.executeOnLoad();}catch(e){};
  try{expj.DB0040010.DB0040010form1.executeOnLoad();}catch(e){};
  try{expj.DB0040010.DB0040010button1.executeOnLoad();}catch(e){};
  try{expj.DB0040010.DB0040010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.DB0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DB0040010', 'DB0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DB0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.DB0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.DB0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('DB0040010', '<%=request.getContextPath() %>');
};

/**
 * DB0040010の全体onDecision処理
 */
expj.DB0040010.executeAllOnDecision = function () {
  expj.DB0040010.DB0040010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-DB0040010_console">
expj.DB0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>