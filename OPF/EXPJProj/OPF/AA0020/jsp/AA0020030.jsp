<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:20:58 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0020\AA0020030.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0020.*" %>
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
<jsp:useBean id="aAA0020030Control" class="com.nec.jp.orteus.metamorBase.AA0020.AA0020030Control" scope="request"/>
<jsp:useBean id="aAA0020030Struct" class="com.nec.jp.orteus.metamorBase.AA0020.AA0020030Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

製品構成台帳出力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0020/jsp/AA0020030.jsp,v $
$Author: geng-jia $
$Revision: 1.10 $ $Date: 2017/02/22 02:03:45 $
********************************************************* --%>
<html>
<head>
<title>製品構成台帳出力</title>
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
<script class="expj-script-AA0020030_init">
  // AA0020030名前空間
  expj.AA0020030 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0020030" data-screen="AA0020030" data-newdata="<%=aAA0020030Control.isNewData() %>">
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
              <script class="expj-script-AA0020030-AA0020030form1">
expj.AA0020030.AA0020030form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AA0020030.AA0020030form1.onLoad0 = function () {
  console.log('AA0020030form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AA0020030.AA0020030form1.onDecision0 = function () {
  console.log('AA0020030form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0020030', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AA0020030button0/Print"
expj.AA0020030.AA0020030form1.child0 = function () {
  console.log('AA0020030form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0020030', 'AA0020030form1', '_AA0020030button0/Print');
};
// script4="child;1;MASK;_AA0020030button0/Print"
expj.AA0020030.AA0020030form1.child1 = function () {
  console.log('AA0020030form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0020030', 'AA0020030form1', '_AA0020030button0/Print');
};
expj.AA0020030.AA0020030form1.executeAllOnDecision = function () {
  console.log('execute AA0020030form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020030.AA0020030form1['onDecision' + i])) {
        expj.AA0020030.AA0020030form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0020030.AA0020030form1.executeOnLoad = function () {
  expj.AA0020030.AA0020030form1.executePScriptOnLoad();
};

expj.AA0020030.AA0020030form1.executePScriptOnLoad = function () {
  console.log('execute AA0020030form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0020030.AA0020030form1['onLoad' + i])) {
      expj.AA0020030.AA0020030form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0020030-AA0020030form1" action="AA0020030Servlet" name="AA0020030form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD_6",rb)%></span><!-- 対象品目番号 --></div><!--/td-->
<script class="expj-script-AA0020030-AA0020030form1-w_TARGET_ITEM_CD">
expj.AA0020030.AA0020030form1.w_TARGET_ITEM_CD = {};
expj.AA0020030.AA0020030form1.w_TARGET_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0020030form1/w_TARGET_ITEM_CD.onDecision');
  expj.AA0020030.AA0020030form1.executeAllOnDecision();
  expj.AA0020030.executeAllOnDecision();
};
expj.AA0020030.AA0020030form1.w_TARGET_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0020030-AA0020030form1-w_TARGET_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0020030', 'AA0020030form1', 'w_TARGET_ITEM_CD', this);
  });
  expj.AA0020030.AA0020030form1.w_TARGET_ITEM_CD.executePScriptOnLoad();
};

expj.AA0020030.AA0020030form1.w_TARGET_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0020030form1/w_TARGET_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0020030-AA0020030form1-w_TARGET_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0020030-AA0020030form1-w_TARGET_ITEM_CD" name="w_TARGET_ITEM_CD" class="AA0020030-focus-move  required-value expj-AA0020030-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0020030Struct.getw_TARGET_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0020030-AA0020030form1-Peekerw_TARGET_ITEM_CD">
expj.AA0020030.AA0020030form1.Peekerw_TARGET_ITEM_CD = {};
// script1="onClick;0;PEEKER;_AA0020030form1/w_TARGET_ITEM_CD@<%=contextNo%>"
expj.AA0020030.AA0020030form1.Peekerw_TARGET_ITEM_CD.onClick0 = function () {
  console.log('Peekerw_TARGET_ITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0020030';
var parameterValues = 'Peekerw_TARGET_ITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0020030', 'AA0020030form1', '_AA0020030form1/w_TARGET_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0020030form1/w_TARGET_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0020030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0020030.AA0020030form1.Peekerw_TARGET_ITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020030.AA0020030form1.Peekerw_TARGET_ITEM_CD['onClick' + i])) {
        expj.AA0020030.AA0020030form1.Peekerw_TARGET_ITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.AA0020030.AA0020030form1.Peekerw_TARGET_ITEM_CD.executeAllOnDecision = function () {
};
expj.AA0020030.AA0020030form1.Peekerw_TARGET_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0020030-AA0020030form1-Peekerw_TARGET_ITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0020030', 'AA0020030form1', 'Peekerw_TARGET_ITEM_CD', this, 'Button');
    }
  });
  expj.AA0020030.AA0020030form1.Peekerw_TARGET_ITEM_CD.executePScriptOnLoad();
};

expj.AA0020030.AA0020030form1.Peekerw_TARGET_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0020030form1/Peekerw_TARGET_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0020030-AA0020030form1-Peekerw_TARGET_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0020030-AA0020030form1-Peekerw_TARGET_ITEM_CD" class="AA0020030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EFF_PHASE_OUT_DATE_3",rb)%></span><!-- 対象日付 --></div><!--/td-->
<script class="expj-script-AA0020030-AA0020030form1-w_TARGET_DATE">
expj.AA0020030.AA0020030form1.w_TARGET_DATE = {};
expj.AA0020030.AA0020030form1.w_TARGET_DATE.executeAllOnDecision = function () {
  console.log('execute AA0020030form1/w_TARGET_DATE.onDecision');
  expj.AA0020030.AA0020030form1.executeAllOnDecision();
  expj.AA0020030.executeAllOnDecision();
};
expj.AA0020030.AA0020030form1.w_TARGET_DATE.executeOnLoad = function () {
  $('#expj-AA0020030-AA0020030form1-w_TARGET_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0020030', 'AA0020030form1', 'w_TARGET_DATE', this);
  });
  expj.AA0020030.AA0020030form1.w_TARGET_DATE.executePScriptOnLoad();
};

