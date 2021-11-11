<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:42:32 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AH0040\AH0040010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AH0040.*" %>
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
<jsp:useBean id="aAH0040010Control" class="com.nec.jp.orteus.metamorBase.AH0040.AH0040010Control" scope="request"/>
<jsp:useBean id="aAH0040010Struct" class="com.nec.jp.orteus.metamorBase.AH0040.AH0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

棚卸日在庫退避
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0040/jsp/AH0040010.jsp,v $
$Author: geng-jia $
$Revision: 1.9 $ $Date: 2017/02/22 02:06:05 $
********************************************************* --%>
<html>
<head>
<title>棚卸日在庫退避</title>
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
<script class="expj-script-AH0040010_init">
  // AH0040010名前空間
  expj.AH0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AH0040010" data-screen="AH0040010" data-newdata="<%=aAH0040010Control.isNewData() %>">
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
              <script class="expj-script-AH0040010-AH0040010form1">
expj.AH0040010.AH0040010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.AH0040010.AH0040010form1.onLoad0 = function () {
  console.log('AH0040010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AH0040010.AH0040010form1.onDecision0 = function () {
  console.log('AH0040010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AH0040010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AH0040010button1/select"
expj.AH0040010.AH0040010form1.child0 = function () {
  console.log('AH0040010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AH0040010', 'AH0040010form1', '_AH0040010button1/select');
};
// script4="child;1;MASK;_AH0040010button1/select"
expj.AH0040010.AH0040010form1.child1 = function () {
  console.log('AH0040010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AH0040010', 'AH0040010form1', '_AH0040010button1/select');
};
// script5="onDecision;1;CHKRQ;A@*2,*5"
expj.AH0040010.AH0040010form1.onDecision1 = function () {
  console.log('AH0040010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AH0040010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;2;CHK;?AH0040010form1/*[eq]NORMAL@*3,*5"
expj.AH0040010.AH0040010form1.child2 = function () {
  console.log('AH0040010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0040010', 'AH0040010form1', '?AH0040010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;3;CHK;_AH0040010form1/INV_DATE[eq]_AH0040010form1/h_saveINV_DATE@*4,*5"
expj.AH0040010.AH0040010form1.child3 = function () {
  console.log('AH0040010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0040010', 'AH0040010form1', '_AH0040010form1/INV_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AH0040010', 'AH0040010form1', '_AH0040010form1/h_saveINV_DATE'))) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_AH0040010button2/execute"
expj.AH0040010.AH0040010form1.child4 = function () {
  console.log('AH0040010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AH0040010', 'AH0040010form1', '_AH0040010button2/execute');
};
// script9="child;5;MASK;_AH0040010button2/execute"
expj.AH0040010.AH0040010form1.child5 = function () {
  console.log('AH0040010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AH0040010', 'AH0040010form1', '_AH0040010button2/execute');
};
// script10="onDecision;2;MASK;_AH0040010form2/c_REGULAR_INV_FLG,_AH0040010form2/c_CYCLE_INV_FLG,_AH0040010form2/c_TEMP_INV_FLG"
expj.AH0040010.AH0040010form1.onDecision2 = function () {
  console.log('AH0040010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AH0040010', 'AH0040010form1', '_AH0040010form2/c_REGULAR_INV_FLG');
expj.common.pscript.setMaskToReferenceComponent('AH0040010', 'AH0040010form1', '_AH0040010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setMaskToReferenceComponent('AH0040010', 'AH0040010form1', '_AH0040010form2/c_TEMP_INV_FLG');
};
expj.AH0040010.AH0040010form1.executeAllOnDecision = function () {
  console.log('execute AH0040010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0040010.AH0040010form1['onDecision' + i])) {
        expj.AH0040010.AH0040010form1['onDecision' + i]();
      }
    }
  }
};
expj.AH0040010.AH0040010form1.executeOnLoad = function () {
  expj.AH0040010.AH0040010form1.executePScriptOnLoad();
};

expj.AH0040010.AH0040010form1.executePScriptOnLoad = function () {
  console.log('execute AH0040010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AH0040010.AH0040010form1['onLoad' + i])) {
      expj.AH0040010.AH0040010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0040010-AH0040010form1" action="AH0040010Servlet" name="AH0040010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAH0040010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.INV_DATE",rb)%></span><!-- 棚卸日 --></div><!--/td-->
<script class="expj-script-AH0040010-AH0040010form1-INV_DATE">
expj.AH0040010.AH0040010form1.INV_DATE = {};
expj.AH0040010.AH0040010form1.INV_DATE.executeAllOnDecision = function () {
  console.log('execute AH0040010form1/INV_DATE.onDecision');
  expj.AH0040010.AH0040010form1.executeAllOnDecision();
  expj.AH0040010.executeAllOnDecision();
};
expj.AH0040010.AH0040010form1.INV_DATE.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010form1-INV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0040010', 'AH0040010form1', 'INV_DATE', this);
  });
  expj.AH0040010.AH0040010form1.INV_DATE.executePScriptOnLoad();
};

expj.AH0040010.AH0040010form1.INV_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0040010form1/INV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010form1-INV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0040010-AH0040010form1-INV_DATE" name="INV_DATE" class="AH0040010-focus-move  required-value expj-AH0040010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAH0040010Struct.getINV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AH0040010-AH0040010form1-CalendarINV_DATE">
expj.AH0040010.AH0040010form1.CalendarINV_DATE = {};
// script1="onClick;0;CALENDAR;_AH0040010form1/INV_DATE"
expj.AH0040010.AH0040010form1.CalendarINV_DATE.onClick0 = function () {
  console.log('CalendarINV_DATE script1');
expj.common.pscript.executeCalendar('AH0040010','AH0040010form1','_AH0040010form1/INV_DATE');
};
expj.AH0040010.AH0040010form1.CalendarINV_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0040010.AH0040010form1.CalendarINV_DATE['onClick' + i])) {
        expj.AH0040010.AH0040010form1.CalendarINV_DATE['onClick' + i]();
      }
    }
  }
};
expj.AH0040010.AH0040010form1.CalendarINV_DATE.executeAllOnDecision = function () {
};
expj.AH0040010.AH0040010form1.CalendarINV_DATE.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010form1-CalendarINV_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0040010', 'AH0040010form1', 'CalendarINV_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AH0040010','AH0040010form1','_AH0040010form1/INV_DATE');
  expj.AH0040010.AH0040010form1.CalendarINV_DATE.executePScriptOnLoad();
};

