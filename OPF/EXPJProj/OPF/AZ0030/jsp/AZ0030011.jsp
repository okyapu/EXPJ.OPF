<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:48:08 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0030\AZ0030011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AZ0030.*" %>
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
<jsp:useBean id="aAZ0030010Control" class="com.nec.jp.orteus.metamorBase.AZ0030.AZ0030010Control" scope="request"/>
<jsp:useBean id="aAZ0030010Struct" class="com.nec.jp.orteus.metamorBase.AZ0030.AZ0030010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

業務メッセージ一覧サブ1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0030/jsp/AZ0030011.jsp,v $
$Author: geng-jia $    
$Revision: 1.14 $ $Date: 2017/02/22 02:06:30 $
********************************************************* --%>
<html>
<head>
<title>業務メッセージ一覧サブ1</title>
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
<script class="expj-script-AZ0030010_init">
  // AZ0030010名前空間
  expj.AZ0030010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AZ0030010" data-screen="AZ0030011" data-newdata="<%=aAZ0030010Control.isNewData() %>">
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
              <script class="expj-script-AZ0030010-AZ0030011form1">
expj.AZ0030010.AZ0030011form1 = {};
// script1="onLoad;1;CALL;child@1"
expj.AZ0030010.AZ0030011form1.onLoad1 = function () {
  console.log('AZ0030011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child1)){this.child1();}
};
// script2="child;1;CHK;_AZ0030011form2/CONFIRM_DATE[eq]@*2,*3"
expj.AZ0030010.AZ0030011form1.child1 = function () {
  console.log('AZ0030011form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AZ0030010', 'AZ0030011form1', '_AZ0030011form2/CONFIRM_DATE'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="child;2;UNMASK;_AZ0030011button1/confirm_sub1"
expj.AZ0030010.AZ0030011form1.child2 = function () {
  console.log('AZ0030011form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AZ0030010', 'AZ0030011form1', '_AZ0030011button1/confirm_sub1');
};
// script4="child;3;MASK;_AZ0030011button1/confirm_sub1"
expj.AZ0030010.AZ0030011form1.child3 = function () {
  console.log('AZ0030011form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AZ0030010', 'AZ0030011form1', '_AZ0030011button1/confirm_sub1');
};
expj.AZ0030010.AZ0030011form1.executeAllOnDecision = function () {
  console.log('execute AZ0030011form1.onDecision');
};
expj.AZ0030010.AZ0030011form1.executeOnLoad = function () {
  expj.AZ0030010.AZ0030011form1.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011form1.executePScriptOnLoad = function () {
  console.log('execute AZ0030011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AZ0030010.AZ0030011form1['onLoad' + i])) {
      expj.AZ0030010.AZ0030011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AZ0030010-AZ0030011form1" action="AZ0030010Servlet" name="AZ0030011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0418",rb)%></span><!-- 識別番号 --></div><!--/td-->
<script class="expj-script-AZ0030010-AZ0030011form1-LOG_CD">
expj.AZ0030010.AZ0030011form1.LOG_CD = {};
expj.AZ0030010.AZ0030011form1.LOG_CD.executeAllOnDecision = function () {
  console.log('execute AZ0030011form1/LOG_CD.onDecision');
  expj.AZ0030010.AZ0030011form1.executeAllOnDecision();
  expj.AZ0030010.executeAllOnDecision();
};
expj.AZ0030010.AZ0030011form1.LOG_CD.executeOnLoad = function () {
  $('#expj-AZ0030010-AZ0030011form1-LOG_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0030010', 'AZ0030011form1', 'LOG_CD', this);
  });
  expj.AZ0030010.AZ0030011form1.LOG_CD.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011form1.LOG_CD.executePScriptOnLoad = function () {
  console.log('execute AZ0030011form1/LOG_CD.onLoad');
  var targetComponent = document.getElementById('expj-AZ0030010-AZ0030011form1-LOG_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AZ0030010-AZ0030011form1-LOG_CD" name="LOG_CD" class="AZ0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAZ0030010Struct.getLOG_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AZ0030010-AZ0030011form2">
expj.AZ0030010.AZ0030011form2 = {};
expj.AZ0030010.AZ0030011form2.executeAllOnDecision = function () {
  console.log('execute AZ0030011form2.onDecision');
};
expj.AZ0030010.AZ0030011form2.executeOnLoad = function () {
  expj.AZ0030010.AZ0030011form2.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011form2.executePScriptOnLoad = function () {
  console.log('execute AZ0030011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AZ0030010-AZ0030011form2" action="AZ0030010Servlet" name="AZ0030011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0428",rb)%></span><!-- 発生日 --></div><!--/td-->
<script class="expj-script-AZ0030010-AZ0030011form2-CREATED_DATE">
expj.AZ0030010.AZ0030011form2.CREATED_DATE = {};
expj.AZ0030010.AZ0030011form2.CREATED_DATE.executeAllOnDecision = function () {
  console.log('execute AZ0030011form2/CREATED_DATE.onDecision');
  expj.AZ0030010.AZ0030011form2.executeAllOnDecision();
  expj.AZ0030010.executeAllOnDecision();
};
expj.AZ0030010.AZ0030011form2.CREATED_DATE.executeOnLoad = function () {
  $('#expj-AZ0030010-AZ0030011form2-CREATED_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0030010', 'AZ0030011form2', 'CREATED_DATE', this);
  });
  expj.AZ0030010.AZ0030011form2.CREATED_DATE.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011form2.CREATED_DATE.executePScriptOnLoad = function () {
  console.log('execute AZ0030011form2/CREATED_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AZ0030010-AZ0030011form2-CREATED_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AZ0030010-AZ0030011form2-CREATED_DATE" name="CREATED_DATE" class="AZ0030010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAZ0030010Struct.getCREATED_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<input type="hidden" id="expj-AZ0030010-AZ0030011form2-PLANT_CD" name="PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAZ0030010Struct.getPLANT_CD()) %>">
<script class="expj-script-AZ0030010-AZ0030011form2-PLANT_CD">
expj.AZ0030010.AZ0030011form2.PLANT_CD = {};
expj.AZ0030010.AZ0030011form2.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AZ0030011form2/PLANT_CD.onDecision');
  expj.AZ0030010.AZ0030011form2.executeAllOnDecision();
  expj.AZ0030010.executeAllOnDecision();
};
expj.AZ0030010.AZ0030011form2.PLANT_CD.executeOnLoad = function () {
  $('#expj-AZ0030010-AZ0030011form2-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0030010', 'AZ0030011form2', 'PLANT_CD', this);
  });
  expj.AZ0030010.AZ0030011form2.PLANT_CD.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011form2.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AZ0030011form2/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AZ0030010-AZ0030011form2-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AZ0030010-AZ0030011form2-USER_CD" name="USER_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAZ0030010Struct.getUSER_CD()) %>">
<script class="expj-script-AZ0030010-AZ0030011form2-USER_CD">
expj.AZ0030010.AZ0030011form2.USER_CD = {};
expj.AZ0030010.AZ0030011form2.USER_CD.executeAllOnDecision = function () {
  console.log('execute AZ0030011form2/USER_CD.onDecision');
  expj.AZ0030010.AZ0030011form2.executeAllOnDecision();
  expj.AZ0030010.executeAllOnDecision();
};
expj.AZ0030010.AZ0030011form2.USER_CD.executeOnLoad = function () {
  $('#expj-AZ0030010-AZ0030011form2-USER_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0030010', 'AZ0030011form2', 'USER_CD', this);
  });
  expj.AZ0030010.AZ0030011form2.USER_CD.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011form2.USER_CD.executePScriptOnLoad = function () {
  console.log('execute AZ0030011form2/USER_CD.onLoad');
  var targetComponent = document.getElementById('expj-AZ0030010-AZ0030011form2-USER_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0037",rb)%></span><!-- 工場 --></div><!--/td-->
<script class="expj-script-AZ0030010-AZ0030011form2-PLANT_NAME">
expj.AZ0030010.AZ0030011form2.PLANT_NAME = {};
expj.AZ0030010.AZ0030011form2.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AZ0030011form2/PLANT_NAME.onDecision');
  expj.AZ0030010.AZ0030011form2.executeAllOnDecision();
  expj.AZ0030010.executeAllOnDecision();
};
expj.AZ0030010.AZ0030011form2.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AZ0030010-AZ0030011form2-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0030010', 'AZ0030011form2', 'PLANT_NAME', this);
  });
  expj.AZ0030010.AZ0030011form2.PLANT_NAME.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011form2.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AZ0030011form2/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AZ0030010-AZ0030011form2-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AZ0030010-AZ0030011form2-PLANT_NAME" name="PLANT_NAME" class="AZ0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAZ0030010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0034",rb)%></span><!-- 業務 --></div><!--/td-->
<script class="expj-script-AZ0030010-AZ0030011form2-w_BUSINESS_NAME">
expj.AZ0030010.AZ0030011form2.w_BUSINESS_NAME = {};
expj.AZ0030010.AZ0030011form2.w_BUSINESS_NAME.executeAllOnDecision = function () {
  console.log('execute AZ0030011form2/w_BUSINESS_NAME.onDecision');
  expj.AZ0030010.AZ0030011form2.executeAllOnDecision();
  expj.AZ0030010.executeAllOnDecision();
};
expj.AZ0030010.AZ0030011form2.w_BUSINESS_NAME.executeOnLoad = function () {
  $('#expj-AZ0030010-AZ0030011form2-w_BUSINESS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0030010', 'AZ0030011form2', 'w_BUSINESS_NAME', this);
  });
  expj.AZ0030010.AZ0030011form2.w_BUSINESS_NAME.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011form2.w_BUSINESS_NAME.executePScriptOnLoad = function () {
  console.log('execute AZ0030011form2/w_BUSINESS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AZ0030010-AZ0030011form2-w_BUSINESS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AZ0030010-AZ0030011form2-w_BUSINESS_NAME" name="w_BUSINESS_NAME" class="AZ0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAZ0030010Struct.getw_BUSINESS_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0041",rb)%></span><!-- 実行ユーザ --></div><!--/td-->
<script class="expj-script-AZ0030010-AZ0030011form2-USER_NAME">
expj.AZ0030010.AZ0030011form2.USER_NAME = {};
expj.AZ0030010.AZ0030011form2.USER_NAME.executeAllOnDecision = function () {
  console.log('execute AZ0030011form2/USER_NAME.onDecision');
  expj.AZ0030010.AZ0030011form2.executeAllOnDecision();
  expj.AZ0030010.executeAllOnDecision();
};
expj.AZ0030010.AZ0030011form2.USER_NAME.executeOnLoad = function () {
  $('#expj-AZ0030010-AZ0030011form2-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0030010', 'AZ0030011form2', 'USER_NAME', this);
  });
  expj.AZ0030010.AZ0030011form2.USER_NAME.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011form2.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute AZ0030011form2/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AZ0030010-AZ0030011form2-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AZ0030010-AZ0030011form2-USER_NAME" name="USER_NAME" class="AZ0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAZ0030010Struct.getUSER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MSG",rb)%></span><!-- メッセージ --></div><!--/td-->
<script class="expj-script-AZ0030010-AZ0030011form2-MSG">
expj.AZ0030010.AZ0030011form2.MSG = {};
expj.AZ0030010.AZ0030011form2.MSG.executeAllOnDecision = function () {
  console.log('execute AZ0030011form2/MSG.onDecision');
  expj.AZ0030010.AZ0030011form2.executeAllOnDecision();
  expj.AZ0030010.executeAllOnDecision();
};
expj.AZ0030010.AZ0030011form2.MSG.executeOnLoad = function () {
  $('#expj-AZ0030010-AZ0030011form2-MSG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0030010', 'AZ0030011form2', 'MSG', this);
  });
  expj.AZ0030010.AZ0030011form2.MSG.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011form2.MSG.executePScriptOnLoad = function () {
  console.log('execute AZ0030011form2/MSG.onLoad');
  var targetComponent = document.getElementById('expj-AZ0030010-AZ0030011form2-MSG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AZ0030010-AZ0030011form2-MSG" name="MSG" class="AZ0030010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAZ0030010Struct.getMSG()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0040",rb)%></span><!-- 詳細情報 --></div><!--/td-->
<div class="div-td" style="width:712px;"><span class="input-name "><%= TypeConverter.sanitizer(aAZ0030010Struct.getDATA_STRING()) %></span></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CONFIRM_DATE",rb)%></span><!-- 確認日時 --></div><!--/td-->
<script class="expj-script-AZ0030010-AZ0030011form2-CONFIRM_DATE">
expj.AZ0030010.AZ0030011form2.CONFIRM_DATE = {};
expj.AZ0030010.AZ0030011form2.CONFIRM_DATE.executeAllOnDecision = function () {
  console.log('execute AZ0030011form2/CONFIRM_DATE.onDecision');
  expj.AZ0030010.AZ0030011form2.executeAllOnDecision();
  expj.AZ0030010.executeAllOnDecision();
};
expj.AZ0030010.AZ0030011form2.CONFIRM_DATE.executeOnLoad = function () {
  $('#expj-AZ0030010-AZ0030011form2-CONFIRM_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AZ0030010', 'AZ0030011form2', 'CONFIRM_DATE', this);
  });
  expj.AZ0030010.AZ0030011form2.CONFIRM_DATE.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011form2.CONFIRM_DATE.executePScriptOnLoad = function () {
  console.log('execute AZ0030011form2/CONFIRM_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AZ0030010-AZ0030011form2-CONFIRM_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AZ0030010-AZ0030011form2-CONFIRM_DATE" name="CONFIRM_DATE" class="AZ0030010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAZ0030010Struct.getCONFIRM_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AZ0030010-AZ0030011button1">
expj.AZ0030010.AZ0030011button1 = {};
expj.AZ0030010.AZ0030011button1.executeAllOnDecision = function () {
  console.log('execute AZ0030011button1.onDecision');
};
expj.AZ0030010.AZ0030011button1.executeOnLoad = function () {
  expj.AZ0030010.AZ0030011button1.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011button1.executePScriptOnLoad = function () {
  console.log('execute AZ0030011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AZ0030010-AZ0030011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AZ0030010-AZ0030011button1-confirm_sub1">
expj.AZ0030010.AZ0030011button1.confirm_sub1 = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AZ0030011form1/*,_AZ0030011form2/*@AZ0030010Servlet,,$ZZ07009"
expj.AZ0030010.AZ0030011button1.confirm_sub1.onClick0 = function () {
  console.log('confirm_sub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AZ0030010', 'AZ0030011button1', '_AZ0030011form1/*,_AZ0030011form2/*', 'AZ0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AZ0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AZ0030010', response);
expj.common.updateBusinessScreenTab('AZ0030010', contents);
};
expj.common.pscript.callConfirm('AZ0030010', 'AZ0030011button1', 'ZZ07009', okEvent);
};
expj.AZ0030010.AZ0030011button1.confirm_sub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0030010.AZ0030011button1.confirm_sub1['onClick' + i])) {
        expj.AZ0030010.AZ0030011button1.confirm_sub1['onClick' + i]();
      }
    }
  }
};
expj.AZ0030010.AZ0030011button1.confirm_sub1.executeAllOnDecision = function () {
};
expj.AZ0030010.AZ0030011button1.confirm_sub1.executeOnLoad = function () {
  $('#expj-AZ0030010-AZ0030011button1-confirm_sub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0030010', 'AZ0030011button1', 'confirm_sub1', this, 'Button');
    }
  });
  expj.AZ0030010.AZ0030011button1.confirm_sub1.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011button1.confirm_sub1.executePScriptOnLoad = function () {
  console.log('execute AZ0030011button1/confirm_sub1.onLoad');
  var targetComponent = document.getElementById('expj-AZ0030010-AZ0030011button1-confirm_sub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AZ0030010-AZ0030011button1-confirm_sub1" name="confirm_sub1" class="AZ0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnConfirm",rb)%></button><!-- 確認ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AZ0030011 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AZ0030010-AZ0030011button0">
expj.AZ0030010.AZ0030011button0 = {};
expj.AZ0030010.AZ0030011button0.executeAllOnDecision = function () {
  console.log('execute AZ0030011button0.onDecision');
};
expj.AZ0030010.AZ0030011button0.executeOnLoad = function () {
  expj.AZ0030010.AZ0030011button0.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011button0.executePScriptOnLoad = function () {
  console.log('execute AZ0030011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AZ0030010-AZ0030011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AZ0030010-AZ0030011button0-prev_sub1">
expj.AZ0030010.AZ0030011button0.prev_sub1 = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AZ0030011form1/*,_AZ0030011form2/*@AZ0030010Servlet"
expj.AZ0030010.AZ0030011button0.prev_sub1.onClick0 = function () {
  console.log('prev_sub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AZ0030010', 'AZ0030011button0', '_AZ0030011form1/*,_AZ0030011form2/*', 'AZ0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AZ0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AZ0030010', response);
expj.common.updateBusinessScreenTab('AZ0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AZ0030010.AZ0030011button0.prev_sub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0030010.AZ0030011button0.prev_sub1['onClick' + i])) {
        expj.AZ0030010.AZ0030011button0.prev_sub1['onClick' + i]();
      }
    }
  }
};
expj.AZ0030010.AZ0030011button0.prev_sub1.executeAllOnDecision = function () {
};
expj.AZ0030010.AZ0030011button0.prev_sub1.executeOnLoad = function () {
  $('#expj-AZ0030010-AZ0030011button0-prev_sub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0030010', 'AZ0030011button0', 'prev_sub1', this, 'Button');
    }
  });
  expj.AZ0030010.AZ0030011button0.prev_sub1.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011button0.prev_sub1.executePScriptOnLoad = function () {
  console.log('execute AZ0030011button0/prev_sub1.onLoad');
  var targetComponent = document.getElementById('expj-AZ0030010-AZ0030011button0-prev_sub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AZ0030010-AZ0030011button0-prev_sub1" name="prev_sub1" class="AZ0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnBefore",rb)%></button><!-- 前へボタン --></div><!--/td-->
<script class="expj-script-AZ0030010-AZ0030011button0-next_sub1">
expj.AZ0030010.AZ0030011button0.next_sub1 = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AZ0030011form1/*,_AZ0030011form2/*@AZ0030010Servlet"
expj.AZ0030010.AZ0030011button0.next_sub1.onClick0 = function () {
  console.log('next_sub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AZ0030010', 'AZ0030011button0', '_AZ0030011form1/*,_AZ0030011form2/*', 'AZ0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AZ0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AZ0030010', response);
expj.common.updateBusinessScreenTab('AZ0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AZ0030010.AZ0030011button0.next_sub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0030010.AZ0030011button0.next_sub1['onClick' + i])) {
        expj.AZ0030010.AZ0030011button0.next_sub1['onClick' + i]();
      }
    }
  }
};
expj.AZ0030010.AZ0030011button0.next_sub1.executeAllOnDecision = function () {
};
expj.AZ0030010.AZ0030011button0.next_sub1.executeOnLoad = function () {
  $('#expj-AZ0030010-AZ0030011button0-next_sub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0030010', 'AZ0030011button0', 'next_sub1', this, 'Button');
    }
  });
  expj.AZ0030010.AZ0030011button0.next_sub1.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011button0.next_sub1.executePScriptOnLoad = function () {
  console.log('execute AZ0030011button0/next_sub1.onLoad');
  var targetComponent = document.getElementById('expj-AZ0030010-AZ0030011button0-next_sub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AZ0030010-AZ0030011button0-next_sub1" name="next_sub1" class="AZ0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnNext",rb)%></button><!-- 次へボタン --></div><!--/td-->
<script class="expj-script-AZ0030010-AZ0030011button0-return_sub1">
expj.AZ0030010.AZ0030011button0.return_sub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>@AZ0030010Servlet,,$ZZ07013"
expj.AZ0030010.AZ0030011button0.return_sub1.onClick0 = function () {
  console.log('return_sub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AZ0030010', 'AZ0030011button0', '', 'AZ0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AZ0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AZ0030010', response);
expj.common.changeBusinessScreenTab('AZ0030010', contents);
};
expj.common.pscript.callConfirm('AZ0030010', 'AZ0030011button0', 'ZZ07013', okEvent);
};
expj.AZ0030010.AZ0030011button0.return_sub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AZ0030010.AZ0030011button0.return_sub1['onClick' + i])) {
        expj.AZ0030010.AZ0030011button0.return_sub1['onClick' + i]();
      }
    }
  }
};
expj.AZ0030010.AZ0030011button0.return_sub1.executeAllOnDecision = function () {
};
expj.AZ0030010.AZ0030011button0.return_sub1.executeOnLoad = function () {
  $('#expj-AZ0030010-AZ0030011button0-return_sub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AZ0030010', 'AZ0030011button0', 'return_sub1', this, 'Button');
    }
  });
  expj.AZ0030010.AZ0030011button0.return_sub1.executePScriptOnLoad();
};

expj.AZ0030010.AZ0030011button0.return_sub1.executePScriptOnLoad = function () {
  console.log('execute AZ0030011button0/return_sub1.onLoad');
  var targetComponent = document.getElementById('expj-AZ0030010-AZ0030011button0-return_sub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AZ0030010-AZ0030011button0-return_sub1" name="return_sub1" class="AZ0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AZ0030010 (END)-->
<%
MessageStruct msgStruct = aAZ0030010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AZ0030010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AZ0030010)) {
  expj.common.treeInstanceMap.AZ0030010 = {};
}
expj.common.treeInstanceMap.AZ0030010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0030010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AZ0030010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AZ0030010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AZ0030010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AZ0030010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AZ0030010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AZ0030010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AZ0030010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AZ0030010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AZ0030010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0030010)) {
  expj.common.detailDialogMap.AZ0030010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0030010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AZ0030010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0030010.<%=detailId %>)) {
  expj.common.detailDialogMap.AZ0030010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0030010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AZ0030010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AZ0030010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AZ0030010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AZ0030010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AZ0030010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AZ0030010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AZ0030010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AZ0030010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AZ0030010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AZ0030010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AZ0030010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AZ0030010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AZ0030010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AZ0030010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AZ0030010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AZ0030010)) {
  expj.common.viewInstanceMap.AZ0030010 = {};
}
expj.common.viewInstanceMap.AZ0030010.<%=viewId %> = {};
expj.common.viewInstanceMap.AZ0030010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AZ0030010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AZ0030010.<%=viewId %>.init = function () {
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
    expj.AZ0030010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AZ0030010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AZ0030010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AZ0030010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AZ0030010_init">
/**
 * AZ0030010用のロード完了時初期化関数
 */
expj.AZ0030010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AZ0030010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AZ0030010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AZ0030010');
  expj.common.calendarInstanceMap.AZ0030010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AZ0030010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AZ0030010.<%=detailId %>.init();
  expj.common.detailDialogMap.AZ0030010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AZ0030010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AZ0030010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AZ0030010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AZ0030010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AZ0030010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AZ0030010-<%=detailId %>');
<%
 }
%>
  try{expj.AZ0030010.AZ0030011form1.LOG_CD.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011form2.CREATED_DATE.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011form2.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011form2.USER_CD.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011form2.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011form2.w_BUSINESS_NAME.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011form2.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011form2.MSG.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011form2.CONFIRM_DATE.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011button1.confirm_sub1.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011button0.prev_sub1.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011button0.next_sub1.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011button0.return_sub1.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011form1.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011form2.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011button1.executeOnLoad();}catch(e){};
  try{expj.AZ0030010.AZ0030011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AZ0030010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AZ0030010', 'AZ0030010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AZ0030010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AZ0030010-focus-move');
  // 初期フォーカス当てる処理
  $('.AZ0030010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AZ0030010', '<%=request.getContextPath() %>');
};

/**
 * AZ0030010の全体onDecision処理
 */
expj.AZ0030010.executeAllOnDecision = function () {
  expj.AZ0030010.AZ0030011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AZ0030010_console">
expj.AZ0030010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>