expj.AA0020030.AA0020030form1.w_TARGET_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0020030form1/w_TARGET_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0020030-AA0020030form1-w_TARGET_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0020030-AA0020030form1-w_TARGET_DATE" name="w_TARGET_DATE" class="AA0020030-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0020030Struct.getw_TARGET_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0020030-AA0020030form1-Calendarw_TARGET_DATE">
expj.AA0020030.AA0020030form1.Calendarw_TARGET_DATE = {};
// script1="onClick;0;CALENDAR;_AA0020030form1/w_TARGET_DATE"
expj.AA0020030.AA0020030form1.Calendarw_TARGET_DATE.onClick0 = function () {
  console.log('Calendarw_TARGET_DATE script1');
expj.common.pscript.executeCalendar('AA0020030','AA0020030form1','_AA0020030form1/w_TARGET_DATE');
};
expj.AA0020030.AA0020030form1.Calendarw_TARGET_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020030.AA0020030form1.Calendarw_TARGET_DATE['onClick' + i])) {
        expj.AA0020030.AA0020030form1.Calendarw_TARGET_DATE['onClick' + i]();
      }
    }
  }
};
expj.AA0020030.AA0020030form1.Calendarw_TARGET_DATE.executeAllOnDecision = function () {
};
expj.AA0020030.AA0020030form1.Calendarw_TARGET_DATE.executeOnLoad = function () {
  $('#expj-AA0020030-AA0020030form1-Calendarw_TARGET_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0020030', 'AA0020030form1', 'Calendarw_TARGET_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0020030','AA0020030form1','_AA0020030form1/w_TARGET_DATE');
  expj.AA0020030.AA0020030form1.Calendarw_TARGET_DATE.executePScriptOnLoad();
};

expj.AA0020030.AA0020030form1.Calendarw_TARGET_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0020030form1/Calendarw_TARGET_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0020030-AA0020030form1-Calendarw_TARGET_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0020030-AA0020030form1-Calendarw_TARGET_DATE" class="AA0020030-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0435",rb)%></span><!-- 展開レベル --></div><!--/td-->
<script class="expj-script-AA0020030-AA0020030form1-w_LEVEL">
expj.AA0020030.AA0020030form1.w_LEVEL = {};
expj.AA0020030.AA0020030form1.w_LEVEL.executeAllOnDecision = function () {
  console.log('execute AA0020030form1/w_LEVEL.onDecision');
  expj.AA0020030.AA0020030form1.executeAllOnDecision();
  expj.AA0020030.executeAllOnDecision();
};
expj.AA0020030.AA0020030form1.w_LEVEL.executeOnLoad = function () {
  $('#expj-AA0020030-AA0020030form1-w_LEVEL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0020030', 'AA0020030form1', 'w_LEVEL', this);
  });
  expj.AA0020030.AA0020030form1.w_LEVEL.executePScriptOnLoad();
};