expj.AH0040010.AH0040010form1.CalendarINV_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0040010form1/CalendarINV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010form1-CalendarINV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0040010-AH0040010form1-CalendarINV_DATE" class="AH0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AH0040010-AH0040010form1-w_INV_STS_TYP">
expj.AH0040010.AH0040010form1.w_INV_STS_TYP = {};
expj.AH0040010.AH0040010form1.w_INV_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AH0040010form1/w_INV_STS_TYP.onDecision');
  expj.AH0040010.AH0040010form1.executeAllOnDecision();
  expj.AH0040010.executeAllOnDecision();
};
expj.AH0040010.AH0040010form1.w_INV_STS_TYP.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010form1-w_INV_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0040010', 'AH0040010form1', 'w_INV_STS_TYP', this);
  });
  expj.AH0040010.AH0040010form1.w_INV_STS_TYP.executePScriptOnLoad();
};

expj.AH0040010.AH0040010form1.w_INV_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AH0040010form1/w_INV_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010form1-w_INV_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:430px;text-align:left;"><input type="text" id="expj-AH0040010-AH0040010form1-w_INV_STS_TYP" name="w_INV_STS_TYP" class="AH0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0040010Struct.getw_INV_STS_TYP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AH0040010-AH0040010form1-h_saveINV_DATE" name="h_saveINV_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0040010Struct.geth_saveINV_DATE()) %>">
<script class="expj-script-AH0040010-AH0040010form1-h_saveINV_DATE">
expj.AH0040010.AH0040010form1.h_saveINV_DATE = {};
expj.AH0040010.AH0040010form1.h_saveINV_DATE.executeAllOnDecision = function () {
  console.log('execute AH0040010form1/h_saveINV_DATE.onDecision');
  expj.AH0040010.AH0040010form1.executeAllOnDecision();
  expj.AH0040010.executeAllOnDecision();
};
expj.AH0040010.AH0040010form1.h_saveINV_DATE.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010form1-h_saveINV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0040010', 'AH0040010form1', 'h_saveINV_DATE', this);
  });
  expj.AH0040010.AH0040010form1.h_saveINV_DATE.executePScriptOnLoad();
};

