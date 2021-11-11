<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:51:30 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DC0020\DC0020010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DC0020.*" %>
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
<jsp:useBean id="aDC0020010Control" class="com.nec.jp.orteus.metamorBase.DC0020.DC0020010Control" scope="request"/>
<jsp:useBean id="aDC0020010Struct" class="com.nec.jp.orteus.metamorBase.DC0020.DC0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

標準原価計算マスタチェック実行
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DC0020/jsp/DC0020010.jsp,v $
$Author: geng-jia $
$Revision: 1.8 $ $Date: 2017/02/22 02:06:45 $
********************************************************* --%>
<html>
<head>
<title>標準原価計算マスタチェック実行</title>
<%@include file="common/expj_v5.jsp" %>
<%
String callButton = aDC0020010Control.getButton();
%>

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
<script class="expj-script-DC0020010_init">
  // DC0020010名前空間
  expj.DC0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<div id="expj-business-screen-DC0020010" data-screen="DC0020010" data-newdata="<%=aDC0020010Control.isNewData() %>">
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
            <script class="expj-script-DC0020010-DC0020010form1">
expj.DC0020010.DC0020010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.DC0020010.DC0020010form1.onLoad0 = function () {
  console.log('DC0020010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.DC0020010.DC0020010form1.onDecision0 = function () {
  console.log('DC0020010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('DC0020010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_DC0020010button1/Select"
expj.DC0020010.DC0020010form1.child0 = function () {
  console.log('DC0020010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('DC0020010', 'DC0020010form1', '_DC0020010button1/Select');
};
// script4="child;1;MASK;_DC0020010button1/Select"
expj.DC0020010.DC0020010form1.child1 = function () {
  console.log('DC0020010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('DC0020010', 'DC0020010form1', '_DC0020010button1/Select');
};
// script5="onDecision;1;CHK;?DC0020010form1/*[eq]NORMAL@*2,*5"
expj.DC0020010.DC0020010form1.onDecision1 = function () {
  console.log('DC0020010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DC0020010', 'DC0020010form1', '?DC0020010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;2;CHKRQ;A@*3,*5"
expj.DC0020010.DC0020010form1.child2 = function () {
  console.log('DC0020010form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('DC0020010', 'A')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;3;CHK;?PLANT_CD[eq]SAME[and]?YEAR[eq]SAME[and]?HALF_TERM_TYP[eq]SAME@*4,*5"
expj.DC0020010.DC0020010form1.child3 = function () {
  console.log('DC0020010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DC0020010', 'DC0020010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DC0020010', 'DC0020010form1', '?YEAR'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DC0020010', 'DC0020010form1', '?HALF_TERM_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_DC0020010button2/Execute"
expj.DC0020010.DC0020010form1.child4 = function () {
  console.log('DC0020010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('DC0020010', 'DC0020010form1', '_DC0020010button2/Execute');
};
// script9="child;5;MASK;_DC0020010button2/Execute"
expj.DC0020010.DC0020010form1.child5 = function () {
  console.log('DC0020010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('DC0020010', 'DC0020010form1', '_DC0020010button2/Execute');
};
expj.DC0020010.DC0020010form1.executeAllOnDecision = function () {
  console.log('execute DC0020010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DC0020010.DC0020010form1['onDecision' + i])) {
        expj.DC0020010.DC0020010form1['onDecision' + i]();
      }
    }
  }
};
expj.DC0020010.DC0020010form1.executeOnLoad = function () {
  expj.DC0020010.DC0020010form1.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form1.executePScriptOnLoad = function () {
  console.log('execute DC0020010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.DC0020010.DC0020010form1['onLoad' + i])) {
      expj.DC0020010.DC0020010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DC0020010-DC0020010form1" action="DC0020010Servlet" name="DC0020010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDC0020010Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-DC0020010-DC0020010form1-PLANT_CD">
expj.DC0020010.DC0020010form1.PLANT_CD = {};
expj.DC0020010.DC0020010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DC0020010form1/PLANT_CD.onDecision');
  expj.DC0020010.DC0020010form1.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DC0020010', 'DC0020010form1', 'PLANT_CD', this);
  });
  expj.DC0020010.DC0020010form1.PLANT_CD.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DC0020010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DC0020010-DC0020010form1-PLANT_CD" name="PLANT_CD" class="DC0020010-focus-move  required-value expj-DC0020010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDC0020010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-DC0020010-DC0020010form1-PeekerPlantCd">
expj.DC0020010.DC0020010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_DC0020010form1/PLANT_CD:_DC0020010form1/PLANT_NAME@<%=contextNo%>"
expj.DC0020010.DC0020010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DC0020010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DC0020010', 'DC0020010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DC0020010form1/PLANT_CD:_DC0020010form1/PLANT_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DC0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DC0020010.DC0020010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DC0020010.DC0020010form1.PeekerPlantCd['onClick' + i])) {
        expj.DC0020010.DC0020010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.DC0020010.DC0020010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.DC0020010.DC0020010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DC0020010', 'DC0020010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.DC0020010.DC0020010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute DC0020010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DC0020010-DC0020010form1-PeekerPlantCd" class="DC0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DC0020010-DC0020010form1-PLANT_NAME">
expj.DC0020010.DC0020010form1.PLANT_NAME = {};
expj.DC0020010.DC0020010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute DC0020010form1/PLANT_NAME.onDecision');
  expj.DC0020010.DC0020010form1.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DC0020010', 'DC0020010form1', 'PLANT_NAME', this);
  });
  expj.DC0020010.DC0020010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute DC0020010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DC0020010-DC0020010form1-PLANT_NAME" name="PLANT_NAME" class="DC0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDC0020010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.YEAR",rb)%></span><!-- 年度 --></div><!--/td-->
<script class="expj-script-DC0020010-DC0020010form1-YEAR">
expj.DC0020010.DC0020010form1.YEAR = {};
expj.DC0020010.DC0020010form1.YEAR.executeAllOnDecision = function () {
  console.log('execute DC0020010form1/YEAR.onDecision');
  expj.DC0020010.DC0020010form1.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form1.YEAR.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form1-YEAR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DC0020010', 'DC0020010form1', 'YEAR', this);
  });
  expj.DC0020010.DC0020010form1.YEAR.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form1.YEAR.executePScriptOnLoad = function () {
  console.log('execute DC0020010form1/YEAR.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form1-YEAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DC0020010-DC0020010form1-YEAR" name="YEAR" class="DC0020010-focus-move expj-align-right required-value expj-DC0020010-required-A" style="width:150px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aDC0020010Struct.getYEAR()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HALF_TERM_TYP",rb)%></span><!-- 半期区分 --></div><!--/td-->
<script class="expj-script-DC0020010-DC0020010form1-HALF_TERM_TYP">
expj.DC0020010.DC0020010form1.HALF_TERM_TYP = {};
expj.DC0020010.DC0020010form1.HALF_TERM_TYP.executeAllOnDecision = function () {
  console.log('execute DC0020010form1/HALF_TERM_TYP.onDecision');
  expj.DC0020010.DC0020010form1.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form1.HALF_TERM_TYP.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form1-HALF_TERM_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DC0020010', 'DC0020010form1', 'HALF_TERM_TYP', this);
  });
  expj.DC0020010.DC0020010form1.HALF_TERM_TYP.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form1.HALF_TERM_TYP.executePScriptOnLoad = function () {
  console.log('execute DC0020010form1/HALF_TERM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form1-HALF_TERM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DC0020010-DC0020010form1-HALF_TERM_TYP" name='HALF_TERM_TYP' class='DC0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDC0020010Control.getStruct().getList_HALF_TERM_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDC0020010Control.getStruct().getList_HALF_TERM_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDC0020010Control.getStruct().getList_HALF_TERM_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDC0020010Struct.getHALF_TERM_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-DC0020010-DC0020010button1">
expj.DC0020010.DC0020010button1 = {};
expj.DC0020010.DC0020010button1.executeAllOnDecision = function () {
  console.log('execute DC0020010button1.onDecision');
};
expj.DC0020010.DC0020010button1.executeOnLoad = function () {
  expj.DC0020010.DC0020010button1.executePScriptOnLoad();
};

expj.DC0020010.DC0020010button1.executePScriptOnLoad = function () {
  console.log('execute DC0020010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DC0020010-DC0020010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DC0020010-DC0020010button1-Select">
expj.DC0020010.DC0020010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DC0020010form1/*@DC0020010Servlet"
expj.DC0020010.DC0020010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DC0020010', 'DC0020010button1', '_DC0020010form1/*', 'DC0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DC0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DC0020010', response);
expj.common.updateBusinessScreenTab('DC0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DC0020010.DC0020010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DC0020010.DC0020010button1.Select['onClick' + i])) {
        expj.DC0020010.DC0020010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.DC0020010.DC0020010button1.Select.executeAllOnDecision = function () {
};
expj.DC0020010.DC0020010button1.Select.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DC0020010', 'DC0020010button1', 'Select', this, 'Button');
    }
  });
  expj.DC0020010.DC0020010button1.Select.executePScriptOnLoad();
};

expj.DC0020010.DC0020010button1.Select.executePScriptOnLoad = function () {
  console.log('execute DC0020010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DC0020010-DC0020010button1-Select" name="Select" class="DC0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-DC0020010-DC0020010form2">
expj.DC0020010.DC0020010form2 = {};
expj.DC0020010.DC0020010form2.executeAllOnDecision = function () {
  console.log('execute DC0020010form2.onDecision');
};
expj.DC0020010.DC0020010form2.executeOnLoad = function () {
  expj.DC0020010.DC0020010form2.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form2.executePScriptOnLoad = function () {
  console.log('execute DC0020010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DC0020010-DC0020010form2" action="DC0020010Servlet" name="DC0020010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDC0020010Control.getReadStatus()) %>" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="align:"></div>
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
<div class="div-td" style="width:0px;"></div><!--/td-->
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
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.START_TIME",rb)%></span><!-- 実行開始時間 --></div><!--/td-->
<script class="expj-script-DC0020010-DC0020010form2-START_TIME">
expj.DC0020010.DC0020010form2.START_TIME = {};
expj.DC0020010.DC0020010form2.START_TIME.executeAllOnDecision = function () {
  console.log('execute DC0020010form2/START_TIME.onDecision');
  expj.DC0020010.DC0020010form2.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form2.START_TIME.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form2-START_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DC0020010', 'DC0020010form2', 'START_TIME', this);
  });
  expj.DC0020010.DC0020010form2.START_TIME.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form2.START_TIME.executePScriptOnLoad = function () {
  console.log('execute DC0020010form2/START_TIME.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form2-START_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DC0020010-DC0020010form2-START_TIME" name="START_TIME" class="DC0020010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aDC0020010Struct.getSTART_TIME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOP_TIME",rb)%></span><!-- 実行終了時間 --></div><!--/td-->
<script class="expj-script-DC0020010-DC0020010form2-STOP_TIME">
expj.DC0020010.DC0020010form2.STOP_TIME = {};
expj.DC0020010.DC0020010form2.STOP_TIME.executeAllOnDecision = function () {
  console.log('execute DC0020010form2/STOP_TIME.onDecision');
  expj.DC0020010.DC0020010form2.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form2.STOP_TIME.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form2-STOP_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DC0020010', 'DC0020010form2', 'STOP_TIME', this);
  });
  expj.DC0020010.DC0020010form2.STOP_TIME.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form2.STOP_TIME.executePScriptOnLoad = function () {
  console.log('execute DC0020010form2/STOP_TIME.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form2-STOP_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DC0020010-DC0020010form2-STOP_TIME" name="STOP_TIME" class="DC0020010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aDC0020010Struct.getSTOP_TIME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CS_CALC_PROC_NO",rb)%></span><!-- 原価計算処理番号 --></div><!--/td-->
<script class="expj-script-DC0020010-DC0020010form2-CS_CALC_PROC_NO_DN">
expj.DC0020010.DC0020010form2.CS_CALC_PROC_NO_DN = {};
expj.DC0020010.DC0020010form2.CS_CALC_PROC_NO_DN.executeAllOnDecision = function () {
  console.log('execute DC0020010form2/CS_CALC_PROC_NO_DN.onDecision');
  expj.DC0020010.DC0020010form2.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form2.CS_CALC_PROC_NO_DN.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form2-CS_CALC_PROC_NO_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DC0020010', 'DC0020010form2', 'CS_CALC_PROC_NO_DN', this);
  });
  expj.DC0020010.DC0020010form2.CS_CALC_PROC_NO_DN.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form2.CS_CALC_PROC_NO_DN.executePScriptOnLoad = function () {
  console.log('execute DC0020010form2/CS_CALC_PROC_NO_DN.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form2-CS_CALC_PROC_NO_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DC0020010-DC0020010form2-CS_CALC_PROC_NO_DN" name="CS_CALC_PROC_NO_DN" class="DC0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDC0020010Struct.getCS_CALC_PROC_NO_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-DC0020010-DC0020010form2-CS_CALC_PROC_NO" name="CS_CALC_PROC_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDC0020010Struct.getCS_CALC_PROC_NO()) %>">
<script class="expj-script-DC0020010-DC0020010form2-CS_CALC_PROC_NO">
expj.DC0020010.DC0020010form2.CS_CALC_PROC_NO = {};
expj.DC0020010.DC0020010form2.CS_CALC_PROC_NO.executeAllOnDecision = function () {
  console.log('execute DC0020010form2/CS_CALC_PROC_NO.onDecision');
  expj.DC0020010.DC0020010form2.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form2.CS_CALC_PROC_NO.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form2-CS_CALC_PROC_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DC0020010', 'DC0020010form2', 'CS_CALC_PROC_NO', this);
  });
  expj.DC0020010.DC0020010form2.CS_CALC_PROC_NO.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form2.CS_CALC_PROC_NO.executePScriptOnLoad = function () {
  console.log('execute DC0020010form2/CS_CALC_PROC_NO.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form2-CS_CALC_PROC_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EXECUTE_STATUS_TYP",rb)%></span><!-- 実行状態区分 --></div><!--/td-->
<script class="expj-script-DC0020010-DC0020010form2-EXECUTE_STATUS_TYP_DN">
expj.DC0020010.DC0020010form2.EXECUTE_STATUS_TYP_DN = {};
expj.DC0020010.DC0020010form2.EXECUTE_STATUS_TYP_DN.executeAllOnDecision = function () {
  console.log('execute DC0020010form2/EXECUTE_STATUS_TYP_DN.onDecision');
  expj.DC0020010.DC0020010form2.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form2.EXECUTE_STATUS_TYP_DN.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form2-EXECUTE_STATUS_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DC0020010', 'DC0020010form2', 'EXECUTE_STATUS_TYP_DN', this);
  });
  expj.DC0020010.DC0020010form2.EXECUTE_STATUS_TYP_DN.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form2.EXECUTE_STATUS_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute DC0020010form2/EXECUTE_STATUS_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form2-EXECUTE_STATUS_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DC0020010-DC0020010form2-EXECUTE_STATUS_TYP_DN" name="EXECUTE_STATUS_TYP_DN" class="DC0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDC0020010Struct.getEXECUTE_STATUS_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-DC0020010-DC0020010form2-EXECUTE_STATUS_TYP" name="EXECUTE_STATUS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDC0020010Struct.getEXECUTE_STATUS_TYP()) %>">
<script class="expj-script-DC0020010-DC0020010form2-EXECUTE_STATUS_TYP">
expj.DC0020010.DC0020010form2.EXECUTE_STATUS_TYP = {};
expj.DC0020010.DC0020010form2.EXECUTE_STATUS_TYP.executeAllOnDecision = function () {
  console.log('execute DC0020010form2/EXECUTE_STATUS_TYP.onDecision');
  expj.DC0020010.DC0020010form2.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form2.EXECUTE_STATUS_TYP.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form2-EXECUTE_STATUS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DC0020010', 'DC0020010form2', 'EXECUTE_STATUS_TYP', this);
  });
  expj.DC0020010.DC0020010form2.EXECUTE_STATUS_TYP.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form2.EXECUTE_STATUS_TYP.executePScriptOnLoad = function () {
  console.log('execute DC0020010form2/EXECUTE_STATUS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form2-EXECUTE_STATUS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.RESULT_STATUS_TYP",rb)%></span><!-- 実行結果区分 --></div><!--/td-->
<script class="expj-script-DC0020010-DC0020010form2-RESULT_STATUS_TYP_DN">
expj.DC0020010.DC0020010form2.RESULT_STATUS_TYP_DN = {};
expj.DC0020010.DC0020010form2.RESULT_STATUS_TYP_DN.executeAllOnDecision = function () {
  console.log('execute DC0020010form2/RESULT_STATUS_TYP_DN.onDecision');
  expj.DC0020010.DC0020010form2.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form2.RESULT_STATUS_TYP_DN.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form2-RESULT_STATUS_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DC0020010', 'DC0020010form2', 'RESULT_STATUS_TYP_DN', this);
  });
  expj.DC0020010.DC0020010form2.RESULT_STATUS_TYP_DN.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form2.RESULT_STATUS_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute DC0020010form2/RESULT_STATUS_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form2-RESULT_STATUS_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DC0020010-DC0020010form2-RESULT_STATUS_TYP_DN" name="RESULT_STATUS_TYP_DN" class="DC0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDC0020010Struct.getRESULT_STATUS_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-DC0020010-DC0020010form2-RESULT_STATUS_TYP" name="RESULT_STATUS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDC0020010Struct.getRESULT_STATUS_TYP()) %>">
<script class="expj-script-DC0020010-DC0020010form2-RESULT_STATUS_TYP">
expj.DC0020010.DC0020010form2.RESULT_STATUS_TYP = {};
expj.DC0020010.DC0020010form2.RESULT_STATUS_TYP.executeAllOnDecision = function () {
  console.log('execute DC0020010form2/RESULT_STATUS_TYP.onDecision');
  expj.DC0020010.DC0020010form2.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form2.RESULT_STATUS_TYP.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form2-RESULT_STATUS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DC0020010', 'DC0020010form2', 'RESULT_STATUS_TYP', this);
  });
  expj.DC0020010.DC0020010form2.RESULT_STATUS_TYP.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form2.RESULT_STATUS_TYP.executePScriptOnLoad = function () {
  console.log('execute DC0020010form2/RESULT_STATUS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form2-RESULT_STATUS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
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
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0490",rb)%></span><!-- 実行区分 --></div><!--/td-->
<script class="expj-script-DC0020010-DC0020010form2-r1_ExecuteType">
expj.DC0020010.DC0020010form2.r1_ExecuteType = {};
expj.DC0020010.DC0020010form2.r1_ExecuteType.executeAllOnDecision = function () {
  console.log('execute DC0020010form2/r1_ExecuteType.onDecision');
  expj.DC0020010.DC0020010form2.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form2.r1_ExecuteType.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form2-r1_ExecuteType').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DC0020010', 'DC0020010form2', 'r1_ExecuteType', this, 'RadioButton');
    }
  });
  expj.DC0020010.DC0020010form2.r1_ExecuteType.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form2.r1_ExecuteType.executePScriptOnLoad = function () {
  console.log('execute DC0020010form2/r1_ExecuteType.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form2-r1_ExecuteType');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="ExecuteType" data-name="r1_ExecuteType" value="true" <%= ("true".equals(TypeConverter.convert(aDC0020010Struct.getr1_ExecuteType())))?"checked=\"checked\"":"" %> class="" id="expj-DC0020010-DC0020010form2-r1_ExecuteType" ><label for="expj-DC0020010-DC0020010form2-r1_ExecuteType"><%=CoreTools.getRBString("Expj.Cmt0266",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-DC0020010-DC0020010form2-r2_ExecuteType">
expj.DC0020010.DC0020010form2.r2_ExecuteType = {};
expj.DC0020010.DC0020010form2.r2_ExecuteType.executeAllOnDecision = function () {
  console.log('execute DC0020010form2/r2_ExecuteType.onDecision');
  expj.DC0020010.DC0020010form2.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form2.r2_ExecuteType.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form2-r2_ExecuteType').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DC0020010', 'DC0020010form2', 'r2_ExecuteType', this, 'RadioButton');
    }
  });
  expj.DC0020010.DC0020010form2.r2_ExecuteType.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form2.r2_ExecuteType.executePScriptOnLoad = function () {
  console.log('execute DC0020010form2/r2_ExecuteType.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form2-r2_ExecuteType');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="ExecuteType" data-name="r2_ExecuteType" value="true" <%= ("true".equals(TypeConverter.convert(aDC0020010Struct.getr2_ExecuteType())))?"checked=\"checked\"":"" %> class="" id="expj-DC0020010-DC0020010form2-r2_ExecuteType" ><label for="expj-DC0020010-DC0020010form2-r2_ExecuteType"><%=CoreTools.getRBString("Expj.Cmt0267",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-DC0020010-DC0020010form2-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDC0020010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-DC0020010-DC0020010form2-MODIFY_COUNT">
expj.DC0020010.DC0020010form2.MODIFY_COUNT = {};
expj.DC0020010.DC0020010form2.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute DC0020010form2/MODIFY_COUNT.onDecision');
  expj.DC0020010.DC0020010form2.executeAllOnDecision();
  expj.DC0020010.executeAllOnDecision();
};
expj.DC0020010.DC0020010form2.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010form2-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DC0020010', 'DC0020010form2', 'MODIFY_COUNT', this);
  });
  expj.DC0020010.DC0020010form2.MODIFY_COUNT.executePScriptOnLoad();
};

expj.DC0020010.DC0020010form2.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute DC0020010form2/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010form2-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-DC0020010-DC0020010button2">
expj.DC0020010.DC0020010button2 = {};
expj.DC0020010.DC0020010button2.executeAllOnDecision = function () {
  console.log('execute DC0020010button2.onDecision');
};
expj.DC0020010.DC0020010button2.executeOnLoad = function () {
  expj.DC0020010.DC0020010button2.executePScriptOnLoad();
};

expj.DC0020010.DC0020010button2.executePScriptOnLoad = function () {
  console.log('execute DC0020010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DC0020010-DC0020010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DC0020010-DC0020010button2-Execute">
expj.DC0020010.DC0020010button2.Execute = {};
// script1="onClick;0;CHK;_DC0020010form2/EXECUTE_STATUS_TYP[eq]1@#DC00101"
expj.DC0020010.DC0020010button2.Execute.onClick0 = function () {
  console.log('Execute script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DC0020010', 'DC0020010button2', '_DC0020010form2/EXECUTE_STATUS_TYP'), '[eq]', '1')) {
expj.common.pscript.addErrorMessage('DC0020010', 'DC0020010button2', 'DC00101');
}
};
// script2="onClick;1;CHK;_DC0020010form2/RESULT_STATUS_TYP[eq]2[or]_DC0020010form2/RESULT_STATUS_TYP[eq]3@*0"
expj.DC0020010.DC0020010button2.Execute.onClick1 = function () {
  console.log('Execute script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DC0020010', 'DC0020010button2', '_DC0020010form2/RESULT_STATUS_TYP'), '[eq]', '2') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DC0020010', 'DC0020010button2', '_DC0020010form2/RESULT_STATUS_TYP'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;CHK;_DC0020010form2/r1_ExecuteType[eq]true@$DC00102"
expj.DC0020010.DC0020010button2.Execute.child0 = function () {
  console.log('Execute script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DC0020010', 'DC0020010button2', '_DC0020010form2/r1_ExecuteType'), '[eq]', 'true')) {
expj.common.pscript.addWarningMessage('DC0020010', 'DC0020010button2', 'DC00102');
}
};
// script4="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DC0020010form1/*,_DC0020010form2/*@DC0020010Servlet,,$ZZ07009"
expj.DC0020010.DC0020010button2.Execute.onClick2 = function () {
  console.log('Execute script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DC0020010', 'DC0020010button2', '_DC0020010form1/*,_DC0020010form2/*', 'DC0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DC0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DC0020010', response);
expj.common.updateBusinessScreenTab('DC0020010', contents);
};
expj.common.pscript.callConfirm('DC0020010', 'DC0020010button2', 'ZZ07009', okEvent);
};
expj.DC0020010.DC0020010button2.Execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DC0020010.DC0020010button2.Execute['onClick' + i])) {
        expj.DC0020010.DC0020010button2.Execute['onClick' + i]();
      }
    }
  }
};
expj.DC0020010.DC0020010button2.Execute.executeAllOnDecision = function () {
};
expj.DC0020010.DC0020010button2.Execute.executeOnLoad = function () {
  $('#expj-DC0020010-DC0020010button2-Execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DC0020010', 'DC0020010button2', 'Execute', this, 'Button');
    }
  });
  expj.DC0020010.DC0020010button2.Execute.executePScriptOnLoad();
};

expj.DC0020010.DC0020010button2.Execute.executePScriptOnLoad = function () {
  console.log('execute DC0020010button2/Execute.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DC0020010button2-Execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DC0020010-DC0020010button2-Execute" name="Execute" class="DC0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
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
<span class="version">DC0020010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-DC0020010-DA0010010button0">
expj.DC0020010.DA0010010button0 = {};
expj.DC0020010.DA0010010button0.executeAllOnDecision = function () {
  console.log('execute DA0010010button0.onDecision');
};
expj.DC0020010.DA0010010button0.executeOnLoad = function () {
  expj.DC0020010.DA0010010button0.executePScriptOnLoad();
};

expj.DC0020010.DA0010010button0.executePScriptOnLoad = function () {
  console.log('execute DA0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DC0020010-DA0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DC0020010-DA0010010button0-Clear">
expj.DC0020010.DA0010010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@DC0020010Servlet,,$ZZ07008"
expj.DC0020010.DA0010010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DC0020010', 'DA0010010button0', '', 'DC0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DC0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DC0020010', response);
expj.common.updateBusinessScreenTab('DC0020010', contents);
};
expj.common.pscript.callConfirm('DC0020010', 'DA0010010button0', 'ZZ07008', okEvent);
};
expj.DC0020010.DA0010010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DC0020010.DA0010010button0.Clear['onClick' + i])) {
        expj.DC0020010.DA0010010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.DC0020010.DA0010010button0.Clear.executeAllOnDecision = function () {
};
expj.DC0020010.DA0010010button0.Clear.executeOnLoad = function () {
  $('#expj-DC0020010-DA0010010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DC0020010', 'DA0010010button0', 'Clear', this, 'Button');
    }
  });
  expj.DC0020010.DA0010010button0.Clear.executePScriptOnLoad();
};

expj.DC0020010.DA0010010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute DA0010010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DA0010010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DC0020010-DA0010010button0-Clear" name="Clear" class="DC0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-DC0020010-DA0010010button0-Close">
expj.DC0020010.DA0010010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.DC0020010.DA0010010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('DC0020010');
};
expj.DC0020010.DA0010010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DC0020010.DA0010010button0.Close['onClick' + i])) {
        expj.DC0020010.DA0010010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.DC0020010.DA0010010button0.Close.executeAllOnDecision = function () {
};
expj.DC0020010.DA0010010button0.Close.executeOnLoad = function () {
  $('#expj-DC0020010-DA0010010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DC0020010', 'DA0010010button0', 'Close', this, 'Button');
    }
  });
  expj.DC0020010.DA0010010button0.Close.executePScriptOnLoad();
};

expj.DC0020010.DA0010010button0.Close.executePScriptOnLoad = function () {
  console.log('execute DA0010010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-DC0020010-DA0010010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DC0020010-DA0010010button0-Close" name="Close" class="DC0020010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-DC0020010 (END)-->
<%
MessageStruct msgStruct = aDC0020010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-DC0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DC0020010)) {
  expj.common.treeInstanceMap.DC0020010 = {};
}
expj.common.treeInstanceMap.DC0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.DC0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.DC0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.DC0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.DC0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DC0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DC0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DC0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DC0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DC0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-DC0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DC0020010)) {
  expj.common.detailDialogMap.DC0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DC0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DC0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DC0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.DC0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DC0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DC0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DC0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DC0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DC0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DC0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DC0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.DC0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DC0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.DC0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DC0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DC0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DC0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DC0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DC0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-DC0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DC0020010)) {
  expj.common.viewInstanceMap.DC0020010 = {};
}
expj.common.viewInstanceMap.DC0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.DC0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DC0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DC0020010.<%=viewId %>.init = function () {
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
    expj.DC0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DC0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DC0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DC0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DC0020010_init">
/**
 * DC0020010用のロード完了時初期化関数
 */
expj.DC0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DC0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('DC0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('DC0020010');
  expj.common.calendarInstanceMap.DC0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.DC0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.DC0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.DC0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DC0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DC0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DC0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DC0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DC0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DC0020010-<%=detailId %>');
<%
 }
%>
  try{expj.DC0020010.DC0020010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form1.YEAR.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form1.HALF_TERM_TYP.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010button1.Select.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form2.START_TIME.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form2.STOP_TIME.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form2.CS_CALC_PROC_NO_DN.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form2.CS_CALC_PROC_NO.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form2.EXECUTE_STATUS_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form2.EXECUTE_STATUS_TYP.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form2.RESULT_STATUS_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form2.RESULT_STATUS_TYP.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form2.r1_ExecuteType.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form2.r2_ExecuteType.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form2.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010button2.Execute.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DA0010010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DA0010010button0.Close.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form1.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010button1.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010form2.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DC0020010button2.executeOnLoad();}catch(e){};
  try{expj.DC0020010.DA0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.DC0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DC0020010', 'DC0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DC0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.DC0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.DC0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('DC0020010', '<%=request.getContextPath() %>');
};

/**
 * DC0020010の全体onDecision処理
 */
expj.DC0020010.executeAllOnDecision = function () {
  expj.DC0020010.DC0020010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-DC0020010_console">
expj.DC0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>