expj.AA0020030.AA0020030form1.w_LEVEL.executePScriptOnLoad = function () {
  console.log('execute AA0020030form1/w_LEVEL.onLoad');
  var targetComponent = document.getElementById('expj-AA0020030-AA0020030form1-w_LEVEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0020030-AA0020030form1-w_LEVEL" name="w_LEVEL" class="AA0020030-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAA0020030Struct.getw_LEVEL()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0017",rb)%></span><!-- 展開区分 --></div><!--/td-->
<script class="expj-script-AA0020030-AA0020030form1-s_DEVELOP_TYP">
expj.AA0020030.AA0020030form1.s_DEVELOP_TYP = {};
expj.AA0020030.AA0020030form1.s_DEVELOP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0020030form1/s_DEVELOP_TYP.onDecision');
  expj.AA0020030.AA0020030form1.executeAllOnDecision();
  expj.AA0020030.executeAllOnDecision();
};
expj.AA0020030.AA0020030form1.s_DEVELOP_TYP.executeOnLoad = function () {
  $('#expj-AA0020030-AA0020030form1-s_DEVELOP_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0020030', 'AA0020030form1', 's_DEVELOP_TYP', this);
  });
  expj.AA0020030.AA0020030form1.s_DEVELOP_TYP.executePScriptOnLoad();
};

expj.AA0020030.AA0020030form1.s_DEVELOP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0020030form1/s_DEVELOP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0020030-AA0020030form1-s_DEVELOP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0020030-AA0020030form1-s_DEVELOP_TYP" name='s_DEVELOP_TYP' class='AA0020030-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0020030Control.getStruct().getList_s_DEVELOP_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0020030Control.getStruct().getList_s_DEVELOP_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0020030Control.getStruct().getList_s_DEVELOP_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0020030Struct.gets_DEVELOP_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AA0020030-AA0020030form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0020030Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AA0020030-AA0020030form1-DOWNLOAD_FILE">
expj.AA0020030.AA0020030form1.DOWNLOAD_FILE = {};
expj.AA0020030.AA0020030form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AA0020030form1/DOWNLOAD_FILE.onDecision');
  expj.AA0020030.AA0020030form1.executeAllOnDecision();
  expj.AA0020030.executeAllOnDecision();
};
expj.AA0020030.AA0020030form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AA0020030-AA0020030form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0020030', 'AA0020030form1', 'DOWNLOAD_FILE', this);
  });
  expj.AA0020030.AA0020030form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AA0020030.AA0020030form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AA0020030form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AA0020030-AA0020030form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0020030 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AA0020030-AA0020030button0">
expj.AA0020030.AA0020030button0 = {};
expj.AA0020030.AA0020030button0.executeAllOnDecision = function () {
  console.log('execute AA0020030button0.onDecision');
};
expj.AA0020030.AA0020030button0.executeOnLoad = function () {
  expj.AA0020030.AA0020030button0.executePScriptOnLoad();
};

expj.AA0020030.AA0020030button0.executePScriptOnLoad = function () {
  console.log('execute AA0020030button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0020030-AA0020030button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0020030-AA0020030button0-Print">
expj.AA0020030.AA0020030button0.Print = {};
// script1="onClick;0;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AA0020030form1/*@AA0020030Servlet:C,M,M"
expj.AA0020030.AA0020030button0.Print.onClick0 = function () {
  console.log('Print script1');
expj.common.pscript.viewPrinterDialog('AA0020030', 'AA0020030button0', '_AA0020030form1/*', 'AA0020030Servlet', 'C,M,M');
};
expj.AA0020030.AA0020030button0.Print.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020030.AA0020030button0.Print['onClick' + i])) {
        expj.AA0020030.AA0020030button0.Print['onClick' + i]();
      }
    }
  }
};
expj.AA0020030.AA0020030button0.Print.executeAllOnDecision = function () {
};
expj.AA0020030.AA0020030button0.Print.executeOnLoad = function () {
  $('#expj-AA0020030-AA0020030button0-Print').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0020030', 'AA0020030button0', 'Print', this, 'Button');
    }
  });
  expj.AA0020030.AA0020030button0.Print.executePScriptOnLoad();
};