expj.AH0040010.AH0040010form1.h_saveINV_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0040010form1/h_saveINV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010form1-h_saveINV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AH0040010-AH0040010button1">
expj.AH0040010.AH0040010button1 = {};
expj.AH0040010.AH0040010button1.executeAllOnDecision = function () {
  console.log('execute AH0040010button1.onDecision');
};
expj.AH0040010.AH0040010button1.executeOnLoad = function () {
  expj.AH0040010.AH0040010button1.executePScriptOnLoad();
};

expj.AH0040010.AH0040010button1.executePScriptOnLoad = function () {
  console.log('execute AH0040010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0040010-AH0040010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0040010-AH0040010button1-select">
expj.AH0040010.AH0040010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0040010form1/*@AH0040010Servlet"
expj.AH0040010.AH0040010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0040010', 'AH0040010button1', '_AH0040010form1/*', 'AH0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0040010', response);
expj.common.updateBusinessScreenTab('AH0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AH0040010.AH0040010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0040010.AH0040010button1.select['onClick' + i])) {
        expj.AH0040010.AH0040010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AH0040010.AH0040010button1.select.executeAllOnDecision = function () {
};
expj.AH0040010.AH0040010button1.select.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0040010', 'AH0040010button1', 'select', this, 'Button');
    }
  });
  expj.AH0040010.AH0040010button1.select.executePScriptOnLoad();
};

expj.AH0040010.AH0040010button1.select.executePScriptOnLoad = function () {
  console.log('execute AH0040010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0040010-AH0040010button1-select" name="select" class="AH0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AH0040010-AH0040010form2">
expj.AH0040010.AH0040010form2 = {};
expj.AH0040010.AH0040010form2.executeAllOnDecision = function () {
  console.log('execute AH0040010form2.onDecision');
};
expj.AH0040010.AH0040010form2.executeOnLoad = function () {
  expj.AH0040010.AH0040010form2.executePScriptOnLoad();
};

expj.AH0040010.AH0040010form2.executePScriptOnLoad = function () {
  console.log('execute AH0040010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0040010-AH0040010form2" action="AH0040010Servlet" name="AH0040010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0040010-AH0040010form2-c_REGULAR_INV_FLG">
expj.AH0040010.AH0040010form2.c_REGULAR_INV_FLG = {};
expj.AH0040010.AH0040010form2.c_REGULAR_INV_FLG.executeAllOnDecision = function () {
  console.log('execute AH0040010form2/c_REGULAR_INV_FLG.onDecision');
  expj.AH0040010.AH0040010form2.executeAllOnDecision();
  expj.AH0040010.executeAllOnDecision();
};
expj.AH0040010.AH0040010form2.c_REGULAR_INV_FLG.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010form2-c_REGULAR_INV_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0040010', 'AH0040010form2', 'c_REGULAR_INV_FLG', this, 'CheckBox');
    }
  });
  expj.AH0040010.AH0040010form2.c_REGULAR_INV_FLG.executePScriptOnLoad();
};

expj.AH0040010.AH0040010form2.c_REGULAR_INV_FLG.executePScriptOnLoad = function () {
  console.log('execute AH0040010form2/c_REGULAR_INV_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010form2-c_REGULAR_INV_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_REGULAR_INV_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAH0040010Struct.getc_REGULAR_INV_FLG())) || "1".equals(TypeConverter.convert(aAH0040010Struct.getc_REGULAR_INV_FLG())))?"checked=\"checked\"":"" %>  class="AH0040010-focus-move" id="expj-AH0040010-AH0040010form2-c_REGULAR_INV_FLG"><label for="expj-AH0040010-AH0040010form2-c_REGULAR_INV_FLG"><%=CoreTools.getRBString("Expj.REGULAR_INV_FLG_1",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0040010-AH0040010form2-c_CYCLE_INV_FLG">
expj.AH0040010.AH0040010form2.c_CYCLE_INV_FLG = {};
expj.AH0040010.AH0040010form2.c_CYCLE_INV_FLG.executeAllOnDecision = function () {
  console.log('execute AH0040010form2/c_CYCLE_INV_FLG.onDecision');
  expj.AH0040010.AH0040010form2.executeAllOnDecision();
  expj.AH0040010.executeAllOnDecision();
};
expj.AH0040010.AH0040010form2.c_CYCLE_INV_FLG.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010form2-c_CYCLE_INV_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0040010', 'AH0040010form2', 'c_CYCLE_INV_FLG', this, 'CheckBox');
    }
  });
  expj.AH0040010.AH0040010form2.c_CYCLE_INV_FLG.executePScriptOnLoad();
};

expj.AH0040010.AH0040010form2.c_CYCLE_INV_FLG.executePScriptOnLoad = function () {
  console.log('execute AH0040010form2/c_CYCLE_INV_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010form2-c_CYCLE_INV_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_CYCLE_INV_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAH0040010Struct.getc_CYCLE_INV_FLG())) || "1".equals(TypeConverter.convert(aAH0040010Struct.getc_CYCLE_INV_FLG())))?"checked=\"checked\"":"" %>  class="AH0040010-focus-move" id="expj-AH0040010-AH0040010form2-c_CYCLE_INV_FLG"><label for="expj-AH0040010-AH0040010form2-c_CYCLE_INV_FLG"><%=CoreTools.getRBString("Expj.CYCLE_INV_FLG_1",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0040010-AH0040010form2-c_TEMP_INV_FLG">
expj.AH0040010.AH0040010form2.c_TEMP_INV_FLG = {};
expj.AH0040010.AH0040010form2.c_TEMP_INV_FLG.executeAllOnDecision = function () {
  console.log('execute AH0040010form2/c_TEMP_INV_FLG.onDecision');
  expj.AH0040010.AH0040010form2.executeAllOnDecision();
  expj.AH0040010.executeAllOnDecision();
};
expj.AH0040010.AH0040010form2.c_TEMP_INV_FLG.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010form2-c_TEMP_INV_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0040010', 'AH0040010form2', 'c_TEMP_INV_FLG', this, 'CheckBox');
    }
  });
  expj.AH0040010.AH0040010form2.c_TEMP_INV_FLG.executePScriptOnLoad();
};

expj.AH0040010.AH0040010form2.c_TEMP_INV_FLG.executePScriptOnLoad = function () {
  console.log('execute AH0040010form2/c_TEMP_INV_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010form2-c_TEMP_INV_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_TEMP_INV_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAH0040010Struct.getc_TEMP_INV_FLG())) || "1".equals(TypeConverter.convert(aAH0040010Struct.getc_TEMP_INV_FLG())))?"checked=\"checked\"":"" %>  class="AH0040010-focus-move" id="expj-AH0040010-AH0040010form2-c_TEMP_INV_FLG"><label for="expj-AH0040010-AH0040010form2-c_TEMP_INV_FLG"><%=CoreTools.getRBString("Expj.TEMP_INV_FLG_1",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INV_COMMENT",rb)%></span><!-- 棚卸備考 --></div><!--/td-->
<script class="expj-script-AH0040010-AH0040010form2-INV_COMMENT">
expj.AH0040010.AH0040010form2.INV_COMMENT = {};
expj.AH0040010.AH0040010form2.INV_COMMENT.executeAllOnDecision = function () {
  console.log('execute AH0040010form2/INV_COMMENT.onDecision');
  expj.AH0040010.AH0040010form2.executeAllOnDecision();
  expj.AH0040010.executeAllOnDecision();
};
expj.AH0040010.AH0040010form2.INV_COMMENT.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010form2-INV_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0040010', 'AH0040010form2', 'INV_COMMENT', this);
  });
  expj.AH0040010.AH0040010form2.INV_COMMENT.executePScriptOnLoad();
};

expj.AH0040010.AH0040010form2.INV_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AH0040010form2/INV_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010form2-INV_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AH0040010-AH0040010form2-INV_COMMENT" name="INV_COMMENT" class="AH0040010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0040010Struct.getINV_COMMENT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INV_START_DATE",rb)%></span><!-- 棚卸開始日 --></div><!--/td-->
<script class="expj-script-AH0040010-AH0040010form2-INV_START_DATE">
expj.AH0040010.AH0040010form2.INV_START_DATE = {};
expj.AH0040010.AH0040010form2.INV_START_DATE.executeAllOnDecision = function () {
  console.log('execute AH0040010form2/INV_START_DATE.onDecision');
  expj.AH0040010.AH0040010form2.executeAllOnDecision();
  expj.AH0040010.executeAllOnDecision();
};
expj.AH0040010.AH0040010form2.INV_START_DATE.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010form2-INV_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0040010', 'AH0040010form2', 'INV_START_DATE', this);
  });
  expj.AH0040010.AH0040010form2.INV_START_DATE.executePScriptOnLoad();
};

expj.AH0040010.AH0040010form2.INV_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0040010form2/INV_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010form2-INV_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0040010-AH0040010form2-INV_START_DATE" name="INV_START_DATE" class="AH0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAH0040010Struct.getINV_START_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_SAVE_DATE",rb)%></span><!-- 在庫退避日時 --></div><!--/td-->
<script class="expj-script-AH0040010-AH0040010form2-STOCK_SAVE_DATE">
expj.AH0040010.AH0040010form2.STOCK_SAVE_DATE = {};
expj.AH0040010.AH0040010form2.STOCK_SAVE_DATE.executeAllOnDecision = function () {
  console.log('execute AH0040010form2/STOCK_SAVE_DATE.onDecision');
  expj.AH0040010.AH0040010form2.executeAllOnDecision();
  expj.AH0040010.executeAllOnDecision();
};
expj.AH0040010.AH0040010form2.STOCK_SAVE_DATE.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010form2-STOCK_SAVE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0040010', 'AH0040010form2', 'STOCK_SAVE_DATE', this);
  });
  expj.AH0040010.AH0040010form2.STOCK_SAVE_DATE.executePScriptOnLoad();
};

expj.AH0040010.AH0040010form2.STOCK_SAVE_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0040010form2/STOCK_SAVE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010form2-STOCK_SAVE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0040010-AH0040010form2-STOCK_SAVE_DATE" name="STOCK_SAVE_DATE" class="AH0040010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0040010Struct.getSTOCK_SAVE_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INV_UPDATED_DATE",rb)%></span><!-- 実棚更新日時 --></div><!--/td-->
<script class="expj-script-AH0040010-AH0040010form2-INV_UPDATED_DATE">
expj.AH0040010.AH0040010form2.INV_UPDATED_DATE = {};
expj.AH0040010.AH0040010form2.INV_UPDATED_DATE.executeAllOnDecision = function () {
  console.log('execute AH0040010form2/INV_UPDATED_DATE.onDecision');
  expj.AH0040010.AH0040010form2.executeAllOnDecision();
  expj.AH0040010.executeAllOnDecision();
};
expj.AH0040010.AH0040010form2.INV_UPDATED_DATE.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010form2-INV_UPDATED_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0040010', 'AH0040010form2', 'INV_UPDATED_DATE', this);
  });
  expj.AH0040010.AH0040010form2.INV_UPDATED_DATE.executePScriptOnLoad();
};

expj.AH0040010.AH0040010form2.INV_UPDATED_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0040010form2/INV_UPDATED_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010form2-INV_UPDATED_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0040010-AH0040010form2-INV_UPDATED_DATE" name="INV_UPDATED_DATE" class="AH0040010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0040010Struct.getINV_UPDATED_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AH0040010-AH0040010button2">
expj.AH0040010.AH0040010button2 = {};
expj.AH0040010.AH0040010button2.executeAllOnDecision = function () {
  console.log('execute AH0040010button2.onDecision');
};
expj.AH0040010.AH0040010button2.executeOnLoad = function () {
  expj.AH0040010.AH0040010button2.executePScriptOnLoad();
};

expj.AH0040010.AH0040010button2.executePScriptOnLoad = function () {
  console.log('execute AH0040010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0040010-AH0040010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0040010-AH0040010button2-execute">
expj.AH0040010.AH0040010button2.execute = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0040010form1/*,_AH0040010form2/*@AH0040010Servlet,,$ZZ07009"
expj.AH0040010.AH0040010button2.execute.onClick0 = function () {
  console.log('execute script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0040010', 'AH0040010button2', '_AH0040010form1/*,_AH0040010form2/*', 'AH0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0040010', response);
expj.common.updateBusinessScreenTab('AH0040010', contents);
};
expj.common.pscript.callConfirm('AH0040010', 'AH0040010button2', 'ZZ07009', okEvent);
};
expj.AH0040010.AH0040010button2.execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0040010.AH0040010button2.execute['onClick' + i])) {
        expj.AH0040010.AH0040010button2.execute['onClick' + i]();
      }
    }
  }
};
expj.AH0040010.AH0040010button2.execute.executeAllOnDecision = function () {
};
expj.AH0040010.AH0040010button2.execute.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010button2-execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0040010', 'AH0040010button2', 'execute', this, 'Button');
    }
  });
  expj.AH0040010.AH0040010button2.execute.executePScriptOnLoad();
};

expj.AH0040010.AH0040010button2.execute.executePScriptOnLoad = function () {
  console.log('execute AH0040010button2/execute.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010button2-execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0040010-AH0040010button2-execute" name="execute" class="AH0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AH0040010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AH0040010-AH0040010button0">
expj.AH0040010.AH0040010button0 = {};
expj.AH0040010.AH0040010button0.executeAllOnDecision = function () {
  console.log('execute AH0040010button0.onDecision');
};
expj.AH0040010.AH0040010button0.executeOnLoad = function () {
  expj.AH0040010.AH0040010button0.executePScriptOnLoad();
};

expj.AH0040010.AH0040010button0.executePScriptOnLoad = function () {
  console.log('execute AH0040010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0040010-AH0040010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0040010-AH0040010button0-clear">
expj.AH0040010.AH0040010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0040010form1/*,_AH0040010form2/*@AH0040010Servlet,,$ZZ07008"
expj.AH0040010.AH0040010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0040010', 'AH0040010button0', '_AH0040010form1/*,_AH0040010form2/*', 'AH0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0040010', response);
expj.common.updateBusinessScreenTab('AH0040010', contents);
};
expj.common.pscript.callConfirm('AH0040010', 'AH0040010button0', 'ZZ07008', okEvent);
};
expj.AH0040010.AH0040010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0040010.AH0040010button0.clear['onClick' + i])) {
        expj.AH0040010.AH0040010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AH0040010.AH0040010button0.clear.executeAllOnDecision = function () {
};
expj.AH0040010.AH0040010button0.clear.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0040010', 'AH0040010button0', 'clear', this, 'Button');
    }
  });
  expj.AH0040010.AH0040010button0.clear.executePScriptOnLoad();
};

expj.AH0040010.AH0040010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AH0040010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0040010-AH0040010button0-clear" name="clear" class="AH0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AH0040010-AH0040010button0-close">
expj.AH0040010.AH0040010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AH0040010.AH0040010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AH0040010');
};
expj.AH0040010.AH0040010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0040010.AH0040010button0.close['onClick' + i])) {
        expj.AH0040010.AH0040010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AH0040010.AH0040010button0.close.executeAllOnDecision = function () {
};
expj.AH0040010.AH0040010button0.close.executeOnLoad = function () {
  $('#expj-AH0040010-AH0040010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0040010', 'AH0040010button0', 'close', this, 'Button');
    }
  });
  expj.AH0040010.AH0040010button0.close.executePScriptOnLoad();
};

expj.AH0040010.AH0040010button0.close.executePScriptOnLoad = function () {
  console.log('execute AH0040010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AH0040010-AH0040010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0040010-AH0040010button0-close" name="close" class="AH0040010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AH0040010 (END)-->
<%
MessageStruct msgStruct = aAH0040010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AH0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AH0040010)) {
  expj.common.treeInstanceMap.AH0040010 = {};
}
expj.common.treeInstanceMap.AH0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AH0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AH0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AH0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AH0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AH0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AH0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AH0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AH0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0040010)) {
  expj.common.detailDialogMap.AH0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AH0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.AH0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AH0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AH0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AH0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AH0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AH0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AH0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AH0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AH0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AH0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AH0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AH0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AH0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AH0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AH0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AH0040010)) {
  expj.common.viewInstanceMap.AH0040010 = {};
}
expj.common.viewInstanceMap.AH0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.AH0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AH0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AH0040010.<%=viewId %>.init = function () {
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
    expj.AH0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AH0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AH0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AH0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AH0040010_init">
/**
 * AH0040010用のロード完了時初期化関数
 */
expj.AH0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AH0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AH0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AH0040010');
  expj.common.calendarInstanceMap.AH0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AH0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AH0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.AH0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AH0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AH0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AH0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AH0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AH0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AH0040010-<%=detailId %>');
<%
 }
%>
  try{expj.AH0040010.AH0040010form1.INV_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010form1.CalendarINV_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010form1.w_INV_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010form1.h_saveINV_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010button1.select.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010form2.c_REGULAR_INV_FLG.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010form2.c_CYCLE_INV_FLG.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010form2.c_TEMP_INV_FLG.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010form2.INV_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010form2.INV_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010form2.STOCK_SAVE_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010form2.INV_UPDATED_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010button2.execute.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010button0.close.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010form1.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010button1.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010form2.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010button2.executeOnLoad();}catch(e){};
  try{expj.AH0040010.AH0040010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AH0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AH0040010', 'AH0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AH0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AH0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.AH0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AH0040010', '<%=request.getContextPath() %>');
};

/**
 * AH0040010の全体onDecision処理
 */
expj.AH0040010.executeAllOnDecision = function () {
  expj.AH0040010.AH0040010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AH0040010_console">
expj.AH0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>