expj.AA0020030.AA0020030button0.Print.executePScriptOnLoad = function () {
  console.log('execute AA0020030button0/Print.onLoad');
  var targetComponent = document.getElementById('expj-AA0020030-AA0020030button0-Print');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0020030-AA0020030button0-Print" name="Print" class="AA0020030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPrint",rb)%></button><!-- 帳票出力ボタン --></div><!--/td-->
<script class="expj-script-AA0020030-AA0020030button0-clear">
expj.AA0020030.AA0020030button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0020030form1/*@AA0020030Servlet,,$ZZ07008"
expj.AA0020030.AA0020030button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0020030', 'AA0020030button0', '_AA0020030form1/*', 'AA0020030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0020030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0020030', response);
expj.common.updateBusinessScreenTab('AA0020030', contents);
};
expj.common.pscript.callConfirm('AA0020030', 'AA0020030button0', 'ZZ07008', okEvent);
};
expj.AA0020030.AA0020030button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020030.AA0020030button0.clear['onClick' + i])) {
        expj.AA0020030.AA0020030button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AA0020030.AA0020030button0.clear.executeAllOnDecision = function () {
};
expj.AA0020030.AA0020030button0.clear.executeOnLoad = function () {
  $('#expj-AA0020030-AA0020030button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0020030', 'AA0020030button0', 'clear', this, 'Button');
    }
  });
  expj.AA0020030.AA0020030button0.clear.executePScriptOnLoad();
};

expj.AA0020030.AA0020030button0.clear.executePScriptOnLoad = function () {
  console.log('execute AA0020030button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0020030-AA0020030button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0020030-AA0020030button0-clear" name="clear" class="AA0020030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0020030-AA0020030button0-close">
expj.AA0020030.AA0020030button0.close = {};
// script1="onClick;0;CLOSE"
expj.AA0020030.AA0020030button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AA0020030');
};
expj.AA0020030.AA0020030button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020030.AA0020030button0.close['onClick' + i])) {
        expj.AA0020030.AA0020030button0.close['onClick' + i]();
      }
    }
  }
};
expj.AA0020030.AA0020030button0.close.executeAllOnDecision = function () {
};
expj.AA0020030.AA0020030button0.close.executeOnLoad = function () {
  $('#expj-AA0020030-AA0020030button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0020030', 'AA0020030button0', 'close', this, 'Button');
    }
  });
  expj.AA0020030.AA0020030button0.close.executePScriptOnLoad();
};

expj.AA0020030.AA0020030button0.close.executePScriptOnLoad = function () {
  console.log('execute AA0020030button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AA0020030-AA0020030button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0020030-AA0020030button0-close" name="close" class="AA0020030-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0020030 (END)-->
<%
MessageStruct msgStruct = aAA0020030Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0020030-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0020030)) {
  expj.common.treeInstanceMap.AA0020030 = {};
}
expj.common.treeInstanceMap.AA0020030.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0020030.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0020030.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0020030.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0020030.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0020030.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0020030.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0020030.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0020030.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0020030-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0020030-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0020030)) {
  expj.common.detailDialogMap.AA0020030 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0020030._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0020030._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0020030.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0020030.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0020030.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0020030.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0020030.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0020030.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0020030.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0020030.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0020030-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0020030.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0020030-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0020030.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0020030-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0020030.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0020030.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0020030.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0020030._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0020030-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0020030)) {
  expj.common.viewInstanceMap.AA0020030 = {};
}
expj.common.viewInstanceMap.AA0020030.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0020030.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0020030.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0020030.<%=viewId %>.init = function () {
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
    expj.AA0020030.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0020030.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0020030-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0020030-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0020030_init">
/**
 * AA0020030用のロード完了時初期化関数
 */
expj.AA0020030.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0020030');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0020030');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0020030');
  expj.common.calendarInstanceMap.AA0020030 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0020030.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0020030.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0020030.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0020030.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0020030.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0020030');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0020030');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0020030-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0020030-<%=detailId %>');
<%
 }
%>
  try{expj.AA0020030.AA0020030form1.w_TARGET_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0020030.AA0020030form1.Peekerw_TARGET_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0020030.AA0020030form1.w_TARGET_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0020030.AA0020030form1.Calendarw_TARGET_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0020030.AA0020030form1.w_LEVEL.executeOnLoad();}catch(e){};
  try{expj.AA0020030.AA0020030form1.s_DEVELOP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0020030.AA0020030form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AA0020030.AA0020030button0.Print.executeOnLoad();}catch(e){};
  try{expj.AA0020030.AA0020030button0.clear.executeOnLoad();}catch(e){};
  try{expj.AA0020030.AA0020030button0.close.executeOnLoad();}catch(e){};
  try{expj.AA0020030.AA0020030form1.executeOnLoad();}catch(e){};
  try{expj.AA0020030.AA0020030button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0020030.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0020030', 'AA0020030');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0020030');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0020030-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0020030-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0020030', '<%=request.getContextPath() %>');
};

/**
 * AA0020030の全体onDecision処理
 */
expj.AA0020030.executeAllOnDecision = function () {
  expj.AA0020030.AA0020030form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0020030_console">
expj.AA0020030.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>